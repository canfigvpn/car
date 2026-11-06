const assert = require('node:assert/strict');
const fs = require('node:fs');

const html = fs.readFileSync('app/src/main/assets/index.html', 'utf8');
const match = html.match(/<script>([\s\S]*?)<\/script>/);
assert.ok(match, 'inline application script must exist');

function boot(seedStore = {}) {
  const values = {
    currentKm: { value: '0' },
    search: { value: '' },
    categoryFilter: { value: '' },
    sortFilter: { value: 'priority' },
    dashboard: { innerHTML: '' },
    serviceList: { innerHTML: '' },
    historyCount: { textContent: '' },
    historyList: { innerHTML: '' }
  };
  const document = {
    body: { dataset: { page: 'home' } },
    getElementById(id) {
      if (!values[id]) values[id] = { value: '', innerHTML: '', textContent: '' };
      return values[id];
    },
    querySelectorAll() { return []; }
  };
  const data = new Map(Object.entries(seedStore));
  const localStorage = {
    getItem(k) { return data.has(k) ? data.get(k) : null; },
    setItem(k, v) { data.set(k, String(v)); }
  };
  const factory = new Function('document', 'localStorage', match[1] +
    '\nreturn {state,status,parseJ,addJalaliDays,normalizeDate,save,latest,dueInfo};');
  return { app: factory(document, localStorage), values, data };
}

const { app, values, data } = boot();
assert.equal(app.state.services.length, 43, 'all 43 predefined service items must load');
assert.ok(app.parseJ('1399/12/30'), 'valid leap-day must be accepted');
assert.equal(app.parseJ('1400/12/30'), null, 'invalid non-leap Esfand 30 must be rejected');
assert.equal(app.parseJ('1405/07/31'), null, 'Mehr must not accept day 31');
assert.ok(app.parseJ('۱۴۰۵/۰۸/۱۵'), 'Persian digits must be accepted');
assert.equal(app.normalizeDate('1405-08-15'), '1405/08/15');
assert.equal(app.addJalaliDays('1405/08/15', 365), '1406/8/15');

const belt = app.state.services.find(s => s.name === 'تسمه دینام');
belt.records = [{ id: 'a', km: 600000, date: '1405/08/15', cost: '', note: '', kind: 'تعویض', affectsDue: true, createdAt: '2026-11-06T10:00:00.000Z' }];
app.state.km = 644999;
assert.equal(app.status(belt), 'green', 'more than 10 percent remaining should be green');
app.state.km = 645000;
assert.equal(app.status(belt), 'red', '10 percent remaining should be warning');
app.state.km = 650000;
assert.equal(app.status(belt), 'black', 'reaching due mileage should be overdue');

belt.records.push({ id: 'b', km: 650000, date: '1405/08/15', cost: '', note: 'بازدید چشمی', kind: 'بررسی', affectsDue: false, createdAt: '2026-11-06T11:00:00.000Z' });
assert.equal(app.status(belt), 'black', 'inspection must not reset replacement interval');

const coil = app.state.services.find(s => s.name === 'کوئل');
coil.records = [{ id: 'c', km: 650000, date: '1405/08/15', kind: 'تعمیر', affectsDue: true, createdAt: '2026-11-06T12:00:00.000Z' }];
assert.equal(app.status(coil), 'manual', 'items without a fixed interval must not be falsely marked up-to-date');

assert.ok(app.save(), 'local data must save');
assert.ok(data.has('mygarage_service_book_v3'), 'versioned local storage key must be used');

const legacy = {
  km: 610000,
  services: [{ id: 1, cat: 'Test', name: 'Legacy item', ikm: 5000, days: 0, lastKm: 600000, lastDate: '1405/08/15', cost: '10', note: 'old' }],
  logs: []
};
const migrated = boot({ mygarage_service_book_v1: JSON.stringify(legacy) }).app;
assert.equal(migrated.state.km, 610000);
assert.equal(migrated.state.services[0].records.length, 1, 'legacy last-service data must migrate into record history');
assert.equal(migrated.state.services[0].records[0].km, 600000);

console.log('MyGarage smoke tests passed.');

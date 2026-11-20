const assert = require('node:assert/strict');
const fs = require('node:fs');

const html = fs.readFileSync('app/src/main/assets/index.html', 'utf8');
const scriptBlocks = [...html.matchAll(/<script(?: id="([^"]+)")?>([\s\S]*?)<\/script>/g)];
const appScript = scriptBlocks.filter(x => x[1] !== 'mygarage-number-polish').map(x => x[2]).join('\n');
assert.ok(appScript, 'inline application scripts must exist');


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
  const factory = new Function('document', 'localStorage', 'window', appScript +
    '\nreturn {state,status,parseJ,addJalaliDays,normalizeDate,save,latest,dueInfo,dueInfoHtml,renderServices,autoTextDirection,safeNumber,formatGrouped,guideFor,showJalaliCalendar,chooseJalaliDate,closeJalaliCalendar};');
  return { app: factory(document, localStorage, {AndroidFiles:null}), values, data };
}

const { app, values, data } = boot();
assert.equal(app.state.services.length, 43, 'all 43 predefined service items must load');
assert.ok(app.parseJ('1399/12/30'), 'valid leap-day must be accepted');
assert.equal(app.parseJ('1400/12/30'), null, 'invalid non-leap Esfand 30 must be rejected');
assert.equal(app.parseJ('1405/07/31'), null, 'Mehr must not accept day 31');
assert.ok(app.parseJ('۱۴۰۵/۰۸/۱۵'), 'Persian digits must be accepted');
assert.equal(app.normalizeDate('1405-08-15'), '1405/08/15');
assert.equal(app.safeNumber('60.000'), 60000, 'grouped odometer values must parse as integers');
const grouped = { value: '60000' }; app.formatGrouped(grouped);
assert.equal(grouped.value, '60.000', 'odometer input must insert dot group separators');
assert.ok(app.guideFor('ترموستات','').includes('بررسی دوره‌ای:'), 'each service guide must include an inspection interval');
assert.ok(app.guideFor('ترموستات','').includes('تعویض:'), 'each service guide must include replacement guidance');
assert.ok(html.includes('تعمیر و تعویض و بررسی'), 'the mechanic operation must be a single combined type');
assert.ok(!html.includes('<label>نوع بازه</label>'), 'manual interval-type selector must be removed');
assert.ok(html.includes('showJalaliCalendar'), 'the Jalali calendar control must exist');
app.showJalaliCalendar('rDate');
assert.ok(values.rDateCalendar.innerHTML.includes('cal-grid'), 'Jalali calendar must render a selectable month grid');
assert.ok(values.rDateCalendar.innerHTML.includes('calendar-close'), 'calendar must include a close button');
app.chooseJalaliDate(1405, 8, 22);
assert.equal(values.rDate.value, '1405/08/22', 'selecting a Jalali day must fill the date field');
assert.ok(html.includes('کیلومتر فعلی خودرو'), 'record form must offer current odometer fill');
assert.ok(html.includes('Google Drive') && html.includes('driveSync'), 'Drive controls must exist');
assert.ok(html.includes('تنظیمات سرویس'), 'service settings label must exist');
assert.ok(html.includes('home-toolbar') && html.includes('toolbar-menu'), 'home toolbar must place the menu at upper-left beside search');
assert.equal((html.match(/id="search"/g)||[]).length,1,'home search must exist exactly once');
assert.ok(html.includes('add-service-button') && html.includes('function addService()'), 'custom service creation must be available');
assert.ok(!html.includes('id="sortFilter"') && !html.includes("getElementById('sortFilter')"), 'sort control must be replaced by add-service action');
assert.ok(html.includes('#E2E2EE') && html.includes('color:#16834a!important'), 'light theme must use the requested gray and green numeric values');
assert.ok(html.includes('.modal-actions{position:static!important') && html.includes('margin-top:10px!important'), 'modal actions must stay close to the form');

assert.ok(html.includes('function autoTextDirection') && !html.includes('setWritingMode'), 'writing direction must be automatic');
const faText={value:'متن فارسی',style:{},setAttribute(k,v){this[k]=v}};app.autoTextDirection(faText);assert.equal(faText.dir,'rtl');
const enText={value:'English text',style:{},setAttribute(k,v){this[k]=v}};app.autoTextDirection(enText);assert.equal(enText.dir,'ltr');
assert.equal(app.addJalaliDays('1405/08/15', 365), '1406/8/15');

const belt = app.state.services.find(s => s.name === 'تسمه دینام');
belt.records = [{ id: 'a', km: 600000, date: '1405/08/15', cost: '', note: '', kind: 'تعویض', affectsDue: true, createdAt: '2026-11-06T10:00:00.000Z' }];
const cardSample={id:99,cat:'Test',name:'Demo',ikm:50000,days:365,records:[{id:'z',km:603000,date:'1405/08/06',cost:'',note:'',kind:'تعویض',affectsDue:true,createdAt:'2026-11-06T10:00:00.000Z'}]};
app.state.km=603000;
const cardHtml=app.dueInfoHtml(cardSample);
assert.ok(cardHtml.includes('موعد کیلومتری') && cardHtml.includes('موعد زمانی') && cardHtml.includes('class="num"'), 'service cards must show separately highlighted due values');
const cardWithInspection={...cardSample,enabled:true,records:[...cardSample.records,{id:'inspect',km:650000,date:'1405/08/07',cost:'',note:'بازدید',kind:'بررسی',affectsDue:false,createdAt:'2026-11-07T10:00:00.000Z'}]};
const inspectionCard=app.dueInfoHtml(cardWithInspection);
assert.ok(inspectionCard.includes('653.000'), 'inspection-only records must not reset the replacement due mileage');
app.state.services.push(cardWithInspection);app.state.km=603000;app.renderServices();
assert.ok(values.serviceList.innerHTML.includes('650.000'), 'latest inspection must remain visible as the last registered record');
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
assert.equal(app.status(coil), 'soft', 'items without a fixed interval must not show a colored review warning');

const brake = app.state.services.find(s => s.name === 'لنت دیسکی جلو');
assert.equal(brake.intervalMode, 'inspection', 'wear-based brake pads must use inspection intervals');
brake.records = [{ id: 'd', km: 10000, date: '1405/08/15', kind: 'بررسی', affectsDue: true, createdAt: '2026-11-06T13:00:00.000Z' }];
app.state.km = 19000;
assert.equal(app.status(brake), 'red', 'inspection event must restart an inspection interval');

const oil = app.state.services.find(s => s.name === 'روغن موتور');
assert.equal(oil.intervalMode, 'replacement', 'engine oil must use replacement intervals');
app.state.km = 10000;
oil.records = [{ id: 'e', km: 10000, date: '1405/08/15', kind: 'بررسی', affectsDue: false, createdAt: '2026-11-06T14:00:00.000Z' }];
assert.equal(app.status(oil), 'soft', 'a non-due service must not show a colored review warning when no replacement record exists');

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

assert.ok(!html.includes('با تغییر کیلومتر، وضعیت و اولویت تمام سرویس‌ها خودکار به‌روزرسانی می‌شود.'), 'odometer helper hint must be removed');
assert.ok(!html.includes('مدیریت هوشمند نگهداری خودرو'), 'management subtitle must be removed');
assert.ok(html.includes('aria-label="راهنمای وضعیت سرویس‌ها"') && html.includes('flex-wrap:nowrap!important'), 'all status labels must stay in one horizontal row');
assert.ok(html.includes('status-heading status-') && html.includes('legend-item status-green'), 'status headings and legend labels must use matching clear colors');
assert.ok(html.includes('service-history-label') && html.includes('سوابق \'+esc(s.name)+\' · \'+s.records.length+\' سابقه'), 'service cards must show service-specific history instead of category');
assert.ok(html.includes("modal('سوابق '+esc(s.name)+' · '+s.records.length+' سابقه'"), 'history modal title must include service name and record count');
assert.ok(html.includes('<span>کیلومتر فعلی</span><span>KM</span>'), 'main odometer title must use the shorter label');
assert.ok(!html.includes('>کیلومتر فعلی خودرو</button>') && html.includes('>کیلومتر فعلی</button>'), 'record action button must use the shorter label');
assert.ok(html.includes('class="bottom" aria-label="ناوبری اصلی"') && html.includes('class="nav-item nav-menu"') && html.includes('mygarage-v35-floating-navbar'), 'floating notch navbar with integrated hamburger must exist');

assert.ok(html.includes("document.getElementById('homeTab').classList.toggle('active'") && html.includes("document.getElementById('historyTab').classList.toggle('active'"), 'bottom navigation active state must follow the selected page');

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class va1 extends zu1 {
    @Override // defpackage.zu1
    public final void a(vh0 vh0Var) {
        vh0Var.getClass();
        int i = 0;
        for (Object obj : e22.a) {
            int i2 = i + 1;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            fl flVar = (fl) obj;
            vh0Var.k("INSERT INTO service_types (`key`, customName, icon, defaultIntervalKm, defaultIntervalMonths, tracksQuantity, isBuiltIn, sortOrder) VALUES (?, NULL, ?, ?, ?, ?, 1, ?)", new Object[]{flVar.a, flVar.b, flVar.c, flVar.d, Integer.valueOf(flVar.e ? 1 : 0), Integer.valueOf(i)});
            i = i2;
        }
    }

    @Override // defpackage.zu1
    public final void b(vh0 vh0Var) {
        vh0Var.getClass();
        vh0Var.j("UPDATE service_types SET `key` = 'brake_pads_front' WHERE `key` = 'brake_pads' AND isBuiltIn = 1");
        int i = 0;
        for (Object obj : e22.a) {
            int i2 = i + 1;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            fl flVar = (fl) obj;
            String str = flVar.a;
            String str2 = flVar.a;
            vh0Var.k("INSERT INTO service_types (`key`, customName, icon, defaultIntervalKm, defaultIntervalMonths, tracksQuantity, isBuiltIn, sortOrder) SELECT ?, NULL, ?, ?, ?, ?, 1, ? WHERE NOT EXISTS (SELECT 1 FROM service_types WHERE `key` = ?)", new Object[]{str, flVar.b, flVar.c, flVar.d, Integer.valueOf(flVar.e ? 1 : 0), Integer.valueOf(i), str2});
            vh0Var.k("UPDATE service_types SET sortOrder = ? WHERE `key` = ? AND isBuiltIn = 1", new Object[]{Integer.valueOf(i), str2});
            i = i2;
        }
        vh0Var.j("INSERT INTO car_service_schedules (carId, serviceTypeId, intervalKm, intervalMonths, enabled) SELECT c.id, t.id, t.defaultIntervalKm, t.defaultIntervalMonths, 1 FROM cars c CROSS JOIN service_types t WHERE NOT EXISTS (SELECT 1 FROM car_service_schedules s WHERE s.carId = c.id AND s.serviceTypeId = t.id)");
        vh0Var.j("INSERT INTO odometer_readings (carId, epochDay, odometerKm, source, recordId) SELECT carId, epochDay, odometerKm, 'SERVICE', id FROM service_records WHERE odometerKm IS NOT NULL AND NOT EXISTS (SELECT 1 FROM odometer_readings r WHERE r.recordId = service_records.id)");
        vh0Var.j("INSERT INTO odometer_readings (carId, epochDay, odometerKm, source, recordId) SELECT id, odometerUpdatedEpochDay, currentOdometerKm, 'INITIAL', NULL FROM cars WHERE NOT EXISTS (SELECT 1 FROM odometer_readings r WHERE r.carId = cars.id)");
    }
}

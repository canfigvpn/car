package defpackage;

import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 extends z90 {
    public final /* synthetic */ MyGarageDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(MyGarageDatabase_Impl myGarageDatabase_Impl) {
        super(5, "b55b27b2538eb886d492a3a615191937", "fa3dcffc913a3152dadabdbca67bbbe1");
        this.d = myGarageDatabase_Impl;
    }

    @Override // defpackage.z90
    public final void a(vv1 vv1Var) {
        vv1Var.getClass();
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `cars` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `make` TEXT NOT NULL, `model` TEXT NOT NULL, `year` INTEGER, `plateTwoDigits` TEXT NOT NULL DEFAULT '', `plateLetter` TEXT NOT NULL DEFAULT '', `plateThreeDigits` TEXT NOT NULL DEFAULT '', `plateRegion` TEXT NOT NULL DEFAULT '', `fuelType` TEXT NOT NULL, `currentOdometerKm` INTEGER NOT NULL, `odometerUpdatedEpochDay` INTEGER NOT NULL, `typicalDailyKm` INTEGER DEFAULT NULL, `createdEpochDay` INTEGER NOT NULL)");
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `service_types` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `key` TEXT NOT NULL, `customName` TEXT, `icon` TEXT NOT NULL, `defaultIntervalKm` INTEGER, `defaultIntervalMonths` INTEGER, `tracksQuantity` INTEGER NOT NULL, `isBuiltIn` INTEGER NOT NULL, `sortOrder` INTEGER NOT NULL DEFAULT 1000)");
        ix.t(vv1Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_service_types_key` ON `service_types` (`key`)");
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `car_service_schedules` (`carId` INTEGER NOT NULL, `serviceTypeId` INTEGER NOT NULL, `intervalKm` INTEGER, `intervalMonths` INTEGER, `enabled` INTEGER NOT NULL, PRIMARY KEY(`carId`, `serviceTypeId`), FOREIGN KEY(`carId`) REFERENCES `cars`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`serviceTypeId`) REFERENCES `service_types`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        ix.t(vv1Var, "CREATE INDEX IF NOT EXISTS `index_car_service_schedules_serviceTypeId` ON `car_service_schedules` (`serviceTypeId`)");
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `service_records` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `carId` INTEGER NOT NULL, `serviceTypeId` INTEGER NOT NULL, `epochDay` INTEGER NOT NULL, `odometerKm` INTEGER, `cost` INTEGER, `quantity` REAL, `note` TEXT, `action` TEXT NOT NULL DEFAULT 'CHANGE', FOREIGN KEY(`carId`) REFERENCES `cars`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`serviceTypeId`) REFERENCES `service_types`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        ix.t(vv1Var, "CREATE INDEX IF NOT EXISTS `index_service_records_carId` ON `service_records` (`carId`)");
        ix.t(vv1Var, "CREATE INDEX IF NOT EXISTS `index_service_records_serviceTypeId` ON `service_records` (`serviceTypeId`)");
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `odometer_readings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `carId` INTEGER NOT NULL, `epochDay` INTEGER NOT NULL, `odometerKm` INTEGER NOT NULL, `source` TEXT NOT NULL, `recordId` INTEGER, FOREIGN KEY(`carId`) REFERENCES `cars`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`recordId`) REFERENCES `service_records`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        ix.t(vv1Var, "CREATE INDEX IF NOT EXISTS `index_odometer_readings_carId` ON `odometer_readings` (`carId`)");
        ix.t(vv1Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_odometer_readings_recordId` ON `odometer_readings` (`recordId`)");
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ix.t(vv1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b55b27b2538eb886d492a3a615191937')");
    }

    @Override // defpackage.z90
    public final void b(vv1 vv1Var) {
        vv1Var.getClass();
        ix.t(vv1Var, "DROP TABLE IF EXISTS `cars`");
        ix.t(vv1Var, "DROP TABLE IF EXISTS `service_types`");
        ix.t(vv1Var, "DROP TABLE IF EXISTS `car_service_schedules`");
        ix.t(vv1Var, "DROP TABLE IF EXISTS `service_records`");
        ix.t(vv1Var, "DROP TABLE IF EXISTS `odometer_readings`");
    }

    @Override // defpackage.z90
    public final void c(vv1 vv1Var) {
        vv1Var.getClass();
    }

    @Override // defpackage.z90
    public final void d(vv1 vv1Var) {
        vv1Var.getClass();
        ix.t(vv1Var, "PRAGMA foreign_keys = ON");
        gt0 gt0VarE = this.d.e();
        ij2 ij2Var = gt0VarE.b;
        ij2Var.getClass();
        xv1 xv1VarC = vv1Var.C("PRAGMA query_only");
        try {
            xv1VarC.y();
            boolean zM = xv1VarC.m();
            ir2.h(xv1VarC, null);
            if (!zM) {
                ix.t(vv1Var, "PRAGMA temp_store = MEMORY");
                ix.t(vv1Var, "PRAGMA recursive_triggers = 1");
                ix.t(vv1Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ij2Var.d) {
                    ix.t(vv1Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    ix.t(vv1Var, o92.y("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                jf1 jf1Var = ij2Var.h;
                ReentrantLock reentrantLock = jf1Var.a;
                reentrantLock.lock();
                try {
                    jf1Var.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (gt0VarE.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ir2.h(xv1VarC, th2);
                throw th3;
            }
        }
    }

    @Override // defpackage.z90
    public final void e(vv1 vv1Var) {
        vv1Var.getClass();
    }

    @Override // defpackage.z90
    public final void f(vv1 vv1Var) {
        vv1Var.getClass();
        z21 z21VarL = vs0.l();
        xv1 xv1VarC = vv1Var.C("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (xv1VarC.y()) {
            try {
                z21VarL.add(xv1VarC.f(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ir2.h(xv1VarC, th);
                    throw th2;
                }
            }
        }
        ir2.h(xv1VarC, null);
        ListIterator listIterator = vs0.i(z21VarL).listIterator(0);
        while (true) {
            tm0 tm0Var = (tm0) listIterator;
            if (!tm0Var.hasNext()) {
                return;
            }
            String str = (String) tm0Var.next();
            if (o92.z(str, "room_fts_content_sync_")) {
                ix.t(vv1Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.z90
    public final dv g(vv1 vv1Var) {
        vv1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new ob2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new ob2("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("make", new ob2("make", "TEXT", true, 0, null, 1));
        linkedHashMap.put("model", new ob2("model", "TEXT", true, 0, null, 1));
        linkedHashMap.put("year", new ob2("year", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("plateTwoDigits", new ob2("plateTwoDigits", "TEXT", true, 0, "''", 1));
        linkedHashMap.put("plateLetter", new ob2("plateLetter", "TEXT", true, 0, "''", 1));
        linkedHashMap.put("plateThreeDigits", new ob2("plateThreeDigits", "TEXT", true, 0, "''", 1));
        linkedHashMap.put("plateRegion", new ob2("plateRegion", "TEXT", true, 0, "''", 1));
        linkedHashMap.put("fuelType", new ob2("fuelType", "TEXT", true, 0, null, 1));
        linkedHashMap.put("currentOdometerKm", new ob2("currentOdometerKm", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("odometerUpdatedEpochDay", new ob2("odometerUpdatedEpochDay", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("typicalDailyKm", new ob2("typicalDailyKm", "INTEGER", false, 0, "NULL", 1));
        linkedHashMap.put("createdEpochDay", new ob2("createdEpochDay", "INTEGER", true, 0, null, 1));
        rb2 rb2Var = new rb2("cars", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        rb2 rb2VarJ = p12.j(vv1Var, "cars");
        if (!rb2Var.equals(rb2VarJ)) {
            return new dv("cars(ir.alirezaivaz.mygarage.data.local.entity.CarEntity).\n Expected:\n" + rb2Var + "\n Found:\n" + rb2VarJ, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new ob2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("key", new ob2("key", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("customName", new ob2("customName", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("icon", new ob2("icon", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("defaultIntervalKm", new ob2("defaultIntervalKm", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("defaultIntervalMonths", new ob2("defaultIntervalMonths", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("tracksQuantity", new ob2("tracksQuantity", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("isBuiltIn", new ob2("isBuiltIn", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("sortOrder", new ob2("sortOrder", "INTEGER", true, 0, "1000", 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new qb2("index_service_types_key", true, vs0.u("key"), vs0.u("ASC")));
        rb2 rb2Var2 = new rb2("service_types", linkedHashMap2, linkedHashSet, linkedHashSet2);
        rb2 rb2VarJ2 = p12.j(vv1Var, "service_types");
        if (!rb2Var2.equals(rb2VarJ2)) {
            return new dv("service_types(ir.alirezaivaz.mygarage.data.local.entity.ServiceTypeEntity).\n Expected:\n" + rb2Var2 + "\n Found:\n" + rb2VarJ2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("carId", new ob2("carId", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("serviceTypeId", new ob2("serviceTypeId", "INTEGER", true, 2, null, 1));
        linkedHashMap3.put("intervalKm", new ob2("intervalKm", "INTEGER", false, 0, null, 1));
        linkedHashMap3.put("intervalMonths", new ob2("intervalMonths", "INTEGER", false, 0, null, 1));
        linkedHashMap3.put("enabled", new ob2("enabled", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new pb2("cars", "CASCADE", "NO ACTION", vs0.u("carId"), vs0.u("id")));
        linkedHashSet3.add(new pb2("service_types", "CASCADE", "NO ACTION", vs0.u("serviceTypeId"), vs0.u("id")));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new qb2("index_car_service_schedules_serviceTypeId", false, vs0.u("serviceTypeId"), vs0.u("ASC")));
        rb2 rb2Var3 = new rb2("car_service_schedules", linkedHashMap3, linkedHashSet3, linkedHashSet4);
        rb2 rb2VarJ3 = p12.j(vv1Var, "car_service_schedules");
        if (!rb2Var3.equals(rb2VarJ3)) {
            return new dv("car_service_schedules(ir.alirezaivaz.mygarage.data.local.entity.CarServiceScheduleEntity).\n Expected:\n" + rb2Var3 + "\n Found:\n" + rb2VarJ3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new ob2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("carId", new ob2("carId", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("serviceTypeId", new ob2("serviceTypeId", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("epochDay", new ob2("epochDay", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("odometerKm", new ob2("odometerKm", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("cost", new ob2("cost", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("quantity", new ob2("quantity", "REAL", false, 0, null, 1));
        linkedHashMap4.put("note", new ob2("note", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("action", new ob2("action", "TEXT", true, 0, "'CHANGE'", 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new pb2("cars", "CASCADE", "NO ACTION", vs0.u("carId"), vs0.u("id")));
        linkedHashSet5.add(new pb2("service_types", "CASCADE", "NO ACTION", vs0.u("serviceTypeId"), vs0.u("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new qb2("index_service_records_carId", false, vs0.u("carId"), vs0.u("ASC")));
        linkedHashSet6.add(new qb2("index_service_records_serviceTypeId", false, vs0.u("serviceTypeId"), vs0.u("ASC")));
        rb2 rb2Var4 = new rb2("service_records", linkedHashMap4, linkedHashSet5, linkedHashSet6);
        rb2 rb2VarJ4 = p12.j(vv1Var, "service_records");
        if (!rb2Var4.equals(rb2VarJ4)) {
            return new dv("service_records(ir.alirezaivaz.mygarage.data.local.entity.ServiceRecordEntity).\n Expected:\n" + rb2Var4 + "\n Found:\n" + rb2VarJ4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new ob2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("carId", new ob2("carId", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("epochDay", new ob2("epochDay", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("odometerKm", new ob2("odometerKm", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("source", new ob2("source", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("recordId", new ob2("recordId", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new pb2("cars", "CASCADE", "NO ACTION", vs0.u("carId"), vs0.u("id")));
        linkedHashSet7.add(new pb2("service_records", "CASCADE", "NO ACTION", vs0.u("recordId"), vs0.u("id")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new qb2("index_odometer_readings_carId", false, vs0.u("carId"), vs0.u("ASC")));
        linkedHashSet8.add(new qb2("index_odometer_readings_recordId", true, vs0.u("recordId"), vs0.u("ASC")));
        rb2 rb2Var5 = new rb2("odometer_readings", linkedHashMap5, linkedHashSet7, linkedHashSet8);
        rb2 rb2VarJ5 = p12.j(vv1Var, "odometer_readings");
        if (rb2Var5.equals(rb2VarJ5)) {
            return new dv(null, true);
        }
        return new dv("odometer_readings(ir.alirezaivaz.mygarage.data.local.entity.OdometerReadingEntity).\n Expected:\n" + rb2Var5 + "\n Found:\n" + rb2VarJ5, false);
    }
}

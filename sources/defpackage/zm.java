package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zm extends qx {
    public final /* synthetic */ int g;

    @Override // defpackage.qx
    public final void n(xv1 xv1Var, Object obj) {
        switch (this.g) {
            case 0:
                cn cnVar = (cn) obj;
                xv1Var.getClass();
                cnVar.getClass();
                xv1Var.c(1, cnVar.a);
                xv1Var.e(cnVar.b, 2);
                xv1Var.e(cnVar.c, 3);
                xv1Var.e(cnVar.d, 4);
                Integer num = cnVar.e;
                if (num == null) {
                    xv1Var.a(5);
                } else {
                    xv1Var.c(5, num.intValue());
                }
                xv1Var.e(cnVar.f, 6);
                xv1Var.e(cnVar.g, 7);
                xv1Var.e(cnVar.h, 8);
                xv1Var.e(cnVar.i, 9);
                xv1Var.e(cnVar.j, 10);
                xv1Var.c(11, cnVar.k);
                xv1Var.c(12, cnVar.l);
                Integer num2 = cnVar.m;
                if (num2 == null) {
                    xv1Var.a(13);
                } else {
                    xv1Var.c(13, num2.intValue());
                }
                xv1Var.c(14, cnVar.n);
                break;
            case 1:
                sf1 sf1Var = (sf1) obj;
                xv1Var.getClass();
                sf1Var.getClass();
                xv1Var.c(1, sf1Var.a);
                xv1Var.c(2, sf1Var.b);
                xv1Var.c(3, sf1Var.c);
                xv1Var.c(4, sf1Var.d);
                xv1Var.e(sf1Var.e, 5);
                Long l = sf1Var.f;
                if (l != null) {
                    xv1Var.c(6, l.longValue());
                } else {
                    xv1Var.a(6);
                }
                break;
            case 2:
                j22 j22Var = (j22) obj;
                xv1Var.getClass();
                j22Var.getClass();
                xv1Var.c(1, j22Var.a);
                xv1Var.c(2, j22Var.b);
                xv1Var.c(3, j22Var.c);
                xv1Var.c(4, j22Var.d);
                Integer num3 = j22Var.e;
                if (num3 == null) {
                    xv1Var.a(5);
                } else {
                    xv1Var.c(5, num3.intValue());
                }
                Long l2 = j22Var.f;
                if (l2 == null) {
                    xv1Var.a(6);
                } else {
                    xv1Var.c(6, l2.longValue());
                }
                Double d = j22Var.g;
                if (d == null) {
                    xv1Var.a(7);
                } else {
                    xv1Var.o(d.doubleValue());
                }
                String str = j22Var.h;
                if (str == null) {
                    xv1Var.a(8);
                } else {
                    xv1Var.e(str, 8);
                }
                xv1Var.e(j22Var.i, 9);
                break;
            case 3:
                xn xnVar = (xn) obj;
                xv1Var.getClass();
                xnVar.getClass();
                xv1Var.c(1, xnVar.a);
                xv1Var.c(2, xnVar.b);
                Integer num4 = xnVar.c;
                if (num4 == null) {
                    xv1Var.a(3);
                } else {
                    xv1Var.c(3, num4.intValue());
                }
                Integer num5 = xnVar.d;
                if (num5 == null) {
                    xv1Var.a(4);
                } else {
                    xv1Var.c(4, num5.intValue());
                }
                xv1Var.c(5, xnVar.e ? 1L : 0L);
                break;
            default:
                x22 x22Var = (x22) obj;
                xv1Var.getClass();
                x22Var.getClass();
                xv1Var.c(1, x22Var.a);
                xv1Var.e(x22Var.b, 2);
                String str2 = x22Var.c;
                if (str2 == null) {
                    xv1Var.a(3);
                } else {
                    xv1Var.e(str2, 3);
                }
                xv1Var.e(x22Var.d, 4);
                Integer num6 = x22Var.e;
                if (num6 == null) {
                    xv1Var.a(5);
                } else {
                    xv1Var.c(5, num6.intValue());
                }
                Integer num7 = x22Var.f;
                if (num7 == null) {
                    xv1Var.a(6);
                } else {
                    xv1Var.c(6, num7.intValue());
                }
                xv1Var.c(7, x22Var.g ? 1L : 0L);
                xv1Var.c(8, x22Var.h ? 1L : 0L);
                xv1Var.c(9, x22Var.i);
                break;
        }
    }

    @Override // defpackage.qx
    public final String x() {
        switch (this.g) {
            case 0:
                return "INSERT OR ABORT INTO `cars` (`id`,`name`,`make`,`model`,`year`,`plateTwoDigits`,`plateLetter`,`plateThreeDigits`,`plateRegion`,`fuelType`,`currentOdometerKm`,`odometerUpdatedEpochDay`,`typicalDailyKm`,`createdEpochDay`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `odometer_readings` (`id`,`carId`,`epochDay`,`odometerKm`,`source`,`recordId`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 2:
                return "INSERT OR ABORT INTO `service_records` (`id`,`carId`,`serviceTypeId`,`epochDay`,`odometerKm`,`cost`,`quantity`,`note`,`action`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT INTO `car_service_schedules` (`carId`,`serviceTypeId`,`intervalKm`,`intervalMonths`,`enabled`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `service_types` (`id`,`key`,`customName`,`icon`,`defaultIntervalKm`,`defaultIntervalMonths`,`tracksQuantity`,`isBuiltIn`,`sortOrder`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }
    }
}

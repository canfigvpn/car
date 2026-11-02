package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class an extends mx {
    public final /* synthetic */ int i;

    @Override // defpackage.mx
    public final void n(xv1 xv1Var, Object obj) {
        switch (this.i) {
            case 0:
                cn cnVar = (cn) obj;
                xv1Var.getClass();
                cnVar.getClass();
                long j = cnVar.a;
                xv1Var.c(1, j);
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
                xv1Var.c(15, j);
                break;
            case 1:
                j22 j22Var = (j22) obj;
                xv1Var.getClass();
                j22Var.getClass();
                xv1Var.c(1, j22Var.a);
                break;
            case 2:
                j22 j22Var2 = (j22) obj;
                xv1Var.getClass();
                j22Var2.getClass();
                long j2 = j22Var2.a;
                xv1Var.c(1, j2);
                xv1Var.c(2, j22Var2.b);
                xv1Var.c(3, j22Var2.c);
                xv1Var.c(4, j22Var2.d);
                Integer num3 = j22Var2.e;
                if (num3 == null) {
                    xv1Var.a(5);
                } else {
                    xv1Var.c(5, num3.intValue());
                }
                Long l = j22Var2.f;
                if (l == null) {
                    xv1Var.a(6);
                } else {
                    xv1Var.c(6, l.longValue());
                }
                Double d = j22Var2.g;
                if (d == null) {
                    xv1Var.a(7);
                } else {
                    xv1Var.o(d.doubleValue());
                }
                String str = j22Var2.h;
                if (str == null) {
                    xv1Var.a(8);
                } else {
                    xv1Var.e(str, 8);
                }
                xv1Var.e(j22Var2.i, 9);
                xv1Var.c(10, j2);
                break;
            default:
                xn xnVar = (xn) obj;
                xv1Var.getClass();
                xnVar.getClass();
                long j3 = xnVar.a;
                xv1Var.c(1, j3);
                long j4 = xnVar.b;
                xv1Var.c(2, j4);
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
                xv1Var.c(6, j3);
                xv1Var.c(7, j4);
                break;
        }
    }

    @Override // defpackage.mx
    public final String s() {
        switch (this.i) {
            case 0:
                return "UPDATE OR ABORT `cars` SET `id` = ?,`name` = ?,`make` = ?,`model` = ?,`year` = ?,`plateTwoDigits` = ?,`plateLetter` = ?,`plateThreeDigits` = ?,`plateRegion` = ?,`fuelType` = ?,`currentOdometerKm` = ?,`odometerUpdatedEpochDay` = ?,`typicalDailyKm` = ?,`createdEpochDay` = ? WHERE `id` = ?";
            case 1:
                return "DELETE FROM `service_records` WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `service_records` SET `id` = ?,`carId` = ?,`serviceTypeId` = ?,`epochDay` = ?,`odometerKm` = ?,`cost` = ?,`quantity` = ?,`note` = ?,`action` = ? WHERE `id` = ?";
            default:
                return "UPDATE `car_service_schedules` SET `carId` = ?,`serviceTypeId` = ?,`intervalKm` = ?,`intervalMonths` = ?,`enabled` = ? WHERE `carId` = ? AND `serviceTypeId` = ?";
        }
    }
}

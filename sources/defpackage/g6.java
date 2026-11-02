package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g6 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ g6(int i, long j) {
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) throws Exception {
        om omVar;
        Object ut1Var;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        long j = this.f;
        switch (i) {
            case 0:
                sl slVar = (sl) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (slVar.e.d() >> 32)) / 2.0f;
                return slVar.a(new h6(fIntBitsToFloat, sv0.U(slVar, fIntBitsToFloat), new yi(5, j), 0));
            case 1:
                pk pkVar = (pk) obj;
                ej0 ej0Var = pkVar.b;
                if (ej0Var != null && (omVar = pkVar.a) != null) {
                    try {
                        ut1Var = ej0Var.h(Long.valueOf(j));
                    } catch (Throwable th) {
                        ut1Var = new ut1(th);
                    }
                    omVar.i(ut1Var);
                    break;
                }
                return ll2Var;
            case 2:
                vv1 vv1Var = (vv1) obj;
                vv1Var.getClass();
                xv1 xv1VarC = vv1Var.C("DELETE FROM cars WHERE id = ?");
                try {
                    xv1VarC.c(1, j);
                    xv1VarC.y();
                    return ll2Var;
                } finally {
                    xv1VarC.close();
                }
            case 3:
                vv1 vv1Var2 = (vv1) obj;
                vv1Var2.getClass();
                xv1 xv1VarC2 = vv1Var2.C("SELECT * FROM cars WHERE id = ?");
                try {
                    xv1VarC2.c(1, j);
                    int iX = mx.x(xv1VarC2, "id");
                    int iX2 = mx.x(xv1VarC2, "name");
                    int iX3 = mx.x(xv1VarC2, "make");
                    int iX4 = mx.x(xv1VarC2, "model");
                    int iX5 = mx.x(xv1VarC2, "year");
                    int iX6 = mx.x(xv1VarC2, "plateTwoDigits");
                    int iX7 = mx.x(xv1VarC2, "plateLetter");
                    int iX8 = mx.x(xv1VarC2, "plateThreeDigits");
                    int iX9 = mx.x(xv1VarC2, "plateRegion");
                    int iX10 = mx.x(xv1VarC2, "fuelType");
                    int iX11 = mx.x(xv1VarC2, "currentOdometerKm");
                    int iX12 = mx.x(xv1VarC2, "odometerUpdatedEpochDay");
                    int iX13 = mx.x(xv1VarC2, "typicalDailyKm");
                    return xv1VarC2.y() ? new cn(xv1VarC2.getLong(iX), xv1VarC2.f(iX2), xv1VarC2.f(iX3), xv1VarC2.f(iX4), xv1VarC2.isNull(iX5) ? null : Integer.valueOf((int) xv1VarC2.getLong(iX5)), xv1VarC2.f(iX6), xv1VarC2.f(iX7), xv1VarC2.f(iX8), xv1VarC2.f(iX9), xv1VarC2.f(iX10), (int) xv1VarC2.getLong(iX11), (int) xv1VarC2.getLong(iX12), xv1VarC2.isNull(iX13) ? null : Integer.valueOf((int) xv1VarC2.getLong(iX13)), (int) xv1VarC2.getLong(mx.x(xv1VarC2, "createdEpochDay"))) : null;
                } finally {
                    xv1VarC2.close();
                }
            case 4:
                ((z02) obj).a(e02.a, new d02(ql0.e, this.f, c02.f, true));
                return ll2Var;
            case 5:
                vv1 vv1Var3 = (vv1) obj;
                vv1Var3.getClass();
                xv1 xv1VarC3 = vv1Var3.C("DELETE FROM odometer_readings WHERE recordId = ?");
                try {
                    xv1VarC3.c(1, j);
                    xv1VarC3.y();
                    return ll2Var;
                } finally {
                    xv1VarC3.close();
                }
            case 6:
                vv1 vv1Var4 = (vv1) obj;
                vv1Var4.getClass();
                xv1 xv1VarC4 = vv1Var4.C("SELECT * FROM odometer_readings WHERE carId = ? ORDER BY epochDay, id");
                try {
                    xv1VarC4.c(1, j);
                    int iX14 = mx.x(xv1VarC4, "id");
                    int iX15 = mx.x(xv1VarC4, "carId");
                    int iX16 = mx.x(xv1VarC4, "epochDay");
                    int iX17 = mx.x(xv1VarC4, "odometerKm");
                    int iX18 = mx.x(xv1VarC4, "source");
                    int iX19 = mx.x(xv1VarC4, "recordId");
                    ArrayList arrayList = new ArrayList();
                    while (xv1VarC4.y()) {
                        arrayList.add(new sf1(xv1VarC4.getLong(iX14), xv1VarC4.getLong(iX15), (int) xv1VarC4.getLong(iX16), (int) xv1VarC4.getLong(iX17), xv1VarC4.f(iX18), xv1VarC4.isNull(iX19) ? null : Long.valueOf(xv1VarC4.getLong(iX19))));
                        break;
                    }
                    return arrayList;
                } finally {
                    xv1VarC4.close();
                }
            case 7:
                vv1 vv1Var5 = (vv1) obj;
                vv1Var5.getClass();
                xv1 xv1VarC5 = vv1Var5.C("SELECT * FROM service_records WHERE id = ?");
                try {
                    xv1VarC5.c(1, j);
                    int iX20 = mx.x(xv1VarC5, "id");
                    int iX21 = mx.x(xv1VarC5, "carId");
                    int iX22 = mx.x(xv1VarC5, "serviceTypeId");
                    int iX23 = mx.x(xv1VarC5, "epochDay");
                    int iX24 = mx.x(xv1VarC5, "odometerKm");
                    int iX25 = mx.x(xv1VarC5, "cost");
                    int iX26 = mx.x(xv1VarC5, "quantity");
                    int iX27 = mx.x(xv1VarC5, "note");
                    return xv1VarC5.y() ? new j22(xv1VarC5.getLong(iX20), xv1VarC5.getLong(iX21), xv1VarC5.getLong(iX22), (int) xv1VarC5.getLong(iX23), xv1VarC5.isNull(iX24) ? null : Integer.valueOf((int) xv1VarC5.getLong(iX24)), xv1VarC5.isNull(iX25) ? null : Long.valueOf(xv1VarC5.getLong(iX25)), xv1VarC5.isNull(iX26) ? null : Double.valueOf(xv1VarC5.getDouble(iX26)), xv1VarC5.isNull(iX27) ? null : xv1VarC5.f(iX27), xv1VarC5.f(mx.x(xv1VarC5, "action"))) : null;
                } finally {
                    xv1VarC5.close();
                }
            case 8:
                vv1 vv1Var6 = (vv1) obj;
                vv1Var6.getClass();
                xv1 xv1VarC6 = vv1Var6.C("SELECT * FROM service_records WHERE carId = ? ORDER BY epochDay DESC, id DESC");
                try {
                    xv1VarC6.c(1, j);
                    int iX28 = mx.x(xv1VarC6, "id");
                    int iX29 = mx.x(xv1VarC6, "carId");
                    int iX30 = mx.x(xv1VarC6, "serviceTypeId");
                    int iX31 = mx.x(xv1VarC6, "epochDay");
                    int iX32 = mx.x(xv1VarC6, "odometerKm");
                    int iX33 = mx.x(xv1VarC6, "cost");
                    int iX34 = mx.x(xv1VarC6, "quantity");
                    int iX35 = mx.x(xv1VarC6, "note");
                    int iX36 = mx.x(xv1VarC6, "action");
                    ArrayList arrayList2 = new ArrayList();
                    while (xv1VarC6.y()) {
                        arrayList2.add(new j22(xv1VarC6.getLong(iX28), xv1VarC6.getLong(iX29), xv1VarC6.getLong(iX30), (int) xv1VarC6.getLong(iX31), xv1VarC6.isNull(iX32) ? null : Integer.valueOf((int) xv1VarC6.getLong(iX32)), xv1VarC6.isNull(iX33) ? null : Long.valueOf(xv1VarC6.getLong(iX33)), xv1VarC6.isNull(iX34) ? null : Double.valueOf(xv1VarC6.getDouble(iX34)), xv1VarC6.isNull(iX35) ? null : xv1VarC6.f(iX35), xv1VarC6.f(iX36)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    xv1VarC6.close();
                }
            default:
                vv1 vv1Var7 = (vv1) obj;
                vv1Var7.getClass();
                xv1 xv1VarC7 = vv1Var7.C("SELECT * FROM car_service_schedules WHERE carId = ?");
                try {
                    xv1VarC7.c(1, j);
                    int iX37 = mx.x(xv1VarC7, "carId");
                    int iX38 = mx.x(xv1VarC7, "serviceTypeId");
                    int iX39 = mx.x(xv1VarC7, "intervalKm");
                    int iX40 = mx.x(xv1VarC7, "intervalMonths");
                    int iX41 = mx.x(xv1VarC7, "enabled");
                    ArrayList arrayList3 = new ArrayList();
                    while (xv1VarC7.y()) {
                        arrayList3.add(new xn(xv1VarC7.getLong(iX37), xv1VarC7.getLong(iX38), xv1VarC7.isNull(iX39) ? null : Integer.valueOf((int) xv1VarC7.getLong(iX39)), xv1VarC7.isNull(iX40) ? null : Integer.valueOf((int) xv1VarC7.getLong(iX40)), ((int) xv1VarC7.getLong(iX41)) != 0));
                        break;
                    }
                    return arrayList3;
                } finally {
                    xv1VarC7.close();
                }
        }
    }
}

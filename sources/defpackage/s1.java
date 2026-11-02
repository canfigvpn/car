package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ s1(int i) {
        this.e = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) throws Exception {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ll2Var;
            case 1:
                return ll2Var;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 3:
                ((Long) obj).getClass();
                return ll2Var;
            case 4:
                return Boolean.valueOf(!(((ub) obj) instanceof wj1));
            case 5:
                u41 u41Var = (u41) obj;
                u41Var.c(dv1.b, (int) (u41Var.a().P() >> 32));
                u41Var.c(dv1.a, 0.0f);
                return ll2Var;
            case 6:
                return ll2Var;
            case 7:
                return ll2Var;
            case 8:
                ((cx0) obj).a();
                return ll2Var;
            case 9:
                return ll2Var;
            case 10:
                return ll2Var;
            case 11:
                sl1 sl1Var = (sl1) obj;
                a90 a90Var = u5.b;
                sl1Var.getClass();
                if (((Context) vv.N(sl1Var, a90Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return ok.b;
                }
                mk.a.getClass();
                return lk.c;
            case 12:
                w02.e((z02) obj, 0);
                return ll2Var;
            case 13:
                vv1 vv1Var = (vv1) obj;
                vv1Var.getClass();
                xv1 xv1VarC = vv1Var.C("SELECT * FROM cars ORDER BY id");
                try {
                    int iX = mx.x(xv1VarC, "id");
                    int iX2 = mx.x(xv1VarC, "name");
                    int iX3 = mx.x(xv1VarC, "make");
                    int iX4 = mx.x(xv1VarC, "model");
                    int iX5 = mx.x(xv1VarC, "year");
                    int iX6 = mx.x(xv1VarC, "plateTwoDigits");
                    int iX7 = mx.x(xv1VarC, "plateLetter");
                    int iX8 = mx.x(xv1VarC, "plateThreeDigits");
                    int iX9 = mx.x(xv1VarC, "plateRegion");
                    int iX10 = mx.x(xv1VarC, "fuelType");
                    int iX11 = mx.x(xv1VarC, "currentOdometerKm");
                    int iX12 = mx.x(xv1VarC, "odometerUpdatedEpochDay");
                    int iX13 = mx.x(xv1VarC, "typicalDailyKm");
                    int iX14 = mx.x(xv1VarC, "createdEpochDay");
                    ArrayList arrayList = new ArrayList();
                    while (xv1VarC.y()) {
                        long j = xv1VarC.getLong(iX);
                        String strF = xv1VarC.f(iX2);
                        String strF2 = xv1VarC.f(iX3);
                        int i2 = iX11;
                        int i3 = iX10;
                        arrayList.add(new cn(j, strF, strF2, xv1VarC.f(iX4), xv1VarC.isNull(iX5) ? null : Integer.valueOf((int) xv1VarC.getLong(iX5)), xv1VarC.f(iX6), xv1VarC.f(iX7), xv1VarC.f(iX8), xv1VarC.f(iX9), xv1VarC.f(iX10), (int) xv1VarC.getLong(iX11), (int) xv1VarC.getLong(iX12), xv1VarC.isNull(iX13) ? null : Integer.valueOf((int) xv1VarC.getLong(iX13)), (int) xv1VarC.getLong(iX14)));
                        iX4 = iX4;
                        iX12 = iX12;
                        iX10 = i3;
                        iX11 = i2;
                        iX3 = iX3;
                        break;
                    }
                    return arrayList;
                } finally {
                    xv1VarC.close();
                }
            case 14:
                vv1 vv1Var2 = (vv1) obj;
                vv1Var2.getClass();
                xv1 xv1VarC2 = vv1Var2.C("DELETE FROM cars");
                try {
                    xv1VarC2.y();
                    return ll2Var;
                } finally {
                    xv1VarC2.close();
                }
            case 15:
                vv1 vv1Var3 = (vv1) obj;
                vv1Var3.getClass();
                xv1 xv1VarC3 = vv1Var3.C("SELECT * FROM cars ORDER BY createdEpochDay DESC, id DESC");
                try {
                    int iX15 = mx.x(xv1VarC3, "id");
                    int iX16 = mx.x(xv1VarC3, "name");
                    int iX17 = mx.x(xv1VarC3, "make");
                    int iX18 = mx.x(xv1VarC3, "model");
                    int iX19 = mx.x(xv1VarC3, "year");
                    int iX20 = mx.x(xv1VarC3, "plateTwoDigits");
                    int iX21 = mx.x(xv1VarC3, "plateLetter");
                    int iX22 = mx.x(xv1VarC3, "plateThreeDigits");
                    int iX23 = mx.x(xv1VarC3, "plateRegion");
                    int iX24 = mx.x(xv1VarC3, "fuelType");
                    int iX25 = mx.x(xv1VarC3, "currentOdometerKm");
                    int iX26 = mx.x(xv1VarC3, "odometerUpdatedEpochDay");
                    int iX27 = mx.x(xv1VarC3, "typicalDailyKm");
                    int iX28 = mx.x(xv1VarC3, "createdEpochDay");
                    ArrayList arrayList2 = new ArrayList();
                    while (xv1VarC3.y()) {
                        long j2 = xv1VarC3.getLong(iX15);
                        String strF3 = xv1VarC3.f(iX16);
                        String strF4 = xv1VarC3.f(iX17);
                        int i4 = iX25;
                        int i5 = iX24;
                        arrayList2.add(new cn(j2, strF3, strF4, xv1VarC3.f(iX18), xv1VarC3.isNull(iX19) ? null : Integer.valueOf((int) xv1VarC3.getLong(iX19)), xv1VarC3.f(iX20), xv1VarC3.f(iX21), xv1VarC3.f(iX22), xv1VarC3.f(iX23), xv1VarC3.f(iX24), (int) xv1VarC3.getLong(iX25), (int) xv1VarC3.getLong(iX26), xv1VarC3.isNull(iX27) ? null : Integer.valueOf((int) xv1VarC3.getLong(iX27)), (int) xv1VarC3.getLong(iX28)));
                        iX18 = iX18;
                        iX26 = iX26;
                        iX24 = i5;
                        iX25 = i4;
                        iX17 = iX17;
                        break;
                    }
                    return arrayList2;
                } finally {
                    xv1VarC3.close();
                }
            case 16:
                ((String) obj).getClass();
                return ll2Var;
            case 17:
                return ll2Var;
            case 18:
                si2 si2Var = (si2) obj;
                si2Var.getClass();
                fk1 fk1Var = (fk1) si2Var;
                fk1Var.t = false;
                n02.l(fk1Var);
                return Boolean.FALSE;
            case 19:
                w02.e((z02) obj, 1);
                return ll2Var;
            case 20:
                sl1 sl1Var2 = (sl1) obj;
                a90 a90Var2 = un0.a;
                sl1Var2.getClass();
                View view = ((eo2) vv.N(sl1Var2, a90Var2)).a;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object objL = y12.l(view);
                    view = objL instanceof View ? (View) objL : null;
                }
                return null;
            case 21:
                return ll2Var;
            case 22:
                sy syVar = (sy) obj;
                if (syVar instanceof xy) {
                    return (xy) syVar;
                }
                return null;
            case 23:
                return ll2Var;
            case 24:
                lv0[] lv0VarArr = w02.a;
                y02 y02Var = u02.m;
                lv0 lv0Var = w02.a[5];
                ((z02) obj).a(y02Var, Boolean.TRUE);
                return ll2Var;
            case 25:
                lv0[] lv0VarArr2 = w02.a;
                y02 y02Var2 = u02.m;
                lv0 lv0Var2 = w02.a[5];
                ((z02) obj).a(y02Var2, Boolean.TRUE);
                return ll2Var;
            case 26:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 27:
                return ll2Var;
            case 28:
                nx1 nx1Var = new nx1(new m2(16), new m2(17));
                lv0[] lv0VarArr3 = w02.a;
                y02 y02Var3 = u02.v;
                lv0 lv0Var3 = w02.a[12];
                ((z02) obj).a(y02Var3, nx1Var);
                return ll2Var;
            default:
                return ll2Var;
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o01 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ o01(int i, k01 k01Var) {
        this.e = 0;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) throws Exception {
        int i = this.e;
        Context context = null;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ll2Var;
            case 1:
                return ll2Var;
            case 2:
                return ll2Var;
            case 3:
                return ll2Var;
            case 4:
                sl1 sl1Var = (sl1) obj;
                a90 a90Var = u5.b;
                sl1Var.getClass();
                for (Context baseContext = (Context) vv.N(sl1Var, a90Var); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case 5:
                ((String) obj).getClass();
                return ll2Var;
            case 6:
                ((String) obj).getClass();
                return ll2Var;
            case 7:
                ((Long) obj).getClass();
                return ll2Var;
            case 8:
                ((Long) obj).getClass();
                return ll2Var;
            case 9:
                sj1 sj1Var = (sj1) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(sj1Var.b);
                sb.append(", ");
                return k3.l(sb, sj1Var.c, ')');
            case 10:
                lz lzVar = (lz) obj;
                lzVar.getClass();
                return new lb1(sv0.W(lzVar));
            case 11:
                return new hg(sv0.W((lz) obj));
            case 12:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 13:
                zb1 zb1Var = (zb1) obj;
                zb1Var.getClass();
                cc1 cc1Var = zb1Var.g;
                if (cc1Var == null || cc1Var.j.b != zb1Var.f.a) {
                    return null;
                }
                return cc1Var;
            case 14:
                zb1 zb1Var2 = (zb1) obj;
                zb1Var2.getClass();
                cc1 cc1Var2 = zb1Var2.g;
                if (cc1Var2 == null || cc1Var2.j.b != zb1Var2.f.a) {
                    return null;
                }
                return cc1Var2;
            case 15:
                zb1 zb1Var3 = (zb1) obj;
                zb1Var3.getClass();
                return Integer.valueOf(zb1Var3.f.a);
            case 16:
                ((lz) obj).getClass();
                return new sb1();
            case 17:
                zb1 zb1Var4 = (zb1) obj;
                zb1Var4.getClass();
                return zb1Var4.g;
            case 18:
                zb1 zb1Var5 = (zb1) obj;
                zb1Var5.getClass();
                if (!(zb1Var5 instanceof cc1)) {
                    return null;
                }
                fc1 fc1Var = ((cc1) zb1Var5).j;
                return fc1Var.m(fc1Var.b);
            case 19:
                return nb0.c(s5.W(700, 6, null), 2);
            case 20:
                zb1 zb1Var6 = ((kb1) ((ab) obj).c()).f;
                zb1Var6.getClass();
                int i2 = zb1.i;
                for (zb1 zb1Var7 : vv.o((gu) zb1Var6)) {
                }
                return null;
            case 21:
                return nb0.d(s5.W(700, 6, null), 2);
            case 22:
                return ((kb1) obj).j;
            case 23:
                return ll2Var;
            case 24:
                h8 h8Var = ((de1) obj).a;
                if (h8Var != null) {
                    h8Var.a();
                }
                return ll2Var;
            case 25:
                qf1 qf1Var = (qf1) obj;
                qf1Var.getClass();
                return Integer.valueOf(qf1Var.c);
            case 26:
                qf1 qf1Var2 = (qf1) obj;
                qf1Var2.getClass();
                return Long.valueOf(qf1Var2.a);
            case 27:
                vv1 vv1Var = (vv1) obj;
                vv1Var.getClass();
                xv1 xv1VarC = vv1Var.C("SELECT * FROM odometer_readings ORDER BY carId, epochDay, id");
                try {
                    int iX = mx.x(xv1VarC, "id");
                    int iX2 = mx.x(xv1VarC, "carId");
                    int iX3 = mx.x(xv1VarC, "epochDay");
                    int iX4 = mx.x(xv1VarC, "odometerKm");
                    int iX5 = mx.x(xv1VarC, "source");
                    int iX6 = mx.x(xv1VarC, "recordId");
                    ArrayList arrayList = new ArrayList();
                    while (xv1VarC.y()) {
                        arrayList.add(new sf1(xv1VarC.getLong(iX), xv1VarC.getLong(iX2), (int) xv1VarC.getLong(iX3), (int) xv1VarC.getLong(iX4), xv1VarC.f(iX5), xv1VarC.isNull(iX6) ? null : Long.valueOf(xv1VarC.getLong(iX6))));
                        break;
                    }
                    return arrayList;
                } finally {
                    xv1VarC.close();
                }
            case 28:
                return ll2Var;
            default:
                return ll2Var;
        }
    }

    public /* synthetic */ o01(int i) {
        this.e = i;
    }
}

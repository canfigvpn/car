package defpackage;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements Comparator {
    public static final dg0 b = new dg0(0);
    public static final dg0 c = new dg0(1);
    public static final dg0 d = new dg0(2);
    public static final dg0 e = new dg0(3);
    public static final dg0 f = new dg0(4);
    public final /* synthetic */ int a;

    public /* synthetic */ dg0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                cg0 cg0Var = (cg0) obj;
                cg0 cg0Var2 = (cg0) obj2;
                if (!ux.y(cg0Var) || !ux.y(cg0Var2)) {
                    if (ux.y(cg0Var)) {
                        return -1;
                    }
                    return ux.y(cg0Var2) ? 1 : 0;
                }
                ax0 ax0VarV = qx.V(cg0Var);
                ax0 ax0VarV2 = qx.V(cg0Var2);
                if (ws0.j(ax0VarV, ax0VarV2)) {
                    return 0;
                }
                Object[] objArr = new ax0[16];
                int i = 0;
                while (ax0VarV != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = ax0VarV;
                    i++;
                    ax0VarV = ax0VarV.u();
                }
                Object[] objArr3 = new ax0[16];
                int i3 = 0;
                while (ax0VarV2 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = ax0VarV2;
                    i3++;
                    ax0VarV2 = ax0VarV2.u();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (ws0.j(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return ws0.n(((ax0) objArr[i5]).v(), ((ax0) objArr3[i5]).v());
                }
                fu1.h("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                yr1 yr1VarH = ((p02) obj).h();
                yr1 yr1VarH2 = ((p02) obj2).h();
                int iCompare = Float.compare(yr1VarH.a, yr1VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(yr1VarH.b, yr1VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(yr1VarH.d, yr1VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(yr1VarH.c, yr1VarH2.c);
            case 2:
                ax0 ax0Var = (ax0) obj;
                ax0 ax0Var2 = (ax0) obj2;
                int iN = ws0.n(ax0Var2.s, ax0Var.s);
                return iN != 0 ? iN : ws0.n(ax0Var.hashCode(), ax0Var2.hashCode());
            case 3:
                yr1 yr1VarH3 = ((p02) obj).h();
                yr1 yr1VarH4 = ((p02) obj2).h();
                int iCompare4 = Float.compare(yr1VarH4.c, yr1VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(yr1VarH3.b, yr1VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(yr1VarH3.d, yr1VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(yr1VarH4.a, yr1VarH3.a);
            case 4:
                qj1 qj1Var = (qj1) obj;
                qj1 qj1Var2 = (qj1) obj2;
                int iCompare7 = Float.compare(((yr1) qj1Var.e).b, ((yr1) qj1Var2.e).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((yr1) qj1Var.e).d, ((yr1) qj1Var2.e).d);
            case 5:
                return s5.D(Integer.valueOf(((xb) obj).b), Integer.valueOf(((xb) obj2).b));
            case 6:
                return s5.D(Integer.valueOf(((xb) obj).b), Integer.valueOf(((xb) obj2).b));
            case 7:
                ax0 ax0Var3 = (ax0) obj;
                ax0 ax0Var4 = (ax0) obj2;
                int iN2 = ws0.n(ax0Var3.s, ax0Var4.s);
                return iN2 != 0 ? iN2 : ws0.n(ax0Var3.hashCode(), ax0Var4.hashCode());
            case 8:
                return s5.D((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 9:
                return s5.D((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 10:
                return s5.D(((ob2) obj).a, ((ob2) obj2).a);
            default:
                return s5.D(((qb2) obj).a, ((qb2) obj2).a);
        }
    }
}

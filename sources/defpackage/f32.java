package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f32 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o32 f;
    public final /* synthetic */ p82 g;

    public /* synthetic */ f32(o32 o32Var, p82 p82Var, int i) {
        this.e = i;
        this.f = o32Var;
        this.g = p82Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.e;
        o32 o32Var = this.f;
        is1 is1Var = cv.a;
        int i3 = 2;
        ll2 ll2Var = ll2.a;
        p82 p82Var = this.g;
        switch (i2) {
            case 0:
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nj2.d(f52.a, null, null, null, vs0.C(-1796863283, new f32(o32Var, p82Var, 3), ak0Var), ak0Var, 196614);
                } else {
                    ak0Var.R();
                }
                return ll2Var;
            case 1:
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nj2.d(f52.a, null, null, null, vs0.C(266167761, new f32(o32Var, p82Var, i3), ak0Var2), ak0Var2, 196614);
                } else {
                    ak0Var2.R();
                }
                return ll2Var;
            case 2:
                ak0 ak0Var3 = (ak0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strR = j02.r(R.string.settings_smart_odometer, ak0Var3);
                    String strR2 = j02.r(R.string.settings_smart_odometer_body, ak0Var3);
                    boolean z = ((wd) p82Var.getValue()).d;
                    o32 o32Var2 = this.f;
                    boolean zH = ak0Var3.h(o32Var2);
                    Object objL = ak0Var3.L();
                    if (zH || objL == is1Var) {
                        f fVar = new f(1, o32Var2, o32.class, "setSmartOdometer", "setSmartOdometer(Z)V", 0, 21);
                        ak0Var3.g0(fVar);
                        objL = fVar;
                    }
                    l32.g(strR, strR2, z, (ej0) ((tj0) objL), ak0Var3, 0);
                } else {
                    ak0Var3.R();
                }
                return ll2Var;
            default:
                ak0 ak0Var4 = (ak0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (!ak0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ak0Var4.R();
                    return ll2Var;
                }
                yw1 yw1Var = new yw1(16);
                r71 r71Var = r71.a;
                u71 u71VarA = l02.a(r71Var, false, yw1Var);
                wr wrVarA = ur.a(ws0.g, q90.r, ak0Var4, 0);
                int iHashCode = Long.hashCode(ak0Var4.T);
                sl1 sl1VarL = ak0Var4.l();
                u71 u71VarB = nj2.B(ak0Var4, u71VarA);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var4.Z();
                if (ak0Var4.S) {
                    ak0Var4.k(wvVar);
                } else {
                    ak0Var4.j0();
                }
                p12.l(vu.f, ak0Var4, wrVarA);
                p12.l(vu.e, ak0Var4, sl1VarL);
                p12.f(ak0Var4, Integer.valueOf(iHashCode), vu.g);
                p12.k(ak0Var4, vu.h);
                p12.l(vu.d, ak0Var4, u71VarB);
                ak0Var4.W(-2084885429);
                Iterator it = dg2.g.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    o32 o32Var3 = this.f;
                    if (!zHasNext) {
                        ak0Var4.p(false);
                        if (l32.a) {
                            ak0Var4.W(-206555294);
                            p61.h(p61.e0(r71Var, 16.0f, 0.0f, 2), 0.0f, 0L, ak0Var4, 6, 6);
                            String strR3 = j02.r(R.string.settings_dynamic_color, ak0Var4);
                            String strR4 = j02.r(R.string.settings_dynamic_color_body, ak0Var4);
                            boolean z2 = ((wd) p82Var.getValue()).b;
                            boolean zH2 = ak0Var4.h(o32Var3);
                            Object objL2 = ak0Var4.L();
                            if (zH2 || objL2 == is1Var) {
                                f fVar2 = new f(1, o32Var3, o32.class, "setDynamicColor", "setDynamicColor(Z)V", 0, 20);
                                ak0Var4.g0(fVar2);
                                objL2 = fVar2;
                            }
                            l32.g(strR3, strR4, z2, (ej0) ((tj0) objL2), ak0Var4, 0);
                        } else {
                            ak0Var4.W(-212881185);
                        }
                        ak0Var4.p(false);
                        ak0Var4.p(true);
                        return ll2Var;
                    }
                    dg2 dg2Var = (dg2) it.next();
                    int iOrdinal = dg2Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.settings_theme_system;
                    } else if (iOrdinal == 1) {
                        i = R.string.settings_theme_light;
                    } else {
                        if (iOrdinal != 2) {
                            qj.p();
                            return null;
                        }
                        i = R.string.settings_theme_dark;
                    }
                    String strR5 = j02.r(i, ak0Var4);
                    boolean z3 = dg2Var == ((wd) p82Var.getValue()).a;
                    boolean zH3 = ak0Var4.h(o32Var3) | ak0Var4.d(dg2Var.ordinal());
                    Object objL3 = ak0Var4.L();
                    if (zH3 || objL3 == is1Var) {
                        objL3 = new gp1(i3, o32Var3, dg2Var);
                        ak0Var4.g0(objL3);
                    }
                    l32.c(strR5, z3, (ti0) objL3, ak0Var4, 0);
                }
                break;
        }
    }
}

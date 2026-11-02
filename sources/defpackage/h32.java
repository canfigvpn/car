package defpackage;

import android.app.Activity;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h32 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p82 f;
    public final /* synthetic */ o32 g;
    public final /* synthetic */ Activity h;

    public /* synthetic */ h32(p82 p82Var, o32 o32Var, Activity activity, int i) {
        this.e = i;
        this.f = p82Var;
        this.g = o32Var;
        this.h = activity;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.e;
        ll2 ll2Var = ll2.a;
        final Activity activity = this.h;
        final o32 o32Var = this.g;
        final p82 p82Var = this.f;
        int i3 = 1;
        switch (i2) {
            case 0:
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nj2.d(f52.a, null, null, null, vs0.C(1382135887, new h32(p82Var, o32Var, activity, i3), ak0Var), ak0Var, 196614);
                } else {
                    ak0Var.R();
                }
                return ll2Var;
            default:
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ak0Var2.R();
                    return ll2Var;
                }
                u71 u71VarA = l02.a(r71.a, false, new yw1(16));
                wr wrVarA = ur.a(ws0.g, q90.r, ak0Var2, 0);
                int iHashCode = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL = ak0Var2.l();
                u71 u71VarB = nj2.B(ak0Var2, u71VarA);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                p12.l(vu.f, ak0Var2, wrVarA);
                p12.l(vu.e, ak0Var2, sl1VarL);
                p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
                p12.k(ak0Var2, vu.h);
                p12.l(vu.d, ak0Var2, u71VarB);
                ak0Var2.W(-788429902);
                for (final vd vdVar : vd.h) {
                    int iOrdinal = vdVar.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.settings_language_system;
                    } else if (iOrdinal == 1) {
                        i = R.string.settings_language_english;
                    } else {
                        if (iOrdinal != 2) {
                            qj.p();
                            return null;
                        }
                        i = R.string.settings_language_persian;
                    }
                    String strR = j02.r(i, ak0Var2);
                    boolean z = vdVar == ((wd) p82Var.getValue()).c;
                    boolean zD = ak0Var2.d(vdVar.ordinal()) | ak0Var2.f(p82Var) | ak0Var2.h(o32Var) | ak0Var2.h(activity);
                    Object objL = ak0Var2.L();
                    if (zD || objL == cv.a) {
                        objL = new ti0() { // from class: k32
                            @Override // defpackage.ti0
                            public final Object a() {
                                vd vdVar2 = ((wd) p82Var.getValue()).c;
                                vd vdVar3 = vdVar;
                                if (vdVar3 != vdVar2) {
                                    o32Var.b.b(vdVar3);
                                    Activity activity2 = activity;
                                    if (activity2 != null) {
                                        activity2.recreate();
                                    }
                                }
                                return ll2.a;
                            }
                        };
                        ak0Var2.g0(objL);
                    }
                    l32.c(strR, z, (ti0) objL, ak0Var2, 0);
                }
                ak0Var2.p(false);
                ak0Var2.p(true);
                return ll2Var;
        }
    }
}

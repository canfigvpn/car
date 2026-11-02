package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j32 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s51 f;
    public final /* synthetic */ ph g;
    public final /* synthetic */ da1 h;
    public final /* synthetic */ da1 i;

    public /* synthetic */ j32(s51 s51Var, ph phVar, da1 da1Var, da1 da1Var2, int i) {
        this.e = i;
        this.f = s51Var;
        this.g = phVar;
        this.h = da1Var;
        this.i = da1Var2;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ak0Var.R();
                } else {
                    nj2.d(f52.a, null, null, null, vs0.C(-849800365, new j32(this.f, this.g, this.h, this.i, 1), ak0Var), ak0Var, 196614);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ak0Var2.R();
                } else {
                    wr wrVarA = ur.a(ws0.g, q90.r, ak0Var2, 0);
                    int iHashCode = Long.hashCode(ak0Var2.T);
                    sl1 sl1VarL = ak0Var2.l();
                    r71 r71Var = r71.a;
                    u71 u71VarB = nj2.B(ak0Var2, r71Var);
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
                    String strR = j02.r(R.string.settings_export, ak0Var2);
                    String strR2 = j02.r(R.string.settings_export_body, ak0Var2);
                    da1 da1Var = this.h;
                    boolean z = !((nh) da1Var.getValue()).a;
                    s51 s51Var = this.f;
                    boolean zH = ak0Var2.h(s51Var);
                    ph phVar = this.g;
                    boolean zH2 = zH | ak0Var2.h(phVar);
                    Object objL = ak0Var2.L();
                    is1 is1Var = cv.a;
                    if (zH2 || objL == is1Var) {
                        objL = new gp1(3, s51Var, phVar);
                        ak0Var2.g0(objL);
                    }
                    l32.b(strR, strR2, z, (ti0) objL, ak0Var2, 0);
                    p61.h(p61.e0(r71Var, 16.0f, 0.0f, 2), 0.0f, 0L, ak0Var2, 6, 6);
                    String strR3 = j02.r(R.string.settings_import, ak0Var2);
                    String strR4 = j02.r(R.string.settings_import_body, ak0Var2);
                    boolean z2 = !((nh) da1Var.getValue()).a;
                    Object objL2 = ak0Var2.L();
                    if (objL2 == is1Var) {
                        objL2 = new r9(this.i, 27);
                        ak0Var2.g0(objL2);
                    }
                    l32.b(strR3, strR4, z2, (ti0) objL2, ak0Var2, 3072);
                    ak0Var2.p(true);
                }
                break;
        }
        return ll2Var;
    }
}

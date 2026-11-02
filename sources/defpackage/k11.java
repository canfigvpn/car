package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k11 implements ij0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ u71 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ gt h;

    public /* synthetic */ k11(float f, u71 u71Var, gt gtVar) {
        this.g = f;
        this.f = u71Var;
        this.h = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        gt gtVar = this.h;
        float f = this.g;
        u71 u71Var = this.f;
        ak0 ak0Var = (ak0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    jv1 jv1VarA = kv1.a(f);
                    u71 u71VarX = dv1.x(nj2.k(u71Var, jv1VarA).c(new nj(1.0f, new o72(((jr) ak0Var.j(lr.a)).A), jv1VarA)), qs0.e);
                    sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var, 48);
                    int iHashCode = Long.hashCode(ak0Var.T);
                    sl1 sl1VarL = ak0Var.l();
                    u71 u71VarB = nj2.B(ak0Var, u71VarX);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(wvVar);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, sv1VarA);
                    p12.l(vu.e, ak0Var, sl1VarL);
                    p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
                    p12.k(ak0Var, vu.h);
                    p12.l(vu.d, ak0Var, u71VarB);
                    xj.a(dv1.F(sv0.L(f52.b), vv.K(R.drawable.plate_country_band, ak0Var), dx.b, null, 54), ak0Var, 0);
                    gtVar.d(uv1.a, ak0Var, 6);
                    ak0Var.p(true);
                }
                break;
            default:
                num.getClass();
                rw.k(u71Var, f, gtVar, ak0Var, ei1.P(391));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ k11(u71 u71Var, float f, gt gtVar, int i) {
        this.f = u71Var;
        this.g = f;
        this.h = gtVar;
    }
}

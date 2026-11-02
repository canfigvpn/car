package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ih2 implements ij0 {
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ gt g;

    public ih2(float f, long j, gt gtVar) {
        this.e = f;
        this.f = j;
        this.g = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            kj1 kj1Var = jh2.a;
            u71 u71VarB0 = p61.b0(f52.m(r71.a, 40.0f, 24.0f, this.e, 8), jh2.a);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarB0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            sv.b(new vq1[]{yw.a.a(new dr(this.f)), ef2.a.a(ik2.a(nj2.y0, ak0Var))}, this.g, ak0Var, 8);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 implements ij0 {
    public final /* synthetic */ u71 e;
    public final /* synthetic */ u32 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ oj i;
    public final /* synthetic */ f91 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ ti0 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ gt n;

    public pa2(u71 u71Var, u32 u32Var, long j, float f, oj ojVar, f91 f91Var, boolean z, ti0 ti0Var, float f2, gt gtVar) {
        this.e = u71Var;
        this.f = u32Var;
        this.g = j;
        this.h = f;
        this.i = ojVar;
        this.j = f91Var;
        this.k = z;
        this.l = ti0Var;
        this.m = f2;
        this.n = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            on0 on0Var = yr0.a;
            u71 u71VarR = sv0.R(sv0.S(ra2.d(this.e.c(o71.a), this.f, ra2.e(this.g, this.h, ak0Var), this.i, ((m40) ak0Var.j(yv.h)).x(this.m)), this.j, tu1.a(false, 0.0f, 7), this.k, null, this.l, 24));
            w61 w61VarC = xj.c(q90.f, true);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarR);
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
            k3.o(0, this.n, ak0Var, true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

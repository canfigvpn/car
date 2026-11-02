package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t10 implements kj0 {
    public final /* synthetic */ bm e;
    public final /* synthetic */ em f;
    public final /* synthetic */ ej0 g;
    public final /* synthetic */ zl h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ r00 j;
    public final /* synthetic */ n00 k;
    public final /* synthetic */ l00 l;

    public t10(bm bmVar, em emVar, ej0 ej0Var, zl zlVar, Long l, r00 r00Var, n00 n00Var, l00 l00Var) {
        this.e = bmVar;
        this.f = emVar;
        this.g = ej0Var;
        this.h = zlVar;
        this.i = l;
        this.j = r00Var;
        this.k = n00Var;
        this.l = l00Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        vy0 vy0Var = (vy0) obj;
        int iIntValue = ((Number) obj2).intValue();
        ak0 ak0Var = (ak0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (ak0Var.f(vy0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ak0Var.d(iIntValue) ? 32 : 16;
        }
        if (ak0Var.O(i & 1, (i & 147) != 146)) {
            em emVar = this.f;
            bm bmVar = this.e;
            em emVarK = bmVar.k(emVar, iIntValue);
            hk1 hk1Var = new hk1(vy0Var.a);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, hk1Var);
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
            e20.i(emVarK, this.g, this.h.h, this.i, this.j, this.k, this.l, bmVar.a, ak0Var, 221184);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u10 implements ij0 {
    public final /* synthetic */ q01 e;
    public final /* synthetic */ lr0 f;
    public final /* synthetic */ bm g;
    public final /* synthetic */ em h;
    public final /* synthetic */ ej0 i;
    public final /* synthetic */ zl j;
    public final /* synthetic */ Long k;
    public final /* synthetic */ r00 l;
    public final /* synthetic */ n00 m;
    public final /* synthetic */ l00 n;

    public u10(q01 q01Var, lr0 lr0Var, bm bmVar, em emVar, ej0 ej0Var, zl zlVar, Long l, r00 r00Var, n00 n00Var, l00 l00Var) {
        this.e = q01Var;
        this.f = lr0Var;
        this.g = bmVar;
        this.h = emVar;
        this.i = ej0Var;
        this.j = zlVar;
        this.k = l;
        this.l = r00Var;
        this.m = n00Var;
        this.n = l00Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = new s1(28);
                ak0Var.g0(objL);
            }
            u71 u71VarA = l02.a(r71.a, false, (ej0) objL);
            o00 o00Var = o00.a;
            l20 l20Var = new l20(new rd0());
            g82 g82VarQ = rw.Q(h81.g, ak0Var);
            boolean zF = ak0Var.f(l20Var);
            q01 q01Var = this.e;
            boolean zF2 = zF | ak0Var.f(q01Var);
            Object objL2 = ak0Var.L();
            if (zF2 || objL2 == is1Var) {
                objL2 = new j62(new ao2(10, new dq0(22, q01Var, is1.n)), l20Var, g82VarQ);
                ak0Var.g0(objL2);
            }
            j62 j62Var = (j62) objL2;
            boolean zH = ak0Var.h(this.f) | ak0Var.h(this.g) | ak0Var.f(this.h) | ak0Var.f(this.i) | ak0Var.f(this.j) | ak0Var.f(this.k) | ak0Var.h(this.l) | ak0Var.f(this.m) | ak0Var.f(this.n);
            Object objL3 = ak0Var.L();
            if (zH || objL3 == is1Var) {
                s10 s10Var = new s10(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, 0);
                ak0Var.g0(s10Var);
                objL3 = s10Var;
            }
            mx.g(u71VarA, q01Var, null, null, null, j62Var, false, null, (ej0) objL3, ak0Var, 0, 444);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

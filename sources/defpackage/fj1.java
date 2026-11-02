package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends t71 implements sw0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        int iO = y61Var.O(this.u) + y61Var.O(this.s);
        int iO2 = y61Var.O(this.v) + y61Var.O(this.t);
        jm1 jm1VarE = r61Var.e(tw.i(-iO, -iO2, j));
        return y61Var.d0(tw.g(jm1VarE.e + iO, j), tw.f(jm1VarE.f + iO2, j), db0.e, new kc1(4, this, jm1VarE));
    }
}

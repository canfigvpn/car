package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 implements gw {
    public final wv1 e;
    public final String f;
    public final ij0 g;
    public final hb2 h = new hb2(new w8(21, this));

    public pk1(wv1 wv1Var, String str, ij0 ij0Var) {
        this.e = wv1Var;
        this.f = str;
        this.g = ij0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        hb2 hb2Var = this.h;
        if (hb2Var.f != is1.t) {
            ((vv1) hb2Var.getValue()).close();
        }
    }

    @Override // defpackage.gw
    public final Object i(boolean z, ij0 ij0Var, tx txVar) {
        ok1 ok1Var = (ok1) txVar.f().p(ok1.f);
        nk1 nk1Var = ok1Var != null ? ok1Var.e : null;
        if (nk1Var != null) {
            return ij0Var.g(nk1Var, txVar);
        }
        nk1 nk1Var2 = new nk1(this.g, (vv1) this.h.getValue());
        return nj2.K(new ok1(nk1Var2), new e(26, null, ij0Var, nk1Var2), txVar);
    }
}

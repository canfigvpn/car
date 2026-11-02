package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 implements q82, pe0, uj0 {
    public final /* synthetic */ s82 e;

    public jr1(s82 s82Var) {
        this.e = s82Var;
    }

    @Override // defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) {
        this.e.a(qe0Var, sxVar);
        return fz.e;
    }

    @Override // defpackage.uj0
    public final pe0 b(uy uyVar, int i, vk vkVar) {
        return (((i < 0 || i >= 2) && i != -2) || vkVar != vk.f) ? ws0.v(this, uyVar, i, vkVar) : this;
    }

    @Override // defpackage.q82
    public final Object getValue() {
        return this.e.getValue();
    }
}

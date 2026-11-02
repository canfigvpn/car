package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hg2 implements sy {
    public final Object e;
    public final ThreadLocal f;
    public final jg2 g;

    public hg2(Object obj, ThreadLocal threadLocal) {
        this.e = obj;
        this.f = threadLocal;
        this.g = new jg2(threadLocal);
    }

    public final void a(Object obj) {
        this.f.set(obj);
    }

    public final Object c() {
        ThreadLocal threadLocal = this.f;
        Object obj = threadLocal.get();
        threadLocal.set(this.e);
        return obj;
    }

    @Override // defpackage.sy
    public final ty getKey() {
        return this.g;
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        if (this.g.equals(tyVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.e + ", threadLocal = " + this.f + ')';
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        return this.g.equals(tyVar) ? ab0.e : this;
    }
}

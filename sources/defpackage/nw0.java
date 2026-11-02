package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class nw0 extends y71 {
    public final String a;

    public nw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw0) && this.a.equals(((nw0) obj).a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        ow0 ow0Var = new ow0();
        ow0Var.s = this.a;
        return ow0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((ow0) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}

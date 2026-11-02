package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class yf0 extends y71 {
    public final xf0 a;

    public yf0(xf0 xf0Var) {
        this.a = xf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yf0) && ws0.j(this.a, ((yf0) obj).a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        ag0 ag0Var = new ag0();
        ag0Var.s = this.a;
        return ag0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ag0 ag0Var = (ag0) t71Var;
        ag0Var.s.a.j(ag0Var);
        xf0 xf0Var = this.a;
        ag0Var.s = xf0Var;
        xf0Var.a.b(ag0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}

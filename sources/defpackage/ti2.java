package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ti2 extends y71 {
    public final tz0 a;

    public ti2(tz0 tz0Var) {
        this.a = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti2) && ws0.j(this.a, ((ti2) obj).a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        ui2 ui2Var = new ui2();
        ui2Var.s = this.a;
        return ui2Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((ui2) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}

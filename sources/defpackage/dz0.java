package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class dz0 extends y71 {
    public final gz0 a;

    public dz0(gz0 gz0Var) {
        this.a = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz0) && this.a == ((dz0) obj).a;
    }

    @Override // defpackage.y71
    public final t71 f() {
        ez0 ez0Var = new ez0();
        ez0Var.s = this.a;
        return ez0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ez0 ez0Var = (ez0) t71Var;
        gz0 gz0Var = ez0Var.s;
        gz0 gz0Var2 = this.a;
        if (ws0.j(gz0Var, gz0Var2) || !ez0Var.e.r) {
            return;
        }
        gz0 gz0Var3 = ez0Var.s;
        gz0Var3.d();
        gz0Var3.b = null;
        ez0Var.s = gz0Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 extends y71 {
    public final zx1 a;

    public py1(zx1 zx1Var) {
        this.a = zx1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py1) {
            return ws0.j(this.a, ((py1) obj).a);
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        vx1 vx1Var = new vx1();
        vx1Var.s = this.a;
        vx1Var.t = true;
        return vx1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        vx1 vx1Var = (vx1) t71Var;
        vx1Var.s = this.a;
        vx1Var.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k3.f(this.a.hashCode() * 31, 31, false);
    }
}

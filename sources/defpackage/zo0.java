package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class zo0 extends y71 {
    public final ur0 a;
    public final bp0 b;

    public zo0(ur0 ur0Var, bp0 bp0Var) {
        this.a = ur0Var;
        this.b = bp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo0)) {
            return false;
        }
        zo0 zo0Var = (zo0) obj;
        return ws0.j(this.a, zo0Var.a) && ws0.j(this.b, zo0Var.b);
    }

    @Override // defpackage.y71
    public final t71 f() {
        b40 b40VarA = this.b.a(this.a);
        ap0 ap0Var = new ap0();
        ap0Var.u = b40VarA;
        ap0Var.F0(b40VarA);
        return ap0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ap0 ap0Var = (ap0) t71Var;
        b40 b40VarA = this.b.a(this.a);
        ap0Var.G0(ap0Var.u);
        ap0Var.u = b40VarA;
        ap0Var.F0(b40VarA);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

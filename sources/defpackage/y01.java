package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class y01 extends y71 {
    public final o7 a;
    public final f11 b;
    public final me2 c;

    public y01(o7 o7Var, f11 f11Var, me2 me2Var) {
        this.a = o7Var;
        this.b = f11Var;
        this.c = me2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y01) {
            y01 y01Var = (y01) obj;
            return ws0.j(this.a, y01Var.a) && this.b == y01Var.b && this.c == y01Var.c;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new z01(this.a, this.b, this.c);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        z01 z01Var = (z01) t71Var;
        if (z01Var.r) {
            z01Var.s.f();
            z01Var.s.k(z01Var);
        }
        o7 o7Var = this.a;
        z01Var.s = o7Var;
        if (z01Var.r) {
            if (o7Var.a != null) {
                yp0.c("Expected textInputModifierNode to be null");
            }
            o7Var.a = z01Var;
        }
        z01Var.t = this.b;
        z01Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}

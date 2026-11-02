package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class cd2 extends y71 {
    public final ru1 a;
    public final fe2 b;
    public final ge2 c;
    public final wx d;

    public cd2(ru1 ru1Var, fe2 fe2Var, ge2 ge2Var, wx wxVar) {
        this.a = ru1Var;
        this.b = fe2Var;
        this.c = ge2Var;
        this.d = wxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2)) {
            return false;
        }
        cd2 cd2Var = (cd2) obj;
        return this.a == cd2Var.a && this.b == cd2Var.b && this.c == cd2Var.c && this.d == cd2Var.d;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new dd2(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        dd2 dd2Var = (dd2) t71Var;
        dd2Var.u.b = null;
        ru1 ru1Var = this.a;
        dd2Var.u = ru1Var;
        ru1Var.b = dd2Var;
        ru1Var.c = dd2Var.r ? eh2.g : eh2.f;
        dd2Var.v = this.b;
        dd2Var.w = this.c;
        dd2Var.x = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class eg0 extends y71 {
    public final f91 a;

    public eg0(f91 f91Var) {
        this.a = f91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eg0) {
            return ws0.j(this.a, ((eg0) obj).a);
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new gg0(this.a, 1, null);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((gg0) t71Var).K0(this.a);
    }

    public final int hashCode() {
        f91 f91Var = this.a;
        if (f91Var != null) {
            return f91Var.hashCode();
        }
        return 0;
    }
}

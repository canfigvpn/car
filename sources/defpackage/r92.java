package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class r92 extends y71 {
    public final ti0 a;

    public r92(ti0 ti0Var) {
        this.a = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r92) {
            return this.a == ((r92) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new s92(this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((s92) t71Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

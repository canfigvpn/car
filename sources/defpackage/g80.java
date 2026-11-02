package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class g80 extends y71 {
    public final ej0 a;

    public g80(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g80) {
            return this.a == ((g80) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        f80 f80Var = new f80();
        f80Var.s = this.a;
        return f80Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((f80) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

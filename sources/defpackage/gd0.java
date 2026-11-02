package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class gd0 extends y71 {
    public final n50 a;

    public gd0(n50 n50Var) {
        this.a = n50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gd0) {
            return this.a == ((gd0) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        hd0 hd0Var = new hd0();
        hd0Var.s = this.a;
        hd0Var.t = 1.0f;
        return hd0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        hd0 hd0Var = (hd0) t71Var;
        hd0Var.s = this.a;
        hd0Var.t = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}

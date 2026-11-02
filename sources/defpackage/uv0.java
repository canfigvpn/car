package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class uv0 extends y71 {
    public final ej0 a;
    public final ej0 b;

    public uv0(ej0 ej0Var, ej0 ej0Var2) {
        this.a = ej0Var;
        this.b = ej0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return this.a == uv0Var.a && this.b == uv0Var.b;
    }

    @Override // defpackage.y71
    public final t71 f() {
        wv0 wv0Var = new wv0();
        wv0Var.s = this.a;
        wv0Var.t = this.b;
        return wv0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        wv0 wv0Var = (wv0) t71Var;
        wv0Var.s = this.a;
        wv0Var.t = this.b;
    }

    public final int hashCode() {
        ej0 ej0Var = this.a;
        int iHashCode = (ej0Var != null ? ej0Var.hashCode() : 0) * 31;
        ej0 ej0Var2 = this.b;
        return iHashCode + (ej0Var2 != null ? ej0Var2.hashCode() : 0);
    }
}

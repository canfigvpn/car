package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class px0 extends y71 {
    public final float a;
    public final boolean b;

    public px0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        px0 px0Var = obj instanceof px0 ? (px0) obj : null;
        return px0Var != null && this.a == px0Var.a && this.b == px0Var.b;
    }

    @Override // defpackage.y71
    public final t71 f() {
        qx0 qx0Var = new qx0();
        qx0Var.s = this.a;
        qx0Var.t = this.b;
        return qx0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        qx0 qx0Var = (qx0) t71Var;
        qx0Var.s = this.a;
        qx0Var.t = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}

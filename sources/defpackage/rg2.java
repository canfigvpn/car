package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class rg2 extends y71 {
    public final ur0 a;
    public final boolean b;
    public final g82 c;

    public rg2(ur0 ur0Var, boolean z, g82 g82Var) {
        this.a = ur0Var;
        this.b = z;
        this.c = g82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg2)) {
            return false;
        }
        rg2 rg2Var = (rg2) obj;
        return ws0.j(this.a, rg2Var.a) && this.b == rg2Var.b && this.c.equals(rg2Var.c);
    }

    @Override // defpackage.y71
    public final t71 f() {
        tg2 tg2Var = new tg2();
        tg2Var.s = this.a;
        tg2Var.t = this.b;
        tg2Var.u = this.c;
        tg2Var.y = Float.NaN;
        tg2Var.z = Float.NaN;
        return tg2Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        tg2 tg2Var = (tg2) t71Var;
        tg2Var.s = this.a;
        boolean z = tg2Var.t;
        boolean z2 = this.b;
        if (z != z2) {
            rw.z(tg2Var);
        }
        tg2Var.t = z2;
        tg2Var.u = this.c;
        if (tg2Var.x == null && !Float.isNaN(tg2Var.z)) {
            tg2Var.x = sv0.D(tg2Var.z);
        }
        if (tg2Var.w != null || Float.isNaN(tg2Var.y)) {
            return;
        }
        tg2Var.w = sv0.D(tg2Var.y);
    }

    public final int hashCode() {
        return this.c.hashCode() + k3.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}

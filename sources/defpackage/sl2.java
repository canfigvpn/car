package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class sl2 extends y71 {
    public final float a;
    public final float b;

    public sl2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return w60.b(this.a, sl2Var.a) && w60.b(this.b, sl2Var.b);
    }

    @Override // defpackage.y71
    public final t71 f() {
        tl2 tl2Var = new tl2();
        tl2Var.s = this.a;
        tl2Var.t = this.b;
        return tl2Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        tl2 tl2Var = (tl2) t71Var;
        tl2Var.s = this.a;
        tl2Var.t = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}

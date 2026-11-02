package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nj extends y71 {
    public final float a;
    public final o72 b;
    public final u32 c;

    public nj(float f, o72 o72Var, u32 u32Var) {
        this.a = f;
        this.b = o72Var;
        this.c = u32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj;
        return w60.b(this.a, njVar.a) && this.b.equals(njVar.b) && ws0.j(this.c, njVar.c);
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new mj(this.a, this.b, this.c);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        mj mjVar = (mj) t71Var;
        float f = mjVar.v;
        rl rlVar = mjVar.y;
        float f2 = this.a;
        if (!w60.b(f, f2)) {
            mjVar.v = f2;
            rlVar.F0();
        }
        o72 o72Var = mjVar.w;
        o72 o72Var2 = this.b;
        if (!ws0.j(o72Var, o72Var2)) {
            mjVar.w = o72Var2;
            rlVar.F0();
        }
        u32 u32Var = mjVar.x;
        u32 u32Var2 = this.c;
        if (ws0.j(u32Var, u32Var2)) {
            return;
        }
        mjVar.x = u32Var2;
        rlVar.F0();
        n02.l(mjVar);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) w60.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}

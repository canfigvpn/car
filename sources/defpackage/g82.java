package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g82 implements ld0 {
    public final float a;
    public final float b;
    public final Object c;

    public g82(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.nb
    public final nm2 a(mj2 mj2Var) {
        Object obj = this.c;
        return new qk1(this.a, this.b, obj == null ? null : (tb) mj2Var.a.h(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g82) {
            g82 g82Var = (g82) obj;
            if (g82Var.a == this.a && g82Var.b == this.b && ws0.j(g82Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + k3.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ g82(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}

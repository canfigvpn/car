package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 implements mv0 {
    public final mv0 a;
    public final t12 b;

    public cf1(mv0 mv0Var) {
        this.a = mv0Var;
        this.b = new t12(mv0Var.c());
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        if (n20Var.d()) {
            return n20Var.f(this.a);
        }
        return null;
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return this.b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        if (obj != null) {
            p61Var.O(this.a, obj);
        } else {
            p61Var.L();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cf1.class == obj.getClass() && this.a.equals(((cf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

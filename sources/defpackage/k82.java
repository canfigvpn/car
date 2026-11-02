package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 implements nb {
    public final nb a;
    public final long b;

    public k82(ld0 ld0Var, long j) {
        this.a = ld0Var;
        this.b = j;
    }

    @Override // defpackage.nb
    public final nm2 a(mj2 mj2Var) {
        return new l82(this.a.a(mj2Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k82)) {
            return false;
        }
        k82 k82Var = (k82) obj;
        return k82Var.b == this.b && ws0.j(k82Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

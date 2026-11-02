package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 {
    public final long a;
    public final kj1 b;

    public vi1() {
        long jD = ws0.d(4284900966L);
        kj1 kj1VarK = p61.k(3);
        this.a = jD;
        this.b = kj1VarK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vi1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vi1 vi1Var = (vi1) obj;
        long j = vi1Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && this.b.equals(vi1Var.b);
    }

    public final int hashCode() {
        int i = dr.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        k3.r(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}

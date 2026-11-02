package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pf2 {
    public final long a;
    public final long b;

    public pf2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf2)) {
            return false;
        }
        pf2 pf2Var = (pf2) obj;
        long j = pf2Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, pf2Var.b);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        k3.r(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) dr.h(this.b));
        sb.append(')');
        return sb.toString();
    }
}

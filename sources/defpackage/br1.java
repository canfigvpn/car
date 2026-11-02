package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class br1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public br1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof br1)) {
            return false;
        }
        br1 br1Var = (br1) obj;
        long j = br1Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, br1Var.b) && vk2.a(this.c, br1Var.c) && vk2.a(this.d, br1Var.d);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.d) + k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}

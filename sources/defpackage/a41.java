package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class a41 {
    public static final z31 Companion = new z31();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ a41(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            qx.Z(i, 1, y31.a.c());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j2;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a41)) {
            return false;
        }
        a41 a41Var = (a41) obj;
        return this.a == a41Var.a && this.b == a41Var.b && this.c == a41Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k3.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "LogServiceRoute(carId=" + this.a + ", recordId=" + this.b + ", serviceTypeId=" + this.c + ")";
    }

    public a41(long j, long j2, long j3, int i) {
        j2 = (i & 2) != 0 ? 0L : j2;
        j3 = (i & 4) != 0 ? 0L : j3;
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oi0 {
    public final long a;
    public final long b;
    public final List c;
    public final mi0 d;
    public final boolean e;

    public /* synthetic */ oi0(int i) {
        this(0L, 0L, cb0.e, new mi0(), (i & 16) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj;
        return this.a == oi0Var.a && this.b == oi0Var.b && ws0.j(this.c, oi0Var.c) && ws0.j(this.d, oi0Var.d) && this.e == oi0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + k3.c(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "FuelUiState(carId=" + this.a + ", fuelTypeId=" + this.b + ", entries=" + this.c + ", stats=" + this.d + ", isLoading=" + this.e + ")";
    }

    public oi0(long j, long j2, List list, mi0 mi0Var, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = list;
        this.d = mi0Var;
        this.e = z;
    }
}

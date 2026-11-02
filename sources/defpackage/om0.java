package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class om0 {
    public final long a;
    public final List b;
    public final List c;
    public final long d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ om0(int i) {
        boolean z = (i & 16) != 0;
        cb0 cb0Var = cb0.e;
        this(0L, cb0Var, cb0Var, 0L, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om0)) {
            return false;
        }
        om0 om0Var = (om0) obj;
        return this.a == om0Var.a && ws0.j(this.b, om0Var.b) && ws0.j(this.c, om0Var.c) && this.d == om0Var.d && this.e == om0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k3.c((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "HistoryUiState(carId=" + this.a + ", entries=" + this.b + ", filterOptions=" + this.c + ", selectedFilterId=" + this.d + ", isLoading=" + this.e + ")";
    }

    public om0(long j, List list, List list2, long j2, boolean z) {
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = j2;
        this.e = z;
    }
}

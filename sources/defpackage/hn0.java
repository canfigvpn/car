package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hn0 {
    public final wm a;
    public final List b;
    public final mi0 c;
    public final pf1 d;
    public final boolean e;

    public /* synthetic */ hn0(int i) {
        this(null, cb0.e, null, null, (i & 16) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn0)) {
            return false;
        }
        hn0 hn0Var = (hn0) obj;
        return ws0.j(this.a, hn0Var.a) && ws0.j(this.b, hn0Var.b) && ws0.j(this.c, hn0Var.c) && ws0.j(this.d, hn0Var.d) && this.e == hn0Var.e;
    }

    public final int hashCode() {
        wm wmVar = this.a;
        int iHashCode = (this.b.hashCode() + ((wmVar == null ? 0 : wmVar.hashCode()) * 31)) * 31;
        mi0 mi0Var = this.c;
        int iHashCode2 = (iHashCode + (mi0Var == null ? 0 : mi0Var.hashCode())) * 31;
        pf1 pf1Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (pf1Var != null ? pf1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HomeUiState(car=" + this.a + ", upcoming=" + this.b + ", fuelStats=" + this.c + ", odometerEstimate=" + this.d + ", isLoading=" + this.e + ")";
    }

    public hn0(wm wmVar, List list, mi0 mi0Var, pf1 pf1Var, boolean z) {
        this.a = wmVar;
        this.b = list;
        this.c = mi0Var;
        this.d = pf1Var;
        this.e = z;
    }
}

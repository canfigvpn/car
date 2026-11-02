package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mi0 {
    public final int a;
    public final double b;
    public final long c;
    public final Double d;
    public final Integer e;
    public final Double f;
    public final Double g;
    public final Double h;
    public final List i;

    public mi0(int i, double d, long j, Double d2, Integer num, Double d3, Double d4, Double d5, List list) {
        this.a = i;
        this.b = d;
        this.c = j;
        this.d = d2;
        this.e = num;
        this.f = d3;
        this.g = d4;
        this.h = d5;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi0)) {
            return false;
        }
        mi0 mi0Var = (mi0) obj;
        return this.a == mi0Var.a && Double.compare(this.b, mi0Var.b) == 0 && this.c == mi0Var.c && ws0.j(this.d, mi0Var.d) && ws0.j(this.e, mi0Var.e) && ws0.j(this.f, mi0Var.f) && ws0.j(this.g, mi0Var.g) && ws0.j(this.h, mi0Var.h) && ws0.j(this.i, mi0Var.i);
    }

    public final int hashCode() {
        int iC = k3.c((Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        Double d = this.d;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.f;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.g;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.h;
        return this.i.hashCode() + ((iHashCode4 + (d4 != null ? d4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FuelStats(fillUpCount=" + this.a + ", totalLitres=" + this.b + ", totalCost=" + this.c + ", averagePricePerLitre=" + this.d + ", totalDistanceKm=" + this.e + ", averageConsumption=" + this.f + ", lastConsumption=" + this.g + ", costPerKm=" + this.h + ", legs=" + this.i + ")";
    }

    public /* synthetic */ mi0() {
        this(0, 0.0d, 0L, null, null, null, null, null, cb0.e);
    }
}

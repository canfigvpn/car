package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 {
    public static final oq1 c = new oq1(0.0f, new pq(0.0f));
    public final float a;
    public final pq b;

    public oq1(float f, pq pqVar) {
        this.a = f;
        this.b = pqVar;
        if (Float.isNaN(f)) {
            qj.r("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq1)) {
            return false;
        }
        oq1 oq1Var = (oq1) obj;
        return this.a == oq1Var.a && this.b.equals(oq1Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wp {
    public final int a;
    public final int b;
    public final int c;

    public wp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return this.a == wpVar.a && this.b == wpVar.b && this.c == wpVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "CivilDate(year=" + this.a + ", month=" + this.b + ", day=" + this.c + ")";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class em {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public em(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return this.a == emVar.a && this.b == emVar.b && this.c == emVar.c && this.d == emVar.d && this.e == emVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + k3.b(this.d, k3.b(this.c, k3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.a + ", month=" + this.b + ", numberOfDays=" + this.c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}

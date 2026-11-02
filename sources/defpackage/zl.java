package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zl implements Comparable {
    public final int e;
    public final int f;
    public final int g;
    public final long h;

    public zl(int i, int i2, int i3, long j) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ws0.o(this.h, ((zl) obj).h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl)) {
            return false;
        }
        zl zlVar = (zl) obj;
        return this.e == zlVar.e && this.f == zlVar.f && this.g == zlVar.g && this.h == zlVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + k3.b(this.g, k3.b(this.f, Integer.hashCode(this.e) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.e + ", month=" + this.f + ", dayOfMonth=" + this.g + ", utcTimeMillis=" + this.h + ')';
    }
}

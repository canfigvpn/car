package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class fn {
    public static final en Companion = new en();
    public final long a;

    public /* synthetic */ fn(int i, long j) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn) && this.a == ((fn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "CarFormRoute(carId=" + this.a + ")";
    }

    public /* synthetic */ fn() {
        this(0L);
    }

    public fn(long j) {
        this.a = j;
    }
}

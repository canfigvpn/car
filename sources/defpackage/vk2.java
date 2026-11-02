package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vk2 implements Comparable {
    public final long e;

    public /* synthetic */ vk2(long j) {
        this.e = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ws0.o(this.e ^ Long.MIN_VALUE, ((vk2) obj).e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vk2) {
            return this.e == ((vk2) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return j12.q(10, this.e);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qk2 implements Comparable {
    public final int e;

    public /* synthetic */ qk2(int i) {
        this.e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ws0.n(this.e ^ Integer.MIN_VALUE, ((qk2) obj).e ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qk2) {
            return this.e == ((qk2) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(((long) this.e) & 4294967295L);
    }
}

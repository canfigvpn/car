package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bl2 implements Comparable {
    public final short e;

    public /* synthetic */ bl2(short s) {
        this.e = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ws0.n(this.e & 65535, ((bl2) obj).e & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bl2) {
            return this.e == ((bl2) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 65535);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lk2 implements Comparable {
    public final byte e;

    public /* synthetic */ lk2(byte b) {
        this.e = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ws0.n(this.e & 255, ((lk2) obj).e & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lk2) {
            return this.e == ((lk2) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 255);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class hs0 {
    public static final gs0 Companion = new gs0();
    public final long a;

    public /* synthetic */ hs0(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            qx.Z(i, 1, fs0.a.c());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs0) && this.a == ((hs0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "IntervalsRoute(carId=" + this.a + ")";
    }

    public hs0(long j) {
        this.a = j;
    }
}

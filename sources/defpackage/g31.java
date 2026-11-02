package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof g31) {
            return this.a == ((g31) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Polite";
        }
        return i == 1 ? "Assertive" : "Unknown";
    }
}

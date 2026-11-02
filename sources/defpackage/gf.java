package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gf {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gf) {
            return this.a == ((gf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.a + ')';
    }
}

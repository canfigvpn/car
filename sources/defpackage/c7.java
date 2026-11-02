package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c7 implements an1 {
    public final int e;

    public c7(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7) && this.e == ((c7) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return k3.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.e, ')');
    }
}

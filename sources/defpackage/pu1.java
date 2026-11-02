package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pu1 {
    public final long a = dr.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        long j = ((pu1) obj).a;
        int i = dr.h;
        return vk2.a(this.a, j);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) dr.h(this.a)) + ", rippleAlpha=null)";
    }
}

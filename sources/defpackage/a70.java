package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a70) && w60.b(10.0f, 10.0f) && w60.b(40.0f, 40.0f) && w60.b(10.0f, 10.0f) && w60.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k3.a(40.0f, k3.a(10.0f, k3.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) w60.c(10.0f)) + ", top=" + ((Object) w60.c(40.0f)) + ", end=" + ((Object) w60.c(10.0f)) + ", bottom=" + ((Object) w60.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}

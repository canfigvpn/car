package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k8 implements un1 {
    public final int b;

    public k8(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((k8) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return k3.l(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}

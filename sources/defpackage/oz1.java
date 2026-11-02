package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 {
    public final float a;
    public final float b;

    public oz1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oz1)) {
            return false;
        }
        return w60.b(0.0f, 0.0f) && w60.b(0.0f, 0.0f) && w60.b(0.0f, 0.0f) && w60.b(this.a, ((oz1) obj).a) && w60.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + k3.a(this.a, k3.a(0.0f, k3.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}

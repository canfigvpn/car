package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public hd1(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hd1.class == obj.getClass()) {
            hd1 hd1Var = (hd1) obj;
            return this.c == hd1Var.c && this.d == hd1Var.d && this.b == hd1Var.b && this.a == hd1Var.a && this.e == hd1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + k3.b(this.a, k3.a(this.b, k3.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}

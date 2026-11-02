package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yf {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public yf(hd1 hd1Var) {
        hd1Var.getClass();
        float f = hd1Var.c;
        float f2 = hd1Var.d;
        float f3 = hd1Var.b;
        int i = hd1Var.a;
        long j = hd1Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}

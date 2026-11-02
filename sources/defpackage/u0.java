package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public Object a;
    public final Object b;

    public u0(vv vvVar) {
        this.a = new ag(0, this);
        this.b = new zf(this, vvVar);
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String c() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        ws0.U("text");
        throw null;
    }

    public boolean d() {
        return ((ag) this.a).b && ((zf) this.b).b;
    }

    public abstract void f();

    public abstract int[] i(int i);

    public u0() {
        this.b = new int[2];
    }

    public void e() {
    }

    public void h() {
    }

    public void g(yf yfVar) {
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 {
    public static int k;
    public static final w40 l = new w40(11);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final im2 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public jo0(String str, float f, float f2, float f3, float f4, im2 im2Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = im2Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo0)) {
            return false;
        }
        jo0 jo0Var = (jo0) obj;
        if (!ws0.j(this.a, jo0Var.a) || !w60.b(this.b, jo0Var.b) || !w60.b(this.c, jo0Var.c) || this.d != jo0Var.d || this.e != jo0Var.e || !this.f.equals(jo0Var.f)) {
            return false;
        }
        long j = jo0Var.g;
        int i = dr.h;
        return vk2.a(this.g, j) && this.h == jo0Var.h && this.i == jo0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + k3.a(this.e, k3.a(this.d, k3.a(this.c, k3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = dr.h;
        return Boolean.hashCode(this.i) + k3.b(this.h, k3.c(iHashCode, 31, this.g), 31);
    }
}

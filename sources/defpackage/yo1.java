package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public yo1(boolean z, wy1 wy1Var, boolean z2, int i) {
        a90 a90Var = s8.a;
        int i2 = !z ? 262152 : 262144;
        i2 = wy1Var == wy1.f ? i2 | 8192 : i2;
        this(z2 ? i2 : i2 | 512, wy1Var == wy1.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo1)) {
            return false;
        }
        yo1 yo1Var = (yo1) obj;
        return this.a == yo1Var.a && this.b == yo1Var.b && this.c == yo1Var.c && this.d == yo1Var.d && this.e == yo1Var.e && this.f == yo1Var.f;
    }

    public final int hashCode() {
        return (k3.f(k3.f(k3.f(k3.f(k3.f(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public yo1(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }

    public yo1(boolean z) {
        this(z, wy1.e, true, 0);
    }
}

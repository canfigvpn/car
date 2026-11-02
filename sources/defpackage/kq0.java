package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 {
    public static final kq0 e = new kq0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public kq0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static kq0 a(kq0 kq0Var, kq0 kq0Var2) {
        return b(Math.max(kq0Var.a, kq0Var2.a), Math.max(kq0Var.b, kq0Var2.b), Math.max(kq0Var.c, kq0Var2.c), Math.max(kq0Var.d, kq0Var2.d));
    }

    public static kq0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new kq0(i, i2, i3, i4);
    }

    public static kq0 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return cc.i(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kq0.class != obj.getClass()) {
            return false;
        }
        kq0 kq0Var = (kq0) obj;
        return this.d == kq0Var.d && this.a == kq0Var.a && this.c == kq0Var.c && this.b == kq0Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return k3.l(sb, this.d, '}');
    }
}

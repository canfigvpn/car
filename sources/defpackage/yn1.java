package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public yn1(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn1)) {
            return false;
        }
        yn1 yn1Var = (yn1) obj;
        return vv.j(this.a, yn1Var.a) && this.b == yn1Var.b && uf1.b(this.c, yn1Var.c) && uf1.b(this.d, yn1Var.d) && this.e == yn1Var.e && Float.compare(this.f, yn1Var.f) == 0 && this.g == yn1Var.g && this.h == yn1Var.h && this.i.equals(yn1Var.i) && uf1.b(this.j, yn1Var.j) && Float.compare(this.k, yn1Var.k) == 0 && uf1.b(this.l, yn1Var.l) && uf1.b(this.m, yn1Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + k3.c(k3.a(this.k, k3.c((this.i.hashCode() + k3.f(k3.b(this.g, k3.a(this.f, k3.f(k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) vv.Q(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) uf1.g(this.c)) + ", position=" + ((Object) uf1.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) co1.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) uf1.g(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) uf1.g(this.l)) + ", originalEventPosition=" + ((Object) uf1.g(this.m)) + ')';
    }
}

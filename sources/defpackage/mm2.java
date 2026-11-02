package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 extends km2 {
    public final String e;
    public final List f;
    public final int g;
    public final rk h;
    public final float i;
    public final rk j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;

    public mm2(String str, List list, int i, rk rkVar, float f, rk rkVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.e = str;
        this.f = list;
        this.g = i;
        this.h = rkVar;
        this.i = f;
        this.j = rkVar2;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mm2.class != obj.getClass()) {
            return false;
        }
        mm2 mm2Var = (mm2) obj;
        return this.e.equals(mm2Var.e) && ws0.j(this.h, mm2Var.h) && this.i == mm2Var.i && ws0.j(this.j, mm2Var.j) && this.k == mm2Var.k && this.l == mm2Var.l && this.m == mm2Var.m && this.n == mm2Var.n && this.o == mm2Var.o && this.p == mm2Var.p && this.q == mm2Var.q && this.r == mm2Var.r && this.g == mm2Var.g && ws0.j(this.f, mm2Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
        rk rkVar = this.h;
        int iA = k3.a(this.i, (iHashCode + (rkVar != null ? rkVar.hashCode() : 0)) * 31, 31);
        rk rkVar2 = this.j;
        return Integer.hashCode(this.g) + k3.a(this.r, k3.a(this.q, k3.a(this.p, k3.a(this.o, k3.b(this.n, k3.b(this.m, k3.a(this.l, k3.a(this.k, (iA + (rkVar2 != null ? rkVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 implements jz0 {
    public final ry0 a;
    public final yx0 b;
    public final h7 c;

    public zx0(ry0 ry0Var, yx0 yx0Var, h7 h7Var) {
        this.a = ry0Var;
        this.b = yx0Var;
        this.c = h7Var;
    }

    @Override // defpackage.jz0
    public final int a() {
        return this.b.w().f;
    }

    @Override // defpackage.jz0
    public final Object b(int i) {
        h7 h7Var = this.c;
        Object[] objArr = (Object[]) h7Var.h;
        int i2 = i - h7Var.f;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.x(i) : obj;
    }

    @Override // defpackage.jz0
    public final Object c(int i) {
        return this.b.u(i);
    }

    @Override // defpackage.jz0
    public final void d(int i, Object obj, ak0 ak0Var, int i2) {
        ak0Var.X(1493551140);
        int i3 = 2;
        int i4 = (ak0Var.d(i) ? 4 : 2) | i2 | (ak0Var.h(obj) ? 32 : 16) | (ak0Var.f(this) ? 256 : 128);
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            qx.d(obj, i, this.a.q, vs0.C(726189336, new f6(i, i3, this), ak0Var), ak0Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(this, i, obj, i2, 5);
        }
    }

    @Override // defpackage.jz0
    public final int e(Object obj) {
        return this.c.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx0)) {
            return false;
        }
        return ws0.j(this.b, ((zx0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

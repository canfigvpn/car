package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 implements jz0 {
    public final q01 a;
    public final f01 b;
    public final vy0 c;
    public final h7 d;

    public g01(q01 q01Var, f01 f01Var, vy0 vy0Var, h7 h7Var) {
        this.a = q01Var;
        this.b = f01Var;
        this.c = vy0Var;
        this.d = h7Var;
    }

    @Override // defpackage.jz0
    public final int a() {
        return this.b.w().f;
    }

    @Override // defpackage.jz0
    public final Object b(int i) {
        h7 h7Var = this.d;
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
        ak0Var.X(-462424778);
        int i3 = (ak0Var.d(i) ? 4 : 2) | i2 | (ak0Var.h(obj) ? 32 : 16) | (ak0Var.f(this) ? 256 : 128);
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            qx.d(obj, i, this.a.r, vs0.C(-824725566, new f6(i, 3, this), ak0Var), ak0Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(this, i, obj, i2, 7);
        }
    }

    @Override // defpackage.jz0
    public final int e(Object obj) {
        return this.d.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g01)) {
            return false;
        }
        return ws0.j(this.b, ((g01) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 implements ba2, y61 {
    public final /* synthetic */ ix0 e;
    public final /* synthetic */ ox0 f;

    public fx0(ox0 ox0Var) {
        this.f = ox0Var;
        this.e = ox0Var.l;
    }

    @Override // defpackage.ba2
    public final List F(ij0 ij0Var, Object obj) {
        ox0 ox0Var = this.f;
        ax0 ax0Var = ox0Var.e;
        w91 w91Var = ox0Var.k;
        ax0 ax0Var2 = (ax0) w91Var.g(obj);
        if (ax0Var2 != null && ((fa1) ((n91) ax0Var.o()).f).i(ax0Var2) < ox0Var.h) {
            return ax0Var2.m();
        }
        w91 w91Var2 = ox0Var.p;
        w91 w91Var3 = ox0Var.n;
        fa1 fa1Var = ox0Var.q;
        if (fa1Var.g < ox0Var.i) {
            vp0.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        ax0 ax0Var3 = (ax0) w91Var.g(obj);
        int i = fa1Var.g;
        int i2 = ox0Var.i;
        if (i == i2) {
            fa1Var.b(obj);
        } else {
            Object[] objArr = fa1Var.e;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        ox0Var.i++;
        boolean zB = w91Var3.b(obj);
        if (zB || ax0Var3 != null) {
            if (!zB && ax0Var3 != null) {
                ox0Var.j(((fa1) ((n91) ax0Var.o()).f).i(ax0Var3), ((fa1) ((n91) ax0Var.o()).f).g);
                ox0Var.s++;
                w91Var.k(obj);
                w91Var3.m(obj, ax0Var3);
                w91Var2.m(obj, ox0Var.e(obj));
                if (ax0Var.H()) {
                    ox0Var.h();
                }
            }
            ax0 ax0Var4 = (ax0) w91Var3.g(obj);
            gx0 gx0Var = ax0Var4 != null ? (gx0) ox0Var.j.g(ax0Var4) : null;
            if (gx0Var != null && gx0Var.d) {
                ox0Var.m(ax0Var4, obj, false, ij0Var);
            }
            if ((gx0Var != null ? gx0Var.f : null) != null) {
                ox0Var.c(gx0Var, true);
            }
        } else {
            ox0Var.k(obj, ij0Var, false);
            w91Var2.m(obj, ox0Var.e(obj));
        }
        ax0 ax0Var5 = (ax0) w91Var3.g(obj);
        if (ax0Var5 == null) {
            return cb0.e;
        }
        List listP0 = ax0Var5.J.p.p0();
        n91 n91Var = (n91) listP0;
        int i3 = ((fa1) n91Var.f).g;
        for (int i4 = 0; i4 < i3; i4++) {
            ((v61) n91Var.get(i4)).j.b = true;
        }
        return listP0;
    }

    @Override // defpackage.m40
    public final float H(long j) {
        return this.e.H(j);
    }

    @Override // defpackage.y61
    public final x61 N(int i, int i2, Map map, ej0 ej0Var, ej0 ej0Var2) {
        return this.e.N(i, i2, map, ej0Var, ej0Var2);
    }

    @Override // defpackage.m40
    public final int O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.m40
    public final long Y(long j) {
        return this.e.Y(j);
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e.f;
    }

    @Override // defpackage.m40
    public final float b0(long j) {
        return this.e.b0(j);
    }

    @Override // defpackage.y61
    public final x61 d0(int i, int i2, Map map, ej0 ej0Var) {
        return this.e.N(i, i2, map, null, ej0Var);
    }

    @Override // defpackage.os0
    public final kw0 getLayoutDirection() {
        return this.e.e;
    }

    @Override // defpackage.m40
    public final long j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.e.g;
    }

    @Override // defpackage.m40
    public final float n0(int i) {
        return this.e.n0(i);
    }

    @Override // defpackage.m40
    public final float q0(float f) {
        return f / this.e.b();
    }

    @Override // defpackage.os0
    public final boolean r() {
        return this.e.r();
    }

    @Override // defpackage.m40
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.m40
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.m40
    public final float x(float f) {
        return this.e.b() * f;
    }
}

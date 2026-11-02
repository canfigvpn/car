package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 extends tu {
    public final zx0 b;
    public final mz0 c;
    public final int d;
    public final /* synthetic */ mz0 e;
    public final /* synthetic */ ry0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(zx0 zx0Var, mz0 mz0Var, int i, ry0 ry0Var, int i2, int i3, long j) {
        super(1);
        this.e = mz0Var;
        this.f = ry0Var;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = zx0Var;
        this.c = mz0Var;
        this.d = i;
    }

    public final hy0 n(int i, int i2, int i3, int i4, long j) {
        int i5;
        zx0 zx0Var = this.b;
        Object objB = zx0Var.b(i);
        Object objU = zx0Var.b.u(i);
        List listG = g(this.c, i, j);
        if (sw.f(j)) {
            i5 = sw.j(j);
        } else {
            if (!sw.e(j)) {
                yp0.a("does not have fixed height");
            }
            i5 = sw.i(j);
        }
        kw0 layoutDirection = this.e.f.getLayoutDirection();
        gz0 gz0Var = this.f.m;
        return new hy0(i, objB, i5, i4, layoutDirection, this.g, this.h, listG, this.i, objU, gz0Var, j, i2, i3);
    }
}

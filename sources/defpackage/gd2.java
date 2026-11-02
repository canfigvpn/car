package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gd2 {
    public final yb a;
    public final vf2 b;
    public final boolean e;
    public final m40 g;
    public final jg0 h;
    public xf j;
    public kw0 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = cb0.e;

    public gd2(yb ybVar, vf2 vf2Var, boolean z, m40 m40Var, jg0 jg0Var) {
        this.a = ybVar;
        this.b = vf2Var;
        this.e = z;
        this.g = m40Var;
        this.h = jg0Var;
    }

    public final void a(kw0 kw0Var) {
        xf xfVar = this.j;
        if (xfVar == null || kw0Var != this.k || xfVar.b()) {
            this.k = kw0Var;
            xfVar = new xf(this.a, n02.p(this.b, kw0Var), this.i, this.g, this.h);
        }
        this.j = xfVar;
    }
}

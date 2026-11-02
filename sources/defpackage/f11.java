package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f11 {
    public final dk1 A;
    public final dk1 B;
    public gd2 a;
    public final lr1 b;
    public final l72 c;
    public final dq0 d;
    public cf2 e;
    public final dk1 f;
    public final dk1 g;
    public jw0 h;
    public final dk1 i;
    public yb j;
    public final dk1 k;
    public final dk1 l;
    public final dk1 m;
    public final dk1 n;
    public final dk1 o;
    public boolean p;
    public final dk1 q;
    public final ud r;
    public final dk1 s;
    public final dk1 t;
    public ej0 u;
    public final ey v;
    public final ey w;
    public final ey x;
    public final v7 y;
    public long z;

    public f11(gd2 gd2Var, lr1 lr1Var, l72 l72Var) {
        this.a = gd2Var;
        this.b = lr1Var;
        this.c = l72Var;
        dq0 dq0Var = new dq0(11, false);
        yb ybVar = zb.a;
        long j = of2.b;
        te2 te2Var = new te2(ybVar, j, (of2) null);
        dq0Var.f = te2Var;
        dq0Var.g = new s90(ybVar, te2Var.b);
        this.d = dq0Var;
        Boolean bool = Boolean.FALSE;
        this.f = y12.s(bool);
        this.g = y12.s(new w60(0.0f));
        this.i = y12.s(null);
        this.k = y12.s(sl0.e);
        this.l = y12.s(bool);
        this.m = y12.s(bool);
        this.n = y12.s(bool);
        this.o = y12.s(bool);
        this.p = true;
        this.q = y12.s(Boolean.TRUE);
        this.r = new ud(l72Var);
        this.s = y12.s(bool);
        this.t = y12.s(bool);
        this.u = new o01(1);
        this.v = new ey(this, 2);
        this.w = new ey(this, 3);
        this.x = new ey(this, 4);
        this.y = vs0.c();
        this.z = dr.g;
        this.A = y12.s(new of2(j));
        this.B = y12.s(new of2(j));
    }

    public final sl0 a() {
        return (sl0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final jw0 c() {
        jw0 jw0Var = this.h;
        if (jw0Var == null || !jw0Var.A()) {
            return null;
        }
        return jw0Var;
    }

    public final if2 d() {
        return (if2) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new of2(j));
    }

    public final void f(long j) {
        this.A.setValue(new of2(j));
    }
}

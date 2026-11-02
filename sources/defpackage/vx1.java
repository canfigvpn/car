package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 extends t71 implements sw0, m02 {
    public zx1 s;
    public boolean t;

    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return r61Var.e0(i);
    }

    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return r61Var.U(i);
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        ws0.l(j, this.t ? di1.e : di1.f);
        jm1 jm1VarE = r61Var.e(sw.a(j, 0, this.t ? sw.h(j) : Integer.MAX_VALUE, 0, this.t ? Integer.MAX_VALUE : sw.g(j), 5));
        int i = jm1VarE.e;
        int iH = sw.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = jm1VarE.f;
        int iG = sw.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = jm1VarE.f - i2;
        int i4 = jm1VarE.e - i;
        if (!this.t) {
            i3 = i4;
        }
        zx1 zx1Var = this.s;
        ak1 ak1Var = zx1Var.e;
        ak1 ak1Var2 = zx1Var.a;
        ak1Var.i(i3);
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            if (ak1Var2.h() > i3) {
                ak1Var2.i(i3);
            }
            c12.s(o62VarJ, o62VarP, ej0VarE);
            this.s.b.i(this.t ? i2 : i);
            this.s.c.i(this.t ? jm1VarE.f : jm1VarE.e);
            return y61Var.d0(i, i2, db0.e, new md(this, i3, jm1VarE, 2));
        } catch (Throwable th) {
            c12.s(o62VarJ, o62VarP, ej0VarE);
            throw th;
        }
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        w02.g(z02Var);
        final int i = 0;
        final int i2 = 1;
        nx1 nx1Var = new nx1(new ti0(this) { // from class: ux1
            public final /* synthetic */ vx1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int iH;
                int i3 = i;
                vx1 vx1Var = this.f;
                switch (i3) {
                    case 0:
                        iH = vx1Var.s.a.h();
                        break;
                    default:
                        iH = vx1Var.s.e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, new ti0(this) { // from class: ux1
            public final /* synthetic */ vx1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int iH;
                int i3 = i2;
                vx1 vx1Var = this.f;
                switch (i3) {
                    case 0:
                        iH = vx1Var.s.a.h();
                        break;
                    default:
                        iH = vx1Var.s.e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        });
        if (this.t) {
            y02 y02Var = u02.w;
            lv0 lv0Var = w02.a[13];
            z02Var.a(y02Var, nx1Var);
        } else {
            y02 y02Var2 = u02.v;
            lv0 lv0Var2 = w02.a[12];
            z02Var.a(y02Var2, nx1Var);
        }
    }

    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return r61Var.a0(i);
    }

    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return r61Var.f(i);
    }
}

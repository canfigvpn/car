package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jg extends t71 implements k80, lf1, m02 {
    public long s;
    public u32 t;
    public long u;
    public kw0 v;
    public mx w;
    public u32 x;
    public mx y;

    @Override // defpackage.lf1
    public final void I() {
        this.u = 9205357640488583168L;
        this.v = null;
        this.w = null;
        this.x = null;
        vv.B(this);
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        cx0 cx0Var2;
        mx mxVar;
        um umVar = cx0Var.e;
        if (this.t != vs0.C) {
            cx0Var2 = cx0Var;
            if (d52.a(umVar.d(), this.u) && cx0Var2.getLayoutDirection() == this.v && ws0.j(this.x, this.t)) {
                mxVar = this.w;
                mxVar.getClass();
            } else {
                ux.C(this, new n1(7, this, cx0Var2));
                mxVar = this.y;
                this.y = null;
            }
            this.w = mxVar;
            this.u = umVar.d();
            this.v = cx0Var2.getLayoutDirection();
            this.x = this.t;
            mxVar.getClass();
            if (!vk2.a(this.s, dr.g)) {
                qx.y(cx0Var2, mxVar, this.s);
            }
        } else if (vk2.a(this.s, dr.g)) {
            cx0Var2 = cx0Var;
        } else {
            cx0Var2 = cx0Var;
            l80.c0(cx0Var2, this.s, 0L, 0L, 126);
        }
        cx0Var2.a();
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        w02.f(z02Var, this.t);
    }

    @Override // defpackage.m02
    public final boolean i() {
        return false;
    }
}

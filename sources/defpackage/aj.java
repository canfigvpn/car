package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aj extends t71 implements sw0, m02 {
    public ej0 s;

    public aj(ej0 ej0Var) {
        this.s = ej0Var;
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        jm1 jm1VarE = r61Var.e(j);
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new i8(6, jm1VarE, this));
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        u32 u32Var;
        boolean z;
        me1 me1VarT = qx.T(this, 2);
        if (me1VarT.J) {
            u32Var = me1VarT.H;
            z = me1VarT.I;
        } else {
            bu1 bu1Var = nj2.m0;
            if (bu1Var == null) {
                nj2.m0 = new bu1();
            } else {
                bu1Var.a();
            }
            bu1 bu1Var2 = nj2.m0;
            bu1Var2.getClass();
            bu1Var2.r = me1VarT.s.B;
            bu1Var2.q = ux.M(me1VarT.g);
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                this.s.h(bu1Var2);
                c12.s(o62VarJ, o62VarP, ej0VarE);
                u32Var = bu1Var2.o;
                z = bu1Var2.p;
            } catch (Throwable th) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                throw th;
            }
        }
        if (z) {
            w02.f(z02Var, u32Var);
        }
    }

    @Override // defpackage.m02
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.s + ')';
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}

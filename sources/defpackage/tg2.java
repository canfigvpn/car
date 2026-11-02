package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tg2 extends t71 implements sw0 {
    public ur0 s;
    public boolean t;
    public g82 u;
    public boolean v;
    public ia w;
    public ia x;
    public float y;
    public float z;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        float f;
        float f2 = p61.b0;
        int i = 0;
        int i2 = 1;
        boolean z = (r61Var.f(sw.h(j)) == 0 || r61Var.a0(sw.g(j)) == 0) ? false : true;
        if (this.v) {
            f = p61.U;
        } else {
            f = (z || this.t) ? gb2.a : gb2.b;
        }
        float fX = y61Var.x(f);
        ia iaVar = this.x;
        int iFloatValue = (int) (iaVar != null ? ((Number) iaVar.d()).floatValue() : fX);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            xp0.a("width and height must be >= 0");
        }
        jm1 jm1VarE = r61Var.e(tw.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fX2 = y61Var.x((gb2.d - y61Var.q0(fX)) / 2.0f);
        float fX3 = y61Var.x((gb2.c - gb2.a) - gb2.e);
        boolean z2 = this.v;
        if (z2 && this.t) {
            fX2 = fX3 - y61Var.x(f2);
        } else if (z2 && !this.t) {
            fX2 = y61Var.x(f2);
        } else if (this.t) {
            fX2 = fX3;
        }
        ia iaVar2 = this.x;
        sx sxVar = null;
        Float f3 = iaVar2 != null ? (Float) iaVar2.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fX) {
            nj2.y(t0(), null, new sg2(this, fX, sxVar, i), 3);
        }
        ia iaVar3 = this.w;
        Float f4 = iaVar3 != null ? (Float) iaVar3.e.getValue() : null;
        if (f4 == null || f4.floatValue() != fX2) {
            nj2.y(t0(), null, new sg2(this, fX2, sxVar, i2), 3);
        }
        if (Float.isNaN(this.z) && Float.isNaN(this.y)) {
            this.z = fX;
            this.y = fX2;
        }
        return y61Var.d0(iFloatValue, iFloatValue, db0.e, new h6(jm1VarE, this, fX2));
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void x0() {
        nj2.y(t0(), null, new ln(16, (sx) null, this), 3);
    }
}

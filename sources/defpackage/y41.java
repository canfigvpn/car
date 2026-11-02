package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y41 extends im1 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ y41(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.im1
    public float a(rn0 rn0Var) {
        float fIntBitsToFloat;
        int iG0;
        switch (this.f) {
            case 0:
                ij0 ij0Var = rn0Var.a;
                if (ij0Var != null) {
                    return ((Number) ij0Var.g(this, Float.valueOf(Float.NaN))).floatValue();
                }
                x41 x41Var = (x41) this.g;
                if (x41Var.o) {
                    return Float.NaN;
                }
                x41 x41Var2 = x41Var;
                while (true) {
                    pc pcVar = x41Var2.q;
                    float f = (pcVar == null || (iG0 = ve.G0((rn0[]) pcVar.b, rn0Var)) < 0) ? Float.NaN : ((float[]) pcVar.c)[iG0];
                    if (!Float.isNaN(f)) {
                        x41Var2.p0(x41Var.z0(), rn0Var);
                        jw0 jw0VarX0 = x41Var2.x0();
                        jw0 jw0VarX1 = x41Var.x0();
                        switch (rn0Var.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jw0VarX1.t(jw0VarX0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (jw0VarX0.P() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jw0VarX1.t(jw0VarX0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (jw0VarX0.P() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    x41 x41VarB0 = x41Var2.B0();
                    if (x41VarB0 == null) {
                        x41Var2.p0(x41Var.z0(), rn0Var);
                        return Float.NaN;
                    }
                    x41Var2 = x41VarB0;
                }
                break;
            default:
                return super.a(rn0Var);
        }
    }

    @Override // defpackage.m40
    public final float b() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((x41) obj).b();
            default:
                return ((e5) obj).getDensity().b();
        }
    }

    @Override // defpackage.im1
    public final kw0 c() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((x41) obj).getLayoutDirection();
            default:
                return ((e5) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.im1
    public final int e() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((x41) obj).h0();
            default:
                return ((e5) obj).getRoot().J.p.e;
        }
    }

    @Override // defpackage.m40
    public final float l() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((x41) obj).l();
            default:
                return ((e5) obj).getDensity().l();
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t01 implements xz0 {
    public final /* synthetic */ ry0 a;

    public t01(ry0 ry0Var) {
        this.a = ry0Var;
    }

    @Override // defpackage.xz0
    public final int a() {
        ry0 ry0Var = this.a;
        return (int) (ry0Var.g().q == di1.e ? ry0Var.g().g() & 4294967295L : ry0Var.g().g() >> 32);
    }

    @Override // defpackage.xz0
    public final Object b(int i, m10 m10Var) {
        ru1 ru1Var = ry0.w;
        ry0 ry0Var = this.a;
        ry0Var.getClass();
        Object objD = ry0Var.d(ia1.e, new ln(ry0Var, i, (sx) null), m10Var);
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        if (objD != fzVar) {
            objD = ll2Var;
        }
        return objD == fzVar ? objD : ll2Var;
    }

    @Override // defpackage.xz0
    public final float c() {
        ry0 ry0Var = this.a;
        return (ry0Var.d.b.h() * 500) + ry0Var.d.c.h();
    }

    @Override // defpackage.xz0
    public final sq d() {
        return new sq(-1, -1);
    }

    @Override // defpackage.xz0
    public final int e() {
        ry0 ry0Var = this.a;
        return (-ry0Var.g().n) + ry0Var.g().r;
    }

    @Override // defpackage.xz0
    public final float f() {
        ry0 ry0Var = this.a;
        int iH = ry0Var.d.b.h();
        int iH2 = ry0Var.d.c.h();
        return ry0Var.c() ? (iH * 500) + iH2 + 100.0f : (iH * 500) + iH2;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nw extends ow {
    public final ju1 e;
    public final ju1 f;
    public final float[] g;

    public nw(ju1 ju1Var, ju1 ju1Var2) {
        float[] fArrC;
        super(ju1Var2, ju1Var, ju1Var2, null);
        this.e = ju1Var;
        this.f = ju1Var2;
        float[] fArr = z2.c.b;
        oo2 oo2Var = ju1Var.d;
        float[] fArr2 = ju1Var.i;
        oo2 oo2Var2 = ju1Var2.d;
        float[] fArr3 = ju1Var2.j;
        if (dv1.o(oo2Var, oo2Var2)) {
            fArrC = dv1.C(fArr3, fArr2);
        } else {
            float[] fArrA = oo2Var.a();
            float[] fArrA2 = oo2Var2.a();
            oo2 oo2Var3 = vs0.x;
            fArrC = dv1.C(dv1.o(oo2Var2, oo2Var3) ? fArr3 : dv1.y(dv1.C(dv1.l(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), ju1Var2.i)), dv1.o(oo2Var, oo2Var3) ? fArr2 : dv1.C(dv1.l(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrC;
    }

    @Override // defpackage.ow
    public final long a(long j) {
        float fG = dr.g(j);
        float f = dr.f(j);
        float fD = dr.d(j);
        float fC = dr.c(j);
        eu1 eu1Var = this.e.p;
        float fD2 = (float) eu1Var.d(fG);
        float fD3 = (float) eu1Var.d(f);
        float fD4 = (float) eu1Var.d(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fD4) + (fArr[3] * fD3) + (fArr[0] * fD2);
        float f3 = (fArr[7] * fD4) + (fArr[4] * fD3) + (fArr[1] * fD2);
        float f4 = (fArr[8] * fD4) + (fArr[5] * fD3) + (fArr[2] * fD2);
        ju1 ju1Var = this.f;
        eu1 eu1Var2 = ju1Var.m;
        return ws0.b((float) eu1Var2.d(f2), (float) eu1Var2.d(f3), (float) eu1Var2.d(f4), fC, ju1Var);
    }
}

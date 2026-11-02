package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ow {
    public final mr a;
    public final mr b;
    public final mr c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ow(mr mrVar, mr mrVar2, int i) {
        mr mrVarH = sv0.Z(mrVar.b, 12884901888L) ? dv1.h(mrVar) : mrVar;
        mr mrVarH2 = sv0.Z(mrVar2.b, 12884901888L) ? dv1.h(mrVar2) : mrVar2;
        float[] fArrA = vs0.A;
        float[] fArr = null;
        if (i == 3) {
            boolean Z = sv0.Z(mrVar.b, 12884901888L);
            boolean Z2 = sv0.Z(mrVar2.b, 12884901888L);
            if ((!Z || !Z2) && (Z || Z2)) {
                oo2 oo2Var = ((ju1) (Z ? mrVar : mrVar2)).d;
                float[] fArrA2 = Z ? oo2Var.a() : fArrA;
                fArrA = Z2 ? oo2Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(mrVar2, mrVarH, mrVarH2, fArr);
    }

    public long a(long j) {
        float fG = dr.g(j);
        float f = dr.f(j);
        float fD = dr.d(j);
        float fC = dr.c(j);
        mr mrVar = this.b;
        long jD = mrVar.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = mrVar.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public ow(mr mrVar, mr mrVar2, mr mrVar3, float[] fArr) {
        this.a = mrVar;
        this.b = mrVar2;
        this.c = mrVar3;
        this.d = fArr;
    }
}

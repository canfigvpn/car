package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k62 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ds1 g;
    public final /* synthetic */ xx1 h;
    public final /* synthetic */ ej0 i;

    public /* synthetic */ k62(float f, ds1 ds1Var, xx1 xx1Var, ej0 ej0Var, int i) {
        this.e = i;
        this.f = f;
        this.g = ds1Var;
        this.h = xx1Var;
        this.i = ej0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        float fA;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        ej0 ej0Var = this.i;
        xx1 xx1Var = this.h;
        ds1 ds1Var = this.g;
        float f = this.f;
        mb mbVar = (mb) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) mbVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                dk1 dk1Var = mbVar.e;
                if (fAbs < fAbs2) {
                    r02.e(mbVar, xx1Var, ej0Var, ((Number) dk1Var.getValue()).floatValue() - ds1Var.e);
                    ds1Var.e = ((Number) dk1Var.getValue()).floatValue();
                } else {
                    float fH = r02.h(((Number) dk1Var.getValue()).floatValue(), f);
                    r02.e(mbVar, xx1Var, ej0Var, fH - ds1Var.e);
                    mbVar.a();
                    ds1Var.e = fH;
                }
                break;
            default:
                float fH2 = r02.h(((Number) mbVar.e.getValue()).floatValue(), f);
                float f2 = fH2 - ds1Var.e;
                try {
                    fA = xx1Var.a(f2);
                } catch (CancellationException unused) {
                    mbVar.a();
                    fA = 0.0f;
                }
                ej0Var.h(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fH2 != ((Number) mbVar.e.getValue()).floatValue()) {
                    mbVar.a();
                }
                ds1Var.e += fA;
                break;
        }
        return ll2Var;
    }
}

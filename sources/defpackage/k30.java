package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k30 implements xx1 {
    public final /* synthetic */ l30 a;

    public k30(l30 l30Var) {
        this.a = l30Var;
    }

    @Override // defpackage.xx1
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        l30 l30Var = this.a;
        float fFloatValue = ((Number) l30Var.a.h(Float.valueOf(f))).floatValue();
        l30Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        l30Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

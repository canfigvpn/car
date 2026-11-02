package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l30 implements oy1 {
    public final ej0 a;
    public final k30 b = new k30(this);
    public final pa1 c = new pa1();
    public final dk1 d;
    public final dk1 e;
    public final dk1 f;

    public l30(ej0 ej0Var) {
        this.a = ej0Var;
        Boolean bool = Boolean.FALSE;
        this.d = y12.s(bool);
        this.e = y12.s(bool);
        this.f = y12.s(bool);
    }

    @Override // defpackage.oy1
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final Object d(ia1 ia1Var, ij0 ij0Var, tx txVar) {
        Object objW = qx.w(new g(this, ia1Var, ij0Var, null, 8), txVar);
        return objW == fz.e ? objW : ll2.a;
    }

    @Override // defpackage.oy1
    public final float e(float f) {
        return ((Number) this.a.h(Float.valueOf(f))).floatValue();
    }
}

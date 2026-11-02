package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 extends wp1 {
    public static final xd0 c = new xd0(ae0.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        wd0 wd0Var = (wd0) obj;
        wd0Var.getClass();
        float fK = jvVar.k(this.b, i);
        wd0Var.b(wd0Var.d() + 1);
        float[] fArr = wd0Var.a;
        int i2 = wd0Var.b;
        wd0Var.b = i2 + 1;
        fArr[i2] = fK;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        wd0 wd0Var = new wd0();
        wd0Var.a = fArr;
        wd0Var.b = fArr.length;
        wd0Var.b(10);
        return wd0Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new float[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        p61Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            p61Var.C(this.b, i2);
            p61Var.E(f);
        }
    }
}

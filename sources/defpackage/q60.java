package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q60 extends wp1 {
    public static final q60 c = new q60(t60.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        p60 p60Var = (p60) obj;
        p60Var.getClass();
        double dI = jvVar.i(this.b, i);
        p60Var.b(p60Var.d() + 1);
        double[] dArr = p60Var.a;
        int i2 = p60Var.b;
        p60Var.b = i2 + 1;
        dArr[i2] = dI;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        p60 p60Var = new p60();
        p60Var.a = dArr;
        p60Var.b = dArr.length;
        p60Var.b(10);
        return p60Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new double[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        p61Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            p61Var.C(this.b, i2);
            p61Var.B(d);
        }
    }
}

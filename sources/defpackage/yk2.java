package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yk2 extends wp1 {
    public static final yk2 c = new yk2(zk2.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        return ((wk2) obj).e.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        xk2 xk2Var = (xk2) obj;
        xk2Var.getClass();
        long jA = jvVar.b(this.b, i).a();
        xk2Var.b(xk2Var.d() + 1);
        long[] jArr = xk2Var.a;
        int i2 = xk2Var.b;
        xk2Var.b = i2 + 1;
        jArr[i2] = jA;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        long[] jArr = ((wk2) obj).e;
        xk2 xk2Var = new xk2();
        xk2Var.a = jArr;
        xk2Var.b = jArr.length;
        xk2Var.b(10);
        return xk2Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new wk2(new long[0]);
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        long[] jArr = ((wk2) obj).e;
        p61Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            p61Var.G(this.b, i2).J(jArr[i2]);
        }
    }
}

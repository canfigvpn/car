package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i41 extends wp1 {
    public static final i41 c = new i41(r41.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        h41 h41Var = (h41) obj;
        h41Var.getClass();
        long jZ = jvVar.z(this.b, i);
        h41Var.b(h41Var.d() + 1);
        long[] jArr = h41Var.a;
        int i2 = h41Var.b;
        h41Var.b = i2 + 1;
        jArr[i2] = jZ;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        h41 h41Var = new h41();
        h41Var.a = jArr;
        h41Var.b = jArr.length;
        h41Var.b(10);
        return h41Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new long[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        p61Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            p61Var.K(this.b, i2, jArr[i2]);
        }
    }
}

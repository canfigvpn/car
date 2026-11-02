package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends wp1 {
    public static final tk2 c = new tk2(uk2.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        return ((rk2) obj).e.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        sk2 sk2Var = (sk2) obj;
        sk2Var.getClass();
        int iN = jvVar.b(this.b, i).n();
        sk2Var.b(sk2Var.d() + 1);
        int[] iArr = sk2Var.a;
        int i2 = sk2Var.b;
        sk2Var.b = i2 + 1;
        iArr[i2] = iN;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        int[] iArr = ((rk2) obj).e;
        sk2 sk2Var = new sk2();
        sk2Var.a = iArr;
        sk2Var.b = iArr.length;
        sk2Var.b(10);
        return sk2Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new rk2(new int[0]);
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        int[] iArr = ((rk2) obj).e;
        p61Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            p61Var.G(this.b, i2).H(iArr[i2]);
        }
    }
}

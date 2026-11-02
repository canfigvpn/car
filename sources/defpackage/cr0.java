package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cr0 extends wp1 {
    public static final cr0 c = new cr0(or0.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        br0 br0Var = (br0) obj;
        br0Var.getClass();
        int iV = jvVar.v(this.b, i);
        br0Var.b(br0Var.d() + 1);
        int[] iArr = br0Var.a;
        int i2 = br0Var.b;
        br0Var.b = i2 + 1;
        iArr[i2] = iV;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        br0 br0Var = new br0();
        br0Var.a = iArr;
        br0Var.b = iArr.length;
        br0Var.b(10);
        return br0Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new int[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        p61Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            p61Var.I(i2, iArr[i2], this.b);
        }
    }
}

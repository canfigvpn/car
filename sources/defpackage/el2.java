package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class el2 extends wp1 {
    public static final el2 c = new el2(fl2.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        return ((cl2) obj).e.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        dl2 dl2Var = (dl2) obj;
        dl2Var.getClass();
        short sW = jvVar.b(this.b, i).w();
        dl2Var.b(dl2Var.d() + 1);
        short[] sArr = dl2Var.a;
        int i2 = dl2Var.b;
        dl2Var.b = i2 + 1;
        sArr[i2] = sW;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        short[] sArr = ((cl2) obj).e;
        dl2 dl2Var = new dl2();
        dl2Var.a = sArr;
        dl2Var.b = sArr.length;
        dl2Var.b(10);
        return dl2Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new cl2(new short[0]);
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        short[] sArr = ((cl2) obj).e;
        p61Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            p61Var.G(this.b, i2).P(sArr[i2]);
        }
    }
}

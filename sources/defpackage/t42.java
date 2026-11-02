package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t42 extends wp1 {
    public static final t42 c = new t42(u42.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        s42 s42Var = (s42) obj;
        s42Var.getClass();
        short sO = jvVar.o(this.b, i);
        s42Var.b(s42Var.d() + 1);
        short[] sArr = s42Var.a;
        int i2 = s42Var.b;
        s42Var.b = i2 + 1;
        sArr[i2] = sO;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        s42 s42Var = new s42();
        s42Var.a = sArr;
        s42Var.b = sArr.length;
        s42Var.b(10);
        return s42Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new short[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        p61Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            p61Var.C(this.b, i2);
            p61Var.P(s);
        }
    }
}

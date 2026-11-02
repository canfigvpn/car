package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ap extends wp1 {
    public static final ap c = new ap(dp.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        yo yoVar = (yo) obj;
        yoVar.getClass();
        char cJ = jvVar.j(this.b, i);
        yoVar.b(yoVar.d() + 1);
        char[] cArr = yoVar.a;
        int i2 = yoVar.b;
        yoVar.b = i2 + 1;
        cArr[i2] = cJ;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        yo yoVar = new yo();
        yoVar.a = cArr;
        yoVar.b = cArr.length;
        yoVar.b(10);
        return yoVar;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new char[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        p61Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            p61Var.C(this.b, i2);
            p61Var.A(c2);
        }
    }
}

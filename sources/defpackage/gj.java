package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gj extends wp1 {
    public static final gj c = new gj(hj.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        fj fjVar = (fj) obj;
        fjVar.getClass();
        boolean zR = jvVar.r(this.b, i);
        fjVar.b(fjVar.d() + 1);
        boolean[] zArr = fjVar.a;
        int i2 = fjVar.b;
        fjVar.b = i2 + 1;
        zArr[i2] = zR;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        fj fjVar = new fj();
        fjVar.a = zArr;
        fjVar.b = zArr.length;
        fjVar.b(10);
        return fjVar;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new boolean[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        p61Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            p61Var.C(this.b, i2);
            p61Var.y(z);
        }
    }
}

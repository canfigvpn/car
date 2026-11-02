package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 extends ex {
    public final h7 d = new h7();

    public f01(ej0 ej0Var) {
        ej0Var.h(this);
    }

    public static void U(f01 f01Var, String str, gt gtVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        f01Var.d.a(1, new e01(str != null ? new m(16, str) : null, new n30(27), new gt(new b8(2, gtVar), true, -857469575)));
    }

    public final void V(int i, ej0 ej0Var, ej0 ej0Var2, gt gtVar) {
        this.d.a(i, new e01(ej0Var, ej0Var2, gtVar));
    }

    @Override // defpackage.ex
    public final h7 w() {
        return this.d;
    }
}

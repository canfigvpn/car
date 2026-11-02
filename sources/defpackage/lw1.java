package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lw1 implements w11, AutoCloseable {
    public final String e;
    public final kw1 f;
    public boolean g;

    public lw1(String str, kw1 kw1Var) {
        this.e = str;
        this.f = kw1Var;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) {
        if (q11Var == q11.ON_DESTROY) {
            this.g = false;
            y11Var.h().f(this);
        }
    }

    public final void k(ru1 ru1Var, b21 b21Var) {
        ru1Var.getClass();
        b21Var.getClass();
        if (this.g) {
            fu1.h("Already attached to lifecycleOwner");
            return;
        }
        this.g = true;
        b21Var.a(this);
        ru1Var.o(this.e, (us) this.f.b.i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}

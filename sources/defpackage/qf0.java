package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 {
    public final vf0 a;
    public final e5 b;
    public final x91 c;
    public final x91 d;
    public boolean e;

    public qf0(vf0 vf0Var, e5 e5Var) {
        this.a = vf0Var;
        this.b = e5Var;
        x91 x91Var = kx1.a;
        this.c = new x91();
        this.d = new x91();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        t4 t4Var = new t4(0, this, qf0.class, "invalidateNodes", "invalidateNodes()V", 0, 3);
        p91 p91Var = this.b.C0;
        if (p91Var.g(t4Var) < 0) {
            p91Var.a(t4Var);
        }
        this.e = true;
    }
}

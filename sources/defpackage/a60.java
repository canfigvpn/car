package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a60 implements ss1 {
    public final ej0 e;
    public b60 f;

    public a60(ej0 ej0Var) {
        this.e = ej0Var;
    }

    @Override // defpackage.ss1
    public final void a() {
        this.f = (b60) this.e.h(s5.k);
    }

    @Override // defpackage.ss1
    public final void e() {
        b60 b60Var = this.f;
        if (b60Var != null) {
            b60Var.a();
        }
        this.f = null;
    }

    @Override // defpackage.ss1
    public final void c() {
    }
}

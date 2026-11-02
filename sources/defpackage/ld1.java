package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ld1 {
    public e4 a;
    public boolean b;

    public final void a() {
        e4 e4Var = this.a;
        if (e4Var == null) {
            fu1.h("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            e4Var.g(this, null);
        }
        md1 md1Var = (md1) e4Var.f;
        p2 p2Var = (p2) e4Var.e;
        if (equals(md1Var.h) && -1 == md1Var.g) {
            jd1 jd1VarC = md1Var.f;
            if (jd1VarC == null) {
                jd1VarC = md1Var.c(-1);
            }
            md1Var.f = null;
            md1Var.g = 0;
            md1Var.h = null;
            if (jd1VarC == null) {
                ((ig1) p2Var.e).a.run();
            } else {
                jd1VarC.b();
            }
            md1Var.a.j(null, nd1.e);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}

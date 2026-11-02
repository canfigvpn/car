package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements jg0 {
    public final b7 a;
    public final c7 b;
    public final ru1 c;
    public final qg0 d;
    public final qk1 e;
    public final m f;

    public lg0(b7 b7Var, c7 c7Var) {
        ru1 ru1Var = mg0.a;
        qg0 qg0Var = new qg0(mg0.b);
        qk1 qk1Var = new qk1(2);
        this.a = b7Var;
        this.b = c7Var;
        this.c = ru1Var;
        this.d = qg0Var;
        this.e = qk1Var;
        this.f = new m(11, this);
    }

    public final ek2 a(bk2 bk2Var) {
        ru1 ru1Var = this.c;
        d dVar = new d(16, this, bk2Var);
        synchronized (((iq1) ru1Var.b)) {
            ek2 ek2Var = (ek2) ((e51) ru1Var.c).a(bk2Var);
            if (ek2Var != null) {
                if (ek2Var.c()) {
                    return ek2Var;
                }
            }
            try {
                ek2 ek2Var2 = (ek2) dVar.h(new kc1(23, ru1Var, bk2Var));
                synchronized (((iq1) ru1Var.b)) {
                    if (((e51) ru1Var.c).a(bk2Var) == null && ek2Var2.c()) {
                        ((e51) ru1Var.c).b(bk2Var, ek2Var2);
                    }
                }
                return ek2Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final ek2 b(kg0 kg0Var, lh0 lh0Var, int i, int i2) {
        int i3 = this.b.e;
        return a(new bk2(kg0Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? lh0Var : new lh0(ex.h(lh0Var.e + i3, 1, 1000)), i, i2, null));
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 {
    public final Object a;
    public final qz0 b;
    public int d;
    public pz0 e;
    public boolean f;
    public int c = -1;
    public final dk1 g = y12.s(null);

    public pz0(Object obj, qz0 qz0Var) {
        this.a = obj;
        this.b = qz0Var;
    }

    public final pz0 a() {
        if (this.f) {
            yp0.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.e.add(this);
            pz0 pz0Var = (pz0) this.g.getValue();
            if (pz0Var != null) {
                pz0Var.a();
            } else {
                pz0Var = null;
            }
            this.e = pz0Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            yp0.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.e.remove(this);
            pz0 pz0Var = this.e;
            if (pz0Var != null) {
                pz0Var.b();
            }
            this.e = null;
        }
    }
}

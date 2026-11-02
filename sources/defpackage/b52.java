package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b52 extends tu {
    public Object b;
    public Object c;
    public x91 d;
    public x91 e;
    public k12 f;
    public final tr1 g;
    public final p2 h;

    public b52() {
        super(2);
        this.g = new tr1(8, this);
        x7 x7Var = new x7(29, this);
        x62.b(x62.a);
        synchronized (x62.c) {
            x62.h = vq.Z(x62.h, x7Var);
        }
        this.h = new p2(x7Var);
    }

    @Override // defpackage.tu
    public final void c(k12 k12Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.tu
    public final void d() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    x91 x91Var = this.d;
                    if (x91Var == null) {
                        x91 x91Var2 = kx1.a;
                        x91Var = new x91();
                        this.d = x91Var;
                    }
                    this.d = this.e;
                    this.e = x91Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tu
    public final void e() {
        this.h.a();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.tu
    public final ej0 j(k12 k12Var) {
        k12 k12Var2 = this.f;
        if (k12Var2 != null && !k12Var2.equals(k12Var)) {
            cp1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = k12Var;
        return this.g;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r51 implements xo1 {
    public final ao2 e;
    public qr0 f;
    public kw0 g;
    public qr0 h;
    public ir0 i;

    public r51(ao2 ao2Var) {
        this.e = ao2Var;
    }

    @Override // defpackage.xo1
    public final long a(mr0 mr0Var, long j, kw0 kw0Var, long j2) {
        ir0 ir0Var = this.i;
        if (ir0Var != null) {
            qr0 qr0Var = this.f;
            if ((qr0Var == null ? false : qr0.a(qr0Var.a, j)) && this.g == kw0Var) {
                qr0 qr0Var2 = this.h;
                if (qr0Var2 != null ? qr0.a(qr0Var2.a, j2) : false) {
                    return ir0Var.a;
                }
            }
        }
        long jA = this.e.a(mr0Var, j, kw0Var, j2);
        this.f = new qr0(j);
        this.g = kw0Var;
        this.h = new qr0(j2);
        this.i = new ir0(jA);
        return jA;
    }
}

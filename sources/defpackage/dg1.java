package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dg1 extends jd1 {
    public final ag d;
    public boolean e;

    public dg1(ag agVar, eg1 eg1Var) {
        boolean z = agVar.b;
        this.a = eg1Var;
        this.b = z;
        this.d = agVar;
        this.e = true;
    }

    @Override // defpackage.jd1
    public final void a() {
        ag agVar = this.d;
        switch (agVar.d) {
            case 0:
                ((u0) agVar.e).e();
                break;
        }
    }

    @Override // defpackage.jd1
    public final void b() {
        ag agVar = this.d;
        switch (agVar.d) {
            case 0:
                ((u0) agVar.e).f();
                break;
            case 1:
                ((ic1) agVar.e).b();
                break;
            default:
                ((j6) agVar.e).h(agVar);
                break;
        }
    }

    @Override // defpackage.jd1
    public final void c(hd1 hd1Var) {
        yf yfVar = new yf(hd1Var);
        ag agVar = this.d;
        switch (agVar.d) {
            case 0:
                ((u0) agVar.e).g(yfVar);
                break;
        }
    }

    @Override // defpackage.jd1
    public final void d(hd1 hd1Var) {
        hd1Var.getClass();
        new yf(hd1Var);
        ag agVar = this.d;
        switch (agVar.d) {
            case 0:
                ((u0) agVar.e).h();
                break;
        }
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class us1 extends t implements yy {
    public final /* synthetic */ ov f;
    public final /* synthetic */ vs1 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public us1(ov ovVar, vs1 vs1Var) {
        q90 q90Var = q90.B;
        this.f = ovVar;
        this.g = vs1Var;
        super(q90Var);
    }

    @Override // defpackage.yy
    public final void q(uy uyVar, Throwable th) throws Throwable {
        ov ovVar = this.f;
        vs1 vs1Var = this.g;
        p61.r0(th, new n1(11, ovVar, vs1Var));
        yy yyVar = (yy) vs1Var.e.p(q90.B);
        if (yyVar == null) {
            throw th;
        }
        yyVar.q(uyVar, th);
    }
}

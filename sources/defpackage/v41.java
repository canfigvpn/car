package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v41 extends dw0 implements ti0 {
    public final /* synthetic */ x41 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ lm1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(x41 x41Var, long j, long j2, lm1 lm1Var) {
        super(0);
        this.f = x41Var;
        this.g = j;
        this.h = j2;
        this.i = lm1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        x41 x41Var = this.f;
        x41Var.D0().e = false;
        x41Var.D0().f = this.g;
        x41Var.D0().g = this.h;
        ej0 ej0VarD = this.i.e.d();
        if (ej0VarD != null) {
            ej0VarD.h(x41Var.D0());
        }
        return ll2.a;
    }
}

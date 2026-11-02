package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends dw0 implements ej0 {
    public final /* synthetic */ uo1 f;
    public final /* synthetic */ ti0 g;
    public final /* synthetic */ yo1 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ kw0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(uo1 uo1Var, ti0 ti0Var, yo1 yo1Var, String str, kw0 kw0Var) {
        super(1);
        this.f = uo1Var;
        this.g = ti0Var;
        this.h = yo1Var;
        this.i = str;
        this.j = kw0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        uo1 uo1Var = this.f;
        uo1Var.t.addView(uo1Var, uo1Var.u);
        uo1Var.o(this.g, this.h, this.i, this.j);
        return new r2(2, uo1Var);
    }
}

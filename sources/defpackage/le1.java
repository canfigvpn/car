package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class le1 extends dw0 implements ti0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ me1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le1(me1 me1Var, int i) {
        super(0);
        this.f = i;
        this.g = me1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        me1 me1Var = this.g;
        switch (i) {
            case 0:
                sm smVar = me1Var.L;
                smVar.getClass();
                me1Var.M0(smVar, me1Var.K);
                break;
            default:
                me1 me1Var2 = me1Var.u;
                if (me1Var2 != null) {
                    me1Var2.Z0();
                }
                break;
        }
        return ll2Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends dw0 implements ij0 {
    public final /* synthetic */ aa2 f;
    public final /* synthetic */ u71 g;
    public final /* synthetic */ ij0 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(aa2 aa2Var, u71 u71Var, ij0 ij0Var, int i) {
        super(2);
        this.f = aa2Var;
        this.g = u71Var;
        this.h = ij0Var;
        this.i = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = ei1.P(this.i | 1);
        ws0.h(this.f, this.g, this.h, (ak0) obj, iP);
        return ll2.a;
    }
}

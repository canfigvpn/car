package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class eb extends dw0 implements ij0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ u71 g;
    public final /* synthetic */ sb0 h;
    public final /* synthetic */ kc0 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ gt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(boolean z, u71 u71Var, sb0 sb0Var, kc0 kc0Var, String str, gt gtVar, int i) {
        super(2);
        this.f = z;
        this.g = u71Var;
        this.h = sb0Var;
        this.i = kc0Var;
        this.j = str;
        this.k = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = ei1.P(1572871);
        dv1.b(this.f, this.g, this.h, this.i, this.j, this.k, (ak0) obj, iP);
        return ll2.a;
    }
}

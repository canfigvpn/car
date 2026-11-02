package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends dw0 implements ij0 {
    public final /* synthetic */ ti0 f;
    public final /* synthetic */ i50 g;
    public final /* synthetic */ gt h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(ti0 ti0Var, i50 i50Var, gt gtVar, int i, int i2) {
        super(2);
        this.f = ti0Var;
        this.g = i50Var;
        this.h = gtVar;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        p61.d(this.f, this.g, this.h, (ak0) obj, ei1.P(this.i | 1), this.j);
        return ll2.a;
    }
}

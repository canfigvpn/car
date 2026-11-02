package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f9 implements ij0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f9(u71 u71Var, ti0 ti0Var, boolean z, int i) {
        this.h = u71Var;
        this.i = ti0Var;
        this.f = z;
        this.g = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sv0.K((u71) obj4, (ti0) obj3, z, (ak0) obj, ei1.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                v12.b(z, (jt1) obj4, (me2) obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ f9(boolean z, jt1 jt1Var, me2 me2Var, int i) {
        this.f = z;
        this.h = jt1Var;
        this.i = me2Var;
        this.g = i;
    }
}

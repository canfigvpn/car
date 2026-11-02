package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld implements ij0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ qj0 j;

    public /* synthetic */ ld(int i, int i2, nt0 nt0Var, nt0 nt0Var2, ej0 ej0Var, int i3) {
        this.f = i;
        this.g = i2;
        this.h = nt0Var;
        this.i = nt0Var2;
        this.j = ej0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        qj0 qj0Var = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = ei1.P(27649);
                s5.m(this.f, this.g, (nt0) this.h, (nt0) obj3, (ej0) qj0Var, (ak0) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(this.g | 1);
                Object obj4 = this.h;
                int i2 = this.f;
                qx.d(obj4, i2, (qz0) obj3, (gt) qj0Var, (ak0) obj, iP2);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ ld(Object obj, int i, qz0 qz0Var, gt gtVar, int i2) {
        this.h = obj;
        this.f = i;
        this.i = qz0Var;
        this.j = gtVar;
        this.g = i2;
    }
}

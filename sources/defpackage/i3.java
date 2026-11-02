package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ i3(gt gtVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = 2;
        this.f = gtVar;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.g = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.j;
        Object obj5 = this.h;
        ll2 ll2Var = ll2.a;
        int i2 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r3.d((ti0) obj5, (u71) obj3, (i50) obj4, (gt) obj6, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nj2.a((xo1) obj5, (gt) obj6, (mh2) obj3, (gt) obj4, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP = ei1.P(i2) | 1;
                ((gt) obj6).m(this.h, this.i, this.j, (ak0) obj, iP);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(i2 | 1);
                mx.h((Boolean) obj5, this.i, (y11) obj4, (ej0) obj6, (ak0) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                o61.a((jr) obj5, (g81) obj3, (i42) obj4, (gk2) obj6, (ak0) obj, ei1.P(i2 | 1));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ i3(xo1 xo1Var, gt gtVar, mh2 mh2Var, gt gtVar2, int i) {
        this.e = 1;
        this.h = xo1Var;
        this.f = gtVar;
        this.i = mh2Var;
        this.j = gtVar2;
        this.g = i;
    }

    public /* synthetic */ i3(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.e = i2;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.f = obj4;
        this.g = i;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn0 implements ij0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ej0 g;
    public final /* synthetic */ ej0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ cn0(ti0 ti0Var, wm wmVar, da1 da1Var, ej0 ej0Var, ej0 ej0Var2, da1 da1Var2) {
        this.f = ti0Var;
        this.i = wmVar;
        this.j = da1Var;
        this.g = ej0Var;
        this.h = ej0Var2;
        this.k = da1Var2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ti0 ti0Var = (ti0) obj6;
                wm wmVar = (wm) obj5;
                da1 da1Var = (da1) obj4;
                da1 da1Var2 = (da1) obj3;
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ak0Var.O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    nc.b(vs0.C(954842928, new pd(7, ti0Var), ak0Var), null, null, vs0.C(71935323, new en0(wmVar, da1Var, this.g, this.h, da1Var2), ak0Var), 0.0f, null, null, ak0Var, 3078, 246);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                gn0.c((ti0) obj6, this.g, (ij0) obj5, this.h, (ti0) obj4, (ln0) obj3, (ak0) obj, ei1.P(1));
                break;
            default:
                ((Integer) obj2).getClass();
                s5.t((j11) obj6, this.g, this.h, (ej0) obj5, (ej0) obj4, (u71) obj3, (ak0) obj, ei1.P(1));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ cn0(ti0 ti0Var, ej0 ej0Var, ij0 ij0Var, ej0 ej0Var2, ti0 ti0Var2, ln0 ln0Var, int i) {
        this.f = ti0Var;
        this.g = ej0Var;
        this.i = ij0Var;
        this.h = ej0Var2;
        this.j = ti0Var2;
        this.k = ln0Var;
    }

    public /* synthetic */ cn0(j11 j11Var, ej0 ej0Var, ej0 ej0Var2, ej0 ej0Var3, ej0 ej0Var4, u71 u71Var, int i) {
        this.f = j11Var;
        this.g = ej0Var;
        this.h = ej0Var2;
        this.i = ej0Var3;
        this.j = ej0Var4;
        this.k = u71Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f6 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f6(u71 u71Var, int i, int i2) {
        this.e = 0;
        this.g = u71Var;
        this.f = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i6.b((u71) obj3, (ak0) obj, ei1.P(1), i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ix.c((ti0) obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 2:
                zx0 zx0Var = (zx0) obj3;
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    ds0 ds0VarB = zx0Var.b.e.b(i2);
                    ((xx0) ds0VarB.c).c.l(by0.a, Integer.valueOf(i2 - ds0VarB.a), ak0Var, 6);
                }
                break;
            default:
                g01 g01Var = (g01) obj3;
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    ds0 ds0VarB2 = g01Var.b.d.b(i2);
                    ((e01) ds0VarB2.c).c.l(g01Var.c, Integer.valueOf(i2 - ds0VarB2.a), ak0Var2, 0);
                }
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ f6(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }
}

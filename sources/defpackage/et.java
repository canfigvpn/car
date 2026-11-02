package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ et(u52 u52Var, u71 u71Var, int i) {
        this.e = 8;
        gt gtVar = zt.a;
        this.g = u52Var;
        this.h = u71Var;
        this.f = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((gt) obj4).f(obj3, (ak0) obj, ei1.P(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).intValue();
                sv.a((vq1) obj4, (ij0) obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                sv.b((vq1[]) obj4, (ij0) obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                e20.l((l00) obj4, (bm) obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 4:
                ej0 ej0Var = (ej0) obj4;
                da1 da1Var = (da1) obj3;
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    boolean zF = ak0Var.f(ej0Var) | ak0Var.d(i2);
                    Object objL = ak0Var.L();
                    if (zF || objL == cv.a) {
                        objL = new vb0(i2, ej0Var, da1Var);
                        ak0Var.g0(objL);
                    }
                    j20.h((ti0) objL, null, false, null, null, null, p61.o, ak0Var, 805306368, 510);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((zx0) obj4).d(i2, obj3, (ak0) obj, ei1.P(1));
                break;
            case 6:
                jz0 jz0Var = (jz0) obj4;
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ak0Var2.O(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    jz0Var.d(i2, obj3, ak0Var2, 0);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((g01) obj4).d(i2, obj3, (ak0) obj, ei1.P(1));
                break;
            case 8:
                gt gtVar = zt.a;
                ((Integer) obj2).getClass();
                j02.a((u52) obj4, (u71) obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ef2.a((vf2) obj3, (gt) obj4, (ak0) obj, ei1.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((ki2) obj4).a(obj3, (ak0) obj, ei1.P(i2 | 1));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ et(jz0 jz0Var, int i, Object obj, int i2, int i3) {
        this.e = i3;
        this.g = jz0Var;
        this.f = i;
        this.h = obj;
    }

    public /* synthetic */ et(vf2 vf2Var, gt gtVar, int i) {
        this.e = 9;
        this.h = vf2Var;
        this.g = gtVar;
        this.f = i;
    }

    public /* synthetic */ et(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }

    public /* synthetic */ et(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.f = i;
    }
}

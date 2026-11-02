package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends dw0 implements ij0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Object obj) {
        super(2);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        r71 r71Var = r71.a;
        boolean z = false;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((r) obj3).b(0, ak0Var);
                } else {
                    ak0Var.R();
                }
                return ll2Var;
            case 1:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objL = ak0Var2.L();
                    if (objL == cv.a) {
                        objL = x4.k;
                        ak0Var2.g0(objL);
                    }
                    p61.e(l02.a(r71Var, false, (ej0) objL), (ij0) ((da1) obj3).getValue(), ak0Var2, 0);
                } else {
                    ak0Var2.R();
                }
                return ll2Var;
            case 2:
                hb0 hb0Var = (hb0) obj;
                hb0 hb0Var2 = (hb0) obj2;
                hb0 hb0Var3 = hb0.g;
                if (hb0Var == hb0Var3 && hb0Var2 == hb0Var3 && !((kc0) obj3).a.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ((Number) obj2).intValue();
                ((xu) obj3).b(ei1.P(1), (ak0) obj);
                return ll2Var;
            case 4:
                u71 u71Var = (u71) obj;
                u71 u71VarA = (s71) obj2;
                ak0 ak0Var3 = (ak0) obj3;
                if (u71VarA instanceof bv) {
                    jj0 jj0Var = ((bv) u71VarA).a;
                    nj2.i(3, jj0Var);
                    u71VarA = nj2.A(ak0Var3, (u71) jj0Var.d(r71Var, ak0Var3, 0));
                }
                return u71Var.c(u71VarA);
            case 5:
                ((Number) obj2).intValue();
                ((f50) obj3).b(ei1.P(1), (ak0) obj);
                return ll2Var;
            case 6:
                ak0 ak0Var4 = (ak0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ij0 ij0Var = (ij0) list.get(i2);
                        int iHashCode = Long.hashCode(ak0Var4.T);
                        wu.c.getClass();
                        t5 t5Var = vu.c;
                        ak0Var4.Z();
                        if (ak0Var4.S) {
                            ak0Var4.k(t5Var);
                        } else {
                            ak0Var4.j0();
                        }
                        p12.l(vu.g, ak0Var4, Integer.valueOf(iHashCode));
                        ij0Var.g(ak0Var4, 0);
                        ak0Var4.p(true);
                    }
                } else {
                    ak0Var4.R();
                }
                return ll2Var;
            default:
                ((Number) obj2).intValue();
                ((uo1) obj3).b(ei1.P(1), (ak0) obj);
                return ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = rVar;
    }
}

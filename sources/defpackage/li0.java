package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 implements kj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ p82 h;

    public /* synthetic */ li0(List list, Object obj, p82 p82Var, int i) {
        this.e = i;
        this.f = list;
        this.g = obj;
        this.h = p82Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        is1 is1Var = cv.a;
        p82 p82Var = this.h;
        List list = this.f;
        Object obj5 = this.g;
        int i2 = 4;
        switch (i) {
            case 0:
                vy0 vy0Var = (vy0) obj;
                int iIntValue = ((Number) obj2).intValue();
                ak0 ak0Var = (ak0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ij0 ij0Var = (ij0) obj5;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (ak0Var.f(vy0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= ak0Var.d(iIntValue) ? 32 : 16;
                }
                if (!ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
                    ak0Var.R();
                } else {
                    di0 di0Var = (di0) list.get(iIntValue);
                    ak0Var.W(1001740496);
                    boolean zF = ak0Var.f(ij0Var) | ak0Var.f(p82Var) | ak0Var.f(di0Var);
                    Object objL = ak0Var.L();
                    if (zF || objL == is1Var) {
                        objL = new ki0(ij0Var, di0Var, p82Var, 0);
                        ak0Var.g0(objL);
                    }
                    p61.f(di0Var, (ti0) objL, ak0Var, 0);
                    ak0Var.p(false);
                }
                break;
            case 1:
                vy0 vy0Var2 = (vy0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ak0 ak0Var2 = (ak0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ij0 ij0Var2 = (ij0) obj5;
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (ak0Var2.f(vy0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= ak0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!ak0Var2.O(i4 & 1, (i4 & 147) != 146)) {
                    ak0Var2.R();
                } else {
                    lm0 lm0Var = (lm0) list.get(iIntValue3);
                    ak0Var2.W(421426348);
                    boolean zF2 = ak0Var2.f(ij0Var2) | ak0Var2.f(p82Var) | ak0Var2.f(lm0Var);
                    Object objL2 = ak0Var2.L();
                    if (zF2 || objL2 == is1Var) {
                        objL2 = new ki0(ij0Var2, lm0Var, p82Var, 1);
                        ak0Var2.g0(objL2);
                    }
                    s5.i(lm0Var, (ti0) objL2, ak0Var2, 0);
                    ak0Var2.p(false);
                }
                break;
            default:
                vy0 vy0Var3 = (vy0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ak0 ak0Var3 = (ak0) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                rm0 rm0Var = (rm0) obj5;
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (ak0Var3.f(vy0Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= ak0Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!ak0Var3.O(i5 & 1, (i5 & 147) != 146)) {
                    ak0Var3.R();
                } else {
                    u22 u22Var = (u22) list.get(iIntValue5);
                    ak0Var3.W(2121719274);
                    boolean z = ((om0) p82Var.getValue()).d == u22Var.a;
                    boolean zH = ak0Var3.h(rm0Var) | ak0Var3.f(u22Var);
                    Object objL3 = ak0Var3.L();
                    if (zH || objL3 == is1Var) {
                        objL3 = new nm0(rm0Var, u22Var);
                        ak0Var3.g0(objL3);
                    }
                    sp.b(z, (ti0) objL3, vs0.C(-374344916, new h30(i2, u22Var), ak0Var3), null, false, null, null, null, null, ak0Var3, 384);
                    ak0Var3.p(false);
                }
                break;
        }
        return ll2Var;
    }
}

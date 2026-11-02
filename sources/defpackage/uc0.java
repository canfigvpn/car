package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc0 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ uc0(de2 de2Var, boolean z, f91 f91Var) {
        this.e = 2;
        this.g = de2Var;
        this.f = z;
        this.h = f91Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        is1 is1Var = cv.a;
        final int i2 = 0;
        boolean z = true;
        Object obj4 = this.h;
        boolean z2 = this.f;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                y61 y61Var = (y61) obj;
                r61 r61Var = (r61) obj2;
                sw swVar = (sw) obj3;
                int iG = tw.g(((ak1) obj5).h(), swVar.a);
                long j = swVar.a;
                int iF = tw.f(((ak1) obj4).h(), j);
                int iJ = z2 ? iG : sw.j(j);
                if (!z2) {
                    iG = sw.h(j);
                }
                jm1 jm1VarE = r61Var.e(sw.a(swVar.a, iJ, iG, 0, iF, 4));
                return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 2));
            case 1:
                qh2 qh2Var = (qh2) obj5;
                ic1 ic1Var = (ic1) obj4;
                tv1 tv1Var = (tv1) obj;
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tv1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ak0Var.f(tv1Var) ? 4 : 2;
                }
                int i3 = iIntValue;
                if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
                    yb0 yb0Var = qh2.m;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : yb0Var) {
                        qh2 qh2Var2 = (qh2) obj6;
                        if (z2 || !qh2Var2.i) {
                            arrayList.add(obj6);
                        }
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        int i5 = i4 + 1;
                        final qh2 qh2Var3 = (qh2) arrayList.get(i4);
                        boolean z3 = qh2Var3 == qh2Var;
                        boolean zH = ak0Var.h(ic1Var) | ak0Var.d(qh2Var3.ordinal());
                        Object objL = ak0Var.L();
                        if (zH || objL == is1Var) {
                            objL = new n1(26, qh2Var3, ic1Var);
                            ak0Var.g0(objL);
                        }
                        gt gtVarC = vs0.C(1714792135, new ij0() { // from class: bb1
                            @Override // defpackage.ij0
                            public final Object g(Object obj7, Object obj8) {
                                int i6 = i2;
                                ll2 ll2Var = ll2.a;
                                qh2 qh2Var4 = qh2Var3;
                                switch (i6) {
                                    case 0:
                                        ak0 ak0Var2 = (ak0) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            ak0Var2.R();
                                        } else {
                                            fo0.b(vv.K(qh2Var4.g, ak0Var2), null, null, 0L, ak0Var2, 56, 12);
                                        }
                                        break;
                                    default:
                                        ak0 ak0Var3 = (ak0) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        if (!ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            ak0Var3.R();
                                        } else {
                                            ef2.b(j02.r(qh2Var4.h, ak0Var3), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var3, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return ll2Var;
                            }
                        }, ak0Var);
                        final boolean z4 = z ? 1 : 0;
                        ak0 ak0Var2 = ak0Var;
                        fd1.b(tv1Var, z3, (ti0) objL, gtVarC, null, false, vs0.C(-1976449270, new ij0() { // from class: bb1
                            @Override // defpackage.ij0
                            public final Object g(Object obj7, Object obj8) {
                                int i6 = z4;
                                ll2 ll2Var = ll2.a;
                                qh2 qh2Var4 = qh2Var3;
                                switch (i6) {
                                    case 0:
                                        ak0 ak0Var3 = (ak0) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        if (!ak0Var3.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            ak0Var3.R();
                                        } else {
                                            fo0.b(vv.K(qh2Var4.g, ak0Var3), null, null, 0L, ak0Var3, 56, 12);
                                        }
                                        break;
                                    default:
                                        ak0 ak0Var4 = (ak0) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        if (!ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            ak0Var4.R();
                                        } else {
                                            ef2.b(j02.r(qh2Var4.h, ak0Var4), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var4, 0, 0, 262142);
                                        }
                                        break;
                                }
                                return ll2Var;
                            }
                        }, ak0Var), false, null, ak0Var2, (i3 & 14) | 1575936);
                        arrayList = arrayList;
                        ak0Var = ak0Var2;
                        i4 = i5;
                    }
                } else {
                    ak0Var.R();
                }
                return ll2.a;
            default:
                de2 de2Var = (de2) obj5;
                dk1 dk1Var = de2Var.f;
                f91 f91Var = (f91) obj4;
                ak0 ak0Var3 = (ak0) obj2;
                ((Integer) obj3).getClass();
                ak0Var3.W(-2137546592);
                boolean z5 = ((di1) dk1Var.getValue()) == di1.e || !(ak0Var3.j(yv.n) == kw0.f);
                boolean zF = ak0Var3.f(de2Var);
                Object objL2 = ak0Var3.L();
                Object obj7 = objL2;
                if (zF || objL2 == is1Var) {
                    tr1 tr1Var = new tr1(15, de2Var);
                    ak0Var3.g0(tr1Var);
                    obj7 = tr1Var;
                }
                da1 da1VarT = y12.t((ej0) obj7, ak0Var3);
                Object objL3 = ak0Var3.L();
                if (objL3 == is1Var) {
                    l30 l30Var = new l30(new s9(da1VarT, 8));
                    ak0Var3.g0(l30Var);
                    objL3 = l30Var;
                }
                oy1 oy1Var = (oy1) objL3;
                boolean zF2 = ak0Var3.f(oy1Var) | ak0Var3.f(de2Var);
                Object objL4 = ak0Var3.L();
                Object obj8 = objL4;
                if (zF2 || objL4 == is1Var) {
                    ce2 ce2Var = new ce2(oy1Var, de2Var);
                    ak0Var3.g0(ce2Var);
                    obj8 = ce2Var;
                }
                u71 u71VarA = hy1.a((ce2) obj8, (di1) dk1Var.getValue(), z2 && de2Var.b.h() != 0.0f, z5, f91Var);
                ak0Var3.p(false);
                return u71VarA;
        }
    }

    public /* synthetic */ uc0(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
        this.h = obj2;
    }
}

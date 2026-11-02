package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gn(d41 d41Var, ej0 ej0Var, da1 da1Var) {
        this.e = 5;
        this.f = d41Var;
        this.h = ej0Var;
        this.g = da1Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        ak0 ak0Var;
        boolean z;
        boolean z2;
        String strS;
        Double dC;
        boolean z3;
        String strS2;
        String str;
        boolean z4;
        boolean z5;
        gt gtVarC;
        Object obj4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object obj5;
        int i = this.e;
        int i2 = 9;
        int i3 = 18;
        int i4 = 16;
        ll2 ll2Var = ll2.a;
        is1 is1Var = cv.a;
        Object obj6 = this.g;
        Object obj7 = this.h;
        Object obj8 = this.f;
        int i5 = 0;
        switch (i) {
            case 0:
                ni0 ni0Var = (ni0) obj8;
                da1 da1Var = (da1) obj6;
                ej0 ej0Var = (ej0) obj7;
                vc0 vc0Var = (vc0) obj;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vc0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ak0Var2.f(vc0Var) : ak0Var2.h(vc0Var) ? 4 : 2;
                }
                if (ak0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String strC = f22.c(ni0Var, ak0Var2);
                    u71 u71VarB = vc0.b(vc0Var, f52.a);
                    Object objL = ak0Var2.L();
                    if (objL == is1Var) {
                        objL = new s1(16);
                        ak0Var2.g0(objL);
                    }
                    ux.f(strC, (ej0) objL, u71VarB, false, true, null, ir2.r, null, vs0.C(-2043875973, new p7(da1Var, 2), ak0Var2), null, false, null, null, null, false, 0, 0, null, null, null, ak0Var2, 806903856, 0, 0, 8388008);
                    boolean zBooleanValue = ((Boolean) da1Var.getValue()).booleanValue();
                    Object objL2 = ak0Var2.L();
                    if (objL2 == is1Var) {
                        objL2 = new r9(da1Var, 3);
                        ak0Var2.g0(objL2);
                    }
                    vc0Var.a(zBooleanValue, (ti0) objL2, null, null, false, null, 0L, 0.0f, vs0.C(-902788158, new hn(0, ej0Var, da1Var), ak0Var2), ak0Var2, 48, 6 | ((iIntValue << 3) & 112));
                } else {
                    ak0Var2.R();
                }
                break;
            case 1:
                p82 p82Var = (p82) obj8;
                rm0 rm0Var = (rm0) obj6;
                ij0 ij0Var = (ij0) obj7;
                gj1 gj1Var = (gj1) obj;
                ak0 ak0Var3 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gj1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ak0Var3.f(gj1Var) ? 4 : 2;
                }
                if (ak0Var3.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    u71 u71VarB0 = p61.b0(f52.c, gj1Var);
                    wr wrVarA = ur.a(ws0.g, q90.r, ak0Var3, 0);
                    int iHashCode = Long.hashCode(ak0Var3.T);
                    sl1 sl1VarL = ak0Var3.l();
                    u71 u71VarB2 = nj2.B(ak0Var3, u71VarB0);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var3.Z();
                    if (ak0Var3.S) {
                        ak0Var3.k(wvVar);
                    } else {
                        ak0Var3.j0();
                    }
                    p12.l(vu.f, ak0Var3, wrVarA);
                    p12.l(vu.e, ak0Var3, sl1VarL);
                    p12.f(ak0Var3, Integer.valueOf(iHashCode), vu.g);
                    p12.k(ak0Var3, vu.h);
                    p12.l(vu.d, ak0Var3, u71VarB2);
                    if (((om0) p82Var.getValue()).c.isEmpty()) {
                        ak0Var = ak0Var3;
                        z = false;
                        ak0Var.W(-224663438);
                    } else {
                        ak0Var3.W(-221900625);
                        kj1 kj1Var = new kj1(16.0f, 8.0f, 16.0f, 8.0f);
                        he heVar = new he(8.0f, new ut(1));
                        boolean zF = ak0Var3.f(p82Var) | ak0Var3.h(rm0Var);
                        Object objL3 = ak0Var3.L();
                        if (zF || objL3 == is1Var) {
                            objL3 = new d(i3, rm0Var, p82Var);
                            ak0Var3.g0(objL3);
                        }
                        mx.g(null, null, kj1Var, heVar, null, null, false, null, (ej0) objL3, ak0Var3, 24960, 491);
                        ak0Var = ak0Var3;
                        z = false;
                    }
                    ak0Var.p(z);
                    if (((om0) p82Var.getValue()).e || !((om0) p82Var.getValue()).b.isEmpty()) {
                        ak0Var.W(-220660067);
                        kj1 kj1Var2 = new kj1(16.0f, 16.0f, 16.0f, 16.0f);
                        he heVar2 = new he(12.0f, new ut(1));
                        boolean zF2 = ak0Var.f(p82Var) | ak0Var.f(ij0Var);
                        Object objL4 = ak0Var.L();
                        if (zF2 || objL4 == is1Var) {
                            objL4 = new hi0(p82Var, ij0Var, 1);
                            ak0Var.g0(objL4);
                        }
                        mx.e(null, null, kj1Var2, heVar2, null, null, false, null, (ej0) objL4, ak0Var, 24960, 491);
                        ak0Var.p(false);
                    } else {
                        ak0Var.W(-220905463);
                        dv1.f("📋", j02.r(R.string.history_empty, ak0Var), j02.r(R.string.detail_no_records, ak0Var), null, null, null, ak0Var, 6, 56);
                        ak0Var.p(false);
                    }
                    ak0Var.p(true);
                } else {
                    ak0Var3.R();
                }
                break;
            case 2:
                ul2 ul2Var = (ul2) obj8;
                u22 u22Var = ul2Var.a;
                z82 z82Var = (z82) obj6;
                String str2 = (String) obj7;
                ak0 ak0Var4 = (ak0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    u71 u71VarC0 = p61.c0(f52.c, 12.0f);
                    wr wrVarA2 = ur.a(new he(6.0f, new ut(1)), q90.r, ak0Var4, 6);
                    int iHashCode2 = Long.hashCode(ak0Var4.T);
                    sl1 sl1VarL2 = ak0Var4.l();
                    u71 u71VarB3 = nj2.B(ak0Var4, u71VarC0);
                    wu.c.getClass();
                    wv wvVar2 = vu.b;
                    ak0Var4.Z();
                    if (ak0Var4.S) {
                        ak0Var4.k(wvVar2);
                    } else {
                        ak0Var4.j0();
                    }
                    p12.l(vu.f, ak0Var4, wrVarA2);
                    p12.l(vu.e, ak0Var4, sl1VarL2);
                    p12.f(ak0Var4, Integer.valueOf(iHashCode2), vu.g);
                    p12.k(ak0Var4, vu.h);
                    p12.l(vu.d, ak0Var4, u71VarB3);
                    String str3 = u22Var.d;
                    a90 a90Var = ik2.a;
                    ef2.b(str3, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var4.j(a90Var)).g, ak0Var4, 0, 0, 131070);
                    ef2.b(f22.d(u22Var, ak0Var4), null, 0L, 0L, 0L, null, 0L, 2, false, 2, 0, ((gk2) ak0Var4.j(a90Var)).i, ak0Var4, 0, 24960, 110590);
                    Integer num = ul2Var.f;
                    Integer num2 = ul2Var.g;
                    if (!ul2Var.d() || num == null) {
                        if (num2 == null) {
                            z2 = false;
                            strS = null;
                        } else if (num2.intValue() > 0) {
                            ak0Var4.W(791802263);
                            strS = j02.s(R.string.due_in_days, new Object[]{f22.b(num2.intValue(), ak0Var4)}, ak0Var4);
                            z2 = false;
                            ak0Var4.p(false);
                        } else {
                            z2 = false;
                            if (num2.intValue() == 0) {
                                ak0Var4.W(791804865);
                                strS = j02.r(R.string.due_today, ak0Var4);
                                ak0Var4.p(false);
                            } else {
                                ak0Var4.W(791806656);
                                strS = j02.s(R.string.overdue_by_days, new Object[]{f22.b(Math.abs(num2.intValue()), ak0Var4)}, ak0Var4);
                                ak0Var4.p(false);
                            }
                        }
                    } else if (num.intValue() > 0) {
                        ak0Var4.W(791788051);
                        strS = j02.s(R.string.due_in_km, new Object[]{f22.b(num.intValue(), ak0Var4)}, ak0Var4);
                        z2 = false;
                        ak0Var4.p(false);
                    } else {
                        z2 = false;
                        if (num.intValue() == 0) {
                            ak0Var4.W(791796447);
                            strS = j02.r(R.string.due_now, ak0Var4);
                            ak0Var4.p(false);
                        } else {
                            ak0Var4.W(791798172);
                            strS = j02.s(R.string.overdue_by_km, new Object[]{f22.b(Math.abs(num.intValue()), ak0Var4)}, ak0Var4);
                            ak0Var4.p(false);
                        }
                    }
                    if (strS == null) {
                        ak0Var4.W(393196488);
                        strS = j02.p(ul2Var.i, ak0Var4);
                    } else {
                        ak0Var4.W(393195217);
                    }
                    ak0Var4.p(z2);
                    ef2.b(strS, null, z82Var.b, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var4.j(a90Var)).l, ak0Var4, 0, 0, 131066);
                    ak0Var4.W(2069311141);
                    if (ul2Var.d() && (dC = ul2Var.c()) != null) {
                        int iI0 = p61.i0(dC.doubleValue());
                        if (iI0 > 0) {
                            ak0Var4.W(38154945);
                            strS2 = j02.s(R.string.due_approx_days, new Object[]{f22.b(iI0, ak0Var4)}, ak0Var4);
                            z3 = false;
                            ak0Var4.p(false);
                        } else {
                            z3 = false;
                            if (iI0 < 0) {
                                ak0Var4.W(38157546);
                                strS2 = j02.s(R.string.overdue_approx_days, new Object[]{f22.b(Math.abs(iI0), ak0Var4)}, ak0Var4);
                                ak0Var4.p(false);
                            } else {
                                ak0Var4.W(1183060472);
                                ak0Var4.p(false);
                                strS2 = null;
                            }
                        }
                        ak0Var4.p(z3);
                        str = strS2;
                    } else {
                        z3 = false;
                        ak0Var4.p(false);
                        str = null;
                    }
                    if (str == null) {
                        ak0Var4.W(-695450477);
                    } else {
                        ak0Var4.W(-695450476);
                        ef2.b(str, null, ((jr) ak0Var4.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var4.j(a90Var)).o, ak0Var4, 0, 0, 131066);
                        z3 = false;
                    }
                    ak0Var4.p(z3);
                    if (str2 != null) {
                        ak0Var4.W(-695172313);
                        ef2.b(str2, null, ((jr) ak0Var4.j(lr.a)).j, 0L, 0L, null, 0L, 2, false, 3, 0, ((gk2) ak0Var4.j(a90Var)).o, ak0Var4, 0, 24960, 110586);
                        z4 = false;
                    } else {
                        z4 = false;
                        ak0Var4.W(-716569567);
                    }
                    ak0Var4.p(z4);
                    r02.b(ak0Var4, new px0(1.0f, true));
                    Float fB = ul2Var.d() ? ul2Var.b() : ul2Var.e();
                    final float fG = ex.g(fB != null ? fB.floatValue() : 0.0f, 0.0f, 1.0f);
                    long j = z82Var.b;
                    long jB = dr.b(0.2f, j);
                    gd0 gd0Var = f52.a;
                    boolean zC = ak0Var4.c(fG);
                    Object objL5 = ak0Var4.L();
                    if (zC || objL5 == is1Var) {
                        objL5 = new ti0() { // from class: an0
                            @Override // defpackage.ti0
                            public final Object a() {
                                return Float.valueOf(fG);
                            }
                        };
                        ak0Var4.g0(objL5);
                    }
                    ti0 ti0Var = (ti0) objL5;
                    Object objL6 = ak0Var4.L();
                    if (objL6 == is1Var) {
                        objL6 = new n30(12);
                        ak0Var4.g0(objL6);
                    }
                    rq1.a(ti0Var, gd0Var, j, jB, 0, 0.0f, (ej0) objL6, ak0Var4, 1572912);
                    ak0Var4.p(true);
                } else {
                    ak0Var4.R();
                }
                break;
            case 3:
                final f41 f41Var = (f41) obj8;
                da1 da1Var2 = (da1) obj6;
                da1 da1Var3 = (da1) obj7;
                gj1 gj1Var2 = (gj1) obj;
                ak0 ak0Var5 = (ak0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                gj1Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ak0Var5.f(gj1Var2) ? 4 : 2;
                }
                if (ak0Var5.O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    u71 u71VarD = ws0.D(vs0.j(p61.b0(f52.c, gj1Var2), gj1Var2));
                    fe feVar = ws0.g;
                    ui uiVar = q90.r;
                    wr wrVarA3 = ur.a(feVar, uiVar, ak0Var5, 0);
                    int iHashCode3 = Long.hashCode(ak0Var5.T);
                    sl1 sl1VarL3 = ak0Var5.l();
                    u71 u71VarB4 = nj2.B(ak0Var5, u71VarD);
                    wu.c.getClass();
                    wv wvVar3 = vu.b;
                    ak0Var5.Z();
                    if (ak0Var5.S) {
                        ak0Var5.k(wvVar3);
                    } else {
                        ak0Var5.j0();
                    }
                    ra raVar = vu.f;
                    p12.l(raVar, ak0Var5, wrVarA3);
                    ra raVar2 = vu.e;
                    p12.l(raVar2, ak0Var5, sl1VarL3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    ra raVar3 = vu.g;
                    p12.f(ak0Var5, numValueOf, raVar3);
                    x4 x4Var = vu.h;
                    p12.k(ak0Var5, x4Var);
                    ra raVar4 = vu.d;
                    p12.l(raVar4, ak0Var5, u71VarB4);
                    u71 u71VarC1 = p61.c0(nj2.J(new px0(1.0f, true), nj2.E(ak0Var5)), 16.0f);
                    wr wrVarA4 = ur.a(new he(12.0f, new ut(1)), uiVar, ak0Var5, 6);
                    int iHashCode4 = Long.hashCode(ak0Var5.T);
                    sl1 sl1VarL4 = ak0Var5.l();
                    u71 u71VarB5 = nj2.B(ak0Var5, u71VarC1);
                    ak0Var5.Z();
                    if (ak0Var5.S) {
                        ak0Var5.k(wvVar3);
                    } else {
                        ak0Var5.j0();
                    }
                    p12.l(raVar, ak0Var5, wrVarA4);
                    p12.l(raVar2, ak0Var5, sl1VarL4);
                    k3.q(iHashCode4, ak0Var5, raVar3, ak0Var5, x4Var);
                    p12.l(raVar4, ak0Var5, u71VarB5);
                    d41 d41Var = (d41) da1Var2.getValue();
                    boolean zH = ak0Var5.h(f41Var);
                    Object objL7 = ak0Var5.L();
                    if (zH || objL7 == is1Var) {
                        objL7 = new f(1, f41Var, f41.class, "onTypeSelected", "onTypeSelected(J)V", 0, 15);
                        ak0Var5.g0(objL7);
                    }
                    vs0.d(d41Var, (ej0) ((tj0) objL7), ak0Var5, 0);
                    if (((d41) da1Var2.getValue()).c()) {
                        ak0Var5.W(-1853023281);
                        rw.k(f52.a, 0.0f, vs0.C(1341858213, new in(9, f41Var, da1Var2), ak0Var5), ak0Var5, 390);
                        z5 = false;
                    } else {
                        z5 = false;
                        ak0Var5.W(-1858018931);
                    }
                    ak0Var5.p(z5);
                    Object objL8 = ak0Var5.L();
                    Object obj9 = objL8;
                    if (objL8 == is1Var) {
                        f91 f91Var = new f91();
                        ak0Var5.g0(f91Var);
                        obj9 = f91Var;
                    }
                    f91 f91Var2 = (f91) obj9;
                    Object objL9 = ak0Var5.L();
                    if (objL9 == is1Var) {
                        gtVarC = null;
                        e eVar = new e(20, false ? 1 : 0, f91Var2, da1Var3);
                        ak0Var5.g0(eVar);
                        obj4 = eVar;
                    } else {
                        gtVarC = null;
                        obj4 = objL9;
                    }
                    s5.o((ij0) obj4, ak0Var5, f91Var2);
                    String strU = p61.U(((d41) da1Var2.getValue()).d, dv1.z(ak0Var5));
                    gd0 gd0Var2 = f52.a;
                    Object objL10 = ak0Var5.L();
                    Object obj10 = objL10;
                    if (objL10 == is1Var) {
                        o01 o01Var = new o01(6);
                        ak0Var5.g0(o01Var);
                        obj10 = o01Var;
                    }
                    ux.f(strU, (ej0) obj10, gd0Var2, false, true, null, nj2.l, null, nj2.m, null, false, null, null, null, false, 0, 0, f91Var2, null, null, ak0Var5, 806904240, 0, 6, 7339432);
                    String str4 = ((d41) da1Var2.getValue()).e;
                    boolean zH2 = ak0Var5.h(f41Var);
                    Object objL11 = ak0Var5.L();
                    if (zH2 || objL11 == is1Var) {
                        objL11 = new f(1, f41Var, f41.class, "onOdometerChange", "onOdometerChange(Ljava/lang/String;)V", 0, 17);
                        ak0Var5.g0(objL11);
                    }
                    qj0 qj0Var = (tj0) objL11;
                    fg2 fg2VarL = mx.L(ak0Var5);
                    aw0 aw0Var = new aw0(3, 6, 115);
                    if (((d41) da1Var2.getValue()).f == null) {
                        ak0Var5.W(-1850564362);
                        z6 = false;
                    } else {
                        z6 = false;
                        ak0Var5.W(-1850564361);
                        gtVarC = vs0.C(-1883593774, new x7(17, f41Var), ak0Var5);
                    }
                    ak0Var5.p(z6);
                    ux.f(str4, (ej0) qj0Var, gd0Var2, false, false, null, nj2.o, null, gtVarC, null, false, fg2VarL, aw0Var, null, true, 0, 0, null, null, null, ak0Var5, 1573248, 12779520, 0, 8207800);
                    boolean z10 = ((d41) da1Var2.getValue()).c() && ((d41) da1Var2.getValue()).j == d22.f;
                    if (z10) {
                        z7 = false;
                        ak0Var5.W(-1858018931);
                    } else {
                        ak0Var5.W(-1849862149);
                        String str5 = ((d41) da1Var2.getValue()).g;
                        boolean zH3 = ak0Var5.h(f41Var);
                        Object objL12 = ak0Var5.L();
                        if (zH3 || objL12 == is1Var) {
                            objL12 = new f(1, f41Var, f41.class, "onCostChange", "onCostChange(Ljava/lang/String;)V", 0, 18);
                            ak0Var5.g0(objL12);
                        }
                        ux.f(str5, (ej0) ((tj0) objL12), gd0Var2, false, false, null, nj2.p, null, null, null, false, mx.L(ak0Var5), new aw0(3, 6, 115), null, true, 0, 0, null, null, null, ak0Var5, 1573248, 12779520, 0, 8208312);
                        z7 = false;
                    }
                    ak0Var5.p(z7);
                    u22 u22VarB = ((d41) da1Var2.getValue()).b();
                    if (u22VarB == null || !u22VarB.g || z10) {
                        z8 = false;
                        ak0Var5.W(-1858018931);
                    } else {
                        ak0Var5.W(-1849154853);
                        String str6 = ((d41) da1Var2.getValue()).h;
                        boolean zH4 = ak0Var5.h(f41Var);
                        Object objL13 = ak0Var5.L();
                        if (zH4 || objL13 == is1Var) {
                            objL13 = new f(1, f41Var, f41.class, "onQuantityChange", "onQuantityChange(Ljava/lang/String;)V", 0, 19);
                            ak0Var5.g0(objL13);
                        }
                        ux.f(str6, (ej0) ((tj0) objL13), gd0Var2, false, false, null, nj2.q, null, null, null, false, null, new aw0(9, 6, 115), null, true, 0, 0, null, null, null, ak0Var5, 1573248, 12779520, 0, 8224696);
                        z8 = false;
                    }
                    ak0Var5.p(z8);
                    if (((d41) da1Var2.getValue()).k.isEmpty()) {
                        z9 = false;
                        ak0Var5.W(-1858018931);
                    } else {
                        ak0Var5.W(-1848510146);
                        ef2.b(j02.r(R.string.log_companions_header, ak0Var5), p61.f0(r71.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var5.j(ik2.a)).i, ak0Var5, 48, 0, 131068);
                        for (final js jsVar : ((d41) da1Var2.getValue()).k) {
                            boolean zH5 = ak0Var5.h(f41Var) | ak0Var5.f(jsVar);
                            Object objL14 = ak0Var5.L();
                            if (zH5 || objL14 == is1Var) {
                                obj5 = objL14;
                                final int i6 = 0;
                                ej0 ej0Var2 = new ej0() { // from class: b41
                                    @Override // defpackage.ej0
                                    public final Object h(Object obj11) {
                                        Object value;
                                        d41 d41Var2;
                                        ArrayList arrayList;
                                        Object value2;
                                        d41 d41Var3;
                                        ArrayList arrayList2;
                                        int i7 = i6;
                                        ll2 ll2Var2 = ll2.a;
                                        js jsVar2 = jsVar;
                                        f41 f41Var2 = f41Var;
                                        switch (i7) {
                                            case 0:
                                                is isVar = (is) obj11;
                                                isVar.getClass();
                                                long j2 = jsVar2.a.a;
                                                s82 s82Var = f41Var2.g;
                                                do {
                                                    value = s82Var.getValue();
                                                    d41Var2 = (d41) value;
                                                    List<js> list = d41Var2.k;
                                                    arrayList = new ArrayList(wq.G(list, 10));
                                                    for (js jsVarA : list) {
                                                        if (jsVarA.a.a == j2) {
                                                            jsVarA = js.a(jsVarA, isVar, null, 5);
                                                        }
                                                        arrayList.add(jsVarA);
                                                    }
                                                } while (!s82Var.h(value, d41.a(d41Var2, null, 0L, 0, null, null, null, null, null, null, arrayList, false, 7167)));
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                long j3 = jsVar2.a.a;
                                                s82 s82Var2 = f41Var2.g;
                                                do {
                                                    value2 = s82Var2.getValue();
                                                    d41Var3 = (d41) value2;
                                                    List<js> list2 = d41Var3.k;
                                                    arrayList2 = new ArrayList(wq.G(list2, 10));
                                                    for (js jsVarA2 : list2) {
                                                        if (jsVarA2.a.a == j3) {
                                                            StringBuilder sb = new StringBuilder();
                                                            int length = str7.length();
                                                            for (int i8 = 0; i8 < length; i8++) {
                                                                char cCharAt = str7.charAt(i8);
                                                                if (Character.isDigit(cCharAt)) {
                                                                    sb.append(cCharAt);
                                                                }
                                                            }
                                                            jsVarA2 = js.a(jsVarA2, null, h92.P(sb.toString(), 12), 3);
                                                        }
                                                        arrayList2.add(jsVarA2);
                                                    }
                                                } while (!s82Var2.h(value2, d41.a(d41Var3, null, 0L, 0, null, null, null, null, null, null, arrayList2, false, 7167)));
                                                break;
                                        }
                                        return ll2Var2;
                                    }
                                };
                                ak0Var5.g0(ej0Var2);
                                obj5 = ej0Var2;
                            }
                            ej0 ej0Var3 = (ej0) obj5;
                            boolean zH6 = ak0Var5.h(f41Var) | ak0Var5.f(jsVar);
                            Object objL15 = ak0Var5.L();
                            if (zH6 || objL15 == is1Var) {
                                final int i7 = 1;
                                objL15 = new ej0() { // from class: b41
                                    @Override // defpackage.ej0
                                    public final Object h(Object obj11) {
                                        Object value;
                                        d41 d41Var2;
                                        ArrayList arrayList;
                                        Object value2;
                                        d41 d41Var3;
                                        ArrayList arrayList2;
                                        int i8 = i7;
                                        ll2 ll2Var2 = ll2.a;
                                        js jsVar2 = jsVar;
                                        f41 f41Var2 = f41Var;
                                        switch (i8) {
                                            case 0:
                                                is isVar = (is) obj11;
                                                isVar.getClass();
                                                long j2 = jsVar2.a.a;
                                                s82 s82Var = f41Var2.g;
                                                do {
                                                    value = s82Var.getValue();
                                                    d41Var2 = (d41) value;
                                                    List<js> list = d41Var2.k;
                                                    arrayList = new ArrayList(wq.G(list, 10));
                                                    for (js jsVarA : list) {
                                                        if (jsVarA.a.a == j2) {
                                                            jsVarA = js.a(jsVarA, isVar, null, 5);
                                                        }
                                                        arrayList.add(jsVarA);
                                                    }
                                                } while (!s82Var.h(value, d41.a(d41Var2, null, 0L, 0, null, null, null, null, null, null, arrayList, false, 7167)));
                                                break;
                                            default:
                                                String str7 = (String) obj11;
                                                str7.getClass();
                                                long j3 = jsVar2.a.a;
                                                s82 s82Var2 = f41Var2.g;
                                                do {
                                                    value2 = s82Var2.getValue();
                                                    d41Var3 = (d41) value2;
                                                    List<js> list2 = d41Var3.k;
                                                    arrayList2 = new ArrayList(wq.G(list2, 10));
                                                    for (js jsVarA2 : list2) {
                                                        if (jsVarA2.a.a == j3) {
                                                            StringBuilder sb = new StringBuilder();
                                                            int length = str7.length();
                                                            for (int i9 = 0; i9 < length; i9++) {
                                                                char cCharAt = str7.charAt(i9);
                                                                if (Character.isDigit(cCharAt)) {
                                                                    sb.append(cCharAt);
                                                                }
                                                            }
                                                            jsVarA2 = js.a(jsVarA2, null, h92.P(sb.toString(), 12), 3);
                                                        }
                                                        arrayList2.add(jsVarA2);
                                                    }
                                                } while (!s82Var2.h(value2, d41.a(d41Var3, null, 0L, 0, null, null, null, null, null, null, arrayList2, false, 7167)));
                                                break;
                                        }
                                        return ll2Var2;
                                    }
                                };
                                ak0Var5.g0(objL15);
                            }
                            vs0.a(jsVar, ej0Var3, (ej0) objL15, ak0Var5, 0);
                        }
                        z9 = false;
                    }
                    ak0Var5.p(z9);
                    String str7 = ((d41) da1Var2.getValue()).i;
                    boolean zH7 = ak0Var5.h(f41Var);
                    Object objL16 = ak0Var5.L();
                    if (zH7 || objL16 == is1Var) {
                        objL16 = new f(1, f41Var, f41.class, "onNoteChange", "onNoteChange(Ljava/lang/String;)V", 0, 16);
                        ak0Var5.g0(objL16);
                    }
                    gd0 gd0Var3 = f52.a;
                    ux.f(str7, (ej0) ((tj0) objL16), f52.e(gd0Var3, 96.0f, 0.0f, 2), false, false, null, nj2.r, null, null, null, false, null, null, null, false, 0, 0, null, null, null, ak0Var5, 1573248, 0, 0, 8388536);
                    ak0Var5.p(true);
                    p61.h(null, 0.0f, 0L, ak0Var5, 0, 7);
                    boolean zH8 = ak0Var5.h(f41Var);
                    Object objL17 = ak0Var5.L();
                    if (zH8 || objL17 == is1Var) {
                        t4 t4Var = new t4(0, f41Var, f41.class, "save", "save()V", 0, 6);
                        ak0Var5.g0(t4Var);
                        objL17 = t4Var;
                    }
                    j20.c((ti0) ((tj0) objL17), p61.d0(gd0Var3, 16.0f, 8.0f), false, null, null, null, null, nj2.s, ak0Var5, 805306416, 508);
                    ak0Var5.p(true);
                } else {
                    ak0Var5.R();
                }
                break;
            case 4:
                wm wmVar = (wm) obj8;
                da1 da1Var4 = (da1) obj6;
                da1 da1Var5 = (da1) obj7;
                ak0 ak0Var6 = (ak0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var6.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    hn0 hn0Var = (hn0) da1Var4.getValue();
                    pf1 pf1Var = hn0Var.d;
                    if (pf1Var != null) {
                        i5 = pf1Var.a;
                    } else {
                        wm wmVar2 = hn0Var.a;
                        if (wmVar2 != null) {
                            i5 = wmVar2.h;
                        }
                    }
                    int i8 = i5;
                    pf1 pf1Var2 = ((hn0) da1Var4.getValue()).d;
                    Object objL18 = ak0Var6.L();
                    if (objL18 == is1Var) {
                        objL18 = new r9(da1Var5, 15);
                        ak0Var6.g0(objL18);
                    }
                    gn0.a(wmVar, i8, pf1Var2, (ti0) objL18, ak0Var6, 3072);
                } else {
                    ak0Var6.R();
                }
                break;
            default:
                d41 d41Var2 = (d41) obj8;
                ej0 ej0Var4 = (ej0) obj7;
                da1 da1Var6 = (da1) obj6;
                ak0 ak0Var7 = (ak0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var7.O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    for (u22 u22Var2 : d41Var2.b) {
                        gt gtVarC2 = vs0.C(213610901, new x7(i4, u22Var2), ak0Var7);
                        boolean zF3 = ak0Var7.f(ej0Var4) | ak0Var7.f(u22Var2);
                        Object objL19 = ak0Var7.L();
                        if (zF3 || objL19 == is1Var) {
                            objL19 = new vf(ej0Var4, u22Var2, da1Var6, i2);
                            ak0Var7.g0(objL19);
                        }
                        t7.b(gtVarC2, (ti0) objL19, null, null, false, null, null, ak0Var7, 6, 508);
                    }
                } else {
                    ak0Var7.R();
                }
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ gn(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jd(int i, Object obj, Object obj2) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var;
        int i = this.e;
        is1 is1Var = cv.a;
        ll2 ll2Var = ll2.a;
        int i2 = 1;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                f20 f20Var = (f20) obj4;
                ej0 ej0Var = (ej0) obj3;
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ak0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = ak0Var2.f(f20Var) | ak0Var2.f(ej0Var);
                    Object objL = ak0Var2.L();
                    if (zF || objL == is1Var) {
                        objL = new n1(5, f20Var, ej0Var);
                        ak0Var2.g0(objL);
                    }
                    j20.h((ti0) objL, null, false, null, null, null, nj2.b, ak0Var2, 805306368, 510);
                } else {
                    ak0Var2.R();
                }
                return ll2Var;
            case 1:
                ((Integer) obj2).getClass();
                nj2.b((u71) obj4, (ej0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 2:
                ((Integer) obj2).getClass();
                s5.g((ni0) obj4, (ej0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 3:
                da1 da1Var = (da1) obj4;
                ti0 ti0Var = (ti0) obj3;
                ak0 ak0Var3 = (ak0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ak0Var3.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nc.b(vs0.C(-467566934, new p7(da1Var, i2), ak0Var3), null, vs0.C(1904149932, new pd(i2, ti0Var), ak0Var3), null, 0.0f, null, null, ak0Var3, 390, 250);
                } else {
                    ak0Var3.R();
                }
                return ll2Var;
            case 4:
                ((Integer) obj2).getClass();
                s5.c((ti0) obj4, (mn) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 5:
                wm wmVar = (wm) obj4;
                da1 da1Var2 = (da1) obj3;
                ak0 ak0Var4 = (ak0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    wm wmVar2 = ((yn) da1Var2.getValue()).b;
                    if (wmVar2 == null || wmVar.a != wmVar2.a) {
                        ak0Var4.W(1262370555);
                    } else {
                        ak0Var4.W(1266097623);
                        jo0 jo0VarB = vs0.H;
                        if (jo0VarB == null) {
                            io0 io0Var = new io0("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = jm2.a;
                            o72 o72Var = new o72(dr.b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new xk1(9.0f, 16.17f));
                            arrayList.add(new wk1(4.83f, 12.0f));
                            arrayList.add(new el1(-1.42f, 1.41f));
                            arrayList.add(new wk1(9.0f, 19.0f));
                            arrayList.add(new wk1(21.0f, 7.0f));
                            arrayList.add(new el1(-1.41f, -1.41f));
                            arrayList.add(tk1.c);
                            io0.a(io0Var, arrayList, o72Var);
                            jo0VarB = io0Var.b();
                            vs0.H = jo0VarB;
                        }
                        fo0.a(jo0VarB, null, null, 0L, ak0Var4, 48, 12);
                    }
                    ak0Var4.p(false);
                } else {
                    ak0Var4.R();
                }
                return ll2Var;
            case 6:
                ((Integer) obj2).getClass();
                ((nx) obj4).a((lx) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 7:
                ((Integer) obj2).getClass();
                ((p20) obj4).a((e4) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 8:
                ((Integer) obj2).getClass();
                ((i30) obj4).a((gd1) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 9:
                ((Integer) obj2).getClass();
                ((r30) obj4).a((z42) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 10:
                nc2 nc2Var = (nc2) obj4;
                ad2 ad2Var = (ad2) obj3;
                ak0 ak0Var5 = (ak0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ak0Var5.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF2 = ak0Var5.f(nc2Var);
                    Object objL2 = ak0Var5.L();
                    if (zF2 || objL2 == is1Var) {
                        objL2 = e72.b(new t4(0, nc2Var, nc2.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 2));
                        ak0Var5.g0(objL2);
                    }
                    v30.a(ad2Var, (mc2) ((p82) objL2).getValue(), ak0Var5, 0);
                } else {
                    ak0Var5.R();
                }
                return ll2Var;
            case 11:
                ((Integer) obj2).getClass();
                v30.a((ad2) obj4, (mc2) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 12:
                ((Integer) obj2).getClass();
                rw.g((List) obj4, (Collection) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 13:
                ij0 ij0Var = (ij0) obj4;
                p82 p82Var = (p82) obj3;
                ak0 ak0Var6 = (ak0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ak0Var6.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    gt gtVar = ws0.l;
                    gt gtVar2 = ws0.m;
                    boolean zF3 = ak0Var6.f(ij0Var) | ak0Var6.f(p82Var);
                    Object objL3 = ak0Var6.L();
                    if (zF3 || objL3 == is1Var) {
                        objL3 = new n1(17, ij0Var, p82Var);
                        ak0Var6.g0(objL3);
                    }
                    mx.b(gtVar, gtVar2, (ti0) objL3, null, false, null, 0L, 0L, null, ak0Var6, 54);
                } else {
                    ak0Var6.R();
                }
                return ll2Var;
            case 14:
                ((Integer) obj2).getClass();
                p61.f((di0) obj4, (ti0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 15:
                rs1 rs1Var = (rs1) obj4;
                o52 o52Var = (o52) obj3;
                int iIntValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof ju) {
                    ((fa1) rs1Var.e).b((ju) obj2);
                } else if (!(obj2 instanceof au1)) {
                    if (obj2 instanceof ek0) {
                        dv1.H(o52Var, iIntValue6, obj2);
                        rs1Var.f((ek0) obj2);
                    } else if (obj2 instanceof lr1) {
                        dv1.H(o52Var, iIntValue6, obj2);
                        ((lr1) obj2).c();
                    }
                }
                return ll2Var;
            case 16:
                ((Integer) obj2).getClass();
                s5.i((lm0) obj4, (ti0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 17:
                ((Integer) obj2).getClass();
                gn0.b((mi0) obj4, (ti0) obj3, (ak0) obj, ei1.P(9));
                return ll2Var;
            case 18:
                String str = (String) obj4;
                vf2 vf2Var = (vf2) obj3;
                ak0 ak0Var7 = (ak0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ak0Var7.O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sv1 sv1VarA = rv1.a(new he(3.0f, new ut(i2)), q90.o, ak0Var7, 6);
                    int iHashCode = Long.hashCode(ak0Var7.T);
                    sl1 sl1VarL = ak0Var7.l();
                    r71 r71Var = r71.a;
                    u71 u71VarB = nj2.B(ak0Var7, r71Var);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var7.Z();
                    if (ak0Var7.S) {
                        ak0Var7.k(wvVar);
                    } else {
                        ak0Var7.j0();
                    }
                    p12.l(vu.f, ak0Var7, sv1VarA);
                    p12.l(vu.e, ak0Var7, sl1VarL);
                    p12.f(ak0Var7, Integer.valueOf(iHashCode), vu.g);
                    p12.k(ak0Var7, vu.h);
                    p12.l(vu.d, ak0Var7, u71VarB);
                    ak0Var7.W(-959189474);
                    for (int i4 = 0; i4 < str.length(); i4++) {
                        char cCharAt = str.charAt(i4);
                        u71 u71VarK = nj2.k(r71Var, kv1.a(4.0f));
                        a90 a90Var = lr.a;
                        u71 u71VarD0 = p61.d0(p61.s(u71VarK, ((jr) ak0Var7.j(a90Var)).u, vs0.C), 4.0f, 5.0f);
                        w61 w61VarC = xj.c(q90.f, false);
                        int iHashCode2 = Long.hashCode(ak0Var7.T);
                        sl1 sl1VarL2 = ak0Var7.l();
                        u71 u71VarB2 = nj2.B(ak0Var7, u71VarD0);
                        wu.c.getClass();
                        wv wvVar2 = vu.b;
                        ak0Var7.Z();
                        if (ak0Var7.S) {
                            ak0Var7.k(wvVar2);
                        } else {
                            ak0Var7.j0();
                        }
                        p12.l(vu.f, ak0Var7, w61VarC);
                        p12.l(vu.e, ak0Var7, sl1VarL2);
                        p12.f(ak0Var7, Integer.valueOf(iHashCode2), vu.g);
                        p12.k(ak0Var7, vu.h);
                        p12.l(vu.d, ak0Var7, u71VarB2);
                        ef2.b("8", null, dr.b(0.15f, ((jr) ak0Var7.j(a90Var)).v), 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var, ak0Var7, 6, 0, 131066);
                        ef2.b(String.valueOf(cCharAt), null, ((jr) ak0Var7.j(a90Var)).v, 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var, ak0Var7, 0, 0, 131066);
                        ak0Var7.p(true);
                    }
                    ak0Var7.p(false);
                    ak0Var7.p(true);
                } else {
                    ak0Var7.R();
                }
                return ll2Var;
            case 19:
                wm wmVar3 = (wm) obj4;
                ij0 ij0Var2 = (ij0) obj3;
                ak0 ak0Var8 = (ak0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ak0Var8.O(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (wmVar3 != null) {
                        ak0Var8.W(2131351945);
                        gt gtVar3 = p61.f;
                        gt gtVar4 = p61.g;
                        boolean zF4 = ak0Var8.f(ij0Var2) | ak0Var8.f(wmVar3);
                        Object objL4 = ak0Var8.L();
                        if (zF4 || objL4 == is1Var) {
                            objL4 = new n1(19, ij0Var2, wmVar3);
                            ak0Var8.g0(objL4);
                        }
                        mx.b(gtVar3, gtVar4, (ti0) objL4, null, false, null, 0L, 0L, null, ak0Var8, 54);
                        ak0Var = ak0Var8;
                    } else {
                        ak0Var = ak0Var8;
                        ak0Var.W(2123847961);
                    }
                    ak0Var.p(false);
                } else {
                    ak0Var8.R();
                }
                return ll2Var;
            case 20:
                ln0 ln0Var = (ln0) obj4;
                da1 da1Var3 = (da1) obj3;
                ak0 ak0Var9 = (ak0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (ak0Var9.O(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zH = ak0Var9.h(ln0Var);
                    Object objL5 = ak0Var9.L();
                    if (zH || objL5 == is1Var) {
                        objL5 = new n1(20, ln0Var, da1Var3);
                        ak0Var9.g0(objL5);
                    }
                    j20.h((ti0) objL5, null, false, null, null, null, p61.j, ak0Var9, 805306368, 510);
                } else {
                    ak0Var9.R();
                }
                return ll2Var;
            case 21:
                ((Integer) obj2).getClass();
                p61.i((es0) obj4, (ej0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 22:
                ((Integer) obj2).getClass();
                p61.j((ti0) obj4, (ls0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 23:
                iz0 iz0Var = (iz0) obj4;
                hz0 hz0Var = (hz0) obj3;
                ak0 ak0Var10 = (ak0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ak0Var10.O(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    jz0 jz0Var = (jz0) iz0Var.b.a();
                    int iE = hz0Var.c;
                    Object obj5 = hz0Var.a;
                    if ((iE >= jz0Var.a() || !jz0Var.b(iE).equals(obj5)) && (iE = jz0Var.e(obj5)) != -1) {
                        hz0Var.c = iE;
                    }
                    int i5 = iE;
                    if (i5 != -1) {
                        ak0Var10.W(-1664741271);
                        ix.h(jz0Var, iz0Var.a, i5, hz0Var.a, ak0Var10, 0);
                    } else {
                        ak0Var10.W(-1668376610);
                    }
                    ak0Var10.p(false);
                    boolean zH2 = ak0Var10.h(hz0Var);
                    Object objL6 = ak0Var10.L();
                    if (zH2 || objL6 == is1Var) {
                        objL6 = new m(14, hz0Var);
                        ak0Var10.g0(objL6);
                    }
                    s5.e(obj5, (ej0) objL6, ak0Var10);
                } else {
                    ak0Var10.R();
                }
                return ll2Var;
            case 24:
                return ((lz0) obj3).a(new mz0((iz0) obj4, (ba2) obj), ((sw) obj2).a);
            case 25:
                gt gtVar5 = (gt) obj4;
                s01 s01Var = (s01) obj3;
                ak0 ak0Var11 = (ak0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (ak0Var11.O(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    gtVar5.d(s01Var, ak0Var11, 0);
                } else {
                    ak0Var11.R();
                }
                return ll2Var;
            case 26:
                ((Integer) obj2).getClass();
                s5.q((j11) obj4, (u71) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            case 27:
                f41 f41Var = (f41) obj4;
                da1 da1Var4 = (da1) obj3;
                ak0 ak0Var12 = (ak0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ak0Var12.O(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zH3 = ak0Var12.h(f41Var);
                    Object objL7 = ak0Var12.L();
                    if (zH3 || objL7 == is1Var) {
                        objL7 = new n1(24, f41Var, da1Var4);
                        ak0Var12.g0(objL7);
                    }
                    j20.h((ti0) objL7, null, false, null, null, null, nj2.t, ak0Var12, 805306368, 510);
                } else {
                    ak0Var12.R();
                }
                return ll2Var;
            case 28:
                ((Integer) obj2).getClass();
                vs0.b((ti0) obj4, (f41) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
            default:
                ((Integer) obj2).getClass();
                vs0.d((d41) obj4, (ej0) obj3, (ak0) obj, ei1.P(1));
                return ll2Var;
        }
    }

    public /* synthetic */ jd(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = obj2;
    }
}

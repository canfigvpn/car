package defpackage;

import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kz0 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kz0(ti0 ti0Var, da1 da1Var, ao aoVar, da1 da1Var2) {
        this.e = 2;
        this.g = ti0Var;
        this.f = da1Var;
        this.h = aoVar;
        this.i = da1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ak0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [sx] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v32 */
    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean z;
        u71 u71VarC;
        ?? r5;
        kp1 kp1Var;
        ?? r6;
        boolean z2;
        String str;
        boolean z3;
        Object objN;
        int i = this.e;
        int i2 = 5;
        ?? r7 = 0;
        int i3 = 4;
        ll2 ll2Var = ll2.a;
        is1 is1Var = cv.a;
        Object obj4 = this.f;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                tz0 tz0Var = (tz0) obj7;
                u71 u71Var = (u71) obj6;
                lz0 lz0Var = (lz0) obj5;
                da1 da1Var = (da1) obj4;
                ew1 ew1Var = (ew1) obj;
                ?? r8 = (ak0) obj2;
                ((Integer) obj3).getClass();
                Object objL = r8.L();
                Object obj8 = objL;
                if (objL == is1Var) {
                    iz0 iz0Var = new iz0(ew1Var, new r9(da1Var, 17));
                    r8.g0(iz0Var);
                    obj8 = iz0Var;
                }
                iz0 iz0Var2 = (iz0) obj8;
                Object objL2 = r8.L();
                Object obj9 = objL2;
                if (objL2 == is1Var) {
                    aa2 aa2Var = new aa2(new dq0(iz0Var2));
                    r8.g0(aa2Var);
                    obj9 = aa2Var;
                }
                aa2 aa2Var2 = (aa2) obj9;
                if (tz0Var != null) {
                    r8.W(1743490539);
                    r8.W(887527095);
                    Object obj10 = mp1.a;
                    if (obj10 != null) {
                        r8.W(1345554384);
                        z2 = false;
                        r8.p(false);
                    } else {
                        r8.W(1345603457);
                        View view = (View) r8.j(u5.f);
                        boolean zF = r8.f(view);
                        Object objL3 = r8.L();
                        if (zF || objL3 == is1Var) {
                            r6 = objL3;
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            if (tag instanceof kp1) {
                                kp1Var = (kp1) tag;
                            }
                            if (r7 == 0) {
                                r7 = kp1Var;
                                v8 v8Var = new v8(view);
                                view.setTag(R.id.compose_prefetch_scheduler, v8Var);
                                r5 = v8Var;
                            } else {
                                r7 = kp1Var;
                                r5 = r7;
                            }
                            r8.g0(r5);
                            r6 = r5;
                        }
                        obj10 = (kp1) r6;
                        z2 = false;
                        r8.p(false);
                    }
                    Object obj11 = obj10;
                    r8.p(z2);
                    Object[] objArr = {tz0Var, iz0Var2, aa2Var2, obj11};
                    boolean zF2 = r8.f(tz0Var) | r8.h(iz0Var2) | r8.h(aa2Var2) | r8.h(obj11);
                    Object objL4 = r8.L();
                    if (zF2 || objL4 == is1Var) {
                        dy dyVar = new dy(tz0Var, iz0Var2, aa2Var2, obj11, 2);
                        r8.g0(dyVar);
                        objL4 = dyVar;
                    }
                    ej0 ej0Var = (ej0) objL4;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
                    boolean zF3 = false;
                    for (Object obj12 : objArrCopyOf) {
                        zF3 |= r8.f(obj12);
                    }
                    Object objL5 = r8.L();
                    if (zF3 || objL5 == is1Var) {
                        r8.g0(new a60(ej0Var));
                    }
                    z = false;
                } else {
                    z = false;
                    r8.W(1737291469);
                }
                r8.p(z);
                int i4 = uz0.a;
                if (tz0Var != null && (u71VarC = u71Var.c(new ti2(tz0Var))) != null) {
                    u71Var = u71VarC;
                }
                boolean zF4 = r8.f(iz0Var2) | r8.f(lz0Var);
                Object objL6 = r8.L();
                Object obj13 = objL6;
                if (zF4 || objL6 == is1Var) {
                    jd jdVar = new jd(24, iz0Var2, lz0Var);
                    r8.g0(jdVar);
                    obj13 = jdVar;
                }
                ws0.h(aa2Var2, u71Var, (ij0) obj13, r8, 8);
                return ll2Var;
            case 1:
                u22 u22Var = (u22) obj7;
                d41 d41Var = (d41) obj6;
                da1 da1Var2 = (da1) obj4;
                ej0 ej0Var2 = (ej0) obj5;
                vc0 vc0Var = (vc0) obj;
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vc0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ak0Var.f(vc0Var) : ak0Var.h(vc0Var) ? 4 : 2;
                }
                if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (u22Var == null) {
                        ak0Var.W(-459567773);
                        ak0Var.p(false);
                        str = null;
                    } else {
                        ak0Var.W(-459567772);
                        str = u22Var.d + "  " + f22.d(u22Var, ak0Var);
                        ak0Var.p(false);
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    boolean z4 = d41Var.l;
                    gt gtVar = z4 ? nj2.x : null;
                    u71 u71VarB = vc0.b(vc0Var, f52.a);
                    Object objL7 = ak0Var.L();
                    if (objL7 == is1Var) {
                        objL7 = new o01(5);
                        ak0Var.g0(objL7);
                    }
                    ux.f(str2, (ej0) objL7, u71VarB, false, true, null, nj2.y, null, vs0.C(2003167172, new p7(da1Var2, 6), ak0Var), gtVar, z4, null, null, null, false, 0, 0, null, null, null, ak0Var, 806903856, 0, 0, 8375720);
                    boolean zBooleanValue = ((Boolean) da1Var2.getValue()).booleanValue();
                    Object objL8 = ak0Var.L();
                    if (objL8 == is1Var) {
                        objL8 = new r9(da1Var2, 21);
                        ak0Var.g0(objL8);
                    }
                    vc0Var.a(zBooleanValue, (ti0) objL8, null, null, false, null, 0L, 0.0f, vs0.C(1454636573, new gn(d41Var, ej0Var2, da1Var2), ak0Var), ak0Var, 48, 6 | ((iIntValue << 3) & 112));
                } else {
                    ak0Var.R();
                }
                return ll2Var;
            case 2:
                ti0 ti0Var = (ti0) obj7;
                da1 da1Var3 = (da1) obj4;
                ao aoVar = (ao) obj6;
                da1 da1Var4 = (da1) obj5;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ak0Var2.W(-1156816003);
                    for (wm wmVar : ((yn) da1Var3.getValue()).a) {
                        gt gtVarC = vs0.C(-1004087580, new x7(3, wmVar), ak0Var2);
                        boolean zH = ak0Var2.h(aoVar) | ak0Var2.f(wmVar);
                        Object objL9 = ak0Var2.L();
                        if (zH || objL9 == is1Var) {
                            objL9 = new vf(aoVar, wmVar, da1Var4, i3);
                            ak0Var2.g0(objL9);
                        }
                        t7.b(gtVarC, (ti0) objL9, null, vs0.C(-1344919065, new jd(i2, wmVar, da1Var3), ak0Var2), false, null, null, ak0Var2, 3078, 500);
                    }
                    ak0Var2.p(false);
                    if (((yn) da1Var3.getValue()).a.isEmpty()) {
                        z3 = false;
                        ak0Var2.W(-1505119189);
                    } else {
                        ak0Var2.W(-1501082400);
                        p61.h(null, 0.0f, 0L, ak0Var2, 0, 7);
                        z3 = false;
                    }
                    ak0Var2.p(z3);
                    gt gtVar2 = s5.g;
                    boolean zF5 = ak0Var2.f(ti0Var);
                    Object objL10 = ak0Var2.L();
                    if (zF5 || objL10 == is1Var) {
                        objL10 = new n1(10, ti0Var, da1Var4);
                        ak0Var2.g0(objL10);
                    }
                    t7.b(gtVar2, (ti0) objL10, null, s5.h, false, null, null, ak0Var2, 3078, 500);
                } else {
                    ak0Var2.R();
                }
                return ll2Var;
            case 3:
                ij0 ij0Var = (ij0) obj7;
                nx nxVar = (nx) obj6;
                jj0 jj0Var = (jj0) obj5;
                ti0 ti0Var2 = (ti0) obj4;
                lx lxVar = (lx) obj;
                ak0 ak0Var3 = (ak0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ak0Var3.f(lxVar) ? 4 : 2;
                }
                if (ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    String str3 = (String) ij0Var.g(ak0Var3, 0);
                    if (h92.I(str3)) {
                        yp0.c("Label must not be blank");
                    }
                    nxVar.getClass();
                    j20.g.b(str3, Boolean.TRUE, lxVar, jj0Var, ti0Var2, ak0Var3, Integer.valueOf((iIntValue3 << 9) & 7168));
                } else {
                    ak0Var3.R();
                }
                return ll2Var;
            case 4:
                final es0 es0Var = (es0) obj7;
                final ej0 ej0Var3 = (ej0) obj6;
                final da1 da1Var5 = (da1) obj4;
                final da1 da1Var6 = (da1) obj5;
                ak0 ak0Var4 = (ak0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (!ak0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ak0Var4.R();
                    return ll2Var;
                }
                r71 r71Var = r71.a;
                u71 u71VarC0 = p61.c0(r71Var, 16.0f);
                wr wrVarA = ur.a(ws0.g, q90.r, ak0Var4, 0);
                int iHashCode = Long.hashCode(ak0Var4.T);
                sl1 sl1VarL = ak0Var4.l();
                u71 u71VarB2 = nj2.B(ak0Var4, u71VarC0);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var4.Z();
                if (ak0Var4.S) {
                    ak0Var4.k(wvVar);
                } else {
                    ak0Var4.j0();
                }
                ra raVar = vu.f;
                p12.l(raVar, ak0Var4, wrVarA);
                ra raVar2 = vu.e;
                p12.l(raVar2, ak0Var4, sl1VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                ra raVar3 = vu.g;
                p12.f(ak0Var4, numValueOf, raVar3);
                x4 x4Var = vu.h;
                p12.k(ak0Var4, x4Var);
                ra raVar4 = vu.d;
                p12.l(raVar4, ak0Var4, u71VarB2);
                sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var4, 48);
                int iHashCode2 = Long.hashCode(ak0Var4.T);
                sl1 sl1VarL2 = ak0Var4.l();
                u71 u71VarB3 = nj2.B(ak0Var4, r71Var);
                ak0Var4.Z();
                if (ak0Var4.S) {
                    ak0Var4.k(wvVar);
                } else {
                    ak0Var4.j0();
                }
                p12.l(raVar, ak0Var4, sv1VarA);
                p12.l(raVar2, ak0Var4, sl1VarL2);
                k3.q(iHashCode2, ak0Var4, raVar3, ak0Var4, x4Var);
                p12.l(raVar4, ak0Var4, u71VarB3);
                u22 u22Var2 = es0Var.a;
                r22 r22Var = es0Var.b;
                String str4 = u22Var2.d;
                a90 a90Var = ik2.a;
                ef2.b(str4, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var4.j(a90Var)).g, ak0Var4, 0, 0, 131070);
                r02.b(ak0Var4, f52.n(r71Var, 12.0f));
                String strD = f22.d(es0Var.a, ak0Var4);
                vf2 vf2Var = ((gk2) ak0Var4.j(a90Var)).i;
                uv1 uv1Var = uv1.a;
                ef2.b(strD, uv1Var.a(r71Var, 1.0f), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var, ak0Var4, 0, 0, 131068);
                boolean z5 = r22Var.e;
                boolean zF6 = ak0Var4.f(ej0Var3) | ak0Var4.f(es0Var);
                Object objL11 = ak0Var4.L();
                if (zF6 || objL11 == is1Var) {
                    objL11 = new d(20, ej0Var3, es0Var);
                    ak0Var4.g0(objL11);
                }
                gb2.a(z5, (ej0) objL11, null, false, null, ak0Var4, 0);
                ak0Var4.p(true);
                u71 u71VarF0 = p61.f0(r71Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                sv1 sv1VarA2 = rv1.a(new he(12.0f, new ut(1)), q90.o, ak0Var4, 6);
                int iHashCode3 = Long.hashCode(ak0Var4.T);
                sl1 sl1VarL3 = ak0Var4.l();
                u71 u71VarB4 = nj2.B(ak0Var4, u71VarF0);
                ak0Var4.Z();
                if (ak0Var4.S) {
                    ak0Var4.k(wvVar);
                } else {
                    ak0Var4.j0();
                }
                p12.l(raVar, ak0Var4, sv1VarA2);
                p12.l(raVar2, ak0Var4, sl1VarL3);
                k3.q(iHashCode3, ak0Var4, raVar3, ak0Var4, x4Var);
                p12.l(raVar4, ak0Var4, u71VarB4);
                String str5 = (String) da1Var5.getValue();
                fg2 fg2VarL = mx.L(ak0Var4);
                boolean z6 = r22Var.e;
                aw0 aw0Var = new aw0(3, 0, 123);
                u71 u71VarA = uv1Var.a(r71Var, 1.0f);
                boolean zF7 = ak0Var4.f(da1Var5) | ak0Var4.f(ej0Var3) | ak0Var4.f(es0Var);
                Object objL12 = ak0Var4.L();
                if (zF7 || objL12 == is1Var) {
                    final int i5 = 0;
                    objL12 = new ej0() { // from class: is0
                        @Override // defpackage.ej0
                        public final Object h(Object obj14) {
                            int i6 = i5;
                            ll2 ll2Var2 = ll2.a;
                            da1 da1Var7 = da1Var5;
                            es0 es0Var2 = es0Var;
                            ej0 ej0Var4 = ej0Var3;
                            String str6 = (String) obj14;
                            switch (i6) {
                                case 0:
                                    str6.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    int length = str6.length();
                                    for (int i7 = 0; i7 < length; i7++) {
                                        char cCharAt = str6.charAt(i7);
                                        if (Character.isDigit(cCharAt)) {
                                            sb.append(cCharAt);
                                        }
                                    }
                                    da1Var7.setValue(h92.P(sb.toString(), 7));
                                    ej0Var4.h(r22.a(es0Var2.b, p61.p0((String) da1Var7.getValue()), null, false, 27));
                                    break;
                                default:
                                    str6.getClass();
                                    StringBuilder sb2 = new StringBuilder();
                                    int length2 = str6.length();
                                    for (int i8 = 0; i8 < length2; i8++) {
                                        char cCharAt2 = str6.charAt(i8);
                                        if (Character.isDigit(cCharAt2)) {
                                            sb2.append(cCharAt2);
                                        }
                                    }
                                    da1Var7.setValue(h92.P(sb2.toString(), 3));
                                    ej0Var4.h(r22.a(es0Var2.b, null, p61.p0((String) da1Var7.getValue()), false, 23));
                                    break;
                            }
                            return ll2Var2;
                        }
                    };
                    ak0Var4.g0(objL12);
                }
                ux.f(str5, (ej0) objL12, u71VarA, z6, false, null, dv1.f, null, null, null, false, fg2VarL, aw0Var, null, true, 0, 0, null, null, null, ak0Var4, 1572864, 12779520, 0, 8208304);
                String str6 = (String) da1Var6.getValue();
                boolean z7 = r22Var.e;
                aw0 aw0Var2 = new aw0(3, 0, 123);
                u71 u71VarA2 = uv1Var.a(r71Var, 1.0f);
                boolean zF8 = ak0Var4.f(da1Var6) | ak0Var4.f(ej0Var3) | ak0Var4.f(es0Var);
                Object objL13 = ak0Var4.L();
                if (zF8 || objL13 == is1Var) {
                    final int i6 = 1;
                    objL13 = new ej0() { // from class: is0
                        @Override // defpackage.ej0
                        public final Object h(Object obj14) {
                            int i7 = i6;
                            ll2 ll2Var2 = ll2.a;
                            da1 da1Var7 = da1Var6;
                            es0 es0Var2 = es0Var;
                            ej0 ej0Var4 = ej0Var3;
                            String str7 = (String) obj14;
                            switch (i7) {
                                case 0:
                                    str7.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    int length = str7.length();
                                    for (int i8 = 0; i8 < length; i8++) {
                                        char cCharAt = str7.charAt(i8);
                                        if (Character.isDigit(cCharAt)) {
                                            sb.append(cCharAt);
                                        }
                                    }
                                    da1Var7.setValue(h92.P(sb.toString(), 7));
                                    ej0Var4.h(r22.a(es0Var2.b, p61.p0((String) da1Var7.getValue()), null, false, 27));
                                    break;
                                default:
                                    str7.getClass();
                                    StringBuilder sb2 = new StringBuilder();
                                    int length2 = str7.length();
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        char cCharAt2 = str7.charAt(i9);
                                        if (Character.isDigit(cCharAt2)) {
                                            sb2.append(cCharAt2);
                                        }
                                    }
                                    da1Var7.setValue(h92.P(sb2.toString(), 3));
                                    ej0Var4.h(r22.a(es0Var2.b, null, p61.p0((String) da1Var7.getValue()), false, 23));
                                    break;
                            }
                            return ll2Var2;
                        }
                    };
                    ak0Var4.g0(objL13);
                }
                ux.f(str6, (ej0) objL13, u71VarA2, z7, false, null, dv1.g, null, null, null, false, null, aw0Var2, null, true, 0, 0, null, null, null, ak0Var4, 1572864, 12779520, 0, 8224688);
                ak0Var4.p(true);
                ak0Var4.p(true);
                return ll2Var;
            default:
                o72 o72Var = (o72) obj7;
                f11 f11Var = (f11) obj6;
                te2 te2Var = (te2) obj5;
                xf1 xf1Var = (xf1) obj4;
                u71 u71Var2 = (u71) obj;
                ak0 ak0Var5 = (ak0) obj2;
                ((Integer) obj3).getClass();
                ak0Var5.W(-84507373);
                boolean zBooleanValue2 = ((Boolean) ak0Var5.j(yv.x)).booleanValue();
                boolean zG = ak0Var5.g(zBooleanValue2);
                Object objL14 = ak0Var5.L();
                if (zG || objL14 == is1Var) {
                    objL14 = new rz(zBooleanValue2);
                    ak0Var5.g0(objL14);
                }
                rz rzVar = (rz) objL14;
                boolean z8 = o72Var.a != 16;
                if (((Boolean) ((x01) ((so2) ak0Var5.j(yv.u))).a.getValue()).booleanValue() && f11Var.b() && of2.c(te2Var.b) && z8) {
                    ak0Var5.W(-707487962);
                    yb ybVar = te2Var.a;
                    of2 of2Var = new of2(te2Var.b);
                    boolean zH2 = ak0Var5.h(rzVar);
                    Object objL15 = ak0Var5.L();
                    if (zH2 || objL15 == is1Var) {
                        objL15 = new ln(14, (sx) r7, rzVar);
                        ak0Var5.g0(objL15);
                    }
                    s5.p(ybVar, of2Var, (ij0) objL15, ak0Var5);
                    boolean zH3 = ak0Var5.h(rzVar) | ak0Var5.h(xf1Var) | ak0Var5.f(te2Var) | ak0Var5.h(f11Var) | ak0Var5.f(o72Var);
                    Object objL16 = ak0Var5.L();
                    if (zH3 || objL16 == is1Var) {
                        objL16 = new q2(rzVar, xf1Var, te2Var, f11Var, o72Var, 5);
                        ak0Var5.g0(objL16);
                    }
                    objN = ir2.n(u71Var2, (ej0) objL16);
                    ak0Var5.p(false);
                } else {
                    ak0Var5.W(-705473241);
                    ak0Var5.p(false);
                    objN = r71.a;
                }
                ak0Var5.p(false);
                return objN;
        }
    }

    public /* synthetic */ kz0(ij0 ij0Var, nx nxVar, jj0 jj0Var, ti0 ti0Var) {
        this.e = 3;
        this.g = ij0Var;
        this.h = nxVar;
        this.i = jj0Var;
        this.f = ti0Var;
    }

    public /* synthetic */ kz0(Object obj, Object obj2, da1 da1Var, Object obj3, int i) {
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.f = da1Var;
        this.i = obj3;
    }

    public /* synthetic */ kz0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = obj4;
    }
}

package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ir.alirezaivaz.mygarage.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class in implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ in(da1 da1Var, da1 da1Var2) {
        this.e = 8;
        this.g = da1Var;
        this.f = da1Var2;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.f;
        b8 b8Var = (b8) this.g;
        r72 r72Var = (r72) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        kg0 kg0Var = r72Var.f;
        lh0 lh0Var = r72Var.c;
        if (lh0Var == null) {
            lh0Var = lh0.i;
        }
        hh0 hh0Var = r72Var.d;
        int i = hh0Var != null ? hh0Var.a : 0;
        ih0 ih0Var = r72Var.e;
        int i2 = ih0Var != null ? ih0Var.a : 65535;
        c8 c8Var = (c8) b8Var.f;
        ek2 ek2VarB = ((lg0) c8Var.i).b(kg0Var, lh0Var, i, i2);
        if (ek2VarB instanceof dk2) {
            Object obj4 = ((dk2) ek2VarB).e;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            ud udVar = new ud(ek2VarB, c8Var.n);
            c8Var.n = udVar;
            Object obj5 = udVar.d;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new ng0(1, typeface), iIntValue, iIntValue2, 33);
        return ll2.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r32v3, types: [java.lang.Throwable] */
    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        mn mnVar;
        ak0 ak0Var;
        int i = this.e;
        int i2 = 3;
        int i3 = 21;
        r71 r71Var = r71.a;
        sx sxVar = null;
        int i4 = 18;
        is1 is1Var = cv.a;
        ll2 ll2Var = ll2.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        boolean z = false;
        final int i5 = 1;
        switch (i) {
            case 0:
                mn mnVar2 = (mn) obj5;
                da1 da1Var = (da1) obj4;
                gj1 gj1Var = (gj1) obj;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gj1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ak0Var2.f(gj1Var) ? 4 : 2;
                }
                if (!ak0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ak0Var2.R();
                    return ll2Var;
                }
                u71 u71VarD = ws0.D(vs0.j(p61.b0(f52.c, gj1Var), gj1Var));
                fe feVar = ws0.g;
                ui uiVar = q90.r;
                wr wrVarA = ur.a(feVar, uiVar, ak0Var2, 0);
                int iHashCode = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL = ak0Var2.l();
                u71 u71VarB = nj2.B(ak0Var2, u71VarD);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                ra raVar = vu.f;
                p12.l(raVar, ak0Var2, wrVarA);
                ra raVar2 = vu.e;
                p12.l(raVar2, ak0Var2, sl1VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                ra raVar3 = vu.g;
                p12.f(ak0Var2, numValueOf, raVar3);
                x4 x4Var = vu.h;
                p12.k(ak0Var2, x4Var);
                ra raVar4 = vu.d;
                p12.l(raVar4, ak0Var2, u71VarB);
                u71 u71VarC0 = p61.c0(nj2.J(new px0(1.0f, true), nj2.E(ak0Var2)), 16.0f);
                wr wrVarA2 = ur.a(new he(12.0f, new ut(1)), uiVar, ak0Var2, 6);
                int iHashCode2 = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL2 = ak0Var2.l();
                u71 u71VarB2 = nj2.B(ak0Var2, u71VarC0);
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                p12.l(raVar, ak0Var2, wrVarA2);
                p12.l(raVar2, ak0Var2, sl1VarL2);
                k3.q(iHashCode2, ak0Var2, raVar3, ak0Var2, x4Var);
                p12.l(raVar4, ak0Var2, u71VarB2);
                String str = ((kn) da1Var.getValue()).b;
                boolean zH = ak0Var2.h(mnVar2);
                Object objL = ak0Var2.L();
                if (zH || objL == is1Var) {
                    objL = new f(1, mnVar2, mn.class, "onNameChange", "onNameChange(Ljava/lang/String;)V", 0, 1);
                    ak0Var2.g0(objL);
                }
                qj0 qj0Var = (tj0) objL;
                boolean z2 = ((kn) da1Var.getValue()).j;
                gt gtVar = ((kn) da1Var.getValue()).j ? ir2.h : null;
                gd0 gd0Var = f52.a;
                ux.f(str, (ej0) qj0Var, gd0Var, false, false, null, ir2.i, ir2.j, null, gtVar, z2, null, null, null, true, 0, 0, null, null, null, ak0Var2, 14156160, 12582912, 0, 8245048);
                sv1 sv1VarA = rv1.a(new he(12.0f, new ut(1)), q90.o, ak0Var2, 6);
                int iHashCode3 = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL3 = ak0Var2.l();
                r71 r71Var2 = r71.a;
                u71 u71VarB3 = nj2.B(ak0Var2, r71Var2);
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                p12.l(raVar, ak0Var2, sv1VarA);
                p12.l(raVar2, ak0Var2, sl1VarL3);
                k3.q(iHashCode3, ak0Var2, raVar3, ak0Var2, x4Var);
                p12.l(raVar4, ak0Var2, u71VarB3);
                String str2 = ((kn) da1Var.getValue()).c;
                boolean zH2 = ak0Var2.h(mnVar2);
                Object objL2 = ak0Var2.L();
                if (zH2 || objL2 == is1Var) {
                    objL2 = new f(1, mnVar2, mn.class, "onMakeChange", "onMakeChange(Ljava/lang/String;)V", 0, 2);
                    ak0Var2.g0(objL2);
                }
                qj0 qj0Var2 = (tj0) objL2;
                if (1.0f <= 0.0d) {
                    tp0.a("invalid weight; must be greater than zero");
                }
                ux.f(str2, (ej0) qj0Var2, new px0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, false, null, ir2.k, null, null, null, false, null, null, null, true, 0, 0, null, null, null, ak0Var2, 1572864, 12582912, 0, 8257464);
                String str3 = ((kn) da1Var.getValue()).d;
                boolean zH3 = ak0Var2.h(mnVar2);
                Object objL3 = ak0Var2.L();
                if (zH3 || objL3 == is1Var) {
                    objL3 = new f(1, mnVar2, mn.class, "onModelChange", "onModelChange(Ljava/lang/String;)V", 0, 3);
                    ak0Var2.g0(objL3);
                }
                qj0 qj0Var3 = (tj0) objL3;
                if (1.0f <= 0.0d) {
                    tp0.a("invalid weight; must be greater than zero");
                }
                ux.f(str3, (ej0) qj0Var3, new px0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, false, null, ir2.l, null, null, null, false, null, null, null, true, 0, 0, null, null, null, ak0Var2, 1572864, 12582912, 0, 8257464);
                ak0Var2.p(true);
                String str4 = ((kn) da1Var.getValue()).e;
                boolean zH4 = ak0Var2.h(mnVar2);
                Object objL4 = ak0Var2.L();
                if (zH4 || objL4 == is1Var) {
                    objL4 = new f(1, mnVar2, mn.class, "onYearChange", "onYearChange(Ljava/lang/String;)V", 0, 4);
                    ak0Var2.g0(objL4);
                }
                ux.f(str4, (ej0) ((tj0) objL4), gd0Var, false, false, null, ir2.m, null, null, null, false, null, new aw0(3, 0, 123), null, true, 0, 0, null, null, null, ak0Var2, 1573248, 12779520, 0, 8224696);
                wr wrVarA3 = ur.a(feVar, uiVar, ak0Var2, 0);
                int iHashCode4 = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL4 = ak0Var2.l();
                u71 u71VarB4 = nj2.B(ak0Var2, r71Var2);
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                p12.l(raVar, ak0Var2, wrVarA3);
                p12.l(raVar2, ak0Var2, sl1VarL4);
                k3.q(iHashCode4, ak0Var2, raVar3, ak0Var2, x4Var);
                p12.l(raVar4, ak0Var2, u71VarB4);
                ef2.b(j02.r(R.string.car_field_plate, ak0Var2), p61.f0(r71Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), ((jr) ak0Var2.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(ik2.a)).l, ak0Var2, 48, 0, 131064);
                j11 j11Var = ((kn) da1Var.getValue()).f;
                boolean zH5 = ak0Var2.h(mnVar2);
                Object objL5 = ak0Var2.L();
                if (zH5 || objL5 == is1Var) {
                    objL5 = new f(1, mnVar2, mn.class, "onPlateTwoDigitsChange", "onPlateTwoDigitsChange(Ljava/lang/String;)V", 0, 5);
                    ak0Var2.g0(objL5);
                }
                ej0 ej0Var = (ej0) ((tj0) objL5);
                boolean zH6 = ak0Var2.h(mnVar2);
                Object objL6 = ak0Var2.L();
                if (zH6 || objL6 == is1Var) {
                    objL6 = new f(1, mnVar2, mn.class, "onPlateLetterChange", "onPlateLetterChange(Ljava/lang/String;)V", 0, 6);
                    ak0Var2.g0(objL6);
                }
                ej0 ej0Var2 = (ej0) ((tj0) objL6);
                boolean zH7 = ak0Var2.h(mnVar2);
                Object objL7 = ak0Var2.L();
                if (zH7 || objL7 == is1Var) {
                    objL7 = new f(1, mnVar2, mn.class, "onPlateThreeDigitsChange", "onPlateThreeDigitsChange(Ljava/lang/String;)V", 0, 7);
                    ak0Var2.g0(objL7);
                }
                ej0 ej0Var3 = (ej0) ((tj0) objL7);
                boolean zH8 = ak0Var2.h(mnVar2);
                Object objL8 = ak0Var2.L();
                if (zH8 || objL8 == is1Var) {
                    objL8 = new f(1, mnVar2, mn.class, "onPlateRegionChange", "onPlateRegionChange(Ljava/lang/String;)V", 0, 8);
                    ak0Var2.g0(objL8);
                }
                s5.t(j11Var, ej0Var, ej0Var2, ej0Var3, (ej0) ((tj0) objL8), null, ak0Var2, 0);
                ak0Var2.p(true);
                ni0 ni0Var = ((kn) da1Var.getValue()).g;
                boolean zH9 = ak0Var2.h(mnVar2);
                Object objL9 = ak0Var2.L();
                if (zH9 || objL9 == is1Var) {
                    objL9 = new f(1, mnVar2, mn.class, "onFuelTypeChange", "onFuelTypeChange(Lir/alirezaivaz/mygarage/domain/model/FuelType;)V", 0, 9);
                    ak0Var2.g0(objL9);
                }
                s5.g(ni0Var, (ej0) ((tj0) objL9), ak0Var2, 0);
                String str5 = ((kn) da1Var.getValue()).h;
                boolean zH10 = ak0Var2.h(mnVar2);
                Object objL10 = ak0Var2.L();
                if (zH10 || objL10 == is1Var) {
                    objL10 = new f(1, mnVar2, mn.class, "onOdometerChange", "onOdometerChange(Ljava/lang/String;)V", 0, 10);
                    ak0Var2.g0(objL10);
                }
                ux.f(str5, (ej0) ((tj0) objL10), gd0Var, false, false, null, ir2.n, null, null, null, false, mx.L(ak0Var2), new aw0(3, 0, 123), null, true, 0, 0, null, null, null, ak0Var2, 1573248, 12779520, 0, 8208312);
                String str6 = ((kn) da1Var.getValue()).i;
                boolean zH11 = ak0Var2.h(mnVar2);
                Object objL11 = ak0Var2.L();
                if (zH11 || objL11 == is1Var) {
                    mnVar = mnVar2;
                    f fVar = new f(1, mnVar, mn.class, "onTypicalDailyKmChange", "onTypicalDailyKmChange(Ljava/lang/String;)V", 0, 11);
                    ak0Var2.g0(fVar);
                    objL11 = fVar;
                } else {
                    mnVar = mnVar2;
                }
                ux.f(str6, (ej0) ((tj0) objL11), gd0Var, false, false, null, ir2.o, null, null, ir2.p, false, mx.L(ak0Var2), new aw0(3, 7, 115), null, true, 0, 0, null, null, null, ak0Var2, 1573248, 12779904, 0, 8204216);
                ak0Var2.p(true);
                p61.h(null, 0.0f, 0L, ak0Var2, 0, 7);
                boolean zH12 = ak0Var2.h(mnVar);
                Object objL12 = ak0Var2.L();
                if (zH12 || objL12 == is1Var) {
                    objL12 = new t4(0, mnVar, mn.class, "save", "save()V", 0, 1);
                    ak0Var2.g0(objL12);
                }
                j20.c((ti0) ((tj0) objL12), p61.d0(gd0Var, 16.0f, 8.0f), false, null, null, null, null, ir2.q, ak0Var2, 805306416, 508);
                ak0Var2.p(true);
                return ll2Var;
            case 1:
                p82 p82Var = (p82) obj5;
                ij0 ij0Var = (ij0) obj4;
                gj1 gj1Var2 = (gj1) obj;
                ak0 ak0Var3 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gj1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ak0Var3.f(gj1Var2) ? 4 : 2;
                }
                if (!ak0Var3.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ak0Var3.R();
                } else if (((oi0) p82Var.getValue()).e || !((oi0) p82Var.getValue()).c.isEmpty()) {
                    ak0Var3.W(1361809287);
                    ak0Var3.p(false);
                    u71 u71VarB0 = p61.b0(f52.c, gj1Var2);
                    kj1 kj1Var = new kj1(16.0f, 16.0f, 16.0f, 96.0f);
                    he heVar = new he(12.0f, new ut(1));
                    boolean zF = ak0Var3.f(p82Var) | ak0Var3.f(ij0Var);
                    Object objL13 = ak0Var3.L();
                    if (zF || objL13 == is1Var) {
                        objL13 = new hi0(p82Var, ij0Var, z ? 1 : 0);
                        ak0Var3.g0(objL13);
                    }
                    mx.e(u71VarB0, null, kj1Var, heVar, null, null, false, null, (ej0) objL13, ak0Var3, 24960, 490);
                } else {
                    ak0Var3.W(1364948812);
                    dv1.f("⛽", j02.r(R.string.fuel_empty, ak0Var3), j02.r(R.string.fuel_need_two, ak0Var3), p61.b0(r71Var, gj1Var2), null, null, ak0Var3, 6, 48);
                    ak0Var3.p(false);
                }
                return ll2Var;
            case 2:
                p82 p82Var2 = (p82) obj5;
                ls0 ls0Var = (ls0) obj4;
                gj1 gj1Var3 = (gj1) obj;
                ak0 ak0Var4 = (ak0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gj1Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ak0Var4.f(gj1Var3) ? 4 : 2;
                }
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    u71 u71VarD2 = ws0.D(vs0.j(p61.b0(f52.c, gj1Var3), gj1Var3));
                    kj1 kj1Var2 = new kj1(16.0f, 16.0f, 16.0f, 16.0f);
                    he heVar2 = new he(12.0f, new ut(1));
                    boolean zF2 = ak0Var4.f(p82Var2) | ak0Var4.h(ls0Var);
                    Object objL14 = ak0Var4.L();
                    if (zF2 || objL14 == is1Var) {
                        objL14 = new d(i3, p82Var2, ls0Var);
                        ak0Var4.g0(objL14);
                    }
                    mx.e(u71VarD2, null, kj1Var2, heVar2, null, null, false, null, (ej0) objL14, ak0Var4, 24960, 490);
                } else {
                    ak0Var4.R();
                }
                return ll2Var;
            case 3:
                ej0 ej0Var4 = (ej0) obj5;
                lx lxVar = (lx) obj4;
                ak0 ak0Var5 = (ak0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (ak0Var5.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    Object objL15 = ak0Var5.L();
                    if (objL15 == is1Var) {
                        objL15 = new nx();
                        ak0Var5.g0(objL15);
                    }
                    nx nxVar = (nx) objL15;
                    nxVar.a.clear();
                    ej0Var4.h(nxVar);
                    nxVar.a(lxVar, ak0Var5, 0);
                } else {
                    ak0Var5.R();
                }
                return ll2Var;
            case 4:
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                ak0 ak0Var6 = (ak0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var6.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    r71 r71Var3 = r71.a;
                    u71 u71VarC1 = p61.c0(r71Var3, 12.0f);
                    wr wrVarA4 = ur.a(ws0.g, q90.r, ak0Var6, 0);
                    int iHashCode5 = Long.hashCode(ak0Var6.T);
                    sl1 sl1VarL5 = ak0Var6.l();
                    u71 u71VarB5 = nj2.B(ak0Var6, u71VarC1);
                    wu.c.getClass();
                    wv wvVar2 = vu.b;
                    ak0Var6.Z();
                    if (ak0Var6.S) {
                        ak0Var6.k(wvVar2);
                    } else {
                        ak0Var6.j0();
                    }
                    p12.l(vu.f, ak0Var6, wrVarA4);
                    p12.l(vu.e, ak0Var6, sl1VarL5);
                    p12.f(ak0Var6, Integer.valueOf(iHashCode5), vu.g);
                    p12.k(ak0Var6, vu.h);
                    p12.l(vu.d, ak0Var6, u71VarB5);
                    a90 a90Var = ik2.a;
                    ef2.b(str7, null, ((jr) ak0Var6.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var6.j(a90Var)).l, ak0Var6, 0, 0, 131066);
                    ef2.b(str8, p61.f0(r71Var3, 0.0f, 2.0f, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var6.j(a90Var)).h, ak0Var6, 48, 0, 131068);
                    ak0Var6.p(true);
                } else {
                    ak0Var6.R();
                }
                return ll2Var;
            case 5:
                rm0 rm0Var = (rm0) obj5;
                p82 p82Var3 = (p82) obj4;
                ak0 ak0Var7 = (ak0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var7.O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean z3 = ((om0) p82Var3.getValue()).d == 0;
                    boolean zH13 = ak0Var7.h(rm0Var);
                    Object objL16 = ak0Var7.L();
                    if (zH13 || objL16 == is1Var) {
                        objL16 = new w8(11, rm0Var);
                        ak0Var7.g0(objL16);
                    }
                    sp.b(z3, (ti0) objL16, sv0.i, null, false, null, null, null, null, ak0Var7, 384);
                } else {
                    ak0Var7.R();
                }
                return ll2Var;
            case 6:
                mi0 mi0Var = (mi0) obj5;
                ti0 ti0Var = (ti0) obj4;
                ak0 ak0Var8 = (ak0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((vy0) obj).getClass();
                if (ak0Var8.O(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    gn0.b(mi0Var, ti0Var, ak0Var8, 8);
                } else {
                    ak0Var8.R();
                }
                return ll2Var;
            case 7:
                js jsVar = (js) obj5;
                ej0 ej0Var5 = (ej0) obj4;
                y42 y42Var = (y42) obj;
                ak0 ak0Var9 = (ak0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                y42Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ak0Var9.f(y42Var) ? 4 : 2;
                }
                if (ak0Var9.O(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    yb0 yb0Var = is.h;
                    int i6 = 0;
                    for (Object obj6 : yb0Var) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            ?? r32 = sxVar;
                            vs0.D();
                            throw r32;
                        }
                        is isVar = (is) obj6;
                        sx sxVar2 = sxVar;
                        ?? r20 = jsVar.b == isVar ? i5 : 0;
                        int i8 = i5;
                        boolean zD = ak0Var9.d(isVar.ordinal()) | ak0Var9.f(ej0Var5);
                        Object objL17 = ak0Var9.L();
                        if (zD || objL17 == is1Var) {
                            objL17 = new n1(25, ej0Var5, isVar);
                            ak0Var9.g0(objL17);
                        }
                        kz1 kz1Var = kz1.a;
                        rw.i(y42Var, r20, (ti0) objL17, kz1.c(i6, yb0Var.a(), ak0Var9), null, false, null, null, null, null, vs0.C(994274650, new x7(i4, isVar), ak0Var9), ak0Var9, iIntValue8 & 14);
                        i6 = i7;
                        sxVar = sxVar2;
                        i5 = i8;
                    }
                } else {
                    ak0Var9.R();
                }
                return ll2Var;
            case 8:
                da1 da1Var2 = (da1) obj4;
                da1 da1Var3 = (da1) obj5;
                ak0 ak0Var10 = (ak0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((tv1) obj).getClass();
                if (ak0Var10.O(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    if (((d41) da1Var2.getValue()).a != 0) {
                        ak0Var10.W(1630585355);
                        Object objL18 = ak0Var10.L();
                        if (objL18 == is1Var) {
                            objL18 = new r9(da1Var3, 25);
                            ak0Var10.g0(objL18);
                        }
                        j20.d((ti0) objL18, null, false, null, null, nj2.i, ak0Var10, 1572870, 62);
                        ak0Var = ak0Var10;
                    } else {
                        ak0Var = ak0Var10;
                        ak0Var.W(1626599995);
                    }
                    ak0Var.p(false);
                } else {
                    ak0Var10.R();
                }
                return ll2Var;
            case 9:
                final f41 f41Var = (f41) obj5;
                da1 da1Var4 = (da1) obj4;
                y42 y42Var2 = (y42) obj;
                ak0 ak0Var11 = (ak0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                y42Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ak0Var11.f(y42Var2) ? 4 : 2;
                }
                if (ak0Var11.O(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    boolean z4 = ((d41) da1Var4.getValue()).j == d22.e;
                    boolean zH14 = ak0Var11.h(f41Var);
                    Object objL19 = ak0Var11.L();
                    if (zH14 || objL19 == is1Var) {
                        final int i9 = z ? 1 : 0;
                        objL19 = new ti0() { // from class: c41
                            @Override // defpackage.ti0
                            public final Object a() {
                                int i10 = i9;
                                ll2 ll2Var2 = ll2.a;
                                f41 f41Var2 = f41Var;
                                switch (i10) {
                                    case 0:
                                        f41Var2.f(d22.e);
                                        break;
                                    default:
                                        f41Var2.f(d22.f);
                                        break;
                                }
                                return ll2Var2;
                            }
                        };
                        ak0Var11.g0(objL19);
                    }
                    kz1 kz1Var2 = kz1.a;
                    int i10 = iIntValue10 & 14;
                    rw.i(y42Var2, z4, (ti0) objL19, kz1.c(0, 2, ak0Var11), null, false, null, null, null, null, nj2.j, ak0Var11, i10);
                    boolean z5 = ((d41) da1Var4.getValue()).j == d22.f;
                    boolean zH15 = ak0Var11.h(f41Var);
                    Object objL20 = ak0Var11.L();
                    if (zH15 || objL20 == is1Var) {
                        objL20 = new ti0() { // from class: c41
                            @Override // defpackage.ti0
                            public final Object a() {
                                int i11 = i5;
                                ll2 ll2Var2 = ll2.a;
                                f41 f41Var2 = f41Var;
                                switch (i11) {
                                    case 0:
                                        f41Var2.f(d22.e);
                                        break;
                                    default:
                                        f41Var2.f(d22.f);
                                        break;
                                }
                                return ll2Var2;
                            }
                        };
                        ak0Var11.g0(objL20);
                    }
                    rw.i(y42Var2, z5, (ti0) objL20, kz1.c(1, 2, ak0Var11), null, false, null, null, null, null, nj2.k, ak0Var11, i10);
                } else {
                    ak0Var11.R();
                }
                return ll2Var;
            case 10:
                e4 e4Var = (e4) obj4;
                int iIntValue11 = ((Integer) obj).intValue();
                String str9 = (String) obj2;
                xc1 xc1Var = (xc1) obj3;
                str9.getClass();
                xc1Var.getClass();
                Object obj7 = ((Map) obj5).get(str9);
                obj7.getClass();
                List list = (List) obj7;
                int iOrdinal = (((xc1Var instanceof uq) || ((mv0) e4Var.e).c().k(iIntValue11)) ? mv1.f : mv1.e).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        qj.p();
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        e4Var.f(str9, (String) it.next());
                    }
                } else {
                    if (list.size() != 1) {
                        throw new IllegalArgumentException(("Expected one value for argument " + str9 + ", found " + list.size() + "values instead.").toString());
                    }
                    e4Var.g = ((String) e4Var.g) + '/' + ((String) vq.Q(list));
                }
                return ll2Var;
            case 11:
                ti0 ti0Var2 = (ti0) obj5;
                ej0 ej0Var6 = (ej0) obj4;
                ak0 ak0Var12 = (ak0) obj2;
                ((Integer) obj3).getClass();
                ak0Var12.W(759876635);
                Object objL21 = ak0Var12.L();
                Object obj8 = objL21;
                if (objL21 == is1Var) {
                    v40 v40VarB = e72.b(ti0Var2);
                    ak0Var12.g0(v40VarB);
                    obj8 = v40VarB;
                }
                p82 p82Var4 = (p82) obj8;
                Object objL22 = ak0Var12.L();
                Object obj9 = objL22;
                if (objL22 == is1Var) {
                    uf1 uf1Var = (uf1) p82Var4.getValue();
                    long j = uf1Var.a;
                    ia iaVar = new ia(uf1Var, f02.b, new uf1(f02.c), 8);
                    ak0Var12.g0(iaVar);
                    obj9 = iaVar;
                }
                ia iaVar2 = (ia) obj9;
                boolean zH16 = ak0Var12.h(iaVar2);
                Object objL23 = ak0Var12.L();
                Object obj10 = objL23;
                if (zH16 || objL23 == is1Var) {
                    g gVar = new g(i3, sxVar, p82Var4, iaVar2);
                    ak0Var12.g0(gVar);
                    obj10 = gVar;
                }
                s5.o((ij0) obj10, ak0Var12, ll2Var);
                ob obVar = iaVar2.c;
                boolean zF3 = ak0Var12.f(obVar);
                Object objL24 = ak0Var12.L();
                if (zF3 || objL24 == is1Var) {
                    objL24 = new nc1(obVar, i2);
                    ak0Var12.g0(objL24);
                }
                u71 u71Var = (u71) ej0Var6.h((ti0) objL24);
                ak0Var12.p(false);
                return u71Var;
            case 12:
                return e(obj, obj2, obj3);
            default:
                ej0 ej0Var7 = (ej0) obj5;
                f91 f91Var = (f91) obj4;
                ak0 ak0Var13 = (ak0) obj2;
                ((Integer) obj3).getClass();
                ak0Var13.W(-102778667);
                Object objL25 = ak0Var13.L();
                Object obj11 = objL25;
                if (objL25 == is1Var) {
                    ez ezVarE = s5.E(ak0Var13);
                    ak0Var13.g0(ezVarE);
                    obj11 = ezVarE;
                }
                ez ezVar = (ez) obj11;
                Object objL26 = ak0Var13.L();
                Object obj12 = objL26;
                if (objL26 == is1Var) {
                    dk1 dk1VarS = y12.s(null);
                    ak0Var13.g0(dk1VarS);
                    obj12 = dk1VarS;
                }
                da1 da1Var5 = (da1) obj12;
                da1 da1VarT = y12.t(ej0Var7, ak0Var13);
                boolean zF4 = ak0Var13.f(f91Var);
                Object objL27 = ak0Var13.L();
                Object obj13 = objL27;
                if (zF4 || objL27 == is1Var) {
                    kc1 kc1Var = new kc1(17, da1Var5, f91Var);
                    ak0Var13.g0(kc1Var);
                    obj13 = kc1Var;
                }
                s5.e(f91Var, (ej0) obj13, ak0Var13);
                boolean zH17 = ak0Var13.h(ezVar) | ak0Var13.f(f91Var) | ak0Var13.f(da1VarT);
                Object objL28 = ak0Var13.L();
                Object obj14 = objL28;
                if (zH17 || objL28 == is1Var) {
                    ae2 ae2Var = new ae2(ezVar, da1Var5, f91Var, da1VarT);
                    ak0Var13.g0(ae2Var);
                    obj14 = ae2Var;
                }
                u71 u71VarA = ya2.a(r71Var, f91Var, (PointerInputEventHandler) obj14);
                ak0Var13.p(false);
                return u71VarA;
        }
    }

    public /* synthetic */ in(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}

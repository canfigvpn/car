package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn0 {
    public static final og0 a;

    static {
        List listAsList = Arrays.asList(vv.b(R.font.dseg7_classic_bold, null, 14));
        listAsList.getClass();
        a = new og0(listAsList);
    }

    public static final void a(final wm wmVar, final int i, final pf1 pf1Var, final ti0 ti0Var, ak0 ak0Var, int i2) {
        ak0 ak0Var2;
        ak0Var.X(-1342550524);
        int i3 = (ak0Var.f(wmVar) ? 4 : 2) | i2 | (ak0Var.d(i) ? 32 : 16) | (ak0Var.f(pf1Var) ? 256 : 128);
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            ak0Var2 = ak0Var;
            nj2.d(f52.a, null, null, null, vs0.C(516754642, new jj0() { // from class: zm0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v6 */
                /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v9 */
                @Override // defpackage.jj0
                public final Object d(Object obj, Object obj2, Object obj3) {
                    zm0 zm0Var;
                    ?? r15;
                    ak0 ak0Var3;
                    ak0 ak0Var4 = (ak0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ee eeVar = ws0.e;
                    vi viVar = q90.p;
                    ui uiVar = q90.r;
                    fe feVar = ws0.g;
                    ((xr) obj).getClass();
                    if (ak0Var4.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                        u71 u71VarC0 = p61.c0(f52.a, 16.0f);
                        wr wrVarA = ur.a(feVar, uiVar, ak0Var4, 0);
                        int iHashCode = Long.hashCode(ak0Var4.T);
                        sl1 sl1VarL = ak0Var4.l();
                        u71 u71VarB = nj2.B(ak0Var4, u71VarC0);
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
                        p12.l(raVar4, ak0Var4, u71VarB);
                        sv1 sv1VarA = rv1.a(eeVar, viVar, ak0Var4, 48);
                        int iHashCode2 = Long.hashCode(ak0Var4.T);
                        sl1 sl1VarL2 = ak0Var4.l();
                        r71 r71Var = r71.a;
                        u71 u71VarB2 = nj2.B(ak0Var4, r71Var);
                        ak0Var4.Z();
                        if (ak0Var4.S) {
                            ak0Var4.k(wvVar);
                        } else {
                            ak0Var4.j0();
                        }
                        p12.l(raVar, ak0Var4, sv1VarA);
                        p12.l(raVar2, ak0Var4, sl1VarL2);
                        k3.q(iHashCode2, ak0Var4, raVar3, ak0Var4, x4Var);
                        p12.l(raVar4, ak0Var4, u71VarB2);
                        px0 px0Var = new px0(1.0f, true);
                        wr wrVarA2 = ur.a(feVar, uiVar, ak0Var4, 0);
                        int iHashCode3 = Long.hashCode(ak0Var4.T);
                        sl1 sl1VarL3 = ak0Var4.l();
                        u71 u71VarB3 = nj2.B(ak0Var4, px0Var);
                        ak0Var4.Z();
                        if (ak0Var4.S) {
                            ak0Var4.k(wvVar);
                        } else {
                            ak0Var4.j0();
                        }
                        p12.l(raVar, ak0Var4, wrVarA2);
                        p12.l(raVar2, ak0Var4, sl1VarL3);
                        k3.q(iHashCode3, ak0Var4, raVar3, ak0Var4, x4Var);
                        p12.l(raVar4, ak0Var4, u71VarB3);
                        wm wmVar2 = wmVar;
                        ef2.b(wmVar2.b, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var4.j(ik2.a)).g, ak0Var4, 0, 0, 131070);
                        ak0 ak0Var5 = ak0Var4;
                        String str = wmVar2.c;
                        String str2 = wmVar2.d;
                        Integer num = wmVar2.e;
                        String string = num != null ? num.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        List listV = vs0.v(str, str2, string);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : listV) {
                            if (!h92.I((String) obj4)) {
                                arrayList.add(obj4);
                            }
                        }
                        String strV = vq.V(arrayList, " ", null, null, null, 62);
                        if (h92.I(strV)) {
                            ak0Var5.W(-824238752);
                        } else {
                            ak0Var5.W(-810083253);
                            ef2.b(strV, null, ((jr) ak0Var5.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var5.j(ik2.a)).k, ak0Var5, 0, 0, 131066);
                            ak0Var5 = ak0Var5;
                        }
                        ak0Var5.p(false);
                        ak0Var5.p(true);
                        s5.q(wmVar2.f, null, ak0Var5, 0);
                        ak0Var5.p(true);
                        p61.h(p61.e0(r71Var, 0.0f, 12.0f, 1), 0.0f, 0L, ak0Var5, 6, 6);
                        sv1 sv1VarA2 = rv1.a(eeVar, viVar, ak0Var5, 48);
                        int iHashCode4 = Long.hashCode(ak0Var5.T);
                        sl1 sl1VarL4 = ak0Var5.l();
                        u71 u71VarB4 = nj2.B(ak0Var5, r71Var);
                        wu.c.getClass();
                        wv wvVar2 = vu.b;
                        ak0Var5.Z();
                        if (ak0Var5.S) {
                            ak0Var5.k(wvVar2);
                        } else {
                            ak0Var5.j0();
                        }
                        ra raVar5 = vu.f;
                        p12.l(raVar5, ak0Var5, sv1VarA2);
                        ra raVar6 = vu.e;
                        p12.l(raVar6, ak0Var5, sl1VarL4);
                        Integer numValueOf2 = Integer.valueOf(iHashCode4);
                        ra raVar7 = vu.g;
                        p12.f(ak0Var5, numValueOf2, raVar7);
                        x4 x4Var2 = vu.h;
                        p12.k(ak0Var5, x4Var2);
                        ra raVar8 = vu.d;
                        p12.l(raVar8, ak0Var5, u71VarB4);
                        px0 px0Var2 = new px0(1.0f, true);
                        wr wrVarA3 = ur.a(feVar, uiVar, ak0Var5, 0);
                        int iHashCode5 = Long.hashCode(ak0Var5.T);
                        sl1 sl1VarL5 = ak0Var5.l();
                        u71 u71VarB5 = nj2.B(ak0Var5, px0Var2);
                        ak0Var5.Z();
                        if (ak0Var5.S) {
                            ak0Var5.k(wvVar2);
                        } else {
                            ak0Var5.j0();
                        }
                        p12.l(raVar5, ak0Var5, wrVarA3);
                        p12.l(raVar6, ak0Var5, sl1VarL5);
                        k3.q(iHashCode5, ak0Var5, raVar7, ak0Var5, x4Var2);
                        p12.l(raVar8, ak0Var5, u71VarB5);
                        String strR = j02.r(R.string.car_field_odometer, ak0Var5);
                        a90 a90Var = ik2.a;
                        vf2 vf2Var = ((gk2) ak0Var5.j(a90Var)).k;
                        a90 a90Var2 = lr.a;
                        ak0 ak0Var6 = ak0Var5;
                        ef2.b(strR, null, ((jr) ak0Var5.j(a90Var2)).s, 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var, ak0Var6, 0, 0, 131066);
                        ak0 ak0Var7 = ak0Var6;
                        pf1 pf1Var2 = pf1Var;
                        if (pf1Var2 == null || pf1Var2.a - pf1Var2.c <= 0) {
                            zm0Var = this;
                            r15 = 0;
                            ak0Var7.W(1389533943);
                            ak0Var3 = ak0Var7;
                        } else {
                            ak0Var7.W(1404754478);
                            String strS = j02.s(R.string.home_odometer_estimated, new Object[]{f22.b(p61.i0(pf1Var2.b), ak0Var7)}, ak0Var7);
                            vf2 vf2Var2 = ((gk2) ak0Var7.j(a90Var)).l;
                            zm0Var = this;
                            ef2.b(strS, null, ((jr) ak0Var7.j(a90Var2)).s, 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var2, ak0Var7, 0, 0, 131066);
                            ak0Var3 = ak0Var7;
                            r15 = 0;
                        }
                        ak0Var3.p(r15);
                        ak0Var3.p(true);
                        gn0.e(i, r15, ak0Var3);
                        ak0 ak0Var8 = ak0Var3;
                        j20.d(ti0Var, null, false, null, null, p61.n, ak0Var8, 1572864, 62);
                        ak0Var8.p(true);
                        ak0Var8.p(true);
                    } else {
                        ak0Var4.R();
                    }
                    return ll2.a;
                }
            }, ak0Var), ak0Var2, 196614);
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(wmVar, i, pf1Var, ti0Var, i2, 9);
        }
    }

    public static final void b(mi0 mi0Var, ti0 ti0Var, ak0 ak0Var, int i) {
        ak0Var.X(-1502343909);
        int i2 = (ak0Var.h(mi0Var) ? 4 : 2) | i | (ak0Var.h(ti0Var) ? 32 : 16);
        int i3 = 0;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            nj2.c(ti0Var, f52.a, false, null, null, null, vs0.C(1193613062, new xm0(mi0Var, i3), ak0Var), ak0Var, ((i2 >> 3) & 14) | 100663344);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(mi0Var, ti0Var, i, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void c(ti0 ti0Var, ej0 ej0Var, ij0 ij0Var, ej0 ej0Var2, ti0 ti0Var2, ln0 ln0Var, ak0 ak0Var, int i) {
        ln0 ln0Var2;
        ln0 ln0Var3;
        int i2;
        is1 is1Var;
        boolean z;
        ln0 ln0Var4;
        ?? r13;
        da1 da1Var;
        da1 da1Var2;
        ak0 ak0Var2 = ak0Var;
        ti0Var.getClass();
        ej0Var.getClass();
        ij0Var.getClass();
        ej0Var2.getClass();
        ti0Var2.getClass();
        ak0Var2.X(-494472784);
        int i3 = i | (ak0Var2.h(ti0Var) ? 4 : 2) | (ak0Var2.h(ej0Var) ? 32 : 16) | (ak0Var2.h(ij0Var) ? 256 : 128) | (ak0Var2.h(ej0Var2) ? 2048 : 1024) | (ak0Var2.h(ti0Var2) ? 16384 : 8192) | 65536;
        if (ak0Var2.O(i3 & 1, (74899 & i3) != 74898)) {
            ak0Var2.T();
            if ((i & 1) == 0 || ak0Var2.y()) {
                co2 co2VarA = o31.a(ak0Var2);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ln0Var3 = (ln0) p12.r(js1.a(ln0.class), co2VarA, sv.y(co2VarA, ak0Var2), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var2);
            } else {
                ak0Var2.R();
                ln0Var3 = ln0Var;
            }
            ak0Var2.q();
            da1 da1VarR = qx.r(ln0Var3.e, ak0Var2);
            Object objL = ak0Var2.L();
            is1 is1Var2 = cv.a;
            if (objL == is1Var2) {
                objL = y12.s(Boolean.FALSE);
                ak0Var2.g0(objL);
            }
            da1 da1Var3 = (da1) objL;
            Object objL2 = ak0Var2.L();
            if (objL2 == is1Var2) {
                objL2 = y12.s(Boolean.FALSE);
                ak0Var2.g0(objL2);
            }
            da1 da1Var4 = (da1) objL2;
            Object objL3 = ak0Var2.L();
            if (objL3 == is1Var2) {
                objL3 = y12.s(Boolean.FALSE);
                ak0Var2.g0(objL3);
            }
            da1 da1Var5 = (da1) objL3;
            wm wmVar = ((hn0) da1VarR.getValue()).a;
            q01 q01VarA = r01.a(0, 3, ak0Var2);
            Long lValueOf = wmVar != null ? Long.valueOf(wmVar.a) : null;
            boolean zF = ak0Var2.f(q01VarA);
            Object objL4 = ak0Var2.L();
            if (zF || objL4 == is1Var2) {
                objL4 = new n10(q01VarA, (sx) null, 2);
                ak0Var2.g0(objL4);
            }
            s5.o((ij0) objL4, ak0Var2, lValueOf);
            WeakHashMap weakHashMap = fq2.v;
            ln0 ln0Var5 = ln0Var3;
            ix.f(null, vs0.C(1945483628, new cn0(ti0Var, wmVar, da1Var3, ej0Var2, ej0Var, da1Var4), ak0Var2), null, null, vs0.C(1028580041, new jd(19, wmVar, ij0Var), ak0Var2), 0, 0L, 0L, new h21(new kl2(p12.b(ak0Var2).g, p12.b(ak0Var2).b), 15), vs0.C(1359040257, new dn0(wmVar, ti0Var, q01VarA, da1VarR, ti0Var2, ij0Var, da1Var5), ak0Var2), ak0Var2, 805330992, 237);
            if (((Boolean) da1Var4.getValue()).booleanValue()) {
                ak0Var2.W(906852754);
                Object objL5 = ak0Var2.L();
                if (objL5 == is1Var2) {
                    da1Var2 = da1Var4;
                    objL5 = new r9(da1Var2, 10);
                    ak0Var2.g0(objL5);
                } else {
                    da1Var2 = da1Var4;
                }
                is1Var = is1Var2;
                ir2.a((ti0) objL5, vs0.C(-1033150339, new jd(20, ln0Var5, da1Var2), ak0Var2), null, vs0.C(1854091007, new p7(da1Var2, 4), ak0Var2), p61.l, p61.m, null, 0L, 0L, 0L, 0L, null, ak0Var, 1772598, 16276);
                ak0Var2 = ak0Var;
                z = false;
                ak0Var2.p(false);
                i2 = 894526162;
            } else {
                i2 = 894526162;
                is1Var = is1Var2;
                z = false;
                ak0Var2.W(894526162);
                ak0Var2.p(false);
            }
            if (!((Boolean) da1Var5.getValue()).booleanValue() || wmVar == null) {
                ln0Var4 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x028b: MOVE (r1v7 'ln0Var4' ln0) = (r16v2 ln0) (LINE:652) in method: gn0.c(ti0, ej0, ij0, ej0, ti0, ln0, ak0, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v2 ln0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 696
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gn0.c(ti0, ej0, ij0, ej0, ti0, ln0, ak0, int):void");
            }

            public static final void d(int i, int i2, ti0 ti0Var, ej0 ej0Var, ak0 ak0Var) {
                ak0Var.X(241418527);
                int i3 = 4;
                int i4 = (ak0Var.d(i) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 256 : 128);
                if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
                    Object objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = y12.s(String.valueOf(i));
                        ak0Var.g0(objL);
                    }
                    da1 da1Var = (da1) objL;
                    ir2.a(ti0Var, vs0.C(1306212199, new et(ej0Var, i, da1Var, i3), ak0Var), null, vs0.C(1794259305, new pd(6, ti0Var), ak0Var), p61.q, vs0.C(378846316, new p7(da1Var, 5), ak0Var), null, 0L, 0L, 0L, 0L, null, ak0Var, 1772598, 16276);
                } else {
                    ak0Var.R();
                }
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new od(i, ti0Var, ej0Var, i2);
                }
            }

            public static final void e(final int i, final int i2, ak0 ak0Var) {
                ak0Var.X(-534978524);
                int i3 = (ak0Var.d(i) ? 4 : 2) | i2;
                if (ak0Var.O(i3 & 1, (i3 & 3) != 2)) {
                    sv.a(yv.n.a(kw0.e), vs0.C(-807484572, new jd(18, h92.L(String.valueOf(ex.h(i, 0, 9999999)), 7), vf2.a(((gk2) ak0Var.j(ik2.a)).h, 0L, 0L, null, a, 0L, 0L, null, 16777183)), ak0Var), ak0Var, 56);
                } else {
                    ak0Var.R();
                }
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0(i, i2) { // from class: bn0
                        public final /* synthetic */ int e;

                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(1);
                            gn0.e(this.e, iP, (ak0) obj);
                            return ll2.a;
                        }
                    };
                }
            }

            public static final void f(ul2 ul2Var, String str, ti0 ti0Var, u71 u71Var, ak0 ak0Var, int i) {
                ak0Var.X(401854998);
                int i2 = 2;
                int i3 = i | (ak0Var.f(ul2Var) ? 4 : 2) | (ak0Var.f(str) ? 32 : 16) | (ak0Var.h(ti0Var) ? 256 : 128) | (ak0Var.f(u71Var) ? 2048 : 1024);
                if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
                    int i4 = i3 >> 6;
                    nj2.c(ti0Var, u71Var, false, null, null, null, vs0.C(1470909131, new gn(ul2Var, j02.g(ul2Var.i, ak0Var), str, i2), ak0Var), ak0Var, (i4 & 14) | 100663296 | (i4 & 112));
                } else {
                    ak0Var.R();
                }
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new yh(ul2Var, str, ti0Var, u71Var, i);
                }
            }

            public static final void g(t22 t22Var, ak0 ak0Var, int i) {
                ak0Var.X(1093054875);
                int i2 = i | (ak0Var.d(t22Var.ordinal()) ? 4 : 2);
                if (ak0Var.O(i2 & 1, (i2 & 3) != 2)) {
                    ef2.b(j02.p(t22Var, ak0Var), p61.f0(r71.a, 0.0f, 4.0f, 0.0f, 0.0f, 13), j02.g(t22Var, ak0Var).b, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var.j(ik2.a)).m, ak0Var, 48, 0, 131064);
                } else {
                    ak0Var.R();
                }
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new x7(i, 10, t22Var);
                }
            }
        }

package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o1(y11 y11Var, f21 f21Var, ej0 ej0Var) {
        this.e = 9;
        this.f = y11Var;
        this.h = f21Var;
        this.g = ej0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v38, types: [u11, x11] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i;
        gt gtVar;
        boolean z;
        f11 f11Var;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        hf2 hf2Var;
        hf2 hf2Var2;
        if2 if2Var;
        if2 if2Var2;
        hf2 hf2Var3;
        hf2 hf2Var4;
        if2 if2Var3;
        if2 if2Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        ru1 ru1Var;
        int i2 = this.e;
        int i3 = 3;
        int i4 = 4;
        int i5 = 9;
        final int i6 = 2;
        int i7 = 7;
        sx sxVar = null;
        te2 te2Var = null;
        te2Var = null;
        te2 te2Var2 = null;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        int i8 = 1;
        switch (i2) {
            case 0:
                y11 y11Var = (y11) obj4;
                int i9 = 0;
                q1 q1Var = new q1(i9, (ej0) obj3);
                y11Var.h().a(q1Var);
                return new r1((ti0) obj2, y11Var, q1Var, i9);
            case 1:
                ia iaVar = (ia) obj4;
                ob obVar = (ob) obj3;
                cs1 cs1Var = (cs1) obj2;
                mb mbVar = (mb) obj;
                c12.C(mbVar, iaVar.c);
                dk1 dk1Var = mbVar.e;
                Object objB = iaVar.b(dk1Var.getValue());
                if (!ws0.j(objB, dk1Var.getValue())) {
                    iaVar.c.f.setValue(objB);
                    obVar.f.setValue(objB);
                    mbVar.a();
                    cs1Var.e = true;
                }
                return ll2Var;
            case 2:
                ej0 ej0Var = (ej0) obj3;
                da1 da1Var = (da1) obj2;
                te2 te2Var3 = (te2) obj;
                ((da1) obj4).setValue(te2Var3);
                boolean zJ = ws0.j((String) da1Var.getValue(), te2Var3.a.f);
                yb ybVar = te2Var3.a;
                da1Var.setValue(ybVar.f);
                if (!zJ) {
                    ej0Var.h(ybVar.f);
                }
                return ll2Var;
            case 3:
                n1 n1Var = new n1(i5, (ez) obj3, (mh2) obj2);
                lv0[] lv0VarArr = w02.a;
                ((z02) obj).a(h02.c, new p0((String) obj4, n1Var));
                return ll2Var;
            case 4:
                cx cxVar = (cx) obj4;
                ot0 ot0Var = (ot0) obj3;
                sy1 sy1Var = (sy1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = cxVar.u ? 1.0f : -1.0f;
                uy1 uy1Var = cxVar.t;
                long jE = uy1Var.e(uy1Var.h(f * fFloatValue));
                uy1 uy1Var2 = sy1Var.a;
                float fG = uy1Var.g(uy1Var.e(uy1Var2.c(uy1Var2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    ot0Var.d(cancellationException);
                }
                return ll2Var;
            case 5:
                f11 f11Var2 = (f11) obj4;
                te2 te2Var4 = (te2) obj3;
                xf1 xf1Var = (xf1) obj2;
                l80 l80Var = (l80) obj;
                if2 if2VarD = f11Var2.d();
                if (if2VarD != null) {
                    sm smVarG = l80Var.B().g();
                    long j = ((of2) f11Var2.A.getValue()).a;
                    long j2 = ((of2) f11Var2.B.getValue()).a;
                    hf2 hf2Var5 = if2VarD.a;
                    t81 t81Var = hf2Var5.b;
                    gf2 gf2Var = hf2Var5.a;
                    v7 v7Var = f11Var2.y;
                    long j3 = f11Var2.z;
                    if (!of2.c(j)) {
                        v7Var.e(j3);
                        int iR = xf1Var.r(of2.f(j));
                        int iR2 = xf1Var.r(of2.e(j));
                        if (iR != iR2) {
                            smVarG.g(hf2Var5.h(iR, iR2), v7Var);
                        }
                    } else if (!of2.c(j2)) {
                        long jB = gf2Var.b.b();
                        dr drVar = new dr(jB);
                        if (jB == 16) {
                            drVar = null;
                        }
                        long j4 = drVar != null ? drVar.a : dr.b;
                        v7Var.e(dr.b(dr.c(j4) * 0.2f, j4));
                        int iR3 = xf1Var.r(of2.f(j2));
                        int iR4 = xf1Var.r(of2.e(j2));
                        if (iR3 != iR4) {
                            smVarG.g(hf2Var5.h(iR3, iR4), v7Var);
                        }
                    } else if (!of2.c(te2Var4.b)) {
                        v7Var.e(j3);
                        long j5 = te2Var4.b;
                        int iR5 = xf1Var.r(of2.f(j5));
                        int iR6 = xf1Var.r(of2.e(j5));
                        if (iR5 != iR6) {
                            smVarG.g(hf2Var5.h(iR5, iR6), v7Var);
                        }
                    }
                    long j6 = hf2Var5.c;
                    float f2 = (int) (j6 >> 32);
                    t81 t81Var2 = hf2Var5.b;
                    boolean z2 = ((f2 > t81Var2.d ? 1 : (f2 == t81Var2.d ? 0 : -1)) < 0 || t81Var2.c || (((float) ((int) (j6 & 4294967295L))) > t81Var2.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == t81Var2.e ? 0 : -1)) < 0) && gf2Var.f != 3;
                    if (z2) {
                        long j7 = hf2Var5.c;
                        yr1 yr1VarE = sv.e(0L, (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32));
                        smVarG.l();
                        sm.k(smVarG, yr1VarE);
                    }
                    r72 r72Var = gf2Var.b.a;
                    ed2 ed2Var = r72Var.m;
                    ve2 ve2Var = r72Var.a;
                    if (ed2Var == null) {
                        ed2Var = ed2.b;
                    }
                    ed2 ed2Var2 = ed2Var;
                    q32 q32Var = r72Var.n;
                    if (q32Var == null) {
                        q32Var = q32.d;
                    }
                    q32 q32Var2 = q32Var;
                    m80 m80Var = r72Var.p;
                    if (m80Var == null) {
                        m80Var = fd0.a;
                    }
                    m80 m80Var2 = m80Var;
                    try {
                        rk rkVarC = ve2Var.c();
                        ue2 ue2Var = ue2.a;
                        if (rkVarC != null) {
                            t81.i(t81Var, smVarG, rkVarC, ve2Var != ue2Var ? ve2Var.a() : 1.0f, q32Var2, ed2Var2, m80Var2);
                        } else {
                            long jB2 = ve2Var != ue2Var ? ve2Var.b() : dr.b;
                            smVarG.l();
                            ArrayList arrayList = t81Var.h;
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                sj1 sj1Var = (sj1) arrayList.get(i10);
                                sj1Var.a.f(smVarG, jB2, q32Var2, ed2Var2, m80Var2);
                                smVarG.f(0.0f, sj1Var.a.b());
                            }
                            smVarG.i();
                        }
                    } finally {
                        if (z2) {
                            smVarG.i();
                        }
                    }
                }
                return ll2Var;
            case 6:
                ds1 ds1Var = (ds1) obj4;
                mb mbVar2 = (mb) obj;
                float fFloatValue2 = ((Number) mbVar2.e.getValue()).floatValue() - ds1Var.e;
                float fA = ((m01) obj3).a(fFloatValue2);
                ds1Var.e = ((Number) mbVar2.e.getValue()).floatValue();
                ((ds1) obj2).e = ((Number) mbVar2.a.b.h(mbVar2.f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    mbVar2.a();
                }
                return ll2Var;
            case 7:
                Context context = (Context) obj3;
                ad2 ad2Var = (ad2) obj2;
                nx nxVar = (nx) obj;
                List list = ((mc2) obj4).a;
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    lc2 lc2Var = (lc2) list.get(i11);
                    int i12 = 6;
                    if (lc2Var instanceof uc2) {
                        uc2 uc2Var = (uc2) lc2Var;
                        x7 x7Var = new x7(i7, uc2Var);
                        if (uc2Var.c != 0) {
                            gtVar = sxVar;
                            gtVar = new gt(new v10(1, uc2Var), true, -1930700965);
                        }
                        gtVar = sxVar;
                        nx.b(nxVar, x7Var, gtVar, new n1(13, uc2Var, ad2Var), 6);
                    } else {
                        if (!(lc2Var instanceof bd2)) {
                            i = 7;
                            if (lc2Var instanceof zc2) {
                                nxVar.a.add(j20.h);
                            }
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            bd2 bd2Var = (bd2) lc2Var;
                            if (context != null) {
                                int i13 = bd2Var.c;
                                TextClassification textClassification = bd2Var.b;
                                if (i13 < 0) {
                                    i72 i72Var = new i72(1, textClassification);
                                    Drawable icon = textClassification.getIcon();
                                    nx.b(nxVar, i72Var, icon != null ? new gt(new v10(i4, icon), true, -1123224187) : null, new gp1(i12, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteActionC = nr.c(textClassification.getActions().get(i13));
                                    i = 7;
                                    nx.b(nxVar, new i72(i6, remoteActionC), ((i13 == 0) || remoteActionC.shouldShowIcon()) ? new gt(new v10(5, remoteActionC), true, -1261173016) : null, new r12(i, remoteActionC), 6);
                                }
                            }
                        }
                        i11++;
                        i7 = i;
                        sxVar = null;
                    }
                    i = 7;
                    i11++;
                    i7 = i;
                    sxVar = null;
                }
                return ll2Var;
            case 8:
                h72 h72Var = (h72) obj4;
                kb1 kb1Var = (kb1) obj3;
                h72Var.add(kb1Var);
                return new r1((h50) obj2, kb1Var, h72Var, i6);
            case 9:
                y11 y11Var2 = (y11) obj4;
                final f21 f21Var = (f21) obj2;
                final ej0 ej0Var2 = (ej0) obj3;
                final gs1 gs1Var = new gs1();
                ?? r3 = new w11() { // from class: u11
                    @Override // defpackage.w11
                    public final void j(y11 y11Var3, q11 q11Var) {
                        int i14 = v11.a[q11Var.ordinal()];
                        gs1 gs1Var2 = gs1Var;
                        if (i14 == 1) {
                            gs1Var2.e = ej0Var2.h(f21Var);
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            fg fgVar = (fg) gs1Var2.e;
                            if (fgVar != null) {
                                fgVar.a();
                            }
                            gs1Var2.e = null;
                        }
                    }
                };
                y11Var2.h().a(r3);
                return new r1(y11Var2, r3, gs1Var);
            case 10:
                gj1 gj1Var = (gj1) obj3;
                s3 s3Var = (s3) obj2;
                cx0 cx0Var = (cx0) obj;
                long j8 = ((d52) ((nd2) obj4).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fX = cx0Var.x(4.0f);
                    um umVar = cx0Var.e;
                    float fX2 = cx0Var.x(gj1Var.a(cx0Var.getLayoutDirection()));
                    float fA2 = s3Var.a(p61.j0(fIntBitsToFloat), p61.j0((Float.intBitsToFloat((int) (umVar.d() >> 32)) - fX2) - cx0Var.x(gj1Var.b(cx0Var.getLayoutDirection()))), cx0Var.getLayoutDirection()) + fX2;
                    float f3 = fIntBitsToFloat / 2.0f;
                    float f4 = fA2 + f3;
                    float f5 = (f4 - f3) - fX;
                    float f6 = f5 < 0.0f ? 0.0f : f5;
                    float f7 = f4 + f3 + fX;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (umVar.d() >> 32));
                    float f8 = f7 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f7;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                    float f9 = (-fIntBitsToFloat3) / 2.0f;
                    float f10 = fIntBitsToFloat3 / 2.0f;
                    ud udVar = umVar.f;
                    long jM = udVar.m();
                    udVar.g().l();
                    try {
                        ((ud) ((ao2) udVar.b).f).g().e(f6, f9, f8, f10, 0);
                        cx0Var.a();
                    } finally {
                        k3.s(udVar, jM);
                    }
                } else {
                    cx0Var.a();
                }
                return ll2Var;
            case 11:
                fw1 fw1Var = (fw1) obj4;
                jw1 jw1Var = (jw1) obj2;
                w91 w91Var = fw1Var.f;
                if (w91Var.b(obj3)) {
                    fu1.f(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                fw1Var.e.remove(obj3);
                w91Var.m(obj3, jw1Var);
                return new r1(fw1Var, obj3, jw1Var, i4);
            case 12:
                a52 a52Var = (a52) obj4;
                fu1 fu1Var = (fu1) obj3;
                cs1 cs1Var2 = (cs1) obj2;
                wn1 wn1Var = (wn1) obj;
                long j9 = wn1Var.c;
                me2 me2Var = (me2) a52Var.d;
                if (!me2Var.i() || me2Var.l().a.f.length() == 0 || (f11Var = me2Var.d) == null || f11Var.d() == null) {
                    z = false;
                } else {
                    a52Var.c(me2Var.l(), j9, false, fu1Var);
                    z = true;
                }
                if (z) {
                    wn1Var.a();
                    cs1Var2.e = true;
                }
                return ll2Var;
            case 13:
                ej0 ej0Var3 = (ej0) obj3;
                cf2 cf2Var = (cf2) ((gs1) obj2).e;
                te2 te2VarI = ((dq0) obj4).i((List) obj);
                if (cf2Var != null) {
                    cf2Var.a(null, te2VarI);
                }
                ej0Var3.h(te2VarI);
                return ll2Var;
            case 14:
                vd2 vd2Var = (vd2) obj3;
                cs1 cs1Var3 = (cs1) obj2;
                yd2 yd2Var = (yd2) obj;
                switch (((qv0) obj4).ordinal()) {
                    case 0:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            if (of2.c(yd2Var.f)) {
                                yd2Var.i();
                            } else {
                                boolean zF = yd2Var.f();
                                long j10 = yd2Var.f;
                                if (zF) {
                                    int iF = of2.f(j10);
                                    yd2Var.q(iF, iF);
                                } else {
                                    int iE = of2.e(j10);
                                    yd2Var.q(iE, iE);
                                }
                            }
                        }
                        break;
                    case 1:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            if (of2.c(yd2Var.f)) {
                                yd2Var.m();
                            } else {
                                boolean zF2 = yd2Var.f();
                                long j11 = yd2Var.f;
                                if (zF2) {
                                    int iE2 = of2.e(j11);
                                    yd2Var.q(iE2, iE2);
                                } else {
                                    int iF2 = of2.f(j11);
                                    yd2Var.q(iF2, iF2);
                                }
                            }
                        }
                        break;
                    case 2:
                        nf2 nf2Var = yd2Var.e;
                        nf2Var.a = null;
                        yb ybVar2 = yd2Var.g;
                        String str = ybVar2.f;
                        String str2 = ybVar2.f;
                        if (str.length() > 0) {
                            if (yd2Var.f()) {
                                nf2Var.a = null;
                                if (str2.length() > 0 && (numD = yd2Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    yd2Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                nf2Var.a = null;
                                if (str2.length() > 0 && (numE = yd2Var.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    yd2Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        nf2 nf2Var2 = yd2Var.e;
                        nf2Var2.a = null;
                        yb ybVar3 = yd2Var.g;
                        String str3 = ybVar3.f;
                        String str4 = ybVar3.f;
                        if (str3.length() > 0) {
                            if (yd2Var.f()) {
                                nf2Var2.a = null;
                                if (str4.length() > 0 && (numE2 = yd2Var.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    yd2Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                nf2Var2.a = null;
                                if (str4.length() > 0 && (numD2 = yd2Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    yd2Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        yd2Var.j();
                        break;
                    case 5:
                        yd2Var.l();
                        break;
                    case 6:
                        yd2Var.o();
                        break;
                    case 7:
                        yd2Var.n();
                        break;
                    case 8:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            if (yd2Var.f()) {
                                yd2Var.o();
                            } else {
                                yd2Var.n();
                            }
                        }
                        break;
                    case 9:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            if (yd2Var.f()) {
                                yd2Var.n();
                            } else {
                                yd2Var.o();
                            }
                        }
                        break;
                    case 10:
                        if (yd2Var.g.f.length() > 0 && (hf2Var = yd2Var.c) != null) {
                            int iG = yd2Var.g(hf2Var, -1);
                            yd2Var.q(iG, iG);
                        }
                        break;
                    case 11:
                        if (yd2Var.g.f.length() > 0 && (hf2Var2 = yd2Var.c) != null) {
                            int iG2 = yd2Var.g(hf2Var2, 1);
                            yd2Var.q(iG2, iG2);
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (yd2Var.g.f.length() > 0 && (if2Var = yd2Var.i) != null) {
                            int iH = yd2Var.h(if2Var, -1);
                            yd2Var.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (yd2Var.g.f.length() > 0 && (if2Var2 = yd2Var.i) != null) {
                            int iH2 = yd2Var.h(if2Var2, 1);
                            yd2Var.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            yd2Var.q(0, 0);
                        }
                        break;
                    case 16:
                        yd2Var.e.a = null;
                        yb ybVar4 = yd2Var.g;
                        if (ybVar4.f.length() > 0) {
                            int length = ybVar4.f.length();
                            yd2Var.q(length, length);
                        }
                        break;
                    case 17:
                        vd2Var.b.a(false);
                        break;
                    case 18:
                        vd2Var.b.o();
                        break;
                    case 19:
                        vd2Var.b.c();
                        break;
                    case 20:
                        List listA = yd2Var.a(new v22(i7));
                        if (listA != null) {
                            vd2Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = yd2Var.a(new v22(8));
                        if (listA2 != null) {
                            vd2Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = yd2Var.a(new v22(i5));
                        if (listA3 != null) {
                            vd2Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = yd2Var.a(new v22(10));
                        if (listA4 != null) {
                            vd2Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = yd2Var.a(new v22(11));
                        if (listA5 != null) {
                            vd2Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = yd2Var.a(new v22(12));
                        if (listA6 != null) {
                            vd2Var.a(listA6);
                        }
                        break;
                    case 26:
                        yd2Var.e.a = null;
                        yb ybVar5 = yd2Var.g;
                        if (ybVar5.f.length() > 0) {
                            yd2Var.q(0, ybVar5.f.length());
                        }
                        break;
                    case 27:
                        yd2Var.i();
                        yd2Var.p();
                        break;
                    case 28:
                        yd2Var.m();
                        yd2Var.p();
                        break;
                    case 29:
                        if (yd2Var.g.f.length() > 0 && (hf2Var3 = yd2Var.c) != null) {
                            int iG3 = yd2Var.g(hf2Var3, -1);
                            yd2Var.q(iG3, iG3);
                        }
                        yd2Var.p();
                        break;
                    case 30:
                        if (yd2Var.g.f.length() > 0 && (hf2Var4 = yd2Var.c) != null) {
                            int iG4 = yd2Var.g(hf2Var4, 1);
                            yd2Var.q(iG4, iG4);
                        }
                        yd2Var.p();
                        break;
                    case 31:
                        if (yd2Var.g.f.length() > 0 && (if2Var3 = yd2Var.i) != null) {
                            int iH3 = yd2Var.h(if2Var3, -1);
                            yd2Var.q(iH3, iH3);
                        }
                        yd2Var.p();
                        break;
                    case 32:
                        if (yd2Var.g.f.length() > 0 && (if2Var4 = yd2Var.i) != null) {
                            int iH4 = yd2Var.h(if2Var4, 1);
                            yd2Var.q(iH4, iH4);
                        }
                        yd2Var.p();
                        break;
                    case 33:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            yd2Var.q(0, 0);
                        }
                        yd2Var.p();
                        break;
                    case 34:
                        yd2Var.e.a = null;
                        yb ybVar6 = yd2Var.g;
                        if (ybVar6.f.length() > 0) {
                            int length2 = ybVar6.f.length();
                            yd2Var.q(length2, length2);
                        }
                        yd2Var.p();
                        break;
                    case 35:
                        nf2 nf2Var3 = yd2Var.e;
                        nf2Var3.a = null;
                        yb ybVar7 = yd2Var.g;
                        String str5 = ybVar7.f;
                        String str6 = ybVar7.f;
                        if (str5.length() > 0) {
                            if (yd2Var.f()) {
                                nf2Var3.a = null;
                                if (str6.length() > 0 && (numE3 = yd2Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    yd2Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                nf2Var3.a = null;
                                if (str6.length() > 0 && (numD3 = yd2Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    yd2Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        yd2Var.p();
                        break;
                    case 36:
                        nf2 nf2Var4 = yd2Var.e;
                        nf2Var4.a = null;
                        yb ybVar8 = yd2Var.g;
                        String str7 = ybVar8.f;
                        String str8 = ybVar8.f;
                        if (str7.length() > 0) {
                            if (yd2Var.f()) {
                                nf2Var4.a = null;
                                if (str8.length() > 0 && (numD4 = yd2Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    yd2Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                nf2Var4.a = null;
                                if (str8.length() > 0 && (numE4 = yd2Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    yd2Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        yd2Var.p();
                        break;
                    case 37:
                        yd2Var.j();
                        yd2Var.p();
                        break;
                    case 38:
                        yd2Var.l();
                        yd2Var.p();
                        break;
                    case 39:
                        yd2Var.o();
                        yd2Var.p();
                        break;
                    case 40:
                        yd2Var.n();
                        yd2Var.p();
                        break;
                    case 41:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            if (yd2Var.f()) {
                                yd2Var.o();
                            } else {
                                yd2Var.n();
                            }
                        }
                        yd2Var.p();
                        break;
                    case 42:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            if (yd2Var.f()) {
                                yd2Var.n();
                            } else {
                                yd2Var.o();
                            }
                        }
                        yd2Var.p();
                        break;
                    case 43:
                        yd2Var.e.a = null;
                        if (yd2Var.g.f.length() > 0) {
                            long j12 = yd2Var.f;
                            int i14 = of2.c;
                            int i15 = (int) (j12 & 4294967295L);
                            yd2Var.q(i15, i15);
                        }
                        break;
                    case 44:
                        if (vd2Var.e) {
                            cs1Var3.e = vd2Var.a.x.f.r.u(vd2Var.k);
                        } else {
                            vd2Var.a(vs0.u(new es("\n", 1)));
                        }
                        break;
                    case 45:
                        if (vd2Var.e) {
                            cs1Var3.e = false;
                        } else {
                            vd2Var.a(vs0.u(new es("\t", 1)));
                        }
                        break;
                    case 46:
                        vd2Var.h.a(te2.a(yd2Var.h, yd2Var.g, yd2Var.f, 4));
                        jl2 jl2Var = vd2Var.h;
                        ru1 ru1Var2 = jl2Var.a;
                        if (ru1Var2 != null && (ru1Var = (ru1) ru1Var2.b) != null) {
                            jl2Var.a = ru1Var;
                            jl2Var.c -= ((te2) ru1Var2.c).a.f.length();
                            jl2Var.b = new ru1(i5, jl2Var.b, (te2) ru1Var2.c);
                            te2Var2 = (te2) ru1Var.c;
                        }
                        if (te2Var2 != null) {
                            vd2Var.j.h(te2Var2);
                        }
                        break;
                    case 47:
                        jl2 jl2Var2 = vd2Var.h;
                        ru1 ru1Var3 = jl2Var2.b;
                        if (ru1Var3 != null) {
                            jl2Var2.b = (ru1) ru1Var3.b;
                            te2 te2Var5 = (te2) ru1Var3.c;
                            jl2Var2.a = new ru1(i5, jl2Var2.a, te2Var5);
                            jl2Var2.c = te2Var5.a.f.length() + jl2Var2.c;
                            te2Var = (te2) ru1Var3.c;
                        }
                        if (te2Var != null) {
                            vd2Var.j.h(te2Var);
                        }
                        break;
                    default:
                        qj.p();
                        return null;
                }
                return ll2Var;
            default:
                final me2 me2Var2 = (me2) obj4;
                ez ezVar = (ez) obj3;
                Context context2 = (Context) obj2;
                kc2 kc2Var = (kc2) obj;
                p91 p91Var = kc2Var.a;
                p91 p91Var2 = kc2Var.a;
                zc2 zc2Var = zc2.b;
                p91Var.a(zc2Var);
                vc2 vc2Var = vc2.Autofill;
                boolean z3 = (of2.c(me2Var2.l().b) || !me2Var2.h() || me2Var2.g == null) ? false : true;
                gp1 gp1Var = new gp1(i7, ezVar, new ge2(me2Var2, sxVar, i8));
                Resources resources = context2.getResources();
                int i16 = 18;
                kc1 kc1Var = new kc1(i16, gp1Var, sxVar);
                if (z3) {
                    p91Var2.a(new uc2(j20.S, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, kc1Var));
                }
                vc2 vc2Var2 = vc2.Autofill;
                boolean z4 = (of2.c(me2Var2.l().b) || me2Var2.g == null) ? false : true;
                gp1 gp1Var2 = new gp1(i7, ezVar, new ge2(me2Var2, sxVar, i6));
                Resources resources2 = context2.getResources();
                kc1 kc1Var2 = new kc1(i16, gp1Var2, sxVar);
                if (z4) {
                    p91Var2.a(new uc2(j20.T, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, kc1Var2));
                }
                vc2 vc2Var3 = vc2.Autofill;
                boolean z5 = me2Var2.h() && ((Boolean) me2Var2.w.getValue()).booleanValue() && me2Var2.g != null;
                gp1 gp1Var3 = new gp1(i7, ezVar, new ge2(me2Var2, sxVar, i3));
                Resources resources3 = context2.getResources();
                kc1 kc1Var3 = new kc1(i16, gp1Var3, sxVar);
                if (z5) {
                    p91Var2.a(new uc2(j20.U, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, kc1Var3));
                }
                vc2 vc2Var4 = vc2.Autofill;
                boolean z6 = of2.d(me2Var2.l().b) != me2Var2.l().a.f.length();
                final int i17 = 0;
                ti0 ti0Var = new ti0() { // from class: qe2
                    @Override // defpackage.ti0
                    public final Object a() {
                        int i18 = i17;
                        ll2 ll2Var2 = ll2.a;
                        me2 me2Var3 = me2Var2;
                        switch (i18) {
                            case 0:
                                return Boolean.valueOf(!me2Var3.A);
                            case 1:
                                te2 te2VarB = me2.b(me2Var3.l().a, j02.c(0, me2Var3.l().a.f.length()));
                                me2Var3.c.h(te2VarB);
                                long j13 = te2VarB.b;
                                me2Var3.v = new of2(j13);
                                me2Var3.t = te2.a(me2Var3.t, null, j13, 5);
                                me2Var3.e(true);
                                return ll2Var2;
                            default:
                                ti0 ti0Var2 = me2Var3.f;
                                if (ti0Var2 != null) {
                                    ti0Var2.a();
                                }
                                return ll2Var2;
                        }
                    }
                };
                final int i18 = 1;
                ti0 ti0Var2 = new ti0() { // from class: qe2
                    @Override // defpackage.ti0
                    public final Object a() {
                        int i19 = i18;
                        ll2 ll2Var2 = ll2.a;
                        me2 me2Var3 = me2Var2;
                        switch (i19) {
                            case 0:
                                return Boolean.valueOf(!me2Var3.A);
                            case 1:
                                te2 te2VarB = me2.b(me2Var3.l().a, j02.c(0, me2Var3.l().a.f.length()));
                                me2Var3.c.h(te2VarB);
                                long j13 = te2VarB.b;
                                me2Var3.v = new of2(j13);
                                me2Var3.t = te2.a(me2Var3.t, null, j13, 5);
                                me2Var3.e(true);
                                return ll2Var2;
                            default:
                                ti0 ti0Var3 = me2Var3.f;
                                if (ti0Var3 != null) {
                                    ti0Var3.a();
                                }
                                return ll2Var2;
                        }
                    }
                };
                Resources resources4 = context2.getResources();
                kc1 kc1Var4 = new kc1(i16, ti0Var2, ti0Var);
                if (z6) {
                    p91Var2.a(new uc2(j20.V, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, kc1Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    vc2 vc2Var5 = vc2.Autofill;
                    boolean z7 = me2Var2.h() && of2.c(me2Var2.l().b);
                    ti0 ti0Var3 = new ti0() { // from class: qe2
                        @Override // defpackage.ti0
                        public final Object a() {
                            int i19 = i6;
                            ll2 ll2Var2 = ll2.a;
                            me2 me2Var3 = me2Var2;
                            switch (i19) {
                                case 0:
                                    return Boolean.valueOf(!me2Var3.A);
                                case 1:
                                    te2 te2VarB = me2.b(me2Var3.l().a, j02.c(0, me2Var3.l().a.f.length()));
                                    me2Var3.c.h(te2VarB);
                                    long j13 = te2VarB.b;
                                    me2Var3.v = new of2(j13);
                                    me2Var3.t = te2.a(me2Var3.t, null, j13, 5);
                                    me2Var3.e(true);
                                    return ll2Var2;
                                default:
                                    ti0 ti0Var4 = me2Var3.f;
                                    if (ti0Var4 != null) {
                                        ti0Var4.a();
                                    }
                                    return ll2Var2;
                            }
                        }
                    };
                    Resources resources5 = context2.getResources();
                    kc1 kc1Var5 = new kc1(i16, ti0Var3, sxVar);
                    if (z7) {
                        p91Var2.a(new uc2(vc2Var5.e, resources5.getString(vc2Var5.f), vc2Var5.g, kc1Var5));
                    }
                }
                p91Var2.a(zc2Var);
                return ll2Var;
        }
    }

    public /* synthetic */ o1(ej0 ej0Var, da1 da1Var, da1 da1Var2) {
        this.e = 2;
        this.g = ej0Var;
        this.f = da1Var;
        this.h = da1Var2;
    }

    public /* synthetic */ o1(cx cxVar, wl2 wl2Var, ot0 ot0Var, sy1 sy1Var) {
        this.e = 4;
        this.f = cxVar;
        this.g = ot0Var;
        this.h = sy1Var;
    }

    public /* synthetic */ o1(ds1 ds1Var, m01 m01Var, ds1 ds1Var2, w20 w20Var) {
        this.e = 6;
        this.f = ds1Var;
        this.g = m01Var;
        this.h = ds1Var2;
    }

    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}

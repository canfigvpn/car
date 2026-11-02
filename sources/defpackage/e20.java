package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e20 {
    public static final kj1 a = p61.l(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final kj1 b = p61.l(24.0f, 16.0f, 12.0f, 0.0f, 8);
    public static final kj1 c = p61.l(24.0f, 0.0f, 12.0f, 12.0f, 2);
    public static final float d = 16.0f;

    public static final void a(final u71 u71Var, final ij0 ij0Var, final ij0 ij0Var2, final ij0 ij0Var3, final l00 l00Var, final vf2 vf2Var, final float f, final gt gtVar, ak0 ak0Var, final int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        ak0Var.X(1539132883);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(ij0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = ij0Var2;
            i2 |= ak0Var.h(obj) ? 256 : 128;
        } else {
            obj = ij0Var2;
        }
        if ((i & 3072) == 0) {
            obj2 = ij0Var3;
            i2 |= ak0Var.h(obj2) ? 2048 : 1024;
        } else {
            obj2 = ij0Var3;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.f(l00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            obj3 = vf2Var;
            i2 |= ak0Var.f(obj3) ? 131072 : 65536;
        } else {
            obj3 = vf2Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= ak0Var.c(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ak0Var.h(gtVar) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (ak0Var.O(i3 & 1, (4793491 & i3) != 4793490)) {
            u71 u71VarM = f52.m(u71Var, nj2.C, 0.0f, 0.0f, 14);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new s1(24);
                ak0Var.g0(objL);
            }
            u71 u71VarS = p61.s(l02.a(u71VarM, false, (ej0) objL), l00Var.a, vs0.C);
            wr wrVarA = ur.a(ws0.g, q90.r, ak0Var, 0);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarS);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, wrVarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            d(ij0Var, l00Var.b, l00Var.c, f, vs0.C(-1658370654, new j10(obj, obj2, ij0Var, l00Var, obj3, 0), ak0Var), ak0Var, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            k3.o((i3 >> 21) & 14, gtVar, ak0Var, true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: g10
                @Override // defpackage.ij0
                public final Object g(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    e20.a(u71Var, ij0Var, ij0Var2, ij0Var3, l00Var, vf2Var, f, gtVar, (ak0) obj4, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final f20 f20Var, u71 u71Var, r00 r00Var, l00 l00Var, ij0 ij0Var, ij0 ij0Var2, boolean z, xf0 xf0Var, ak0 ak0Var, final int i) {
        final u71 u71Var2;
        final r00 r00Var2;
        final l00 l00Var2;
        final ij0 ij0Var3;
        final ij0 ij0Var4;
        final boolean z2;
        final xf0 xf0Var2;
        xf0 xf0Var3;
        ij0 ij0Var5;
        ij0 ij0Var6;
        l00 l00Var3;
        r00 r00Var3;
        u71 u71Var3;
        boolean z3;
        gt gtVarC;
        ak0Var.X(1105472031);
        int i2 = i | (ak0Var.f(f20Var) ? 4 : 2) | 14378160;
        int i3 = 0;
        int i4 = 1;
        if (ak0Var.O(i2 & 1, (4793491 & i2) != 4793490)) {
            ak0Var.T();
            int i5 = i & 1;
            is1 is1Var = cv.a;
            if (i5 == 0 || ak0Var.y()) {
                Object objL = ak0Var.L();
                if (objL == is1Var) {
                    o00 o00Var = o00.a;
                    objL = new r00();
                    ak0Var.g0(objL);
                }
                r00 r00Var4 = (r00) objL;
                o00 o00Var2 = o00.a;
                l00 l00VarC = o00.c(ak0Var);
                gt gtVarC2 = vs0.C(1655706771, new k10(f20Var, l00VarC, i3), ak0Var);
                gt gtVarC3 = vs0.C(1439279037, new p00(f20Var, r00Var4, l00VarC), ak0Var);
                Object objL2 = ak0Var.L();
                if (objL2 == is1Var) {
                    objL2 = new xf0();
                    ak0Var.g0(objL2);
                }
                xf0Var3 = (xf0) objL2;
                ij0Var5 = gtVarC3;
                ij0Var6 = gtVarC2;
                l00Var3 = l00VarC;
                r00Var3 = r00Var4;
                u71Var3 = r71.a;
                z3 = true;
            } else {
                ak0Var.R();
                u71Var3 = u71Var;
                r00Var3 = r00Var;
                l00Var3 = l00Var;
                ij0Var6 = ij0Var;
                ij0Var5 = ij0Var2;
                z3 = z;
                xf0Var3 = xf0Var;
            }
            ak0Var.q();
            boolean zF = ak0Var.f(f20Var.b);
            Object objL3 = ak0Var.L();
            if (zF || objL3 == is1Var) {
                objL3 = f20Var.c;
                ak0Var.g0(objL3);
            }
            bm bmVar = (bm) objL3;
            if (z3) {
                ak0Var.W(-690551113);
                gtVarC = vs0.C(-1483431603, new k10(f20Var, l00Var3, i4), ak0Var);
                ak0Var.p(false);
            } else {
                ak0Var.W(-690163489);
                ak0Var.p(false);
                gtVarC = null;
            }
            l00Var2 = l00Var3;
            r00 r00Var5 = r00Var3;
            xf0 xf0Var4 = xf0Var3;
            gt gtVar = gtVarC;
            ij0 ij0Var7 = ij0Var5;
            ij0 ij0Var8 = ij0Var6;
            a(u71Var3, ij0Var8, ij0Var7, gtVar, l00Var2, ik2.a(nj2.P, ak0Var), nj2.N, vs0.C(-1346903698, new j10(f20Var, bmVar, r00Var5, l00Var2, xf0Var4, 2), ak0Var), ak0Var, 14156214);
            ij0Var3 = ij0Var8;
            ij0Var4 = ij0Var7;
            z2 = z3;
            r00Var2 = r00Var5;
            xf0Var2 = xf0Var4;
            u71Var2 = u71Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            r00Var2 = r00Var;
            l00Var2 = l00Var;
            ij0Var3 = ij0Var;
            ij0Var4 = ij0Var2;
            z2 = z;
            xf0Var2 = xf0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(u71Var2, r00Var2, l00Var2, ij0Var3, ij0Var4, z2, xf0Var2, i) { // from class: s00
                public final /* synthetic */ u71 f;
                public final /* synthetic */ r00 g;
                public final /* synthetic */ l00 h;
                public final /* synthetic */ ij0 i;
                public final /* synthetic */ ij0 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ xf0 l;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    e20.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x0323  */
    /* JADX WARN: Code duplicated, block: B:106:0x0326  */
    /* JADX WARN: Code duplicated, block: B:108:0x032c  */
    /* JADX WARN: Code duplicated, block: B:109:0x032f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0366  */
    /* JADX WARN: Code duplicated, block: B:113:0x0369  */
    /* JADX WARN: Code duplicated, block: B:115:0x036f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0372  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x0247  */
    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0266  */
    /* JADX WARN: Code duplicated, block: B:96:0x028b  */
    /* JADX WARN: Code duplicated, block: B:97:0x028f  */
    public static final void c(final Long l, final long j, final ej0 ej0Var, final ej0 ej0Var2, final bm bmVar, final lr0 lr0Var, final r00 r00Var, final n00 n00Var, final l00 l00Var, ak0 ak0Var, final int i) {
        wv wvVar;
        String strC0;
        boolean zH;
        Object objL;
        boolean zH2;
        Object objL2;
        boolean zF;
        Object objL3;
        wv wvVar2;
        int iX;
        int iX2;
        vi viVar;
        vi viVar2;
        wi wiVar;
        wi wiVar2;
        ak0 ak0Var2 = ak0Var;
        wi wiVar3 = q90.j;
        wi wiVar4 = q90.m;
        wi wiVar5 = q90.g;
        ak0Var2.X(-434467002);
        int i2 = i | (ak0Var2.f(l) ? 4 : 2) | (ak0Var2.e(j) ? 32 : 16) | (ak0Var2.h(ej0Var) ? 256 : 128) | (ak0Var2.h(ej0Var2) ? 2048 : 1024) | (ak0Var2.h(bmVar) ? 16384 : 8192) | (ak0Var2.h(lr0Var) ? 131072 : 65536) | (ak0Var2.f(r00Var) ? 1048576 : 524288) | (ak0Var2.f(n00Var) ? 8388608 : 4194304) | (ak0Var2.f(l00Var) ? 67108864 : 33554432);
        final int i3 = 1;
        if (ak0Var2.O(i2 & 1, (38347923 & i2) != 38347922)) {
            em emVarF = bmVar.f(j);
            int i4 = (((emVarF.a - lr0Var.e) * 12) + emVarF.b) - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            final q01 q01VarA = r01.a(i4, 2, ak0Var2);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zF2 = ak0Var2.f(q01VarA) | ak0Var2.d(i4);
            Object objL4 = ak0Var2.L();
            is1 is1Var = cv.a;
            if (zF2 || objL4 == is1Var) {
                objL4 = new m10(q01VarA, i4, null, 0);
                ak0Var2.g0(objL4);
            }
            s5.o((ij0) objL4, ak0Var2, numValueOf);
            Object objL5 = ak0Var2.L();
            if (objL5 == is1Var) {
                objL5 = s5.E(ak0Var2);
                ak0Var2.g0(objL5);
            }
            final ez ezVar = (ez) objL5;
            Object[] objArr = new Object[0];
            Object objL6 = ak0Var2.L();
            if (objL6 == is1Var) {
                objL6 = new m2(15);
                ak0Var2.g0(objL6);
            }
            da1 da1Var = (da1) ex.H(objArr, (ti0) objL6, ak0Var2, 48);
            fe feVar = ws0.g;
            ui uiVar = q90.r;
            wr wrVarA = ur.a(feVar, uiVar, ak0Var2, 0);
            int iX3 = ws0.x(ak0Var2);
            sl1 sl1VarL = ak0Var2.l();
            r71 r71Var = r71.a;
            u71 u71VarB = nj2.B(ak0Var2, r71Var);
            wu.c.getClass();
            wv wvVar3 = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar3);
            } else {
                ak0Var2.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var2, wrVarA);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var2, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var2.S) {
                wvVar = wvVar3;
            } else {
                wvVar = wvVar3;
                if (!ws0.j(ak0Var2.L(), Integer.valueOf(iX3))) {
                }
                ra raVar4 = vu.d;
                p12.l(raVar4, ak0Var2, u71VarB);
                u71 u71VarE0 = p61.e0(r71Var, 12.0f, 0.0f, 2);
                boolean zC = q01VarA.c();
                boolean zA = q01VarA.a();
                boolean zBooleanValue = ((Boolean) da1Var.getValue()).booleanValue();
                Locale locale = bmVar.a;
                r00Var.getClass();
                strC0 = sv0.c0(j, "yMMMM", locale, r00Var.a);
                if (strC0 == null) {
                    strC0 = "-";
                }
                String str = strC0;
                zH = ak0Var2.h(ezVar) | ak0Var2.f(q01VarA);
                objL = ak0Var2.L();
                if (zH || objL == is1Var) {
                    final int i5 = 0;
                    objL = new ti0() { // from class: u00
                        @Override // defpackage.ti0
                        public final Object a() {
                            int i6 = i5;
                            ll2 ll2Var = ll2.a;
                            q01 q01Var = q01VarA;
                            ez ezVar2 = ezVar;
                            switch (i6) {
                                case 0:
                                    nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 0), 3);
                                    break;
                                default:
                                    nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 1), 3);
                                    break;
                            }
                            return ll2Var;
                        }
                    };
                    ak0Var2.g0(objL);
                }
                ti0 ti0Var = (ti0) objL;
                zH2 = ak0Var2.h(ezVar) | ak0Var2.f(q01VarA);
                objL2 = ak0Var2.L();
                if (zH2 || objL2 == is1Var) {
                    objL2 = new ti0() { // from class: u00
                        @Override // defpackage.ti0
                        public final Object a() {
                            int i6 = i3;
                            ll2 ll2Var = ll2.a;
                            q01 q01Var = q01VarA;
                            ez ezVar2 = ezVar;
                            switch (i6) {
                                case 0:
                                    nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 0), 3);
                                    break;
                                default:
                                    nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 1), 3);
                                    break;
                            }
                            return ll2Var;
                        }
                    };
                    ak0Var2.g0(objL2);
                }
                ti0 ti0Var2 = (ti0) objL2;
                zF = ak0Var2.f(da1Var);
                objL3 = ak0Var2.L();
                if (zF || objL3 == is1Var) {
                    objL3 = new r9(da1Var, 7);
                    ak0Var2.g0(objL3);
                }
                int i6 = i2 & 234881024;
                wvVar2 = wvVar;
                j(u71VarE0, zC, zA, zBooleanValue, str, ti0Var, ti0Var2, (ti0) objL3, l00Var, ak0Var2, i6 | 6);
                ak0Var2 = ak0Var2;
                w61 w61VarC = xj.c(q90.f, false);
                iX = ws0.x(ak0Var2);
                sl1 sl1VarL2 = ak0Var2.l();
                u71 u71VarB2 = nj2.B(ak0Var2, r71Var);
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar2);
                } else {
                    ak0Var2.j0();
                }
                p12.l(raVar, ak0Var2, w61VarC);
                p12.l(raVar2, ak0Var2, sl1VarL2);
                if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX))) {
                    k3.p(iX, ak0Var2, iX, raVar3);
                }
                p12.l(raVar4, ak0Var2, u71VarB2);
                u71 u71VarE1 = p61.e0(r71Var, 12.0f, 0.0f, 2);
                wr wrVarA2 = ur.a(feVar, uiVar, ak0Var2, 0);
                iX2 = ws0.x(ak0Var2);
                sl1 sl1VarL3 = ak0Var2.l();
                u71 u71VarB3 = nj2.B(ak0Var2, u71VarE1);
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar2);
                } else {
                    ak0Var2.j0();
                }
                p12.l(raVar, ak0Var2, wrVarA2);
                p12.l(raVar2, ak0Var2, sl1VarL3);
                if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX2))) {
                    k3.p(iX2, ak0Var2, iX2, raVar3);
                }
                p12.l(raVar4, ak0Var2, u71VarB3);
                l(l00Var, bmVar, ak0Var2, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
                g(q01VarA, l, ej0Var, ej0Var2, bmVar, lr0Var, r00Var, n00Var, l00Var, ak0Var2, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | i6);
                ak0Var2.p(true);
                h81 h81Var = h81.g;
                g82 g82VarQ = rw.Q(h81Var, ak0Var2);
                g82 g82VarQ2 = rw.Q(h81.h, ak0Var2);
                g82 g82VarQ3 = rw.Q(h81Var, ak0Var2);
                boolean zBooleanValue2 = ((Boolean) da1Var.getValue()).booleanValue();
                u71 u71VarL = nj2.l(r71Var);
                mj2 mj2Var = nb0.a;
                viVar = q90.q;
                x4 x4Var = x4.C;
                viVar2 = q90.o;
                if (ws0.j(viVar, viVar2)) {
                    wiVar = wiVar5;
                } else if (ws0.j(viVar, viVar)) {
                    wiVar = wiVar4;
                } else {
                    wiVar = wiVar3;
                }
                sb0 sb0VarA = nb0.b(wiVar, g82VarQ3, new mb0(x4Var, 0)).a(new sb0(new li2(new zc0(0.6f, g82VarQ), (i52) null, (jo) null, (hx1) null, (LinkedHashMap) null, 126)));
                x4 x4Var2 = x4.D;
                if (ws0.j(viVar, viVar2)) {
                    wiVar2 = wiVar5;
                } else if (ws0.j(viVar, viVar)) {
                    wiVar2 = wiVar4;
                } else {
                    wiVar2 = wiVar3;
                }
                dv1.c(zBooleanValue2, u71VarL, sb0VarA, nb0.f(wiVar2, g82VarQ3, new mb0(x4Var2, 1)).a(nb0.d(g82VarQ2, 2)), null, vs0.C(1193716082, new o10(j, da1Var, ezVar, q01VarA, lr0Var, emVarF, n00Var, bmVar, l00Var), ak0Var2), ak0Var2, 196656, 16);
                ak0Var2.p(true);
                ak0Var2.p(true);
            }
            k3.p(iX3, ak0Var2, iX3, raVar3);
            ra raVar5 = vu.d;
            p12.l(raVar5, ak0Var2, u71VarB);
            u71 u71VarE2 = p61.e0(r71Var, 12.0f, 0.0f, 2);
            boolean zC2 = q01VarA.c();
            boolean zA2 = q01VarA.a();
            boolean zBooleanValue3 = ((Boolean) da1Var.getValue()).booleanValue();
            Locale locale2 = bmVar.a;
            r00Var.getClass();
            strC0 = sv0.c0(j, "yMMMM", locale2, r00Var.a);
            if (strC0 == null) {
                strC0 = "-";
            }
            String str2 = strC0;
            zH = ak0Var2.h(ezVar) | ak0Var2.f(q01VarA);
            objL = ak0Var2.L();
            if (zH) {
                final int i7 = 0;
                objL = new ti0() { // from class: u00
                    @Override // defpackage.ti0
                    public final Object a() {
                        int i8 = i7;
                        ll2 ll2Var = ll2.a;
                        q01 q01Var = q01VarA;
                        ez ezVar2 = ezVar;
                        switch (i8) {
                            case 0:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 0), 3);
                                break;
                            default:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 1), 3);
                                break;
                        }
                        return ll2Var;
                    }
                };
                ak0Var2.g0(objL);
            } else {
                final int i8 = 0;
                objL = new ti0() { // from class: u00
                    @Override // defpackage.ti0
                    public final Object a() {
                        int i9 = i8;
                        ll2 ll2Var = ll2.a;
                        q01 q01Var = q01VarA;
                        ez ezVar2 = ezVar;
                        switch (i9) {
                            case 0:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 0), 3);
                                break;
                            default:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 1), 3);
                                break;
                        }
                        return ll2Var;
                    }
                };
                ak0Var2.g0(objL);
            }
            ti0 ti0Var3 = (ti0) objL;
            zH2 = ak0Var2.h(ezVar) | ak0Var2.f(q01VarA);
            objL2 = ak0Var2.L();
            if (zH2) {
                objL2 = new ti0() { // from class: u00
                    @Override // defpackage.ti0
                    public final Object a() {
                        int i9 = i3;
                        ll2 ll2Var = ll2.a;
                        q01 q01Var = q01VarA;
                        ez ezVar2 = ezVar;
                        switch (i9) {
                            case 0:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 0), 3);
                                break;
                            default:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 1), 3);
                                break;
                        }
                        return ll2Var;
                    }
                };
                ak0Var2.g0(objL2);
            } else {
                objL2 = new ti0() { // from class: u00
                    @Override // defpackage.ti0
                    public final Object a() {
                        int i9 = i3;
                        ll2 ll2Var = ll2.a;
                        q01 q01Var = q01VarA;
                        ez ezVar2 = ezVar;
                        switch (i9) {
                            case 0:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 0), 3);
                                break;
                            default:
                                nj2.y(ezVar2, null, new n10(q01Var, (sx) null, 1), 3);
                                break;
                        }
                        return ll2Var;
                    }
                };
                ak0Var2.g0(objL2);
            }
            ti0 ti0Var4 = (ti0) objL2;
            zF = ak0Var2.f(da1Var);
            objL3 = ak0Var2.L();
            if (zF) {
                objL3 = new r9(da1Var, 7);
                ak0Var2.g0(objL3);
            } else {
                objL3 = new r9(da1Var, 7);
                ak0Var2.g0(objL3);
            }
            int i9 = i2 & 234881024;
            wvVar2 = wvVar;
            j(u71VarE2, zC2, zA2, zBooleanValue3, str2, ti0Var3, ti0Var4, (ti0) objL3, l00Var, ak0Var2, i9 | 6);
            ak0Var2 = ak0Var2;
            w61 w61VarC2 = xj.c(q90.f, false);
            iX = ws0.x(ak0Var2);
            sl1 sl1VarL4 = ak0Var2.l();
            u71 u71VarB4 = nj2.B(ak0Var2, r71Var);
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar2);
            } else {
                ak0Var2.j0();
            }
            p12.l(raVar, ak0Var2, w61VarC2);
            p12.l(raVar2, ak0Var2, sl1VarL4);
            if (ak0Var2.S) {
                k3.p(iX, ak0Var2, iX, raVar3);
            } else {
                k3.p(iX, ak0Var2, iX, raVar3);
            }
            p12.l(raVar5, ak0Var2, u71VarB4);
            u71 u71VarE3 = p61.e0(r71Var, 12.0f, 0.0f, 2);
            wr wrVarA3 = ur.a(feVar, uiVar, ak0Var2, 0);
            iX2 = ws0.x(ak0Var2);
            sl1 sl1VarL5 = ak0Var2.l();
            u71 u71VarB5 = nj2.B(ak0Var2, u71VarE3);
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar2);
            } else {
                ak0Var2.j0();
            }
            p12.l(raVar, ak0Var2, wrVarA3);
            p12.l(raVar2, ak0Var2, sl1VarL5);
            if (ak0Var2.S) {
                k3.p(iX2, ak0Var2, iX2, raVar3);
            } else {
                k3.p(iX2, ak0Var2, iX2, raVar3);
            }
            p12.l(raVar5, ak0Var2, u71VarB5);
            l(l00Var, bmVar, ak0Var2, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
            g(q01VarA, l, ej0Var, ej0Var2, bmVar, lr0Var, r00Var, n00Var, l00Var, ak0Var2, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | i9);
            ak0Var2.p(true);
            h81 h81Var2 = h81.g;
            g82 g82VarQ4 = rw.Q(h81Var2, ak0Var2);
            g82 g82VarQ5 = rw.Q(h81.h, ak0Var2);
            g82 g82VarQ6 = rw.Q(h81Var2, ak0Var2);
            boolean zBooleanValue4 = ((Boolean) da1Var.getValue()).booleanValue();
            u71 u71VarL2 = nj2.l(r71Var);
            mj2 mj2Var2 = nb0.a;
            viVar = q90.q;
            x4 x4Var3 = x4.C;
            viVar2 = q90.o;
            if (ws0.j(viVar, viVar2)) {
                wiVar = wiVar5;
            } else if (ws0.j(viVar, viVar)) {
                wiVar = wiVar4;
            } else {
                wiVar = wiVar3;
            }
            sb0 sb0VarA2 = nb0.b(wiVar, g82VarQ6, new mb0(x4Var3, 0)).a(new sb0(new li2(new zc0(0.6f, g82VarQ4), (i52) null, (jo) null, (hx1) null, (LinkedHashMap) null, 126)));
            x4 x4Var4 = x4.D;
            if (ws0.j(viVar, viVar2)) {
                wiVar2 = wiVar5;
            } else if (ws0.j(viVar, viVar)) {
                wiVar2 = wiVar4;
            } else {
                wiVar2 = wiVar3;
            }
            dv1.c(zBooleanValue4, u71VarL2, sb0VarA2, nb0.f(wiVar2, g82VarQ6, new mb0(x4Var4, 1)).a(nb0.d(g82VarQ5, 2)), null, vs0.C(1193716082, new o10(j, da1Var, ezVar, q01VarA, lr0Var, emVarF, n00Var, bmVar, l00Var), ak0Var2), ak0Var2, 196656, 16);
            ak0Var2.p(true);
            ak0Var2.p(true);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(l, j, ej0Var, ej0Var2, bmVar, lr0Var, r00Var, n00Var, l00Var, i) { // from class: v00
                public final /* synthetic */ Long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ ej0 g;
                public final /* synthetic */ ej0 h;
                public final /* synthetic */ bm i;
                public final /* synthetic */ lr0 j;
                public final /* synthetic */ r00 k;
                public final /* synthetic */ n00 l;
                public final /* synthetic */ l00 m;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    e20.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void d(final ij0 ij0Var, final long j, final long j2, final float f, final gt gtVar, ak0 ak0Var, final int i) {
        int i2;
        long j3;
        ak0Var.X(2020490761);
        int i3 = i & 6;
        u71 u71VarB = r71.a;
        if (i3 == 0) {
            i2 = (ak0Var.f(u71VarB) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(ij0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= ak0Var.e(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.c(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var.h(gtVar) ? 131072 : 65536;
        }
        if (ak0Var.O(i2 & 1, (74899 & i2) != 74898)) {
            if (ij0Var != null) {
                u71VarB = f52.b(u71VarB, 0.0f, f, 1);
            }
            u71 u71VarC = f52.a.c(u71VarB);
            wr wrVarA = ur.a(ws0.j, q90.r, ak0Var, 6);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarC);
            wu.c.getClass();
            ti0 ti0Var = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, wrVarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB2);
            if (ij0Var != null) {
                ak0Var.W(396894187);
                vv.d(j3, ik2.a(nj2.R, ak0Var), vs0.C(1344395458, new l3(3, ij0Var), ak0Var), ak0Var, ((i2 >> 6) & 14) | 384);
                ak0Var.p(false);
            } else {
                ak0Var.W(397163267);
                ak0Var.p(false);
            }
            sv.a(yw.a.a(new dr(j2)), gtVar, ak0Var, ((i2 >> 12) & 112) | 8);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: h10
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e20.d(ij0Var, j, j2, f, gtVar, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, final ti0 ti0Var, final boolean z2, final boolean z3, final boolean z4, final String str2, final l00 l00Var, ak0 ak0Var, final int i) {
        int i2;
        ti0 ti0Var2;
        long j;
        p82 p82VarT;
        ak0Var.X(-945355136);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        r71 r71Var = r71.a;
        if (i3 == 0) {
            i2 |= ak0Var.f(r71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ti0Var2 = ti0Var;
            i2 |= ak0Var.h(ti0Var2) ? 2048 : 1024;
        } else {
            ti0Var2 = ti0Var;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ak0Var.g(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ak0Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ak0Var.f(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= ak0Var.f(l00Var) ? 536870912 : 268435456;
        }
        if (ak0Var.O(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z5 = (234881024 & i2) == 67108864;
            Object objL = ak0Var.L();
            if (z5 || objL == cv.a) {
                objL = new ii(str2, 2);
                ak0Var.g0(objL);
            }
            u71 u71VarA = l02.a(r71Var, true, (ej0) objL);
            u32 u32VarA = j42.a(nj2.E, ak0Var);
            int i4 = i2 >> 6;
            if (z) {
                j = z3 ? l00Var.r : l00Var.s;
            } else {
                l00Var.getClass();
                j = dr.f;
            }
            if (z2) {
                ak0Var.W(-1319856736);
                p82VarT = c52.a(j, rw.Q(h81.g, ak0Var), ak0Var);
                ak0Var.p(false);
            } else {
                ak0Var.W(-1319630064);
                p82VarT = y12.t(new dr(j), ak0Var);
                ak0Var.p(false);
            }
            ra2.b(z, ti0Var2, u71VarA, z3, u32VarA, ((dr) p82VarT.getValue()).a, 0L, 0.0f, (!z4 || z) ? null : sv0.E(nj2.K, l00Var.u), null, vs0.C(1126347158, new p10(str, l00Var, z4, z, z3), ak0Var), ak0Var, i4 & 7294, 1472);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: e10
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e20.e(str, z, ti0Var, z2, z3, z4, str2, l00Var, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void f(u71 u71Var, int i, ej0 ej0Var, l00 l00Var, ak0 ak0Var, int i2) {
        ak0Var.X(-1461252485);
        int i3 = (ak0Var.d(i) ? 32 : 16) | i2 | (ak0Var.h(ej0Var) ? 256 : 128) | (ak0Var.f(l00Var) ? 2048 : 1024);
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            sv.a(yw.a.a(new dr(l00Var.c)), vs0.C(-1734512197, new r10(i, ej0Var, u71Var), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(u71Var, i, ej0Var, l00Var, i2, 6);
        }
    }

    public static final void g(q01 q01Var, final Long l, final ej0 ej0Var, final ej0 ej0Var2, final bm bmVar, final lr0 lr0Var, final r00 r00Var, final n00 n00Var, final l00 l00Var, ak0 ak0Var, final int i) {
        Object n7Var;
        final q01 q01Var2 = q01Var;
        ak0Var.X(-1994757941);
        int i2 = i | (ak0Var.f(q01Var2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(l) ? 32 : 16;
        }
        int i3 = i2 | (ak0Var.h(ej0Var) ? 256 : 128) | (ak0Var.h(ej0Var2) ? 2048 : 1024) | (ak0Var.h(bmVar) ? 16384 : 8192) | (ak0Var.h(lr0Var) ? 131072 : 65536) | (ak0Var.f(r00Var) ? 1048576 : 524288) | (ak0Var.f(n00Var) ? 8388608 : 4194304) | (ak0Var.f(l00Var) ? 67108864 : 33554432);
        if (ak0Var.O(i3 & 1, (38347923 & i3) != 38347922)) {
            zl zlVarH = bmVar.h();
            boolean zF = ak0Var.f(lr0Var);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zF || objL == is1Var) {
                objL = bmVar.e(lr0Var.e, 1);
                ak0Var.g0(objL);
            }
            ef2.a(ik2.a(nj2.G, ak0Var), vs0.C(1504086906, new u10(q01Var2, lr0Var, bmVar, (em) objL, ej0Var, zlVarH, l, r00Var, n00Var, l00Var), ak0Var), ak0Var, 48);
            boolean zH = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ak0Var.h(bmVar) | ak0Var.h(lr0Var);
            Object objL2 = ak0Var.L();
            if (zH || objL2 == is1Var) {
                q01Var2 = q01Var;
                n7Var = new n7(q01Var2, ej0Var2, bmVar, lr0Var, null, 4);
                ak0Var.g0(n7Var);
            } else {
                n7Var = objL2;
                q01Var2 = q01Var;
            }
            s5.o((ij0) n7Var, ak0Var, q01Var2);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: y00
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e20.g(q01Var2, l, ej0Var, ej0Var2, bmVar, lr0Var, r00Var, n00Var, l00Var, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void h(final ti0 ti0Var, final jo0 jo0Var, final String str, u71 u71Var, boolean z, ak0 ak0Var, final int i, final int i2) {
        u71 u71Var2;
        int i3;
        boolean z2;
        int i4;
        final u71 u71Var3;
        final boolean z3;
        ak0Var.X(-368059805);
        int i5 = i | (ak0Var.h(ti0Var) ? 4 : 2) | (ak0Var.f(jo0Var) ? 32 : 16) | (ak0Var.f(str) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            u71Var2 = u71Var;
        } else {
            u71Var2 = u71Var;
            i3 = i5 | (ak0Var.f(u71Var2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (ak0Var.g(z2) ? 16384 : 8192);
        }
        int i8 = 0;
        if (ak0Var.O(i4 & 1, (i4 & 9363) != 9362)) {
            u71 u71Var4 = i6 != 0 ? r71.a : u71Var2;
            if (i7 != 0) {
                z2 = true;
            }
            float f = fh2.a;
            kj1 kj1Var = jh2.a;
            int iO = ((m40) ak0Var.j(yv.h)).O(4.0f);
            boolean zD = ak0Var.d(iO);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (zD || objL == obj) {
                objL = new kh2(iO);
                ak0Var.g0(objL);
            }
            kh2 kh2Var = (kh2) objL;
            gt gtVarC = vs0.C(-456272562, new v10(i8, str), ak0Var);
            pa1 pa1Var = fi.a;
            boolean zG = ak0Var.g(false) | ak0Var.f(pa1Var);
            Object objL2 = ak0Var.L();
            if (zG || objL2 == obj) {
                objL2 = new mh2(pa1Var);
                ak0Var.g0(objL2);
            }
            boolean z4 = z2;
            jh2.b(kh2Var, gtVarC, (mh2) objL2, null, false, vs0.C(-1124908186, new w10(ti0Var, u71Var4, z4, jo0Var, str), ak0Var), ak0Var, 100663344);
            u71Var3 = u71Var4;
            z3 = z4;
        } else {
            ak0Var.R();
            u71Var3 = u71Var2;
            z3 = z2;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(jo0Var, str, u71Var3, z3, i, i2) { // from class: w00
                public final /* synthetic */ jo0 f;
                public final /* synthetic */ String g;
                public final /* synthetic */ u71 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int j;

                {
                    this.j = i2;
                }

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(1);
                    e20.h(this.e, this.f, this.g, this.h, this.i, (ak0) obj2, iP, this.j);
                    return ll2.a;
                }
            };
        }
    }

    public static final void i(final em emVar, final ej0 ej0Var, final long j, final Long l, final r00 r00Var, final n00 n00Var, final l00 l00Var, final Locale locale, ak0 ak0Var, final int i) {
        r71 r71Var;
        em emVar2 = emVar;
        final ej0 ej0Var2 = ej0Var;
        r00 r00Var2 = r00Var;
        is1 is1Var = ws0.i;
        ak0Var.X(-333300603);
        Object obj = n00Var;
        l00 l00Var2 = l00Var;
        int i2 = i | (ak0Var.f(emVar2) ? 4 : 2) | (ak0Var.h(ej0Var2) ? 32 : 16) | (ak0Var.e(j) ? 256 : 128) | (ak0Var.f(l) ? 2048 : 1024) | (ak0Var.f(r00Var2) ? 1048576 : 524288) | (ak0Var.f(obj) ? 8388608 : 4194304) | (ak0Var.f(l00Var2) ? 67108864 : 33554432) | (ak0Var.h(locale) ? 536870912 : 268435456);
        if (ak0Var.O(i2 & 1, (306783379 & i2) != 306783378)) {
            ak0Var.W(606771165);
            ak0Var.p(false);
            r71 r71Var2 = r71.a;
            u71 u71VarC = f52.f(r71Var2, 288.0f).c(r71Var2);
            wr wrVarA = ur.a(is1Var, q90.r, ak0Var, 6);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarC);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, wrVarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            ak0Var.W(-680088486);
            int i3 = 0;
            int i4 = 0;
            int i5 = 6;
            while (i4 < i5) {
                gd0 gd0Var = f52.a;
                sv1 sv1VarA = rv1.a(is1Var, q90.p, ak0Var, 54);
                int iX2 = ws0.x(ak0Var);
                sl1 sl1VarL2 = ak0Var.l();
                u71 u71VarB2 = nj2.B(ak0Var, gd0Var);
                wu.c.getClass();
                int i6 = i3;
                wv wvVar2 = vu.b;
                ak0Var.Z();
                int i7 = i4;
                if (ak0Var.S) {
                    ak0Var.k(wvVar2);
                } else {
                    ak0Var.j0();
                }
                p12.l(vu.f, ak0Var, sv1VarA);
                p12.l(vu.e, ak0Var, sl1VarL2);
                ra raVar2 = vu.g;
                if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                    k3.p(iX2, ak0Var, iX2, raVar2);
                }
                p12.l(vu.d, ak0Var, u71VarB2);
                ak0Var.W(1542622325);
                int i8 = i6;
                int i9 = 0;
                while (i9 < 7) {
                    int i10 = emVar2.d;
                    if (i8 < i10 || i8 >= i10 + emVar2.c) {
                        is1Var = is1Var;
                        r71Var = r71Var2;
                        ak0Var.W(576825328);
                        u71 u71VarM = f52.m(r71Var, nj2.F, nj2.D, 0.0f, 12);
                        a90 a90Var = yr0.c;
                        r02.b(ak0Var, f52.k(u71VarM, ((w60) ak0Var.j(a90Var)).e, ((w60) ak0Var.j(a90Var)).e));
                        ak0Var.p(false);
                    } else {
                        ak0Var.W(577914947);
                        int i11 = i8 - emVar2.d;
                        final long j2 = (((long) i11) * 86400000) + emVar2.e;
                        boolean z = j2 == j;
                        boolean z2 = l != null && j2 == l.longValue();
                        ak0Var.W(578890300);
                        ak0Var.p(false);
                        StringBuilder sb = new StringBuilder();
                        ak0Var.W(974838827);
                        ak0Var.p(false);
                        if (z) {
                            ak0Var.W(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(r02.l(R.string.m3c_date_picker_today_description, ak0Var));
                            ak0Var.p(false);
                        } else {
                            ak0Var.W(975029291);
                            ak0Var.p(false);
                        }
                        String string = sb.length() == 0 ? null : sb.toString();
                        String strA = r00Var2.a(Long.valueOf(j2), locale, true);
                        if (strA == null) {
                            strA = "";
                        }
                        String strA2 = am.a(i11 + 1, locale);
                        boolean zE = ((i2 & 112) == 32) | ak0Var.e(j2);
                        Object objL = ak0Var.L();
                        is1 is1Var2 = cv.a;
                        if (zE || objL == is1Var2) {
                            objL = new ti0() { // from class: c10
                                @Override // defpackage.ti0
                                public final Object a() {
                                    ej0Var2.h(Long.valueOf(j2));
                                    return ll2.a;
                                }
                            };
                            ak0Var.g0(objL);
                        }
                        ti0 ti0Var = (ti0) objL;
                        boolean zE2 = ak0Var.e(j2) | ((29360128 & i2) == 8388608);
                        Object objL2 = ak0Var.L();
                        if (zE2 || objL2 == is1Var2) {
                            obj.getClass();
                            objL2 = Boolean.TRUE;
                            ak0Var.g0(objL2);
                        }
                        boolean zBooleanValue = ((Boolean) objL2).booleanValue();
                        if (string != null) {
                            strA = k3.j(string, ", ", strA);
                        }
                        r71Var = r71Var2;
                        e(strA2, z2, ti0Var, z2, zBooleanValue, z, strA, l00Var2, ak0Var, ((i2 << 3) & 1879048192) | 48);
                        ak0Var.p(false);
                    }
                    i8++;
                    emVar2 = emVar;
                    ej0Var2 = ej0Var;
                    r00Var2 = r00Var;
                    obj = n00Var;
                    l00Var2 = l00Var;
                    r71Var2 = r71Var;
                    i9++;
                    is1Var = is1Var;
                }
                ak0Var.p(false);
                ak0Var.p(true);
                emVar2 = emVar;
                ej0Var2 = ej0Var;
                r00Var2 = r00Var;
                obj = n00Var;
                l00Var2 = l00Var;
                i5 = 6;
                i4 = i7 + 1;
                i3 = i8;
            }
            ak0Var.p(false);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(ej0Var, j, l, r00Var, n00Var, l00Var, locale, i) { // from class: d10
                public final /* synthetic */ ej0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ Long h;
                public final /* synthetic */ r00 i;
                public final /* synthetic */ n00 j;
                public final /* synthetic */ l00 k;
                public final /* synthetic */ Locale l;

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(221185);
                    e20.i(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ak0) obj2, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void j(u71 u71Var, final boolean z, final boolean z2, final boolean z3, final String str, final ti0 ti0Var, final ti0 ti0Var2, final ti0 ti0Var3, final l00 l00Var, ak0 ak0Var, final int i) {
        u71 u71Var2;
        ak0Var.X(-773929258);
        int i2 = i | (ak0Var.g(z) ? 32 : 16) | (ak0Var.g(z2) ? 256 : 128) | (ak0Var.g(z3) ? 2048 : 1024) | (ak0Var.f(str) ? 16384 : 8192) | (ak0Var.h(ti0Var) ? 131072 : 65536) | (ak0Var.h(ti0Var2) ? 1048576 : 524288) | (ak0Var.h(ti0Var3) ? 8388608 : 4194304) | (ak0Var.f(l00Var) ? 67108864 : 33554432);
        if (ak0Var.O(i2 & 1, (38347923 & i2) != 38347922)) {
            u71Var2 = u71Var;
            u71 u71VarF = f52.f(u71Var2.c(f52.a), 56.0f);
            sv1 sv1VarA = rv1.a(z3 ? ws0.e : ws0.j, q90.p, ak0Var, 48);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarF);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, sv1VarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            o(ti0Var3, z3, null, vs0.C(619076006, new ji(4, str, l00Var), ak0Var), ak0Var, ((i2 >> 6) & 112) | ((i2 >> 21) & 14) | 3072);
            if (z3) {
                ak0Var.W(282432080);
                ak0Var.p(false);
            } else {
                ak0Var.W(281624840);
                sv.a(yw.a.a(new dr(l00Var.f)), vs0.C(-128317193, new y10(ti0Var2, z2, ti0Var, z), ak0Var), ak0Var, 56);
                ak0Var.p(false);
            }
            ak0Var.p(true);
        } else {
            u71Var2 = u71Var;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final u71 u71Var3 = u71Var2;
            lr1VarR.d = new ij0(z, z2, z3, str, ti0Var, ti0Var2, ti0Var3, l00Var, i) { // from class: x00
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ String i;
                public final /* synthetic */ ti0 j;
                public final /* synthetic */ ti0 k;
                public final /* synthetic */ ti0 l;
                public final /* synthetic */ l00 m;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(7);
                    e20.j(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void k(final Long l, final long j, final int i, final ej0 ej0Var, final ej0 ej0Var2, final bm bmVar, final lr0 lr0Var, final r00 r00Var, final n00 n00Var, final l00 l00Var, final xf0 xf0Var, ak0 ak0Var, final int i2) {
        ak0Var.X(-2053685029);
        int i3 = i2 | (ak0Var.f(l) ? 4 : 2) | (ak0Var.e(j) ? 32 : 16) | (ak0Var.d(i) ? 256 : 128) | (ak0Var.h(ej0Var) ? 2048 : 1024) | (ak0Var.h(ej0Var2) ? 16384 : 8192) | (ak0Var.h(bmVar) ? 131072 : 65536) | (ak0Var.h(lr0Var) ? 1048576 : 524288) | (ak0Var.f(r00Var) ? 8388608 : 4194304) | (ak0Var.f(n00Var) ? 67108864 : 33554432) | (ak0Var.f(l00Var) ? 536870912 : 268435456);
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && ((ak0Var.f(xf0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = -((m40) ak0Var.j(yv.h)).O(48.0f);
            g82 g82VarQ = rw.Q(h81.g, ak0Var);
            g82 g82VarQ2 = rw.Q(h81.h, ak0Var);
            h81 h81Var = h81.e;
            g82 g82VarQ3 = rw.Q(h81Var, ak0Var);
            g82 g82VarQ4 = rw.Q(h81Var, ak0Var);
            x50 x50Var = new x50(i);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new s1(25);
                ak0Var.g0(objL);
            }
            u71 u71VarA = l02.a(r71.a, false, (ej0) objL);
            boolean zH = ak0Var.h(g82VarQ3) | ak0Var.h(g82VarQ) | ak0Var.h(g82VarQ2) | ak0Var.d(i4) | ak0Var.h(g82VarQ4);
            Object objL2 = ak0Var.L();
            if (zH || objL2 == obj) {
                objL2 = new vr(g82VarQ3, g82VarQ, g82VarQ2, i4, g82VarQ4);
                ak0Var.g0(objL2);
            }
            p61.a(x50Var, u71VarA, (ej0) objL2, null, "DatePickerDisplayModeAnimation", null, vs0.C(1838500091, new x10(l, j, ej0Var, ej0Var2, bmVar, lr0Var, r00Var, n00Var, l00Var, xf0Var), ak0Var), ak0Var, ((i3 >> 6) & 14) | 1597440);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(l, j, i, ej0Var, ej0Var2, bmVar, lr0Var, r00Var, n00Var, l00Var, xf0Var, i2) { // from class: i10
                public final /* synthetic */ Long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ int g;
                public final /* synthetic */ ej0 h;
                public final /* synthetic */ ej0 i;
                public final /* synthetic */ bm j;
                public final /* synthetic */ lr0 k;
                public final /* synthetic */ r00 l;
                public final /* synthetic */ n00 m;
                public final /* synthetic */ l00 n;
                public final /* synthetic */ xf0 o;

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(1);
                    e20.k(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (ak0) obj2, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void l(l00 l00Var, bm bmVar, ak0 ak0Var, int i) {
        l00 l00Var2 = l00Var;
        ak0 ak0Var2 = ak0Var;
        ak0Var2.X(-1849465391);
        int i2 = (i & 6) == 0 ? i | (ak0Var2.f(l00Var2) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= ak0Var2.h(bmVar) ? 32 : 16;
        }
        boolean z = false;
        boolean z2 = true;
        int i3 = 3;
        if (ak0Var2.O(i2 & 1, (i2 & 19) != 18)) {
            int iD = bmVar.d();
            List listI = bmVar.i();
            ArrayList arrayList = new ArrayList();
            int i4 = iD - 1;
            int size = listI.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(listI.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(listI.get(i6));
            }
            vf2 vf2VarA = ik2.a(nj2.W, ak0Var2);
            r71 r71Var = r71.a;
            float f = 0.0f;
            u71 u71VarC = f52.b(r71Var, 0.0f, 48.0f, 1).c(f52.a);
            sv1 sv1VarA = rv1.a(ws0.i, q90.p, ak0Var2, 54);
            int iX = ws0.x(ak0Var2);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, u71VarC);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, sv1VarA);
            p12.l(vu.e, ak0Var2, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var2, iX, raVar);
            }
            p12.l(vu.d, ak0Var2, u71VarB);
            ak0Var2.W(24563235);
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                qj1 qj1Var = (qj1) arrayList.get(i7);
                boolean zF = ak0Var2.f(qj1Var);
                Object objL = ak0Var2.L();
                if (zF || objL == cv.a) {
                    objL = new m(8, qj1Var);
                    ak0Var2.g0(objL);
                }
                AtomicInteger atomicInteger = l02.a;
                u71 u71VarM = f52.m(new gq((ej0) objL), nj2.F, nj2.D, f, 12);
                a90 a90Var = yr0.c;
                u71 u71VarK = f52.k(u71VarM, ((w60) ak0Var2.j(a90Var)).e, ((w60) ak0Var2.j(a90Var)).e);
                w61 w61VarC = xj.c(q90.j, z);
                int iX2 = ws0.x(ak0Var2);
                sl1 sl1VarL2 = ak0Var2.l();
                u71 u71VarB2 = nj2.B(ak0Var2, u71VarK);
                wu.c.getClass();
                wv wvVar2 = vu.b;
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar2);
                } else {
                    ak0Var2.j0();
                }
                p12.l(vu.f, ak0Var2, w61VarC);
                p12.l(vu.e, ak0Var2, sl1VarL2);
                ra raVar2 = vu.g;
                if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX2))) {
                    k3.p(iX2, ak0Var2, iX2, raVar2);
                }
                p12.l(vu.d, ak0Var2, u71VarB2);
                ef2.b((String) qj1Var.f, f52.p(r71Var, i3), l00Var2.d, 0L, 0L, new gc2(i3), 0L, 0, false, 0, 0, vf2VarA, ak0Var, 48, 0, 130040);
                ak0Var2 = ak0Var;
                ak0Var2.p(true);
                i7++;
                i3 = 3;
                z = false;
                z2 = true;
                r71Var = r71Var;
                size2 = size2;
                arrayList = arrayList;
                f = f;
                l00Var2 = l00Var;
            }
            ak0Var2.p(z);
            ak0Var2.p(z2);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(l00Var, bmVar, i, 3);
        }
    }

    public static final void m(final String str, final u71 u71Var, final boolean z, final boolean z2, final ti0 ti0Var, final String str2, final l00 l00Var, ak0 ak0Var, final int i) {
        Object objE;
        long j;
        ak0Var.X(-1153850597);
        int i2 = i | (ak0Var.f(str) ? 4 : 2) | (ak0Var.g(z) ? 256 : 128) | (ak0Var.g(z2) ? 2048 : 1024) | (ak0Var.h(ti0Var) ? 16384 : 8192) | (ak0Var.g(true) ? 131072 : 65536) | (ak0Var.f(str2) ? 1048576 : 524288) | (ak0Var.f(l00Var) ? 8388608 : 4194304);
        if (ak0Var.O(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (z3 || objL == is1Var) {
                objE = (!z2 || z) ? null : sv0.E(nj2.K, l00Var.u);
                ak0Var.g0(objE);
            } else {
                objE = objL;
            }
            oj ojVar = (oj) objE;
            boolean z4 = (3670016 & i2) == 1048576;
            Object objL2 = ak0Var.L();
            if (z4 || objL2 == is1Var) {
                objL2 = new ii(str2, 3);
                ak0Var.g0(objL2);
            }
            u71 u71VarA = l02.a(u71Var, true, (ej0) objL2);
            u32 u32VarA = j42.a(nj2.c0, ak0Var);
            int i3 = i2 >> 6;
            int i4 = i3 & 14;
            if (z) {
                j = l00Var.l;
            } else {
                l00Var.getClass();
                j = dr.f;
            }
            ra2.b(z, ti0Var, u71VarA, true, u32VarA, ((dr) c52.a(j, rw.Q(h81.g, ak0Var), ak0Var).getValue()).a, 0L, 0.0f, ojVar, null, vs0.C(-564400443, new y10(str, l00Var, z2, z), ak0Var), ak0Var, ((i2 >> 9) & 112) | i4 | (i3 & 7168), 1472);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(str, u71Var, z, z2, ti0Var, str2, l00Var, i) { // from class: f10
                public final /* synthetic */ String e;
                public final /* synthetic */ u71 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ ti0 i;
                public final /* synthetic */ String j;
                public final /* synthetic */ l00 k;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(49);
                    e20.m(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void n(final u71 u71Var, final long j, final ej0 ej0Var, final n00 n00Var, final bm bmVar, final lr0 lr0Var, final l00 l00Var, ak0 ak0Var, final int i) {
        ak0Var.X(-1286899812);
        int i2 = i | (ak0Var.e(j) ? 32 : 16) | (ak0Var.h(ej0Var) ? 256 : 128) | (ak0Var.f(n00Var) ? 2048 : 1024) | (ak0Var.h(bmVar) ? 16384 : 8192) | (ak0Var.h(lr0Var) ? 131072 : 65536) | (ak0Var.f(l00Var) ? 1048576 : 524288);
        if (ak0Var.O(i2 & 1, (599187 & i2) != 599186)) {
            ef2.a(ik2.a(nj2.Z, ak0Var), vs0.C(1301915789, new c20(bmVar, j, lr0Var, u71Var, l00Var, ej0Var, n00Var), ak0Var), ak0Var, 48);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(j, ej0Var, n00Var, bmVar, lr0Var, l00Var, i) { // from class: a10
                public final /* synthetic */ long f;
                public final /* synthetic */ ej0 g;
                public final /* synthetic */ n00 h;
                public final /* synthetic */ bm i;
                public final /* synthetic */ lr0 j;
                public final /* synthetic */ l00 k;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(7);
                    e20.n(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void o(ti0 ti0Var, boolean z, u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        ti0 ti0Var2;
        int i2;
        u71 u71Var2;
        ak0Var.X(-709923073);
        if ((i & 6) == 0) {
            ti0Var2 = ti0Var;
            i2 = (ak0Var.h(ti0Var2) ? 4 : 2) | i;
        } else {
            ti0Var2 = ti0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.g(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= ak0Var.h(gtVar) ? 2048 : 1024;
        }
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            jv1 jv1Var = kv1.a;
            kj1 kj1Var = hl.a;
            long j = ((dr) ak0Var.j(yw.a)).a;
            long j2 = dr.g;
            gl glVarA = hl.a((jr) ak0Var.j(lr.a));
            long j3 = j2 != 16 ? j2 : glVarA.a;
            if (j == r13) {
                j = glVarA.b;
            }
            long j4 = j;
            long j5 = j2 != r13 ? j2 : glVarA.c;
            if (j2 == 16) {
                j2 = glVarA.d;
            }
            r71 r71Var = r71.a;
            j20.h(ti0Var2, r71Var, false, jv1Var, new gl(j3, j4, j5, j2), null, vs0.C(1899489890, new d20(gtVar, z), ak0Var), ak0Var, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
            u71Var2 = r71Var;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new z00(ti0Var, z, u71Var2, gtVar, i);
        }
    }
}

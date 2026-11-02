package defpackage;

import android.R;
import android.content.res.Resources;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j12 implements nn2 {
    /* JADX WARN: Code duplicated, block: B:189:0x029a  */
    /* JADX WARN: Code duplicated, block: B:191:0x029d  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:209:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0300  */
    /* JADX WARN: Code duplicated, block: B:215:0x031c  */
    /* JADX WARN: Code duplicated, block: B:217:0x031f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0326  */
    /* JADX WARN: Code duplicated, block: B:223:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:225:0x032d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0349  */
    /* JADX WARN: Code duplicated, block: B:230:0x034d  */
    /* JADX WARN: Code duplicated, block: B:237:0x037b  */
    /* JADX WARN: Code duplicated, block: B:239:0x037e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0381  */
    /* JADX WARN: Code duplicated, block: B:243:0x0385  */
    /* JADX WARN: Code duplicated, block: B:245:0x0389 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x038b  */
    /* JADX WARN: Code duplicated, block: B:249:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:266:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x0409  */
    /* JADX WARN: Code duplicated, block: B:270:0x0433  */
    /* JADX WARN: Code duplicated, block: B:272:0x0436  */
    /* JADX WARN: Code duplicated, block: B:276:0x0454  */
    /* JADX WARN: Code duplicated, block: B:279:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x0495  */
    /* JADX WARN: Code duplicated, block: B:283:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:287:0x0513  */
    /* JADX WARN: Code duplicated, block: B:289:0x0544  */
    /* JADX WARN: Code duplicated, block: B:290:0x0547 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x0549  */
    /* JADX WARN: Code duplicated, block: B:292:0x054c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x054e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0551  */
    /* JADX WARN: Code duplicated, block: B:297:0x0559  */
    /* JADX WARN: Code duplicated, block: B:300:0x0570  */
    /* JADX WARN: Code duplicated, block: B:305:0x059d  */
    /* JADX WARN: Code duplicated, block: B:308:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:311:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:312:0x05e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:314:0x05ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:316:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:318:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:319:0x0600  */
    /* JADX WARN: Code duplicated, block: B:321:0x0618  */
    /* JADX WARN: Code duplicated, block: B:323:0x061c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x061e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0621 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x0623  */
    /* JADX WARN: Code duplicated, block: B:327:0x0626  */
    /* JADX WARN: Code duplicated, block: B:329:0x062b  */
    /* JADX WARN: Code duplicated, block: B:330:0x0638  */
    /* JADX WARN: Code duplicated, block: B:333:0x0660  */
    /* JADX WARN: Code duplicated, block: B:337:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:340:0x06b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:341:0x06b9  */
    public static final void a(final CharSequence charSequence, final ij0 ij0Var, final xd2 xd2Var, final jj0 jj0Var, final ij0 ij0Var2, final ij0 ij0Var3, final ij0 ij0Var4, final boolean z, final boolean z2, final boolean z3, final ur0 ur0Var, final gj1 gj1Var, final jd2 jd2Var, final gt gtVar, ak0 ak0Var, final int i, final int i2) {
        int i3;
        int i4;
        iq0 iq0Var;
        long j;
        dk1 dk1Var;
        float f;
        int iOrdinal;
        float f2;
        ii2 ii2VarC;
        g82 g82VarQ;
        g82 g82VarQ2;
        int iOrdinal2;
        tu tuVar;
        float f3;
        int iOrdinal3;
        float f4;
        gi2 gi2VarF;
        g82 g82Var;
        ii2 ii2VarC2;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        ii2 ii2VarC3;
        iq0 iq0Var2;
        int[] iArr;
        long j2;
        mr mrVarE;
        boolean zF;
        Object objL;
        is1 is1Var;
        iq0 iq0Var3;
        long j3;
        iq0 iq0Var4;
        ii2 ii2VarC4;
        mr mrVarE2;
        boolean zF2;
        Object objL2;
        ii2 ii2VarC5;
        Object objL3;
        sd2 sd2Var;
        gt gtVar2;
        vf2 vf2Var;
        boolean z4;
        long j4;
        Object objL4;
        gt gtVarC;
        Object objL5;
        int i5;
        long j5;
        gt gtVarC2;
        long j6;
        long j7;
        gt gtVar3;
        Object objL6;
        da1 da1Var;
        boolean zF3;
        Object objL7;
        ak0 ak0Var2 = ak0Var;
        ak0Var2.X(546805032);
        if ((i & 6) == 0) {
            i3 = (ak0Var2.d(1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var2.h(charSequence) ? 32 : 16;
        }
        int i6 = i3;
        if ((i & 384) == 0) {
            i6 |= ak0Var2.h(ij0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= ak0Var2.f(xd2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= ak0Var2.h(jj0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i6 |= ak0Var2.h(ij0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i6 |= ak0Var2.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= ak0Var2.h(ij0Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= ak0Var2.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= ak0Var2.h(null) ? 536870912 : 268435456;
        }
        int i7 = i6;
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var2.h(ij0Var4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ak0Var2.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ak0Var2.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ak0Var2.f(ur0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ak0Var2.f(gj1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ak0Var2.f(jd2Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ak0Var2.h(gtVar) ? 8388608 : 4194304;
        }
        int i8 = i4;
        if (ak0Var2.O(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) mx.r(ur0Var, ak0Var2, (i8 >> 12) & 14).getValue()).booleanValue();
            iq0 iq0Var5 = iq0.g;
            iq0 iq0Var6 = iq0.f;
            iq0 iq0Var7 = iq0.e;
            if (zBooleanValue) {
                iq0Var = iq0Var7;
            } else {
                iq0Var = charSequence.length() == 0 ? iq0Var6 : iq0Var5;
            }
            if (!z2) {
                j = jd2Var.z;
            } else if (z3) {
                j = jd2Var.A;
            } else {
                j = zBooleanValue ? jd2Var.x : jd2Var.y;
            }
            gk2 gk2Var = (gk2) ak0Var2.j(ik2.a);
            vf2 vf2Var2 = gk2Var.j;
            vf2 vf2Var3 = gk2Var.l;
            long jB = vf2Var2.b();
            long j8 = dr.g;
            boolean z5 = (vk2.a(jB, j8) && !vk2.a(vf2Var3.b(), j8)) || (!vk2.a(vf2Var2.b(), j8) && vk2.a(vf2Var3.b(), j8));
            long jB2 = vf2Var3.b();
            if (z5 && jB2 == 16) {
                jB2 = j;
            }
            long jB3 = vf2Var2.b();
            long j9 = (z5 && jB3 == 16) ? j : jB3;
            boolean z6 = z5;
            boolean z7 = jj0Var != null;
            ki2 ki2VarE = oi2.e(iq0Var, "TextFieldInputState", ak0Var2, 48);
            dk1 dk1Var2 = ki2VarE.d;
            tu tuVar2 = ki2VarE.a;
            g82 g82VarQ3 = rw.Q(h81.f, ak0Var2);
            mj2 mj2Var = ir2.V;
            iq0 iq0Var8 = (iq0) tuVar2.f();
            ak0Var2.W(-1436405362);
            int iOrdinal6 = iq0Var8.ordinal();
            float f6 = 0.0f;
            if (iOrdinal6 != 0) {
                dk1Var = dk1Var2;
                if (iOrdinal6 == 1) {
                    if (z7) {
                        f = 0.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf = Float.valueOf(f);
                    iq0 iq0Var9 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-1436405362);
                    iOrdinal = iq0Var9.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                qj.p();
                                return;
                            }
                        } else if (z7) {
                            f2 = 0.0f;
                        }
                        f2 = 1.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    ki2VarE.f();
                    ak0Var2.W(-709912974);
                    ak0Var2.p(false);
                    ii2VarC = oi2.c(ki2VarE, fValueOf, fValueOf2, g82VarQ3, mj2Var, ak0Var2, 196608);
                    h81 h81Var = h81.h;
                    g82VarQ = rw.Q(h81Var, ak0Var2);
                    g82VarQ2 = rw.Q(h81.i, ak0Var2);
                    iq0 iq0Var10 = (iq0) tuVar2.f();
                    ak0Var2.W(-1093194547);
                    iOrdinal2 = iq0Var10.ordinal();
                    if (iOrdinal2 != 0) {
                        tuVar = tuVar2;
                        if (iOrdinal2 != 1) {
                            if (z7) {
                            }
                            ak0Var2.p(false);
                            Float fValueOf3 = Float.valueOf(f3);
                            iq0 iq0Var11 = (iq0) dk1Var.getValue();
                            ak0Var2.W(-1093194547);
                            iOrdinal3 = iq0Var11.ordinal();
                            if (iOrdinal3 == 0) {
                                f4 = 1.0f;
                            } else {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 != 2) {
                                        qj.p();
                                        return;
                                    }
                                } else if (z7) {
                                    f4 = 1.0f;
                                }
                                f4 = 0.0f;
                            }
                            ak0Var2.p(false);
                            Float fValueOf4 = Float.valueOf(f4);
                            gi2VarF = ki2VarE.f();
                            ak0Var2.W(-984009111);
                            if (gi2VarF.b(iq0Var7, iq0Var6) && (gi2VarF.b(iq0Var6, iq0Var7) || gi2VarF.b(iq0Var5, iq0Var6))) {
                                g82Var = g82VarQ2;
                            } else {
                                g82Var = g82VarQ;
                            }
                            ak0Var2.p(false);
                            ii2VarC2 = oi2.c(ki2VarE, fValueOf3, fValueOf4, g82Var, mj2Var, ak0Var2, 196608);
                            iq0 iq0Var12 = (iq0) tuVar.f();
                            ak0Var2.W(-1258455321);
                            iOrdinal4 = iq0Var12.ordinal();
                            if (iOrdinal4 == 0) {
                                f5 = 1.0f;
                            } else {
                                if (iOrdinal4 != 1) {
                                    if (iOrdinal4 != 2) {
                                        qj.p();
                                        return;
                                    }
                                } else if (z7) {
                                    f5 = 0.0f;
                                }
                                f5 = 1.0f;
                            }
                            ak0Var2.p(false);
                            Float fValueOf5 = Float.valueOf(f5);
                            iq0 iq0Var13 = (iq0) dk1Var.getValue();
                            ak0Var2.W(-1258455321);
                            iOrdinal5 = iq0Var13.ordinal();
                            if (iOrdinal5 == 0) {
                                f6 = 1.0f;
                            } else {
                                if (iOrdinal5 != 1) {
                                    if (iOrdinal5 != 2) {
                                        qj.p();
                                        return;
                                    }
                                } else if (!z7) {
                                }
                                f6 = 1.0f;
                            }
                            ak0Var2.p(false);
                            Float fValueOf6 = Float.valueOf(f6);
                            ki2VarE.f();
                            ak0Var2.W(2126293195);
                            ak0Var2.p(false);
                            ii2VarC3 = oi2.c(ki2VarE, fValueOf5, fValueOf6, g82VarQ, mj2Var, ak0Var2, 196608);
                            g82 g82VarQ4 = rw.Q(h81Var, ak0Var2);
                            iq0Var2 = (iq0) dk1Var.getValue();
                            ak0Var2.W(-12973394);
                            iArr = td2.a;
                            if (iArr[iq0Var2.ordinal()] == 1) {
                                j2 = jB2;
                            } else {
                                j2 = j9;
                            }
                            ak0Var2.p(false);
                            mrVarE = dr.e(j2);
                            zF = ak0Var2.f(mrVarE);
                            objL = ak0Var2.L();
                            is1Var = cv.a;
                            if (zF || objL == is1Var) {
                                mj2 mj2Var2 = new mj2(x4.s, new y3(7, mrVarE));
                                ak0Var2.g0(mj2Var2);
                                objL = mj2Var2;
                            }
                            mj2 mj2Var3 = (mj2) objL;
                            iq0Var3 = (iq0) tuVar.f();
                            ak0Var2.W(-12973394);
                            if (iArr[iq0Var3.ordinal()] == 1) {
                                j3 = jB2;
                            } else {
                                j3 = j9;
                            }
                            ak0Var2.p(false);
                            dr drVar = new dr(j3);
                            iq0Var4 = (iq0) dk1Var.getValue();
                            ak0Var2.W(-12973394);
                            if (iArr[iq0Var4.ordinal()] != 1) {
                                jB2 = j9;
                            }
                            ak0Var2.p(false);
                            dr drVar2 = new dr(jB2);
                            ki2VarE.f();
                            ak0Var2.W(1954111929);
                            ak0Var2.p(false);
                            ii2VarC4 = oi2.c(ki2VarE, drVar, drVar2, g82VarQ4, mj2Var3, ak0Var2, 196608);
                            ak0Var2.W(-464752477);
                            ak0Var2.p(false);
                            mrVarE2 = dr.e(j);
                            zF2 = ak0Var2.f(mrVarE2);
                            objL2 = ak0Var2.L();
                            if (zF2 || objL2 == is1Var) {
                                mj2 mj2Var4 = new mj2(x4.s, new y3(7, mrVarE2));
                                ak0Var2.g0(mj2Var4);
                                objL2 = mj2Var4;
                            }
                            ak0Var2.W(-464752477);
                            ak0Var2.p(false);
                            dr drVar3 = new dr(j);
                            ak0Var2.W(-464752477);
                            ak0Var2.p(false);
                            dr drVar4 = new dr(j);
                            ki2VarE.f();
                            ak0Var2.W(1190923886);
                            ak0Var2.p(false);
                            ii2VarC5 = oi2.c(ki2VarE, drVar3, drVar4, g82VarQ4, (mj2) objL2, ak0Var2, 196608);
                            objL3 = ak0Var2.L();
                            if (objL3 == is1Var) {
                                objL3 = new sd2();
                                ak0Var2.g0(objL3);
                            }
                            sd2Var = (sd2) objL3;
                            gtVar2 = null;
                            if (jj0Var == null) {
                                ak0Var2.W(-1891724857);
                                ak0Var2.p(false);
                                vf2Var = vf2Var2;
                                z4 = true;
                            } else {
                                ak0Var2.W(-1891724856);
                                vf2Var = vf2Var2;
                                z4 = true;
                                gt gtVarC3 = vs0.C(-1076580032, new pd2(vf2Var, vf2Var3, ii2VarC, ii2VarC5, z6, ii2VarC4, jj0Var, sd2Var), ak0Var2);
                                ak0Var2.p(false);
                                gtVar2 = gtVarC3;
                            }
                            if (!z2) {
                                j4 = jd2Var.D;
                            } else if (z3) {
                                j4 = jd2Var.E;
                            } else if (zBooleanValue) {
                                j4 = jd2Var.B;
                            } else {
                                j4 = jd2Var.C;
                            }
                            objL4 = ak0Var2.L();
                            if (objL4 == is1Var) {
                                is1 is1Var2 = is1.o;
                                nc1 nc1Var = new nc1(ii2VarC2, 5);
                                ud udVar = e72.a;
                                v40 v40Var = new v40(nc1Var, is1Var2);
                                ak0Var2.g0(v40Var);
                                objL4 = v40Var;
                            }
                            p82 p82Var = (p82) objL4;
                            if (ij0Var2 == null && charSequence.length() == 0 && ((Boolean) p82Var.getValue()).booleanValue()) {
                                ak0Var2.W(-1890614312);
                                gtVarC = vs0.C(1405547205, new qd2(ii2VarC2, j4, vf2Var, ij0Var2), ak0Var2);
                                ak0Var2.p(false);
                            } else {
                                ak0Var2.W(-1890217110);
                                ak0Var2.p(false);
                                gtVarC = gtVar2;
                            }
                            objL5 = ak0Var2.L();
                            i5 = 6;
                            if (objL5 == is1Var) {
                                is1 is1Var3 = is1.o;
                                nc1 nc1Var2 = new nc1(ii2VarC3, i5);
                                ud udVar2 = e72.a;
                                v40 v40Var2 = new v40(nc1Var2, is1Var3);
                                ak0Var2.g0(v40Var2);
                                objL5 = v40Var2;
                            }
                            ak0Var2.W(-1889500886);
                            ak0Var2.p(false);
                            ak0Var2.W(-1888924534);
                            ak0Var2.p(false);
                            ak0Var2.W(-1888749663);
                            ak0Var2.p(false);
                            if (!z2) {
                                j5 = jd2Var.v;
                            } else if (z3) {
                                j5 = jd2Var.w;
                            } else if (zBooleanValue) {
                                j5 = jd2Var.t;
                            } else {
                                j5 = jd2Var.u;
                            }
                            if (ij0Var3 == null) {
                                ak0Var2.W(-1888469888);
                                ak0Var2.p(false);
                                gtVarC2 = gtVar2;
                            } else {
                                ak0Var2.W(-1888469887);
                                gtVarC2 = vs0.C(1334518521, new rd2(j5, ij0Var3), ak0Var2);
                                ak0Var2.p(false);
                            }
                            if (!z2) {
                                j6 = jd2Var.H;
                            } else if (z3) {
                                j6 = jd2Var.I;
                            } else if (zBooleanValue) {
                                j6 = jd2Var.F;
                            } else {
                                j6 = jd2Var.G;
                            }
                            j7 = j6;
                            if (ij0Var4 == null) {
                                ak0Var2.W(-1888176380);
                                ak0Var2.p(false);
                                gtVar3 = gtVar2;
                            } else {
                                ak0Var2.W(-1888176379);
                                gt gtVarC4 = vs0.C(837168720, new nl(j7, vf2Var3, ij0Var4, 1), ak0Var2);
                                ak0Var2.p(false);
                                gtVar3 = gtVarC4;
                            }
                            ak0Var2.W(-1886778186);
                            objL6 = ak0Var2.L();
                            if (objL6 == is1Var) {
                                objL6 = y12.s(new d52(0L));
                                ak0Var2.g0(objL6);
                            }
                            da1Var = (da1) objL6;
                            gt gtVar4 = gtVarC2;
                            gt gtVar5 = gtVar2;
                            gt gtVarC5 = vs0.C(528115858, new od2(da1Var, xd2Var, gj1Var, gtVar), ak0Var2);
                            ud2 ud2Var = new ud2(new ay0(0, 4, p82.class, ii2VarC, "value", "getValue()Ljava/lang/Object;"));
                            gt gtVar6 = gtVarC;
                            if ((i7 & 7168) != 2048) {
                                z4 = false;
                            }
                            zF3 = z4 | ak0Var2.f(ii2VarC);
                            objL7 = ak0Var2.L();
                            if (zF3 || objL7 == is1Var) {
                                objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                                ak0Var2.g0(objL7);
                            }
                            ux.g(ij0Var, gtVar6, gtVar5, null, gtVar4, null, null, z, xd2Var, ud2Var, (ej0) objL7, gtVarC5, gtVar3, gj1Var, ak0Var2, ((i7 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i7 << 18) & 1879048192), (57344 & (i8 >> 3)) | 384);
                            ak0Var2 = ak0Var2;
                            ak0Var2.p(false);
                        } else if (iOrdinal2 != 2) {
                            qj.p();
                            return;
                        }
                        f3 = 0.0f;
                        ak0Var2.p(false);
                        Float fValueOf7 = Float.valueOf(f3);
                        iq0 iq0Var14 = (iq0) dk1Var.getValue();
                        ak0Var2.W(-1093194547);
                        iOrdinal3 = iq0Var14.ordinal();
                        if (iOrdinal3 == 0) {
                            f4 = 1.0f;
                        } else {
                            if (iOrdinal3 != 1) {
                                if (iOrdinal3 != 2) {
                                    qj.p();
                                    return;
                                }
                            } else if (z7) {
                                f4 = 1.0f;
                            }
                            f4 = 0.0f;
                        }
                        ak0Var2.p(false);
                        Float fValueOf8 = Float.valueOf(f4);
                        gi2VarF = ki2VarE.f();
                        ak0Var2.W(-984009111);
                        if (gi2VarF.b(iq0Var7, iq0Var6)) {
                            g82Var = g82VarQ;
                        } else {
                            g82Var = g82VarQ2;
                        }
                        ak0Var2.p(false);
                        ii2VarC2 = oi2.c(ki2VarE, fValueOf7, fValueOf8, g82Var, mj2Var, ak0Var2, 196608);
                        iq0 iq0Var15 = (iq0) tuVar.f();
                        ak0Var2.W(-1258455321);
                        iOrdinal4 = iq0Var15.ordinal();
                        if (iOrdinal4 == 0) {
                            f5 = 1.0f;
                        } else {
                            if (iOrdinal4 != 1) {
                                if (iOrdinal4 != 2) {
                                    qj.p();
                                    return;
                                }
                            } else if (z7) {
                                f5 = 0.0f;
                            }
                            f5 = 1.0f;
                        }
                        ak0Var2.p(false);
                        Float fValueOf9 = Float.valueOf(f5);
                        iq0 iq0Var16 = (iq0) dk1Var.getValue();
                        ak0Var2.W(-1258455321);
                        iOrdinal5 = iq0Var16.ordinal();
                        if (iOrdinal5 == 0) {
                            f6 = 1.0f;
                        } else {
                            if (iOrdinal5 != 1) {
                                if (iOrdinal5 != 2) {
                                    qj.p();
                                    return;
                                }
                            } else if (!z7) {
                            }
                            f6 = 1.0f;
                        }
                        ak0Var2.p(false);
                        Float fValueOf10 = Float.valueOf(f6);
                        ki2VarE.f();
                        ak0Var2.W(2126293195);
                        ak0Var2.p(false);
                        ii2VarC3 = oi2.c(ki2VarE, fValueOf9, fValueOf10, g82VarQ, mj2Var, ak0Var2, 196608);
                        g82 g82VarQ5 = rw.Q(h81Var, ak0Var2);
                        iq0Var2 = (iq0) dk1Var.getValue();
                        ak0Var2.W(-12973394);
                        iArr = td2.a;
                        if (iArr[iq0Var2.ordinal()] == 1) {
                            j2 = jB2;
                        } else {
                            j2 = j9;
                        }
                        ak0Var2.p(false);
                        mrVarE = dr.e(j2);
                        zF = ak0Var2.f(mrVarE);
                        objL = ak0Var2.L();
                        is1Var = cv.a;
                        if (zF) {
                            mj2 mj2Var5 = new mj2(x4.s, new y3(7, mrVarE));
                            ak0Var2.g0(mj2Var5);
                            objL = mj2Var5;
                        } else {
                            mj2 mj2Var6 = new mj2(x4.s, new y3(7, mrVarE));
                            ak0Var2.g0(mj2Var6);
                            objL = mj2Var6;
                        }
                        mj2 mj2Var7 = (mj2) objL;
                        iq0Var3 = (iq0) tuVar.f();
                        ak0Var2.W(-12973394);
                        if (iArr[iq0Var3.ordinal()] == 1) {
                            j3 = jB2;
                        } else {
                            j3 = j9;
                        }
                        ak0Var2.p(false);
                        dr drVar5 = new dr(j3);
                        iq0Var4 = (iq0) dk1Var.getValue();
                        ak0Var2.W(-12973394);
                        if (iArr[iq0Var4.ordinal()] != 1) {
                            jB2 = j9;
                        }
                        ak0Var2.p(false);
                        dr drVar6 = new dr(jB2);
                        ki2VarE.f();
                        ak0Var2.W(1954111929);
                        ak0Var2.p(false);
                        ii2VarC4 = oi2.c(ki2VarE, drVar5, drVar6, g82VarQ5, mj2Var7, ak0Var2, 196608);
                        ak0Var2.W(-464752477);
                        ak0Var2.p(false);
                        mrVarE2 = dr.e(j);
                        zF2 = ak0Var2.f(mrVarE2);
                        objL2 = ak0Var2.L();
                        if (zF2) {
                            mj2 mj2Var8 = new mj2(x4.s, new y3(7, mrVarE2));
                            ak0Var2.g0(mj2Var8);
                            objL2 = mj2Var8;
                        } else {
                            mj2 mj2Var9 = new mj2(x4.s, new y3(7, mrVarE2));
                            ak0Var2.g0(mj2Var9);
                            objL2 = mj2Var9;
                        }
                        ak0Var2.W(-464752477);
                        ak0Var2.p(false);
                        dr drVar7 = new dr(j);
                        ak0Var2.W(-464752477);
                        ak0Var2.p(false);
                        dr drVar8 = new dr(j);
                        ki2VarE.f();
                        ak0Var2.W(1190923886);
                        ak0Var2.p(false);
                        ii2VarC5 = oi2.c(ki2VarE, drVar7, drVar8, g82VarQ5, (mj2) objL2, ak0Var2, 196608);
                        objL3 = ak0Var2.L();
                        if (objL3 == is1Var) {
                            objL3 = new sd2();
                            ak0Var2.g0(objL3);
                        }
                        sd2Var = (sd2) objL3;
                        gtVar2 = null;
                        if (jj0Var == null) {
                            ak0Var2.W(-1891724857);
                            ak0Var2.p(false);
                            vf2Var = vf2Var2;
                            z4 = true;
                        } else {
                            ak0Var2.W(-1891724856);
                            vf2Var = vf2Var2;
                            z4 = true;
                            gt gtVarC6 = vs0.C(-1076580032, new pd2(vf2Var, vf2Var3, ii2VarC, ii2VarC5, z6, ii2VarC4, jj0Var, sd2Var), ak0Var2);
                            ak0Var2.p(false);
                            gtVar2 = gtVarC6;
                        }
                        if (!z2) {
                            j4 = jd2Var.D;
                        } else if (z3) {
                            j4 = jd2Var.E;
                        } else if (zBooleanValue) {
                            j4 = jd2Var.B;
                        } else {
                            j4 = jd2Var.C;
                        }
                        objL4 = ak0Var2.L();
                        if (objL4 == is1Var) {
                            is1 is1Var4 = is1.o;
                            nc1 nc1Var3 = new nc1(ii2VarC2, 5);
                            ud udVar3 = e72.a;
                            v40 v40Var3 = new v40(nc1Var3, is1Var4);
                            ak0Var2.g0(v40Var3);
                            objL4 = v40Var3;
                        }
                        p82 p82Var2 = (p82) objL4;
                        if (ij0Var2 == null) {
                            ak0Var2.W(-1890217110);
                            ak0Var2.p(false);
                            gtVarC = gtVar2;
                        } else {
                            ak0Var2.W(-1890217110);
                            ak0Var2.p(false);
                            gtVarC = gtVar2;
                        }
                        objL5 = ak0Var2.L();
                        i5 = 6;
                        if (objL5 == is1Var) {
                            is1 is1Var5 = is1.o;
                            nc1 nc1Var4 = new nc1(ii2VarC3, i5);
                            ud udVar4 = e72.a;
                            v40 v40Var4 = new v40(nc1Var4, is1Var5);
                            ak0Var2.g0(v40Var4);
                            objL5 = v40Var4;
                        }
                        ak0Var2.W(-1889500886);
                        ak0Var2.p(false);
                        ak0Var2.W(-1888924534);
                        ak0Var2.p(false);
                        ak0Var2.W(-1888749663);
                        ak0Var2.p(false);
                        if (!z2) {
                            j5 = jd2Var.v;
                        } else if (z3) {
                            j5 = jd2Var.w;
                        } else if (zBooleanValue) {
                            j5 = jd2Var.t;
                        } else {
                            j5 = jd2Var.u;
                        }
                        if (ij0Var3 == null) {
                            ak0Var2.W(-1888469888);
                            ak0Var2.p(false);
                            gtVarC2 = gtVar2;
                        } else {
                            ak0Var2.W(-1888469887);
                            gtVarC2 = vs0.C(1334518521, new rd2(j5, ij0Var3), ak0Var2);
                            ak0Var2.p(false);
                        }
                        if (!z2) {
                            j6 = jd2Var.H;
                        } else if (z3) {
                            j6 = jd2Var.I;
                        } else if (zBooleanValue) {
                            j6 = jd2Var.F;
                        } else {
                            j6 = jd2Var.G;
                        }
                        j7 = j6;
                        if (ij0Var4 == null) {
                            ak0Var2.W(-1888176380);
                            ak0Var2.p(false);
                            gtVar3 = gtVar2;
                        } else {
                            ak0Var2.W(-1888176379);
                            gt gtVarC7 = vs0.C(837168720, new nl(j7, vf2Var3, ij0Var4, 1), ak0Var2);
                            ak0Var2.p(false);
                            gtVar3 = gtVarC7;
                        }
                        ak0Var2.W(-1886778186);
                        objL6 = ak0Var2.L();
                        if (objL6 == is1Var) {
                            objL6 = y12.s(new d52(0L));
                            ak0Var2.g0(objL6);
                        }
                        da1Var = (da1) objL6;
                        gt gtVar7 = gtVarC2;
                        gt gtVar8 = gtVar2;
                        gt gtVarC8 = vs0.C(528115858, new od2(da1Var, xd2Var, gj1Var, gtVar), ak0Var2);
                        ud2 ud2Var2 = new ud2(new ay0(0, 4, p82.class, ii2VarC, "value", "getValue()Ljava/lang/Object;"));
                        gt gtVar9 = gtVarC;
                        if ((i7 & 7168) != 2048) {
                            z4 = false;
                        }
                        zF3 = z4 | ak0Var2.f(ii2VarC);
                        objL7 = ak0Var2.L();
                        if (zF3) {
                            objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                            ak0Var2.g0(objL7);
                        } else {
                            objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                            ak0Var2.g0(objL7);
                        }
                        ux.g(ij0Var, gtVar9, gtVar8, null, gtVar7, null, null, z, xd2Var, ud2Var2, (ej0) objL7, gtVarC8, gtVar3, gj1Var, ak0Var2, ((i7 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i7 << 18) & 1879048192), (57344 & (i8 >> 3)) | 384);
                        ak0Var2 = ak0Var2;
                        ak0Var2.p(false);
                    } else {
                        tuVar = tuVar2;
                    }
                    f3 = 1.0f;
                    ak0Var2.p(false);
                    Float fValueOf11 = Float.valueOf(f3);
                    iq0 iq0Var17 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-1093194547);
                    iOrdinal3 = iq0Var17.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                qj.p();
                                return;
                            }
                        } else if (z7) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf12 = Float.valueOf(f4);
                    gi2VarF = ki2VarE.f();
                    ak0Var2.W(-984009111);
                    if (gi2VarF.b(iq0Var7, iq0Var6)) {
                        g82Var = g82VarQ;
                    } else {
                        g82Var = g82VarQ2;
                    }
                    ak0Var2.p(false);
                    ii2VarC2 = oi2.c(ki2VarE, fValueOf11, fValueOf12, g82Var, mj2Var, ak0Var2, 196608);
                    iq0 iq0Var18 = (iq0) tuVar.f();
                    ak0Var2.W(-1258455321);
                    iOrdinal4 = iq0Var18.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                qj.p();
                                return;
                            }
                        } else if (z7) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf13 = Float.valueOf(f5);
                    iq0 iq0Var19 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-1258455321);
                    iOrdinal5 = iq0Var19.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                qj.p();
                                return;
                            }
                        } else if (!z7) {
                        }
                        f6 = 1.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf14 = Float.valueOf(f6);
                    ki2VarE.f();
                    ak0Var2.W(2126293195);
                    ak0Var2.p(false);
                    ii2VarC3 = oi2.c(ki2VarE, fValueOf13, fValueOf14, g82VarQ, mj2Var, ak0Var2, 196608);
                    g82 g82VarQ6 = rw.Q(h81Var, ak0Var2);
                    iq0Var2 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-12973394);
                    iArr = td2.a;
                    if (iArr[iq0Var2.ordinal()] == 1) {
                        j2 = jB2;
                    } else {
                        j2 = j9;
                    }
                    ak0Var2.p(false);
                    mrVarE = dr.e(j2);
                    zF = ak0Var2.f(mrVarE);
                    objL = ak0Var2.L();
                    is1Var = cv.a;
                    if (zF) {
                        mj2 mj2Var10 = new mj2(x4.s, new y3(7, mrVarE));
                        ak0Var2.g0(mj2Var10);
                        objL = mj2Var10;
                    } else {
                        mj2 mj2Var11 = new mj2(x4.s, new y3(7, mrVarE));
                        ak0Var2.g0(mj2Var11);
                        objL = mj2Var11;
                    }
                    mj2 mj2Var12 = (mj2) objL;
                    iq0Var3 = (iq0) tuVar.f();
                    ak0Var2.W(-12973394);
                    if (iArr[iq0Var3.ordinal()] == 1) {
                        j3 = jB2;
                    } else {
                        j3 = j9;
                    }
                    ak0Var2.p(false);
                    dr drVar9 = new dr(j3);
                    iq0Var4 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-12973394);
                    if (iArr[iq0Var4.ordinal()] != 1) {
                        jB2 = j9;
                    }
                    ak0Var2.p(false);
                    dr drVar10 = new dr(jB2);
                    ki2VarE.f();
                    ak0Var2.W(1954111929);
                    ak0Var2.p(false);
                    ii2VarC4 = oi2.c(ki2VarE, drVar9, drVar10, g82VarQ6, mj2Var12, ak0Var2, 196608);
                    ak0Var2.W(-464752477);
                    ak0Var2.p(false);
                    mrVarE2 = dr.e(j);
                    zF2 = ak0Var2.f(mrVarE2);
                    objL2 = ak0Var2.L();
                    if (zF2) {
                        mj2 mj2Var13 = new mj2(x4.s, new y3(7, mrVarE2));
                        ak0Var2.g0(mj2Var13);
                        objL2 = mj2Var13;
                    } else {
                        mj2 mj2Var14 = new mj2(x4.s, new y3(7, mrVarE2));
                        ak0Var2.g0(mj2Var14);
                        objL2 = mj2Var14;
                    }
                    ak0Var2.W(-464752477);
                    ak0Var2.p(false);
                    dr drVar11 = new dr(j);
                    ak0Var2.W(-464752477);
                    ak0Var2.p(false);
                    dr drVar12 = new dr(j);
                    ki2VarE.f();
                    ak0Var2.W(1190923886);
                    ak0Var2.p(false);
                    ii2VarC5 = oi2.c(ki2VarE, drVar11, drVar12, g82VarQ6, (mj2) objL2, ak0Var2, 196608);
                    objL3 = ak0Var2.L();
                    if (objL3 == is1Var) {
                        objL3 = new sd2();
                        ak0Var2.g0(objL3);
                    }
                    sd2Var = (sd2) objL3;
                    gtVar2 = null;
                    if (jj0Var == null) {
                        ak0Var2.W(-1891724857);
                        ak0Var2.p(false);
                        vf2Var = vf2Var2;
                        z4 = true;
                    } else {
                        ak0Var2.W(-1891724856);
                        vf2Var = vf2Var2;
                        z4 = true;
                        gt gtVarC9 = vs0.C(-1076580032, new pd2(vf2Var, vf2Var3, ii2VarC, ii2VarC5, z6, ii2VarC4, jj0Var, sd2Var), ak0Var2);
                        ak0Var2.p(false);
                        gtVar2 = gtVarC9;
                    }
                    if (!z2) {
                        j4 = jd2Var.D;
                    } else if (z3) {
                        j4 = jd2Var.E;
                    } else if (zBooleanValue) {
                        j4 = jd2Var.B;
                    } else {
                        j4 = jd2Var.C;
                    }
                    objL4 = ak0Var2.L();
                    if (objL4 == is1Var) {
                        is1 is1Var6 = is1.o;
                        nc1 nc1Var5 = new nc1(ii2VarC2, 5);
                        ud udVar5 = e72.a;
                        v40 v40Var5 = new v40(nc1Var5, is1Var6);
                        ak0Var2.g0(v40Var5);
                        objL4 = v40Var5;
                    }
                    p82 p82Var3 = (p82) objL4;
                    if (ij0Var2 == null) {
                        ak0Var2.W(-1890217110);
                        ak0Var2.p(false);
                        gtVarC = gtVar2;
                    } else {
                        ak0Var2.W(-1890217110);
                        ak0Var2.p(false);
                        gtVarC = gtVar2;
                    }
                    objL5 = ak0Var2.L();
                    i5 = 6;
                    if (objL5 == is1Var) {
                        is1 is1Var7 = is1.o;
                        nc1 nc1Var6 = new nc1(ii2VarC3, i5);
                        ud udVar6 = e72.a;
                        v40 v40Var6 = new v40(nc1Var6, is1Var7);
                        ak0Var2.g0(v40Var6);
                        objL5 = v40Var6;
                    }
                    ak0Var2.W(-1889500886);
                    ak0Var2.p(false);
                    ak0Var2.W(-1888924534);
                    ak0Var2.p(false);
                    ak0Var2.W(-1888749663);
                    ak0Var2.p(false);
                    if (!z2) {
                        j5 = jd2Var.v;
                    } else if (z3) {
                        j5 = jd2Var.w;
                    } else if (zBooleanValue) {
                        j5 = jd2Var.t;
                    } else {
                        j5 = jd2Var.u;
                    }
                    if (ij0Var3 == null) {
                        ak0Var2.W(-1888469888);
                        ak0Var2.p(false);
                        gtVarC2 = gtVar2;
                    } else {
                        ak0Var2.W(-1888469887);
                        gtVarC2 = vs0.C(1334518521, new rd2(j5, ij0Var3), ak0Var2);
                        ak0Var2.p(false);
                    }
                    if (!z2) {
                        j6 = jd2Var.H;
                    } else if (z3) {
                        j6 = jd2Var.I;
                    } else if (zBooleanValue) {
                        j6 = jd2Var.F;
                    } else {
                        j6 = jd2Var.G;
                    }
                    j7 = j6;
                    if (ij0Var4 == null) {
                        ak0Var2.W(-1888176380);
                        ak0Var2.p(false);
                        gtVar3 = gtVar2;
                    } else {
                        ak0Var2.W(-1888176379);
                        gt gtVarC10 = vs0.C(837168720, new nl(j7, vf2Var3, ij0Var4, 1), ak0Var2);
                        ak0Var2.p(false);
                        gtVar3 = gtVarC10;
                    }
                    ak0Var2.W(-1886778186);
                    objL6 = ak0Var2.L();
                    if (objL6 == is1Var) {
                        objL6 = y12.s(new d52(0L));
                        ak0Var2.g0(objL6);
                    }
                    da1Var = (da1) objL6;
                    gt gtVar10 = gtVarC2;
                    gt gtVar11 = gtVar2;
                    gt gtVarC11 = vs0.C(528115858, new od2(da1Var, xd2Var, gj1Var, gtVar), ak0Var2);
                    ud2 ud2Var3 = new ud2(new ay0(0, 4, p82.class, ii2VarC, "value", "getValue()Ljava/lang/Object;"));
                    gt gtVar12 = gtVarC;
                    if ((i7 & 7168) != 2048) {
                        z4 = false;
                    }
                    zF3 = z4 | ak0Var2.f(ii2VarC);
                    objL7 = ak0Var2.L();
                    if (zF3) {
                        objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                        ak0Var2.g0(objL7);
                    } else {
                        objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                        ak0Var2.g0(objL7);
                    }
                    ux.g(ij0Var, gtVar12, gtVar11, null, gtVar10, null, null, z, xd2Var, ud2Var3, (ej0) objL7, gtVarC11, gtVar3, gj1Var, ak0Var2, ((i7 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i7 << 18) & 1879048192), (57344 & (i8 >> 3)) | 384);
                    ak0Var2 = ak0Var2;
                    ak0Var2.p(false);
                } else if (iOrdinal6 != 2) {
                    qj.p();
                    return;
                }
            } else {
                dk1Var = dk1Var2;
            }
            f = 1.0f;
            ak0Var2.p(false);
            Float fValueOf15 = Float.valueOf(f);
            iq0 iq0Var20 = (iq0) dk1Var.getValue();
            ak0Var2.W(-1436405362);
            iOrdinal = iq0Var20.ordinal();
            if (iOrdinal == 0) {
                f2 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        qj.p();
                        return;
                    }
                } else if (z7) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            ak0Var2.p(false);
            Float fValueOf16 = Float.valueOf(f2);
            ki2VarE.f();
            ak0Var2.W(-709912974);
            ak0Var2.p(false);
            ii2VarC = oi2.c(ki2VarE, fValueOf15, fValueOf16, g82VarQ3, mj2Var, ak0Var2, 196608);
            h81 h81Var2 = h81.h;
            g82VarQ = rw.Q(h81Var2, ak0Var2);
            g82VarQ2 = rw.Q(h81.i, ak0Var2);
            iq0 iq0Var110 = (iq0) tuVar2.f();
            ak0Var2.W(-1093194547);
            iOrdinal2 = iq0Var110.ordinal();
            if (iOrdinal2 != 0) {
                tuVar = tuVar2;
                if (iOrdinal2 != 1) {
                    if (z7) {
                    }
                    ak0Var2.p(false);
                    Float fValueOf17 = Float.valueOf(f3);
                    iq0 iq0Var111 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-1093194547);
                    iOrdinal3 = iq0Var111.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                qj.p();
                                return;
                            }
                        } else if (z7) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf18 = Float.valueOf(f4);
                    gi2VarF = ki2VarE.f();
                    ak0Var2.W(-984009111);
                    if (gi2VarF.b(iq0Var7, iq0Var6)) {
                        g82Var = g82VarQ;
                    } else {
                        g82Var = g82VarQ2;
                    }
                    ak0Var2.p(false);
                    ii2VarC2 = oi2.c(ki2VarE, fValueOf17, fValueOf18, g82Var, mj2Var, ak0Var2, 196608);
                    iq0 iq0Var112 = (iq0) tuVar.f();
                    ak0Var2.W(-1258455321);
                    iOrdinal4 = iq0Var112.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                qj.p();
                                return;
                            }
                        } else if (z7) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf19 = Float.valueOf(f5);
                    iq0 iq0Var113 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-1258455321);
                    iOrdinal5 = iq0Var113.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                qj.p();
                                return;
                            }
                        } else if (!z7) {
                        }
                        f6 = 1.0f;
                    }
                    ak0Var2.p(false);
                    Float fValueOf110 = Float.valueOf(f6);
                    ki2VarE.f();
                    ak0Var2.W(2126293195);
                    ak0Var2.p(false);
                    ii2VarC3 = oi2.c(ki2VarE, fValueOf19, fValueOf110, g82VarQ, mj2Var, ak0Var2, 196608);
                    g82 g82VarQ7 = rw.Q(h81Var2, ak0Var2);
                    iq0Var2 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-12973394);
                    iArr = td2.a;
                    if (iArr[iq0Var2.ordinal()] == 1) {
                        j2 = jB2;
                    } else {
                        j2 = j9;
                    }
                    ak0Var2.p(false);
                    mrVarE = dr.e(j2);
                    zF = ak0Var2.f(mrVarE);
                    objL = ak0Var2.L();
                    is1Var = cv.a;
                    if (zF) {
                        mj2 mj2Var15 = new mj2(x4.s, new y3(7, mrVarE));
                        ak0Var2.g0(mj2Var15);
                        objL = mj2Var15;
                    } else {
                        mj2 mj2Var16 = new mj2(x4.s, new y3(7, mrVarE));
                        ak0Var2.g0(mj2Var16);
                        objL = mj2Var16;
                    }
                    mj2 mj2Var17 = (mj2) objL;
                    iq0Var3 = (iq0) tuVar.f();
                    ak0Var2.W(-12973394);
                    if (iArr[iq0Var3.ordinal()] == 1) {
                        j3 = jB2;
                    } else {
                        j3 = j9;
                    }
                    ak0Var2.p(false);
                    dr drVar13 = new dr(j3);
                    iq0Var4 = (iq0) dk1Var.getValue();
                    ak0Var2.W(-12973394);
                    if (iArr[iq0Var4.ordinal()] != 1) {
                        jB2 = j9;
                    }
                    ak0Var2.p(false);
                    dr drVar14 = new dr(jB2);
                    ki2VarE.f();
                    ak0Var2.W(1954111929);
                    ak0Var2.p(false);
                    ii2VarC4 = oi2.c(ki2VarE, drVar13, drVar14, g82VarQ7, mj2Var17, ak0Var2, 196608);
                    ak0Var2.W(-464752477);
                    ak0Var2.p(false);
                    mrVarE2 = dr.e(j);
                    zF2 = ak0Var2.f(mrVarE2);
                    objL2 = ak0Var2.L();
                    if (zF2) {
                        mj2 mj2Var18 = new mj2(x4.s, new y3(7, mrVarE2));
                        ak0Var2.g0(mj2Var18);
                        objL2 = mj2Var18;
                    } else {
                        mj2 mj2Var19 = new mj2(x4.s, new y3(7, mrVarE2));
                        ak0Var2.g0(mj2Var19);
                        objL2 = mj2Var19;
                    }
                    ak0Var2.W(-464752477);
                    ak0Var2.p(false);
                    dr drVar15 = new dr(j);
                    ak0Var2.W(-464752477);
                    ak0Var2.p(false);
                    dr drVar16 = new dr(j);
                    ki2VarE.f();
                    ak0Var2.W(1190923886);
                    ak0Var2.p(false);
                    ii2VarC5 = oi2.c(ki2VarE, drVar15, drVar16, g82VarQ7, (mj2) objL2, ak0Var2, 196608);
                    objL3 = ak0Var2.L();
                    if (objL3 == is1Var) {
                        objL3 = new sd2();
                        ak0Var2.g0(objL3);
                    }
                    sd2Var = (sd2) objL3;
                    gtVar2 = null;
                    if (jj0Var == null) {
                        ak0Var2.W(-1891724857);
                        ak0Var2.p(false);
                        vf2Var = vf2Var2;
                        z4 = true;
                    } else {
                        ak0Var2.W(-1891724856);
                        vf2Var = vf2Var2;
                        z4 = true;
                        gt gtVarC12 = vs0.C(-1076580032, new pd2(vf2Var, vf2Var3, ii2VarC, ii2VarC5, z6, ii2VarC4, jj0Var, sd2Var), ak0Var2);
                        ak0Var2.p(false);
                        gtVar2 = gtVarC12;
                    }
                    if (!z2) {
                        j4 = jd2Var.D;
                    } else if (z3) {
                        j4 = jd2Var.E;
                    } else if (zBooleanValue) {
                        j4 = jd2Var.B;
                    } else {
                        j4 = jd2Var.C;
                    }
                    objL4 = ak0Var2.L();
                    if (objL4 == is1Var) {
                        is1 is1Var8 = is1.o;
                        nc1 nc1Var7 = new nc1(ii2VarC2, 5);
                        ud udVar7 = e72.a;
                        v40 v40Var7 = new v40(nc1Var7, is1Var8);
                        ak0Var2.g0(v40Var7);
                        objL4 = v40Var7;
                    }
                    p82 p82Var4 = (p82) objL4;
                    if (ij0Var2 == null) {
                        ak0Var2.W(-1890217110);
                        ak0Var2.p(false);
                        gtVarC = gtVar2;
                    } else {
                        ak0Var2.W(-1890217110);
                        ak0Var2.p(false);
                        gtVarC = gtVar2;
                    }
                    objL5 = ak0Var2.L();
                    i5 = 6;
                    if (objL5 == is1Var) {
                        is1 is1Var9 = is1.o;
                        nc1 nc1Var8 = new nc1(ii2VarC3, i5);
                        ud udVar8 = e72.a;
                        v40 v40Var8 = new v40(nc1Var8, is1Var9);
                        ak0Var2.g0(v40Var8);
                        objL5 = v40Var8;
                    }
                    ak0Var2.W(-1889500886);
                    ak0Var2.p(false);
                    ak0Var2.W(-1888924534);
                    ak0Var2.p(false);
                    ak0Var2.W(-1888749663);
                    ak0Var2.p(false);
                    if (!z2) {
                        j5 = jd2Var.v;
                    } else if (z3) {
                        j5 = jd2Var.w;
                    } else if (zBooleanValue) {
                        j5 = jd2Var.t;
                    } else {
                        j5 = jd2Var.u;
                    }
                    if (ij0Var3 == null) {
                        ak0Var2.W(-1888469888);
                        ak0Var2.p(false);
                        gtVarC2 = gtVar2;
                    } else {
                        ak0Var2.W(-1888469887);
                        gtVarC2 = vs0.C(1334518521, new rd2(j5, ij0Var3), ak0Var2);
                        ak0Var2.p(false);
                    }
                    if (!z2) {
                        j6 = jd2Var.H;
                    } else if (z3) {
                        j6 = jd2Var.I;
                    } else if (zBooleanValue) {
                        j6 = jd2Var.F;
                    } else {
                        j6 = jd2Var.G;
                    }
                    j7 = j6;
                    if (ij0Var4 == null) {
                        ak0Var2.W(-1888176380);
                        ak0Var2.p(false);
                        gtVar3 = gtVar2;
                    } else {
                        ak0Var2.W(-1888176379);
                        gt gtVarC13 = vs0.C(837168720, new nl(j7, vf2Var3, ij0Var4, 1), ak0Var2);
                        ak0Var2.p(false);
                        gtVar3 = gtVarC13;
                    }
                    ak0Var2.W(-1886778186);
                    objL6 = ak0Var2.L();
                    if (objL6 == is1Var) {
                        objL6 = y12.s(new d52(0L));
                        ak0Var2.g0(objL6);
                    }
                    da1Var = (da1) objL6;
                    gt gtVar13 = gtVarC2;
                    gt gtVar14 = gtVar2;
                    gt gtVarC14 = vs0.C(528115858, new od2(da1Var, xd2Var, gj1Var, gtVar), ak0Var2);
                    ud2 ud2Var4 = new ud2(new ay0(0, 4, p82.class, ii2VarC, "value", "getValue()Ljava/lang/Object;"));
                    gt gtVar15 = gtVarC;
                    if ((i7 & 7168) != 2048) {
                        z4 = false;
                    }
                    zF3 = z4 | ak0Var2.f(ii2VarC);
                    objL7 = ak0Var2.L();
                    if (zF3) {
                        objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                        ak0Var2.g0(objL7);
                    } else {
                        objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                        ak0Var2.g0(objL7);
                    }
                    ux.g(ij0Var, gtVar15, gtVar14, null, gtVar13, null, null, z, xd2Var, ud2Var4, (ej0) objL7, gtVarC14, gtVar3, gj1Var, ak0Var2, ((i7 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i7 << 18) & 1879048192), (57344 & (i8 >> 3)) | 384);
                    ak0Var2 = ak0Var2;
                    ak0Var2.p(false);
                } else if (iOrdinal2 != 2) {
                    qj.p();
                    return;
                }
                f3 = 0.0f;
                ak0Var2.p(false);
                Float fValueOf111 = Float.valueOf(f3);
                iq0 iq0Var114 = (iq0) dk1Var.getValue();
                ak0Var2.W(-1093194547);
                iOrdinal3 = iq0Var114.ordinal();
                if (iOrdinal3 == 0) {
                    f4 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            qj.p();
                            return;
                        }
                    } else if (z7) {
                        f4 = 1.0f;
                    }
                    f4 = 0.0f;
                }
                ak0Var2.p(false);
                Float fValueOf112 = Float.valueOf(f4);
                gi2VarF = ki2VarE.f();
                ak0Var2.W(-984009111);
                if (gi2VarF.b(iq0Var7, iq0Var6)) {
                    g82Var = g82VarQ;
                } else {
                    g82Var = g82VarQ2;
                }
                ak0Var2.p(false);
                ii2VarC2 = oi2.c(ki2VarE, fValueOf111, fValueOf112, g82Var, mj2Var, ak0Var2, 196608);
                iq0 iq0Var115 = (iq0) tuVar.f();
                ak0Var2.W(-1258455321);
                iOrdinal4 = iq0Var115.ordinal();
                if (iOrdinal4 == 0) {
                    f5 = 1.0f;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            qj.p();
                            return;
                        }
                    } else if (z7) {
                        f5 = 0.0f;
                    }
                    f5 = 1.0f;
                }
                ak0Var2.p(false);
                Float fValueOf113 = Float.valueOf(f5);
                iq0 iq0Var116 = (iq0) dk1Var.getValue();
                ak0Var2.W(-1258455321);
                iOrdinal5 = iq0Var116.ordinal();
                if (iOrdinal5 == 0) {
                    f6 = 1.0f;
                } else {
                    if (iOrdinal5 != 1) {
                        if (iOrdinal5 != 2) {
                            qj.p();
                            return;
                        }
                    } else if (!z7) {
                    }
                    f6 = 1.0f;
                }
                ak0Var2.p(false);
                Float fValueOf114 = Float.valueOf(f6);
                ki2VarE.f();
                ak0Var2.W(2126293195);
                ak0Var2.p(false);
                ii2VarC3 = oi2.c(ki2VarE, fValueOf113, fValueOf114, g82VarQ, mj2Var, ak0Var2, 196608);
                g82 g82VarQ8 = rw.Q(h81Var2, ak0Var2);
                iq0Var2 = (iq0) dk1Var.getValue();
                ak0Var2.W(-12973394);
                iArr = td2.a;
                if (iArr[iq0Var2.ordinal()] == 1) {
                    j2 = jB2;
                } else {
                    j2 = j9;
                }
                ak0Var2.p(false);
                mrVarE = dr.e(j2);
                zF = ak0Var2.f(mrVarE);
                objL = ak0Var2.L();
                is1Var = cv.a;
                if (zF) {
                    mj2 mj2Var110 = new mj2(x4.s, new y3(7, mrVarE));
                    ak0Var2.g0(mj2Var110);
                    objL = mj2Var110;
                } else {
                    mj2 mj2Var111 = new mj2(x4.s, new y3(7, mrVarE));
                    ak0Var2.g0(mj2Var111);
                    objL = mj2Var111;
                }
                mj2 mj2Var112 = (mj2) objL;
                iq0Var3 = (iq0) tuVar.f();
                ak0Var2.W(-12973394);
                if (iArr[iq0Var3.ordinal()] == 1) {
                    j3 = jB2;
                } else {
                    j3 = j9;
                }
                ak0Var2.p(false);
                dr drVar17 = new dr(j3);
                iq0Var4 = (iq0) dk1Var.getValue();
                ak0Var2.W(-12973394);
                if (iArr[iq0Var4.ordinal()] != 1) {
                    jB2 = j9;
                }
                ak0Var2.p(false);
                dr drVar18 = new dr(jB2);
                ki2VarE.f();
                ak0Var2.W(1954111929);
                ak0Var2.p(false);
                ii2VarC4 = oi2.c(ki2VarE, drVar17, drVar18, g82VarQ8, mj2Var112, ak0Var2, 196608);
                ak0Var2.W(-464752477);
                ak0Var2.p(false);
                mrVarE2 = dr.e(j);
                zF2 = ak0Var2.f(mrVarE2);
                objL2 = ak0Var2.L();
                if (zF2) {
                    mj2 mj2Var113 = new mj2(x4.s, new y3(7, mrVarE2));
                    ak0Var2.g0(mj2Var113);
                    objL2 = mj2Var113;
                } else {
                    mj2 mj2Var114 = new mj2(x4.s, new y3(7, mrVarE2));
                    ak0Var2.g0(mj2Var114);
                    objL2 = mj2Var114;
                }
                ak0Var2.W(-464752477);
                ak0Var2.p(false);
                dr drVar19 = new dr(j);
                ak0Var2.W(-464752477);
                ak0Var2.p(false);
                dr drVar110 = new dr(j);
                ki2VarE.f();
                ak0Var2.W(1190923886);
                ak0Var2.p(false);
                ii2VarC5 = oi2.c(ki2VarE, drVar19, drVar110, g82VarQ8, (mj2) objL2, ak0Var2, 196608);
                objL3 = ak0Var2.L();
                if (objL3 == is1Var) {
                    objL3 = new sd2();
                    ak0Var2.g0(objL3);
                }
                sd2Var = (sd2) objL3;
                gtVar2 = null;
                if (jj0Var == null) {
                    ak0Var2.W(-1891724857);
                    ak0Var2.p(false);
                    vf2Var = vf2Var2;
                    z4 = true;
                } else {
                    ak0Var2.W(-1891724856);
                    vf2Var = vf2Var2;
                    z4 = true;
                    gt gtVarC15 = vs0.C(-1076580032, new pd2(vf2Var, vf2Var3, ii2VarC, ii2VarC5, z6, ii2VarC4, jj0Var, sd2Var), ak0Var2);
                    ak0Var2.p(false);
                    gtVar2 = gtVarC15;
                }
                if (!z2) {
                    j4 = jd2Var.D;
                } else if (z3) {
                    j4 = jd2Var.E;
                } else if (zBooleanValue) {
                    j4 = jd2Var.B;
                } else {
                    j4 = jd2Var.C;
                }
                objL4 = ak0Var2.L();
                if (objL4 == is1Var) {
                    is1 is1Var10 = is1.o;
                    nc1 nc1Var9 = new nc1(ii2VarC2, 5);
                    ud udVar9 = e72.a;
                    v40 v40Var9 = new v40(nc1Var9, is1Var10);
                    ak0Var2.g0(v40Var9);
                    objL4 = v40Var9;
                }
                p82 p82Var5 = (p82) objL4;
                if (ij0Var2 == null) {
                    ak0Var2.W(-1890217110);
                    ak0Var2.p(false);
                    gtVarC = gtVar2;
                } else {
                    ak0Var2.W(-1890217110);
                    ak0Var2.p(false);
                    gtVarC = gtVar2;
                }
                objL5 = ak0Var2.L();
                i5 = 6;
                if (objL5 == is1Var) {
                    is1 is1Var11 = is1.o;
                    nc1 nc1Var10 = new nc1(ii2VarC3, i5);
                    ud udVar10 = e72.a;
                    v40 v40Var10 = new v40(nc1Var10, is1Var11);
                    ak0Var2.g0(v40Var10);
                    objL5 = v40Var10;
                }
                ak0Var2.W(-1889500886);
                ak0Var2.p(false);
                ak0Var2.W(-1888924534);
                ak0Var2.p(false);
                ak0Var2.W(-1888749663);
                ak0Var2.p(false);
                if (!z2) {
                    j5 = jd2Var.v;
                } else if (z3) {
                    j5 = jd2Var.w;
                } else if (zBooleanValue) {
                    j5 = jd2Var.t;
                } else {
                    j5 = jd2Var.u;
                }
                if (ij0Var3 == null) {
                    ak0Var2.W(-1888469888);
                    ak0Var2.p(false);
                    gtVarC2 = gtVar2;
                } else {
                    ak0Var2.W(-1888469887);
                    gtVarC2 = vs0.C(1334518521, new rd2(j5, ij0Var3), ak0Var2);
                    ak0Var2.p(false);
                }
                if (!z2) {
                    j6 = jd2Var.H;
                } else if (z3) {
                    j6 = jd2Var.I;
                } else if (zBooleanValue) {
                    j6 = jd2Var.F;
                } else {
                    j6 = jd2Var.G;
                }
                j7 = j6;
                if (ij0Var4 == null) {
                    ak0Var2.W(-1888176380);
                    ak0Var2.p(false);
                    gtVar3 = gtVar2;
                } else {
                    ak0Var2.W(-1888176379);
                    gt gtVarC16 = vs0.C(837168720, new nl(j7, vf2Var3, ij0Var4, 1), ak0Var2);
                    ak0Var2.p(false);
                    gtVar3 = gtVarC16;
                }
                ak0Var2.W(-1886778186);
                objL6 = ak0Var2.L();
                if (objL6 == is1Var) {
                    objL6 = y12.s(new d52(0L));
                    ak0Var2.g0(objL6);
                }
                da1Var = (da1) objL6;
                gt gtVar16 = gtVarC2;
                gt gtVar17 = gtVar2;
                gt gtVarC17 = vs0.C(528115858, new od2(da1Var, xd2Var, gj1Var, gtVar), ak0Var2);
                ud2 ud2Var5 = new ud2(new ay0(0, 4, p82.class, ii2VarC, "value", "getValue()Ljava/lang/Object;"));
                gt gtVar18 = gtVarC;
                if ((i7 & 7168) != 2048) {
                    z4 = false;
                }
                zF3 = z4 | ak0Var2.f(ii2VarC);
                objL7 = ak0Var2.L();
                if (zF3) {
                    objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                    ak0Var2.g0(objL7);
                } else {
                    objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                    ak0Var2.g0(objL7);
                }
                ux.g(ij0Var, gtVar18, gtVar17, null, gtVar16, null, null, z, xd2Var, ud2Var5, (ej0) objL7, gtVarC17, gtVar3, gj1Var, ak0Var2, ((i7 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i7 << 18) & 1879048192), (57344 & (i8 >> 3)) | 384);
                ak0Var2 = ak0Var2;
                ak0Var2.p(false);
            } else {
                tuVar = tuVar2;
            }
            f3 = 1.0f;
            ak0Var2.p(false);
            Float fValueOf115 = Float.valueOf(f3);
            iq0 iq0Var117 = (iq0) dk1Var.getValue();
            ak0Var2.W(-1093194547);
            iOrdinal3 = iq0Var117.ordinal();
            if (iOrdinal3 == 0) {
                f4 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        qj.p();
                        return;
                    }
                } else if (z7) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            ak0Var2.p(false);
            Float fValueOf116 = Float.valueOf(f4);
            gi2VarF = ki2VarE.f();
            ak0Var2.W(-984009111);
            if (gi2VarF.b(iq0Var7, iq0Var6)) {
                g82Var = g82VarQ;
            } else {
                g82Var = g82VarQ2;
            }
            ak0Var2.p(false);
            ii2VarC2 = oi2.c(ki2VarE, fValueOf115, fValueOf116, g82Var, mj2Var, ak0Var2, 196608);
            iq0 iq0Var118 = (iq0) tuVar.f();
            ak0Var2.W(-1258455321);
            iOrdinal4 = iq0Var118.ordinal();
            if (iOrdinal4 == 0) {
                f5 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        qj.p();
                        return;
                    }
                } else if (z7) {
                    f5 = 0.0f;
                }
                f5 = 1.0f;
            }
            ak0Var2.p(false);
            Float fValueOf117 = Float.valueOf(f5);
            iq0 iq0Var119 = (iq0) dk1Var.getValue();
            ak0Var2.W(-1258455321);
            iOrdinal5 = iq0Var119.ordinal();
            if (iOrdinal5 == 0) {
                f6 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        qj.p();
                        return;
                    }
                } else if (!z7) {
                }
                f6 = 1.0f;
            }
            ak0Var2.p(false);
            Float fValueOf118 = Float.valueOf(f6);
            ki2VarE.f();
            ak0Var2.W(2126293195);
            ak0Var2.p(false);
            ii2VarC3 = oi2.c(ki2VarE, fValueOf117, fValueOf118, g82VarQ, mj2Var, ak0Var2, 196608);
            g82 g82VarQ9 = rw.Q(h81Var2, ak0Var2);
            iq0Var2 = (iq0) dk1Var.getValue();
            ak0Var2.W(-12973394);
            iArr = td2.a;
            if (iArr[iq0Var2.ordinal()] == 1) {
                j2 = jB2;
            } else {
                j2 = j9;
            }
            ak0Var2.p(false);
            mrVarE = dr.e(j2);
            zF = ak0Var2.f(mrVarE);
            objL = ak0Var2.L();
            is1Var = cv.a;
            if (zF) {
                mj2 mj2Var115 = new mj2(x4.s, new y3(7, mrVarE));
                ak0Var2.g0(mj2Var115);
                objL = mj2Var115;
            } else {
                mj2 mj2Var116 = new mj2(x4.s, new y3(7, mrVarE));
                ak0Var2.g0(mj2Var116);
                objL = mj2Var116;
            }
            mj2 mj2Var117 = (mj2) objL;
            iq0Var3 = (iq0) tuVar.f();
            ak0Var2.W(-12973394);
            if (iArr[iq0Var3.ordinal()] == 1) {
                j3 = jB2;
            } else {
                j3 = j9;
            }
            ak0Var2.p(false);
            dr drVar111 = new dr(j3);
            iq0Var4 = (iq0) dk1Var.getValue();
            ak0Var2.W(-12973394);
            if (iArr[iq0Var4.ordinal()] != 1) {
                jB2 = j9;
            }
            ak0Var2.p(false);
            dr drVar112 = new dr(jB2);
            ki2VarE.f();
            ak0Var2.W(1954111929);
            ak0Var2.p(false);
            ii2VarC4 = oi2.c(ki2VarE, drVar111, drVar112, g82VarQ9, mj2Var117, ak0Var2, 196608);
            ak0Var2.W(-464752477);
            ak0Var2.p(false);
            mrVarE2 = dr.e(j);
            zF2 = ak0Var2.f(mrVarE2);
            objL2 = ak0Var2.L();
            if (zF2) {
                mj2 mj2Var118 = new mj2(x4.s, new y3(7, mrVarE2));
                ak0Var2.g0(mj2Var118);
                objL2 = mj2Var118;
            } else {
                mj2 mj2Var119 = new mj2(x4.s, new y3(7, mrVarE2));
                ak0Var2.g0(mj2Var119);
                objL2 = mj2Var119;
            }
            ak0Var2.W(-464752477);
            ak0Var2.p(false);
            dr drVar113 = new dr(j);
            ak0Var2.W(-464752477);
            ak0Var2.p(false);
            dr drVar114 = new dr(j);
            ki2VarE.f();
            ak0Var2.W(1190923886);
            ak0Var2.p(false);
            ii2VarC5 = oi2.c(ki2VarE, drVar113, drVar114, g82VarQ9, (mj2) objL2, ak0Var2, 196608);
            objL3 = ak0Var2.L();
            if (objL3 == is1Var) {
                objL3 = new sd2();
                ak0Var2.g0(objL3);
            }
            sd2Var = (sd2) objL3;
            gtVar2 = null;
            if (jj0Var == null) {
                ak0Var2.W(-1891724857);
                ak0Var2.p(false);
                vf2Var = vf2Var2;
                z4 = true;
            } else {
                ak0Var2.W(-1891724856);
                vf2Var = vf2Var2;
                z4 = true;
                gt gtVarC18 = vs0.C(-1076580032, new pd2(vf2Var, vf2Var3, ii2VarC, ii2VarC5, z6, ii2VarC4, jj0Var, sd2Var), ak0Var2);
                ak0Var2.p(false);
                gtVar2 = gtVarC18;
            }
            if (!z2) {
                j4 = jd2Var.D;
            } else if (z3) {
                j4 = jd2Var.E;
            } else if (zBooleanValue) {
                j4 = jd2Var.B;
            } else {
                j4 = jd2Var.C;
            }
            objL4 = ak0Var2.L();
            if (objL4 == is1Var) {
                is1 is1Var12 = is1.o;
                nc1 nc1Var11 = new nc1(ii2VarC2, 5);
                ud udVar11 = e72.a;
                v40 v40Var11 = new v40(nc1Var11, is1Var12);
                ak0Var2.g0(v40Var11);
                objL4 = v40Var11;
            }
            p82 p82Var6 = (p82) objL4;
            if (ij0Var2 == null) {
                ak0Var2.W(-1890217110);
                ak0Var2.p(false);
                gtVarC = gtVar2;
            } else {
                ak0Var2.W(-1890217110);
                ak0Var2.p(false);
                gtVarC = gtVar2;
            }
            objL5 = ak0Var2.L();
            i5 = 6;
            if (objL5 == is1Var) {
                is1 is1Var13 = is1.o;
                nc1 nc1Var12 = new nc1(ii2VarC3, i5);
                ud udVar12 = e72.a;
                v40 v40Var12 = new v40(nc1Var12, is1Var13);
                ak0Var2.g0(v40Var12);
                objL5 = v40Var12;
            }
            ak0Var2.W(-1889500886);
            ak0Var2.p(false);
            ak0Var2.W(-1888924534);
            ak0Var2.p(false);
            ak0Var2.W(-1888749663);
            ak0Var2.p(false);
            if (!z2) {
                j5 = jd2Var.v;
            } else if (z3) {
                j5 = jd2Var.w;
            } else if (zBooleanValue) {
                j5 = jd2Var.t;
            } else {
                j5 = jd2Var.u;
            }
            if (ij0Var3 == null) {
                ak0Var2.W(-1888469888);
                ak0Var2.p(false);
                gtVarC2 = gtVar2;
            } else {
                ak0Var2.W(-1888469887);
                gtVarC2 = vs0.C(1334518521, new rd2(j5, ij0Var3), ak0Var2);
                ak0Var2.p(false);
            }
            if (!z2) {
                j6 = jd2Var.H;
            } else if (z3) {
                j6 = jd2Var.I;
            } else if (zBooleanValue) {
                j6 = jd2Var.F;
            } else {
                j6 = jd2Var.G;
            }
            j7 = j6;
            if (ij0Var4 == null) {
                ak0Var2.W(-1888176380);
                ak0Var2.p(false);
                gtVar3 = gtVar2;
            } else {
                ak0Var2.W(-1888176379);
                gt gtVarC19 = vs0.C(837168720, new nl(j7, vf2Var3, ij0Var4, 1), ak0Var2);
                ak0Var2.p(false);
                gtVar3 = gtVarC19;
            }
            ak0Var2.W(-1886778186);
            objL6 = ak0Var2.L();
            if (objL6 == is1Var) {
                objL6 = y12.s(new d52(0L));
                ak0Var2.g0(objL6);
            }
            da1Var = (da1) objL6;
            gt gtVar19 = gtVarC2;
            gt gtVar110 = gtVar2;
            gt gtVarC110 = vs0.C(528115858, new od2(da1Var, xd2Var, gj1Var, gtVar), ak0Var2);
            ud2 ud2Var6 = new ud2(new ay0(0, 4, p82.class, ii2VarC, "value", "getValue()Ljava/lang/Object;"));
            gt gtVar111 = gtVarC;
            if ((i7 & 7168) != 2048) {
                z4 = false;
            }
            zF3 = z4 | ak0Var2.f(ii2VarC);
            objL7 = ak0Var2.L();
            if (zF3) {
                objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                ak0Var2.g0(objL7);
            } else {
                objL7 = new kc1(xd2Var, ii2VarC, da1Var);
                ak0Var2.g0(objL7);
            }
            ux.g(ij0Var, gtVar111, gtVar110, null, gtVar19, null, null, z, xd2Var, ud2Var6, (ej0) objL7, gtVarC110, gtVar3, gj1Var, ak0Var2, ((i7 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i7 << 18) & 1879048192), (57344 & (i8 >> 3)) | 384);
            ak0Var2 = ak0Var2;
            ak0Var2.p(false);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: md2
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i | 1);
                    int iP2 = ei1.P(i2);
                    j12.a(charSequence, ij0Var, xd2Var, jj0Var, ij0Var2, ij0Var3, ij0Var4, z, z2, z3, ur0Var, gj1Var, jd2Var, gtVar, (ak0) obj, iP, iP2);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(long j, vf2 vf2Var, ij0 ij0Var, ak0 ak0Var, int i) {
        long j2;
        vf2 vf2Var2;
        ij0 ij0Var2;
        ak0 ak0Var2;
        ak0Var.X(396611577);
        int i2 = (ak0Var.e(j) ? 4 : 2) | i | (ak0Var.f(vf2Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ij0Var) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            ak0Var2 = ak0Var;
            vv.d(j, vf2Var, ij0Var, ak0Var2, i2 & 1022);
            j2 = j;
            vf2Var2 = vf2Var;
            ij0Var2 = ij0Var;
        } else {
            j2 = j;
            vf2Var2 = vf2Var;
            ij0Var2 = ij0Var;
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new uq1(j2, vf2Var2, ij0Var2, i, 1);
        }
    }

    public static final void c(long j, ij0 ij0Var, ak0 ak0Var, int i) {
        ak0Var.X(590397809);
        int i2 = (ak0Var.e(j) ? 4 : 2) | i | (ak0Var.h(ij0Var) ? 32 : 16);
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            sv.a(yw.a.a(new dr(j)), ij0Var, ak0Var, (i2 & 112) | 8);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new d6(j, ij0Var, i);
        }
    }

    public static final long d(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = ai2.c;
        return jFloatToRawIntBits;
    }

    public static final void e(Resources.Theme theme, View view, TypedValue typedValue) {
        int i = (!theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.getClass();
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }

    public static void g(zk zkVar) {
        zkVar.e(null, false);
    }

    public static final s3 h(xd2 xd2Var) {
        if (xd2Var instanceof xd2) {
            return q90.r;
        }
        throw new IllegalArgumentException("Unknown position: " + xd2Var);
    }

    public static final boolean i(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final q32 j(q32 q32Var, q32 q32Var2, float f) {
        long jG = ws0.G(q32Var.a, q32Var2.a, f);
        long j = q32Var.b;
        long j2 = q32Var2.b;
        float fD = rw.D(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fD2 = rw.D(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new q32(jG, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L), rw.D(q32Var.c, q32Var2.c, f));
    }

    public static final float k(ak0 ak0Var) {
        long j = ((gk2) ak0Var.j(ik2.a)).l.b.c;
        long j2 = pj2.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((m40) ak0Var.j(yv.h)).H(j) / 2.0f;
    }

    public static final long n(String str, long j, long j2, long j3) {
        String property;
        int i = nb2.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lB = o92.B(property);
        if (lB == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lB.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int o(int i, int i2, String str) {
        return (int) n(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final double p(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String q(int i, long j) {
        if (j >= 0) {
            j20.j(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        j20.j(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        j20.j(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }

    public abstract void f();

    public abstract void m(boolean z);

    public void l(boolean z) {
    }
}

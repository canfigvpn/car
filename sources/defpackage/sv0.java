package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.KeyEvent;
import ir.alirezaivaz.mygarage.MainActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sv0 implements n20, jv {
    public static final y32 A;
    public static final kr B;
    public static final kr C;
    public static final kr D;
    public static final kr E;
    public static final kr F;
    public static final kr G;
    public static final kr H;
    public static final kr I;
    public static final kr J;
    public static final kr K;
    public static final kr L;
    public static final kr M;
    public static final kr N;
    public static final kr O;
    public static final kr P;
    public static final kr Q;
    public static final kr R;
    public static final kr S;
    public static final kr T;
    public static final kr U;
    public static final kr V;
    public static final kr W;
    public static final kr X;
    public static final kr Y;
    public static final kr Z;
    public static final kr a0;
    public static final kr b0;
    public static final kr c0;
    public static final mv0[] d0;
    public static final iq1 e0;
    public static final iq1 f0;
    public static final iq1 g0;
    public static final long[] h0;
    public static final StackTraceElement[] i0;
    public static final k8 j0;
    public static final float k0 = 24.0f;
    public static final float l0 = 24.0f;
    public static final /* synthetic */ int m0 = 0;
    public static final al2 q;
    public static final al2 r;
    public static final al2 t;
    public static final al2 u;
    public static final bs0 v;
    public static final bs0 w;
    public static final kr z;
    public static final pb a = new pb(Float.POSITIVE_INFINITY);
    public static final qb b = new qb(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final rb c = new rb(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final sb d = new sb(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final pb e = new pb(Float.NEGATIVE_INFINITY);
    public static final qb f = new qb(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final rb g = new rb(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final sb h = new sb(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final gt i = new gt(new ut(22), false, -368117515);
    public static final int[] j = new int[0];
    public static final long[] k = new long[0];
    public static final Object[] l = new Object[0];
    public static final Class[] m = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final float n = 56.0f;
    public static final al2 o = new al2(5, true);
    public static final al2 p = new al2(true ? 1 : 0, true ? 1 : 0);
    public static final al2 s = new al2(4, true ? 1 : 0);
    public static final bs0 x = new bs0(0 == true ? 1 : 0, true ? 1 : 0);
    public static final bs0 y = new bs0(true ? 1 : 0, true ? 1 : 0);

    static {
        int i2 = 3;
        q = new al2(i2, false);
        int i3 = 2;
        r = new al2(i3, true ? 1 : 0);
        int i4 = 6;
        t = new al2(i4, true ? 1 : 0);
        int i5 = 7;
        u = new al2(i5, 0 == true ? 1 : 0);
        v = new bs0(i3, true ? 1 : 0);
        w = new bs0(i2, true ? 1 : 0);
        kr krVar = kr.p;
        z = krVar;
        A = y32.f;
        kr krVar2 = kr.l;
        B = krVar2;
        C = krVar2;
        D = krVar2;
        E = krVar2;
        F = krVar2;
        G = krVar2;
        kr krVar3 = kr.e;
        H = krVar3;
        I = krVar2;
        J = krVar3;
        kr krVar4 = kr.m;
        K = krVar4;
        L = krVar3;
        M = krVar3;
        N = krVar3;
        O = krVar2;
        P = krVar;
        Q = krVar4;
        R = krVar;
        S = krVar4;
        T = krVar4;
        U = krVar2;
        V = krVar4;
        W = krVar4;
        X = krVar4;
        Y = krVar4;
        Z = krVar4;
        a0 = kr.n;
        b0 = krVar4;
        c0 = krVar4;
        d0 = new mv0[0];
        e0 = new iq1(i4);
        f0 = new iq1(i5);
        g0 = new iq1(8);
        h0 = new long[0];
        i0 = new StackTraceElement[0];
        j0 = new k8(1022);
    }

    public static ia D(float f2) {
        return new ia(Float.valueOf(f2), ir2.V, Float.valueOf(0.01f), 8);
    }

    public static final oj E(float f2, long j2) {
        return new oj(f2, new o72(j2));
    }

    public static final q40 F(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        eh0 eh0VarA = fh0.a(f2);
        if (eh0VarA == null) {
            eh0VarA = new q21(f2);
        }
        return new q40(f3, f2, eh0VarA);
    }

    public static final void G(final u71 u71Var, final ea1 ea1Var, final da1 da1Var, final zx1 zx1Var, final u32 u32Var, final long j2, final float f2, final gt gtVar, ak0 ak0Var, final int i2) {
        ak0Var.X(848986741);
        int i3 = i2 | (ak0Var.f(u71Var) ? 4 : 2) | (ak0Var.f(ea1Var) ? 32 : 16) | (ak0Var.f(zx1Var) ? 2048 : 1024) | (ak0Var.f(u32Var) ? 16384 : 8192) | (ak0Var.e(j2) ? 131072 : 65536) | (ak0Var.c(0.0f) ? 1048576 : 524288) | (ak0Var.c(f2) ? 8388608 : 4194304) | (ak0Var.f(null) ? 67108864 : 33554432) | (ak0Var.h(gtVar) ? 536870912 : 268435456);
        if (ak0Var.O(i3 & 1, (i3 & 306783379) != 306783378)) {
            ki2 ki2VarD = oi2.d(ea1Var, "DropDownMenu", ak0Var, (((i3 >> 3) & 14) | 48) & 126);
            g82 g82VarQ = rw.Q(h81.f, ak0Var);
            g82 g82VarQ2 = rw.Q(h81.h, ak0Var);
            mj2 mj2Var = ir2.V;
            tu tuVar = ki2VarD.a;
            dk1 dk1Var = ki2VarD.d;
            boolean zBooleanValue = ((Boolean) tuVar.f()).booleanValue();
            ak0Var.W(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            ak0Var.p(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) dk1Var.getValue()).booleanValue();
            ak0Var.W(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            ak0Var.p(false);
            Float fValueOf2 = Float.valueOf(f4);
            ki2VarD.f();
            ak0Var.W(-745957716);
            ak0Var.p(false);
            ii2 ii2VarC = oi2.c(ki2VarD, fValueOf, fValueOf2, g82VarQ, mj2Var, ak0Var, 0);
            boolean zBooleanValue3 = ((Boolean) ki2VarD.a.f()).booleanValue();
            ak0Var.W(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            ak0Var.p(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) dk1Var.getValue()).booleanValue();
            ak0Var.W(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            ak0Var.p(false);
            Float fValueOf4 = Float.valueOf(f6);
            ki2VarD.f();
            ak0Var.W(2839488);
            ak0Var.p(false);
            ii2 ii2VarC2 = oi2.c(ki2VarD, fValueOf3, fValueOf4, g82VarQ2, mj2Var, ak0Var, 0);
            boolean zBooleanValue5 = ((Boolean) ak0Var.j(uq0.a)).booleanValue();
            boolean zG = ak0Var.g(zBooleanValue5) | ak0Var.f(ii2VarC) | ((i3 & 112) == 32) | ak0Var.f(ii2VarC2);
            Object objL = ak0Var.L();
            if (zG || objL == cv.a) {
                Object e71Var = new e71(zBooleanValue5, ea1Var, da1Var, ii2VarC, ii2VarC2);
                ak0Var.g0(e71Var);
                objL = e71Var;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            ra2.a(nj2.t(r71.a, (ej0) objL), u32Var, j2, 0L, f2, vs0.C(-1463404422, new p00(u71Var, zx1Var, gtVar), ak0Var), ak0Var, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(ea1Var, da1Var, zx1Var, u32Var, j2, f2, gtVar, i2) { // from class: f71
                public final /* synthetic */ ea1 f;
                public final /* synthetic */ da1 g;
                public final /* synthetic */ zx1 h;
                public final /* synthetic */ u32 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ float k;
                public final /* synthetic */ gt l;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(385);
                    sv0.G(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void H(gt gtVar, ti0 ti0Var, u71 u71Var, ij0 ij0Var, boolean z2, d71 d71Var, gj1 gj1Var, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(-1325192924);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.h(gtVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ti0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.f(u71Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ak0Var.f(d71Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ak0Var.f(gj1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= ak0Var.f(null) ? 67108864 : 33554432;
        }
        if (ak0Var.O(i3 & 1, (38347923 & i3) != 38347922)) {
            u71 u71VarB0 = p61.b0(f52.m(S(u71Var, null, tu1.a(true, 0.0f, 6), z2, null, ti0Var, 24).c(f52.a), 112.0f, 48.0f, 280.0f, 8), gj1Var);
            sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var, 48);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarB0);
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
            ef2.a(((gk2) ak0Var.j(ik2.a)).m, vs0.C(865999929, new g71(ij0Var, d71Var, z2, gtVar), ak0Var), ak0Var, 48);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new fo(gtVar, ti0Var, u71Var, ij0Var, z2, d71Var, gj1Var, i2);
        }
    }

    public static final void I(yf1 yf1Var, t3 t3Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ak0Var.f(yf1Var) : ak0Var.h(yf1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(t3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(gtVar) ? 256 : 128;
        }
        boolean z2 = true;
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !ak0Var.f(yf1Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objL = ak0Var.L();
            if (z4 || objL == cv.a) {
                objL = new rl0(t3Var, yf1Var);
                ak0Var.g0(objL);
            }
            s8.a((rl0) objL, null, new yo1(false, wy1.e, false, 0), gtVar, ak0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(yf1Var, t3Var, gtVar, i2, 0);
        }
    }

    public static final void J(final yf1 yf1Var, final boolean z2, final jt1 jt1Var, final boolean z3, long j2, final float f2, final u71 u71Var, ak0 ak0Var, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z4;
        ak0Var.X(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ak0Var.f(yf1Var) : ak0Var.h(yf1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.d(jt1Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ak0Var.f(u71Var) ? 1048576 : 524288;
        }
        if (ak0Var.O(i3 & 1, (533651 & i3) != 533650)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                ak0Var.R();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            ak0Var.q();
            jt1 jt1Var2 = jt1.f;
            jt1 jt1Var3 = jt1.e;
            if (z2) {
                y02 y02Var = e02.a;
                z4 = (jt1Var == jt1Var3 && !z3) || (jt1Var == jt1Var2 && z3);
            } else {
                y02 y02Var2 = e02.a;
                z4 = (jt1Var != jt1Var3 || z3) && !(jt1Var == jt1Var2 && z3);
            }
            ti tiVar = z4 ? s5.b : s5.a;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && ak0Var.h(yf1Var))) | ((i4 & 112) == 32) | ak0Var.g(z4);
            Object objL = ak0Var.L();
            if (zG || objL == cv.a) {
                objL = new ej0() { // from class: a9
                    @Override // defpackage.ej0
                    public final Object h(Object obj) {
                        z02 z02Var = (z02) obj;
                        long jA = yf1Var.a();
                        z02Var.a(e02.a, new d02(z2 ? ql0.f : ql0.g, jA, z4 ? c02.e : c02.g, (9223372034707292159L & jA) != 9205357640488583168L));
                        return ll2.a;
                    }
                };
                ak0Var.g0(objL);
            }
            final u71 u71VarA = l02.a(u71Var, false, (ej0) objL);
            final on2 on2Var = (on2) ak0Var.j(yv.t);
            long j5 = j4;
            ti tiVar2 = tiVar;
            j3 = j5;
            I(yf1Var, tiVar2, vs0.C(1365123137, new ij0() { // from class: b9
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ak0 ak0Var2 = (ak0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ak0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        vq1 vq1VarA = yv.t.a(on2Var);
                        final long j6 = j3;
                        final boolean z5 = z4;
                        final u71 u71Var2 = u71VarA;
                        final yf1 yf1Var2 = yf1Var;
                        sv.a(vq1VarA, vs0.C(1260045569, new ij0() { // from class: d9
                            @Override // defpackage.ij0
                            public final Object g(Object obj3, Object obj4) {
                                ak0 ak0Var3 = (ak0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final int i6 = 1;
                                final int i7 = 0;
                                if (ak0Var3.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j7 = j6;
                                    boolean z6 = z5;
                                    u71 u71Var3 = u71Var2;
                                    final yf1 yf1Var3 = yf1Var2;
                                    is1 is1Var = cv.a;
                                    if (j7 != 9205357640488583168L) {
                                        ak0Var3.W(3458246);
                                        ee eeVar = z6 ? vs0.c : vs0.b;
                                        u71 u71VarH = f52.h(u71Var3, z60.b(j7), z60.a(j7), 0.0f, 0.0f, 12);
                                        sv1 sv1VarA = rv1.a(eeVar, q90.o, ak0Var3, 0);
                                        int iHashCode = Long.hashCode(ak0Var3.T);
                                        sl1 sl1VarL = ak0Var3.l();
                                        u71 u71VarB = nj2.B(ak0Var3, u71VarH);
                                        wu.c.getClass();
                                        wv wvVar = vu.b;
                                        ak0Var3.Z();
                                        if (ak0Var3.S) {
                                            ak0Var3.k(wvVar);
                                        } else {
                                            ak0Var3.j0();
                                        }
                                        p12.l(vu.f, ak0Var3, sv1VarA);
                                        p12.l(vu.e, ak0Var3, sl1VarL);
                                        p12.f(ak0Var3, Integer.valueOf(iHashCode), vu.g);
                                        p12.k(ak0Var3, vu.h);
                                        p12.l(vu.d, ak0Var3, u71VarB);
                                        boolean zH = ak0Var3.h(yf1Var3);
                                        Object objL2 = ak0Var3.L();
                                        if (zH || objL2 == is1Var) {
                                            objL2 = new ti0() { // from class: e9
                                                @Override // defpackage.ti0
                                                public final Object a() {
                                                    int i8 = i7;
                                                    yf1 yf1Var4 = yf1Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & yf1Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & yf1Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            ak0Var3.g0(objL2);
                                        }
                                        sv0.K(r71.a, (ti0) objL2, z6, ak0Var3, 6);
                                        ak0Var3.p(true);
                                        ak0Var3.p(false);
                                    } else {
                                        ak0Var3.W(4389176);
                                        boolean zH2 = ak0Var3.h(yf1Var3);
                                        Object objL3 = ak0Var3.L();
                                        if (zH2 || objL3 == is1Var) {
                                            objL3 = new ti0() { // from class: e9
                                                @Override // defpackage.ti0
                                                public final Object a() {
                                                    int i8 = i6;
                                                    yf1 yf1Var4 = yf1Var3;
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & yf1Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & yf1Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            ak0Var3.g0(objL3);
                                        }
                                        sv0.K(u71Var3, (ti0) objL3, z6, ak0Var3, 0);
                                        ak0Var3.p(false);
                                    }
                                } else {
                                    ak0Var3.R();
                                }
                                return ll2.a;
                            }
                        }, ak0Var2), ak0Var2, 56);
                    } else {
                        ak0Var2.R();
                    }
                    return ll2.a;
                }
            }, ak0Var), ak0Var, i5 | 384);
        } else {
            ak0Var.R();
            j3 = j2;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final long j6 = j3;
            lr1VarR.d = new ij0() { // from class: c9
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sv0.J(yf1Var, z2, jt1Var, z3, j6, f2, u71Var, (ak0) obj, ei1.P(i2 | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void K(u71 u71Var, ti0 ti0Var, boolean z2, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (ak0Var.h(ti0Var) ? 32 : 16) | (ak0Var.g(z2) ? 256 : 128);
        int i5 = 0;
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            y02 y02Var = e02.a;
            r02.b(ak0Var, nj2.n(f52.k(u71Var, 25.0f, 25.0f), new g9(ti0Var, z2, i5)));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new f9(u71Var, ti0Var, z2, i2);
        }
    }

    public static final u71 L(u71 u71Var) {
        return u71Var.c(new xe());
    }

    public static final int M(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int N(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gr1, tu] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [vj0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List O(o52 o52Var, Integer num, int i2, Integer num2) {
        int iD;
        int iR;
        p91 p91Var;
        if (o52Var.w || o52Var.o() == 0) {
            return cb0.e;
        }
        ?? gr1Var = new gr1(o52Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = o52Var.v;
            if (iD < 0) {
                iD = o52Var.D(o52Var.b, i2);
            }
        }
        if (num == 0) {
            int iM = o52Var.i - o52Var.M(o52Var.b, o52Var.q(i2));
            d91 d91Var = o52Var.s;
            num = Integer.valueOf(iM + ((d91Var == null || (p91Var = (p91) d91Var.b(i2)) == null) ? 0 : p91Var.b));
        }
        int iQ = o52Var.q(i2) * 5;
        int[] iArr = o52Var.b;
        if (iQ < iArr.length) {
            iR = o52Var.r(i2);
        } else {
            int iD2 = iD >= 0 ? o52Var.D(iArr, iD) : iD;
            iR = o52Var.r(iD);
            int i3 = iD;
            iD = iD2;
            i2 = i3;
        }
        while (i2 >= 0) {
            gr1Var.i(iR, (o52Var.b[(o52Var.q(i2) * 5) + 1] & 536870912) != 0 ? o52Var.s(i2) : cv.a, o52Var.N(i2), num);
            num = o52Var.b(i2);
            if (iD >= 0) {
                int iD3 = o52Var.D(o52Var.b, iD);
                iR = o52Var.r(iD);
                int i4 = iD;
                iD = iD3;
                i2 = i4;
            } else {
                i2 = iD;
            }
        }
        return (ArrayList) gr1Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long P(mr0 mr0Var, mr0 mr0Var2) {
        float fMin;
        int i2 = mr0Var2.a;
        int i3 = mr0Var2.d;
        int i4 = mr0Var2.a;
        int i5 = mr0Var2.c;
        int i6 = mr0Var2.b;
        int i7 = mr0Var.c;
        int i8 = mr0Var.b;
        int i9 = mr0Var.d;
        int i10 = mr0Var.a;
        float fMin2 = 1.0f;
        if (i2 >= i7) {
            fMin = 0.0f;
        } else if (i5 <= i10) {
            fMin = 1.0f;
        } else if (mr0Var2.c() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(mr0Var.c, i5) + Math.max(i10, i4)) / 2) - i4) / mr0Var2.c();
        }
        if (i6 >= i9) {
            fMin2 = 0.0f;
        } else if (i3 > i8) {
            if (mr0Var2.b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i9, i3) + Math.max(i8, i6)) / 2) - i6) / mr0Var2.b();
            }
        }
        return j12.d(fMin, fMin2);
    }

    public static final boolean Q(Object obj) {
        if (obj instanceof b72) {
            b72 b72Var = (b72) obj;
            if (b72Var.e() == q90.U || b72Var.e() == is1.o || b72Var.e() == is1.f) {
                Object value = b72Var.getValue();
                if (value == null) {
                    return true;
                }
                return Q(value);
            }
        } else if (!(obj instanceof qj0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (m[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static u71 R(u71 u71Var) {
        return u71Var.c(new mp(new s1(17)));
    }

    public static u71 S(u71 u71Var, f91 f91Var, vu1 vu1Var, boolean z2, wu1 wu1Var, ti0 ti0Var, int i2) {
        u71 u71VarC;
        if ((i2 & 16) != 0) {
            wu1Var = null;
        }
        wu1 wu1Var2 = wu1Var;
        if (vu1Var != null) {
            u71VarC = new hq(f91Var, vu1Var, false, z2, null, wu1Var2, ti0Var);
        } else if (vu1Var == null) {
            u71VarC = new hq(f91Var, null, false, z2, null, wu1Var2, ti0Var);
        } else {
            r71 r71Var = r71.a;
            u71VarC = f91Var != null ? yo0.a(r71Var, f91Var, vu1Var).c(new hq(f91Var, null, false, z2, null, wu1Var2, ti0Var)) : nj2.n(r71Var, new iq(vu1Var, z2, wu1Var2, ti0Var));
        }
        return u71Var.c(u71VarC);
    }

    public static u71 T(u71 u71Var, boolean z2, String str, wu1 wu1Var, ti0 ti0Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return u71Var.c(new hq(null, null, true, z2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : wu1Var, ti0Var));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final g7 U(sl slVar, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        g7 g7VarA = ix.a;
        j4 j4Var = ix.b;
        um umVar = ix.c;
        if (g7VarA == null || j4Var == null) {
            g7VarA = ux.a(iCeil, iCeil, 1);
            ix.a = g7VarA;
            Canvas canvas = k4.a;
            j4Var = new j4();
            j4Var.a = new Canvas(ir2.d(g7VarA));
            ix.b = j4Var;
        } else {
            Bitmap bitmap = g7VarA.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                g7VarA = ux.a(iCeil, iCeil, 1);
                ix.a = g7VarA;
                Canvas canvas2 = k4.a;
                j4Var = new j4();
                j4Var.a = new Canvas(ir2.d(g7VarA));
                ix.b = j4Var;
            }
        }
        g7 g7Var = g7VarA;
        j4 j4Var2 = j4Var;
        if (umVar == null) {
            umVar = new um();
            ix.c = umVar;
        }
        um umVar2 = umVar;
        tm tmVar = umVar2.e;
        kw0 layoutDirection = slVar.e.getLayoutDirection();
        Bitmap bitmap2 = g7Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        m40 m40Var = tmVar.a;
        kw0 kw0Var = tmVar.b;
        sm smVar = tmVar.c;
        long j2 = tmVar.d;
        tmVar.a = slVar;
        tmVar.b = layoutDirection;
        tmVar.c = j4Var2;
        tmVar.d = jFloatToRawIntBits;
        j4Var2.l();
        l80.c0(umVar2, dr.b, 0L, umVar2.d(), 58);
        l80.c0(umVar2, ws0.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 120);
        l80.C(umVar2, ws0.d(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        j4Var2.i();
        tmVar.a = m40Var;
        tmVar.b = kw0Var;
        tmVar.c = smVar;
        tmVar.d = j2;
        return g7Var;
    }

    public static final kw1 W(lz lzVar) {
        kw1 kw1Var;
        lzVar.getClass();
        tw1 tw1Var = (tw1) lzVar.a(e0);
        Bundle bundle = null;
        if (tw1Var == null) {
            qj.r("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        co2 co2Var = (co2) lzVar.a(f0);
        if (co2Var == null) {
            qj.r("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) lzVar.a(g0);
        String str = (String) lzVar.a(ao2.g);
        if (str == null) {
            qj.r("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        rw1 rw1VarK = tw1Var.c().k("androidx.lifecycle.internal.SavedStateHandlesProvider");
        ow1 ow1Var = rw1VarK instanceof ow1 ? (ow1) rw1VarK : null;
        if (ow1Var == null) {
            fu1.h("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = e0(co2Var).b;
        kw1 kw1Var2 = (kw1) linkedHashMap.get(str);
        if (kw1Var2 != null) {
            return kw1Var2;
        }
        ow1Var.b();
        Bundle bundle3 = ow1Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                ow1Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            kw1Var = new kw1();
        } else {
            ClassLoader classLoader = kw1.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            x51 x51Var = new x51(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                x51Var.put(str2, bundle2.get(str2));
            }
            kw1Var = new kw1(x51Var.b());
        }
        linkedHashMap.put(str, kw1Var);
        return kw1Var;
    }

    public static final void Y(tw1 tw1Var) {
        r11 r11Var = tw1Var.h().h;
        if (r11Var != r11.f && r11Var != r11.g) {
            qj.l("Failed to enable `SavedStateHandle` for `", tw1Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", r11Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (tw1Var.c().k("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            ow1 ow1Var = new ow1(tw1Var.c(), (co2) tw1Var);
            tw1Var.c().o("androidx.lifecycle.internal.SavedStateHandlesProvider", ow1Var);
            tw1Var.h().a(new xr1(3, ow1Var));
        }
    }

    public static final boolean Z(long j2, long j3) {
        return j2 == j3;
    }

    public static final Integer a0(k52 k52Var, lv lvVar, int i2, int i3) {
        Integer numA0;
        int[] iArr = k52Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (k52Var.j(i2) && k52Var.i(i2) == 206 && ws0.j(k52Var.p(iArr, i2), hv.e)) {
                Object objH = k52Var.h(i2, 0);
                ek0 ek0Var = objH instanceof ek0 ? (ek0) objH : null;
                ss1 ss1Var = ek0Var != null ? ek0Var.a : null;
                xj0 xj0Var = ss1Var instanceof xj0 ? (xj0) ss1Var : null;
                if (xj0Var != null && xj0Var.e == lvVar) {
                    return Integer.valueOf(i2);
                }
            }
            if (k52Var.d(i2) && (numA0 = a0(k52Var, lvVar, i2 + 1, i4)) != null) {
                return Integer.valueOf(numA0.intValue());
            }
            i2 = i4;
        }
    }

    public static final u71 b0(u71 u71Var, boolean z2, f91 f91Var) {
        return u71Var.c(z2 ? new eg0(f91Var) : r71.a);
    }

    public static final String c0(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j2));
    }

    public static final long d0(KeyEvent keyEvent) {
        return ix.b(keyEvent.getKeyCode());
    }

    public static final pw1 e0(co2 co2Var) {
        nw1 nw1Var = new nw1();
        lz lzVarJ = v12.j(co2Var);
        lzVarJ.getClass();
        return (pw1) new e4(co2Var.g(), nw1Var, lzVarJ).j(js1.a(pw1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final int g0(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final int h0(ue ueVar, Object obj, int i2) {
        int i3 = ueVar.g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM = M(i3, i2, ueVar.e);
            if (iM < 0 || ws0.j(obj, ueVar.f[iM])) {
                return iM;
            }
            int i4 = iM + 1;
            while (i4 < i3 && ueVar.e[i4] == i2) {
                if (ws0.j(obj, ueVar.f[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM - 1; i5 >= 0 && ueVar.e[i5] == i2; i5--) {
                if (ws0.j(obj, ueVar.f[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean i0(KeyEvent keyEvent) {
        long jD0 = d0(keyEvent);
        int i2 = pv0.F;
        return pv0.a(jD0, pv0.h) || pv0.a(jD0, pv0.r) || pv0.a(jD0, pv0.E) || pv0.a(jD0, pv0.q);
    }

    public static final boolean j0(int i2, int i3, long j2) {
        int iJ = sw.j(j2);
        if (i2 > sw.h(j2) || iJ > i2) {
            return false;
        }
        return i3 <= sw.g(j2) && sw.i(j2) <= i3;
    }

    public static final u71 k0(u71 u71Var, jj0 jj0Var) {
        return u71Var.c(new lw0(jj0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [gr1, tu] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList m0(k52 k52Var, int i2, Integer num) {
        ?? gr1Var = new gr1(k52Var);
        i2 = k52Var.q(i2);
        vj0 vj0VarA = k52Var.a(i2);
        while (i2 >= 0) {
            gr1Var.i(k52Var.i(i2), k52Var.k(i2) ? k52Var.p(k52Var.b, i2) : cv.a, k52Var.a.f(i2), num);
            if (i2 >= 0) {
                vj0 vj0Var = vj0VarA;
                vj0VarA = k52Var.a(i2);
                i2 = k52Var.q(i2);
                num = vj0Var;
            } else {
                num = vj0VarA;
            }
        }
        return (ArrayList) gr1Var.a;
    }

    @Override // defpackage.n20
    public jv A(s12 s12Var) {
        s12Var.getClass();
        return this;
    }

    @Override // defpackage.n20
    public int B(s12 s12Var) {
        s12Var.getClass();
        Object objX = X();
        objX.getClass();
        return ((Integer) objX).intValue();
    }

    @Override // defpackage.n20
    public double C() {
        Object objX = X();
        objX.getClass();
        return ((Double) objX).doubleValue();
    }

    public abstract Intent V(MainActivity mainActivity, Object obj);

    public Object X() {
        throw new a22(js1.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.n20
    public long a() {
        Object objX = X();
        objX.getClass();
        return ((Long) objX).longValue();
    }

    @Override // defpackage.jv
    public n20 b(vp1 vp1Var, int i2) {
        return t(vp1Var.j(i2));
    }

    @Override // defpackage.n20
    public boolean c() {
        Object objX = X();
        objX.getClass();
        return ((Boolean) objX).booleanValue();
    }

    @Override // defpackage.n20
    public boolean d() {
        return true;
    }

    @Override // defpackage.n20
    public char e() {
        Object objX = X();
        objX.getClass();
        return ((Character) objX).charValue();
    }

    @Override // defpackage.n20
    public Object f(mv0 mv0Var) {
        mv0Var.getClass();
        return mv0Var.a(this);
    }

    public abstract void f0(MainActivity mainActivity, Object obj);

    @Override // defpackage.jv
    public Object g(s12 s12Var, int i2, mv0 mv0Var, Object obj) {
        s12Var.getClass();
        if (mv0Var.c().h() || d()) {
            return f(mv0Var);
        }
        return null;
    }

    @Override // defpackage.jv
    public double i(vp1 vp1Var, int i2) {
        return C();
    }

    @Override // defpackage.jv
    public char j(vp1 vp1Var, int i2) {
        return e();
    }

    @Override // defpackage.jv
    public float k(vp1 vp1Var, int i2) {
        return y();
    }

    @Override // defpackage.jv
    public byte l(vp1 vp1Var, int i2) {
        return s();
    }

    public abstract Uri l0(Intent intent, int i2);

    @Override // defpackage.jv
    public String m(s12 s12Var, int i2) {
        s12Var.getClass();
        return x();
    }

    @Override // defpackage.n20
    public int n() {
        Object objX = X();
        objX.getClass();
        return ((Integer) objX).intValue();
    }

    @Override // defpackage.jv
    public short o(vp1 vp1Var, int i2) {
        return w();
    }

    public void p(s12 s12Var) {
        s12Var.getClass();
    }

    @Override // defpackage.jv
    public boolean r(s12 s12Var, int i2) {
        s12Var.getClass();
        return c();
    }

    @Override // defpackage.n20
    public byte s() {
        Object objX = X();
        objX.getClass();
        return ((Byte) objX).byteValue();
    }

    @Override // defpackage.n20
    public n20 t(s12 s12Var) {
        s12Var.getClass();
        return this;
    }

    public Object u(s12 s12Var, int i2, mv0 mv0Var, Object obj) {
        s12Var.getClass();
        mv0Var.getClass();
        return f(mv0Var);
    }

    @Override // defpackage.jv
    public int v(s12 s12Var, int i2) {
        s12Var.getClass();
        return n();
    }

    @Override // defpackage.n20
    public short w() {
        Object objX = X();
        objX.getClass();
        return ((Short) objX).shortValue();
    }

    @Override // defpackage.n20
    public String x() {
        Object objX = X();
        objX.getClass();
        return (String) objX;
    }

    @Override // defpackage.n20
    public float y() {
        Object objX = X();
        objX.getClass();
        return ((Float) objX).floatValue();
    }

    @Override // defpackage.jv
    public long z(s12 s12Var, int i2) {
        s12Var.getClass();
        return a();
    }
}

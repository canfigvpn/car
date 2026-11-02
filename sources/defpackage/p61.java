package defpackage;

import android.content.Context;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p61 {
    public static final k8 C;
    public static final ru1 D;
    public static final y32 E;
    public static final float F;
    public static final float G;
    public static final kr H;
    public static final float I;
    public static final kr J;
    public static final float K;
    public static final kr L;
    public static final float M;
    public static final kr N;
    public static final float O;
    public static final kr P;
    public static final float Q;
    public static final kr R;
    public static final kr S;
    public static final y32 T;
    public static final float U;
    public static final kr V;
    public static final float W;
    public static final kr X;
    public static final kr Y;
    public static final float Z;
    public static final float a0;
    public static final float b0;
    public static final y32 c0;
    public static final float d0;
    public static final kr e0;
    public static final kr f0;
    public static final float g0;
    public static final kr h0;
    public static final kr i0;
    public static final pa0 j0;
    public static final gt k;
    public static final xw1 k0;
    public static final xw1 l0;
    public static final gt m;
    public static final gg2 m0;
    public static final gt n;
    public static final /* synthetic */ int n0 = 0;
    public static final gt q;
    public static final gt r;
    public static final Object[] a = new Object[0];
    public static final gt b = new gt(new ut(23), false, 881339074);
    public static final gt c = new gt(new tt(2), false, -1049077397);
    public static final gt d = new gt(new tt(3), false, 1805520034);
    public static final gt e = new gt(new ut(24), false, 1481511651);
    public static final gt f = new gt(new ut(25), false, 1787538426);
    public static final gt g = new gt(new ut(26), false, -2061891559);
    public static final gt h = new gt(new qt(12), false, -1868313587);
    public static final gt i = new gt(new qt(13), false, 224602161);
    public static final gt j = new gt(new qt(14), false, -1330799046);
    public static final gt l = new gt(new ut(27), false, 446365057);
    public static final gt o = new gt(new qt(16), false, -38483996);
    public static final gt p = new gt(new qt(17), false, 449563110);
    public static final String[] s = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final kr t = kr.q;
    public static final float u = 6.0f;
    public static final float v = 6.0f;
    public static final float w = 8.0f;
    public static final float x = 6.0f;
    public static final kr y = kr.u;
    public static final float z = 3.0f;
    public static final y32 A = y32.f;
    public static final k8 B = new k8(1000);

    /* JADX WARN: Type inference failed for: r1v36, types: [gg2] */
    static {
        final byte b2 = 0;
        int i2 = 15;
        k = new gt(new qt(i2), false, 1556442300);
        int i3 = 28;
        m = new gt(new ut(i3), false, -257497918);
        final int i4 = 1;
        n = new gt(new ij0() { // from class: gg2
            @Override // defpackage.ij0
            public final Object g(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        mg2 mg2Var = (mg2) obj;
                        sy syVar = (sy) obj2;
                        if (syVar instanceof hg2) {
                            hg2 hg2Var = (hg2) syVar;
                            uy uyVar = mg2Var.a;
                            Object objC = hg2Var.c();
                            Object[] objArr = mg2Var.b;
                            int i5 = mg2Var.d;
                            objArr[i5] = objC;
                            hg2[] hg2VarArr = mg2Var.c;
                            mg2Var.d = i5 + 1;
                            hg2VarArr[i5] = hg2Var;
                        }
                        return mg2Var;
                    default:
                        ak0 ak0Var = (ak0) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                            jo0 jo0VarB = qx.a;
                            if (jo0VarB == null) {
                                io0 io0Var = new io0("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i6 = jm2.a;
                                o72 o72Var = new o72(dr.b);
                                qk1 qk1Var = new qk1(0);
                                qk1Var.A(3.0f, 17.25f);
                                qk1Var.H(21.0f);
                                qk1Var.x(3.75f);
                                qk1Var.y(17.81f, 9.94f);
                                qk1Var.z(-3.75f, -3.75f);
                                qk1Var.y(3.0f, 17.25f);
                                qk1Var.s();
                                qk1Var.A(20.71f, 7.04f);
                                qk1Var.t(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                                qk1Var.z(-2.34f, -2.34f);
                                qk1Var.t(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                                qk1Var.z(-1.83f, 1.83f);
                                qk1Var.z(3.75f, 3.75f);
                                qk1Var.z(1.83f, -1.83f);
                                qk1Var.s();
                                io0.a(io0Var, (ArrayList) qk1Var.f, o72Var);
                                jo0VarB = io0Var.b();
                                qx.a = jo0VarB;
                            }
                            fo0.a(jo0VarB, j02.r(R.string.detail_update_odometer, ak0Var), null, 0L, ak0Var, 0, 12);
                        } else {
                            ak0Var.R();
                        }
                        return ll2.a;
                }
            }
        }, false, -321607869);
        q = new gt(new tt(b2), false, -2012660885);
        r = new gt(new tt(i4), false, 469451270);
        new k8(1007);
        C = new k8(1008);
        new k8(1002);
        D = new ru1(4, new vy(i2), new xi1(6));
        y32 y32Var = y32.g;
        E = y32Var;
        F = 8.0f;
        G = 24.0f;
        H = kr.t;
        I = 1.0f;
        kr krVar = kr.l;
        J = krVar;
        K = 0.38f;
        L = krVar;
        M = 0.12f;
        N = krVar;
        O = 0.38f;
        kr krVar2 = kr.w;
        P = krVar2;
        Q = 0.38f;
        R = krVar2;
        S = krVar;
        T = y32Var;
        U = 28.0f;
        V = kr.i;
        W = 24.0f;
        X = kr.j;
        Y = kr.p;
        Z = 40.0f;
        a0 = 32.0f;
        b0 = 2.0f;
        c0 = y32Var;
        d0 = 52.0f;
        kr krVar3 = kr.n;
        e0 = krVar3;
        f0 = krVar3;
        g0 = 16.0f;
        h0 = krVar2;
        i0 = krVar2;
        j0 = new pa0("NO_THREAD_ELEMENTS", i4);
        k0 = new xw1(i3, b2);
        l0 = new xw1(29, b2);
        m0 = new ij0() { // from class: gg2
            @Override // defpackage.ij0
            public final Object g(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        mg2 mg2Var = (mg2) obj;
                        sy syVar = (sy) obj2;
                        if (syVar instanceof hg2) {
                            hg2 hg2Var = (hg2) syVar;
                            uy uyVar = mg2Var.a;
                            Object objC = hg2Var.c();
                            Object[] objArr = mg2Var.b;
                            int i5 = mg2Var.d;
                            objArr[i5] = objC;
                            hg2[] hg2VarArr = mg2Var.c;
                            mg2Var.d = i5 + 1;
                            hg2VarArr[i5] = hg2Var;
                        }
                        return mg2Var;
                    default:
                        ak0 ak0Var = (ak0) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                            jo0 jo0VarB = qx.a;
                            if (jo0VarB == null) {
                                io0 io0Var = new io0("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i6 = jm2.a;
                                o72 o72Var = new o72(dr.b);
                                qk1 qk1Var = new qk1(0);
                                qk1Var.A(3.0f, 17.25f);
                                qk1Var.H(21.0f);
                                qk1Var.x(3.75f);
                                qk1Var.y(17.81f, 9.94f);
                                qk1Var.z(-3.75f, -3.75f);
                                qk1Var.y(3.0f, 17.25f);
                                qk1Var.s();
                                qk1Var.A(20.71f, 7.04f);
                                qk1Var.t(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                                qk1Var.z(-2.34f, -2.34f);
                                qk1Var.t(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                                qk1Var.z(-1.83f, 1.83f);
                                qk1Var.z(3.75f, 3.75f);
                                qk1Var.z(1.83f, -1.83f);
                                qk1Var.s();
                                io0.a(io0Var, (ArrayList) qk1Var.f, o72Var);
                                jo0VarB = io0Var.b();
                                qx.a = jo0VarB;
                            }
                            fo0.a(jo0VarB, j02.r(R.string.detail_update_odometer, ak0Var), null, 0L, ak0Var, 0, 12);
                        } else {
                            ak0Var.R();
                        }
                        return ll2.a;
                }
            }
        };
    }

    public static String U(int i2, boolean z2) {
        if (z2) {
            nt0 nt0VarR = ei1.r(i2);
            return dv1.N(nt0VarR.c + " " + nt0.e[nt0VarR.b - 1] + " " + nt0VarR.a);
        }
        wp wpVarV = V(i2);
        return wpVarV.c + " " + s[wpVarV.b - 1] + " " + wpVarV.a;
    }

    public static wp V(int i2) {
        int i3 = 719468 + i2;
        int i4 = (i3 >= 0 ? i3 : i2 + 573372) / 146097;
        int i5 = i3 - (146097 * i4);
        int i6 = (((i5 / 36524) + (i5 - (i5 / 1460))) - (i5 / 146096)) / 365;
        int i7 = (i4 * 400) + i6;
        int i8 = i5 - (((i6 / 4) + (i6 * 365)) - (i6 / 100));
        int i9 = ((i8 * 5) + 2) / 153;
        int i10 = (i8 - (((i9 * 153) + 2) / 5)) + 1;
        int i11 = i9 < 10 ? i9 + 3 : i9 - 9;
        if (i11 <= 2) {
            i7++;
        }
        return new wp(i7, i11, i10);
    }

    public static jm W(int i2) {
        th0 th0Var = th0.k;
        float fT = vs0.t((i2 >> 16) & 255);
        float fT2 = vs0.t((i2 >> 8) & 255);
        float fT3 = vs0.t(i2 & 255);
        double[][] dArr = vs0.g;
        double d2 = fT;
        double[] dArr2 = dArr[0];
        double d3 = fT2;
        double d4 = fT3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = vs0.d;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = th0Var.g;
        float f10 = th0Var.e;
        float f11 = th0Var.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = th0Var.h;
        float fPow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f16 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f17 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * th0Var.c) / f11, th0Var.j * f10)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * th0Var.f) * th0Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, th0Var.a)), 0.7300000190734863d));
        float fSqrt = fPow5 * ((float) Math.sqrt(fPow4 / 100.0f));
        float f23 = th0Var.i * fSqrt;
        Math.sqrt((fPow5 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new jm(f21, fSqrt, fPow4, f24, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static jm X(float f2, float f3, float f4) {
        th0 th0Var = th0.k;
        float f5 = th0Var.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(((double) f2) / 100.0d))) * th0Var.e) / (th0Var.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new jm(f4, f3, f2, f6, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static long Y(Context context, int i2) {
        return ws0.c(context.getResources().getColor(i2, context.getTheme()));
    }

    public static final void a(x50 x50Var, u71 u71Var, ej0 ej0Var, t3 t3Var, String str, ej0 ej0Var2, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        t3 t3Var2;
        ej0 ej0Var3;
        ak0Var.X(1501828832);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ak0Var.f(x50Var) : ak0Var.h(x50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(ej0Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= ak0Var.f(str) ? 16384 : 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= ak0Var.h(gtVar) ? 1048576 : 524288;
        }
        if (ak0Var.O(i5 & 1, (599187 & i5) != 599186)) {
            wi wiVar = q90.f;
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = x4.p;
                ak0Var.g0(objL);
            }
            ej0 ej0Var4 = (ej0) objL;
            ki2 ki2VarE = oi2.e(x50Var, str, ak0Var, (i5 & 14) | ((i5 >> 9) & 112));
            int i6 = i5 & 8176;
            int i7 = i5 >> 3;
            b(ki2VarE, u71Var, ej0Var, wiVar, ej0Var4, gtVar, ak0Var, i6 | (57344 & i7) | (i7 & 458752));
            t3Var2 = wiVar;
            ej0Var3 = ej0Var4;
        } else {
            ak0Var.R();
            t3Var2 = t3Var;
            ej0Var3 = ej0Var2;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new la(x50Var, u71Var, ej0Var, t3Var2, str, ej0Var3, gtVar, i2);
        }
    }

    public static final u71 a0(bz0 bz0Var, ck ckVar, di1 di1Var) {
        return new xy0(bz0Var, ckVar, di1Var);
    }

    public static final void b(ki2 ki2Var, u71 u71Var, ej0 ej0Var, t3 t3Var, ej0 ej0Var2, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ej0 ej0Var3;
        ak0 ak0Var2;
        tu tuVar;
        ab abVar;
        fi2 fi2VarB;
        ak0 ak0Var3;
        ej0 ej0Var4 = ej0Var;
        ak0Var.X(511725103);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(ki2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(ej0Var4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.f(t3Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.h(ej0Var2) ? 16384 : 8192;
        }
        gt gtVar2 = gtVar;
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.h(gtVar2) ? 131072 : 65536;
        }
        if (ak0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (z2 || objL == is1Var) {
                objL = new ab(ki2Var, t3Var);
                ak0Var.g0(objL);
            }
            ab abVar2 = (ab) objL;
            boolean z3 = i4 == 4;
            Object objL2 = ak0Var.L();
            Object obj = objL2;
            if (z3 || objL2 == is1Var) {
                Object[] objArr = {ki2Var.a.f()};
                h72 h72Var = new h72();
                h72Var.addAll(ve.M0(objArr));
                ak0Var.g0(h72Var);
                obj = h72Var;
            }
            h72 h72Var2 = (h72) obj;
            boolean z4 = i4 == 4;
            Object objL3 = ak0Var.L();
            if (z4 || objL3 == is1Var) {
                long[] jArr = jx1.a;
                objL3 = new w91();
                ak0Var.g0(objL3);
            }
            w91 w91Var = (w91) objL3;
            tu tuVar2 = ki2Var.a;
            dk1 dk1Var = ki2Var.d;
            if (!h72Var2.contains(tuVar2.f())) {
                h72Var2.clear();
                h72Var2.add(tuVar2.f());
            }
            if (ws0.j(tuVar2.f(), dk1Var.getValue())) {
                if (h72Var2.size() != 1 || !ws0.j(h72Var2.get(0), tuVar2.f())) {
                    h72Var2.clear();
                    h72Var2.add(tuVar2.f());
                }
                if (w91Var.e != 1 || w91Var.c(tuVar2.f())) {
                    w91Var.a();
                }
                abVar2.b = t3Var;
            }
            if (ws0.j(tuVar2.f(), dk1Var.getValue()) || h72Var2.contains(dk1Var.getValue())) {
                tuVar = tuVar2;
            } else {
                ListIterator listIterator = h72Var2.listIterator();
                int i5 = 0;
                while (true) {
                    tm0 tm0Var = (tm0) listIterator;
                    tuVar = tuVar2;
                    if (!tm0Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else {
                        if (ws0.j(ej0Var2.h(tm0Var.next()), ej0Var2.h(dk1Var.getValue()))) {
                            break;
                        }
                        i5++;
                        tuVar2 = tuVar;
                    }
                }
                if (i5 == -1) {
                    h72Var2.add(dk1Var.getValue());
                } else {
                    h72Var2.set(i5, dk1Var.getValue());
                }
            }
            if (w91Var.c(dk1Var.getValue()) && w91Var.c(tuVar.f())) {
                ak0Var.W(1925931827);
                ak0Var.p(false);
                ej0Var3 = ej0Var4;
            } else {
                ak0Var.W(1966410449);
                w91Var.a();
                int size = h72Var2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = h72Var2.get(i6);
                    w91Var.m(obj2, vs0.C(-23915175, new pa(ki2Var, obj2, ej0Var4, abVar2, h72Var2, gtVar2), ak0Var));
                    i6++;
                    ej0Var4 = ej0Var4;
                    gtVar2 = gtVar;
                }
                ej0Var3 = ej0Var4;
                ak0Var.p(false);
            }
            boolean zF = ak0Var.f(ki2Var.f()) | ak0Var.f(abVar2);
            Object objL4 = ak0Var.L();
            if (zF || objL4 == is1Var) {
                objL4 = (fx) ej0Var3.h(abVar2);
                ak0Var.g0(objL4);
            }
            fx fxVar = (fx) objL4;
            ki2 ki2Var2 = abVar2.a;
            boolean zF2 = ak0Var.f(abVar2);
            Object objL5 = ak0Var.L();
            if (zF2 || objL5 == is1Var) {
                objL5 = y12.s(Boolean.FALSE);
                ak0Var.g0(objL5);
            }
            da1 da1Var = (da1) objL5;
            da1 da1VarT = y12.t(fxVar.d, ak0Var);
            if (ws0.j(ki2Var2.a.f(), ki2Var2.d.getValue())) {
                da1Var.setValue(Boolean.FALSE);
            } else if (da1VarT.getValue() != null) {
                da1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) da1Var.getValue()).booleanValue();
            u71 u71Var2 = r71.a;
            if (zBooleanValue) {
                ak0Var.W(1353077497);
                abVar = abVar2;
                ak0 ak0Var4 = ak0Var;
                fi2VarB = oi2.b(abVar2.a, ir2.c0, null, ak0Var4, 0, 2);
                boolean zF3 = ak0Var4.f(fi2VarB);
                Object objL6 = ak0Var4.L();
                if (zF3 || objL6 == is1Var) {
                    objL6 = nj2.l(u71Var2);
                    ak0Var4.g0(objL6);
                }
                u71Var2 = (u71) objL6;
                ak0Var4.p(false);
                ak0Var3 = ak0Var4;
            } else {
                ak0 ak0Var5 = ak0Var;
                abVar = abVar2;
                ak0Var5.W(1353343539);
                ak0Var5.p(false);
                fi2VarB = null;
                ak0Var3 = ak0Var5;
            }
            u71 u71VarC = u71Var.c(u71Var2.c(new wa(fi2VarB, da1VarT, abVar)));
            Object objL7 = ak0Var3.L();
            if (objL7 == is1Var) {
                objL7 = new ta(abVar);
                ak0Var3.g0(objL7);
            }
            ta taVar = (ta) objL7;
            int iHashCode = Long.hashCode(ak0Var3.T);
            sl1 sl1VarL = ak0Var3.l();
            u71 u71VarB = nj2.B(ak0Var3, u71VarC);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var3.Z();
            if (ak0Var3.S) {
                ak0Var3.k(wvVar);
            } else {
                ak0Var3.j0();
            }
            p12.l(vu.f, ak0Var3, taVar);
            p12.l(vu.e, ak0Var3, sl1VarL);
            p12.f(ak0Var3, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var3, vu.h);
            p12.l(vu.d, ak0Var3, u71VarB);
            ak0Var3.W(-860173498);
            int size2 = h72Var2.size();
            int i7 = 0;
            while (i7 < size2) {
                h72 h72Var3 = h72Var2;
                Object obj3 = h72Var3.get(i7);
                ak0Var3.S(ej0Var2.h(obj3), -2026002954, null, 0);
                ij0 ij0Var = (ij0) w91Var.g(obj3);
                if (ij0Var == null) {
                    ak0Var3.W(1618454323);
                } else {
                    ak0Var3.W(-2026001778);
                    ij0Var.g(ak0Var3, 0);
                }
                ak0Var3.p(false);
                ak0Var3.p(false);
                i7++;
                h72Var2 = h72Var3;
            }
            ak0Var3.p(false);
            ak0Var3.p(true);
            ak0Var2 = ak0Var3;
        } else {
            ej0Var3 = ej0Var4;
            ak0 ak0Var6 = ak0Var;
            ak0Var6.R();
            ak0Var2 = ak0Var6;
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new qa(ki2Var, u71Var, ej0Var3, t3Var, ej0Var2, gtVar, i2);
        }
    }

    public static final u71 b0(u71 u71Var, gj1 gj1Var) {
        return u71Var.c(new jj1(gj1Var));
    }

    public static final void c(mi0 mi0Var, ak0 ak0Var, int i2) {
        ak0 ak0Var2;
        ak0Var.X(-1413379286);
        int i3 = (ak0Var.h(mi0Var) ? 4 : 2) | i2;
        int i4 = 0;
        int i5 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 3) != 2)) {
            ak0Var2 = ak0Var;
            nj2.d(f52.a, null, null, null, vs0.C(414572188, new xm0(mi0Var, i5), ak0Var), ak0Var2, 196614);
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ii0(mi0Var, i2, i4);
        }
    }

    public static final u71 c0(u71 u71Var, float f2) {
        return u71Var.c(new ej1(f2, f2, f2, f2));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void d(ti0 ti0Var, i50 i50Var, gt gtVar, ak0 ak0Var, int i2, int i3) {
        int i4;
        i50 i50Var2;
        int i5;
        boolean z2;
        i50 i50Var3;
        lr1 lr1VarR;
        i50 i50Var4;
        View view;
        m40 m40Var;
        kw0 kw0Var;
        yj0 yj0VarN;
        da1 da1VarT;
        Object objL;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zD;
        Object objL2;
        int i6;
        k50 k50Var;
        boolean zH;
        int i7;
        Object obj3;
        int i8;
        int i9;
        int i10;
        Object obj4;
        int i11;
        ak0Var.X(826668973);
        if ((i2 & 6) == 0) {
            i4 = (ak0Var.h(ti0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                i50Var2 = i50Var;
                i4 |= ak0Var.f(i50Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (ak0Var.h(gtVar)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i4 |= i11;
            }
            i5 = i4;
            if ((i5 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ak0Var.O(i5 & 1, z2)) {
                if (i12 != 0) {
                    i50Var4 = new i50(7);
                } else {
                    i50Var4 = i50Var2;
                }
                view = (View) ak0Var.j(u5.f);
                m40Var = (m40) ak0Var.j(yv.h);
                kw0Var = (kw0) ak0Var.j(yv.n);
                yj0VarN = ws0.N(ak0Var);
                da1VarT = y12.t(gtVar, ak0Var);
                Object[] objArr = new Object[0];
                objL = ak0Var.L();
                obj = cv.a;
                obj2 = objL;
                if (objL == obj) {
                    Object obj5 = t5.l;
                    ak0Var.g0(obj5);
                    obj2 = obj5;
                }
                uuid = (UUID) ex.H(objArr, (ti0) obj2, ak0Var, 48);
                i50Var4.getClass();
                zD = ak0Var.d(2) | ak0Var.f(view) | ak0Var.f(m40Var) | ak0Var.f(null);
                objL2 = ak0Var.L();
                if (!zD || objL2 == obj) {
                    i50Var3 = i50Var4;
                    k50 k50Var2 = new k50(ti0Var, i50Var3, view, kw0Var, m40Var, uuid);
                    i6 = 1;
                    gt gtVar2 = new gt(new q(i6, da1VarT), true, -1338939603);
                    f50 f50Var = k50Var2.l;
                    f50Var.setParentCompositionContext(yj0VarN);
                    f50Var.o.setValue(gtVar2);
                    f50Var.s = true;
                    f50Var.e();
                    ak0Var.g0(k50Var2);
                    objL2 = k50Var2;
                } else {
                    i50Var3 = i50Var4;
                    i6 = 1;
                }
                k50Var = (k50) objL2;
                zH = ak0Var.h(k50Var);
                Object objL3 = ak0Var.L();
                if (!zH || objL3 == obj) {
                    i7 = 0;
                    Object j6Var = new j6(k50Var, i7);
                    ak0Var.g0(j6Var);
                    obj3 = j6Var;
                } else {
                    i7 = 0;
                    obj3 = objL3;
                }
                s5.e(k50Var, (ej0) obj3, ak0Var);
                boolean zH2 = ak0Var.h(k50Var);
                if ((i5 & 14) == 4) {
                    i8 = i6;
                } else {
                    i8 = i7;
                }
                int i13 = (zH2 ? 1 : 0) | i8;
                if ((i5 & 112) == 32) {
                    i9 = i6;
                } else {
                    i9 = i7;
                }
                i10 = i13 | i9 | (ak0Var.d(kw0Var.ordinal()) ? 1 : 0);
                Object objL4 = ak0Var.L();
                obj4 = objL4;
                if (i10 == 0 || objL4 == obj) {
                    Object k6Var = new k6(k50Var, ti0Var, i50Var3, kw0Var);
                    ak0Var.g0(k6Var);
                    obj4 = k6Var;
                }
                s5.v((ti0) obj4, ak0Var);
            } else {
                ak0Var.R();
                i50Var3 = i50Var2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new l6(ti0Var, i50Var3, gtVar, i2, i3);
            }
        }
        i4 |= 48;
        i50Var2 = i50Var;
        if ((i2 & 384) == 0) {
            if (ak0Var.h(gtVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i4 |= i11;
        }
        i5 = i4;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ak0Var.O(i5 & 1, z2)) {
            if (i12 != 0) {
                i50Var4 = new i50(7);
            } else {
                i50Var4 = i50Var2;
            }
            view = (View) ak0Var.j(u5.f);
            m40Var = (m40) ak0Var.j(yv.h);
            kw0Var = (kw0) ak0Var.j(yv.n);
            yj0VarN = ws0.N(ak0Var);
            da1VarT = y12.t(gtVar, ak0Var);
            Object[] objArr2 = new Object[0];
            objL = ak0Var.L();
            obj = cv.a;
            obj2 = objL;
            if (objL == obj) {
                Object obj6 = t5.l;
                ak0Var.g0(obj6);
                obj2 = obj6;
            }
            uuid = (UUID) ex.H(objArr2, (ti0) obj2, ak0Var, 48);
            i50Var4.getClass();
            zD = ak0Var.d(2) | ak0Var.f(view) | ak0Var.f(m40Var) | ak0Var.f(null);
            objL2 = ak0Var.L();
            if (zD) {
                i50Var3 = i50Var4;
                k50 k50Var3 = new k50(ti0Var, i50Var3, view, kw0Var, m40Var, uuid);
                i6 = 1;
                gt gtVar3 = new gt(new q(i6, da1VarT), true, -1338939603);
                f50 f50Var2 = k50Var3.l;
                f50Var2.setParentCompositionContext(yj0VarN);
                f50Var2.o.setValue(gtVar3);
                f50Var2.s = true;
                f50Var2.e();
                ak0Var.g0(k50Var3);
                objL2 = k50Var3;
            } else {
                i50Var3 = i50Var4;
                k50 k50Var4 = new k50(ti0Var, i50Var3, view, kw0Var, m40Var, uuid);
                i6 = 1;
                gt gtVar4 = new gt(new q(i6, da1VarT), true, -1338939603);
                f50 f50Var3 = k50Var4.l;
                f50Var3.setParentCompositionContext(yj0VarN);
                f50Var3.o.setValue(gtVar4);
                f50Var3.s = true;
                f50Var3.e();
                ak0Var.g0(k50Var4);
                objL2 = k50Var4;
            }
            k50Var = (k50) objL2;
            zH = ak0Var.h(k50Var);
            Object objL5 = ak0Var.L();
            if (zH) {
                i7 = 0;
                Object j6Var2 = new j6(k50Var, i7);
                ak0Var.g0(j6Var2);
                obj3 = j6Var2;
            } else {
                i7 = 0;
                Object j6Var3 = new j6(k50Var, i7);
                ak0Var.g0(j6Var3);
                obj3 = j6Var3;
            }
            s5.e(k50Var, (ej0) obj3, ak0Var);
            boolean zH3 = ak0Var.h(k50Var);
            if ((i5 & 14) == 4) {
                i8 = i6;
            } else {
                i8 = i7;
            }
            int i14 = (zH3 ? 1 : 0) | i8;
            if ((i5 & 112) == 32) {
                i9 = i6;
            } else {
                i9 = i7;
            }
            i10 = i14 | i9 | (ak0Var.d(kw0Var.ordinal()) ? 1 : 0);
            Object objL6 = ak0Var.L();
            obj4 = objL6;
            if (i10 == 0) {
                Object k6Var2 = new k6(k50Var, ti0Var, i50Var3, kw0Var);
                ak0Var.g0(k6Var2);
                obj4 = k6Var2;
            } else {
                Object k6Var3 = new k6(k50Var, ti0Var, i50Var3, kw0Var);
                ak0Var.g0(k6Var3);
                obj4 = k6Var3;
            }
            s5.v((ti0) obj4, ak0Var);
        } else {
            ak0Var.R();
            i50Var3 = i50Var2;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new l6(ti0Var, i50Var3, gtVar, i2, i3);
        }
    }

    public static final u71 d0(u71 u71Var, float f2, float f3) {
        return u71Var.c(new ej1(f2, f3, f2, f3));
    }

    public static final void e(u71 u71Var, ij0 ij0Var, ak0 ak0Var, int i2) {
        ak0Var.X(1090521195);
        int i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2 | (ak0Var.h(ij0Var) ? 32 : 16);
        int i4 = 0;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = n6.b;
                ak0Var.g0(objL);
            }
            w61 w61Var = (w61) objL;
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71Var);
            wu.c.getClass();
            wv wvVar = vu.b;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61Var);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.l(vu.g, ak0Var, Integer.valueOf(iHashCode));
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            ij0Var.g(ak0Var, Integer.valueOf((i5 >> 6) & 14));
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new o6(u71Var, ij0Var, i2, i4);
        }
    }

    public static u71 e0(u71 u71Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return d0(u71Var, f2, f3);
    }

    public static final void f(di0 di0Var, ti0 ti0Var, ak0 ak0Var, int i2) {
        ak0Var.X(-1587013254);
        int i3 = (ak0Var.f(di0Var) ? 4 : 2) | i2 | (ak0Var.h(ti0Var) ? 32 : 16);
        int i4 = 0;
        int i5 = 14;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            nj2.c(ti0Var, f52.a, false, null, null, null, vs0.C(383274223, new ji0(i4, di0Var), ak0Var), ak0Var, ((i3 >> 3) & 14) | 100663344);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(di0Var, ti0Var, i2, i5);
        }
    }

    public static u71 f0(u71 u71Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return u71Var.c(new ej1(f2, f3, f4, f5));
    }

    public static final void g(ti0 ti0Var, ij0 ij0Var, ij0 ij0Var2, qi0 qi0Var, ak0 ak0Var, int i2) {
        qi0 qi0Var2;
        qi0 qi0Var3;
        ti0Var.getClass();
        ij0Var.getClass();
        ij0Var2.getClass();
        ak0Var.X(-233789302);
        int i3 = 2;
        int i4 = i2 | (ak0Var.h(ti0Var) ? 4 : 2) | (ak0Var.h(ij0Var) ? 32 : 16) | (ak0Var.h(ij0Var2) ? 256 : 128) | 1024;
        int i5 = 1;
        if (ak0Var.O(i4 & 1, (i4 & 1171) != 1170)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                qi0Var3 = (qi0) p12.r(js1.a(qi0.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
            } else {
                ak0Var.R();
                qi0Var3 = qi0Var;
            }
            ak0Var.q();
            da1 da1VarR = qx.r(qi0Var3.b, ak0Var);
            WeakHashMap weakHashMap = fq2.v;
            ix.f(null, vs0.C(-1718901178, new pd(i3, ti0Var), ak0Var), null, null, vs0.C(-1997578205, new jd(13, ij0Var, da1VarR), ak0Var), 0, 0L, 0L, new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15), vs0.C(-1632102309, new in(i5, da1VarR, ij0Var2), ak0Var), ak0Var, 805330992, 237);
            qi0Var2 = qi0Var3;
        } else {
            ak0Var.R();
            qi0Var2 = qi0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new yh(ti0Var, ij0Var, ij0Var2, qi0Var2, i2);
        }
    }

    public static final p9 g0(ti0 ti0Var, ak0 ak0Var, int i2) {
        View view = (View) ak0Var.j(u5.f);
        boolean zF = ak0Var.f(view);
        Object objL = ak0Var.L();
        Object obj = cv.a;
        if (zF || objL == obj) {
            objL = new p9(view, null, ti0Var);
            ak0Var.g0(objL);
        }
        p9 p9Var = (p9) objL;
        boolean zH = ak0Var.h(p9Var);
        Object objL2 = ak0Var.L();
        if (zH || objL2 == obj) {
            objL2 = new i9(p9Var, 3);
            ak0Var.g0(objL2);
        }
        s5.e(p9Var, (ej0) objL2, ak0Var);
        return p9Var;
    }

    public static final void h(u71 u71Var, float f2, long j2, ak0 ak0Var, final int i2, final int i3) {
        u71 u71Var2;
        int i4;
        final float f3;
        final u71 u71Var3;
        u71 u71Var4;
        float f4;
        ak0Var.X(75144485);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            u71Var2 = u71Var;
        } else if ((i2 & 6) == 0) {
            u71Var2 = u71Var;
            i4 = i2 | (ak0Var.f(u71Var2) ? 4 : 2);
        } else {
            u71Var2 = u71Var;
            i4 = i2;
        }
        long jE = j2;
        int i6 = i4 | 48 | (((i3 & 4) == 0 && ak0Var.e(jE)) ? 256 : 128);
        int i7 = 1;
        if (ak0Var.O(i6 & 1, (i6 & 147) != 146)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                u71Var4 = i5 != 0 ? r71.a : u71Var2;
                f4 = l60.a;
                if ((i3 & 4) != 0) {
                    jE = lr.e(dv1.i, ak0Var);
                    i6 &= -897;
                }
            } else {
                ak0Var.R();
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                }
                u71Var4 = u71Var2;
                f4 = f2;
            }
            ak0Var.q();
            u71 u71VarC = f52.c(u71Var4.c(f52.a), f4);
            boolean z2 = (((i6 & 896) ^ 384) > 256 && ak0Var.e(jE)) || (i6 & 384) == 256;
            Object objL = ak0Var.L();
            if (z2 || objL == cv.a) {
                objL = new m60(f4, i7, jE);
                ak0Var.g0(objL);
            }
            nj2.b(u71VarC, (ej0) objL, ak0Var, 0);
            u71Var3 = u71Var4;
            f3 = f4;
        } else {
            ak0Var.R();
            f3 = f2;
            u71Var3 = u71Var2;
        }
        final long j3 = jE;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: o60
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p61.h(u71Var3, f3, j3, (ak0) obj, ei1.P(i2 | 1), i3);
                    return ll2.a;
                }
            };
        }
    }

    public static final void h0(uy uyVar, Object obj) {
        if (obj == j0) {
            return;
        }
        if (!(obj instanceof mg2)) {
            Object objS = uyVar.s(l0, null);
            objS.getClass();
            ((hg2) objS).a(obj);
            return;
        }
        mg2 mg2Var = (mg2) obj;
        hg2[] hg2VarArr = mg2Var.c;
        int length = hg2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            hg2 hg2Var = hg2VarArr[length];
            hg2Var.getClass();
            hg2Var.a(mg2Var.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final void i(es0 es0Var, ej0 ej0Var, ak0 ak0Var, int i2) {
        es0 es0Var2;
        ej0 ej0Var2;
        ak0 ak0Var2;
        ak0Var.X(1010593376);
        int i3 = (ak0Var.f(es0Var) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 32 : 16);
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            u22 u22Var = es0Var.a;
            r22 r22Var = es0Var.b;
            boolean zE = ak0Var.e(u22Var.a);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zE || objL == is1Var) {
                Integer num = r22Var.c;
                String string = num != null ? num.toString() : null;
                if (string == null) {
                    string = "";
                }
                objL = y12.s(string);
                ak0Var.g0(objL);
            }
            da1 da1Var = (da1) objL;
            boolean zE2 = ak0Var.e(es0Var.a.a);
            Object objL2 = ak0Var.L();
            if (zE2 || objL2 == is1Var) {
                Integer num2 = r22Var.d;
                String string2 = num2 != null ? num2.toString() : null;
                objL2 = y12.s(string2 != null ? string2 : "");
                ak0Var.g0(objL2);
            }
            es0Var2 = es0Var;
            ej0Var2 = ej0Var;
            ak0Var2 = ak0Var;
            nj2.d(f52.a, null, null, null, vs0.C(-1425068754, new kz0((Object) es0Var2, (Object) ej0Var2, da1Var, objL2, 4), ak0Var), ak0Var2, 196614);
        } else {
            es0Var2 = es0Var;
            ej0Var2 = ej0Var;
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(es0Var2, ej0Var2, i2, 21);
        }
    }

    public static int i0(double d2) {
        if (Double.isNaN(d2)) {
            qj.r("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static final void j(ti0 ti0Var, ls0 ls0Var, ak0 ak0Var, int i2) {
        ls0 ls0Var2;
        ls0 ls0Var3;
        ti0Var.getClass();
        ak0Var.X(1977537737);
        int i3 = 2;
        int i4 = i2 | (ak0Var.h(ti0Var) ? 4 : 2) | 16;
        if (ak0Var.O(i4 & 1, (i4 & 19) != 18)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ls0Var3 = (ls0) p12.r(js1.a(ls0.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
            } else {
                ak0Var.R();
                ls0Var3 = ls0Var;
            }
            ak0Var.q();
            ix.f(null, vs0.C(-701099643, new pd(9, ti0Var), ak0Var), null, null, null, 0, 0L, 0L, null, vs0.C(-2104359718, new in(i3, qx.r(ls0Var3.d, ak0Var), ls0Var3), ak0Var), ak0Var, 805306416, 509);
            ls0Var2 = ls0Var3;
        } else {
            ak0Var.R();
            ls0Var2 = ls0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(ti0Var, ls0Var2, i2, 22);
        }
    }

    public static int j0(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        qj.r("Cannot round NaN value.");
        return 0;
    }

    public static kj1 k(int i2) {
        float f2 = (i2 & 1) != 0 ? 0.0f : 8.0f;
        return new kj1(f2, 0.0f, f2, 0.0f);
    }

    public static long k0(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        qj.r("Cannot round NaN value.");
        return 0L;
    }

    public static kj1 l(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new kj1(f2, f3, f4, f5);
    }

    public static final void m(u71 u71Var, tq1 tq1Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        gt gtVar2 = vs0.i;
        ak0Var.X(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(tq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(gtVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.h(gtVar) ? 2048 : 1024;
        }
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                Object dk1Var = new dk1(null, q90.U);
                ak0Var.g0(dk1Var);
                objL = dk1Var;
            }
            xh xhVarT = t(gtVar2, ak0Var, (i3 >> 6) & 14);
            sv.a(tq1Var.a(xhVarT), vs0.C(274270255, new yh(u71Var, (da1) objL, gtVar, xhVarT), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(u71Var, tq1Var, gtVar, i2, 1);
        }
    }

    public static final Object m0(uy uyVar) {
        Object objS = uyVar.s(k0, 0);
        objS.getClass();
        return objS;
    }

    public static final void n(u71 u71Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        int i4 = 0;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            o(u71Var, gtVar, ak0Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q9(u71Var, gtVar, i2, i4);
        }
    }

    public static final Object[] n0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final void o(u71 u71Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(771959668);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(gtVar) ? 256 : 128;
        }
        int i4 = 0;
        int i5 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                dk1 dk1Var = new dk1(null, q90.U);
                ak0Var.g0(dk1Var);
                objL = dk1Var;
            }
            da1 da1Var = (da1) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = new r9(da1Var, i4);
                ak0Var.g0(objL2);
            }
            sv.a(yc2.b.a(g0((ti0) objL2, ak0Var, 0)), vs0.C(-291176396, new p1(u71Var, da1Var, gtVar, i5), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q9(u71Var, gtVar, i2, i5);
        }
    }

    public static final Object[] o0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void p(String str, String str2, u71 u71Var, ak0 ak0Var, int i2) {
        ak0Var.X(-1102934853);
        int i3 = 4;
        int i4 = (ak0Var.f(str) ? 4 : 2) | i2 | (ak0Var.f(str2) ? 32 : 16) | (ak0Var.f(u71Var) ? 256 : 128);
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            nj2.d(u71Var, null, null, null, vs0.C(-671939923, new in(i3, str, str2), ak0Var), ak0Var, ((i4 >> 6) & 14) | 196608);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(str, str2, u71Var, i2, 4);
        }
    }

    public static final Integer p0(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strP = h92.P(sb.toString(), 7);
        if (strP.length() <= 0) {
            strP = null;
        }
        if (strP != null) {
            return o92.A(strP);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void q(mi0 mi0Var, ak0 ak0Var, int i2) {
        int i3;
        ?? r11;
        String strB;
        String str;
        String strB2;
        int i4;
        String strS;
        ak0Var.X(-1424078736);
        int i5 = i2 | (ak0Var.h(mi0Var) ? 4 : 2);
        int i6 = 1;
        if (ak0Var.O(i5 & 1, (i5 & 3) != 2)) {
            wr wrVarA = ur.a(new he(12.0f, new ut(i6)), q90.r, ak0Var, 6);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            r71 r71Var = r71.a;
            u71 u71VarB = nj2.B(ak0Var, r71Var);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, wrVarA);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ra raVar3 = vu.g;
            p12.f(ak0Var, numValueOf, raVar3);
            x4 x4Var = vu.h;
            p12.k(ak0Var, x4Var);
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            he heVar = new he(12.0f, new ut(i6));
            vi viVar = q90.o;
            sv1 sv1VarA = rv1.a(heVar, viVar, ak0Var, 6);
            int iHashCode2 = Long.hashCode(ak0Var.T);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, r71Var);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, sv1VarA);
            p12.l(raVar2, ak0Var, sl1VarL2);
            k3.q(iHashCode2, ak0Var, raVar3, ak0Var, x4Var);
            p12.l(raVar4, ak0Var, u71VarB2);
            String strR = j02.r(R.string.fuel_total_cost, ak0Var);
            String strB3 = f22.b(mi0Var.c, ak0Var);
            uv1 uv1Var = uv1.a;
            p(strR, strB3, uv1Var.a(r71Var, 1.0f), ak0Var, 0);
            p(j02.r(R.string.fuel_total_litres, ak0Var), j02.s(R.string.fuel_litres_value, new Object[]{f22.a(mi0Var.b, ak0Var)}, ak0Var), uv1Var.a(r71Var, 1.0f), ak0Var, 0);
            ak0Var.p(true);
            sv1 sv1VarA2 = rv1.a(new he(12.0f, new ut(1)), viVar, ak0Var, 6);
            int iHashCode3 = Long.hashCode(ak0Var.T);
            sl1 sl1VarL3 = ak0Var.l();
            u71 u71VarB3 = nj2.B(ak0Var, r71Var);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, sv1VarA2);
            p12.l(raVar2, ak0Var, sl1VarL3);
            k3.q(iHashCode3, ak0Var, raVar3, ak0Var, x4Var);
            p12.l(raVar4, ak0Var, u71VarB3);
            String strR2 = j02.r(R.string.fuel_price_per_litre, ak0Var);
            Double d2 = mi0Var.d;
            if (d2 == null) {
                ak0Var.W(440938330);
                r11 = 0;
                ak0Var.p(false);
                strB = null;
            } else {
                r11 = 0;
                ak0Var.W(440938331);
                strB = f22.b(k0(d2.doubleValue()), ak0Var);
                ak0Var.p(false);
            }
            if (strB == null) {
                strB = "—";
                str = strB;
            } else {
                str = "—";
            }
            p(strR2, strB, uv1Var.a(r71Var, 1.0f), ak0Var, r11);
            String strR3 = j02.r(R.string.fuel_cost_per_km, ak0Var);
            Double d3 = mi0Var.h;
            if (d3 == null) {
                ak0Var.W(441175418);
                ak0Var.p(r11);
                strB2 = null;
            } else {
                ak0Var.W(441175419);
                strB2 = f22.b(k0(d3.doubleValue()), ak0Var);
                ak0Var.p(r11);
            }
            if (strB2 == null) {
                strB2 = str;
            }
            p(strR3, strB2, uv1Var.a(r71Var, 1.0f), ak0Var, r11);
            ak0Var.p(true);
            sv1 sv1VarA3 = rv1.a(new he(12.0f, new ut(1)), viVar, ak0Var, 6);
            int iHashCode4 = Long.hashCode(ak0Var.T);
            sl1 sl1VarL4 = ak0Var.l();
            u71 u71VarB4 = nj2.B(ak0Var, r71Var);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, sv1VarA3);
            p12.l(raVar2, ak0Var, sl1VarL4);
            k3.q(iHashCode4, ak0Var, raVar3, ak0Var, x4Var);
            p12.l(raVar4, ak0Var, u71VarB4);
            String strR4 = j02.r(R.string.fuel_distance, ak0Var);
            Integer num = mi0Var.e;
            if (num == null) {
                ak0Var.W(-1501230339);
                i4 = 0;
                ak0Var.p(false);
                strS = null;
            } else {
                i4 = 0;
                ak0Var.W(-1501230338);
                strS = j02.s(R.string.detail_odometer, new Object[]{f22.b(num.intValue(), ak0Var)}, ak0Var);
                ak0Var.p(false);
            }
            if (strS == null) {
                strS = str;
            }
            p(strR4, strS, uv1Var.a(r71Var, 1.0f), ak0Var, i4);
            p(j02.r(R.string.fuel_fill_count, ak0Var), f22.b(mi0Var.a, ak0Var), uv1Var.a(r71Var, 1.0f), ak0Var, i4);
            i3 = 1;
            ak0Var.p(true);
            ak0Var.p(true);
        } else {
            i3 = 1;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ii0(mi0Var, i2, i3);
        }
    }

    public static final fx q0(sb0 sb0Var, kc0 kc0Var) {
        return new fx(sb0Var, kc0Var, 0.0f, new h52(ra.g));
    }

    public static final void r(u71 u71Var, float f2, long j2, ak0 ak0Var, final int i2) {
        ak0Var.X(-1534852205);
        int i3 = i2 | 182;
        int i4 = 0;
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                f2 = l60.a;
                j2 = lr.e(dv1.i, ak0Var);
                u71Var = r71.a;
            } else {
                ak0Var.R();
            }
            ak0Var.q();
            u71 u71VarN = f52.n(u71Var.c(f52.b), f2);
            boolean zE = ak0Var.e(j2);
            Object objL = ak0Var.L();
            if (zE || objL == cv.a) {
                objL = new m60(f2, i4, j2);
                ak0Var.g0(objL);
            }
            nj2.b(u71VarN, (ej0) objL, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        final u71 u71Var2 = u71Var;
        final float f3 = f2;
        final long j3 = j2;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(f3, j3, i2) { // from class: n60
                public final /* synthetic */ float f;
                public final /* synthetic */ long g;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    p61.r(this.e, this.f, this.g, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final boolean r0(Throwable th, ti0 ti0Var) throws IllegalAccessException, InvocationTargetException {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = kt0.a;
        z40 z40Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = pm1.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = cb0.e;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof z40) {
                return false;
            }
        }
        try {
            su suVar = (su) ti0Var.a();
            if (suVar != null) {
                boolean z3 = suVar.b;
                List list = suVar.a;
                if (z3) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((uu) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z2 = true;
                }
            }
            if (z2) {
                suVar.getClass();
                z40Var = new z40(suVar);
            }
        } catch (Throwable th2) {
            z40Var = th2;
        }
        if (z40Var != null) {
            vv.e(th, z40Var);
        }
        return z2;
    }

    public static final u71 s(u71 u71Var, long j2, u32 u32Var) {
        return u71Var.c(new ig(j2, u32Var));
    }

    public static final Object s0(uy uyVar, Object obj) {
        if (obj == null) {
            obj = m0(uyVar);
        }
        if (obj == 0) {
            return j0;
        }
        if (!(obj instanceof Integer)) {
            return ((hg2) obj).c();
        }
        return uyVar.s(m0, new mg2(((Number) obj).intValue(), uyVar));
    }

    public static final xh t(gt gtVar, ak0 ak0Var, int i2) {
        int i3 = 4;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && ak0Var.f(gtVar)) || (i2 & 6) == 4;
        Object objL = ak0Var.L();
        Object obj = cv.a;
        if (z2 || objL == obj) {
            objL = new xh(gtVar);
            ak0Var.g0(objL);
        }
        xh xhVar = (xh) objL;
        boolean zF = ak0Var.f(xhVar);
        Object objL2 = ak0Var.L();
        if (zF || objL2 == obj) {
            objL2 = new m(i3, xhVar);
            ak0Var.g0(objL2);
        }
        s5.e(xhVar, (ej0) objL2, ak0Var);
        return xhVar;
    }

    public static final Object v(b40 b40Var, ti0 ti0Var, tx txVar) {
        Object obj;
        me1 me1VarU;
        Object objA0;
        he1 he1Var;
        if (((t71) b40Var).e.r) {
            t71 t71Var = (t71) b40Var;
            if (!t71Var.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var2 = t71Var.e.i;
            ax0 ax0VarV = qx.V(b40Var);
            loop0: while (true) {
                obj = null;
                if (ax0VarV == null) {
                    break;
                }
                if ((ax0VarV.I.f.h & 524288) != 0) {
                    while (t71Var2 != null) {
                        if ((t71Var2.g & 524288) != 0) {
                            t71 t71VarP = t71Var2;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof bk) {
                                    obj = t71VarP;
                                    break loop0;
                                }
                                if ((t71VarP.g & 524288) != 0 && (t71VarP instanceof c40)) {
                                    int i2 = 0;
                                    for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                        if ((t71Var3.g & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                t71VarP = t71Var3;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var2 = t71Var2.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var2 = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
            }
            bk bkVar = (bk) obj;
            if (bkVar != null && (objA0 = bkVar.a0((me1VarU = qx.U(b40Var)), new v4(2, ti0Var, me1VarU), txVar)) == fz.e) {
                return objA0;
            }
        }
        return ll2.a;
    }

    public static final float w(gj1 gj1Var, kw0 kw0Var) {
        return kw0Var == kw0.e ? gj1Var.b(kw0Var) : gj1Var.a(kw0Var);
    }

    public static final float x(gj1 gj1Var, kw0 kw0Var) {
        return kw0Var == kw0.e ? gj1Var.a(kw0Var) : gj1Var.b(kw0Var);
    }

    public void A(char c2) {
        S(Character.valueOf(c2));
    }

    public void B(double d2) {
        S(Double.valueOf(d2));
    }

    public abstract void C(s12 s12Var, int i2);

    public void D(s12 s12Var, int i2) {
        s12Var.getClass();
        S(Integer.valueOf(i2));
    }

    public void E(float f2) {
        S(Float.valueOf(f2));
    }

    public abstract p61 F(s12 s12Var);

    public p61 G(vp1 vp1Var, int i2) {
        C(vp1Var, i2);
        return F(vp1Var.j(i2));
    }

    public void H(int i2) {
        S(Integer.valueOf(i2));
    }

    public void I(int i2, int i3, s12 s12Var) {
        s12Var.getClass();
        C(s12Var, i2);
        H(i3);
    }

    public void J(long j2) {
        S(Long.valueOf(j2));
    }

    public void K(s12 s12Var, int i2, long j2) {
        s12Var.getClass();
        C(s12Var, i2);
        J(j2);
    }

    public abstract void L();

    public void M(s12 s12Var, int i2, mv0 mv0Var, Object obj) {
        s12Var.getClass();
        C(s12Var, i2);
        if (mv0Var.c().h()) {
            O(mv0Var, obj);
        } else if (obj == null) {
            L();
        } else {
            O(mv0Var, obj);
        }
    }

    public void N(s12 s12Var, int i2, mv0 mv0Var, Object obj) {
        s12Var.getClass();
        mv0Var.getClass();
        C(s12Var, i2);
        O(mv0Var, obj);
    }

    public abstract void O(mv0 mv0Var, Object obj);

    public void P(short s2) {
        S(Short.valueOf(s2));
    }

    public void Q(String str) {
        str.getClass();
        S(str);
    }

    public void R(s12 s12Var, int i2, String str) {
        s12Var.getClass();
        str.getClass();
        C(s12Var, i2);
        Q(str);
    }

    public void S(Object obj) {
        throw new a22("Non-serializable " + js1.a(obj.getClass()) + " is not supported by " + js1.a(getClass()) + " encoder");
    }

    public void T(s12 s12Var) {
        s12Var.getClass();
    }

    public abstract iq1 Z();

    public boolean l0(s12 s12Var) {
        s12Var.getClass();
        return true;
    }

    public p61 u(s12 s12Var) {
        s12Var.getClass();
        return this;
    }

    public void y(boolean z2) {
        S(Boolean.valueOf(z2));
    }

    public void z(byte b2) {
        S(Byte.valueOf(b2));
    }
}

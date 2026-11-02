package defpackage;

import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.window.BackEvent;
import ir.alirezaivaz.mygarage.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ex {
    public static boolean a = false;
    public static Method b;
    public static final /* synthetic */ int c = 0;

    public static final boolean A(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final boolean B(ax0 ax0Var) {
        if (ax0Var.l == null) {
            return false;
        }
        ax0 ax0VarU = ax0Var.u();
        return (ax0VarU != null ? ax0VarU.l : null) == null || ax0Var.J.b;
    }

    public static float C(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float D(im1 im1Var, boolean z, rn0[] rn0VarArr, float f) {
        float f2 = Float.NaN;
        for (rn0 rn0Var : rn0VarArr) {
            float fA = im1Var.a(rn0Var);
            if (Float.isNaN(f2)) {
                f2 = fA;
            } else if (z == (fA > f2)) {
                f2 = fA;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static uy E(sy syVar, ty tyVar) {
        tyVar.getClass();
        return ws0.j(syVar.getKey(), tyVar) ? ab0.e : syVar;
    }

    public static uy F(sy syVar, uy uyVar) {
        uyVar.getClass();
        return uyVar == ab0.e ? syVar : (uy) uyVar.s(new tt(27), syVar);
    }

    public static final void G(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final Object H(Object[] objArr, ti0 ti0Var, ak0 ak0Var, int i) {
        return J(Arrays.copyOf(objArr, objArr.length), p61.D, ti0Var, ak0Var, ((i << 6) & 7168) | 384, 0);
    }

    public static final Object I(Object[] objArr, ww1 ww1Var, ti0 ti0Var, ak0 ak0Var, int i) {
        return J(Arrays.copyOf(objArr, objArr.length), ww1Var, ti0Var, ak0Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object J(Object[] objArr, ww1 ww1Var, ti0 ti0Var, ak0 ak0Var, int i, int i2) {
        Object[] objArr2;
        ww1 ww1Var2;
        final Object obj;
        Object objF;
        long j = ak0Var.T;
        j20.j(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        ww1Var.getClass();
        final gw1 gw1Var = (gw1) ak0Var.j(iw1.a);
        Object objL = ak0Var.L();
        Object obj2 = cv.a;
        if (objL == obj2) {
            Object objC = (gw1Var == null || (objF = gw1Var.f(string)) == null) ? null : ww1Var.c(objF);
            if (objC == null) {
                objC = ti0Var.a();
            }
            objArr2 = objArr;
            ww1Var2 = ww1Var;
            Object dw1Var = new dw1(ww1Var2, gw1Var, string, objC, objArr2);
            ak0Var.g0(dw1Var);
            objL = dw1Var;
        } else {
            objArr2 = objArr;
            ww1Var2 = ww1Var;
        }
        final dw1 dw1Var2 = (dw1) objL;
        Object objA = Arrays.equals(objArr2, dw1Var2.i) ? dw1Var2.h : null;
        if (objA == null) {
            objA = ti0Var.a();
        }
        boolean zH = ak0Var.h(dw1Var2) | ((((i & 112) ^ 48) > 32 && ak0Var.h(ww1Var2)) || (i & 48) == 32) | ak0Var.h(gw1Var) | ak0Var.f(string) | ak0Var.h(objA) | ak0Var.h(objArr2);
        Object objL2 = ak0Var.L();
        if (zH || objL2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objA;
            final ww1 ww1Var3 = ww1Var2;
            Object obj3 = new ti0() { // from class: ts1
                @Override // defpackage.ti0
                public final Object a() {
                    boolean z;
                    dw1 dw1Var3 = dw1Var2;
                    gw1 gw1Var2 = dw1Var3.f;
                    gw1 gw1Var3 = gw1Var;
                    boolean z2 = true;
                    if (gw1Var2 != gw1Var3) {
                        dw1Var3.f = gw1Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = dw1Var3.g;
                    String str2 = string;
                    if (ws0.j(str, str2)) {
                        z2 = z;
                    } else {
                        dw1Var3.g = str2;
                    }
                    dw1Var3.e = ww1Var3;
                    dw1Var3.h = obj;
                    dw1Var3.i = objArr3;
                    ud udVar = dw1Var3.j;
                    if (udVar != null && z2) {
                        udVar.A();
                        dw1Var3.j = null;
                        dw1Var3.b();
                    }
                    return ll2.a;
                }
            };
            ak0Var.g0(obj3);
            objL2 = obj3;
        } else {
            obj = objA;
        }
        s5.v((ti0) objL2, ak0Var);
        return obj;
    }

    public static final wm K(List list, Long l) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j = ((wm) next).a;
            if (l != null && j == l.longValue()) {
                break;
            }
        }
        wm wmVar = (wm) next;
        return wmVar == null ? (wm) vq.R(list) : wmVar;
    }

    public static final void L(om omVar, sx sxVar, boolean z) {
        Object objU = omVar.u();
        Throwable thD = omVar.d(objU);
        Object ut1Var = thD != null ? new ut1(thD) : omVar.g(objU);
        if (!z) {
            sxVar.i(ut1Var);
            return;
        }
        sxVar.getClass();
        p50 p50Var = (p50) sxVar;
        tx txVar = p50Var.i;
        Object obj = p50Var.k;
        uy uyVarF = txVar.f();
        Object objS0 = p61.s0(uyVarF, obj);
        il2 il2VarT = objS0 != p61.j0 ? ix.T(txVar, uyVarF, objS0) : null;
        try {
            txVar.i(ut1Var);
        } finally {
            if (il2VarT == null || il2VarT.k0()) {
                p61.h0(uyVarF, objS0);
            }
        }
    }

    public static final void O(bi1 bi1Var, int i, Object obj) {
        bi1Var.i[(bi1Var.j - bi1Var.e[bi1Var.f - 1].b) + i] = obj;
    }

    public static final void P(bi1 bi1Var, int i, Object obj, int i2, Object obj2) {
        int i3 = bi1Var.j - bi1Var.e[bi1Var.f - 1].b;
        Object[] objArr = bi1Var.i;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static jr0 Q(lr0 lr0Var) {
        lr0Var.getClass();
        return new jr0(lr0Var.e, lr0Var.f, lr0Var.g > 0 ? 2 : -2);
    }

    public static final void R(List list, d8 d8Var) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        Path path = d8Var.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        ll1 ll1Var = list2.isEmpty() ? tk1.c : (ll1) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i < size) {
            ll1 ll1Var2 = (ll1) list2.get(i);
            if (ll1Var2 instanceof tk1) {
                path.close();
                path = path;
                size = size;
                f11 = f11;
                i = i;
                ll1Var2 = ll1Var2;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (ll1Var2 instanceof fl1) {
                    fl1 fl1Var = (fl1) ll1Var2;
                    float f18 = fl1Var.c;
                    f14 += f18;
                    float f19 = fl1Var.d;
                    f15 += f19;
                    path.rMoveTo(f18, f19);
                    path = path;
                    f16 = f14;
                    f17 = f15;
                } else if (ll1Var2 instanceof xk1) {
                    xk1 xk1Var = (xk1) ll1Var2;
                    float f20 = xk1Var.c;
                    float f21 = xk1Var.d;
                    path.moveTo(f20, f21);
                    f15 = f21;
                    f17 = f15;
                    f14 = f20;
                    f16 = f14;
                } else if (ll1Var2 instanceof el1) {
                    el1 el1Var = (el1) ll1Var2;
                    float f22 = el1Var.d;
                    float f23 = el1Var.c;
                    path.rLineTo(f23, f22);
                    f14 += f23;
                    f15 += f22;
                } else if (ll1Var2 instanceof wk1) {
                    wk1 wk1Var = (wk1) ll1Var2;
                    float f24 = wk1Var.d;
                    float f25 = wk1Var.c;
                    path.lineTo(f25, f24);
                    f14 = f25;
                    f15 = f24;
                } else if (ll1Var2 instanceof dl1) {
                    float f26 = ((dl1) ll1Var2).c;
                    path.rLineTo(f26, f11);
                    f14 += f26;
                } else if (ll1Var2 instanceof vk1) {
                    float f27 = ((vk1) ll1Var2).c;
                    path.lineTo(f27, f15);
                    f14 = f27;
                } else if (ll1Var2 instanceof jl1) {
                    float f28 = ((jl1) ll1Var2).c;
                    path.rLineTo(f11, f28);
                    f15 += f28;
                } else if (ll1Var2 instanceof kl1) {
                    float f29 = ((kl1) ll1Var2).c;
                    path.lineTo(f14, f29);
                    f15 = f29;
                } else {
                    if (ll1Var2 instanceof cl1) {
                        cl1 cl1Var = (cl1) ll1Var2;
                        path.rCubicTo(cl1Var.c, cl1Var.d, cl1Var.e, cl1Var.f, cl1Var.g, cl1Var.h);
                        f3 = cl1Var.e + f14;
                        f4 = cl1Var.f + f15;
                        f14 += cl1Var.g;
                        f10 = cl1Var.h;
                    } else {
                        if (ll1Var2 instanceof uk1) {
                            uk1 uk1Var = (uk1) ll1Var2;
                            path.cubicTo(uk1Var.c, uk1Var.d, uk1Var.e, uk1Var.f, uk1Var.g, uk1Var.h);
                            f3 = uk1Var.e;
                            f5 = uk1Var.f;
                            f6 = uk1Var.g;
                            f7 = uk1Var.h;
                        } else if (ll1Var2 instanceof hl1) {
                            if (ll1Var.a) {
                                f8 = f14 - f12;
                                f9 = f15 - f13;
                            } else {
                                f8 = f11;
                                f9 = f8;
                            }
                            hl1 hl1Var = (hl1) ll1Var2;
                            path.rCubicTo(f8, f9, hl1Var.c, hl1Var.d, hl1Var.e, hl1Var.f);
                            f3 = hl1Var.c + f14;
                            f4 = hl1Var.d + f15;
                            f14 += hl1Var.e;
                            f10 = hl1Var.f;
                        } else if (ll1Var2 instanceof zk1) {
                            if (ll1Var.a) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            zk1 zk1Var = (zk1) ll1Var2;
                            path.cubicTo(f14, f15, zk1Var.c, zk1Var.d, zk1Var.e, zk1Var.f);
                            f3 = zk1Var.c;
                            f5 = zk1Var.d;
                            f6 = zk1Var.e;
                            f7 = zk1Var.f;
                        } else if (ll1Var2 instanceof gl1) {
                            gl1 gl1Var = (gl1) ll1Var2;
                            float f30 = gl1Var.f;
                            float f31 = gl1Var.e;
                            float f32 = gl1Var.d;
                            float f33 = gl1Var.c;
                            path.rQuadTo(f33, f32, f31, f30);
                            float f34 = f33 + f14;
                            float f35 = f32 + f15;
                            f14 += f31;
                            f15 += f30;
                            f12 = f34;
                            f13 = f35;
                        } else if (ll1Var2 instanceof yk1) {
                            yk1 yk1Var = (yk1) ll1Var2;
                            float f36 = yk1Var.f;
                            float f37 = yk1Var.e;
                            float f38 = yk1Var.d;
                            f3 = yk1Var.c;
                            path.quadTo(f3, f38, f37, f36);
                            f15 = f36;
                            f14 = f37;
                            f13 = f38;
                            f12 = f3;
                        } else if (ll1Var2 instanceof il1) {
                            if (ll1Var.b) {
                                f = f14 - f12;
                                f2 = f15 - f13;
                            } else {
                                f = f11;
                                f2 = f;
                            }
                            il1 il1Var = (il1) ll1Var2;
                            float f39 = il1Var.d;
                            float f40 = il1Var.c;
                            path.rQuadTo(f, f2, f40, f39);
                            f3 = f + f14;
                            f4 = f2 + f15;
                            f14 += f40;
                            f15 += f39;
                            f13 = f4;
                            f12 = f3;
                        } else if (ll1Var2 instanceof al1) {
                            if (ll1Var.b) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            al1 al1Var = (al1) ll1Var2;
                            float f41 = al1Var.d;
                            float f42 = al1Var.c;
                            path.quadTo(f14, f15, f42, f41);
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            f13 = f15;
                            ll1Var2 = ll1Var2;
                            f15 = f41;
                            f12 = f14;
                            f14 = f42;
                        } else if (ll1Var2 instanceof bl1) {
                            bl1 bl1Var = (bl1) ll1Var2;
                            float f43 = bl1Var.h + f14;
                            float f44 = bl1Var.i + f15;
                            size = size;
                            f11 = 0.0f;
                            path = path;
                            i = i;
                            n(d8Var, f14, f15, f43, f44, bl1Var.c, bl1Var.d, bl1Var.e, bl1Var.f, bl1Var.g);
                            f12 = f43;
                            f14 = f12;
                            f13 = f44;
                            f15 = f13;
                            ll1Var2 = ll1Var2;
                        } else {
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            if (!(ll1Var2 instanceof sk1)) {
                                qj.p();
                                return;
                            }
                            sk1 sk1Var = (sk1) ll1Var2;
                            float f45 = sk1Var.i;
                            float f46 = sk1Var.h;
                            ll1Var2 = ll1Var2;
                            n(d8Var, f14, f15, f46, f45, sk1Var.c, sk1Var.d, sk1Var.e, sk1Var.f, sk1Var.g);
                            f13 = f45;
                            f15 = f13;
                            f12 = f46;
                            f14 = f12;
                        }
                        path = path;
                        f14 = f6;
                        f15 = f7;
                        f13 = f5;
                        f12 = f3;
                    }
                    f15 += f10;
                    f13 = f4;
                    f12 = f3;
                }
                ll1Var2 = ll1Var2;
            }
            i++;
            list2 = list;
            size = size;
            path = path;
            ll1Var = ll1Var2;
            f11 = f11;
        }
    }

    public static lr0 S(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new lr0(i, i2 - 1, 1);
        }
        lr0 lr0Var = lr0.h;
        return lr0.h;
    }

    public static Object T(ij0 ij0Var, Object obj, sx sxVar) {
        ij0Var.getClass();
        uy uyVarF = sxVar.f();
        Object zs0Var = uyVarF == ab0.e ? new zs0(sxVar) : new at0(sxVar, uyVarF);
        nj2.i(2, ij0Var);
        return ij0Var.g(obj, zs0Var);
    }

    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void b(boolean z, ej0 ej0Var, u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        ej0 ej0Var2;
        gt gtVar2;
        u71 u71Var2;
        Object vc0Var;
        int i2;
        boolean z2;
        boolean z3 = z;
        ak0Var.X(1597265892);
        int i3 = i | (ak0Var.g(z3) ? 4 : 2) | 384;
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Object obj = (Configuration) ak0Var.j(u5.a);
            View view = (View) ak0Var.j(u5.f);
            boolean zF = ak0Var.f(obj) | ak0Var.f(view);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zF || objL == is1Var) {
                objL = new ro2(view);
                ak0Var.g0(objL);
            }
            final ro2 ro2Var = (ro2) objL;
            m40 m40Var = (m40) ak0Var.j(yv.h);
            final int iO = m40Var.O(48.0f);
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = y12.s(null);
                ak0Var.g0(objL2);
            }
            final da1 da1Var = (da1) objL2;
            Object objL3 = ak0Var.L();
            if (objL3 == is1Var) {
                objL3 = new ak1(0);
                ak0Var.g0(objL3);
            }
            ak1 ak1Var = (ak1) objL3;
            Object objL4 = ak0Var.L();
            if (objL4 == is1Var) {
                objL4 = new ak1(0);
                ak0Var.g0(objL4);
            }
            final ak1 ak1Var2 = (ak1) objL4;
            Object objL5 = ak0Var.L();
            if (objL5 == is1Var) {
                objL5 = new xf0();
                ak0Var.g0(objL5);
            }
            xf0 xf0Var = (xf0) objL5;
            l72 l72Var = (l72) ak0Var.j(yv.q);
            String strL = r02.l(R.string.m3c_dropdown_menu_expanded, ak0Var);
            String strL2 = r02.l(R.string.m3c_dropdown_menu_collapsed, ak0Var);
            String strL3 = r02.l(R.string.m3c_dropdown_menu_toggle, ak0Var);
            Object objL6 = ak0Var.L();
            if (objL6 == is1Var) {
                objL6 = y12.s(new nc0());
                ak0Var.g0(objL6);
            }
            da1 da1Var2 = (da1) objL6;
            Object objL7 = ak0Var.L();
            if (objL7 == is1Var) {
                objL7 = y12.s(Boolean.FALSE);
                ak0Var.g0(objL7);
            }
            da1 da1Var3 = (da1) objL7;
            int i4 = i3 & 14;
            boolean zF2 = (i4 == 4) | ak0Var.f(ro2Var) | ak0Var.f(m40Var);
            Object objL8 = ak0Var.L();
            if (zF2 || objL8 == is1Var) {
                i2 = i4;
                vc0Var = new vc0(xf0Var, z3, da1Var3, strL, strL2, strL3, l72Var, da1Var2, ej0Var, ak1Var, ak1Var2);
                xf0Var = xf0Var;
                z3 = z3;
                ak0Var.g0(vc0Var);
            } else {
                i2 = i4;
                vc0Var = objL8;
            }
            vc0 vc0Var2 = (vc0) vc0Var;
            boolean zH = ak0Var.h(ro2Var) | ak0Var.d(iO);
            Object objL9 = ak0Var.L();
            if (zH || objL9 == is1Var) {
                objL9 = new vr(ro2Var, iO, da1Var, ak1Var, ak1Var2);
                ak0Var.g0(objL9);
            }
            r71 r71Var = r71.a;
            u71 u71VarZ = j20.z(r71Var, (ej0) objL9);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarZ);
            wu.c.getClass();
            ti0 ti0Var = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            gtVar2 = gtVar;
            gtVar2.d(vc0Var2, ak0Var, 48);
            ak0Var.p(true);
            if (z3) {
                ak0Var.W(209894723);
                boolean zH2 = ak0Var.h(ro2Var) | ak0Var.d(iO);
                Object objL10 = ak0Var.L();
                if (zH2 || objL10 == is1Var) {
                    objL10 = new ti0() { // from class: rc0
                        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
                        @Override // defpackage.ti0
                        public final Object a() {
                            int iJ0;
                            View view2 = ro2Var.a;
                            Rect rect = new Rect();
                            view2.getWindowVisibleDisplayFrame(rect);
                            int i5 = rect.top;
                            int i6 = rect.bottom;
                            jw0 jw0Var = (jw0) da1Var.getValue();
                            yr1 yr1VarE = (jw0Var == null || !jw0Var.A()) ? yr1.e : sv.e(jw0Var.i(0L), ux.M(jw0Var.P()));
                            int i7 = iO;
                            int i8 = i5 + i7;
                            int i9 = i6 - i7;
                            float f = yr1VarE.b;
                            if (f <= i6) {
                                float f2 = yr1VarE.d;
                                if (f2 < i5) {
                                    iJ0 = i9 - i8;
                                } else {
                                    iJ0 = p61.j0(Math.max(f - i8, i9 - f2));
                                }
                            } else {
                                iJ0 = i9 - i8;
                            }
                            ak1Var2.i(Math.max(iJ0, 0));
                            return ll2.a;
                        }
                    };
                    ak0Var.g0(objL10);
                }
                z2 = false;
                ix.c((ti0) objL10, ak0Var, 0);
                ak0Var.p(false);
            } else {
                z2 = false;
                ak0Var.W(210228190);
                ak0Var.p(false);
            }
            int i5 = i2;
            boolean z4 = i5 != 4 ? z2 : true;
            Object objL11 = ak0Var.L();
            if (z4 || objL11 == is1Var) {
                objL11 = new iw(z3, xf0Var, 3);
                ak0Var.g0(objL11);
            }
            s5.v((ti0) objL11, ak0Var);
            Object objL12 = ak0Var.L();
            if (objL12 == is1Var) {
                ej0Var2 = ej0Var;
                objL12 = new q10(ej0Var2, 2);
                ak0Var.g0(objL12);
            } else {
                ej0Var2 = ej0Var;
            }
            j20.b(z3, (ti0) objL12, ak0Var, i5);
            u71Var2 = r71Var;
        } else {
            ej0Var2 = ej0Var;
            gtVar2 = gtVar;
            ak0Var.R();
            u71Var2 = u71Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new sc0(z3, ej0Var2, u71Var2, gtVar2, i);
        }
    }

    public static final rp0 c(mv0 mv0Var, String str) {
        return new rp0(str, new sp0(mv0Var));
    }

    public static final void d(gt gtVar, ak0 ak0Var, int i) {
        ak0Var.X(-709502251);
        if (ak0Var.O(i & 1, (i & 3) != 2)) {
            a90 a90Var = iw1.a;
            gw1 gw1Var = (gw1) ak0Var.j(a90Var);
            fw1 fw1VarD = ux.D(ak0Var);
            Object[] objArr = {gw1Var};
            int i2 = 25;
            ru1 ru1Var = new ru1(4, new vy(6), new d(i2, gw1Var, fw1VarD));
            boolean zH = ak0Var.h(gw1Var) | ak0Var.h(fw1VarD);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new n1(23, gw1Var, fw1VarD);
                ak0Var.g0(objL);
            }
            s01 s01Var = (s01) I(objArr, ru1Var, (ti0) objL, ak0Var, 0);
            sv.a(a90Var.a(s01Var), vs0.C(-412824043, new jd(i2, gtVar, s01Var), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new x7(i, 12, gtVar);
        }
    }

    public static final hd1 e(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new hd1(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static double f(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float g(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int h(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long i(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static final void j(dc1 dc1Var, aq aqVar, gt gtVar) {
        rd1 rd1Var = dc1Var.g;
        rd1Var.getClass();
        dc1Var.i.add(new iu((hu) rd1Var.b(ix.C(hu.class)), aqVar, gtVar).a());
    }

    public static final float k(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final long l(long j, z80 z80Var) {
        long j2;
        int iOrdinal = z80Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                qj.i(z80Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sx m(sx sxVar, sx sxVar2, ij0 ij0Var) {
        ij0Var.getClass();
        if (ij0Var instanceof sh) {
            return ((sh) ij0Var).p(sxVar2, sxVar);
        }
        uy uyVarF = sxVar2.f();
        return uyVarF == ab0.e ? new xs0(sxVar2, sxVar, ij0Var) : new ys0(sxVar2, uyVarF, ij0Var, sxVar);
    }

    public static final void n(d8 d8Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            n(d8Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            d8Var.a.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void o(fo1 fo1Var, jv jvVar, String str) {
        iq1 iq1VarQ = jvVar.q();
        aq aqVar = fo1Var.a;
        iq1VarQ.getClass();
        ir2.E(aqVar, str);
        throw null;
    }

    public static final void p(fo1 fo1Var, p61 p61Var, Object obj) {
        obj.getClass();
        iq1 iq1VarZ = p61Var.Z();
        aq aqVar = fo1Var.a;
        iq1VarZ.getClass();
        aqVar.d(obj);
        aq aqVarA = js1.a(obj.getClass());
        String strC = aqVarA.c();
        if (strC == null) {
            strC = String.valueOf(aqVarA);
        }
        ir2.E(aqVar, strC);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object q(pe0 pe0Var, tx txVar) {
        ef0 ef0Var;
        gs1 gs1Var;
        a e;
        k7 k7Var;
        pa0 pa0Var = s5.J;
        if (txVar instanceof ef0) {
            ef0Var = (ef0) txVar;
            int i = ef0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef0Var.k = i - Integer.MIN_VALUE;
            } else {
                ef0Var = new ef0(txVar);
            }
        } else {
            ef0Var = new ef0(txVar);
        }
        Object obj = ef0Var.j;
        int i2 = ef0Var.k;
        int i3 = 1;
        if (i2 == 0) {
            ix.Q(obj);
            gs1 gs1Var2 = new gs1();
            gs1Var2.e = pa0Var;
            k7 k7Var2 = new k7(i3, gs1Var2);
            try {
                ef0Var.h = gs1Var2;
                ef0Var.i = k7Var2;
                ef0Var.k = 1;
                Object objA = pe0Var.a(k7Var2, ef0Var);
                Object obj2 = fz.e;
                if (objA == obj2) {
                    return obj2;
                }
                gs1Var = gs1Var2;
            } catch (a e2) {
                gs1Var = gs1Var2;
                e = e2;
                k7Var = k7Var2;
                if (e.e != k7Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k7Var = ef0Var.i;
            gs1Var = ef0Var.h;
            try {
                ix.Q(obj);
            } catch (a e3) {
                e = e3;
                if (e.e != k7Var) {
                    throw e;
                }
            }
        }
        Object obj3 = gs1Var.e;
        if (obj3 != pa0Var) {
            return obj3;
        }
        fu1.k("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ij0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [pe0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ij0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public static final Object r(pe0 pe0Var, ij0 ij0Var, tx txVar) {
        ff0 ff0Var;
        ?? r1;
        gs1 gs1Var;
        a e;
        j60 j60Var;
        ?? r2;
        pa0 pa0Var = s5.J;
        if (txVar instanceof ff0) {
            ff0Var = (ff0) txVar;
            int i = ff0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ff0Var.l = i - Integer.MIN_VALUE;
            } else {
                ff0Var = new ff0(txVar);
            }
        } else {
            ff0Var = new ff0(txVar);
        }
        Object obj = ff0Var.k;
        int i2 = ff0Var.l;
        int i3 = 1;
        if (i2 == 0) {
            ix.Q(obj);
            gs1 gs1Var2 = new gs1();
            gs1Var2.e = pa0Var;
            j60 j60Var2 = new j60(i3, (Object) ij0Var, gs1Var2);
            try {
                ff0Var.h = (wa2) ij0Var;
                ff0Var.i = gs1Var2;
                ff0Var.j = j60Var2;
                ff0Var.l = 1;
                Object objA = pe0Var.a(j60Var2, ff0Var);
                fz fzVar = fz.e;
                if (objA == fzVar) {
                    return fzVar;
                }
                r2 = ij0Var;
                gs1Var = gs1Var2;
            } catch (a e2) {
                r1 = ij0Var;
                gs1Var = gs1Var2;
                e = e2;
                j60Var = j60Var2;
                r2 = r1;
                if (e.e != j60Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j60Var = ff0Var.j;
            gs1Var = ff0Var.i;
            r1 = (ij0) ff0Var.h;
            try {
                ix.Q(obj);
                r2 = r1;
            } catch (a e3) {
                e = e3;
                r2 = r1;
                if (e.e != j60Var) {
                    throw e;
                }
            }
        }
        Object obj2 = gs1Var.e;
        if (obj2 != pa0Var) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r2);
    }

    public static final String s(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static sy t(sy syVar, ty tyVar) {
        tyVar.getClass();
        if (ws0.j(syVar.getKey(), tyVar)) {
            return syVar;
        }
        return null;
    }

    public static sx y(sx sxVar) {
        sxVar.getClass();
        tx txVar = sxVar instanceof tx ? (tx) sxVar : null;
        if (txVar == null || (sxVar = txVar.g) != null) {
            return sxVar;
        }
        xy xyVar = (xy) txVar.f().p(q90.A);
        sx p50Var = xyVar != null ? new p50(xyVar, txVar) : txVar;
        txVar.g = p50Var;
        return p50Var;
    }

    public static final boolean z(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public abstract void M(boolean z);

    public abstract void N(boolean z);

    public Object u(int i) {
        ds0 ds0VarB = w().b(i);
        return ds0VarB.c.a().h(Integer.valueOf(i - ds0VarB.a));
    }

    public abstract InputFilter[] v(InputFilter[] inputFilterArr);

    public abstract h7 w();

    public Object x(int i) {
        Object objH;
        ds0 ds0VarB = w().b(i);
        int i2 = i - ds0VarB.a;
        ej0 key = ds0VarB.c.getKey();
        return (key == null || (objH = key.h(Integer.valueOf(i2))) == null) ? new d30(i) : objH;
    }
}

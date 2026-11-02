package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 {
    public oy1 a;
    public v6 b;
    public pd0 c;
    public di1 d;
    public boolean e;
    public e4 f;
    public final ny1 g;
    public final jy1 h;
    public boolean i;
    public int j = 1;
    public xx1 k = hy1.b;
    public final sy1 l = new sy1(this);
    public final tr1 m = new tr1(4, this);

    public uy1(oy1 oy1Var, v6 v6Var, pd0 pd0Var, di1 di1Var, boolean z, e4 e4Var, ny1 ny1Var, jy1 jy1Var) {
        this.a = oy1Var;
        this.b = v6Var;
        this.c = pd0Var;
        this.d = di1Var;
        this.e = z;
        this.f = e4Var;
        this.g = ny1Var;
        this.h = jy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, tx txVar) {
        qy1 qy1Var;
        uy1 uy1Var;
        Throwable th;
        fs1 fs1Var;
        if (txVar instanceof qy1) {
            qy1Var = (qy1) txVar;
            int i = qy1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy1Var.k = i - Integer.MIN_VALUE;
            } else {
                qy1Var = new qy1(this, txVar);
            }
        } else {
            qy1Var = new qy1(this, txVar);
        }
        Object obj = qy1Var.i;
        int i2 = qy1Var.k;
        if (i2 != 0) {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fs1Var = qy1Var.h;
            try {
                ix.Q(obj);
                uy1Var = this;
                uy1Var.i = false;
                return new sm2(fs1Var.e);
            } catch (Throwable th2) {
                th = th2;
                uy1Var = this;
                uy1Var.i = false;
                throw th;
            }
        }
        ix.Q(obj);
        fs1 fs1Var2 = new fs1();
        fs1Var2.e = j;
        this.i = true;
        try {
            ia1 ia1Var = ia1.e;
            uy1Var = this;
            try {
                ry1 ry1Var = new ry1(uy1Var, fs1Var2, j, null);
                qy1Var.h = fs1Var2;
                qy1Var.k = 1;
                Object objF = uy1Var.f(ia1Var, ry1Var, qy1Var);
                fz fzVar = fz.e;
                if (objF == fzVar) {
                    return fzVar;
                }
                fs1Var = fs1Var2;
                uy1Var.i = false;
                return new sm2(fs1Var.e);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                uy1Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            uy1Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object b(long j, boolean z, wa2 wa2Var) {
        int i;
        long jA;
        v6 v6Var;
        fz fzVar;
        Object objR;
        ll2 ll2Var = ll2.a;
        if (z) {
            pd0 pd0Var = this.c;
            yw1 yw1Var = hy1.a;
            if (!(pd0Var instanceof w20)) {
                if (this.d == di1.f) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = sm2.a(j, 0.0f, 0.0f, i);
                ty1 ty1Var = new ty1(this, null);
                v6Var = this.b;
                fzVar = fz.e;
                if (v6Var == null && (this.a.c() || this.a.a())) {
                    Object objB = v6Var.b(jA, ty1Var, wa2Var);
                    if (objB == fzVar) {
                        return objB;
                    }
                } else {
                    ty1 ty1Var2 = new ty1(this, wa2Var);
                    ty1Var2.k = jA;
                    objR = ty1Var2.r(ll2Var);
                    if (objR == fzVar) {
                        return objR;
                    }
                }
            }
        } else {
            if (this.d == di1.f) {
                i = 1;
            } else {
                i = 2;
            }
            jA = sm2.a(j, 0.0f, 0.0f, i);
            ty1 ty1Var3 = new ty1(this, null);
            v6Var = this.b;
            fzVar = fz.e;
            if (v6Var == null) {
                ty1 ty1Var4 = new ty1(this, wa2Var);
                ty1Var4.k = jA;
                objR = ty1Var4.r(ll2Var);
                if (objR == fzVar) {
                    return objR;
                }
            } else {
                ty1 ty1Var5 = new ty1(this, wa2Var);
                ty1Var5.k = jA;
                objR = ty1Var5.r(ll2Var);
                if (objR == fzVar) {
                    return objR;
                }
            }
        }
        return ll2Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01ae A[PHI: r7
  0x01ae: PHI (r7v7 fa1) = (r7v6 fa1), (r7v6 fa1), (r7v9 fa1) binds: [B:97:0x017b, B:99:0x017f, B:113:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a A[PHI: r14
  0x009a: PHI (r14v4 fa1) = (r14v3 fa1), (r14v3 fa1), (r14v6 fa1) binds: [B:27:0x0066, B:29:0x006a, B:43:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    public final long c(xx1 xx1Var, long j, int i) {
        int i2;
        zd1 zd1Var;
        zd1 zd1Var2;
        long j2;
        long jH0;
        si2 si2Var;
        he1 he1Var;
        si2 si2Var2;
        he1 he1Var2;
        zd1 zd1Var3 = (zd1) this.f.e;
        int i3 = 262144;
        fa1 fa1Var = null;
        if (zd1Var3 == null || !zd1Var3.r) {
            i2 = 262144;
            zd1Var = null;
        } else {
            if (!zd1Var3.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = zd1Var3.e.i;
            ax0 ax0VarV = qx.V(zd1Var3);
            loop0: while (true) {
                if (ax0VarV == null) {
                    i2 = i3;
                    si2Var2 = null;
                    break;
                }
                if ((ax0VarV.I.f.h & i3) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & i3) != 0) {
                            fa1 fa1Var2 = null;
                            t71 t71VarP = t71Var;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    si2Var2 = (si2) t71VarP;
                                    i2 = i3;
                                    if (ws0.j(zd1Var3.p(), si2Var2.p()) && zd1.class == si2Var2.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i3;
                                }
                                if ((t71VarP.g & i2) == 0 || !(t71VarP instanceof c40)) {
                                    t71VarP = qx.P(fa1Var2);
                                } else {
                                    int i4 = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & i2) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var2 == null) {
                                                    fa1Var2 = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var2.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var2.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                        t71VarP = qx.P(fa1Var2);
                                    }
                                }
                                i3 = i2;
                            }
                        }
                        t71Var = t71Var.i;
                        i3 = i3;
                    }
                }
                int i5 = i3;
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var2 = ax0VarV.I) == null) ? null : he1Var2.e;
                i3 = i5;
            }
            zd1Var = (zd1) si2Var2;
        }
        long jJ0 = zd1Var != null ? zd1Var.J0(i, j) : 0L;
        long jD = uf1.d(j, jJ0);
        long jE = e(h(xx1Var.a(g(e(this.d == di1.f ? uf1.a(0.0f, 1, jD) : uf1.a(0.0f, 2, jD))))));
        ny1 ny1Var = this.g;
        if (ny1Var.r) {
            ViewTreeObserver viewTreeObserver = ((e5) qx.W(ny1Var)).getViewTreeObserver();
            try {
                Method declaredMethod = e5.V0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    e5.V0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jD2 = uf1.d(jD, jE);
        zd1 zd1Var4 = (zd1) this.f.e;
        if (zd1Var4 == null || !zd1Var4.r) {
            zd1Var2 = null;
        } else {
            if (!zd1Var4.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var3 = zd1Var4.e.i;
            ax0 ax0VarV2 = qx.V(zd1Var4);
            loop3: while (true) {
                if (ax0VarV2 == null) {
                    si2Var = null;
                    break;
                }
                if ((ax0VarV2.I.f.h & i2) != 0) {
                    while (t71Var3 != null) {
                        if ((t71Var3.g & i2) != 0) {
                            t71 t71VarP2 = t71Var3;
                            fa1 fa1Var3 = fa1Var;
                            while (t71VarP2 != null) {
                                if (t71VarP2 instanceof si2) {
                                    si2 si2Var3 = (si2) t71VarP2;
                                    if (ws0.j(zd1Var4.p(), si2Var3.p()) && zd1.class == si2Var3.getClass()) {
                                        si2Var = si2Var3;
                                        break loop3;
                                    }
                                }
                                if ((t71VarP2.g & i2) == 0 || !(t71VarP2 instanceof c40)) {
                                    t71VarP2 = qx.P(fa1Var3);
                                } else {
                                    int i6 = 0;
                                    for (t71 t71Var4 = ((c40) t71VarP2).t; t71Var4 != null; t71Var4 = t71Var4.j) {
                                        if ((t71Var4.g & i2) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                t71VarP2 = t71Var4;
                                            } else {
                                                if (fa1Var3 == null) {
                                                    fa1Var3 = new fa1(new t71[16]);
                                                }
                                                if (t71VarP2 != null) {
                                                    fa1Var3.b(t71VarP2);
                                                    t71VarP2 = null;
                                                }
                                                fa1Var3.b(t71Var4);
                                            }
                                        }
                                    }
                                    if (i6 != 1) {
                                        t71VarP2 = qx.P(fa1Var3);
                                    }
                                }
                            }
                        }
                        t71Var3 = t71Var3.i;
                        fa1Var = null;
                    }
                }
                ax0VarV2 = ax0VarV2.u();
                t71Var3 = (ax0VarV2 == null || (he1Var = ax0VarV2.I) == null) ? null : he1Var.e;
                fa1Var = null;
            }
            zd1Var2 = (zd1) si2Var;
        }
        if (zd1Var2 != null) {
            jH0 = zd1Var2.H0(i, jE, jD2);
            j2 = jE;
        } else {
            j2 = jE;
            jH0 = 0;
        }
        return uf1.e(uf1.e(jJ0, j2), jH0);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? uf1.f(-1.0f, j) : j;
    }

    public final Object f(ia1 ia1Var, ij0 ij0Var, tx txVar) {
        Object objD = this.a.d(ia1Var, new g(20, null, this, ij0Var), txVar);
        return objD == fz.e ? objD : ll2.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == di1.f ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == di1.f) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        di1 di1Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (di1Var == di1.e) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (di1Var == di1.f) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}

package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 {
    public final cl0 a;
    public Outline f;
    public float j;
    public mx k;
    public d8 l;
    public d8 m;
    public boolean n;
    public um o;
    public v7 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public m40 b = nj2.e0;
    public kw0 c = kw0.e;
    public ej0 d = x4.H;
    public final y3 e = new y3(12, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final jp r = new jp();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public al0(cl0 cl0Var) {
        this.a = cl0Var;
        cl0Var.u(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            cl0 cl0Var = this.a;
            if (z || cl0Var.G() > 0.0f) {
                d8 d8Var = this.l;
                if (d8Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = d8Var instanceof d8;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = d8Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = d8Var;
                    if (outline != null) {
                        outline.setAlpha(cl0Var.a());
                        outline2 = outline;
                    }
                    cl0Var.l(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        cl0Var.u(false);
                        cl0Var.q();
                    } else {
                        cl0Var.u(this.w);
                    }
                } else {
                    cl0Var.u(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM = ux.M(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jM = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jM >> 32);
                    int i5 = (int) (jM & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(cl0Var.a());
                    cl0Var.l(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                cl0Var.u(false);
                cl0Var.l(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            jp jpVar = this.r;
            al0 al0Var = (al0) jpVar.b;
            if (al0Var != null) {
                al0Var.q--;
                al0Var.b();
                jpVar.b = null;
            }
            x91 x91Var = (x91) jpVar.d;
            if (x91Var != null) {
                Object[] objArr = x91Var.b;
                long[] jArr = x91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    al0 al0Var2 = (al0) objArr[(i << 3) + i3];
                                    al0Var2.q--;
                                    al0Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                x91Var.b();
            }
            this.a.q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(l80 l80Var) {
        jp jpVar = this.r;
        jpVar.c = (al0) jpVar.b;
        x91 x91Var = (x91) jpVar.d;
        if (x91Var != null && x91Var.h()) {
            x91 x91Var2 = (x91) jpVar.e;
            if (x91Var2 == null) {
                x91 x91Var3 = kx1.a;
                x91Var2 = new x91();
                jpVar.e = x91Var2;
            }
            x91Var2.j(x91Var);
            x91Var.b();
        }
        jpVar.a = true;
        this.d.h(l80Var);
        jpVar.a = false;
        al0 al0Var = (al0) jpVar.c;
        if (al0Var != null) {
            al0Var.q--;
            al0Var.b();
        }
        x91 x91Var4 = (x91) jpVar.e;
        if (x91Var4 == null || !x91Var4.h()) {
            return;
        }
        Object[] objArr = x91Var4.b;
        long[] jArr = x91Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            al0 al0Var2 = (al0) objArr[(i << 3) + i3];
                            al0Var2.q--;
                            al0Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        x91Var4.b();
    }

    public final mx d() {
        mx hi1Var;
        mx mxVar = this.k;
        d8 d8Var = this.l;
        if (mxVar != null) {
            return mxVar;
        }
        if (d8Var != null) {
            gi1 gi1Var = new gi1(d8Var);
            this.k = gi1Var;
            return gi1Var;
        }
        long jM = ux.M(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jM = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            hi1Var = new ii1(ux.i(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            hi1Var = new hi1(new yr1(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = hi1Var;
        return hi1Var;
    }

    public final void e(long j, long j2, float f) {
        if (uf1.b(this.h, j) && d52.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}

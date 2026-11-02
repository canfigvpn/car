package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 extends vo2 implements Runnable, ag1, View.OnAttachStateChangeListener {
    public boolean g;
    public int h;
    public aq2 i;
    public final w91 j;
    public final ak1 k;
    public final p91 l;
    public final h72 m;

    public nq0() {
        super(1);
        w91 w91Var = new w91(9);
        hq2.a.getClass();
        w91Var.m(gq2.b, new wq2("caption bar"));
        w91Var.m(gq2.c, new wq2("display cutout"));
        w91Var.m(gq2.d, new wq2("ime"));
        w91Var.m(gq2.e, new wq2("mandatory system gestures"));
        w91Var.m(gq2.f, new wq2("navigation bars"));
        w91Var.m(gq2.g, new wq2("status bars"));
        w91Var.m(gq2.h, new wq2("system gestures"));
        w91Var.m(gq2.i, new wq2("tappable element"));
        w91Var.m(gq2.j, new wq2("waterfall"));
        this.j = w91Var;
        this.k = new ak1(0);
        this.l = new p91(4);
        this.m = new h72();
    }

    @Override // defpackage.ag1
    public final aq2 a(View view, aq2 aq2Var) {
        if (this.g) {
            this.i = aq2Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return aq2Var;
            }
        } else if (this.h == 0) {
            f(aq2Var);
        }
        return aq2Var;
    }

    @Override // defpackage.vo2
    public final void b(fp2 fp2Var) {
        boolean z = false;
        this.g = false;
        int iD = fp2Var.a.d();
        this.h &= ~iD;
        this.i = null;
        hq2 hq2Var = (hq2) jq2.a.b(iD);
        if (hq2Var != null) {
            Object objG = this.j.g(hq2Var);
            objG.getClass();
            wq2 wq2Var = (wq2) objG;
            wq2Var.c.i(0.0f);
            wq2Var.e.i(1.0f);
            wq2Var.d.i(0L);
            wq2Var.c.i(0.0f);
            wq2Var.b.setValue(Boolean.FALSE);
            wq2Var.j = -1L;
            wq2Var.k = -1L;
            ak1 ak1Var = this.k;
            ak1Var.i(ak1Var.h() + 1);
            synchronized (x62.c) {
                x91 x91Var = x62.j.h;
                if (x91Var != null && x91Var.h()) {
                    z = true;
                }
            }
            if (z) {
                x62.c();
            }
        }
    }

    @Override // defpackage.vo2
    public final void c(fp2 fp2Var) {
        this.g = true;
    }

    @Override // defpackage.vo2
    public final aq2 d(aq2 aq2Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fp2 fp2Var = (fp2) list.get(i);
            hq2 hq2Var = (hq2) jq2.a.b(fp2Var.a.d());
            if (hq2Var != null) {
                Object objG = this.j.g(hq2Var);
                objG.getClass();
                wq2 wq2Var = (wq2) objG;
                if (((Boolean) wq2Var.b.getValue()).booleanValue()) {
                    ep2 ep2Var = fp2Var.a;
                    wq2Var.c.i(ep2Var.c());
                    wq2Var.e.i(ep2Var.a());
                    wq2Var.d.i(ep2Var.b());
                }
            }
        }
        f(aq2Var);
        return aq2Var;
    }

    @Override // defpackage.vo2
    public final ru1 e(fp2 fp2Var, ru1 ru1Var) {
        aq2 aq2Var = this.i;
        boolean z = false;
        this.g = false;
        this.i = null;
        if (fp2Var.a.b() > 0 && aq2Var != null) {
            int iD = fp2Var.a.d();
            this.h |= iD;
            hq2 hq2Var = (hq2) jq2.a.b(iD);
            if (hq2Var != null) {
                Object objG = this.j.g(hq2Var);
                objG.getClass();
                wq2 wq2Var = (wq2) objG;
                kq0 kq0VarH = aq2Var.a.h(iD);
                long j = (((long) kq0VarH.a) << 48) | (((long) kq0VarH.b) << 32) | (((long) kq0VarH.c) << 16) | ((long) kq0VarH.d);
                long j2 = wq2Var.h;
                if (!c22.b(j, j2)) {
                    wq2Var.j = j2;
                    wq2Var.k = j;
                    wq2Var.b.setValue(Boolean.TRUE);
                    ep2 ep2Var = fp2Var.a;
                    wq2Var.c.i(ep2Var.c());
                    wq2Var.e.i(ep2Var.a());
                    wq2Var.d.i(ep2Var.b());
                    ak1 ak1Var = this.k;
                    ak1Var.i(ak1Var.h() + 1);
                    synchronized (x62.c) {
                        x91 x91Var = x62.j.h;
                        if (x91Var != null && x91Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        x62.c();
                        return ru1Var;
                    }
                }
            }
        }
        return ru1Var;
    }

    public final void f(aq2 aq2Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        d91 d91Var = jq2.a;
        int[] iArr2 = d91Var.b;
        Object[] objArr3 = d91Var.c;
        long[] jArr2 = d91Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            hq2 hq2Var = (hq2) objArr3[i6];
                            kq0 kq0VarH = aq2Var.a.h(i7);
                            long j3 = (((long) kq0VarH.a) << 48) | (((long) kq0VarH.b) << 32) | (((long) kq0VarH.c) << 16) | ((long) kq0VarH.d);
                            Object objG = this.j.g(hq2Var);
                            objG.getClass();
                            wq2 wq2Var = (wq2) objG;
                            if (!c22.b(j3, wq2Var.h)) {
                                wq2Var.h = j3;
                                z2 = true;
                                if (!c22.b(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                kq0 kq0VarI = aq2Var.a.i(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) kq0VarI.b) << 32) | (((long) kq0VarI.a) << 48) | (((long) kq0VarI.c) << 16) | ((long) kq0VarI.d);
                                if (!c22.b(wq2Var.i, j4)) {
                                    wq2Var.i = j4;
                                    z2 = true;
                                    if (!c22.b(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            wq2Var.a.setValue(Boolean.valueOf(aq2Var.a.t(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        w50 w50VarG = aq2Var.a.g();
        if (w50VarG == null) {
            j = 0;
        } else {
            kq0 kq0VarA = w50VarG.a();
            j = (((long) kq0VarA.a) << c3) | (((long) kq0VarA.b) << c2) | (((long) kq0VarA.c) << c) | ((long) kq0VarA.d);
        }
        w91 w91Var = this.j;
        hq2.a.getClass();
        Object objG2 = w91Var.g(gq2.j);
        objG2.getClass();
        wq2 wq2Var2 = (wq2) objG2;
        wq2Var2.a.setValue(Boolean.valueOf(!c22.b(j, 0L)));
        if (!c22.b(wq2Var2.h, j)) {
            wq2Var2.h = j;
            wq2Var2.i = j;
            z2 = z;
            if (!c22.b(j, 0L)) {
                z3 = z2;
            }
        }
        if (w50VarG == null) {
            p91 p91Var = this.l;
            if (p91Var.b > 0) {
                p91Var.d();
                this.m.clear();
                z2 = z;
            }
        } else {
            List listC = Build.VERSION.SDK_INT >= 28 ? v50.c(w50VarG.a) : Collections.EMPTY_LIST;
            int size = listC.size();
            p91 p91Var2 = this.l;
            if (size < p91Var2.b) {
                p91Var2.l(listC.size(), this.l.b);
                this.m.c(listC.size(), this.m.size());
                z2 = z;
            } else {
                int size2 = listC.size() - this.l.b;
                int i8 = 0;
                while (i8 < size2) {
                    p91 p91Var3 = this.l;
                    p91Var3.a(y12.s(listC.get(p91Var3.b)));
                    this.m.add(new cq0("display cutout rect " + this.l.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listC.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listC.get(i9);
                da1 da1Var = (da1) this.l.f(i9);
                if (!ws0.j(da1Var.getValue(), rect)) {
                    da1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listC.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.k.h() != 0) && z2) {
            ak1 ak1Var = this.k;
            ak1Var.i(ak1Var.h() + 1);
            synchronized (x62.c) {
                x91 x91Var = x62.j.h;
                z4 = (x91Var == null || x91Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                x62.c();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = ln2.a;
        fn2.b(view, this);
        fp2.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = ln2.a;
        fn2.b(view, null);
        fp2.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.h = 0;
            this.g = false;
            aq2 aq2Var = this.i;
            if (aq2Var != null) {
                f(aq2Var);
                this.i = null;
            }
        }
    }
}

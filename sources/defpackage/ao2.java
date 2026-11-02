package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ao2 implements ad, xo1, xf1, be, zt1 {
    public static final iq1 g = new iq1(27);
    public final /* synthetic */ int e;
    public Object f;

    public ao2(int i, byte b) {
        this.e = i;
        switch (i) {
            case 14:
                this.f = new p72(j20.w);
                break;
            case 15:
                this.f = new ConcurrentHashMap(16);
                break;
            case 26:
                t51 t51Var = new t51();
                this.f = t51Var;
                if (!t51Var.f) {
                    if (t51Var.g) {
                        dp1.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    t51Var.a();
                    t51Var.g = true;
                    break;
                }
                break;
            case 27:
                this.f = new CopyOnWriteArrayList();
                new HashMap();
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f = new l1(this);
                } else {
                    this.f = new m1(this);
                }
                break;
        }
    }

    public static sz0 u(ao2 ao2Var, int i) {
        q01 q01Var = (q01) ao2Var.f;
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            k01 k01Var = (k01) q01Var.f.getValue();
            return q01Var.p.a(i, k01Var.j, q01Var.d, new o01(i, k01Var));
        } finally {
            c12.s(o62VarJ, o62VarP, ej0VarE);
        }
    }

    @Override // defpackage.xo1
    public long a(mr0 mr0Var, long j, kw0 kw0Var, long j2) {
        long j3 = ((ir0) ((ti0) this.f).a()).a;
        int iK = mx.k(mr0Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), kw0Var == kw0.e);
        return (((long) mx.k(mr0Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iK) << 32);
    }

    @Override // defpackage.be
    public Object c(xx1 xx1Var, Float f, Float f2, ej0 ej0Var, i62 i62Var) {
        Object objD = r02.d(xx1Var, f.floatValue(), j20.a(0.0f, f2.floatValue(), 28), (l20) this.f, ej0Var, i62Var);
        return objD == fz.e ? objD : (kb) objD;
    }

    public void f(ax0 ax0Var) {
        if (!ax0Var.H()) {
            vp0.b("DepthSortedSet.add called on an unattached node");
        }
        ((p72) this.f).add(ax0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void h(so soVar, tx txVar) {
        kf1 kf1Var;
        if (txVar instanceof kf1) {
            kf1Var = (kf1) txVar;
            int i = kf1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                kf1Var.j = i - Integer.MIN_VALUE;
            } else {
                kf1Var = new kf1(this, txVar);
            }
        } else {
            kf1Var = new kf1(this, txVar);
        }
        Object obj = kf1Var.h;
        int i2 = kf1Var.j;
        if (i2 == 0) {
            ix.Q(obj);
            s82 s82Var = (s82) this.f;
            kf1Var.j = 1;
            s82Var.a(soVar, kf1Var);
            return;
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
        } else {
            ix.Q(obj);
            qj.e();
        }
    }

    public k1 i(int i) {
        return null;
    }

    public void j() {
        ((lv) this.f).getClass();
    }

    public k1 k(int i) {
        return null;
    }

    public p82 l() {
        ca0 ca0VarA = ca0.a();
        if (ca0VarA.c() == 1) {
            return new po0(true);
        }
        dk1 dk1VarS = y12.s(Boolean.FALSE);
        ca0VarA.h(new z20(dk1VarS, this));
        return dk1VarS;
    }

    public KeyListener m(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof ma0)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new ma0(keyListener);
    }

    @Override // defpackage.xf1
    public int n(int i) {
        g20 g20Var = (g20) this.f;
        if (i <= g20Var.f - 1) {
            return i;
        }
        if (i <= g20Var.g - 1) {
            return i - 1;
        }
        int i2 = g20Var.h;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    public void o(float f, float f2, float f3, float f4) {
        ud udVar = (ud) this.f;
        sm smVarG = udVar.g();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (udVar.m() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (udVar.m() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            up0.a("Width and height must be greater than or equal to zero");
        }
        udVar.z(jFloatToRawIntBits);
        smVarG.f(f, f2);
    }

    public boolean p(int i, int i2, Bundle bundle) {
        return false;
    }

    public boolean q(ax0 ax0Var) {
        if (!ax0Var.H()) {
            vp0.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((p72) this.f).remove(ax0Var);
    }

    @Override // defpackage.xf1
    public int r(int i) {
        g20 g20Var = (g20) this.f;
        if (i < g20Var.f) {
            return i;
        }
        if (i < g20Var.g) {
            return i + 1;
        }
        int i2 = g20Var.h;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    public void s(float f, float f2, long j) {
        sm smVarG = ((ud) this.f).g();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        smVarG.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        smVarG.b(f, f2);
        smVarG.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public ArrayList t(int i) {
        ArrayList arrayList = new ArrayList();
        ry0 ry0Var = (ry0) this.f;
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            gy0 gy0Var = ry0Var.b ? ry0Var.c : (gy0) ry0Var.e.getValue();
            if (gy0Var != null) {
                es1 es1Var = new es1();
                es1Var.e = 1;
                List list = (List) gy0Var.k.h(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    qj1 qj1Var = (qj1) list.get(i2);
                    tz0 tz0Var = ry0Var.o;
                    int iIntValue = ((Number) qj1Var.e).intValue();
                    long j = ((sw) qj1Var.f).a;
                    ru1 ru1Var = ry0.w;
                    es1Var = es1Var;
                    arrayList.add(tz0Var.a(iIntValue, j, false, new dy((ArrayList) null, es1Var, list, i, gy0Var)));
                }
            }
            return arrayList;
        } finally {
            c12.s(o62VarJ, o62VarP, ej0VarE);
        }
    }

    public String toString() {
        switch (this.e) {
            case 14:
                return ((p72) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void v(boolean z) {
        va0 va0Var = (va0) ((dq0) ((ao2) this.f).f).g;
        if (va0Var.g != z) {
            if (va0Var.f != null) {
                ca0 ca0VarA = ca0.a();
                ua0 ua0Var = va0Var.f;
                ca0VarA.getClass();
                mx.q(ua0Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = ca0VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ca0VarA.b.remove(ua0Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            va0Var.g = z;
            if (z) {
                va0.a(va0Var.e, ca0.a().c());
            }
        }
    }

    public void w(float f, float f2) {
        ((ud) this.f).g().f(f, f2);
    }

    @Override // defpackage.ad
    public void b(int i) {
    }

    @Override // defpackage.ad
    public void d(int i) {
    }

    public /* synthetic */ ao2(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.ad
    public void e(int i, float f) {
    }

    public ao2(oc ocVar, int i) {
        this.e = i;
        switch (i) {
            case 18:
                this.f = new dq0(ocVar);
                break;
            default:
                this.f = new ao2(ocVar, 18);
                break;
        }
    }

    public ao2(bo2 bo2Var, yn2 yn2Var, lz lzVar) {
        this.e = 0;
        bo2Var.getClass();
        yn2Var.getClass();
        lzVar.getClass();
        this.f = new e4(bo2Var, yn2Var, lzVar);
    }

    public ao2(dd ddVar) {
        this.e = 19;
        this.f = new ta0(ddVar);
    }

    public /* synthetic */ ao2(int i, char c) {
        this.e = i;
    }

    public ao2(zz zzVar, yz yzVar) {
        this.e = 9;
        this.f = zzVar;
    }

    public ao2(int i) {
        this.e = 29;
        this.f = j20.f(new int[i]);
    }

    public ao2(BottomSheetBehavior bottomSheetBehavior) {
        this.e = 5;
        this.f = bottomSheetBehavior;
        new b5(1, this);
    }

    public void g(int i, k1 k1Var, String str, Bundle bundle) {
    }
}

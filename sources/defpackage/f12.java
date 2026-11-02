package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class f12 {
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final /* synthetic */ AtomicIntegerFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    public final int e;
    private volatile /* synthetic */ long enqIdx$volatile;
    public final ji0 f;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = we.a;
        k = unsafe.objectFieldOffset(f12.class.getDeclaredField("head$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(f12.class, "deqIdx$volatile");
        l = unsafe.objectFieldOffset(f12.class.getDeclaredField("tail$volatile"));
        h = AtomicLongFieldUpdater.newUpdater(f12.class, "enqIdx$volatile");
        i = AtomicIntegerFieldUpdater.newUpdater(f12.class, "_availablePermits$volatile");
        j = unsafe.objectFieldOffset(f12.class.getDeclaredField("_availablePermits$volatile"));
    }

    public f12(int i2) {
        this.e = i2;
        if (i2 <= 0) {
            qj.f(k3.i("Semaphore should have at least 1 permit, but had ", i2));
            throw null;
        }
        if (i2 < 0) {
            qj.f(k3.i("The number of acquired permits should be in 0..", i2));
            throw null;
        }
        i12 i12Var = new i12(0L, null, 2);
        this.head$volatile = i12Var;
        this.tail$volatile = i12Var;
        this._availablePermits$volatile = i2;
        this.f = new ji0(11, this);
    }

    public final boolean a(jo2 jo2Var) {
        Object objS;
        Unsafe unsafe;
        f12 f12Var = this;
        Unsafe unsafe2 = we.a;
        long j2 = l;
        i12 i12Var = (i12) unsafe2.getObjectVolatile(f12Var, j2);
        long andIncrement = h.getAndIncrement(f12Var);
        d12 d12Var = d12.l;
        long j3 = andIncrement / ((long) h12.f);
        loop0: while (true) {
            objS = ws0.s(i12Var, j3, d12Var);
            if (vv.C(objS)) {
                break;
            }
            gz1 gz1VarW = vv.w(objS);
            while (true) {
                gz1 gz1Var = (gz1) we.a.getObjectVolatile(f12Var, j2);
                if (gz1Var.d >= gz1VarW.d) {
                    f12Var = this;
                    break loop0;
                }
                if (!gz1VarW.i()) {
                    break;
                }
                do {
                    unsafe = we.a;
                    f12Var = this;
                    if (unsafe.compareAndSwapObject(f12Var, l, gz1Var, gz1VarW)) {
                        if (!gz1Var.e()) {
                            break loop0;
                        }
                        gz1Var.d();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(f12Var, j2) == gz1Var);
                if (gz1VarW.e()) {
                    gz1VarW.d();
                }
            }
            f12Var = this;
        }
        i12 i12Var2 = (i12) vv.w(objS);
        AtomicReferenceArray atomicReferenceArray = i12Var2.g;
        int i2 = (int) (andIncrement % ((long) h12.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, jo2Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                pa0 pa0Var = h12.b;
                pa0 pa0Var2 = h12.c;
                while (!atomicReferenceArray.compareAndSet(i2, pa0Var, pa0Var2)) {
                    if (atomicReferenceArray.get(i2) != pa0Var) {
                        return false;
                    }
                }
                ((nm) jo2Var).m(ll2.a, f12Var.f);
                return true;
            }
        }
        jo2Var.a(i12Var2, i2);
        return true;
    }

    public final void c() {
        Unsafe unsafe;
        long j2;
        int intVolatile;
        int i2;
        Object objS;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = i.getAndIncrement(this);
            int i3 = this.e;
            if (andIncrement >= i3) {
                do {
                    unsafe = we.a;
                    j2 = j;
                    intVolatile = unsafe.getIntVolatile(this, j2);
                    i2 = this.e;
                    if (intVolatile <= i2) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j2, intVolatile, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = we.a;
            long j3 = k;
            i12 i12Var = (i12) unsafe3.getObjectVolatile(this, j3);
            long andIncrement2 = g.getAndIncrement(this);
            long j4 = andIncrement2 / ((long) h12.f);
            e12 e12Var = e12.l;
            while (true) {
                objS = ws0.s(i12Var, j4, e12Var);
                if (!vv.C(objS)) {
                    gz1 gz1VarW = vv.w(objS);
                    while (true) {
                        gz1 gz1Var = (gz1) we.a.getObjectVolatile(this, j3);
                        if (gz1Var.d >= gz1VarW.d) {
                            break;
                        }
                        if (!gz1VarW.i()) {
                            break;
                        }
                        do {
                            unsafe2 = we.a;
                            if (unsafe2.compareAndSwapObject(this, k, gz1Var, gz1VarW)) {
                                if (!gz1Var.e()) {
                                    break;
                                }
                                gz1Var.d();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j3) == gz1Var);
                        if (gz1VarW.e()) {
                            gz1VarW.d();
                        }
                    }
                } else {
                    break;
                }
            }
            i12 i12Var2 = (i12) vv.w(objS);
            AtomicReferenceArray atomicReferenceArray = i12Var2.g;
            i12Var2.a();
            z = false;
            if (i12Var2.d <= j4) {
                int i4 = (int) (andIncrement2 % ((long) h12.f));
                Object andSet = atomicReferenceArray.getAndSet(i4, h12.b);
                if (andSet == null) {
                    int i5 = h12.a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            pa0 pa0Var = h12.b;
                            pa0 pa0Var2 = h12.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, pa0Var, pa0Var2)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == pa0Var);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == h12.c) {
                            z = true;
                            break;
                        }
                        i6++;
                    }
                } else if (andSet != h12.e) {
                    if (!(andSet instanceof nm)) {
                        qj.i(andSet, "unexpected: ");
                        return;
                    }
                    nm nmVar = (nm) andSet;
                    pa0 pa0VarN = nmVar.n(ll2.a, this.f);
                    if (pa0VarN != null) {
                        nmVar.y(pa0VarN);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}

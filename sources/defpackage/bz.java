package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bz extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(bz.class, "workerCtl$volatile");
    public static final /* synthetic */ long n = we.a.objectFieldOffset(bz.class.getDeclaredField("workerCtl$volatile"));
    public final xq2 e;
    public final gs1 f;
    public cz g;
    public long h;
    public long i;
    private volatile int indexInArray;
    public int j;
    public boolean k;
    public final /* synthetic */ dz l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public bz(dz dzVar, int i) {
        this.l = dzVar;
        setDaemon(true);
        setContextClassLoader(dz.class.getClassLoader());
        this.e = new xq2();
        this.f = new gs1();
        this.g = cz.h;
        this.nextParkedWorker = dz.o;
        int iNanoTime = (int) System.nanoTime();
        this.j = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final dc2 a(boolean z) {
        dc2 dc2VarE;
        dc2 dc2VarE2;
        long j;
        Unsafe unsafe;
        cz czVar = this.g;
        dz dzVar = this.l;
        dc2 dc2Var = null;
        xq2 xq2Var = this.e;
        cz czVar2 = cz.e;
        if (czVar != czVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = dz.m;
            do {
                j = atomicLongFieldUpdater.get(dzVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    xq2Var.getClass();
                    long j2 = xq2.f;
                    loop1: while (true) {
                        Unsafe unsafe2 = we.a;
                        dc2 dc2Var2 = (dc2) unsafe2.getObjectVolatile(xq2Var, j2);
                        if (dc2Var2 == null || !dc2Var2.f) {
                            int intVolatile = unsafe2.getIntVolatile(xq2Var, xq2.e);
                            int intVolatile2 = unsafe2.getIntVolatile(xq2Var, xq2.g);
                            while (intVolatile != intVolatile2 && we.a.getIntVolatile(xq2Var, xq2.d) != 0) {
                                intVolatile2--;
                                dc2 dc2VarD = xq2Var.d(intVolatile2, true);
                                if (dc2VarD != null) {
                                    dc2Var = dc2VarD;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = we.a;
                            if (unsafe.compareAndSwapObject(xq2Var, xq2.f, dc2Var2, (Object) null)) {
                                dc2Var = dc2Var2;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(xq2Var, j2) == dc2Var2);
                    }
                    if (dc2Var != null) {
                        return dc2Var;
                    }
                    dc2 dc2Var3 = (dc2) dzVar.j.d();
                    return dc2Var3 == null ? i(1) : dc2Var3;
                }
            } while (!dz.m.compareAndSet(dzVar, j, j - 4398046511104L));
            this.g = czVar2;
        }
        if (z) {
            boolean z2 = d(dzVar.e * 2) == 0;
            if (z2 && (dc2VarE2 = e()) != null) {
                return dc2VarE2;
            }
            xq2Var.getClass();
            dc2 dc2VarC = (dc2) we.a.getAndSetObject(xq2Var, xq2.f, (Object) null);
            if (dc2VarC == null) {
                dc2VarC = xq2Var.c();
            }
            if (dc2VarC != null) {
                return dc2VarC;
            }
            if (!z2 && (dc2VarE = e()) != null) {
                return dc2VarE;
            }
        } else {
            dc2 dc2VarE3 = e();
            if (dc2VarE3 != null) {
                return dc2VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.j;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.j = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final dc2 e() {
        int iD = d(2);
        dz dzVar = this.l;
        qk0 qk0Var = dzVar.j;
        qk0 qk0Var2 = dzVar.i;
        if (iD == 0) {
            dc2 dc2Var = (dc2) qk0Var2.d();
            return dc2Var != null ? dc2Var : (dc2) qk0Var.d();
        }
        dc2 dc2Var2 = (dc2) qk0Var.d();
        return dc2Var2 != null ? dc2Var2 : (dc2) qk0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l.h);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(cz czVar) {
        cz czVar2 = this.g;
        boolean z = czVar2 == cz.e;
        if (z) {
            dz.m.addAndGet(this.l, 4398046511104L);
        }
        if (czVar2 != czVar) {
            this.g = czVar;
        }
        return z;
    }

    public final dc2 i(int i) {
        int i2;
        long j;
        dc2 dc2VarC;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = dz.m;
        dz dzVar = this.l;
        int i3 = (int) (atomicLongFieldUpdater.get(dzVar) & 2097151);
        dc2 dc2Var = null;
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            bz bzVar = (bz) dzVar.k.b(iD);
            if (bzVar == null || bzVar == this) {
                i2 = i3;
            } else {
                xq2 xq2Var = bzVar.e;
                if (i != 3) {
                    xq2Var.getClass();
                    Unsafe unsafe2 = we.a;
                    int intVolatile = unsafe2.getIntVolatile(xq2Var, xq2.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(xq2Var, xq2.g);
                    boolean z = i == 1;
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (we.a.getIntVolatile(xq2Var, xq2.d) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            dc2 dc2VarD = xq2Var.d(intVolatile, z);
                            if (dc2VarD != null) {
                                dc2VarC = dc2VarD;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        dc2VarC = dc2Var;
                        break;
                    }
                } else {
                    dc2VarC = xq2Var.c();
                    i2 = i3;
                    j = 0;
                }
                gs1 gs1Var = this.f;
                if (dc2VarC == null) {
                    j2 = -1;
                    long j4 = xq2.f;
                    while (true) {
                        dc2 dc2Var2 = (dc2) we.a.getObjectVolatile(xq2Var, j4);
                        if (dc2Var2 != null) {
                            if (((dc2Var2.f ? 1 : 2) & i) != 0) {
                                fc2.f.getClass();
                                xq2 xq2Var2 = xq2Var;
                                long jNanoTime = System.nanoTime() - dc2Var2.e;
                                long j5 = fc2.b;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = we.a;
                                    if (unsafe.compareAndSwapObject(xq2Var2, xq2.f, dc2Var2, (Object) null)) {
                                        gs1Var.e = dc2Var2;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(xq2Var2, j4) == dc2Var2);
                                xq2Var = xq2Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    gs1Var.e = dc2VarC;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    dc2 dc2Var3 = (dc2) gs1Var.e;
                    gs1Var.e = null;
                    return dc2Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            dc2Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.i = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (dz.n.get(this.l) == 0) {
                    cz czVar = this.g;
                    cz czVar2 = cz.i;
                    if (czVar == czVar2) {
                        break loop0;
                    }
                    dc2 dc2VarA = a(this.k);
                    if (dc2VarA != null) {
                        this.i = 0L;
                        dz dzVar = this.l;
                        this.h = 0L;
                        if (this.g == cz.g) {
                            this.g = cz.f;
                        }
                        if (!dc2VarA.f) {
                            try {
                                dc2VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(cz.f) && !dzVar.n() && !dzVar.k(dz.m.get(dzVar))) {
                            dzVar.n();
                        }
                        try {
                            dc2VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        dz.m.addAndGet(dzVar, -2097152L);
                        if (this.g == czVar2) {
                            break;
                        }
                        this.g = cz.h;
                        break;
                    }
                    this.k = false;
                    if (this.i == 0) {
                        Object obj = this.nextParkedWorker;
                        pa0 pa0Var = dz.o;
                        if (obj != pa0Var) {
                            int i = -1;
                            we.a.putIntVolatile(this, n, -1);
                            while (this.nextParkedWorker != dz.o) {
                                Unsafe unsafe = we.a;
                                long j = n;
                                if (unsafe.getIntVolatile(this, j) != i) {
                                    break;
                                }
                                dz dzVar2 = this.l;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dz.n;
                                if (atomicIntegerFieldUpdater.get(dzVar2) != 0) {
                                    break;
                                }
                                cz czVar3 = this.g;
                                cz czVar4 = cz.i;
                                if (czVar3 == czVar4) {
                                    break;
                                }
                                h(cz.g);
                                Thread.interrupted();
                                if (this.h == 0) {
                                    this.h = System.nanoTime() + this.l.g;
                                }
                                LockSupport.parkNanos(this.l.g);
                                if (System.nanoTime() - this.h >= 0) {
                                    this.h = 0L;
                                    dz dzVar3 = this.l;
                                    synchronized (dzVar3.k) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater.get(dzVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = dz.m;
                                                if (((int) (atomicLongFieldUpdater.get(dzVar3) & 2097151)) > dzVar3.e) {
                                                    if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        f(0);
                                                        dzVar3.j(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(dzVar3) & 2097151);
                                                        if (andDecrement != i2) {
                                                            Object objB = dzVar3.k.b(andDecrement);
                                                            objB.getClass();
                                                            bz bzVar = (bz) objB;
                                                            dzVar3.k.c(i2, bzVar);
                                                            bzVar.f(i2);
                                                            dzVar3.j(bzVar, andDecrement, i2);
                                                        }
                                                        dzVar3.k.c(andDecrement, null);
                                                        this.g = czVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                i = -1;
                            }
                        } else {
                            dz dzVar4 = this.l;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = dz.l;
                            if (this.nextParkedWorker == pa0Var) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(dzVar4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = dzVar4.k.b((int) (j2 & 2097151));
                                    dz dzVar5 = dzVar4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(dzVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i3))) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    dzVar4 = dzVar5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(cz.g);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.i);
                            this.i = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(cz.i);
    }
}

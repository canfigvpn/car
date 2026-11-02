package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dz implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(dz.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(dz.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(dz.class, "_isTerminated$volatile");
    public static final pa0 o = new pa0("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final qk0 i;
    public final qk0 j;
    public final ht1 k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public dz(int i, int i2, long j, String str) {
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = str;
        if (i < 1) {
            fu1.i("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            qj.f(k3.h(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            fu1.i("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            fu1.j("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.i = new qk0();
        this.j = new qk0();
        this.k = new ht1((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void h(dz dzVar, Runnable runnable, int i) {
        dzVar.d(runnable, false, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.k) {
            try {
                if (n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.e) {
                    return 0;
                }
                if (i >= this.f) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.k.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                bz bzVar = new bz(this, i3);
                this.k.c(i3, bzVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                bzVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        dc2 dc2VarA;
        if (n.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            bz bzVar = threadCurrentThread instanceof bz ? (bz) threadCurrentThread : null;
            if (bzVar == null || bzVar.l != this) {
                bzVar = null;
            }
            synchronized (this.k) {
                i = (int) (m.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.k.b(i2);
                    objB.getClass();
                    bz bzVar2 = (bz) objB;
                    if (bzVar2 != bzVar) {
                        while (bzVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(bzVar2);
                            bzVar2.join(10000L);
                        }
                        xq2 xq2Var = bzVar2.e;
                        qk0 qk0Var = this.j;
                        xq2Var.getClass();
                        dc2 dc2Var = (dc2) we.a.getAndSetObject(xq2Var, xq2.f, (Object) null);
                        if (dc2Var != null) {
                            qk0Var.a(dc2Var);
                        }
                        while (true) {
                            dc2 dc2VarC = xq2Var.c();
                            if (dc2VarC == null) {
                                break;
                            } else {
                                qk0Var.a(dc2VarC);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.j.b();
            this.i.b();
            while (true) {
                if (bzVar != null) {
                    dc2VarA = bzVar.a(true);
                    if (dc2VarA == null) {
                        dc2VarA = (dc2) this.i.d();
                        if (dc2VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    dc2VarA = (dc2) this.i.d();
                    if (dc2VarA == null && (dc2VarA = (dc2) this.j.d()) == null) {
                        break;
                    }
                }
                try {
                    dc2VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (bzVar != null) {
                bzVar.h(cz.i);
            }
            l.set(this, 0L);
            m.set(this, 0L);
        }
    }

    public final void d(Runnable runnable, boolean z, boolean z2) {
        dc2 ec2Var;
        cz czVar;
        fc2.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof dc2) {
            ec2Var = (dc2) runnable;
            ec2Var.e = jNanoTime;
            ec2Var.f = z;
        } else {
            ec2Var = new ec2(runnable, jNanoTime, z);
        }
        boolean z3 = ec2Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        bz bzVar = threadCurrentThread instanceof bz ? (bz) threadCurrentThread : null;
        if (bzVar == null || bzVar.l != this) {
            bzVar = null;
        }
        if (bzVar != null && (czVar = bzVar.g) != cz.i && (ec2Var.f || czVar != cz.f)) {
            bzVar.k = true;
            xq2 xq2Var = bzVar.e;
            if (z2) {
                ec2Var = xq2Var.a(ec2Var);
            } else {
                xq2Var.getClass();
                dc2 dc2Var = (dc2) we.a.getAndSetObject(xq2Var, xq2.f, ec2Var);
                ec2Var = dc2Var == null ? null : xq2Var.a(dc2Var);
            }
        }
        if (ec2Var != null) {
            if (!(ec2Var.f ? this.j.a(ec2Var) : this.i.a(ec2Var))) {
                throw new RejectedExecutionException(this.h + " was terminated");
            }
        }
        boolean z4 = z2 && bzVar != null;
        if (z3) {
            if (z4 || n() || k(jAddAndGet)) {
                return;
            }
            n();
            return;
        }
        if (z4 || n() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        n();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, 6);
    }

    public final void j(bz bzVar, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = bzVar.c();
                    while (true) {
                        if (objC == o) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        bz bzVar2 = (bz) objC;
                        int iB = bzVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = bzVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                dz dzVar = this;
                if (atomicLongFieldUpdater.compareAndSet(dzVar, j, j3)) {
                    return;
                } else {
                    this = dzVar;
                }
            }
        }
    }

    public final boolean k(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.e;
        if (i < i2) {
            int iB = b();
            if (iB == 1 && i2 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        dz dzVar;
        pa0 pa0Var;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
            long j = atomicLongFieldUpdater.get(this);
            bz bzVar = (bz) this.k.b((int) (2097151 & j));
            if (bzVar == null) {
                bzVar = null;
                dzVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = bzVar.c();
                while (true) {
                    pa0Var = o;
                    if (objC == pa0Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    bz bzVar2 = (bz) objC;
                    iB = bzVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bzVar2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iB >= 0) {
                    dz dzVar2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(dzVar2, j, j2 | ((long) iB));
                    dzVar = dzVar2;
                    if (zCompareAndSet) {
                        bzVar.g(pa0Var);
                    }
                    this = dzVar;
                } else {
                    continue;
                }
            }
            if (bzVar == null) {
                return false;
            }
            if (bz.m.compareAndSet(bzVar, -1, 0)) {
                LockSupport.unpark(bzVar);
                return true;
            }
            this = dzVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ht1 ht1Var = this.k;
        int iA = ht1Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            bz bzVar = (bz) ht1Var.b(i6);
            if (bzVar != null) {
                xq2 xq2Var = bzVar.e;
                xq2Var.getClass();
                Object objectVolatile = we.a.getObjectVolatile(xq2Var, xq2.f);
                int iB = xq2Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = bzVar.g.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        qj.p();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(j20.s(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.e;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

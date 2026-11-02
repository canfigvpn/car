package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fc0 extends ac0 implements z30 {
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ int n = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = we.a;
        m = unsafe.objectFieldOffset(fc0.class.getDeclaredField("_queue$volatile"));
        k = unsafe.objectFieldOffset(fc0.class.getDeclaredField("_delayed$volatile"));
        l = unsafe.objectFieldOffset(fc0.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        N(runnable);
    }

    @Override // defpackage.ac0
    public final long L() {
        Unsafe unsafe;
        fc0 fc0Var;
        Unsafe unsafe2;
        Runnable runnable;
        dc0 dc0Var;
        pa0 pa0Var = vs0.v;
        long j = m;
        if (!M()) {
            O();
            loop0: while (true) {
                unsafe = we.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    fc0Var = this;
                } else if (objectVolatile instanceof x31) {
                    x31 x31Var = (x31) objectVolatile;
                    Object objD = x31Var.d();
                    if (objD != x31.e) {
                        Runnable runnable2 = (Runnable) objD;
                        fc0Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    x31 x31VarC = x31Var.c();
                    while (true) {
                        Unsafe unsafe3 = we.a;
                        fc0Var = this;
                        if (unsafe3.compareAndSwapObject(fc0Var, m, objectVolatile, x31VarC) || unsafe3.getObjectVolatile(fc0Var, j) != objectVolatile) {
                            break;
                        }
                        this = fc0Var;
                    }
                    this = fc0Var;
                } else {
                    fc0Var = this;
                    if (objectVolatile != pa0Var) {
                        do {
                            unsafe2 = we.a;
                            if (unsafe2.compareAndSwapObject(fc0Var, m, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(fc0Var, j) == objectVolatile);
                        this = fc0Var;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            le leVar = fc0Var.i;
            if (((leVar == null || leVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(fc0Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof x31) {
                        long longVolatile = unsafe2.getLongVolatile((x31) objectVolatile2, x31.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == pa0Var) {
                        return Long.MAX_VALUE;
                    }
                }
                ec0 ec0Var = (ec0) unsafe.getObjectVolatile(fc0Var, k);
                if (ec0Var != null) {
                    synchronized (ec0Var) {
                        dc0[] dc0VarArr = ec0Var.a;
                        dc0Var = dc0VarArr != null ? dc0VarArr[0] : null;
                    }
                    if (dc0Var != null) {
                        long jNanoTime = dc0Var.e - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void N(Runnable runnable) {
        O();
        if (!P(runnable)) {
            t20.o.N(runnable);
            return;
        }
        Thread threadQ = Q();
        if (Thread.currentThread() != threadQ) {
            LockSupport.unpark(threadQ);
        }
    }

    public final void O() {
        dc0 dc0VarC;
        ec0 ec0Var = (ec0) we.a.getObjectVolatile(this, k);
        if (ec0Var == null || ec0Var.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (ec0Var) {
                try {
                    dc0[] dc0VarArr = ec0Var.a;
                    dc0VarC = null;
                    dc0 dc0Var = dc0VarArr != null ? dc0VarArr[0] : null;
                    if (dc0Var != null) {
                        dc0VarC = ((jNanoTime - dc0Var.e) > 0L ? 1 : ((jNanoTime - dc0Var.e) == 0L ? 0 : -1)) >= 0 ? P(dc0Var) : false ? ec0Var.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (dc0VarC != null);
    }

    public final boolean P(Runnable runnable) {
        fc0 fc0Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = we.a;
            long j = m;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, l) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = we.a;
                    fc0 fc0Var2 = this;
                    runnable2 = runnable;
                    fc0Var = fc0Var2;
                    if (unsafe4.compareAndSwapObject(fc0Var2, m, (Object) null, runnable2)) {
                        return true;
                    }
                    if (unsafe4.getObjectVolatile(fc0Var, j) != null) {
                        break;
                    }
                    this = fc0Var;
                    runnable = runnable2;
                }
                this = fc0Var;
                runnable = runnable2;
            } else {
                fc0Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof x31) {
                    x31 x31Var = (x31) objectVolatile;
                    int iA = x31Var.a(runnable2);
                    if (iA == 0) {
                        return true;
                    }
                    if (iA == 1) {
                        x31 x31VarC = x31Var.c();
                        do {
                            unsafe2 = we.a;
                            if (unsafe2.compareAndSwapObject(fc0Var, m, objectVolatile, x31VarC)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(fc0Var, j) == objectVolatile);
                    } else if (iA == 2) {
                        return false;
                    }
                    this = fc0Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == vs0.v) {
                        return false;
                    }
                    x31 x31Var2 = new x31(8, true);
                    x31Var2.a((Runnable) objectVolatile);
                    x31Var2.a(runnable2);
                    do {
                        unsafe = we.a;
                        if (unsafe.compareAndSwapObject(fc0Var, m, objectVolatile, x31Var2)) {
                            return true;
                        }
                    } while (unsafe.getObjectVolatile(fc0Var, j) == objectVolatile);
                    this = fc0Var;
                    runnable = runnable2;
                }
            }
        }
    }

    public abstract Thread Q();

    public final boolean R() {
        le leVar = this.i;
        if (leVar != null ? leVar.isEmpty() : true) {
            Unsafe unsafe = we.a;
            ec0 ec0Var = (ec0) unsafe.getObjectVolatile(this, k);
            if (ec0Var != null && ec0Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, m);
            if (objectVolatile != null) {
                if (objectVolatile instanceof x31) {
                    long longVolatile = unsafe.getLongVolatile((x31) objectVolatile, x31.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == vs0.v) {
                }
            }
            return true;
        }
        return false;
    }

    public void S(long j, dc0 dc0Var) {
        t20.o.T(j, dc0Var);
    }

    public final void T(long j, dc0 dc0Var) {
        fc0 fc0Var;
        int iB;
        Unsafe unsafe;
        Thread threadQ;
        long j2 = k;
        Unsafe unsafe2 = we.a;
        if (unsafe2.getIntVolatile(this, l) != 0) {
            fc0Var = this;
            iB = 1;
        } else {
            ec0 ec0Var = (ec0) unsafe2.getObjectVolatile(this, j2);
            if (ec0Var == null) {
                ec0 ec0Var2 = new ec0();
                ec0Var2.c = j;
                while (true) {
                    unsafe = we.a;
                    fc0Var = this;
                    if (unsafe.compareAndSwapObject(fc0Var, k, (Object) null, ec0Var2) || unsafe.getObjectVolatile(fc0Var, j2) != null) {
                        break;
                    } else {
                        this = fc0Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(fc0Var, j2);
                objectVolatile.getClass();
                ec0Var = (ec0) objectVolatile;
                unsafe2 = unsafe;
            } else {
                fc0Var = this;
            }
            iB = dc0Var.b(j, ec0Var, fc0Var);
        }
        if (iB != 0) {
            if (iB == 1) {
                fc0Var.S(j, dc0Var);
                return;
            } else {
                if (iB == 2) {
                    return;
                }
                fu1.h("unexpected result");
                return;
            }
        }
        ec0 ec0Var3 = (ec0) unsafe2.getObjectVolatile(fc0Var, j2);
        dc0 dc0Var2 = null;
        if (ec0Var3 != null) {
            synchronized (ec0Var3) {
                dc0[] dc0VarArr = ec0Var3.a;
                dc0Var2 = dc0VarArr != null ? dc0VarArr[0] : null;
            }
        }
        if (dc0Var2 != dc0Var || Thread.currentThread() == (threadQ = fc0Var.Q())) {
            return;
        }
        LockSupport.unpark(threadQ);
    }

    @Override // defpackage.z30
    public final void h(long j, om omVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            bc0 bc0Var = new bc0(this, j2 + jNanoTime, omVar);
            T(jNanoTime, bc0Var);
            omVar.z(new km(2, bc0Var));
        }
    }

    @Override // defpackage.z30
    public e60 n(long j, Runnable runnable, uy uyVar) {
        return u20.a.n(j, runnable, uyVar);
    }

    @Override // defpackage.ac0
    public void shutdown() {
        pa0 pa0Var;
        Unsafe unsafe;
        dc0 dc0VarC;
        ig2.a.set(null);
        we.a.putIntVolatile(this, l, 1);
        pa0 pa0Var2 = vs0.v;
        long j = m;
        loop0: while (true) {
            Object objectVolatile = we.a.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = we.a;
                    pa0Var = pa0Var2;
                    if (unsafe2.compareAndSwapObject(this, m, (Object) null, pa0Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        pa0Var2 = pa0Var;
                    }
                }
                pa0Var2 = pa0Var;
            } else {
                pa0Var = pa0Var2;
                if (objectVolatile instanceof x31) {
                    ((x31) objectVolatile).b();
                    break;
                }
                if (objectVolatile == pa0Var) {
                    break;
                }
                x31 x31Var = new x31(8, true);
                x31Var.a((Runnable) objectVolatile);
                do {
                    unsafe = we.a;
                    if (unsafe.compareAndSwapObject(this, m, objectVolatile, x31Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                pa0Var2 = pa0Var;
            }
        }
        while (L() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            ec0 ec0Var = (ec0) we.a.getObjectVolatile(this, k);
            if (ec0Var == null) {
                return;
            }
            synchronized (ec0Var) {
                dc0VarC = ec0Var.b() > 0 ? ec0Var.c(0) : null;
            }
            if (dc0VarC == null) {
                return;
            } else {
                S(jNanoTime, dc0VarC);
            }
        }
    }
}

package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 extends fc0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final t20 o;
    public static final long p;

    static {
        Long l;
        t20 t20Var = new t20();
        o = t20Var;
        t20Var.K(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        p = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.fc0
    public final void N(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.N(runnable);
    }

    @Override // defpackage.fc0
    public final Thread Q() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.fc0
    public final void S(long j, dc0 dc0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void U() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = we.a;
            unsafe.putObjectVolatile(this, fc0.m, (Object) null);
            unsafe.putObjectVolatile(this, fc0.k, (Object) null);
            notifyAll();
        }
    }

    @Override // defpackage.fc0, defpackage.z30
    public final e60 n(long j, Runnable runnable, uy uyVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return te1.e;
        }
        long jNanoTime = System.nanoTime();
        cc0 cc0Var = new cc0(j2 + jNanoTime, runnable);
        T(jNanoTime, cc0Var);
        return cc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig2.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    U();
                    if (R()) {
                        return;
                    }
                    Q();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jL = L();
                    if (jL == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = p + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            U();
                            if (R()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        if (jL > j2) {
                            jL = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jL > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            U();
                            if (R()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        LockSupport.parkNanos(this, jL);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            U();
            if (!R()) {
                Q();
            }
            throw th;
        }
    }

    @Override // defpackage.fc0, defpackage.ac0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.xy
    public final String toString() {
        return "DefaultExecutor";
    }
}

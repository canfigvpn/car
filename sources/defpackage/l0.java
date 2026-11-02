package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 implements Future {
    public static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger i = Logger.getLogger(l0.class.getName());
    public static final s5 j;
    public static final Object k;
    public volatile Object e;
    public volatile h0 f;
    public volatile k0 g;

    static {
        s5 j0Var;
        try {
            j0Var = new i0(AtomicReferenceFieldUpdater.newUpdater(k0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k0.class, k0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l0.class, k0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(l0.class, h0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "e"));
            th = null;
        } catch (Throwable th) {
            th = th;
            j0Var = new j0();
        }
        j = j0Var;
        if (th != null) {
            i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        k = new Object();
    }

    public static void b(l0 l0Var) {
        k0 k0Var;
        h0 h0Var;
        do {
            k0Var = l0Var.g;
        } while (!j.z(l0Var, k0Var, k0.c));
        while (k0Var != null) {
            Thread thread = k0Var.a;
            if (thread != null) {
                k0Var.a = null;
                LockSupport.unpark(thread);
            }
            k0Var = k0Var.b;
        }
        do {
            h0Var = l0Var.f;
        } while (!j.x(l0Var, h0Var));
        h0 h0Var2 = null;
        while (h0Var != null) {
            h0 h0Var3 = h0Var.a;
            h0Var.a = h0Var2;
            h0Var2 = h0Var;
            h0Var = h0Var3;
        }
        while (h0Var2 != null) {
            h0Var2 = h0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                i.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof f0) {
            Throwable th = ((f0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof g0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    public static Object d(l0 l0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = l0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        f0 f0Var;
        Object obj = this.e;
        if (obj != null) {
            return false;
        }
        if (h) {
            f0Var = new f0(new CancellationException("Future.cancel() was called."), z);
        } else {
            f0Var = z ? f0.b : f0.c;
        }
        if (!j.y(this, obj, f0Var)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(k0 k0Var) {
        k0Var.a = null;
        while (true) {
            k0 k0Var2 = this.g;
            if (k0Var2 == k0.c) {
                return;
            }
            k0 k0Var3 = null;
            while (k0Var2 != null) {
                k0 k0Var4 = k0Var2.b;
                if (k0Var2.a != null) {
                    k0Var3 = k0Var2;
                } else if (k0Var3 != null) {
                    k0Var3.b = k0Var4;
                    if (k0Var3.a == null) {
                    }
                } else if (!j.z(this, k0Var2, k0Var4)) {
                }
                k0Var2 = k0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        k0 k0Var = k0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.e;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k0 k0Var2 = this.g;
            if (k0Var2 != k0Var) {
                k0 k0Var3 = new k0();
                while (true) {
                    s5 s5Var = j;
                    s5Var.L(k0Var3, k0Var2);
                    if (s5Var.z(this, k0Var2, k0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(k0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.e;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(k0Var3);
                        break;
                    }
                    k0Var2 = this.g;
                    if (k0Var2 == k0Var) {
                    }
                }
            }
            return c(this.e);
        }
        while (nanos > 0) {
            Object obj3 = this.e;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(k3.j(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e instanceof f0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.e instanceof f0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        k0 k0Var = k0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if (obj2 != null) {
                return c(obj2);
            }
            k0 k0Var2 = this.g;
            if (k0Var2 != k0Var) {
                k0 k0Var3 = new k0();
                do {
                    s5 s5Var = j;
                    s5Var.L(k0Var3, k0Var2);
                    if (s5Var.z(this, k0Var2, k0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                e(k0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    k0Var2 = this.g;
                } while (k0Var2 != k0Var);
            }
            return c(this.e);
        }
        throw new InterruptedException();
    }
}

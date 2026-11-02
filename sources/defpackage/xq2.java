package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xq2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = we.a;
        f = unsafe.objectFieldOffset(xq2.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(xq2.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(xq2.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(xq2.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(xq2.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(xq2.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final dc2 a(dc2 dc2Var) {
        if (b() == 127) {
            return dc2Var;
        }
        if (dc2Var.f) {
            c.incrementAndGet(this);
        }
        int intVolatile = we.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, dc2Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return we.a.getIntVolatile(this, g) - we.a.getIntVolatile(this, e);
    }

    public final dc2 c() {
        dc2 dc2Var;
        while (true) {
            Unsafe unsafe = we.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            xq2 xq2Var = this;
            if (unsafe.compareAndSwapInt(xq2Var, j, intVolatile, intVolatile + 1) && (dc2Var = (dc2) xq2Var.a.getAndSet(i, null)) != null) {
                if (dc2Var.f) {
                    c.decrementAndGet(xq2Var);
                }
                return dc2Var;
            }
            this = xq2Var;
        }
    }

    public final dc2 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        dc2 dc2Var = (dc2) atomicReferenceArray.get(i2);
        if (dc2Var != null && dc2Var.f == z) {
            while (!atomicReferenceArray.compareAndSet(i2, dc2Var, null)) {
                if (atomicReferenceArray.get(i2) != dc2Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return dc2Var;
        }
        return null;
    }
}

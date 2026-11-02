package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i21 extends xy implements z30 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(i21.class, "runningWorkers$volatile");
    public static final /* synthetic */ long m = we.a.objectFieldOffset(i21.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ z30 g;
    public final xy h;
    public final int i;
    public final v31 j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i21(xy xyVar, int i) {
        z30 z30Var = xyVar instanceof z30 ? (z30) xyVar : null;
        this.g = z30Var == null ? u20.a : z30Var;
        this.h = xyVar;
        this.i = i;
        this.j = new v31();
        this.k = new Object();
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        Runnable runnableI;
        this.j.a(runnable);
        if (we.a.getIntVolatile(this, m) >= this.i || !J() || (runnableI = I()) == null) {
            return;
        }
        this.h.E(this, new hm(this, runnableI));
    }

    @Override // defpackage.xy
    public final void F(uy uyVar, Runnable runnable) {
        Runnable runnableI;
        this.j.a(runnable);
        if (we.a.getIntVolatile(this, m) >= this.i || !J() || (runnableI = I()) == null) {
            return;
        }
        this.h.F(this, new hm(this, runnableI));
    }

    public final Runnable I() {
        while (true) {
            Runnable runnable = (Runnable) this.j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean J() {
        synchronized (this.k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
            if (we.a.getIntVolatile(this, m) >= this.i) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.z30
    public final void h(long j, om omVar) {
        this.g.h(j, omVar);
    }

    @Override // defpackage.z30
    public final e60 n(long j, Runnable runnable, uy uyVar) {
        return this.g.n(j, runnable, uyVar);
    }

    @Override // defpackage.xy
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append(".limitedParallelism(");
        return k3.l(sb, this.i, ')');
    }
}

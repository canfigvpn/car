package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends s5 {
    public final AtomicReferenceFieldUpdater V;
    public final AtomicReferenceFieldUpdater W;
    public final AtomicReferenceFieldUpdater X;
    public final AtomicReferenceFieldUpdater Y;
    public final AtomicReferenceFieldUpdater Z;

    public i0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.V = atomicReferenceFieldUpdater;
        this.W = atomicReferenceFieldUpdater2;
        this.X = atomicReferenceFieldUpdater3;
        this.Y = atomicReferenceFieldUpdater4;
        this.Z = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.s5
    public final void L(k0 k0Var, k0 k0Var2) {
        this.W.lazySet(k0Var, k0Var2);
    }

    @Override // defpackage.s5
    public final void M(k0 k0Var, Thread thread) {
        this.V.lazySet(k0Var, thread);
    }

    @Override // defpackage.s5
    public final boolean x(l0 l0Var, h0 h0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.Y;
            if (atomicReferenceFieldUpdater.compareAndSet(l0Var, h0Var, h0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l0Var) == h0Var);
        return false;
    }

    @Override // defpackage.s5
    public final boolean y(l0 l0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.Z;
            if (atomicReferenceFieldUpdater.compareAndSet(l0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l0Var) == obj);
        return false;
    }

    @Override // defpackage.s5
    public final boolean z(l0 l0Var, k0 k0Var, k0 k0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.X;
            if (atomicReferenceFieldUpdater.compareAndSet(l0Var, k0Var, k0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l0Var) == k0Var);
        return false;
    }
}

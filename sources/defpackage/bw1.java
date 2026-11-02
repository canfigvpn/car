package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bw1 implements sx, gz {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(bw1.class, Object.class, "result");
    public final sx e;
    private volatile Object result;

    public bw1(sx sxVar) {
        fz fzVar = fz.e;
        this.e = sxVar;
        this.result = fzVar;
    }

    @Override // defpackage.gz
    public final gz e() {
        sx sxVar = this.e;
        if (sxVar instanceof gz) {
            return (gz) sxVar;
        }
        return null;
    }

    @Override // defpackage.sx
    public final uy f() {
        return this.e.f();
    }

    @Override // defpackage.sx
    public final void i(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        while (true) {
            Object obj2 = this.result;
            fz fzVar = fz.f;
            if (obj2 == fzVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, fzVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != fzVar) {
                    }
                }
                return;
            }
            fz fzVar2 = fz.e;
            if (obj2 != fzVar2) {
                fu1.h("Already resumed");
                return;
            }
            fz fzVar3 = fz.g;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, fzVar2, fzVar3)) {
                    this.e.i(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == fzVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.e;
    }
}

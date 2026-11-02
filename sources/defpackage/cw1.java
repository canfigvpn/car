package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 implements rx0, Serializable {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(cw1.class, Object.class, "f");
    public volatile ti0 e;
    public volatile Object f;

    @Override // defpackage.rx0
    public final Object getValue() {
        Object obj = this.f;
        is1 is1Var = is1.t;
        if (obj != is1Var) {
            return obj;
        }
        ti0 ti0Var = this.e;
        if (ti0Var != null) {
            Object objA = ti0Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, is1Var, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != is1Var) {
                }
            }
            this.e = null;
            return objA;
        }
        return this.f;
    }

    public final String toString() {
        return this.f != is1.t ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

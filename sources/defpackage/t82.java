package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t82 extends o0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.o0
    public final boolean a(n0 n0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(j20.Q);
        return true;
    }

    @Override // defpackage.o0
    public final sx[] b(n0 n0Var) {
        this.a.set(null);
        return j20.a;
    }
}

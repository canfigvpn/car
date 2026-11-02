package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 {
    public final AtomicReference a = new AtomicReference(null);
    public final ta1 b = new ta1();

    public final void a(la1 la1Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            la1 la1Var2 = (la1) atomicReference.get();
            if (la1Var2 != null && la1Var.a.compareTo(la1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(la1Var2, la1Var)) {
                    if (la1Var2 != null) {
                        la1Var2.b.d(new td0("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == la1Var2);
        }
    }
}

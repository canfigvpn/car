package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qw implements m12 {
    public final AtomicReference a;

    public qw(m12 m12Var) {
        this.a = new AtomicReference(m12Var);
    }

    @Override // defpackage.m12
    public final Iterator iterator() {
        m12 m12Var = (m12) this.a.getAndSet(null);
        if (m12Var != null) {
            return m12Var.iterator();
        }
        fu1.h("This sequence can be consumed only once.");
        return null;
    }
}

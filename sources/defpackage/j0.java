package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends s5 {
    @Override // defpackage.s5
    public final void L(k0 k0Var, k0 k0Var2) {
        k0Var.b = k0Var2;
    }

    @Override // defpackage.s5
    public final void M(k0 k0Var, Thread thread) {
        k0Var.a = thread;
    }

    @Override // defpackage.s5
    public final boolean x(l0 l0Var, h0 h0Var) {
        h0 h0Var2 = h0.b;
        synchronized (l0Var) {
            try {
                if (l0Var.f != h0Var) {
                    return false;
                }
                l0Var.f = h0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s5
    public final boolean y(l0 l0Var, Object obj, Object obj2) {
        synchronized (l0Var) {
            try {
                if (l0Var.e != obj) {
                    return false;
                }
                l0Var.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s5
    public final boolean z(l0 l0Var, k0 k0Var, k0 k0Var2) {
        synchronized (l0Var) {
            try {
                if (l0Var.g != k0Var) {
                    return false;
                }
                l0Var.g = k0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

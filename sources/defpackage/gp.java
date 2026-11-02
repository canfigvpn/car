package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends rt0 {
    public final om i;

    public gp(om omVar) {
        this.i = omVar;
    }

    @Override // defpackage.rt0
    public final boolean m() {
        return true;
    }

    @Override // defpackage.rt0
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        vt0 vt0VarL = l();
        om omVar = this.i;
        Throwable thS = omVar.s(vt0VarL);
        if (omVar.A()) {
            p50 p50Var = (p50) omVar.h;
            long j = p50.l;
            loop0: while (true) {
                Object objectVolatile = we.a.getObjectVolatile(p50Var, j);
                pa0 pa0Var = ws0.q;
                if (ws0.j(objectVolatile, pa0Var)) {
                    do {
                        unsafe = we.a;
                        if (unsafe.compareAndSwapObject(p50Var, p50.l, pa0Var, thS)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(p50Var, j) == pa0Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = we.a;
                        if (unsafe2.compareAndSwapObject(p50Var, p50.l, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(p50Var, j) == objectVolatile);
                }
            }
        }
        omVar.o(thS);
        if (omVar.A()) {
            return;
        }
        omVar.q();
    }
}

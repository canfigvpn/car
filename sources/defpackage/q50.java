package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q50 extends mx1 {
    public static final /* synthetic */ long i = we.a.objectFieldOffset(q50.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.mx1, defpackage.vt0
    public final void x(Object obj) {
        z(obj);
    }

    @Override // defpackage.mx1, defpackage.vt0
    public final void z(Object obj) {
        while (true) {
            Unsafe unsafe = we.a;
            long j = i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    ws0.O(ex.y(this.h), j20.A(obj));
                    return;
                } else {
                    fu1.h("Already resumed");
                    return;
                }
            }
            q50 q50Var = this;
            if (unsafe.compareAndSwapInt(q50Var, j, 0, 2)) {
                return;
            } else {
                this = q50Var;
            }
        }
    }
}

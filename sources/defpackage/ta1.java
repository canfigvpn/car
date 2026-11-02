package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends f12 implements ra1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ta1.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long n = we.a.objectFieldOffset(ta1.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public ta1() {
        super(1);
        this.owner$volatile = nj2.u0;
    }

    @Override // defpackage.ra1
    public final void b(Object obj) {
        while (this.e()) {
            Unsafe unsafe = we.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            pa0 pa0Var = nj2.u0;
            if (objectVolatile != pa0Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    ta1 ta1Var = this;
                    if (we.a.compareAndSwapObject(ta1Var, n, objectVolatile, pa0Var)) {
                        ta1Var.c();
                        return;
                    } else {
                        if (we.a.getObjectVolatile(ta1Var, j) != objectVolatile) {
                            this = ta1Var;
                            break;
                        }
                        this = ta1Var;
                    }
                }
            }
        }
        fu1.h("This mutex is not locked");
    }

    @Override // defpackage.ra1
    public final Object d(tx txVar) {
        boolean zF = f();
        ll2 ll2Var = ll2.a;
        if (!zF) {
            om omVarW = dv1.w(ex.y(txVar));
            try {
                sa1 sa1Var = new sa1(this, omVarW);
                while (true) {
                    int andDecrement = f12.i.getAndDecrement(this);
                    if (andDecrement <= this.e) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                            ta1 ta1Var = sa1Var.f;
                            atomicReferenceFieldUpdater.set(ta1Var, null);
                            om omVar = sa1Var.e;
                            omVar.E(ll2Var, omVar.g, new ji0(3, new m(21, ta1Var, sa1Var)));
                            break;
                        }
                        if (a(sa1Var)) {
                            break;
                        }
                    }
                }
                Object objT = omVarW.t();
                fz fzVar = fz.e;
                if (objT != fzVar) {
                    objT = ll2Var;
                }
                if (objT == fzVar) {
                    return objT;
                }
            } catch (Throwable th) {
                omVarW.D();
                throw th;
            }
        }
        return ll2Var;
    }

    public final boolean e() {
        return Math.max(we.a.getIntVolatile(this, f12.j), 0) == 0;
    }

    public final boolean f() {
        ta1 ta1Var;
        while (true) {
            Unsafe unsafe = we.a;
            long j = f12.j;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.e) {
                while (true) {
                    Unsafe unsafe2 = we.a;
                    long j2 = f12.j;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.e;
                    if (intVolatile2 <= i) {
                        ta1Var = this;
                        break;
                    }
                    ta1 ta1Var2 = this;
                    ta1Var = ta1Var2;
                    if (unsafe2.compareAndSwapInt(ta1Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = ta1Var;
                }
            } else {
                ta1Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(ta1Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(ta1Var, n, (Object) null);
                    return true;
                }
            }
            this = ta1Var;
        }
    }

    public final String toString() {
        return "Mutex@" + j20.s(this) + "[isLocked=" + e() + ",owner=" + we.a.getObjectVolatile(this, n) + ']';
    }
}

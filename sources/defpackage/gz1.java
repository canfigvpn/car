package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gz1 extends dw implements ve1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(gz1.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = we.a.objectFieldOffset(gz1.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public gz1(long j, gz1 gz1Var, int i) {
        super(gz1Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.dw
    public final boolean c() {
        return we.a.getIntVolatile(this, f) == f() && b() != null;
    }

    public final boolean e() {
        return e.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, uy uyVar);

    public final void h() {
        if (e.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        while (true) {
            Unsafe unsafe = we.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.f() && this.b() != null) {
                return false;
            }
            gz1 gz1Var = this;
            if (unsafe.compareAndSwapInt(gz1Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = gz1Var;
        }
    }
}

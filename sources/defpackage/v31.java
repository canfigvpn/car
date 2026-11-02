package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class v31 {
    public static final /* synthetic */ long a = we.a.objectFieldOffset(v31.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new x31(8, false);

    public final boolean a(Runnable runnable) {
        v31 v31Var;
        while (true) {
            Unsafe unsafe = we.a;
            long j = a;
            x31 x31Var = (x31) unsafe.getObjectVolatile(this, j);
            int iA = x31Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                x31 x31VarC = x31Var.c();
                while (true) {
                    Unsafe unsafe2 = we.a;
                    v31Var = this;
                    if (unsafe2.compareAndSwapObject(v31Var, a, x31Var, x31VarC) || unsafe2.getObjectVolatile(v31Var, j) != x31Var) {
                        break;
                    }
                    this = v31Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                v31Var = this;
            }
            this = v31Var;
        }
    }

    public final void b() {
        v31 v31Var;
        while (true) {
            Unsafe unsafe = we.a;
            long j = a;
            x31 x31Var = (x31) unsafe.getObjectVolatile(this, j);
            if (x31Var.b()) {
                return;
            }
            x31 x31VarC = x31Var.c();
            while (true) {
                v31Var = this;
                if (we.a.compareAndSwapObject(v31Var, a, x31Var, x31VarC) || we.a.getObjectVolatile(v31Var, j) != x31Var) {
                    break;
                } else {
                    this = v31Var;
                }
            }
            this = v31Var;
        }
    }

    public final int c() {
        x31 x31Var = (x31) we.a.getObjectVolatile(this, a);
        x31Var.getClass();
        long longVolatile = we.a.getLongVolatile(x31Var, x31.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        v31 v31Var;
        while (true) {
            Unsafe unsafe = we.a;
            long j = a;
            x31 x31Var = (x31) unsafe.getObjectVolatile(this, j);
            Object objD = x31Var.d();
            if (objD != x31.e) {
                return objD;
            }
            x31 x31VarC = x31Var.c();
            while (true) {
                v31Var = this;
                if (we.a.compareAndSwapObject(v31Var, a, x31Var, x31VarC) || we.a.getObjectVolatile(v31Var, j) != x31Var) {
                    break;
                }
                this = v31Var;
            }
            this = v31Var;
        }
    }
}

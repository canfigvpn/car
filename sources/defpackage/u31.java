package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u31 {
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = we.a;
        e = unsafe.objectFieldOffset(u31.class.getDeclaredField("_next$volatile"));
        f = unsafe.objectFieldOffset(u31.class.getDeclaredField("_prev$volatile"));
        g = unsafe.objectFieldOffset(u31.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean e(u31 u31Var, int i) {
        u31 u31Var2;
        u31 u31Var3;
        while (true) {
            u31 u31VarJ = this.j();
            if (u31VarJ instanceof a31) {
                return (((a31) u31VarJ).h & i) == 0 && u31VarJ.e(u31Var, i);
            }
            Unsafe unsafe = we.a;
            unsafe.putObjectVolatile(u31Var, f, u31VarJ);
            long j = e;
            unsafe.putObjectVolatile(u31Var, j, this);
            while (true) {
                Unsafe unsafe2 = we.a;
                u31Var2 = this;
                u31Var3 = u31Var;
                if (unsafe2.compareAndSwapObject(u31VarJ, e, u31Var2, u31Var3)) {
                    u31Var3.g(u31Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(u31VarJ, j) != u31Var2) {
                    break;
                }
                this = u31Var2;
                u31Var = u31Var3;
            }
            this = u31Var2;
            u31Var = u31Var3;
        }
    }

    public final u31 f() {
        while (true) {
            Unsafe unsafe = we.a;
            long j = f;
            u31 u31Var = (u31) unsafe.getObjectVolatile(this, j);
            u31 u31Var2 = null;
            u31 u31Var3 = u31Var;
            while (true) {
                if (u31Var3 == null) {
                    fu1.c();
                    return null;
                }
                Unsafe unsafe2 = we.a;
                long j2 = e;
                Object objectVolatile = unsafe2.getObjectVolatile(u31Var3, j2);
                if (objectVolatile == this) {
                    if (u31Var != u31Var3) {
                        while (true) {
                            Unsafe unsafe3 = we.a;
                            u31 u31Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(u31Var4, f, u31Var, u31Var3);
                            u31 u31Var5 = u31Var;
                            this = u31Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != u31Var5) {
                                    break;
                                }
                                this = this;
                                u31Var = u31Var5;
                            }
                        }
                    }
                    return u31Var3;
                }
                u31Var = u31Var;
                this = this;
                if (this.k()) {
                    return null;
                }
                if (!(objectVolatile instanceof ws1)) {
                    objectVolatile.getClass();
                    u31Var2 = u31Var3;
                    u31Var3 = (u31) objectVolatile;
                } else if (u31Var2 != null) {
                    u31 u31Var6 = ((ws1) objectVolatile).a;
                    while (true) {
                        u31 u31Var7 = u31Var3;
                        Unsafe unsafe4 = we.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(u31Var2, e, u31Var7, u31Var6);
                        u31Var3 = u31Var7;
                        if (zCompareAndSwapObject2) {
                            u31Var3 = u31Var2;
                            u31Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(u31Var2, j2) != u31Var3) {
                            break;
                        }
                    }
                } else {
                    if (u31Var3 == null) {
                        fu1.c();
                        return null;
                    }
                    u31Var3 = (u31) unsafe2.getObjectVolatile(u31Var3, j);
                }
            }
            this = this;
        }
    }

    public final void g(u31 u31Var) {
        u31 u31Var2;
        while (true) {
            Unsafe unsafe = we.a;
            long j = f;
            u31 u31Var3 = (u31) unsafe.getObjectVolatile(u31Var, j);
            if (this.h() != u31Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = we.a;
                u31Var2 = this;
                u31 u31Var4 = u31Var;
                if (unsafe2.compareAndSwapObject(u31Var4, f, u31Var3, u31Var2)) {
                    if (u31Var2.k()) {
                        u31Var4.f();
                        return;
                    }
                    return;
                } else {
                    u31Var = u31Var4;
                    if (unsafe2.getObjectVolatile(u31Var4, j) != u31Var3) {
                        break;
                    } else {
                        this = u31Var2;
                    }
                }
            }
            this = u31Var2;
        }
    }

    public final Object h() {
        return we.a.getObjectVolatile(this, e);
    }

    public final u31 i() {
        Object objH = h();
        ws1 ws1Var = objH instanceof ws1 ? (ws1) objH : null;
        if (ws1Var != null) {
            return ws1Var.a;
        }
        objH.getClass();
        return (u31) objH;
    }

    public final u31 j() {
        u31 u31VarF = f();
        if (u31VarF != null) {
            return u31VarF;
        }
        Unsafe unsafe = we.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            u31 u31Var = (u31) objectVolatile;
            if (!u31Var.k()) {
                return u31Var;
            }
            objectVolatile = we.a.getObjectVolatile(u31Var, j);
        }
    }

    public boolean k() {
        return h() instanceof ws1;
    }

    public String toString() {
        return new ay0(1, 2, j20.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + j20.s(this);
    }
}

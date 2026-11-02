package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x31 {
    public static final pa0 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = we.a;
        f = unsafe.objectFieldOffset(x31.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(x31.class.getDeclaredField("_state$volatile"));
        e = new pa0("REMOVE_FROZEN", 1);
    }

    public x31(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            fu1.h("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        fu1.h("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        x31 x31Var = this;
        while (true) {
            Unsafe unsafe = we.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(x31Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = x31Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = x31Var.b;
            AtomicReferenceArray atomicReferenceArray = x31Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(x31Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    x31 x31VarC = this;
                    while ((we.a.getLongVolatile(x31VarC, j) & 1152921504606846976L) != 0) {
                        x31VarC = x31VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = x31VarC.d;
                        int i4 = x31VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof w31) && ((w31) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            x31VarC = null;
                        }
                        if (x31VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                x31Var = this;
            } else {
                int i5 = x31Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = we.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            x31 x31Var = this;
            if (we.a.compareAndSwapLong(x31Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = x31Var;
        }
    }

    public final x31 c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = we.a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = we.a;
            long j3 = f;
            x31 x31Var = (x31) unsafe3.getObjectVolatile(this, j3);
            if (x31Var != null) {
                return x31Var;
            }
            x31 x31Var2 = new x31(this.a * 2, this.b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object w31Var = this.d.get(i4);
                if (w31Var == null) {
                    w31Var = new w31(i);
                }
                x31Var2.d.set(x31Var2.c & i, w31Var);
                i++;
            }
            we.a.putLongVolatile(x31Var2, g, j2 & (-1152921504606846977L));
            do {
                unsafe2 = we.a;
                if (unsafe2.compareAndSwapObject(this, f, (Object) null, x31Var2)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    public final Object d() {
        x31 x31VarC = this;
        while (true) {
            Unsafe unsafe = we.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(x31VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = x31VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = x31VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = x31VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof w31)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(x31VarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    x31VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = we.a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(x31VarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                x31VarC = x31VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(x31VarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    x31VarC.d.set(x31VarC.c & i5, null);
                                    x31VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (x31VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}

package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dw {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = we.a;
        a = unsafe.objectFieldOffset(dw.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(dw.class.getDeclaredField("_prev$volatile"));
    }

    public dw(gz1 gz1Var) {
        this._prev$volatile = gz1Var;
    }

    public final void a() {
        we.a.putObjectVolatile(this, b, (Object) null);
    }

    public final dw b() {
        Object objectVolatile = we.a.getObjectVolatile(this, a);
        if (objectVolatile == ws0.o) {
            return null;
        }
        return (dw) objectVolatile;
    }

    public abstract boolean c();

    public final void d() {
        dw dwVar;
        Unsafe unsafe;
        if (b() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = we.a;
            long j = b;
            dw dwVar2 = (dw) unsafe2.getObjectVolatile(this, j);
            while (dwVar2 != null && dwVar2.c()) {
                dwVar2 = (dw) we.a.getObjectVolatile(dwVar2, j);
            }
            dw dwVarB = b();
            dwVarB.getClass();
            do {
                dwVar = dwVarB;
                if (!dwVar.c()) {
                    break;
                } else {
                    dwVarB = dwVar.b();
                }
            } while (dwVarB != null);
            while (true) {
                Object objectVolatile = we.a.getObjectVolatile(dwVar, j);
                dw dwVar3 = ((dw) objectVolatile) == null ? null : dwVar2;
                while (true) {
                    unsafe = we.a;
                    if (unsafe.compareAndSwapObject(dwVar, b, objectVolatile, dwVar3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(dwVar, j) != objectVolatile) {
                    }
                }
            }
            if (dwVar2 != null) {
                unsafe.putObjectVolatile(dwVar2, a, dwVar);
            }
            if (!dwVar.c() || dwVar.b() == null) {
                if (dwVar2 == null || !dwVar2.c()) {
                    return;
                }
            }
        }
    }
}

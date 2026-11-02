package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements so0 {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final oe1 e;

    static {
        Unsafe unsafe = we.a;
        g = unsafe.objectFieldOffset(ut0.class.getDeclaredField("_isCompleting$volatile"));
        h = unsafe.objectFieldOffset(ut0.class.getDeclaredField("_rootCause$volatile"));
        f = unsafe.objectFieldOffset(ut0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public ut0(oe1 oe1Var, Throwable th) {
        this.e = oe1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            we.a.putObjectVolatile(this, h, th);
            return;
        }
        if (th == thC) {
            return;
        }
        Unsafe unsafe = we.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                qj.i(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // defpackage.so0
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) we.a.getObjectVolatile(this, h);
    }

    @Override // defpackage.so0
    public final oe1 d() {
        return this.e;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return we.a.getIntVolatile(this, g) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = we.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                qj.i(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, nj2.r0);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + we.a.getObjectVolatile(this, f) + ", list=" + this.e + ']';
    }
}

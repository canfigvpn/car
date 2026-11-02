package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class zk implements lo {
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(zk.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final /* synthetic */ AtomicLongFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = we.a;
        s = unsafe.objectFieldOffset(zk.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(zk.class, "receivers$volatile");
        q = unsafe.objectFieldOffset(zk.class.getDeclaredField("receivers$volatile"));
        h = AtomicLongFieldUpdater.newUpdater(zk.class, "bufferEnd$volatile");
        l = unsafe.objectFieldOffset(zk.class.getDeclaredField("bufferEnd$volatile"));
        i = AtomicLongFieldUpdater.newUpdater(zk.class, "completedExpandBuffersAndPauseFlag$volatile");
        o = unsafe.objectFieldOffset(zk.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        r = unsafe.objectFieldOffset(zk.class.getDeclaredField("sendSegment$volatile"));
        j = AtomicReferenceFieldUpdater.newUpdater(zk.class, Object.class, "receiveSegment$volatile");
        p = unsafe.objectFieldOffset(zk.class.getDeclaredField("receiveSegment$volatile"));
        m = unsafe.objectFieldOffset(zk.class.getDeclaredField("bufferEndSegment$volatile"));
        k = unsafe.objectFieldOffset(zk.class.getDeclaredField("_closeCause$volatile"));
        n = unsafe.objectFieldOffset(zk.class.getDeclaredField("closeHandler$volatile"));
    }

    public zk(int i2) {
        this.e = i2;
        if (i2 < 0) {
            fu1.i("Invalid channel capacity: ", i2, ", should be >=0");
            throw null;
        }
        xo xoVar = bl.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = m();
        xo xoVar2 = new xo(0L, null, this, 3);
        this.sendSegment$volatile = xoVar2;
        this.receiveSegment$volatile = xoVar2;
        if (z()) {
            xoVar2 = bl.a;
            xoVar2.getClass();
        }
        this.bufferEndSegment$volatile = xoVar2;
        this._closeCause$volatile = bl.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object D(zk zkVar, tx txVar) {
        xk xkVar;
        xo xoVar;
        if (txVar instanceof xk) {
            xkVar = (xk) txVar;
            int i2 = xkVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xkVar.j = i2 - Integer.MIN_VALUE;
            } else {
                xkVar = new xk(zkVar, txVar);
            }
        } else {
            xkVar = new xk(zkVar, txVar);
        }
        xk xkVar2 = xkVar;
        Object obj = xkVar2.h;
        int i3 = xkVar2.j;
        if (i3 != 0) {
            if (i3 == 1) {
                ix.Q(obj);
                return ((wo) obj).a;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        xo xoVar2 = (xo) we.a.getObjectVolatile(zkVar, p);
        while (!zkVar.v()) {
            long andIncrement = g.getAndIncrement(zkVar);
            long j2 = bl.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (xoVar2.d != j3) {
                xo xoVarJ = zkVar.j(j3, xoVar2);
                if (xoVarJ == null) {
                    continue;
                } else {
                    xoVar = xoVarJ;
                }
            } else {
                xoVar = xoVar2;
            }
            zk zkVar2 = zkVar;
            Object objI = zkVar2.I(xoVar, i4, andIncrement, null);
            if (objI == bl.m) {
                fu1.h("unexpected");
                return null;
            }
            if (objI != bl.o) {
                if (objI != bl.n) {
                    xoVar.a();
                    return objI;
                }
                xkVar2.j = 1;
                Object objE = zkVar2.E(xoVar, i4, andIncrement, xkVar2);
                fz fzVar = fz.e;
                return objE == fzVar ? fzVar : objE;
            }
            if (andIncrement < zkVar2.r()) {
                xoVar.a();
            }
            zkVar = zkVar2;
            xoVar2 = xoVar;
        }
        return new uo(zkVar.n());
    }

    public static boolean H(Object obj) {
        if (!(obj instanceof nm)) {
            qj.i(obj, "Unexpected waiter: ");
            return false;
        }
        nm nmVar = (nm) obj;
        xo xoVar = bl.a;
        pa0 pa0VarN = nmVar.n(ll2.a, null);
        if (pa0VarN == null) {
            return false;
        }
        nmVar.y(pa0VarN);
        return true;
    }

    public final void A(long j2, xo xoVar) {
        zk zkVar;
        xo xoVar2;
        xo xoVar3;
        while (xoVar.d < j2 && (xoVar3 = (xo) xoVar.b()) != null) {
            xoVar = xoVar3;
        }
        while (true) {
            xo xoVar4 = xoVar;
            while (xoVar4.c() && (xoVar2 = (xo) xoVar4.b()) != null) {
                xoVar4 = xoVar2;
            }
            while (true) {
                Unsafe unsafe = we.a;
                long j3 = m;
                gz1 gz1Var = (gz1) unsafe.getObjectVolatile(this, j3);
                if (gz1Var.d >= xoVar4.d) {
                    return;
                }
                if (!xoVar4.i()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = we.a;
                    zkVar = this;
                    if (unsafe2.compareAndSwapObject(zkVar, m, gz1Var, xoVar4)) {
                        if (gz1Var.e()) {
                            gz1Var.d();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(zkVar, j3) != gz1Var) {
                        break;
                    } else {
                        this = zkVar;
                    }
                }
                if (xoVar4.e()) {
                    xoVar4.d();
                }
                this = zkVar;
            }
            xoVar = xoVar4;
        }
    }

    public final Object B(sx sxVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        om omVar = new om(1, ex.y(sxVar));
        omVar.v();
        omVar.i(new ut1(q()));
        Object objT = omVar.t();
        return objT == fz.e ? objT : ll2.a;
    }

    public final void C(Object obj, om omVar) throws IllegalAccessException, InvocationTargetException {
        omVar.i(new ut1(q()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(xo xoVar, int i2, long j2, tx txVar) {
        yk ykVar;
        wo woVar;
        xo xoVar2;
        if (txVar instanceof yk) {
            ykVar = (yk) txVar;
            int i3 = ykVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ykVar.j = i3 - Integer.MIN_VALUE;
            } else {
                ykVar = new yk(this, txVar);
            }
        } else {
            ykVar = new yk(this, txVar);
        }
        Object objT = ykVar.h;
        int i4 = ykVar.j;
        if (i4 == 0) {
            ix.Q(objT);
            ykVar.j = 1;
            om omVarW = dv1.w(ex.y(ykVar));
            try {
                kr1 kr1Var = new kr1(omVarW);
                Object objI = I(xoVar, i2, j2, kr1Var);
                if (objI != bl.m) {
                    if (objI == bl.o) {
                        if (j2 < r()) {
                            xoVar.a();
                        }
                        xo xoVar3 = (xo) we.a.getObjectVolatile(this, p);
                        while (true) {
                            if (v()) {
                                omVarW.i(new wo(new uo(n())));
                                break;
                            }
                            long andIncrement = g.getAndIncrement(this);
                            long j3 = bl.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (xoVar3.d != j4) {
                                xo xoVarJ = j(j4, xoVar3);
                                if (xoVarJ != null) {
                                    xoVar2 = xoVarJ;
                                }
                            } else {
                                xoVar2 = xoVar3;
                            }
                            Object objI2 = I(xoVar2, i5, andIncrement, kr1Var);
                            xo xoVar4 = xoVar2;
                            if (objI2 == bl.m) {
                                kr1Var.a(xoVar4, i5);
                                break;
                            }
                            if (objI2 == bl.o) {
                                if (andIncrement < r()) {
                                    xoVar4.a();
                                }
                                xoVar3 = xoVar4;
                            } else {
                                if (objI2 == bl.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                xoVar4.a();
                                woVar = new wo(objI2);
                            }
                        }
                    } else {
                        xoVar.a();
                        woVar = new wo(objI);
                    }
                    omVarW.m(woVar, null);
                    break;
                }
                kr1Var.a(xoVar, i2);
                objT = omVarW.t();
                fz fzVar = fz.e;
                if (objT == fzVar) {
                    return fzVar;
                }
            } catch (Throwable th) {
                omVarW.D();
                throw th;
            }
        } else {
            if (i4 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(objT);
        }
        return ((wo) objT).a;
    }

    public final void F(jo2 jo2Var, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (jo2Var instanceof nm) {
            ((sx) jo2Var).i(new ut1(z ? o() : q()));
            return;
        }
        if (jo2Var instanceof kr1) {
            ((kr1) jo2Var).e.i(new wo(new uo(n())));
            return;
        }
        if (!(jo2Var instanceof wk)) {
            qj.i(jo2Var, "Unexpected waiter: ");
            return;
        }
        wk wkVar = (wk) jo2Var;
        om omVar = wkVar.f;
        omVar.getClass();
        wkVar.f = null;
        wkVar.e = bl.l;
        Throwable thN = wkVar.g.n();
        if (thN == null) {
            omVar.i(Boolean.FALSE);
        } else {
            omVar.i(new ut1(thN));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        if (obj instanceof kr1) {
            om omVar = ((kr1) obj).e;
            wo woVar = new wo(obj2);
            xo xoVar = bl.a;
            pa0 pa0VarN = omVar.n(woVar, null);
            if (pa0VarN == null) {
                return false;
            }
            omVar.y(pa0VarN);
            return true;
        }
        if (!(obj instanceof wk)) {
            if (!(obj instanceof nm)) {
                qj.i(obj, "Unexpected receiver type: ");
                return false;
            }
            nm nmVar = (nm) obj;
            xo xoVar2 = bl.a;
            pa0 pa0VarN2 = nmVar.n(obj2, null);
            if (pa0VarN2 == null) {
                return false;
            }
            nmVar.y(pa0VarN2);
            return true;
        }
        wk wkVar = (wk) obj;
        om omVar2 = wkVar.f;
        omVar2.getClass();
        wkVar.f = null;
        wkVar.e = obj2;
        Boolean bool = Boolean.TRUE;
        wkVar.g.getClass();
        xo xoVar3 = bl.a;
        pa0 pa0VarN3 = omVar2.n(bool, null);
        if (pa0VarN3 == null) {
            return false;
        }
        omVar2.y(pa0VarN3);
        return true;
    }

    public final Object I(xo xoVar, int i2, long j2, Object obj) {
        Object objK = xoVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = xoVar.h;
        long j3 = s;
        if (objK == null) {
            if (j2 >= (we.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return bl.n;
                }
                if (xoVar.j(i2, objK, obj)) {
                    i();
                    return bl.m;
                }
            }
        } else if (objK == bl.d && xoVar.j(i2, objK, bl.i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            xoVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object objK2 = xoVar.k(i2);
            if (objK2 == null || objK2 == bl.e) {
                if (j2 < (we.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (xoVar.j(i2, objK2, bl.h)) {
                        i();
                        return bl.o;
                    }
                } else {
                    if (obj == null) {
                        return bl.n;
                    }
                    if (xoVar.j(i2, objK2, obj)) {
                        i();
                        return bl.m;
                    }
                }
            } else if (objK2 != bl.d) {
                pa0 pa0Var = bl.j;
                if (objK2 == pa0Var) {
                    return bl.o;
                }
                if (objK2 == bl.h) {
                    return bl.o;
                }
                if (objK2 == bl.l) {
                    i();
                    return bl.o;
                }
                if (objK2 != bl.g && xoVar.j(i2, objK2, bl.f)) {
                    boolean z = objK2 instanceof ko2;
                    if (z) {
                        objK2 = ((ko2) objK2).a;
                    }
                    if (H(objK2)) {
                        xoVar.n(i2, bl.i);
                        i();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        xoVar.m(i2, null);
                        return obj3;
                    }
                    xoVar.n(i2, pa0Var);
                    xoVar.h();
                    if (z) {
                        i();
                    }
                    return bl.o;
                }
            } else if (xoVar.j(i2, objK2, bl.i)) {
                i();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                xoVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int J(xo xoVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        xoVar.m(i2, obj);
        if (z) {
            return K(xoVar, i2, obj, j2, obj2, z);
        }
        Object objK = xoVar.k(i2);
        if (objK == null) {
            if (b(j2)) {
                if (xoVar.j(i2, null, bl.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (xoVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof jo2) {
            xoVar.m(i2, null);
            if (G(objK, obj)) {
                xoVar.n(i2, bl.i);
                return 0;
            }
            pa0 pa0Var = bl.k;
            if (xoVar.h.getAndSet((i2 * 2) + 1, pa0Var) == pa0Var) {
                return 5;
            }
            xoVar.l(i2, true);
            return 5;
        }
        return K(xoVar, i2, obj, j2, obj2, z);
    }

    public final int K(xo xoVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objK = xoVar.k(i2);
            if (objK == null) {
                if (!b(j2) || z) {
                    if (z) {
                        if (xoVar.j(i2, null, bl.j)) {
                            xoVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (xoVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (xoVar.j(i2, null, bl.d)) {
                    break;
                }
            } else {
                if (objK != bl.e) {
                    pa0 pa0Var = bl.k;
                    if (objK == pa0Var) {
                        xoVar.m(i2, null);
                        return 5;
                    }
                    if (objK == bl.h) {
                        xoVar.m(i2, null);
                        return 5;
                    }
                    if (objK == bl.l) {
                        xoVar.m(i2, null);
                        x();
                        return 4;
                    }
                    xoVar.m(i2, null);
                    if (objK instanceof ko2) {
                        objK = ((ko2) objK).a;
                    }
                    if (G(objK, obj)) {
                        xoVar.n(i2, bl.i);
                        return 0;
                    }
                    if (xoVar.h.getAndSet((i2 * 2) + 1, pa0Var) != pa0Var) {
                        xoVar.l(i2, true);
                    }
                    return 5;
                }
                if (xoVar.j(i2, objK, bl.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void L(long j2) {
        zk zkVar = this;
        if (zkVar.z()) {
            return;
        }
        while (zkVar.m() <= j2) {
            zkVar = this;
        }
        int i2 = bl.c;
        int i3 = 0;
        while (true) {
            long j3 = o;
            if (i3 < i2) {
                long jM = zkVar.m();
                if (jM == (we.a.getLongVolatile(zkVar, j3) & 4611686018427387903L) && jM == zkVar.m()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = we.a;
                    long longVolatile = unsafe.getLongVolatile(zkVar, j3);
                    if (unsafe.compareAndSwapLong(zkVar, o, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        zkVar = this;
                    }
                }
                while (true) {
                    long jM2 = zkVar.m();
                    Unsafe unsafe2 = we.a;
                    long longVolatile2 = unsafe2.getLongVolatile(zkVar, j3);
                    long j4 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jM2 == j4 && jM2 == zkVar.m()) {
                        break;
                    }
                    if (z) {
                        zkVar = this;
                    } else {
                        zkVar = this;
                        unsafe2.compareAndSwapLong(zkVar, o, longVolatile2, j4 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = we.a;
                    long longVolatile3 = unsafe3.getLongVolatile(zkVar, j3);
                    if (unsafe3.compareAndSwapLong(zkVar, o, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        zkVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[RETURN] */
    @Override // defpackage.k12
    public Object a(sx sxVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        ll2 ll2Var;
        Object objT;
        fz fzVar;
        int i2;
        zk zkVar = this;
        Unsafe unsafe = we.a;
        long j2 = r;
        xo xoVar = (xo) unsafe.getObjectVolatile(zkVar, j2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(zkVar);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zU = zkVar.u(andIncrement, false);
            int i3 = bl.b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = xoVar.d;
            fz fzVar2 = fz.e;
            ll2Var = ll2.a;
            if (j6 != j5) {
                xo xoVarK = zkVar.k(j5, xoVar);
                if (xoVarK != null) {
                    xoVar = xoVarK;
                } else if (zU) {
                    Object objB = B(sxVar, obj);
                    if (objB == fzVar2) {
                        return objB;
                    }
                }
            }
            int iJ = zkVar.J(xoVar, i4, obj, j3, null, zU);
            if (iJ == 0) {
                xoVar.a();
                return ll2Var;
            }
            if (iJ != 1) {
                if (iJ == 2) {
                    if (!zU) {
                        break;
                    }
                    xoVar.h();
                    Object objB2 = B(sxVar, obj);
                    if (objB2 == fzVar2) {
                        return objB2;
                    }
                } else if (iJ == 3) {
                    om omVarW = dv1.w(ex.y(sxVar));
                    try {
                        int iJ2 = J(xoVar, i4, obj, j3, omVarW, false);
                        if (iJ2 != 0) {
                            if (iJ2 == 1) {
                                fzVar2 = fzVar2;
                                omVarW.i(ll2Var);
                            } else if (iJ2 != 2) {
                                if (iJ2 != 4) {
                                    String str = "unexpected";
                                    if (iJ2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    xoVar.a();
                                    xo xoVar2 = (xo) we.a.getObjectVolatile(this, j2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j7 = andIncrement2 & 1152921504606846975L;
                                        boolean zU2 = u(andIncrement2, false);
                                        int i5 = bl.b;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                                        long j8 = i5;
                                        fzVar2 = fzVar2;
                                        long j9 = j7 / j8;
                                        int i6 = (int) (j7 % j8);
                                        if (xoVar2.d != j9) {
                                            xo xoVarK2 = k(j9, xoVar2);
                                            if (xoVarK2 != null) {
                                                i2 = i6;
                                                xoVar2 = xoVarK2;
                                            } else if (zU2) {
                                            }
                                        } else {
                                            i2 = i6;
                                        }
                                        int iJ3 = J(xoVar2, i2, obj, j7, omVarW, zU2);
                                        if (iJ3 == 0) {
                                            xoVar2.a();
                                        } else if (iJ3 != 1) {
                                            if (iJ3 == 2) {
                                                if (!zU2) {
                                                    omVarW.a(xoVar2, i2 + i5);
                                                    break;
                                                }
                                                xoVar2.h();
                                            } else {
                                                if (iJ3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iJ3 != 4) {
                                                    if (iJ3 == 5) {
                                                        xoVar2.a();
                                                    }
                                                    str = str;
                                                } else if (j7 < p()) {
                                                    xoVar2.a();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    fzVar2 = fzVar2;
                                    if (j3 < p()) {
                                        xoVar.a();
                                    }
                                }
                                C(obj, omVarW);
                                break;
                            } else {
                                fzVar2 = fzVar2;
                                omVarW.a(xoVar, i4 + i3);
                            }
                            objT = omVarW.t();
                            fzVar = fzVar2;
                            if (objT != fzVar) {
                                objT = ll2Var;
                            }
                            if (objT == fzVar) {
                                return objT;
                            }
                        } else {
                            fzVar2 = fzVar2;
                            xoVar.a();
                        }
                        omVarW.i(ll2Var);
                        objT = omVarW.t();
                        fzVar = fzVar2;
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
                } else if (iJ != 4) {
                    if (iJ == 5) {
                        xoVar.a();
                    }
                    zkVar = this;
                } else {
                    if (j3 < p()) {
                        xoVar.a();
                    }
                    Object objB3 = B(sxVar, obj);
                    if (objB3 == fzVar2) {
                        return objB3;
                    }
                }
            } else {
                break;
            }
        }
        return ll2Var;
    }

    public final boolean b(long j2) {
        return j2 < m() || j2 < p() + ((long) this.e);
    }

    @Override // defpackage.k12
    public Object c(Object obj) throws IllegalAccessException, InvocationTargetException {
        zk zkVar = this;
        Unsafe unsafe = we.a;
        long longVolatile = unsafe.getLongVolatile(zkVar, s);
        long j2 = 1152921504606846975L;
        boolean z = zkVar.u(longVolatile, false) ? false : !zkVar.b(longVolatile & 1152921504606846975L);
        vo voVar = wo.b;
        if (z) {
            return voVar;
        }
        Object obj2 = bl.j;
        xo xoVar = (xo) unsafe.getObjectVolatile(zkVar, r);
        while (true) {
            long andIncrement = f.getAndIncrement(zkVar);
            long j3 = andIncrement & j2;
            boolean zU = zkVar.u(andIncrement, false);
            int i2 = bl.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (xoVar.d != j5) {
                xo xoVarK = zkVar.k(j5, xoVar);
                if (xoVarK != null) {
                    xoVar = xoVarK;
                } else {
                    if (zU) {
                        return new uo(zkVar.q());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int iJ = zkVar.J(xoVar, i3, obj, j3, obj2, zU);
            ll2 ll2Var = ll2.a;
            if (iJ == 0) {
                xoVar.a();
                return ll2Var;
            }
            if (iJ == 1) {
                return ll2Var;
            }
            if (iJ == 2) {
                if (zU) {
                    xoVar.h();
                    return new uo(q());
                }
                jo2 jo2Var = obj2 instanceof jo2 ? (jo2) obj2 : null;
                if (jo2Var != null) {
                    jo2Var.a(xoVar, i3 + i2);
                }
                xoVar.h();
                return voVar;
            }
            if (iJ == 3) {
                fu1.h("unexpected");
                return null;
            }
            if (iJ == 4) {
                if (j3 < p()) {
                    xoVar.a();
                }
                return new uo(q());
            }
            if (iJ == 5) {
                xoVar.a();
            }
            j2 = 1152921504606846975L;
            zkVar = this;
        }
    }

    @Override // defpackage.lo
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean e(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        Unsafe unsafe4;
        long j5;
        long longVolatile3;
        if (z) {
            do {
                unsafe4 = we.a;
                j5 = s;
                longVolatile3 = unsafe4.getLongVolatile(this, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                xo xoVar = bl.a;
            } while (!unsafe4.compareAndSwapLong(this, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        pa0 pa0Var = bl.s;
        while (true) {
            Unsafe unsafe5 = we.a;
            long j6 = k;
            if (unsafe5.compareAndSwapObject(this, j6, pa0Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != pa0Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = we.a;
                j4 = s;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = we.a;
                j2 = s;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        x();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = we.a;
                long j7 = n;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                pa0 pa0Var2 = objectVolatile == null ? bl.q : bl.r;
                do {
                    unsafe2 = we.a;
                    if (unsafe2.compareAndSwapObject(this, n, objectVolatile, pa0Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                nj2.i(1, objectVolatile);
                ((ej0) objectVolatile).h(n());
                return z2;
            }
        }
        return z2;
    }

    public final xo f(long j2) throws IllegalAccessException, InvocationTargetException {
        dw dwVar;
        long j3;
        Unsafe unsafe;
        long j4;
        Unsafe unsafe2 = we.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, m);
        xo xoVar = (xo) unsafe2.getObjectVolatile(this, r);
        if (xoVar.d > ((xo) objectVolatile).d) {
            objectVolatile = xoVar;
        }
        xo xoVar2 = (xo) unsafe2.getObjectVolatile(this, p);
        if (xoVar2.d > ((xo) objectVolatile).d) {
            objectVolatile = xoVar2;
        }
        dw dwVar2 = (dw) objectVolatile;
        loop0: while (true) {
            dwVar = dwVar2;
            while (true) {
                int i2 = dw.c;
                dwVar.getClass();
                Object objectVolatile2 = we.a.getObjectVolatile(dwVar, dw.a);
                pa0 pa0Var = ws0.o;
                if (objectVolatile2 == pa0Var) {
                    break loop0;
                }
                dwVar2 = (dw) objectVolatile2;
                if (dwVar2 == null) {
                    do {
                        unsafe = we.a;
                        j4 = dw.a;
                        if (unsafe.compareAndSwapObject(dwVar, j4, (Object) null, pa0Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(dwVar, j4) == null);
                }
            }
        }
        xo xoVar3 = (xo) dwVar;
        if (y()) {
            xo xoVar4 = xoVar3;
            loop3: while (true) {
                int i3 = bl.b - 1;
                while (true) {
                    if (-1 < i3) {
                        j3 = (xoVar4.d * ((long) bl.b)) + ((long) i3);
                        if (j3 >= p()) {
                            while (true) {
                                Object objK = xoVar4.k(i3);
                                if (objK != null && objK != bl.e) {
                                    if (objK != bl.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (xoVar4.j(i3, objK, bl.l)) {
                                    xoVar4.h();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        xoVar4 = (xo) ((dw) we.a.getObjectVolatile(xoVar4, dw.b));
                        if (xoVar4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                h(j3);
            }
        }
        Object objI = null;
        loop6: for (xo xoVar5 = xoVar3; xoVar5 != null; xoVar5 = (xo) ((dw) we.a.getObjectVolatile(xoVar5, dw.b))) {
            for (int i4 = bl.b - 1; -1 < i4; i4--) {
                if ((xoVar5.d * ((long) bl.b)) + ((long) i4) < j2) {
                    break loop6;
                }
                while (true) {
                    Object objK2 = xoVar5.k(i4);
                    if (objK2 != null && objK2 != bl.e) {
                        if (!(objK2 instanceof ko2)) {
                            if (!(objK2 instanceof jo2)) {
                                break;
                            }
                            if (xoVar5.j(i4, objK2, bl.l)) {
                                objI = ix.I(objI, objK2);
                                xoVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (xoVar5.j(i4, objK2, bl.l)) {
                                objI = ix.I(objI, ((ko2) objK2).a);
                                xoVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (xoVar5.j(i4, objK2, bl.l)) {
                            xoVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objI != null) {
            if (!(objI instanceof ArrayList)) {
                F((jo2) objI, true);
                return xoVar3;
            }
            ArrayList arrayList = (ArrayList) objI;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                F((jo2) arrayList.get(size), true);
            }
        }
        return xoVar3;
    }

    @Override // defpackage.lo
    public final Object g() {
        xo xoVar;
        Unsafe unsafe = we.a;
        long longVolatile = unsafe.getLongVolatile(this, q);
        long longVolatile2 = unsafe.getLongVolatile(this, s);
        if (u(longVolatile2, true)) {
            return new uo(n());
        }
        long j2 = longVolatile2 & 1152921504606846975L;
        vo voVar = wo.b;
        if (longVolatile >= j2) {
            return voVar;
        }
        Object obj = bl.k;
        xo xoVar2 = (xo) unsafe.getObjectVolatile(this, p);
        while (!this.v()) {
            long andIncrement = g.getAndIncrement(this);
            long j3 = bl.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (xoVar2.d != j4) {
                xo xoVarJ = this.j(j4, xoVar2);
                if (xoVarJ == null) {
                    continue;
                } else {
                    xoVar = xoVarJ;
                }
            } else {
                xoVar = xoVar2;
            }
            zk zkVar = this;
            Object objI = zkVar.I(xoVar, i2, andIncrement, obj);
            xoVar2 = xoVar;
            if (objI == bl.m) {
                jo2 jo2Var = obj instanceof jo2 ? (jo2) obj : null;
                if (jo2Var != null) {
                    jo2Var.a(xoVar2, i2);
                }
                zkVar.L(andIncrement);
                xoVar2.h();
                return voVar;
            }
            if (objI != bl.o) {
                if (objI != bl.n) {
                    xoVar2.a();
                    return objI;
                }
                fu1.h("unexpected");
                return null;
            }
            if (andIncrement < zkVar.r()) {
                xoVar2.a();
            }
            this = zkVar;
        }
        return new uo(this.n());
    }

    public final void h(long j2) {
        xo xoVar = (xo) we.a.getObjectVolatile(this, p);
        while (true) {
            Unsafe unsafe = we.a;
            long j3 = q;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(((long) this.e) + longVolatile, this.m())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j3, longVolatile, 1 + longVolatile)) {
                long j4 = bl.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (xoVar.d != j5) {
                    xo xoVarJ = this.j(j5, xoVar);
                    if (xoVarJ != null) {
                        xoVar = xoVarJ;
                    }
                }
                xo xoVar2 = xoVar;
                if (this.I(xoVar2, i2, longVolatile, null) != bl.o || longVolatile < this.r()) {
                    xoVar2.a();
                }
                xoVar = xoVar2;
            }
        }
    }

    public final void i() {
        Object objS;
        Unsafe unsafe;
        if (z()) {
            return;
        }
        Unsafe unsafe2 = we.a;
        long j2 = m;
        xo xoVar = (xo) unsafe2.getObjectVolatile(this, j2);
        while (true) {
            long andIncrement = h.getAndIncrement(this);
            long j3 = andIncrement / ((long) bl.b);
            if (r() <= andIncrement) {
                if (xoVar.d < j3 && xoVar.b() != null) {
                    A(j3, xoVar);
                }
                s(1L);
                return;
            }
            if (xoVar.d != j3) {
                al alVar = al.l;
                while (true) {
                    objS = ws0.s(xoVar, j3, alVar);
                    if (!vv.C(objS)) {
                        gz1 gz1VarW = vv.w(objS);
                        while (true) {
                            gz1 gz1Var = (gz1) we.a.getObjectVolatile(this, j2);
                            if (gz1Var.d >= gz1VarW.d) {
                                break;
                            }
                            if (!gz1VarW.i()) {
                                break;
                            }
                            do {
                                unsafe = we.a;
                                if (unsafe.compareAndSwapObject(this, m, gz1Var, gz1VarW)) {
                                    if (!gz1Var.e()) {
                                        break;
                                    }
                                    gz1Var.d();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == gz1Var);
                            if (gz1VarW.e()) {
                                gz1VarW.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                xo xoVar2 = null;
                if (vv.C(objS)) {
                    x();
                    A(j3, xoVar);
                    s(1L);
                } else {
                    xo xoVar3 = (xo) vv.w(objS);
                    long j4 = xoVar3.d;
                    if (j4 > j3) {
                        long j5 = ((long) bl.b) * j4;
                        if (we.a.compareAndSwapLong(this, l, 1 + andIncrement, j5)) {
                            s(j5 - andIncrement);
                        } else {
                            s(1L);
                        }
                    } else {
                        xoVar2 = xoVar3;
                    }
                }
                if (xoVar2 == null) {
                    continue;
                } else {
                    xoVar = xoVar2;
                }
            }
            int i2 = (int) (andIncrement % ((long) bl.b));
            Object objK = xoVar.k(i2);
            boolean z = objK instanceof jo2;
            long j6 = q;
            if (!z || andIncrement < we.a.getLongVolatile(this, j6) || !xoVar.j(i2, objK, bl.g)) {
                while (true) {
                    Object objK2 = xoVar.k(i2);
                    if (objK2 instanceof jo2) {
                        if (andIncrement < we.a.getLongVolatile(this, j6)) {
                            if (xoVar.j(i2, objK2, new ko2((jo2) objK2))) {
                                s(1L);
                                return;
                            }
                        } else if (xoVar.j(i2, objK2, bl.g)) {
                            if (!H(objK2)) {
                                xoVar.n(i2, bl.j);
                                xoVar.h();
                                break;
                            } else {
                                xoVar.n(i2, bl.d);
                                s(1L);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == bl.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (xoVar.j(i2, objK2, bl.e)) {
                                s(1L);
                                return;
                            }
                        } else if (objK2 == bl.d || objK2 == bl.h || objK2 == bl.i || objK2 == bl.k || objK2 == bl.l) {
                            s(1L);
                            return;
                        } else if (objK2 != bl.f) {
                            qj.i(objK2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                s(1L);
            } else if (H(objK)) {
                xoVar.n(i2, bl.d);
                s(1L);
                return;
            } else {
                xoVar.n(i2, bl.j);
                xoVar.h();
                s(1L);
            }
        }
    }

    @Override // defpackage.lo
    public final wk iterator() {
        return new wk(this);
    }

    public final xo j(long j2, xo xoVar) {
        Object objS;
        xo xoVar2;
        Unsafe unsafe;
        long j3;
        long longVolatile;
        Unsafe unsafe2;
        xo xoVar3 = bl.a;
        al alVar = al.l;
        loop0: while (true) {
            objS = ws0.s(xoVar, j2, alVar);
            if (!vv.C(objS)) {
                gz1 gz1VarW = vv.w(objS);
                while (true) {
                    Unsafe unsafe3 = we.a;
                    long j4 = p;
                    gz1 gz1Var = (gz1) unsafe3.getObjectVolatile(this, j4);
                    if (gz1Var.d >= gz1VarW.d) {
                        break loop0;
                    }
                    if (!gz1VarW.i()) {
                        break;
                    }
                    do {
                        unsafe2 = we.a;
                        if (unsafe2.compareAndSwapObject(this, p, gz1Var, gz1VarW)) {
                            if (!gz1Var.e()) {
                                break loop0;
                            }
                            gz1Var.d();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j4) == gz1Var);
                    if (gz1VarW.e()) {
                        gz1VarW.d();
                    }
                }
            } else {
                break;
            }
        }
        if (vv.C(objS)) {
            x();
            if (xoVar.d * ((long) bl.b) < r()) {
                xoVar.a();
                return null;
            }
        } else {
            xo xoVar4 = (xo) vv.w(objS);
            long j5 = xoVar4.d;
            if (z() || j2 > m() / ((long) bl.b)) {
                xoVar2 = xoVar4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = we.a;
                long j6 = m;
                gz1 gz1Var2 = (gz1) unsafe4.getObjectVolatile(this, j6);
                if (gz1Var2.d >= j5 || !xoVar4.i()) {
                    xoVar2 = xoVar4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = we.a;
                    xoVar2 = xoVar4;
                    if (unsafe5.compareAndSwapObject(this, m, gz1Var2, xoVar4)) {
                        if (!gz1Var2.e()) {
                            break loop3;
                        }
                        gz1Var2.d();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j6) != gz1Var2) {
                        break;
                    }
                    xoVar4 = xoVar2;
                }
                if (xoVar2.e()) {
                    xoVar2.d();
                }
                xoVar4 = xoVar2;
            }
            if (j5 <= j2) {
                return xoVar2;
            }
            long j7 = j5 * ((long) bl.b);
            do {
                unsafe = we.a;
                j3 = q;
                longVolatile = unsafe.getLongVolatile(this, j3);
                if (longVolatile >= j7) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j3, longVolatile, j7));
            if (j5 * ((long) bl.b) < r()) {
                xoVar2.a();
            }
        }
        return null;
    }

    public final xo k(long j2, xo xoVar) {
        Object objS;
        xo xoVar2;
        long j3;
        Unsafe unsafe;
        zk zkVar = this;
        xo xoVar3 = bl.a;
        al alVar = al.l;
        loop0: while (true) {
            objS = ws0.s(xoVar, j2, alVar);
            if (!vv.C(objS)) {
                gz1 gz1VarW = vv.w(objS);
                while (true) {
                    Unsafe unsafe2 = we.a;
                    long j4 = r;
                    gz1 gz1Var = (gz1) unsafe2.getObjectVolatile(zkVar, j4);
                    if (gz1Var.d >= gz1VarW.d) {
                        break loop0;
                    }
                    if (!gz1VarW.i()) {
                        break;
                    }
                    do {
                        unsafe = we.a;
                        if (unsafe.compareAndSwapObject(zkVar, r, gz1Var, gz1VarW)) {
                            if (!gz1Var.e()) {
                                break loop0;
                            }
                            gz1Var.d();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(zkVar, j4) == gz1Var);
                    if (gz1VarW.e()) {
                        gz1VarW.d();
                    }
                }
            } else {
                break;
            }
        }
        xo xoVar4 = null;
        if (vv.C(objS)) {
            zkVar.x();
            if (xoVar.d * ((long) bl.b) >= zkVar.p()) {
                return null;
            }
            xoVar.a();
            return null;
        }
        xo xoVar5 = (xo) vv.w(objS);
        long j5 = xoVar5.d;
        if (j5 <= j2) {
            return xoVar5;
        }
        long j6 = j5 * ((long) bl.b);
        while (true) {
            Unsafe unsafe3 = we.a;
            long j7 = s;
            long longVolatile = unsafe3.getLongVolatile(zkVar, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                xoVar2 = xoVar4;
                j3 = j5;
                break;
            }
            xoVar2 = xoVar4;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(zkVar, j7, longVolatile, j8 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            zkVar = this;
            xoVar4 = xoVar2;
            j5 = j3;
        }
        if (j3 * ((long) bl.b) >= p()) {
            return xoVar2;
        }
        xoVar5.a();
        return xoVar2;
    }

    @Override // defpackage.lo
    public final Object l(sx sxVar) throws Throwable {
        xo xoVar;
        Throwable th;
        xo xoVar2;
        Unsafe unsafe = we.a;
        long j2 = p;
        xo xoVar3 = (xo) unsafe.getObjectVolatile(this, j2);
        while (!this.v()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = bl.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (xoVar3.d != j4) {
                xo xoVarJ = this.j(j4, xoVar3);
                if (xoVarJ == null) {
                    continue;
                } else {
                    xoVar = xoVarJ;
                }
            } else {
                xoVar = xoVar3;
            }
            zk zkVar = this;
            Object objI = zkVar.I(xoVar, i2, andIncrement, null);
            pa0 pa0Var = bl.m;
            if (objI == pa0Var) {
                fu1.h("unexpected");
                return null;
            }
            pa0 pa0Var2 = bl.o;
            if (objI == pa0Var2) {
                if (andIncrement < zkVar.r()) {
                    xoVar.a();
                }
                this = zkVar;
                xoVar3 = xoVar;
            } else {
                if (objI != bl.n) {
                    xoVar.a();
                    return objI;
                }
                om omVarW = dv1.w(ex.y(sxVar));
                try {
                    Object objI2 = zkVar.I(xoVar, i2, andIncrement, omVarW);
                    if (objI2 != pa0Var) {
                        if (objI2 == pa0Var2) {
                            if (andIncrement < zkVar.r()) {
                                xoVar.a();
                            }
                            xo xoVar4 = (xo) we.a.getObjectVolatile(zkVar, j2);
                            while (true) {
                                if (zkVar.v()) {
                                    omVarW.i(new ut1(zkVar.o()));
                                    break;
                                }
                                om omVar = omVarW;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(zkVar);
                                    long j5 = bl.b;
                                    long j6 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (xoVar4.d != j6) {
                                        try {
                                            xo xoVarJ2 = zkVar.j(j6, xoVar4);
                                            if (xoVarJ2 == null) {
                                                omVarW = omVar;
                                            } else {
                                                xoVar2 = xoVarJ2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            omVarW = omVar;
                                            omVarW.D();
                                            throw th;
                                        }
                                    } else {
                                        xoVar2 = xoVar4;
                                    }
                                    zk zkVar2 = zkVar;
                                    objI2 = zkVar2.I(xoVar2, i3, andIncrement2, omVar);
                                    zkVar = zkVar2;
                                    xo xoVar5 = xoVar2;
                                    omVarW = omVar;
                                    if (objI2 == bl.m) {
                                        omVarW.a(xoVar5, i3);
                                        break;
                                    }
                                    if (objI2 == bl.o) {
                                        if (andIncrement2 < zkVar.r()) {
                                            xoVar5.a();
                                        }
                                        xoVar4 = xoVar5;
                                    } else {
                                        if (objI2 == bl.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        xoVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    omVarW = omVar;
                                    th = th;
                                    omVarW.D();
                                    throw th;
                                }
                            }
                        } else {
                            xoVar.a();
                        }
                        omVarW.m(objI2, null);
                        break;
                    }
                    omVarW.a(xoVar, i2);
                    return omVarW.t();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thO = this.o();
        int i4 = i82.a;
        throw thO;
    }

    public final long m() {
        return we.a.getLongVolatile(this, l);
    }

    public final Throwable n() {
        return (Throwable) we.a.getObjectVolatile(this, k);
    }

    public final Throwable o() {
        Throwable thN = n();
        return thN == null ? new qq("Channel was closed") : thN;
    }

    public final long p() {
        return we.a.getLongVolatile(this, q);
    }

    public final Throwable q() {
        Throwable thN = n();
        return thN == null ? new rq("Channel was closed") : thN;
    }

    public final long r() {
        return we.a.getLongVolatile(this, s) & 1152921504606846975L;
    }

    public final void s(long j2) {
        if ((i.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((we.a.getLongVolatile(this, o) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = we.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, s) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.e + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z = true;
        List listV = vs0.v(unsafe.getObjectVolatile(this, p), unsafe.getObjectVolatile(this, r), unsafe.getObjectVolatile(this, m));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (((xo) obj) != bl.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            qj.t();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((xo) next).d;
            do {
                Object next2 = it.next();
                long j3 = ((xo) next2).d;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        xo xoVar = (xo) next;
        long jP = p();
        long jR = r();
        loop2: while (true) {
            int i3 = bl.b;
            int i4 = i2;
            while (i4 < i3) {
                str = null;
                long j4 = (xoVar.d * ((long) bl.b)) + ((long) i4);
                if (j4 >= jR && j4 >= jP) {
                    break loop2;
                }
                Object objK = xoVar.k(i4);
                boolean z2 = z;
                Object obj2 = xoVar.h.get(i4 * 2);
                if (objK instanceof nm) {
                    string = (j4 >= jP || j4 < jR) ? (j4 >= jR || j4 < jP) ? "cont" : "send" : "receive";
                } else if (objK instanceof kr1) {
                    string = "receiveCatching";
                } else if (objK instanceof ko2) {
                    string = "EB(" + objK + ')';
                } else if (ws0.j(objK, bl.f) || ws0.j(objK, bl.g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(bl.e) && !objK.equals(bl.i) && !objK.equals(bl.h) && !objK.equals(bl.k) && !objK.equals(bl.j) && !objK.equals(bl.l)) {
                        string = objK.toString();
                    }
                    i4++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z = z2;
            }
            boolean z3 = z;
            str = null;
            xoVar = (xo) xoVar.b();
            if (xoVar == null) {
                break;
            }
            z = z3;
            i2 = 0;
        }
        if (sb.length() == 0) {
            fu1.k("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(long j2, boolean z) throws IllegalAccessException, InvocationTargetException {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                f(j2 & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = we.a;
                        long j3 = p;
                        xo xoVarJ = (xo) unsafe.getObjectVolatile(this, j3);
                        long jP = p();
                        if (r() <= jP) {
                            break;
                        }
                        long j4 = bl.b;
                        long j5 = jP / j4;
                        if (xoVarJ.d != j5 && (xoVarJ = j(j5, xoVarJ)) == null) {
                            if (((xo) unsafe.getObjectVolatile(this, j3)).d < j5) {
                                break;
                            }
                        } else {
                            xoVarJ.a();
                            int i3 = (int) (jP % j4);
                            while (true) {
                                Object objK = xoVarJ.k(i3);
                                if (objK != null && objK != bl.e) {
                                    if (objK != bl.d && (objK == bl.j || objK == bl.l || objK == bl.i || objK == bl.h || (objK != bl.g && (objK == bl.f || jP != p())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (xoVarJ.j(i3, objK, bl.h)) {
                                    i();
                                    break;
                                }
                            }
                            we.a.compareAndSwapLong(this, q, jP, jP + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(k3.i("unexpected close status: ", i2).toString());
                }
                xo xoVarF = f(j2 & 1152921504606846975L);
                Object objI = null;
                loop0: do {
                    for (int i4 = bl.b - 1; -1 < i4; i4--) {
                        long j6 = (xoVarF.d * ((long) bl.b)) + ((long) i4);
                        while (true) {
                            Object objK2 = xoVarF.k(i4);
                            if (objK2 == bl.i) {
                                break loop0;
                            }
                            if (objK2 != bl.d) {
                                if (objK2 != bl.e && objK2 != null) {
                                    if (!(objK2 instanceof jo2) && !(objK2 instanceof ko2)) {
                                        pa0 pa0Var = bl.g;
                                        if (objK2 == pa0Var || objK2 == bl.f) {
                                            break loop0;
                                        }
                                        if (objK2 != pa0Var) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < p()) {
                                            break loop0;
                                        }
                                        jo2 jo2Var = objK2 instanceof ko2 ? ((ko2) objK2).a : (jo2) objK2;
                                        if (xoVarF.j(i4, objK2, bl.l)) {
                                            objI = ix.I(objI, jo2Var);
                                            xoVarF.m(i4, null);
                                            xoVarF.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (xoVarF.j(i4, objK2, bl.l)) {
                                        xoVarF.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < p()) {
                                    break loop0;
                                }
                                if (xoVarF.j(i4, objK2, bl.l)) {
                                    xoVarF.m(i4, null);
                                    xoVarF.h();
                                    break;
                                }
                            }
                        }
                    }
                    xoVarF = (xo) ((dw) we.a.getObjectVolatile(xoVarF, dw.b));
                } while (xoVarF != null);
                if (objI != null) {
                    if (objI instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objI;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            F((jo2) arrayList.get(size), false);
                        }
                    } else {
                        F((jo2) objI, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean v() {
        return u(we.a.getLongVolatile(this, s), true);
    }

    @Override // defpackage.lo
    public final Object w(bs bsVar) {
        return D(this, bsVar);
    }

    public final boolean x() {
        return u(we.a.getLongVolatile(this, s), false);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long jM = m();
        return jM == 0 || jM == Long.MAX_VALUE;
    }
}

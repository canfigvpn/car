package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vt0 implements ot0 {
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = we.a;
        f = unsafe.objectFieldOffset(vt0.class.getDeclaredField("_state$volatile"));
        e = unsafe.objectFieldOffset(vt0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public vt0(boolean z) {
        this._state$volatile = z ? nj2.t0 : nj2.s0;
    }

    public static ip X(u31 u31Var) {
        while (u31Var.k()) {
            u31Var = u31Var.j();
        }
        while (true) {
            u31Var = u31Var.i();
            if (!u31Var.k()) {
                if (u31Var instanceof ip) {
                    return (ip) u31Var;
                }
                if (u31Var instanceof oe1) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof ut0)) {
            if (obj instanceof so0) {
                return ((so0) obj).b() ? "Active" : "New";
            }
            return obj instanceof os ? "Cancelled" : "Completed";
        }
        ut0 ut0Var = (ut0) obj;
        if (ut0Var.e()) {
            return "Cancelling";
        }
        return ut0Var.f() ? "Completing" : "Active";
    }

    @Override // defpackage.ot0
    public final Object A(tx txVar) {
        Object objO;
        ll2 ll2Var;
        do {
            objO = O();
            boolean z = objO instanceof so0;
            ll2Var = ll2.a;
            if (!z) {
                mx.u(txVar.f());
                return ll2Var;
            }
        } while (d0(objO) < 0);
        om omVar = new om(1, ex.y(txVar));
        omVar.v();
        omVar.z(new km(2, mx.C(this, true, new xt1(omVar))));
        Object objT = omVar.t();
        fz fzVar = fz.e;
        if (objT != fzVar) {
            objT = ll2Var;
        }
        return objT == fzVar ? objT : ll2Var;
    }

    @Override // defpackage.ot0
    public final e60 B(boolean z, boolean z2, f fVar) {
        return S(z2, z ? new ht0(fVar) : new it0(fVar));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[LOOP:2: B:53:0x00ae->B:60:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean C(Object obj) {
        vt0 vt0Var;
        Throwable thI;
        Object objO;
        Throwable thC;
        pa0 pa0Var;
        Object objF0;
        so0 so0Var;
        oe1 oe1VarN;
        ut0 ut0Var;
        Unsafe unsafe;
        long j;
        Object objF1 = nj2.n0;
        if (M()) {
            do {
                Object objO2 = O();
                if (!(objO2 instanceof so0) || ((objO2 instanceof ut0) && ((ut0) objO2).f())) {
                    objF1 = nj2.n0;
                    break;
                }
                objF1 = f0(objO2, new os(I(obj), false));
            } while (objF1 == nj2.p0);
            if (objF1 != nj2.o0) {
                if (objF1 == nj2.n0) {
                    thI = null;
                    loop1: while (true) {
                        objO = this.O();
                        if (objO instanceof ut0) {
                            if (objO instanceof so0) {
                                if (thI == null) {
                                    thI = this.I(obj);
                                }
                                so0Var = (so0) objO;
                                if (so0Var.b()) {
                                    oe1VarN = this.N(so0Var);
                                    if (oe1VarN == null) {
                                        vt0Var = this;
                                    } else {
                                        ut0Var = new ut0(oe1VarN, thI);
                                        while (true) {
                                            unsafe = we.a;
                                            j = f;
                                            vt0Var = this;
                                            if (unsafe.compareAndSwapObject(vt0Var, j, so0Var, ut0Var)) {
                                                vt0Var.Y(oe1VarN, thI);
                                                objF0 = nj2.n0;
                                            } else if (unsafe.getObjectVolatile(vt0Var, j) != so0Var) {
                                                this = vt0Var;
                                            }
                                        }
                                    }
                                    this = vt0Var;
                                } else {
                                    vt0Var = this;
                                    objF0 = vt0Var.f0(objO, new os(thI, false));
                                    if (objF0 != nj2.n0) {
                                        qj.i(objO, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objF0 != nj2.p0) {
                                        this = vt0Var;
                                    }
                                }
                            } else {
                                vt0Var = this;
                                objF0 = nj2.q0;
                            }
                            objF1 = objF0;
                            break;
                        }
                        synchronized (objO) {
                            if (we.a.getObjectVolatile((ut0) objO, ut0.f) == nj2.r0) {
                                pa0Var = nj2.q0;
                            } else {
                                boolean zE = ((ut0) objO).e();
                                if (thI == null) {
                                    thI = this.I(obj);
                                }
                                ((ut0) objO).a(thI);
                                thC = zE ? null : ((ut0) objO).c();
                                if (thC != null) {
                                    this.Y(((ut0) objO).e, thC);
                                }
                                pa0Var = nj2.n0;
                            }
                        }
                        vt0Var = this;
                        objF1 = pa0Var;
                        break;
                    }
                }
                vt0Var = this;
                if (objF1 != nj2.n0 && objF1 != nj2.o0) {
                    if (objF1 == nj2.q0) {
                        return false;
                    }
                    vt0Var.x(objF1);
                    return true;
                }
            }
        } else {
            if (objF1 == nj2.n0) {
                thI = null;
                loop1: while (true) {
                    objO = this.O();
                    if (objO instanceof ut0) {
                        if (objO instanceof so0) {
                            if (thI == null) {
                                thI = this.I(obj);
                            }
                            so0Var = (so0) objO;
                            if (so0Var.b()) {
                                oe1VarN = this.N(so0Var);
                                if (oe1VarN == null) {
                                    vt0Var = this;
                                } else {
                                    ut0Var = new ut0(oe1VarN, thI);
                                    while (true) {
                                        unsafe = we.a;
                                        j = f;
                                        vt0Var = this;
                                        if (unsafe.compareAndSwapObject(vt0Var, j, so0Var, ut0Var)) {
                                            vt0Var.Y(oe1VarN, thI);
                                            objF0 = nj2.n0;
                                        } else if (unsafe.getObjectVolatile(vt0Var, j) != so0Var) {
                                            this = vt0Var;
                                        }
                                    }
                                }
                                this = vt0Var;
                            } else {
                                vt0Var = this;
                                objF0 = vt0Var.f0(objO, new os(thI, false));
                                if (objF0 != nj2.n0) {
                                    qj.i(objO, "Cannot happen in ");
                                    return false;
                                }
                                if (objF0 != nj2.p0) {
                                    this = vt0Var;
                                }
                            }
                        } else {
                            vt0Var = this;
                            objF0 = nj2.q0;
                        }
                        objF1 = objF0;
                        break;
                    }
                    synchronized (objO) {
                        if (we.a.getObjectVolatile((ut0) objO, ut0.f) == nj2.r0) {
                            pa0Var = nj2.q0;
                        } else {
                            boolean zE2 = ((ut0) objO).e();
                            if (thI == null) {
                                thI = this.I(obj);
                            }
                            ((ut0) objO).a(thI);
                            if (zE2) {
                            }
                            if (thC != null) {
                                this.Y(((ut0) objO).e, thC);
                            }
                            pa0Var = nj2.n0;
                        }
                        vt0Var = this;
                        objF1 = pa0Var;
                        break;
                    }
                }
            }
            vt0Var = this;
            if (objF1 != nj2.n0) {
                if (objF1 == nj2.q0) {
                    return false;
                }
                vt0Var.x(objF1);
                return true;
            }
        }
        return true;
    }

    public void D(CancellationException cancellationException) {
        C(cancellationException);
    }

    public final boolean E(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        hp hpVar = (hp) we.a.getObjectVolatile(this, e);
        if (hpVar == null || hpVar == te1.e) {
            return z;
        }
        return hpVar.c(th) || z;
    }

    public String F() {
        return "Job was cancelled";
    }

    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && L();
    }

    public final void H(so0 so0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Unsafe unsafe = we.a;
        long j = e;
        hp hpVar = (hp) unsafe.getObjectVolatile(this, j);
        if (hpVar != null) {
            hpVar.a();
            unsafe.putObjectVolatile(this, j, te1.e);
        }
        ps psVar = null;
        os osVar = obj instanceof os ? (os) obj : null;
        Throwable th = osVar != null ? osVar.a : null;
        if (so0Var instanceof rt0) {
            try {
                ((rt0) so0Var).n(th);
                return;
            } catch (Throwable th2) {
                Q(new ps("Exception in completion handler " + so0Var + " for " + this, th2));
                return;
            }
        }
        oe1 oe1VarD = so0Var.d();
        if (oe1VarD != null) {
            oe1VarD.e(new a31(1), 1);
            Object objH = oe1VarD.h();
            objH.getClass();
            for (u31 u31VarI = (u31) objH; !u31VarI.equals(oe1VarD); u31VarI = u31VarI.i()) {
                if (u31VarI instanceof rt0) {
                    try {
                        ((rt0) u31VarI).n(th);
                    } catch (Throwable th3) {
                        if (psVar != null) {
                            vv.e(psVar, th3);
                        } else {
                            psVar = new ps("Exception in completion handler " + u31VarI + " for " + this, th3);
                        }
                    }
                }
            }
            if (psVar != null) {
                Q(psVar);
            }
        }
    }

    public final Throwable I(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        vt0 vt0Var = (vt0) obj;
        Object objO = vt0Var.O();
        if (objO instanceof ut0) {
            thC = ((ut0) objO).c();
        } else if (objO instanceof os) {
            thC = ((os) objO).a;
        } else {
            if (objO instanceof so0) {
                qj.i(objO, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new pt0("Parent job is ".concat(e0(objO)), thC, vt0Var) : cancellationException;
    }

    public final Object J(ut0 ut0Var, Object obj) throws Throwable {
        Throwable th;
        vt0 vt0Var;
        ut0 ut0Var2;
        os osVar = obj instanceof os ? (os) obj : null;
        Throwable th2 = osVar != null ? osVar.a : null;
        synchronized (ut0Var) {
            try {
                ut0Var.e();
                ArrayList arrayListG = ut0Var.g(th2);
                Throwable thK = K(ut0Var, arrayListG);
                if (thK != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListG.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thK && th3 != thK && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    vv.e(thK, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thK != null && thK != th2) {
                    obj = new os(thK, false);
                }
                if (thK != null && (E(thK) || P(thK))) {
                    obj.getClass();
                    we.a.compareAndSwapInt((os) obj, os.b, 0, 1);
                }
                Z(obj);
                Object to0Var = obj instanceof so0 ? new to0((so0) obj) : obj;
                while (true) {
                    Unsafe unsafe = we.a;
                    long j = f;
                    vt0Var = this;
                    ut0Var2 = ut0Var;
                    if (unsafe.compareAndSwapObject(vt0Var, j, ut0Var2, to0Var) || unsafe.getObjectVolatile(vt0Var, j) != ut0Var2) {
                        break;
                    }
                    this = vt0Var;
                    ut0Var = ut0Var2;
                }
                vt0Var.H(ut0Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Throwable K(ut0 ut0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (ut0Var.e()) {
                return new pt0(F(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof ug2) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof ug2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof ls;
    }

    public final oe1 N(so0 so0Var) {
        oe1 oe1VarD = so0Var.d();
        if (oe1VarD != null) {
            return oe1VarD;
        }
        if (so0Var instanceof xa0) {
            return new oe1();
        }
        if (so0Var instanceof rt0) {
            c0((rt0) so0Var);
            return null;
        }
        qj.i(so0Var, "State should have list: ");
        return null;
    }

    public final Object O() {
        return we.a.getObjectVolatile(this, f);
    }

    public boolean P(Throwable th) {
        return false;
    }

    public final void R(ot0 ot0Var) {
        long j = e;
        te1 te1Var = te1.e;
        if (ot0Var == null) {
            we.a.putObjectVolatile(this, j, te1Var);
            return;
        }
        ot0Var.start();
        hp hpVarJ = ot0Var.j(this);
        Unsafe unsafe = we.a;
        unsafe.putObjectVolatile(this, j, hpVarJ);
        if (O() instanceof so0) {
            return;
        }
        hpVarJ.a();
        unsafe.putObjectVolatile(this, j, te1Var);
    }

    public final e60 S(boolean z, rt0 rt0Var) {
        vt0 vt0Var;
        rt0 rt0Var2;
        boolean zE;
        rt0Var.h = this;
        loop0: while (true) {
            Object objO = this.O();
            if (!(objO instanceof xa0)) {
                vt0Var = this;
                rt0Var2 = rt0Var;
                boolean z2 = objO instanceof so0;
                te1 te1Var = te1.e;
                if (z2) {
                    so0 so0Var = (so0) objO;
                    oe1 oe1VarD = so0Var.d();
                    if (oe1VarD == null) {
                        vt0Var.c0((rt0) objO);
                    } else {
                        if (rt0Var2.m()) {
                            ut0 ut0Var = so0Var instanceof ut0 ? (ut0) so0Var : null;
                            Throwable thC = ut0Var != null ? ut0Var.c() : null;
                            if (thC == null) {
                                zE = oe1VarD.e(rt0Var2, 5);
                            } else if (z) {
                                rt0Var2.n(thC);
                                return te1Var;
                            }
                        } else {
                            zE = oe1VarD.e(rt0Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    this = vt0Var;
                    rt0Var = rt0Var2;
                } else if (z) {
                    Object objO2 = vt0Var.O();
                    os osVar = objO2 instanceof os ? (os) objO2 : null;
                    rt0Var2.n(osVar != null ? osVar.a : null);
                }
                return te1Var;
            }
            xa0 xa0Var = (xa0) objO;
            if (xa0Var.e) {
                while (true) {
                    Unsafe unsafe = we.a;
                    long j = f;
                    vt0Var = this;
                    rt0Var2 = rt0Var;
                    if (unsafe.compareAndSwapObject(vt0Var, j, objO, rt0Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(vt0Var, j) != objO) {
                        break;
                    }
                    this = vt0Var;
                    rt0Var = rt0Var2;
                }
            } else {
                vt0Var = this;
                rt0Var2 = rt0Var;
                vt0Var.b0(xa0Var);
            }
            this = vt0Var;
            rt0Var = rt0Var2;
        }
        return rt0Var2;
    }

    public boolean T() {
        return this instanceof bj;
    }

    public final boolean U(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objF0;
        do {
            objF0 = f0(O(), obj);
            if (objF0 == nj2.n0) {
                return false;
            }
            if (objF0 == nj2.o0) {
                return true;
            }
        } while (objF0 == nj2.p0);
        x(objF0);
        return true;
    }

    public final Object V(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objF0;
        do {
            objF0 = f0(O(), obj);
            if (objF0 == nj2.n0) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                os osVar = obj instanceof os ? (os) obj : null;
                throw new IllegalStateException(str, osVar != null ? osVar.a : null);
            }
        } while (objF0 == nj2.p0);
        return objF0;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final void Y(oe1 oe1Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        oe1Var.e(new a31(4), 4);
        Object objH = oe1Var.h();
        objH.getClass();
        ps psVar = null;
        for (u31 u31VarI = (u31) objH; !u31VarI.equals(oe1Var); u31VarI = u31VarI.i()) {
            if ((u31VarI instanceof rt0) && ((rt0) u31VarI).m()) {
                try {
                    ((rt0) u31VarI).n(th);
                } catch (Throwable th2) {
                    if (psVar != null) {
                        vv.e(psVar, th2);
                    } else {
                        psVar = new ps("Exception in completion handler " + u31VarI + " for " + this, th2);
                    }
                }
            }
        }
        if (psVar != null) {
            Q(psVar);
        }
        E(th);
    }

    @Override // defpackage.ot0
    public boolean b() {
        Object objO = O();
        return (objO instanceof so0) && ((so0) objO).b();
    }

    public final void b0(xa0 xa0Var) {
        oe1 oe1Var = new oe1();
        Object ro0Var = xa0Var.e ? oe1Var : new ro0(oe1Var);
        while (true) {
            Unsafe unsafe = we.a;
            long j = f;
            vt0 vt0Var = this;
            xa0 xa0Var2 = xa0Var;
            if (unsafe.compareAndSwapObject(vt0Var, j, xa0Var2, ro0Var) || unsafe.getObjectVolatile(vt0Var, j) != xa0Var2) {
                return;
            }
            this = vt0Var;
            xa0Var = xa0Var2;
        }
    }

    public final void c0(rt0 rt0Var) {
        rt0 rt0Var2;
        vt0 vt0Var;
        oe1 oe1Var = new oe1();
        Unsafe unsafe = we.a;
        unsafe.putObjectVolatile(oe1Var, u31.f, rt0Var);
        long j = u31.e;
        unsafe.putObjectVolatile(oe1Var, j, rt0Var);
        loop0: while (true) {
            if (rt0Var.h() != rt0Var) {
                rt0Var2 = rt0Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = we.a;
                rt0Var2 = rt0Var;
                if (unsafe2.compareAndSwapObject(rt0Var2, u31.e, rt0Var, oe1Var)) {
                    oe1Var.g(rt0Var2);
                    break loop0;
                }
                vt0Var = this;
                rt0Var = rt0Var2;
                if (unsafe2.getObjectVolatile(rt0Var2, j) != rt0Var2) {
                    break;
                } else {
                    this = vt0Var;
                }
            }
            this = vt0Var;
        }
        u31 u31VarI = rt0Var2.i();
        while (true) {
            Unsafe unsafe3 = we.a;
            long j2 = f;
            vt0 vt0Var2 = this;
            if (unsafe3.compareAndSwapObject(vt0Var2, j2, rt0Var2, u31VarI) || unsafe3.getObjectVolatile(vt0Var2, j2) != rt0Var2) {
                return;
            } else {
                this = vt0Var2;
            }
        }
    }

    @Override // defpackage.ot0, defpackage.lo
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new pt0(F(), null, this);
        }
        D(cancellationException);
    }

    public final int d0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof xa0;
        long j = f;
        if (z) {
            if (((xa0) obj).e) {
                return 0;
            }
            xa0 xa0Var = nj2.t0;
            do {
                unsafe2 = we.a;
                if (unsafe2.compareAndSwapObject(this, f, obj, xa0Var)) {
                    a0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof ro0)) {
            return 0;
        }
        oe1 oe1Var = ((ro0) obj).e;
        do {
            unsafe = we.a;
            if (unsafe.compareAndSwapObject(this, f, obj, oe1Var)) {
                a0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object f0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof so0)) {
            return nj2.n0;
        }
        if ((!(obj instanceof xa0) && !(obj instanceof rt0)) || (obj instanceof ip) || (obj2 instanceof os)) {
            vt0 vt0Var = this;
            so0 so0Var = (so0) obj;
            oe1 oe1VarN = vt0Var.N(so0Var);
            if (oe1VarN == null) {
                return nj2.p0;
            }
            ut0 ut0Var = so0Var instanceof ut0 ? (ut0) so0Var : null;
            if (ut0Var == null) {
                ut0Var = new ut0(oe1VarN, null);
            }
            ut0 ut0Var2 = ut0Var;
            synchronized (ut0Var2) {
                if (ut0Var2.f()) {
                    return nj2.n0;
                }
                we.a.putIntVolatile(ut0Var2, ut0.g, 1);
                if (ut0Var2 != so0Var) {
                    while (true) {
                        Unsafe unsafe = we.a;
                        long j = f;
                        vt0 vt0Var2 = vt0Var;
                        vt0Var = vt0Var2;
                        if (unsafe.compareAndSwapObject(vt0Var2, j, so0Var, ut0Var2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(vt0Var, j) != so0Var) {
                            return nj2.p0;
                        }
                    }
                }
                boolean zE = ut0Var2.e();
                os osVar = obj2 instanceof os ? (os) obj2 : null;
                if (osVar != null) {
                    ut0Var2.a(osVar.a);
                }
                Throwable thC = zE ? null : ut0Var2.c();
                if (thC != null) {
                    vt0Var.Y(oe1VarN, thC);
                }
                ip ipVarX = X(oe1VarN);
                if (ipVarX != null && vt0Var.g0(ut0Var2, ipVarX, obj2)) {
                    return nj2.o0;
                }
                oe1VarN.e(new a31(2), 2);
                ip ipVarX2 = X(oe1VarN);
                return (ipVarX2 == null || !vt0Var.g0(ut0Var2, ipVarX2, obj2)) ? vt0Var.J(ut0Var2, obj2) : nj2.o0;
            }
        }
        so0 so0Var2 = (so0) obj;
        Object to0Var = obj2 instanceof so0 ? new to0((so0) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = we.a;
            long j2 = f;
            vt0 vt0Var3 = this;
            if (unsafe2.compareAndSwapObject(vt0Var3, j2, so0Var2, to0Var)) {
                vt0Var3.Z(obj2);
                vt0Var3.H(so0Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(vt0Var3, j2) != so0Var2) {
                return nj2.p0;
            }
            this = vt0Var3;
        }
    }

    public final boolean g0(ut0 ut0Var, ip ipVar, Object obj) {
        while (mx.C(ipVar.i, false, new tt0(this, ut0Var, ipVar, obj)) == te1.e) {
            ipVar = X(ipVar);
            if (ipVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sy
    public final ty getKey() {
        return q90.P;
    }

    @Override // defpackage.ot0
    public final hp j(vt0 vt0Var) {
        vt0 vt0Var2;
        ip ipVar = new ip(vt0Var);
        ipVar.h = this;
        loop0: while (true) {
            Object objO = this.O();
            if (objO instanceof xa0) {
                xa0 xa0Var = (xa0) objO;
                if (xa0Var.e) {
                    while (true) {
                        Unsafe unsafe = we.a;
                        long j = f;
                        vt0Var2 = this;
                        if (unsafe.compareAndSwapObject(vt0Var2, j, objO, ipVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(vt0Var2, j) != objO) {
                            break;
                        }
                        this = vt0Var2;
                    }
                } else {
                    vt0Var2 = this;
                    vt0Var2.b0(xa0Var);
                }
                this = vt0Var2;
            } else {
                vt0Var2 = this;
                boolean z = objO instanceof so0;
                te1 te1Var = te1.e;
                Throwable thC = null;
                if (!z) {
                    Object objO2 = vt0Var2.O();
                    os osVar = objO2 instanceof os ? (os) objO2 : null;
                    ipVar.n(osVar != null ? osVar.a : null);
                    return te1Var;
                }
                oe1 oe1VarD = ((so0) objO).d();
                if (oe1VarD != null) {
                    if (oe1VarD.e(ipVar, 7)) {
                        break;
                    }
                    boolean zE = oe1VarD.e(ipVar, 3);
                    Object objO3 = vt0Var2.O();
                    if (objO3 instanceof ut0) {
                        thC = ((ut0) objO3).c();
                    } else {
                        os osVar2 = objO3 instanceof os ? (os) objO3 : null;
                        if (osVar2 != null) {
                            thC = osVar2.a;
                        }
                    }
                    ipVar.n(thC);
                    if (zE) {
                        break;
                    }
                    return te1Var;
                }
                vt0Var2.c0((rt0) objO);
                this = vt0Var2;
            }
        }
        return ipVar;
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        return ex.t(this, tyVar);
    }

    @Override // defpackage.ot0
    public final CancellationException r() {
        CancellationException cancellationException;
        Object objO = O();
        if (objO instanceof ut0) {
            Throwable thC = ((ut0) objO).c();
            if (thC == null) {
                qj.i(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new pt0(strConcat, thC, this) : cancellationException;
        }
        if (objO instanceof so0) {
            qj.i(this, "Job is still new or active: ");
            return null;
        }
        if (!(objO instanceof os)) {
            return new pt0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((os) objO).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new pt0(F(), th, this) : cancellationException;
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.ot0
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(O());
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    @Override // defpackage.ot0
    public final e60 t(ej0 ej0Var) {
        return S(true, new it0(ej0Var));
    }

    public final String toString() {
        return (W() + '{' + e0(O()) + '}') + '@' + j20.s(this);
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        return ex.E(this, tyVar);
    }

    public void z(Object obj) {
        x(obj);
    }

    public void a0() {
    }

    public void Q(ps psVar) {
        throw psVar;
    }

    public void Z(Object obj) {
    }

    public void x(Object obj) {
    }
}

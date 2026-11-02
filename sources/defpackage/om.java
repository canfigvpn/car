package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class om extends r50 implements nm, gz, jo2 {
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final sx h;
    public final uy i;

    static {
        Unsafe unsafe = we.a;
        j = unsafe.objectFieldOffset(om.class.getDeclaredField("_decisionAndIndex$volatile"));
        l = unsafe.objectFieldOffset(om.class.getDeclaredField("_state$volatile"));
        k = unsafe.objectFieldOffset(om.class.getDeclaredField("_parentHandle$volatile"));
    }

    public om(int i, sx sxVar) {
        super(i);
        this.h = sxVar;
        this.i = sxVar.f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d2.a;
    }

    public static void B(ve1 ve1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + ve1Var + ", already has " + obj).toString());
    }

    public static Object G(ve1 ve1Var, Object obj, int i, jj0 jj0Var) {
        if (obj instanceof os) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (jj0Var != null || (ve1Var instanceof km)) {
            return new ms(obj, ve1Var instanceof km ? (km) ve1Var : null, jj0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        if (this.g == 2) {
            return we.a.getObjectVolatile((p50) this.h, p50.l) != null;
        }
        return false;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        om omVar;
        sx sxVar = this.h;
        Throwable th = null;
        p50 p50Var = sxVar instanceof p50 ? (p50) sxVar : null;
        if (p50Var != null) {
            long j2 = p50.l;
            loop0: while (true) {
                Object objectVolatile = we.a.getObjectVolatile(p50Var, j2);
                pa0 pa0Var = ws0.q;
                if (objectVolatile == pa0Var) {
                    while (true) {
                        Unsafe unsafe = we.a;
                        om omVar2 = this;
                        omVar = omVar2;
                        if (unsafe.compareAndSwapObject(p50Var, p50.l, pa0Var, omVar2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(p50Var, j2) != pa0Var) {
                            break;
                        } else {
                            this = omVar;
                        }
                    }
                    this = omVar;
                } else {
                    omVar = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        qj.i(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = we.a;
                        if (unsafe2.compareAndSwapObject(p50Var, p50.l, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(p50Var, j2) != objectVolatile) {
                            qj.r("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            omVar.q();
            omVar.o(th);
        }
    }

    public final void E(Object obj, int i, jj0 jj0Var) throws IllegalAccessException, InvocationTargetException {
        om omVar;
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof ve1)) {
                om omVar2 = this;
                if (objectVolatile instanceof qm) {
                    qm qmVar = (qm) objectVolatile;
                    if (unsafe.compareAndSwapInt(qmVar, qm.c, 0, 1)) {
                        if (jj0Var != null) {
                            omVar2.l(jj0Var, qmVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                qj.i(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objG = G((ve1) objectVolatile, obj, i, jj0Var);
            while (true) {
                Unsafe unsafe2 = we.a;
                omVar = this;
                if (unsafe2.compareAndSwapObject(omVar, l, objectVolatile, objG)) {
                    if (!omVar.A()) {
                        omVar.q();
                    }
                    omVar.r(i);
                    return;
                } else if (unsafe2.getObjectVolatile(omVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = omVar;
                }
            }
            this = omVar;
        }
    }

    public final void F(xy xyVar) throws IllegalAccessException, InvocationTargetException {
        sx sxVar = this.h;
        p50 p50Var = sxVar instanceof p50 ? (p50) sxVar : null;
        E(ll2.a, (p50Var != null ? p50Var.h : null) == xyVar ? 4 : this.g, null);
    }

    @Override // defpackage.jo2
    public final void a(gz1 gz1Var, int i) {
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = j;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if ((intVolatile & 536870911) != 536870911) {
                fu1.h("invokeOnCancellation should be called at most once");
                return;
            }
            om omVar = this;
            if (unsafe.compareAndSwapInt(omVar, j2, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                omVar.z(gz1Var);
                return;
            }
            this = omVar;
        }
    }

    @Override // defpackage.r50
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        om omVar;
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile instanceof ve1) {
                fu1.h("Not completed");
                return;
            }
            if (objectVolatile instanceof os) {
                return;
            }
            if (objectVolatile instanceof ms) {
                ms msVar = (ms) objectVolatile;
                if (msVar.e != null) {
                    fu1.h("Must be called at most once");
                    return;
                }
                ms msVarA = ms.a(msVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = we.a;
                    om omVar2 = this;
                    if (unsafe2.compareAndSwapObject(omVar2, l, objectVolatile, msVarA)) {
                        km kmVar = msVar.b;
                        if (kmVar != null) {
                            omVar2.k(kmVar, cancellationException);
                        }
                        jj0 jj0Var = msVar.c;
                        if (jj0Var != null) {
                            omVar2.l(jj0Var, cancellationException, msVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(omVar2, j2) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        omVar = omVar2;
                        break;
                    }
                    this = omVar2;
                }
            } else {
                om omVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                ms msVar2 = new ms(objectVolatile, (km) null, (jj0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    ms msVar3 = msVar2;
                    Unsafe unsafe3 = we.a;
                    omVar = omVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(omVar, l, objectVolatile, msVar3);
                    msVar2 = msVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(omVar, j2) != objectVolatile) {
                        break;
                    } else {
                        omVar3 = omVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = omVar;
        }
    }

    @Override // defpackage.r50
    public final sx c() {
        return this.h;
    }

    @Override // defpackage.r50
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // defpackage.gz
    public final gz e() {
        sx sxVar = this.h;
        if (sxVar instanceof gz) {
            return (gz) sxVar;
        }
        return null;
    }

    @Override // defpackage.sx
    public final uy f() {
        return this.i;
    }

    @Override // defpackage.r50
    public final Object g(Object obj) {
        return obj instanceof ms ? ((ms) obj).a : obj;
    }

    @Override // defpackage.sx
    public final void i(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = vt1.a(obj);
        if (thA != null) {
            obj = new os(thA, false);
        }
        E(obj, this.g, null);
    }

    @Override // defpackage.r50
    public final Object j() {
        return u();
    }

    public final void k(km kmVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            switch (kmVar.a) {
                case 0:
                    ((ScheduledFuture) kmVar.b).cancel(false);
                    break;
                case 1:
                    ((ej0) kmVar.b).h(th);
                    break;
                default:
                    ((e60) kmVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            mx.B(this.i, new ps("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(jj0 jj0Var, Throwable th, Object obj) throws IllegalAccessException, InvocationTargetException {
        uy uyVar = this.i;
        try {
            jj0Var.d(th, obj, uyVar);
        } catch (Throwable th2) {
            mx.B(uyVar, new ps("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.nm
    public final void m(Object obj, jj0 jj0Var) throws IllegalAccessException, InvocationTargetException {
        E(obj, this.g, jj0Var);
    }

    @Override // defpackage.nm
    public final pa0 n(Object obj, jj0 jj0Var) {
        om omVar;
        pa0 pa0Var = ws0.k;
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof ve1)) {
                return null;
            }
            Object objG = G((ve1) objectVolatile, obj, this.g, jj0Var);
            while (true) {
                Unsafe unsafe2 = we.a;
                omVar = this;
                if (unsafe2.compareAndSwapObject(omVar, l, objectVolatile, objG)) {
                    if (!omVar.A()) {
                        omVar.q();
                    }
                    return pa0Var;
                }
                if (unsafe2.getObjectVolatile(omVar, j2) != objectVolatile) {
                    break;
                }
                this = omVar;
            }
            this = omVar;
        }
    }

    @Override // defpackage.nm
    public final boolean o(Throwable th) {
        om omVar;
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof ve1)) {
                return false;
            }
            qm qmVar = new qm(this, th, (objectVolatile instanceof km) || (objectVolatile instanceof gz1));
            while (true) {
                Unsafe unsafe2 = we.a;
                omVar = this;
                if (unsafe2.compareAndSwapObject(omVar, l, objectVolatile, qmVar)) {
                    ve1 ve1Var = (ve1) objectVolatile;
                    if (ve1Var instanceof km) {
                        omVar.k((km) objectVolatile, th);
                    } else if (ve1Var instanceof gz1) {
                        omVar.p((gz1) objectVolatile, th);
                    }
                    if (!omVar.A()) {
                        omVar.q();
                    }
                    omVar.r(omVar.g);
                    return true;
                }
                if (unsafe2.getObjectVolatile(omVar, j2) != objectVolatile) {
                    break;
                }
                this = omVar;
            }
            this = omVar;
        }
    }

    public final void p(gz1 gz1Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        uy uyVar = this.i;
        int intVolatile = we.a.getIntVolatile(this, j) & 536870911;
        if (intVolatile == 536870911) {
            fu1.h("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            gz1Var.g(intVolatile, uyVar);
        } catch (Throwable th2) {
            mx.B(uyVar, new ps("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q() {
        Unsafe unsafe = we.a;
        long j2 = k;
        e60 e60Var = (e60) unsafe.getObjectVolatile(this, j2);
        if (e60Var == null) {
            return;
        }
        e60Var.a();
        unsafe.putObjectVolatile(this, j2, te1.e);
    }

    public final void r(int i) {
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = j;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    fu1.h("Already resumed");
                    return;
                }
                boolean z = i == 4;
                sx sxVar = this.h;
                if (!z && (sxVar instanceof p50)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.g;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        p50 p50Var = (p50) sxVar;
                        xy xyVar = p50Var.h;
                        uy uyVarF = p50Var.i.f();
                        if (xyVar.G(uyVarF)) {
                            xyVar.E(uyVarF, this);
                            return;
                        }
                        ac0 ac0VarA = ig2.a();
                        if (ac0VarA.g >= 4294967296L) {
                            ac0VarA.J(this);
                            return;
                        }
                        ac0VarA.K(true);
                        try {
                            ex.L(this, sxVar, true);
                            do {
                            } while (ac0VarA.M());
                        } catch (Throwable th) {
                            try {
                                this.h(th);
                            } finally {
                                ac0VarA.I(true);
                            }
                        }
                        return;
                    }
                }
                ex.L(this, sxVar, z);
                return;
            }
            om omVar = this;
            if (unsafe.compareAndSwapInt(omVar, j2, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = omVar;
            }
        }
    }

    public Throwable s(vt0 vt0Var) {
        return vt0Var.r();
    }

    public final Object t() {
        ot0 ot0Var;
        boolean zA = A();
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = j;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    fu1.h("Already suspended");
                    return null;
                }
                if (zA) {
                    this.D();
                }
                Object objU = this.u();
                if (objU instanceof os) {
                    throw ((os) objU).a;
                }
                int i2 = this.g;
                if ((i2 != 1 && i2 != 2) || (ot0Var = (ot0) this.i.p(q90.P)) == null || ot0Var.b()) {
                    return this.g(objU);
                }
                CancellationException cancellationExceptionR = ot0Var.r();
                this.b(cancellationExceptionR);
                throw cancellationExceptionR;
            }
            om omVar = this;
            if (unsafe.compareAndSwapInt(omVar, j2, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((e60) unsafe.getObjectVolatile(omVar, k)) == null) {
                    omVar.w();
                }
                if (zA) {
                    omVar.D();
                }
                return fz.e;
            }
            this = omVar;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(C());
        sb.append('(');
        sb.append(j20.D(this.h));
        sb.append("){");
        Object objU = u();
        if (objU instanceof ve1) {
            str = "Active";
        } else {
            str = objU instanceof qm ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(j20.s(this));
        return sb.toString();
    }

    public final Object u() {
        return we.a.getObjectVolatile(this, l);
    }

    public final void v() {
        e60 e60VarW = w();
        if (e60VarW == null || (u() instanceof ve1)) {
            return;
        }
        e60VarW.a();
        we.a.putObjectVolatile(this, k, te1.e);
    }

    public final e60 w() {
        ot0 ot0Var = (ot0) this.i.p(q90.P);
        if (ot0Var == null) {
            return null;
        }
        e60 e60VarC = mx.C(ot0Var, true, new gp(this));
        while (true) {
            Unsafe unsafe = we.a;
            long j2 = k;
            om omVar = this;
            if (unsafe.compareAndSwapObject(omVar, j2, (Object) null, e60VarC) || unsafe.getObjectVolatile(omVar, j2) != null) {
                break;
            }
            this = omVar;
        }
        return e60VarC;
    }

    public final void x(ej0 ej0Var) {
        z(new km(1, ej0Var));
    }

    @Override // defpackage.nm
    public final void y(Object obj) {
        r(this.g);
    }

    public final void z(ve1 ve1Var) {
        ve1 ve1Var2;
        om omVar;
        om omVar2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = we.a;
            long j2 = l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile instanceof d2) {
                while (true) {
                    Unsafe unsafe3 = we.a;
                    om omVar3 = this;
                    ve1 ve1Var3 = ve1Var;
                    omVar = omVar3;
                    ve1Var2 = ve1Var3;
                    if (unsafe3.compareAndSwapObject(omVar3, l, objectVolatile, ve1Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(omVar, j2) != objectVolatile) {
                        break;
                    }
                    this = omVar;
                    ve1Var = ve1Var2;
                }
            } else {
                ve1Var2 = ve1Var;
                omVar = this;
                if ((objectVolatile instanceof km) || (objectVolatile instanceof gz1)) {
                    B(ve1Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof os) {
                    os osVar = (os) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(osVar, os.b, 0, 1)) {
                        B(ve1Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof qm) {
                        Throwable th = osVar.a;
                        if (ve1Var2 instanceof km) {
                            omVar.k((km) ve1Var2, th);
                            return;
                        } else {
                            omVar.p((gz1) ve1Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof ms) {
                    ms msVar = (ms) objectVolatile;
                    if (msVar.b != null) {
                        B(ve1Var2, objectVolatile);
                        throw null;
                    }
                    if (ve1Var2 instanceof gz1) {
                        return;
                    }
                    km kmVar = (km) ve1Var2;
                    Throwable th2 = msVar.e;
                    if (th2 != null) {
                        omVar.k(kmVar, th2);
                        return;
                    }
                    ms msVarA = ms.a(msVar, kmVar, null, 29);
                    do {
                        unsafe = we.a;
                        if (unsafe.compareAndSwapObject(omVar, l, objectVolatile, msVarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(omVar, j2) == objectVolatile);
                } else {
                    if (ve1Var2 instanceof gz1) {
                        return;
                    }
                    ms msVar2 = new ms(objectVolatile, (km) ve1Var2, (jj0) null, (Throwable) null, 28);
                    while (true) {
                        ms msVar3 = msVar2;
                        Unsafe unsafe4 = we.a;
                        omVar2 = omVar;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(omVar2, l, objectVolatile, msVar3);
                        msVar2 = msVar3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(omVar2, j2) != objectVolatile) {
                            break;
                        } else {
                            omVar = omVar2;
                        }
                    }
                }
                this = omVar2;
                ve1Var = ve1Var2;
            }
            omVar2 = omVar;
            this = omVar2;
            ve1Var = ve1Var2;
        }
    }
}

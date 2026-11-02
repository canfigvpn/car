package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kw implements gw {
    public final io1 e;
    public final io1 f;
    public final is1 g;
    public final ThreadLocal h;
    public final AtomicBoolean i;
    public final long j;

    public kw(final dq0 dq0Var, final String str, int i) {
        long jP;
        str.getClass();
        this.g = new is1(24);
        this.h = new ThreadLocal();
        final int i2 = 0;
        this.i = new AtomicBoolean(false);
        w40 w40Var = w80.f;
        z80 z80Var = z80.SECONDS;
        if (z80Var.compareTo(z80Var) <= 0) {
            int i3 = x80.a;
            jP = 60000000000L;
        } else {
            jP = rw.P(30L, z80Var);
        }
        this.j = jP;
        if (i <= 0) {
            qj.r("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.e = new io1(i, new ti0() { // from class: hw
            @Override // defpackage.ti0
            public final Object a() {
                int i4 = i2;
                String str2 = str;
                dq0 dq0Var2 = dq0Var;
                switch (i4) {
                    case 0:
                        vv1 vv1VarD = dq0Var2.d(str2);
                        ix.t(vv1VarD, "PRAGMA query_only = 1");
                        return vv1VarD;
                    default:
                        return dq0Var2.d(str2);
                }
            }
        });
        final int i4 = 1;
        this.f = new io1(1, new ti0() { // from class: hw
            @Override // defpackage.ti0
            public final Object a() {
                int i5 = i4;
                String str2 = str;
                dq0 dq0Var2 = dq0Var;
                switch (i5) {
                    case 0:
                        vv1 vv1VarD = dq0Var2.d(str2);
                        ix.t(vv1VarD, "PRAGMA query_only = 1");
                        return vv1VarD;
                    default:
                        return dq0Var2.d(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.i.compareAndSet(false, true)) {
            this.e.c();
            this.f.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #3 {all -> 0x0075, blocks: (B:23:0x006e, B:64:0x0120, B:69:0x0138, B:71:0x0143, B:84:0x019b, B:85:0x01a2), top: B:111:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #3 {all -> 0x0075, blocks: (B:23:0x006e, B:64:0x0120, B:69:0x0138, B:71:0x0143, B:84:0x019b, B:85:0x01a2), top: B:111:0x006e }] */
    @Override // defpackage.gw
    public final Object i(boolean z, ij0 ij0Var, tx txVar) throws IllegalAccessException, InvocationTargetException {
        jw jwVar;
        gs1 gs1Var;
        Throwable th;
        io1 io1Var;
        ThreadLocal threadLocal;
        ij0 ij0Var2;
        io1 io1Var2;
        gs1 gs1Var2;
        boolean z2;
        is1 is1Var;
        boolean z3;
        Object obj;
        gs1 gs1Var3;
        qo1 qo1Var;
        lw lwVar;
        if (txVar instanceof jw) {
            jwVar = (jw) txVar;
            int i = jwVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwVar.q = i - Integer.MIN_VALUE;
            } else {
                jwVar = new jw(this, txVar);
            }
        } else {
            jwVar = new jw(this, txVar);
        }
        uy uyVar = jwVar.f;
        Object objK = jwVar.o;
        int i2 = jwVar.q;
        ThreadLocal threadLocal2 = this.h;
        io1 io1Var3 = this.f;
        io1 io1Var4 = this.e;
        is1 is1Var2 = this.g;
        sx sxVar = null;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(objK);
            if (this.i.get()) {
                ix.R("Connection pool is closed", 21);
                throw null;
            }
            qo1 qo1Var2 = (qo1) threadLocal2.get();
            if (qo1Var2 == null) {
                uyVar.getClass();
                fw fwVar = (fw) uyVar.p(is1Var2);
                qo1Var2 = fwVar != null ? fwVar.f : null;
            }
            if (qo1Var2 == null) {
                io1 io1Var5 = z ? io1Var4 : io1Var3;
                gs1Var = new gs1();
                try {
                    uyVar.getClass();
                    long j = this.j;
                    threadLocal = threadLocal2;
                    iw iwVar = new iw(this, z, 0);
                    jwVar.i = ij0Var;
                    jwVar.j = io1Var5;
                    jwVar.k = gs1Var;
                    jwVar.l = uyVar;
                    jwVar.m = gs1Var;
                    jwVar.n = is1Var2;
                    jwVar.h = z;
                    jwVar.q = 3;
                    Object objB = io1Var5.b(j, iwVar, jwVar);
                    if (objB != fzVar) {
                        ij0Var2 = ij0Var;
                        io1Var2 = io1Var5;
                        gs1Var2 = gs1Var;
                        objK = objB;
                        z2 = z;
                        is1Var = is1Var2;
                        lw lwVar2 = (lw) objK;
                        lwVar2.getClass();
                        uyVar.getClass();
                        lwVar2.g = uyVar;
                        lwVar2.h = new Throwable();
                        if (io1Var4 == io1Var3) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        gs1Var2.e = new qo1(is1Var, lwVar2, z3);
                        obj = gs1Var.e;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        qo1 qo1Var3 = (qo1) obj;
                        uy uyVarF = ex.F(new fw(is1Var2, qo1Var3), new hg2(qo1Var3, threadLocal));
                        e eVar = new e(12, null, ij0Var2, gs1Var);
                        jwVar.i = io1Var2;
                        jwVar.j = gs1Var;
                        jwVar.k = null;
                        jwVar.l = null;
                        jwVar.m = null;
                        jwVar.n = null;
                        jwVar.q = 4;
                        objK = nj2.K(uyVarF, eVar, jwVar);
                        if (objK != fzVar) {
                            gs1Var3 = gs1Var;
                            io1Var = io1Var2;
                            qo1Var = (qo1) gs1Var3.e;
                            if (qo1Var != null) {
                                lwVar = qo1Var.b;
                                if (qo1Var.e.compareAndSet(false, true)) {
                                    ix.t(lwVar, "ROLLBACK TRANSACTION");
                                }
                                lwVar.g = null;
                                lwVar.h = null;
                                io1Var.e(lwVar);
                            }
                            return objK;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    io1Var = io1Var5;
                }
            } else {
                if (!z && qo1Var2.c) {
                    ix.R("Cannot upgrade connection from reader to writer", 1);
                    throw null;
                }
                uyVar.getClass();
                if (uyVar.p(is1Var2) == null) {
                    uy uyVarF2 = ex.F(new fw(is1Var2, qo1Var2), new hg2(qo1Var2, threadLocal2));
                    e eVar2 = new e(11, sxVar, ij0Var, qo1Var2);
                    jwVar.q = 1;
                    Object objK2 = nj2.K(uyVarF2, eVar2, jwVar);
                    if (objK2 != fzVar) {
                        return objK2;
                    }
                } else {
                    jwVar.q = 2;
                    Object objG = ij0Var.g(qo1Var2, jwVar);
                    if (objG != fzVar) {
                        return objG;
                    }
                }
            }
            return fzVar;
        }
        if (i2 == 1) {
            ix.Q(objK);
            return objK;
        }
        if (i2 == 2) {
            ix.Q(objK);
            return objK;
        }
        if (i2 == 3) {
            z2 = jwVar.h;
            is1Var = jwVar.n;
            gs1Var2 = jwVar.m;
            uyVar = jwVar.l;
            gs1Var = jwVar.k;
            io1Var2 = (io1) jwVar.j;
            ij0Var2 = (ij0) jwVar.i;
            try {
                ix.Q(objK);
                threadLocal = threadLocal2;
                lw lwVar3 = (lw) objK;
                lwVar3.getClass();
                uyVar.getClass();
                lwVar3.g = uyVar;
                lwVar3.h = new Throwable();
                if (io1Var4 == io1Var3 && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gs1Var2.e = new qo1(is1Var, lwVar3, z3);
                obj = gs1Var.e;
                if (obj != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                qo1 qo1Var4 = (qo1) obj;
                uy uyVarF3 = ex.F(new fw(is1Var2, qo1Var4), new hg2(qo1Var4, threadLocal));
                e eVar3 = new e(12, null, ij0Var2, gs1Var);
                jwVar.i = io1Var2;
                jwVar.j = gs1Var;
                jwVar.k = null;
                jwVar.l = null;
                jwVar.m = null;
                jwVar.n = null;
                jwVar.q = 4;
                objK = nj2.K(uyVarF3, eVar3, jwVar);
                if (objK != fzVar) {
                    gs1Var3 = gs1Var;
                    io1Var = io1Var2;
                    qo1Var = (qo1) gs1Var3.e;
                    if (qo1Var != null) {
                        lwVar = qo1Var.b;
                        if (qo1Var.e.compareAndSet(false, true)) {
                            ix.t(lwVar, "ROLLBACK TRANSACTION");
                        }
                        lwVar.g = null;
                        lwVar.h = null;
                        io1Var.e(lwVar);
                    }
                    return objK;
                }
                return fzVar;
            } catch (Throwable th3) {
                th = th3;
                io1Var = io1Var2;
            }
        } else {
            if (i2 != 4) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gs1Var3 = (gs1) jwVar.j;
            io1Var = (io1) jwVar.i;
            try {
                ix.Q(objK);
                qo1Var = (qo1) gs1Var3.e;
                if (qo1Var != null) {
                    lwVar = qo1Var.b;
                    if (qo1Var.e.compareAndSet(false, true) && lwVar.e.l()) {
                        ix.t(lwVar, "ROLLBACK TRANSACTION");
                    }
                    lwVar.g = null;
                    lwVar.h = null;
                    io1Var.e(lwVar);
                }
                return objK;
            } catch (Throwable th4) {
                gs1Var = gs1Var3;
                th = th4;
            }
        }
        try {
            throw th;
        } catch (Throwable th5) {
            try {
                qo1 qo1Var5 = (qo1) gs1Var.e;
                if (qo1Var5 == null) {
                    throw th5;
                }
                lw lwVar4 = qo1Var5.b;
                if (qo1Var5.e.compareAndSet(false, true) && lwVar4.e.l()) {
                    ix.t(lwVar4, "ROLLBACK TRANSACTION");
                }
                lw lwVar5 = qo1Var5.b;
                lwVar5.g = null;
                lwVar5.h = null;
                io1Var.e(lwVar5);
                throw th5;
            } catch (Throwable th6) {
                vv.e(th, th6);
                throw th5;
            }
        }
    }

    public kw(dq0 dq0Var) {
        long jP;
        this.g = new is1(24);
        this.h = new ThreadLocal();
        this.i = new AtomicBoolean(false);
        w40 w40Var = w80.f;
        z80 z80Var = z80.SECONDS;
        if (z80Var.compareTo(z80Var) <= 0) {
            int i = x80.a;
            jP = 60000000000L;
        } else {
            jP = rw.P(30L, z80Var);
        }
        this.j = jP;
        io1 io1Var = new io1(1, new w8(5, dq0Var));
        this.e = io1Var;
        this.f = io1Var;
    }
}

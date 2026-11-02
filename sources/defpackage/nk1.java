package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 implements yh2, fr1 {
    public final ij0 a;
    public final vv1 b;
    public final AtomicInteger c;
    public xh2 d;

    public nk1(ij0 ij0Var, vv1 vv1Var) {
        vv1Var.getClass();
        this.a = ij0Var;
        this.b = vv1Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.yh2
    public final Object a(xh2 xh2Var, ij0 ij0Var, wa2 wa2Var) {
        return this.a.g(new tn(this, xh2Var, ij0Var, null, 1), wa2Var);
    }

    @Override // defpackage.fr1
    public final vv1 b() {
        return this.b;
    }

    @Override // defpackage.yh2
    public final Boolean c(sx sxVar) {
        return Boolean.valueOf(this.d != null || this.b.l());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jo1
    public final Object d(String str, ej0 ej0Var, tx txVar) {
        lk1 lk1Var;
        if (txVar instanceof lk1) {
            lk1Var = (lk1) txVar;
            int i = lk1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk1Var.l = i - Integer.MIN_VALUE;
            } else {
                lk1Var = new lk1(this, txVar);
            }
        } else {
            lk1Var = new lk1(this, txVar);
        }
        Object objC = lk1Var.j;
        int i2 = lk1Var.l;
        Object obj = fz.e;
        if (i2 == 0) {
            ix.Q(objC);
            lk1Var.h = str;
            lk1Var.i = ej0Var;
            lk1Var.l = 1;
            objC = c(lk1Var);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ix.Q(objC);
                return objC;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ej0Var = lk1Var.i;
        str = lk1Var.h;
        ix.Q(objC);
        if (((Boolean) objC).booleanValue()) {
            mk1 mk1Var = new mk1(this, str, ej0Var, null);
            lk1Var.h = null;
            lk1Var.i = null;
            lk1Var.l = 2;
            Object objG = this.a.g(mk1Var, lk1Var);
            return objG == obj ? obj : objG;
        }
        xv1 xv1VarC = this.b.C(str);
        try {
            Object objH = ej0Var.h(xv1VarC);
            ir2.h(xv1VarC, null);
            return objH;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(xh2 xh2Var, ij0 ij0Var, tx txVar) {
        kk1 kk1Var;
        if (txVar instanceof kk1) {
            kk1Var = (kk1) txVar;
            int i = kk1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk1Var.k = i - Integer.MIN_VALUE;
            } else {
                kk1Var = new kk1(this, txVar);
            }
        } else {
            kk1Var = new kk1(this, txVar);
        }
        Object objG = kk1Var.i;
        int i2 = kk1Var.k;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        vv1 vv1Var = this.b;
        try {
            if (i2 == 0) {
                ix.Q(objG);
                int iOrdinal = xh2Var.ordinal();
                if (iOrdinal == 0) {
                    ix.t(vv1Var, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    ix.t(vv1Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        qj.p();
                        return null;
                    }
                    ix.t(vv1Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = xh2Var;
                }
                Object jk1Var = new jk1(0, this);
                kk1Var.h = 1;
                kk1Var.k = 1;
                objG = ij0Var.g(jk1Var, kk1Var);
                Object obj = fz.e;
                if (objG == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = kk1Var.h;
                ix.Q(objG);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                ix.t(vv1Var, "END TRANSACTION");
                return objG;
            }
            ix.t(vv1Var, "ROLLBACK TRANSACTION");
            return objG;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    ix.t(vv1Var, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    vv.e(th, e);
                }
                throw th2;
            }
        }
    }
}

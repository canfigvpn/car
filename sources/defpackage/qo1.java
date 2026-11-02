package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 implements yh2, fr1 {
    public final is1 a;
    public final lw b;
    public final boolean c;
    public final le d;
    public final AtomicBoolean e;

    public qo1(is1 is1Var, lw lwVar, boolean z) {
        is1Var.getClass();
        this.a = is1Var;
        this.b = lwVar;
        this.c = z;
        this.d = new le();
        this.e = new AtomicBoolean(false);
    }

    @Override // defpackage.yh2
    public final Object a(xh2 xh2Var, ij0 ij0Var, wa2 wa2Var) {
        if (this.e.get()) {
            ix.R("Connection is recycled", 21);
            throw null;
        }
        uy uyVar = wa2Var.f;
        uyVar.getClass();
        fw fwVar = (fw) uyVar.p(this.a);
        if (fwVar != null && fwVar.f == this) {
            return g(xh2Var, ij0Var, wa2Var);
        }
        ix.R("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // defpackage.fr1
    public final vv1 b() {
        return this.b;
    }

    @Override // defpackage.yh2
    public final Boolean c(sx sxVar) {
        if (this.e.get()) {
            ix.R("Connection is recycled", 21);
            throw null;
        }
        uy uyVar = ((tx) sxVar).f;
        uyVar.getClass();
        fw fwVar = (fw) uyVar.p(this.a);
        if (fwVar != null && fwVar.f == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.e.l());
        }
        ix.R("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jo1
    public final Object d(String str, ej0 ej0Var, tx txVar) {
        po1 po1Var;
        ej0 ej0Var2;
        lw lwVar;
        if (txVar instanceof po1) {
            po1Var = (po1) txVar;
            int i = po1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                po1Var.m = i - Integer.MIN_VALUE;
            } else {
                po1Var = new po1(this, txVar);
            }
        } else {
            po1Var = new po1(this, txVar);
        }
        Object obj = po1Var.k;
        int i2 = po1Var.m;
        lw lwVar2 = this.b;
        if (i2 == 0) {
            ix.Q(obj);
            if (this.e.get()) {
                ix.R("Connection is recycled", 21);
                throw null;
            }
            uy uyVar = po1Var.f;
            uyVar.getClass();
            fw fwVar = (fw) uyVar.p(this.a);
            if (fwVar == null || fwVar.f != this) {
                ix.R("Attempted to use connection on a different coroutine", 21);
                throw null;
            }
            po1Var.h = str;
            po1Var.i = ej0Var;
            po1Var.j = lwVar2;
            po1Var.m = 1;
            Object objD = lwVar2.f.d(po1Var);
            fz fzVar = fz.e;
            if (objD == fzVar) {
                return fzVar;
            }
            ej0Var2 = ej0Var;
            lwVar = lwVar2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lw lwVar3 = po1Var.j;
            ej0 ej0Var3 = po1Var.i;
            String str2 = po1Var.h;
            ix.Q(obj);
            ej0Var2 = ej0Var3;
            lwVar = lwVar3;
            str = str2;
        }
        try {
            ko1 ko1Var = new ko1(this, lwVar2.C(str));
            try {
                Object objH = ej0Var2.h(ko1Var);
                ir2.h(ko1Var, null);
                lwVar.b(null);
                return objH;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ir2.h(ko1Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            lwVar.b(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(xh2 xh2Var, tx txVar) {
        mo1 mo1Var;
        lw lwVar;
        le leVar = this.d;
        if (txVar instanceof mo1) {
            mo1Var = (mo1) txVar;
            int i = mo1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo1Var.l = i - Integer.MIN_VALUE;
            } else {
                mo1Var = new mo1(this, txVar);
            }
        } else {
            mo1Var = new mo1(this, txVar);
        }
        Object obj = mo1Var.j;
        int i2 = mo1Var.l;
        lw lwVar2 = this.b;
        if (i2 == 0) {
            ix.Q(obj);
            mo1Var.h = xh2Var;
            mo1Var.i = lwVar2;
            mo1Var.l = 1;
            Object objD = lwVar2.f.d(mo1Var);
            fz fzVar = fz.e;
            if (objD == fzVar) {
                return fzVar;
            }
            lwVar = lwVar2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lw lwVar3 = mo1Var.i;
            xh2 xh2Var2 = mo1Var.h;
            ix.Q(obj);
            lwVar = lwVar3;
            xh2Var = xh2Var2;
        }
        try {
            int i3 = leVar.g;
            if (leVar.isEmpty()) {
                int iOrdinal = xh2Var.ordinal();
                if (iOrdinal == 0) {
                    ix.t(lwVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    ix.t(lwVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new ps();
                    }
                    ix.t(lwVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                ix.t(lwVar2, "SAVEPOINT '" + i3 + '\'');
            }
            leVar.addLast(new lo1(i3));
            ll2 ll2Var = ll2.a;
            lwVar.b(null);
            return ll2Var;
        } catch (Throwable th) {
            lwVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, tx txVar) {
        no1 no1Var;
        lw lwVar;
        le leVar = this.d;
        if (txVar instanceof no1) {
            no1Var = (no1) txVar;
            int i = no1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                no1Var.l = i - Integer.MIN_VALUE;
            } else {
                no1Var = new no1(this, txVar);
            }
        } else {
            no1Var = new no1(this, txVar);
        }
        Object obj = no1Var.j;
        int i2 = no1Var.l;
        lw lwVar2 = this.b;
        if (i2 == 0) {
            ix.Q(obj);
            no1Var.i = lwVar2;
            no1Var.h = z;
            no1Var.l = 1;
            Object objD = lwVar2.f.d(no1Var);
            fz fzVar = fz.e;
            if (objD == fzVar) {
                return fzVar;
            }
            lwVar = lwVar2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = no1Var.h;
            lwVar = no1Var.i;
            ix.Q(obj);
        }
        try {
            if (leVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            lo1 lo1Var = (lo1) ar.L(leVar);
            if (z) {
                lo1Var.getClass();
                if (leVar.isEmpty()) {
                    ix.t(lwVar2, "END TRANSACTION");
                } else {
                    ix.t(lwVar2, "RELEASE SAVEPOINT '" + lo1Var.a + '\'');
                }
            } else if (leVar.isEmpty()) {
                ix.t(lwVar2, "ROLLBACK TRANSACTION");
            } else {
                ix.t(lwVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + lo1Var.a + '\'');
            }
            ll2 ll2Var = ll2.a;
            lwVar.b(null);
            return ll2Var;
        } catch (Throwable th) {
            lwVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(xh2 xh2Var, ij0 ij0Var, tx txVar) throws Throwable {
        oo1 oo1Var;
        SQLException e;
        Throwable th;
        int i;
        boolean z;
        if (txVar instanceof oo1) {
            oo1Var = (oo1) txVar;
            int i2 = oo1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oo1Var.m = i2 - Integer.MIN_VALUE;
            } else {
                oo1Var = new oo1(this, txVar);
            }
        } else {
            oo1Var = new oo1(this, txVar);
        }
        Object objG = oo1Var.k;
        int i3 = oo1Var.m;
        Object obj = fz.e;
        try {
            if (i3 == 0) {
                ix.Q(objG);
                if (xh2Var == null) {
                    xh2Var = xh2.e;
                }
                oo1Var.h = ij0Var;
                oo1Var.m = 1;
                if (e(xh2Var, oo1Var) != obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                ij0Var = (ij0) oo1Var.h;
                ix.Q(objG);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj2 = oo1Var.h;
                        ix.Q(objG);
                        return obj2;
                    }
                    if (i3 != 5) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = oo1Var.i;
                    th = (Throwable) oo1Var.h;
                    try {
                        ix.Q(objG);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        vv.e(th, e);
                        throw th;
                    }
                }
                i = oo1Var.j;
                ix.Q(objG);
            }
            z = i != 0;
            oo1Var.h = objG;
            oo1Var.m = 3;
            if (f(z, oo1Var) != obj) {
                return obj;
            }
            return objG;
            jk1 jk1Var = new jk1(1, this);
            oo1Var.h = null;
            oo1Var.j = 1;
            oo1Var.m = 2;
            objG = ij0Var.g(jk1Var, oo1Var);
            if (objG != obj) {
                i = 1;
                if (i != 0) {
                }
                oo1Var.h = objG;
                oo1Var.m = 3;
                if (f(z, oo1Var) != obj) {
                    return objG;
                }
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    oo1Var.h = th;
                    oo1Var.i = th3;
                    oo1Var.m = 5;
                    if (f(false, oo1Var) != obj) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    vv.e(th, e);
                    throw th;
                }
            }
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dc0 implements Runnable, Comparable, e60 {
    private volatile Object _heap;
    public long e;
    public int f = -1;

    public dc0(long j) {
        this.e = j;
    }

    @Override // defpackage.e60
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                pa0 pa0Var = vs0.u;
                if (obj == pa0Var) {
                    return;
                }
                ec0 ec0Var = obj instanceof ec0 ? (ec0) obj : null;
                if (ec0Var != null) {
                    synchronized (ec0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof lg2 ? (lg2) obj2 : null) != null) {
                            ec0Var.c(this.f);
                        }
                    }
                }
                this._heap = pa0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, ec0 ec0Var, fc0 fc0Var) {
        synchronized (this) {
            if (this._heap == vs0.u) {
                return 2;
            }
            synchronized (ec0Var) {
                try {
                    dc0[] dc0VarArr = ec0Var.a;
                    dc0 dc0Var = dc0VarArr != null ? dc0VarArr[0] : null;
                    int i = fc0.n;
                    if (we.a.getIntVolatile(fc0Var, fc0.l) != 0) {
                        return 1;
                    }
                    if (dc0Var == null) {
                        ec0Var.c = j;
                    } else {
                        long j2 = dc0Var.e;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = ec0Var.c;
                        if (j - j3 > 0) {
                            ec0Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.e - j < 0) {
                        this.e = j;
                    }
                    ec0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.e - ((dc0) obj).e;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(ec0 ec0Var) {
        if (this._heap != vs0.u) {
            this._heap = ec0Var;
        } else {
            qj.r("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.e + ']';
    }
}

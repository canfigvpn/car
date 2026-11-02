package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public o0[] e;
    public int f;
    public int g;
    public ea2 h;

    public final o0 c() {
        o0 o0VarD;
        ea2 ea2Var;
        synchronized (this) {
            try {
                o0[] o0VarArrE = this.e;
                if (o0VarArrE == null) {
                    o0VarArrE = e();
                    this.e = o0VarArrE;
                } else if (this.f >= o0VarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(o0VarArrE, o0VarArrE.length * 2);
                    this.e = (o0[]) objArrCopyOf;
                    o0VarArrE = (o0[]) objArrCopyOf;
                }
                int i = this.g;
                do {
                    o0VarD = o0VarArrE[i];
                    if (o0VarD == null) {
                        o0VarD = d();
                        o0VarArrE[i] = o0VarD;
                    }
                    i++;
                    if (i >= o0VarArrE.length) {
                        i = 0;
                    }
                } while (!o0VarD.a(this));
                this.g = i;
                this.f++;
                ea2Var = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ea2Var != null) {
            ea2Var.w(1);
        }
        return o0VarD;
    }

    public abstract o0 d();

    public abstract o0[] e();

    public final void f(o0 o0Var) {
        ea2 ea2Var;
        int i;
        sx[] sxVarArrB;
        synchronized (this) {
            try {
                int i2 = this.f - 1;
                this.f = i2;
                ea2Var = this.h;
                if (i2 == 0) {
                    this.g = 0;
                }
                o0Var.getClass();
                sxVarArrB = o0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (sx sxVar : sxVarArrB) {
            if (sxVar != null) {
                sxVar.i(ll2.a);
            }
        }
        if (ea2Var != null) {
            ea2Var.w(-1);
        }
    }

    public final ea2 g() {
        ea2 ea2Var;
        synchronized (this) {
            ea2Var = this.h;
            if (ea2Var == null) {
                int i = this.f;
                ea2Var = new ea2(1, Integer.MAX_VALUE, vk.f);
                ea2Var.q(Integer.valueOf(i));
                this.h = ea2Var;
            }
        }
        return ea2Var;
    }
}

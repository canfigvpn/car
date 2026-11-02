package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 implements pd0 {
    public final ao2 a;
    public final l20 b;
    public final g82 c;
    public final o50 d = hy1.c;

    public j62(ao2 ao2Var, l20 l20Var, g82 g82Var) {
        this.a = ao2Var;
        this.b = l20Var;
        this.c = g82Var;
    }

    @Override // defpackage.pd0
    public Object a(m01 m01Var, float f, ry1 ry1Var) {
        return c(m01Var, f, nj2.B0, ry1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xx1 xx1Var, float f, ej0 ej0Var, tx txVar) {
        f62 f62Var;
        ej0 ej0Var2;
        if (txVar instanceof f62) {
            f62Var = (f62) txVar;
            int i = f62Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                f62Var.k = i - Integer.MIN_VALUE;
            } else {
                f62Var = new f62(this, txVar);
            }
        } else {
            f62Var = new f62(this, txVar);
        }
        Object objK = f62Var.i;
        int i2 = f62Var.k;
        if (i2 == 0) {
            ix.Q(objK);
            v20 v20Var = new v20(this, f, ej0Var, xx1Var, null);
            f62Var.h = ej0Var;
            f62Var.k = 1;
            objK = nj2.K(this.d, v20Var, f62Var);
            fz fzVar = fz.e;
            if (objK == fzVar) {
                return fzVar;
            }
            ej0Var2 = ej0Var;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ej0Var2 = f62Var.h;
            ix.Q(objK);
        }
        kb kbVar = (kb) objK;
        ej0Var2.h(new Float(0.0f));
        return kbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(m01 m01Var, float f, v22 v22Var, tx txVar) {
        h62 h62Var;
        if (txVar instanceof h62) {
            h62Var = (h62) txVar;
            int i = h62Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                h62Var.j = i - Integer.MIN_VALUE;
            } else {
                h62Var = new h62(this, txVar);
            }
        } else {
            h62Var = new h62(this, txVar);
        }
        Object objB = h62Var.h;
        int i2 = h62Var.j;
        if (i2 == 0) {
            ix.Q(objB);
            h62Var.j = 1;
            objB = b(m01Var, f, v22Var, h62Var);
            Object obj = fz.e;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(objB);
        }
        kb kbVar = (kb) objB;
        return new Float(kbVar.a.floatValue() != 0.0f ? ((Number) kbVar.b.a()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(xx1 xx1Var, float f, float f2, g62 g62Var, tx txVar) {
        i62 i62Var;
        be qk1Var;
        if (txVar instanceof i62) {
            i62Var = (i62) txVar;
            int i = i62Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                i62Var.j = i - Integer.MIN_VALUE;
            } else {
                i62Var = new i62(this, txVar);
            }
        } else {
            i62Var = new i62(this, txVar);
        }
        i62 i62Var2 = i62Var;
        Object objC = i62Var2.h;
        int i2 = i62Var2.j;
        if (i2 == 0) {
            ix.Q(objC);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return j20.a(f, f2, 28);
            }
            i62Var2.j = 1;
            l20 l20Var = this.b;
            if (Math.abs(ix.m(l20Var, f2)) >= Math.abs(f)) {
                qk1Var = new ao2(12, l20Var);
            } else {
                qk1Var = new qk1(16, this.c);
            }
            objC = qk1Var.c(xx1Var, new Float(f), new Float(f2), g62Var, i62Var2);
            fz fzVar = fz.e;
            if (objC == fzVar) {
                return fzVar;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(objC);
        }
        return ((kb) objC).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j62) {
            j62 j62Var = (j62) obj;
            return j62Var.c.equals(this.c) && j62Var.b == this.b && j62Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}

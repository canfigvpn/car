package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class he0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final ia e;
    public tr0 f;
    public tr0 g;

    public he0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new ia(new w60(f), ir2.X, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ll2] */
    public final Object a(tr0 tr0Var, tx txVar) {
        fe0 fe0Var;
        float f;
        ia iaVar = this.e;
        if (txVar instanceof fe0) {
            fe0Var = (fe0) txVar;
            int i = fe0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fe0Var.k = i - Integer.MIN_VALUE;
            } else {
                fe0Var = new fe0(this, txVar);
            }
        } else {
            fe0Var = new fe0(this, txVar);
        }
        Object obj = fe0Var.i;
        int i2 = fe0Var.k;
        try {
            if (i2 == 0) {
                ix.Q(obj);
                if (tr0Var instanceof rp1) {
                    f = this.b;
                } else if (tr0Var instanceof wn0) {
                    f = this.c;
                } else {
                    f = tr0Var instanceof nf0 ? this.d : this.a;
                }
                this.g = tr0Var;
                if (!w60.b(((w60) iaVar.e.getValue()).e, f)) {
                    tr0 tr0Var2 = this.f;
                    fe0Var.h = tr0Var;
                    fe0Var.k = 1;
                    Object objA = v90.a(iaVar, f, tr0Var2, tr0Var, fe0Var);
                    fz fzVar = fz.e;
                    if (objA == fzVar) {
                        return fzVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tr0Var = fe0Var.h;
                ix.Q(obj);
            }
            this.f = tr0Var;
            this = ll2.a;
            return this;
        } catch (Throwable th) {
            this.f = tr0Var;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tx txVar) {
        ge0 ge0Var;
        float f;
        if (txVar instanceof ge0) {
            ge0Var = (ge0) txVar;
            int i = ge0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ge0Var.j = i - Integer.MIN_VALUE;
            } else {
                ge0Var = new ge0(this, txVar);
            }
        } else {
            ge0Var = new ge0(this, txVar);
        }
        Object obj = ge0Var.h;
        int i2 = ge0Var.j;
        try {
            if (i2 == 0) {
                ix.Q(obj);
                tr0 tr0Var = this.g;
                if (tr0Var instanceof rp1) {
                    f = this.b;
                } else if (tr0Var instanceof wn0) {
                    f = this.c;
                } else {
                    f = tr0Var instanceof nf0 ? this.d : this.a;
                }
                ia iaVar = this.e;
                if (!w60.b(((w60) iaVar.e.getValue()).e, f)) {
                    w60 w60Var = new w60(f);
                    ge0Var.j = 1;
                    Object objE = iaVar.e(ge0Var, w60Var);
                    fz fzVar = fz.e;
                    if (objE == fzVar) {
                        return fzVar;
                    }
                }
                return ll2.a;
            }
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
            this.f = this.g;
            return ll2.a;
        } catch (Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}

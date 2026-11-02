package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements m40 {
    public final /* synthetic */ m40 e;
    public boolean f;
    public boolean g;
    public final ta1 h = new ta1();

    public pp1(m40 m40Var) {
        this.e = m40Var;
    }

    @Override // defpackage.m40
    public final float H(long j) {
        return this.e.H(j);
    }

    @Override // defpackage.m40
    public final int O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.m40
    public final long Y(long j) {
        return this.e.Y(j);
    }

    public final void a() {
        this.g = true;
        ta1 ta1Var = this.h;
        if (ta1Var.e()) {
            ta1Var.b(null);
        }
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e.b();
    }

    @Override // defpackage.m40
    public final float b0(long j) {
        return this.e.b0(j);
    }

    public final void c() {
        this.f = true;
        ta1 ta1Var = this.h;
        if (ta1Var.e()) {
            ta1Var.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tx txVar) {
        np1 np1Var;
        if (txVar instanceof np1) {
            np1Var = (np1) txVar;
            int i = np1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                np1Var.j = i - Integer.MIN_VALUE;
            } else {
                np1Var = new np1(this, txVar);
            }
        } else {
            np1Var = new np1(this, txVar);
        }
        Object obj = np1Var.h;
        int i2 = np1Var.j;
        if (i2 == 0) {
            ix.Q(obj);
            np1Var.j = 1;
            Object objD = this.h.d(np1Var);
            fz fzVar = fz.e;
            if (objD == fzVar) {
                return fzVar;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        this.f = false;
        this.g = false;
        return ll2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tx txVar) {
        op1 op1Var;
        if (txVar instanceof op1) {
            op1Var = (op1) txVar;
            int i = op1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                op1Var.j = i - Integer.MIN_VALUE;
            } else {
                op1Var = new op1(this, txVar);
            }
        } else {
            op1Var = new op1(this, txVar);
        }
        Object obj = op1Var.h;
        int i2 = op1Var.j;
        ta1 ta1Var = this.h;
        if (i2 == 0) {
            ix.Q(obj);
            if (!this.f && !this.g) {
                op1Var.j = 1;
                Object objD = ta1Var.d(op1Var);
                fz fzVar = fz.e;
                if (objD == fzVar) {
                    return fzVar;
                }
            }
            return Boolean.valueOf(this.f);
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        ta1Var.b(null);
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.m40
    public final long j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.m40
    public final float n0(int i) {
        return this.e.n0(i);
    }

    @Override // defpackage.m40
    public final float q0(float f) {
        return this.e.q0(f);
    }

    @Override // defpackage.m40
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.m40
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.m40
    public final float x(float f) {
        return this.e.x(f);
    }
}

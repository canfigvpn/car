package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 {
    public int a;
    public float b;
    public final Object c;

    public pn0(ff2 ff2Var) {
        this.c = ff2Var;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ff2 ff2Var = (ff2) this.c;
        int i2 = 1;
        if (z) {
            int iU = ux.u(ff2Var.f, i, z);
            int lineStart = ff2Var.f.getLineStart(iU);
            int iF = ff2Var.f(iU);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fH = z3 ? ff2Var.h(i, z) : ff2Var.i(i, z);
        if (z2) {
            this.a = i4;
            this.b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, tx txVar) {
        qs1 qs1Var;
        if (txVar instanceof qs1) {
            qs1Var = (qs1) txVar;
            int i = qs1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                qs1Var.j = i - Integer.MIN_VALUE;
            } else {
                qs1Var = new qs1(this, txVar);
            }
        } else {
            qs1Var = new qs1(this, txVar);
        }
        Object objG = qs1Var.h;
        int i2 = qs1Var.j;
        if (i2 == 0) {
            ix.Q(objG);
            sg2 sg2Var = (sg2) this.c;
            Float f2 = new Float(f);
            qs1Var.j = 1;
            objG = sg2Var.g(f2, qs1Var);
            fz fzVar = fz.e;
            if (objG == fzVar) {
                return fzVar;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(objG);
        }
        this.b += ((Number) objG).floatValue();
        return ll2.a;
    }

    public pn0(int i, sg2 sg2Var) {
        this.a = i;
        this.c = sg2Var;
    }
}

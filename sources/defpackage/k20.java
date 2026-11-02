package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 implements ib {
    public final rm2 a;
    public final mj2 b;
    public final Object c;
    public final tb d;
    public final tb e;
    public final tb f;
    public final Object g;
    public final long h;

    public k20(l20 l20Var, mj2 mj2Var, Object obj, tb tbVar) {
        rm2 rm2Var = new rm2(l20Var.a);
        this.a = rm2Var;
        this.b = mj2Var;
        this.c = obj;
        tb tbVar2 = (tb) mj2Var.a.h(obj);
        this.d = tbVar2;
        this.e = vs0.k(tbVar);
        ej0 ej0Var = mj2Var.b;
        tb tbVarC = rm2Var.d;
        if (tbVarC == null) {
            tbVarC = tbVar2.c();
            rm2Var.d = tbVarC;
        }
        int iB = tbVarC.b();
        int i = 0;
        while (true) {
            tb tbVar3 = rm2Var.d;
            yd0 yd0Var = rm2Var.a;
            if (i >= iB) {
                if (tbVar3 == null) {
                    ws0.U("targetVector");
                    throw null;
                }
                this.g = ej0Var.h(tbVar3);
                tb tbVarC2 = rm2Var.c;
                if (tbVarC2 == null) {
                    tbVarC2 = tbVar2.c();
                    rm2Var.c = tbVarC2;
                }
                int iB2 = tbVarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    tbVar2.getClass();
                    jMax = Math.max(jMax, yd0Var.e(tbVar.a(i2)));
                }
                this.h = jMax;
                tb tbVarK = vs0.k(this.a.a(jMax, this.d, tbVar));
                this.f = tbVarK;
                int iB3 = tbVarK.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    tb tbVar4 = this.f;
                    float fA = tbVar4.a(i3);
                    float f = this.a.e;
                    tbVar4.e(i3, ex.g(fA, -f, f));
                }
                return;
            }
            if (tbVar3 == null) {
                ws0.U("targetVector");
                throw null;
            }
            tbVar3.e(i, yd0Var.g(tbVar2.a(i), tbVar.a(i)));
            i++;
        }
    }

    @Override // defpackage.ib
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ib
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        ej0 ej0Var = this.b.b;
        rm2 rm2Var = this.a;
        tb tbVarC = rm2Var.b;
        tb tbVar = this.d;
        if (tbVarC == null) {
            tbVarC = tbVar.c();
            rm2Var.b = tbVarC;
        }
        int iB = tbVarC.b();
        int i = 0;
        while (true) {
            tb tbVar2 = rm2Var.b;
            if (i >= iB) {
                if (tbVar2 != null) {
                    return ej0Var.h(tbVar2);
                }
                ws0.U("valueVector");
                throw null;
            }
            if (tbVar2 == null) {
                ws0.U("valueVector");
                throw null;
            }
            tbVar2.e(i, rm2Var.a.n(tbVar.a(i), this.e.a(i), j));
            i++;
        }
    }

    @Override // defpackage.ib
    public final long c() {
        return this.h;
    }

    @Override // defpackage.ib
    public final mj2 d() {
        return this.b;
    }

    @Override // defpackage.ib
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.ib
    public final tb f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.a(j, this.d, this.e);
    }
}

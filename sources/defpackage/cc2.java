package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cc2 implements ib {
    public final nm2 a;
    public final mj2 b;
    public Object c;
    public Object d;
    public tb e;
    public tb f;
    public final tb g;
    public long h;
    public tb i;

    public cc2(nb nbVar, mj2 mj2Var, Object obj, Object obj2, tb tbVar) {
        this.a = nbVar.a(mj2Var);
        this.b = mj2Var;
        this.c = obj2;
        this.d = obj;
        this.e = (tb) mj2Var.a.h(obj);
        ej0 ej0Var = mj2Var.a;
        this.f = (tb) ej0Var.h(obj2);
        this.g = tbVar != null ? vs0.k(tbVar) : ((tb) ej0Var.h(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.ib
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.ib
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        tb tbVarP = this.a.p(j, this.e, this.f, this.g);
        int iB = tbVarP.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(tbVarP.a(i))) {
                ep1.b("AnimationVector cannot contain a NaN. " + tbVarP + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.h(tbVarP);
    }

    @Override // defpackage.ib
    public final long c() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jB = this.a.b(this.e, this.f, this.g);
        this.h = jB;
        return jB;
    }

    @Override // defpackage.ib
    public final mj2 d() {
        return this.b;
    }

    @Override // defpackage.ib
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.ib
    public final tb f(long j) {
        boolean zG = g(j);
        tb tbVar = this.g;
        if (!zG) {
            return this.a.l(j, this.e, this.f, tbVar);
        }
        tb tbVar2 = this.i;
        if (tbVar2 != null) {
            return tbVar2;
        }
        tb tbVarQ = this.a.q(this.e, this.f, tbVar);
        this.i = tbVarQ;
        return tbVarQ;
    }

    public final void h(Object obj) {
        if (ws0.j(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (tb) this.b.a.h(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (ws0.j(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (tb) this.b.a.h(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}

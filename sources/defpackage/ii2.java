package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ii2 implements p82 {
    public final mj2 e;
    public final dk1 f;
    public final dk1 g;
    public final dk1 h;
    public yy1 i;
    public cc2 j;
    public final dk1 k;
    public final zj1 l;
    public boolean m;
    public final dk1 n;
    public tb o;
    public final bk1 p;
    public boolean q;
    public final g82 r;
    public final /* synthetic */ ki2 s;

    public ii2(ki2 ki2Var, Object obj, tb tbVar, mj2 mj2Var) {
        this.s = ki2Var;
        this.e = mj2Var;
        dk1 dk1VarS = y12.s(obj);
        this.f = dk1VarS;
        Object objH = null;
        dk1 dk1VarS2 = y12.s(s5.T(0.0f, 0.0f, null, 7));
        this.g = dk1VarS2;
        this.h = y12.s(new cc2((ld0) dk1VarS2.getValue(), mj2Var, obj, dk1VarS.getValue(), tbVar));
        this.k = y12.s(Boolean.TRUE);
        this.l = new zj1(-1.0f);
        this.n = y12.s(obj);
        this.o = tbVar;
        this.p = new bk1(a().c());
        Float f = (Float) ho2.a.get(mj2Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            tb tbVar2 = (tb) mj2Var.a.h(obj);
            int iB = tbVar2.b();
            for (int i = 0; i < iB; i++) {
                tbVar2.e(i, fFloatValue);
            }
            objH = this.e.b.h(tbVar2);
        }
        this.r = s5.T(0.0f, 0.0f, objH, 3);
    }

    public final cc2 a() {
        return (cc2) this.h.getValue();
    }

    public final void b(long j) {
        if (this.l.h() == -1.0f) {
            this.q = true;
            if (ws0.j(a().c, a().d)) {
                d(a().c);
            } else {
                d(a().b(j));
                this.o = a().f(j);
            }
        }
    }

    public final void d(Object obj) {
        this.n.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        cc2 cc2Var = this.j;
        Object obj2 = cc2Var != null ? cc2Var.c : null;
        dk1 dk1Var = this.f;
        boolean zJ = ws0.j(obj2, dk1Var.getValue());
        bk1 bk1Var = this.p;
        dk1 dk1Var2 = this.h;
        ld0 ld0Var = this.r;
        if (zJ) {
            dk1Var2.setValue(new cc2(ld0Var, this.e, obj, obj, this.o.c()));
            this.m = true;
            bk1Var.i(a().c());
            return;
        }
        dk1 dk1Var3 = this.g;
        if (!z || this.q || (((ld0) dk1Var3.getValue()) instanceof g82)) {
            ld0Var = (ld0) dk1Var3.getValue();
        }
        ki2 ki2Var = this.s;
        long jE = ki2Var.e();
        dk1 dk1Var4 = ki2Var.h;
        dk1Var2.setValue(new cc2(jE <= 0 ? ld0Var : new k82(ld0Var, ki2Var.e()), this.e, obj, dk1Var.getValue(), this.o));
        bk1Var.i(a().c());
        this.m = false;
        dk1Var4.setValue(Boolean.TRUE);
        if (ki2Var.g()) {
            h72 h72Var = ki2Var.i;
            int size = h72Var.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                ii2 ii2Var = (ii2) h72Var.get(i);
                jMax = Math.max(jMax, ii2Var.p.h());
                ii2Var.b(0L);
            }
            dk1Var4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, ld0 ld0Var) {
        this.f.setValue(obj2);
        this.g.setValue(ld0Var);
        if (ws0.j(a().d, obj) && ws0.j(a().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.p82
    public final Object getValue() {
        return this.n.getValue();
    }

    public final void h(Object obj, ld0 ld0Var) {
        if (this.m) {
            cc2 cc2Var = this.j;
            if (ws0.j(obj, cc2Var != null ? cc2Var.c : null)) {
                return;
            }
        }
        dk1 dk1Var = this.f;
        boolean zJ = ws0.j(dk1Var.getValue(), obj);
        zj1 zj1Var = this.l;
        if (zJ && zj1Var.h() == -1.0f) {
            return;
        }
        dk1Var.setValue(obj);
        this.g.setValue(ld0Var);
        Object value = zj1Var.h() == -3.0f ? obj : this.n.getValue();
        dk1 dk1Var2 = this.k;
        f(value, !((Boolean) dk1Var2.getValue()).booleanValue());
        dk1Var2.setValue(Boolean.valueOf(zj1Var.h() == -3.0f));
        if (zj1Var.h() >= 0.0f) {
            d(a().b((long) (zj1Var.h() * a().c())));
        } else if (zj1Var.h() == -3.0f) {
            d(obj);
        }
        this.m = false;
        zj1Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.n.getValue() + ", target: " + this.f.getValue() + ", spec: " + ((ld0) this.g.getValue());
    }
}

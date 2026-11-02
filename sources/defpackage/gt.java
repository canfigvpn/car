package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gt implements ij0, jj0, kj0, lj0, mj0, nj0, oj0, pj0, ui0, vi0, xi0, yi0, zi0, aj0, bj0, cj0, dj0, fj0, gj0 {
    public final int e;
    public final boolean f;
    public Object g;
    public lr1 h;
    public ArrayList i;

    public gt(Object obj, boolean z, int i) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }

    @Override // defpackage.oj0
    public final /* bridge */ /* synthetic */ Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ak0 ak0Var, Integer num) {
        return i(obj, bool, obj2, obj3, obj4, ak0Var, num.intValue());
    }

    @Override // defpackage.jj0
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return f(obj, (ak0) obj2, ((Number) obj3).intValue());
    }

    public final Object e(int i, ak0 ak0Var) {
        ak0Var.X(this.e);
        n(ak0Var);
        int iH = i | (ak0Var.f(this) ? vs0.h(2, 0) : vs0.h(1, 0));
        Object obj = this.g;
        obj.getClass();
        nj2.i(2, obj);
        Object objG = ((ij0) obj).g(ak0Var, Integer.valueOf(iH));
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ft(2, this, gt.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objG;
    }

    public final Object f(Object obj, ak0 ak0Var, int i) {
        ak0Var.X(this.e);
        n(ak0Var);
        int iH = ak0Var.f(this) ? vs0.h(2, 1) : vs0.h(1, 1);
        Object obj2 = this.g;
        obj2.getClass();
        nj2.i(3, obj2);
        Object objD = ((jj0) obj2).d(obj, ak0Var, Integer.valueOf(iH | i));
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(this, obj, i, 0);
        }
        return objD;
    }

    @Override // defpackage.ij0
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
        return e(((Number) obj2).intValue(), (ak0) obj);
    }

    public final Object i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ak0 ak0Var, int i) {
        ak0Var.X(this.e);
        n(ak0Var);
        int iH = ak0Var.f(this) ? vs0.h(2, 6) : vs0.h(1, 6);
        Object obj5 = this.g;
        obj5.getClass();
        nj2.i(8, obj5);
        Object objB = ((oj0) obj5).b(obj, bool, obj2, obj3, obj4, ak0Var, Integer.valueOf(i | iH));
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new hs(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objB;
    }

    @Override // defpackage.lj0
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m(obj, obj2, obj3, (ak0) obj4, ((Number) obj5).intValue());
    }

    public final Object k(Object obj, Object obj2, ak0 ak0Var, int i) {
        ak0Var.X(this.e);
        n(ak0Var);
        int iH = ak0Var.f(this) ? vs0.h(2, 2) : vs0.h(1, 2);
        Object obj3 = this.g;
        obj3.getClass();
        nj2.i(4, obj3);
        Object objL = ((kj0) obj3).l(obj, obj2, ak0Var, Integer.valueOf(iH | i));
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(this, obj, obj2, i);
        }
        return objL;
    }

    @Override // defpackage.kj0
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return k(obj, obj2, (ak0) obj3, ((Number) obj4).intValue());
    }

    public final Object m(Object obj, Object obj2, Object obj3, ak0 ak0Var, int i) {
        ak0Var.X(this.e);
        n(ak0Var);
        int iH = ak0Var.f(this) ? vs0.h(2, 3) : vs0.h(1, 3);
        Object obj4 = this.g;
        obj4.getClass();
        nj2.i(5, obj4);
        Object objJ = ((lj0) obj4).j(obj, obj2, obj3, ak0Var, Integer.valueOf(iH | i));
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new i3(this, obj, obj2, obj3, i);
        }
        return objJ;
    }

    public final void n(ak0 ak0Var) {
        lr1 lr1VarX;
        if (!this.f || (lr1VarX = ak0Var.x()) == null) {
            return;
        }
        lr1VarX.b |= 1;
        lr1 lr1Var = this.h;
        if (lr1Var == null || !lr1Var.a() || lr1Var == lr1VarX || ws0.j(lr1Var.c, lr1VarX.c)) {
            this.h = lr1VarX;
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.i = arrayList2;
            arrayList2.add(lr1VarX);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lr1 lr1Var2 = (lr1) arrayList.get(i);
            if (lr1Var2 == null || !lr1Var2.a() || lr1Var2 == lr1VarX || ws0.j(lr1Var2.c, lr1VarX.c)) {
                arrayList.set(i, lr1VarX);
                return;
            }
        }
        arrayList.add(lr1VarX);
    }
}

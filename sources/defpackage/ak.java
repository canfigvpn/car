package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ak implements w61 {
    public final wi a;
    public final boolean b;

    public ak(wi wiVar, boolean z) {
        this.a = wiVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return this.a.equals(akVar.a) && this.b == akVar.b;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        db0 db0Var = db0.e;
        if (zIsEmpty) {
            return y61Var.d0(sw.j(j), sw.i(j), db0Var, new s1(10));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            r61 r61Var = (r61) list.get(0);
            r61Var.j();
            jm1 jm1VarE = r61Var.e(j2);
            int iMax = Math.max(sw.j(j), jm1VarE.e);
            int iMax2 = Math.max(sw.i(j), jm1VarE.f);
            return y61Var.d0(iMax, iMax2, db0Var, new yj(jm1VarE, r61Var, y61Var, iMax, iMax2, this));
        }
        jm1[] jm1VarArr = new jm1[list.size()];
        es1 es1Var = new es1();
        es1Var.e = sw.j(j);
        es1 es1Var2 = new es1();
        es1Var2.e = sw.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r61 r61Var2 = (r61) list.get(i);
            r61Var2.j();
            jm1 jm1VarE2 = r61Var2.e(j2);
            jm1VarArr[i] = jm1VarE2;
            es1Var.e = Math.max(es1Var.e, jm1VarE2.e);
            es1Var2.e = Math.max(es1Var2.e, jm1VarE2.f);
        }
        return y61Var.d0(es1Var.e, es1Var2.e, db0Var, new zj(jm1VarArr, list, y61Var, es1Var, es1Var2, this, 0));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}

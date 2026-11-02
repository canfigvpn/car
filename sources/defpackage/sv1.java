package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 implements w61, pv1 {
    public final ge a;
    public final vi b;

    public sv1(ge geVar, vi viVar) {
        this.a = geVar;
        this.b = viVar;
    }

    @Override // defpackage.pv1
    public final x61 a(jm1[] jm1VarArr, y61 y61Var, int[] iArr, int i, int i2) {
        return y61Var.d0(i, i2, db0.e, new t40(jm1VarArr, this, i2, iArr));
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        int iO = os0Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iO, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            r61 r61Var = (r61) list.get(i2);
            float fA = vv.A(vv.t(r61Var));
            if (fA == 0.0f) {
                int iMin2 = Math.min(r61Var.a0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, r61Var.f(iMin2));
            } else if (fA > 0.0f) {
                f += fA;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            r61 r61Var2 = (r61) list.get(i3);
            float fA2 = vv.A(vv.t(r61Var2));
            if (fA2 > 0.0f) {
                iMax = Math.max(iMax, r61Var2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        int iO = os0Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            r61 r61Var = (r61) list.get(i3);
            float fA = vv.A(vv.t(r61Var));
            int iA0 = r61Var.a0(i);
            if (fA == 0.0f) {
                i2 += iA0;
            } else if (fA > 0.0f) {
                f += fA;
                iMax = Math.max(iMax, Math.round(iA0 / fA));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.pv1
    public final void d(int i, int[] iArr, int[] iArr2, y61 y61Var) {
        this.a.d(y61Var, i, iArr, y61Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.pv1
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? tw.a(i, i2, 0, i3) : rw.w(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv1)) {
            return false;
        }
        sv1 sv1Var = (sv1) obj;
        return this.a.equals(sv1Var.a) && ws0.j(this.b, sv1Var.b);
    }

    @Override // defpackage.pv1
    public final int f(jm1 jm1Var) {
        return jm1Var.f;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        return rw.F(this, sw.j(j), sw.i(j), sw.h(j), sw.g(j), y61Var.O(this.a.a()), y61Var, list, new jm1[list.size()], list.size());
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        int iO = os0Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iO, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            r61 r61Var = (r61) list.get(i2);
            float fA = vv.A(vv.t(r61Var));
            if (fA == 0.0f) {
                int iMin2 = Math.min(r61Var.a0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, r61Var.e0(iMin2));
            } else if (fA > 0.0f) {
                f += fA;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            r61 r61Var2 = (r61) list.get(i3);
            float fA2 = vv.A(vv.t(r61Var2));
            if (fA2 > 0.0f) {
                iMax = Math.max(iMax, r61Var2.e0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pv1
    public final int i(jm1 jm1Var) {
        return jm1Var.e;
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
        int iO = os0Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            r61 r61Var = (r61) list.get(i3);
            float fA = vv.A(vv.t(r61Var));
            int iU = r61Var.U(i);
            if (fA == 0.0f) {
                i2 += iU;
            } else if (fA > 0.0f) {
                f += fA;
                iMax = Math.max(iMax, Math.round(iU / fA));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}

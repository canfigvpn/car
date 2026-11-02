package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wr implements w61, pv1 {
    public final ie a;
    public final ui b;

    public wr(ie ieVar, ui uiVar) {
        this.a = ieVar;
        this.b = uiVar;
    }

    @Override // defpackage.pv1
    public final x61 a(jm1[] jm1VarArr, y61 y61Var, int[] iArr, int i, int i2) {
        return y61Var.d0(i2, i, db0.e, new vr(jm1VarArr, this, i2, y61Var, iArr));
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
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
            int iF = r61Var.f(i);
            if (fA == 0.0f) {
                i2 += iF;
            } else if (fA > 0.0f) {
                f += fA;
                iMax = Math.max(iMax, Math.round(iF / fA));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
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
                int iMin2 = Math.min(r61Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, r61Var.a0(iMin2));
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
                iMax = Math.max(iMax, r61Var2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.pv1
    public final void d(int i, int[] iArr, int[] iArr2, y61 y61Var) {
        this.a.e(y61Var, i, iArr, iArr2);
    }

    @Override // defpackage.pv1
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? tw.a(0, i3, i, i2) : rw.v(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr)) {
            return false;
        }
        wr wrVar = (wr) obj;
        return this.a.equals(wrVar.a) && this.b.equals(wrVar.b);
    }

    @Override // defpackage.pv1
    public final int f(jm1 jm1Var) {
        return jm1Var.e;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        return rw.F(this, sw.i(j), sw.j(j), sw.g(j), sw.h(j), y61Var.O(this.a.a()), y61Var, list, new jm1[list.size()], list.size());
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
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
            int iE0 = r61Var.e0(i);
            if (fA == 0.0f) {
                i2 += iE0;
            } else if (fA > 0.0f) {
                f += fA;
                iMax = Math.max(iMax, Math.round(iE0 / fA));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pv1
    public final int i(jm1 jm1Var) {
        return jm1Var.f;
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
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
                int iMin2 = Math.min(r61Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, r61Var.U(iMin2));
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
                iMax = Math.max(iMax, r61Var2.U(iRound != Integer.MAX_VALUE ? Math.round(iRound * fA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 implements bz0 {
    public final ry0 a;

    public vx0(ry0 ry0Var) {
        this.a = ry0Var;
    }

    @Override // defpackage.bz0
    public final int a() {
        return this.a.g().p;
    }

    @Override // defpackage.bz0
    public final int b() {
        return ((hy0) vq.W(this.a.g().m)).a;
    }

    @Override // defpackage.bz0
    public final boolean c() {
        return !this.a.g().m.isEmpty();
    }

    @Override // defpackage.bz0
    public final int d() {
        int i;
        ry0 ry0Var = this.a;
        int i2 = 0;
        if (ry0Var.g().m.isEmpty()) {
            return 0;
        }
        gy0 gy0VarG = ry0Var.g();
        di1 di1Var = gy0VarG.q;
        di1 di1Var2 = di1.e;
        int iG = (int) (di1Var == di1Var2 ? gy0VarG.g() & 4294967295L : gy0VarG.g() >> 32);
        gy0 gy0VarG2 = ry0Var.g();
        di1 di1Var3 = gy0VarG2.q;
        List list = gy0VarG2.m;
        boolean z = di1Var3 == di1Var2;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                hy0 hy0Var = (hy0) list.get(i3);
                int i6 = z ? hy0Var.p : hy0Var.q;
                if (i6 == -1) {
                    i3++;
                } else {
                    int iMax = 0;
                    while (i3 < list.size()) {
                        hy0 hy0Var2 = (hy0) list.get(i3);
                        if ((z ? hy0Var2.p : hy0Var2.q) != i6) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? ((hy0) list.get(i3)).n & 4294967295L : ((hy0) list.get(i3)).n >> 32));
                        i3++;
                    }
                    i4 += iMax;
                    i5++;
                }
            }
            i2 = (i4 / i5) + gy0VarG2.s;
        }
        if (i2 != 0 && (i = iG / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.bz0
    public final int e() {
        return this.a.d.b.h();
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dy0 {
    public final dq0 a;
    public final int b;
    public final int c;
    public final cy0 d;
    public final ny0 e;
    public final /* synthetic */ dq0 f;

    public dy0(dq0 dq0Var, int i, int i2, cy0 cy0Var, ny0 ny0Var) {
        this.f = dq0Var;
        this.a = dq0Var;
        this.b = i;
        this.c = i2;
        this.d = cy0Var;
        this.e = ny0Var;
    }

    public final long a(int i, int i2) {
        int i3;
        dq0 dq0Var = this.a;
        int[] iArr = (int[]) dq0Var.f;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) dq0Var.g;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            xp0.a("width must be >= 0");
        }
        return tw.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final iy0 b(int i) {
        nh0 nh0VarB = this.e.b(i);
        int i2 = nh0VarB.a;
        int size = nh0VarB.b.size();
        int i3 = 0;
        hy0[] hy0VarArr = new hy0[size];
        int i4 = 0;
        int i5 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        while (true) {
            List list = nh0VarB.b;
            if (i3 >= size) {
                return new iy0(i, hy0VarArr, this.f, list, i5);
            }
            int i6 = (int) ((ll0) list.get(i3)).a;
            int i7 = i5;
            hy0 hy0VarN = this.d.n(i2 + i3, i4, i6, i7, a(i4, i6));
            i5 = i7;
            i4 += i6;
            hy0VarArr[i3] = hy0VarN;
            i3++;
        }
    }
}

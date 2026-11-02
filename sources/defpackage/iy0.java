package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 {
    public final int a;
    public final hy0[] b;
    public final dq0 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public iy0(int i, hy0[] hy0VarArr, dq0 dq0Var, List list, int i2) {
        this.a = i;
        this.b = hy0VarArr;
        this.c = dq0Var;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (hy0 hy0Var : hy0VarArr) {
            iMax = Math.max(iMax, hy0Var.k);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final hy0[] a(int i, int i2, int i3) {
        hy0[] hy0VarArr = this.b;
        int length = hy0VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            hy0 hy0Var = hy0VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((ll0) this.d.get(i5)).a;
            hy0Var.k(i, ((int[]) this.c.g)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return hy0VarArr;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements xo1 {
    public final int e;
    public final da1 f;
    public final p7 g;
    public final a4 h;
    public final a4 i;
    public final po2 j;
    public final po2 k;
    public final b4 l;
    public final b4 m;
    public final qo2 n;
    public final qo2 o;

    public wc0(m40 m40Var, int i, da1 da1Var, p7 p7Var) {
        int iO = m40Var.O(48.0f);
        this.e = i;
        this.f = da1Var;
        this.g = p7Var;
        ui uiVar = q90.r;
        this.h = new a4(uiVar, uiVar, 0);
        ui uiVar2 = q90.t;
        this.i = new a4(uiVar2, uiVar2, 0);
        this.j = new po2(s5.c);
        this.k = new po2(s5.d);
        vi viVar = q90.o;
        vi viVar2 = q90.q;
        this.l = new b4(viVar, viVar2, 0);
        this.m = new b4(viVar2, viVar, 0);
        this.n = new qo2(viVar, iO);
        this.o = new qo2(viVar2, iO);
    }

    @Override // defpackage.xo1
    public final long a(mr0 mr0Var, long j, kw0 kw0Var, long j2) {
        mr0 mr0Var2;
        char c;
        long j3;
        int iA;
        da1 da1Var = this.f;
        if (da1Var != null) {
            da1Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.e)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listV = vs0.v(this.h, this.i, ((int) (mr0Var.a() >> 32)) < i / 2 ? this.j : this.k);
        int size = listV.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                mr0Var2 = mr0Var;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            mr0Var2 = mr0Var;
            List list = listV;
            iA = ((h71) listV.get(i3)).a(mr0Var2, j5, i4, kw0Var);
            if (i6 == list.size() - 1 || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listV = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listV2 = vs0.v(this.l, this.m, ((int) (mr0Var2.a() & j3)) < i7 / 2 ? this.n : this.o);
        int size2 = listV2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((i71) listV2.get(i8)).a(mr0Var2, j5, i9);
            if (i8 == listV2.size() - 1 || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (((long) iA) << c) | (((long) i2) & j3);
        this.g.g(mr0Var2, qx.c(j6, j2));
        return j6;
    }
}

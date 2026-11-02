package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 implements xo1 {
    public final long e;
    public final m40 f;
    public final int g;
    public final p7 h;
    public final a4 i;
    public final a4 j;
    public final po2 k;
    public final po2 l;
    public final b4 m;
    public final b4 n;
    public final b4 o;
    public final qo2 p;
    public final qo2 q;

    public u80(long j, m40 m40Var, p7 p7Var) {
        int iO = m40Var.O(48.0f);
        this.e = j;
        this.f = m40Var;
        this.g = iO;
        this.h = p7Var;
        int iO2 = m40Var.O(Float.intBitsToFloat((int) (j >> 32)));
        ui uiVar = q90.r;
        this.i = new a4(uiVar, uiVar, iO2);
        ui uiVar2 = q90.t;
        this.j = new a4(uiVar2, uiVar2, iO2);
        this.k = new po2(s5.c);
        this.l = new po2(s5.d);
        int iO3 = m40Var.O(Float.intBitsToFloat((int) (j & 4294967295L)));
        vi viVar = q90.o;
        vi viVar2 = q90.q;
        this.m = new b4(viVar, viVar2, iO3);
        this.n = new b4(viVar2, viVar, iO3);
        this.o = new b4(q90.p, viVar, iO3);
        this.p = new qo2(viVar, iO);
        this.q = new qo2(viVar2, iO);
    }

    @Override // defpackage.xo1
    public final long a(mr0 mr0Var, long j, kw0 kw0Var, long j2) {
        mr0 mr0Var2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listV = vs0.v(this.i, this.j, ((int) (mr0Var.a() >> 32)) < i3 / 2 ? this.k : this.l);
        int size = listV.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                mr0Var2 = mr0Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            h71 h71Var = (h71) listV.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            mr0Var2 = mr0Var;
            iA = h71Var.a(mr0Var2, j3, i5, kw0Var);
            if (i7 == listV.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listV2 = vs0.v(this.m, this.n, this.o, ((int) (mr0Var2.a() & 4294967295L)) < i8 / 2 ? this.p : this.q);
        int size2 = listV2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((i71) listV2.get(i9)).a(mr0Var2, j3, i10);
            if (i9 == listV2.size() - 1 || (iA2 >= (i2 = this.g) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.h.g(mr0Var2, qx.c(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.h.g(mr0Var2, qx.c(j5, j2));
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u80) {
            u80 u80Var = (u80) obj;
            return this.e == u80Var.e && ws0.j(this.f, u80Var.f) && this.g == u80Var.g && this.h == u80Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + k3.b(this.g, (this.f.hashCode() + (Long.hashCode(this.e) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) y60.a(this.e)) + ", density=" + this.f + ", verticalMargin=" + this.g + ", onPositionCalculated=" + this.h + ')';
    }
}

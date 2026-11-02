package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k01 implements x61 {
    public final l01 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final x61 e;
    public final float f;
    public final boolean g;
    public final ez h;
    public final m40 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final di1 o;
    public final int p;
    public final int q;

    public k01(l01 l01Var, int i, boolean z, float f, x61 x61Var, float f2, boolean z2, ez ezVar, m40 m40Var, long j, List list, int i2, int i3, int i4, di1 di1Var, int i5, int i6) {
        this.a = l01Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = x61Var;
        this.f = f2;
        this.g = z2;
        this.h = ezVar;
        this.i = m40Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = di1Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.x61
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.x61
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.x61
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.x61
    public final ej0 d() {
        return this.e.d();
    }

    @Override // defpackage.x61
    public final int e() {
        return this.e.e();
    }

    public final k01 f(int i, boolean z) {
        l01 l01Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (l01Var = this.a) == null) {
            return null;
        }
        int i2 = l01Var.n;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        l01 l01Var2 = (l01) vq.Q(list);
        l01 l01Var3 = (l01) vq.W(list);
        if (l01Var2.p || l01Var3.p) {
            return null;
        }
        int i4 = l01Var2.l;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + l01Var2.n) - i6, (l01Var3.l + l01Var3.n) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - l01Var3.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            l01 l01Var4 = (l01) list.get(i7);
            boolean z2 = l01Var4.c;
            int[] iArr = l01Var4.r;
            if (!l01Var4.p) {
                l01Var4.l += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 & 1;
                    if ((z2 && i9 != 0) || (!z2 && i9 == 0)) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = l01Var4.b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        l01Var4.k.a(i10, l01Var4.i);
                    }
                }
            }
        }
        return new k01(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        x61 x61Var = this.e;
        return (((long) x61Var.e()) << 32) | (((long) x61Var.c()) & 4294967295L);
    }
}

package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ev {
    public final ak0 a;
    public io b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final rr0 d = new rr0();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public ev(ak0 ak0Var, io ioVar) {
        this.a = ak0Var;
        this.b = ioVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            bi1 bi1Var = this.b.d;
            bi1Var.Z(xh1.c);
            bi1Var.g[bi1Var.h - bi1Var.e[bi1Var.f - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        io ioVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        ioVar.getClass();
        if (size != 0) {
            bi1 bi1Var2 = ioVar.d;
            bi1Var2.Z(ah1.c);
            ex.O(bi1Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                bi1 bi1Var = this.b.d;
                bi1Var.Z(ph1.c);
                int i3 = bi1Var.h - bi1Var.e[bi1Var.f - 1].a;
                int[] iArr = bi1Var.g;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                bi1 bi1Var2 = this.b.d;
                bi1Var2.Z(lh1.c);
                int i6 = bi1Var2.h - bi1Var2.e[bi1Var2.f - 1].a;
                int[] iArr2 = bi1Var2.g;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        k52 k52Var = this.a.G;
        int i = z ? k52Var.i : k52Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            hv.a("Tried to seek backward");
        }
        if (i2 > 0) {
            bi1 bi1Var = this.b.d;
            bi1Var.Z(tg1.c);
            bi1Var.g[bi1Var.h - bi1Var.e[bi1Var.f - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                hv.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}

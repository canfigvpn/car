package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final d91 e;
    public final hb2 f;

    public dk0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            cp1.a("Invalid start index");
        }
        this.d = new ArrayList();
        d91 d91Var = new d91();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            tv0 tv0Var = (tv0) this.a.get(i3);
            int i4 = tv0Var.c;
            int i5 = tv0Var.d;
            d91Var.h(i4, new ol0(i3, i2, i5));
            i2 += i5;
        }
        this.e = d91Var;
        this.f = new hb2(new q30(1, this));
    }

    public final boolean a(int i, int i2) {
        ol0 ol0Var;
        int i3;
        int i4;
        d91 d91Var = this.e;
        ol0 ol0Var2 = (ol0) d91Var.b(i);
        if (ol0Var2 == null) {
            return false;
        }
        int i5 = ol0Var2.b;
        int i6 = i2 - ol0Var2.c;
        ol0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = d91Var.c;
        long[] jArr = d91Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (ol0Var = (ol0) objArr[(i7 << 3) + i9]).b) >= i5 && ol0Var != ol0Var2 && (i4 = i3 + i6) >= 0) {
                        ol0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}

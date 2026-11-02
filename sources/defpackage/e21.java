package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 extends un2 {
    public final d91 b;

    public e21() {
        d91 d91Var = hr0.a;
        this.b = new d91();
    }

    @Override // defpackage.un2
    public final void d() {
        d91 d91Var = this.b;
        int[] iArr = d91Var.b;
        Object[] objArr = d91Var.c;
        long[] jArr = d91Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        p91 p91Var = (p91) objArr[i4];
                        Object[] objArr2 = p91Var.a;
                        int i6 = p91Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            d21 d21Var = (d21) objArr2[i7];
                            pm pmVar = d21Var.d;
                            if (pmVar != null) {
                                pmVar.cancel();
                            }
                            d21Var.d = null;
                            t51 t51Var = (t51) d21Var.a.f;
                            t51Var.f = true;
                            t51Var.e = false;
                            t51Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}

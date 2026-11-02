package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sk2 extends up1 {
    public int[] a;
    public int b;

    @Override // defpackage.up1
    public final Object a() {
        return new rk2(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.up1
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.up1
    public final int d() {
        return this.b;
    }
}

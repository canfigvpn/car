package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dl2 extends up1 {
    public short[] a;
    public int b;

    @Override // defpackage.up1
    public final Object a() {
        return new cl2(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.up1
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.up1
    public final int d() {
        return this.b;
    }
}

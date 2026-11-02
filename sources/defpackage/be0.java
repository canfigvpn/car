package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class be0 {
    public static final float[] a;

    static {
        long[] jArr = jx1.a;
        int iD = jx1.d(0);
        int iMax = iD > 0 ? Math.max(7, jx1.c(iD)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}

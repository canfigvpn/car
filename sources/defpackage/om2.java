package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class om2 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        char c;
        int i;
        is1[] is1VarArr;
        char c2;
        boolean z;
        float[][] fArr = {new float[2], new float[2]};
        int i2 = new int[2][0];
        char c3 = 3;
        int i3 = 1;
        if (i2 == 0) {
            c = 3;
        } else if (i2 == 1) {
            c = 1;
        } else if (i2 == 2 || i2 == 3) {
            c = 2;
        } else if (i2 == 4) {
            c = 4;
        } else if (i2 != 5) {
            c = 1;
        } else {
            c = 5;
        }
        float[] fArr2 = fArr[0];
        float[] fArr3 = fArr[1];
        int length = (fArr2.length % 2) + (fArr2.length / 2);
        is1[] is1VarArr2 = new is1[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 * 2;
            float f = fArr2[i5];
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            float f3 = fArr3[i5];
            float f4 = fArr3[i6];
            is1 is1Var = new is1(17);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float[] fArr4 = new float[101];
            if (c != c3 && Math.abs(f5) >= 0.001f && Math.abs(f6) >= 0.001f) {
                float f7 = f2 - f4;
                float[] fArr5 = j20.b;
                int i7 = i3;
                i = i7;
                float f8 = f7;
                float fHypot = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    double radians = (float) Math.toRadians((((double) i7) * 90.0d) / 90.0d);
                    float f10 = f7;
                    float fSin = ((float) Math.sin(radians)) * f5;
                    float fCos = f10 * ((float) Math.cos(radians));
                    float f11 = fCos - f8;
                    is1VarArr = is1VarArr2;
                    c2 = c;
                    fHypot += (float) Math.hypot(fSin - f9, f11);
                    fArr5[i7] = fHypot;
                    if (i7 == 90) {
                        break;
                    }
                    i7++;
                    f9 = fSin;
                    c = c2;
                    is1VarArr2 = is1VarArr;
                    f8 = fCos;
                    f7 = f10;
                }
                int i8 = i;
                while (true) {
                    fArr5[i8] = fArr5[i8] / fHypot;
                    if (i8 == 90) {
                        break;
                    } else {
                        i8++;
                    }
                }
                for (int i9 = 0; i9 < 101; i9++) {
                    float f12 = i9 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr5, 0, 91, f12);
                    if (iBinarySearch >= 0) {
                        fArr4[i9] = iBinarySearch / 90.0f;
                    } else if (iBinarySearch == -1) {
                        fArr4[i9] = 0.0f;
                    } else {
                        int i10 = -iBinarySearch;
                        int i11 = i10 - 2;
                        float f13 = i11;
                        float f14 = fArr5[i11];
                        fArr4[i9] = (((f12 - f14) / (fArr5[i10 - 1] - f14)) + f13) / 90.0f;
                    }
                }
                z = false;
            } else {
                is1VarArr = is1VarArr2;
                c2 = c;
                i = i3;
                z = false;
                Math.hypot(f6, f5);
            }
            is1VarArr[i4] = is1Var;
            i4++;
            c = c2;
            i3 = i;
            is1VarArr2 = is1VarArr;
            c3 = 3;
        }
    }
}

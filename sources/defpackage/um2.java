package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class um2 {
    public final boolean a;
    public final tm2 b;
    public final int c;
    public final b00[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public um2(boolean z, tm2 tm2Var) {
        int i;
        this.a = z;
        this.b = tm2Var;
        if (z && tm2Var.equals(tm2.e)) {
            fu1.h("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = tm2Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                qj.p();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new b00[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        b00[] b00VarArr = this.d;
        b00 b00Var = b00VarArr[i];
        if (b00Var != null) {
            b00Var.a = j;
            b00Var.b = f;
        } else {
            b00 b00Var2 = new b00();
            b00Var2.a = j;
            b00Var2.b = f;
            b00VarArr[i] = b00Var2;
        }
    }

    public final float b(float f) {
        tm2 tm2Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            vp0.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        b00[] b00VarArr = this.d;
        b00 b00Var = b00VarArr[i2];
        if (b00Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            b00 b00Var2 = b00Var;
            while (true) {
                b00 b00Var3 = b00VarArr[i2];
                boolean z2 = this.a;
                tm2Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (b00Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = b00Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = b00Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - b00Var2.a);
                b00Var2 = (tm2Var == tm2.e || z) ? b00Var3 : b00Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = b00Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = tm2Var.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        r02.p(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        qj.p();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ um2() {
        this(false, tm2.e);
    }

    public um2(int i) {
        this(true, tm2.f);
    }
}

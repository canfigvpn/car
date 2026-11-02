package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class he implements ge, ie {
    public final float e;
    public final ut f;
    public final float g;

    public he(float f, ut utVar) {
        this.e = f;
        this.f = utVar;
        this.g = f;
    }

    @Override // defpackage.ge, defpackage.ie
    public final float a() {
        return this.g;
    }

    @Override // defpackage.ge
    public final void d(m40 m40Var, int i, int[] iArr, kw0 kw0Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int iO = m40Var.O(this.e);
        if (kw0Var == kw0.f) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int iMin = Math.min(i2, i - i4);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iO, (i - iMin) - i4);
                int i5 = iArr2[length] + i4 + iMin2;
                length--;
                i3 = iMin2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int iMin3 = Math.min(i2, i - i8);
                iArr2[i7] = iMin3;
                int iMin4 = Math.min(iO, (i - iMin3) - i8);
                int i9 = iArr2[i7] + i8 + iMin4;
                i6++;
                i3 = iMin4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        if (i10 < i) {
            int iIntValue = ((Number) this.f.g(Integer.valueOf(i - i10), kw0Var)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iIntValue;
            }
        }
    }

    @Override // defpackage.ie
    public final void e(m40 m40Var, int i, int[] iArr, int[] iArr2) {
        d(m40Var, i, iArr, kw0.e, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof he) {
            he heVar = (he) obj;
            return w60.b(this.e, heVar.e) && this.f == heVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + k3.f(Float.hashCode(this.e) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) w60.c(this.e)) + ", " + this.f + ')';
    }
}

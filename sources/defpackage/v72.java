package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 implements Cloneable {
    public /* synthetic */ boolean e;
    public /* synthetic */ int[] f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public v72() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f = new int[i4];
        this.g = new Object[i4];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v72 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        v72 v72Var = (v72) objClone;
        v72Var.f = (int[]) this.f.clone();
        v72Var.g = (Object[]) this.g.clone();
        return v72Var;
    }

    public final int b(int i) {
        if (this.e) {
            s5.G(this);
        }
        return this.f[i];
    }

    public final void c(int i, Object obj) {
        int iM = sv0.M(this.h, i, this.f);
        if (iM >= 0) {
            this.g[iM] = obj;
            return;
        }
        int i2 = ~iM;
        int i3 = this.h;
        if (i2 < i3) {
            Object[] objArr = this.g;
            if (objArr[i2] == s5.T) {
                this.f[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.e && i3 >= this.f.length) {
            s5.G(this);
            i2 = ~sv0.M(this.h, i, this.f);
        }
        int i4 = this.h;
        if (i4 >= this.f.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.f = Arrays.copyOf(this.f, i8);
            this.g = Arrays.copyOf(this.g, i8);
        }
        int i9 = this.h;
        if (i9 - i2 != 0) {
            int[] iArr = this.f;
            int i10 = i2 + 1;
            ve.u0(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.g;
            ve.w0(objArr2, objArr2, i10, i2, this.h);
        }
        this.f[i2] = i;
        this.g[i2] = obj;
        this.h++;
    }

    public final int d() {
        if (this.e) {
            s5.G(this);
        }
        return this.h;
    }

    public final Object e(int i) {
        if (this.e) {
            s5.G(this);
        }
        Object[] objArr = this.g;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object objE = e(i2);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

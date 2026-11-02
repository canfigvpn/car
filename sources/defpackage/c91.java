package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c91 {
    public int[] a;
    public int b;

    public c91(int i) {
        this.a = i == 0 ? pr0.a : new int[i];
    }

    public final void a(int i) {
        int i2 = this.b + 1;
        int[] iArrCopyOf = this.a;
        if (iArrCopyOf.length < i2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i2, (iArrCopyOf.length * 3) / 2));
            this.a = iArrCopyOf;
        }
        int i3 = this.b;
        iArrCopyOf[i3] = i;
        this.b = i3 + 1;
    }

    public final int b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        qj.j("Index must be between 0 and size");
        return 0;
    }

    public final void c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            qj.j("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            ve.u0(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final void d(int i, int i2) {
        if (i < 0 || i >= this.b) {
            qj.j("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c91) {
            c91 c91Var = (c91) obj;
            int i = c91Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = c91Var.a;
                lr0 lr0VarS = ex.S(0, i2);
                int i3 = lr0VarS.e;
                int i4 = lr0VarS.f;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ c91() {
        this(16);
    }
}

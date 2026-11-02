package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g91 {
    public long[] a;
    public int b;

    public g91(int i) {
        this.a = i == 0 ? s41.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArrCopyOf = this.a;
        if (jArrCopyOf.length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
            this.a = jArrCopyOf;
        }
        int i2 = this.b;
        jArrCopyOf[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g91) {
            g91 g91Var = (g91) obj;
            int i = g91Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = g91Var.a;
                lr0 lr0VarS = ex.S(0, i2);
                int i3 = lr0VarS.e;
                int i4 = lr0VarS.f;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}

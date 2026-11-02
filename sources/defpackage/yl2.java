package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yl2 implements Comparable, Serializable {
    public static final yl2 g = new yl2(0, 0);
    public final long e;
    public final long f;

    public yl2(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yl2 yl2Var = (yl2) obj;
        yl2Var.getClass();
        long j = yl2Var.e;
        long j2 = this.e;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f ^ Long.MIN_VALUE, yl2Var.f ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2)) {
            return false;
        }
        yl2 yl2Var = (yl2) obj;
        return this.e == yl2Var.e && this.f == yl2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.e ^ this.f);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        y12.i(this.e, bArr, 0, 0, 4);
        bArr[8] = 45;
        y12.i(this.e, bArr, 9, 4, 6);
        bArr[13] = 45;
        y12.i(this.e, bArr, 14, 6, 8);
        bArr[18] = 45;
        y12.i(this.f, bArr, 19, 0, 2);
        bArr[23] = 45;
        y12.i(this.f, bArr, 24, 2, 8);
        return new String(bArr, ep.a);
    }
}

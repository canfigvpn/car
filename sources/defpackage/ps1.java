package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ps1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final tf g;

    public ps1(long j, long j2, long j3, long j4, long j5, float[] fArr, tf tfVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = tfVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && ps1.class == obj.getClass()) {
            ps1 ps1Var = (ps1) obj;
            if (this.a == ps1Var.a && this.b == ps1Var.b && this.e == ps1Var.e && ir0.a(this.c, ps1Var.c) && ir0.a(this.d, ps1Var.d)) {
                float[] fArr = ps1Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.g == ps1Var.g;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = k3.c(k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}

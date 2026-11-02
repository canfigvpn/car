package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 implements xo1 {
    public final int e;

    public kh2(int i) {
        this.e = i;
    }

    @Override // defpackage.xo1
    public final long a(mr0 mr0Var, long j, kw0 kw0Var, long j2) {
        int i = (int) (j2 >> 32);
        int iC = ((mr0Var.c() - i) / 2) + mr0Var.a;
        if (iC < 0) {
            iC = mr0Var.a;
        } else if (iC + i > ((int) (j >> 32))) {
            iC = mr0Var.c - i;
        }
        int i2 = mr0Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.e;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = mr0Var.d + i3;
        }
        return (((long) iC) << 32) | (((long) i4) & 4294967295L);
    }
}

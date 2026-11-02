package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u90 {
    public static final long[] e = new long[0];
    public final s12 a;
    public final fg0 b;
    public long c;
    public final long[] d;

    public u90(s12 s12Var, fg0 fg0Var) {
        s12Var.getClass();
        this.a = s12Var;
        this.b = fg0Var;
        int iD = s12Var.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rl0 implements xo1 {
    public final t3 e;
    public final yf1 f;
    public long g = 0;

    public rl0(t3 t3Var, yf1 yf1Var) {
        this.e = t3Var;
        this.f = yf1Var;
    }

    @Override // defpackage.xo1
    public final long a(mr0 mr0Var, long j, kw0 kw0Var, long j2) {
        long jA = this.f.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.g;
        }
        this.g = jA;
        return ir0.c(ir0.c((((long) mr0Var.b) & 4294967295L) | (((long) mr0Var.a) << 32), mx.N(jA)), this.e.a(j2, 0L, kw0Var));
    }
}

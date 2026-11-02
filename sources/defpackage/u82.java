package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u82 extends x82 {
    public d0 c;
    public int d;
    public int e;

    public u82(long j, d0 d0Var) {
        super(j);
        this.c = d0Var;
    }

    @Override // defpackage.x82
    public final void a(x82 x82Var) {
        synchronized (nj2.A0) {
            x82Var.getClass();
            this.c = ((u82) x82Var).c;
            this.d = ((u82) x82Var).d;
            this.e = ((u82) x82Var).e;
        }
    }

    @Override // defpackage.x82
    public final x82 b(long j) {
        return new u82(j, this.c);
    }
}

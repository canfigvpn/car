package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o42 extends o0 {
    public long a;
    public om b;

    @Override // defpackage.o0
    public final boolean a(n0 n0Var) {
        n42 n42Var = (n42) n0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = n42Var.m;
        if (j < n42Var.n) {
            n42Var.n = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.o0
    public final sx[] b(n0 n0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((n42) n0Var).v(j);
    }
}

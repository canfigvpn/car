package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a72 extends x82 {
    public long c;

    public a72(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.x82
    public final void a(x82 x82Var) {
        x82Var.getClass();
        this.c = ((a72) x82Var).c;
    }

    @Override // defpackage.x82
    public final x82 b(long j) {
        return new a72(j, this.c);
    }
}

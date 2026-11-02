package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z62 extends x82 {
    public int c;

    public z62(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.x82
    public final void a(x82 x82Var) {
        x82Var.getClass();
        this.c = ((z62) x82Var).c;
    }

    @Override // defpackage.x82
    public final x82 b(long j) {
        return new z62(this.c, j);
    }
}

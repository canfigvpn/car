package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y62 extends x82 {
    public float c;

    public y62(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.x82
    public final void a(x82 x82Var) {
        x82Var.getClass();
        this.c = ((y62) x82Var).c;
    }

    @Override // defpackage.x82
    public final x82 b(long j) {
        return new y62(this.c, j);
    }
}

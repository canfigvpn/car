package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends tu {
    public final g01 b;
    public final mz0 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ mz0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ s3 i;
    public final /* synthetic */ vi j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ q01 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(long j, boolean z, g01 g01Var, mz0 mz0Var, int i, int i2, s3 s3Var, vi viVar, int i3, int i4, long j2, q01 q01Var) {
        super(1);
        this.e = z;
        this.f = mz0Var;
        this.g = i;
        this.h = i2;
        this.i = s3Var;
        this.j = viVar;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = q01Var;
        this.b = g01Var;
        this.c = mz0Var;
        this.d = tw.b(z ? sw.h(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : sw.g(j), 5);
    }

    public final l01 n(int i, long j) {
        g01 g01Var = this.b;
        Object objB = g01Var.b(i);
        Object objU = g01Var.b.u(i);
        return new l01(i, g(this.c, i, j), this.e, this.i, this.j, this.f.f.getLayoutDirection(), this.k, this.l, i == this.g + (-1) ? 0 : this.h, this.m, objB, objU, this.n.n, j);
    }
}

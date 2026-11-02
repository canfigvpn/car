package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ob0 extends dw0 implements ej0 {
    public final /* synthetic */ jm1 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ na i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(jm1 jm1Var, long j, long j2, na naVar) {
        super(1);
        this.f = jm1Var;
        this.g = j;
        this.h = j2;
        this.i = naVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        long j = this.g;
        long j2 = this.h;
        jm1 jm1Var = this.f;
        ((im1) obj).f(jm1Var);
        jm1Var.l0(ir0.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), jm1Var.i), 0.0f, this.i);
        return ll2.a;
    }
}

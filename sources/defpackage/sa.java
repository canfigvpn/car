package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sa extends dw0 implements ej0 {
    public final /* synthetic */ jm1[] f;
    public final /* synthetic */ ta g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(jm1[] jm1VarArr, ta taVar, int i, int i2) {
        super(1);
        this.f = jm1VarArr;
        this.g = taVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        im1 im1Var = (im1) obj;
        for (jm1 jm1Var : this.f) {
            if (jm1Var != null) {
                long jA = this.g.a.b.a((((long) jm1Var.e) << 32) | (((long) jm1Var.f) & 4294967295L), (((long) this.h) << 32) | (((long) this.i) & 4294967295L), kw0.e);
                im1Var.h(jm1Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return ll2.a;
    }
}

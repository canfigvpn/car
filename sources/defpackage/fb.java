package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends dw0 implements jj0 {
    public final /* synthetic */ ej0 f;
    public final /* synthetic */ ki2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(ej0 ej0Var, ki2 ki2Var) {
        super(3);
        this.f = ej0Var;
        this.g = ki2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j;
        y61 y61Var = (y61) obj;
        jm1 jm1VarE = ((r61) obj2).e(((sw) obj3).a);
        if (y61Var.r()) {
            if (((Boolean) this.f.h(this.g.d.getValue())).booleanValue()) {
                j = (((long) jm1VarE.e) << 32) | (((long) jm1VarE.f) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) jm1VarE.e) << 32) | (((long) jm1VarE.f) & 4294967295L);
        }
        return y61Var.d0((int) (j >> 32), (int) (4294967295L & j), db0.e, new q4(jm1VarE, 2));
    }
}

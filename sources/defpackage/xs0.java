package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends st1 {
    public int f;
    public final /* synthetic */ ij0 g;
    public final /* synthetic */ sx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(sx sxVar, sx sxVar2, ij0 ij0Var) {
        super(sxVar);
        this.g = ij0Var;
        this.h = sxVar2;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                fu1.h("This coroutine had already completed");
                return null;
            }
            this.f = 2;
            ix.Q(obj);
            return obj;
        }
        this.f = 1;
        ix.Q(obj);
        ij0 ij0Var = this.g;
        ij0Var.getClass();
        nj2.i(2, ij0Var);
        return ij0Var.g(this.h, this);
    }
}

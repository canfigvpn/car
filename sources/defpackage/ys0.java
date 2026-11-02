package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 extends tx {
    public int h;
    public final /* synthetic */ ij0 i;
    public final /* synthetic */ sx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(sx sxVar, uy uyVar, ij0 ij0Var, sx sxVar2) {
        super(sxVar, uyVar);
        this.i = ij0Var;
        this.j = sxVar2;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                fu1.h("This coroutine had already completed");
                return null;
            }
            this.h = 2;
            ix.Q(obj);
            return obj;
        }
        this.h = 1;
        ix.Q(obj);
        ij0 ij0Var = this.i;
        ij0Var.getClass();
        nj2.i(2, ij0Var);
        return ij0Var.g(this.j, this);
    }
}

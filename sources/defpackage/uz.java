package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uz extends wa2 implements ij0 {
    public int i;
    public final /* synthetic */ bv1 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ ej0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(sx sxVar, ej0 ej0Var, bv1 bv1Var, boolean z, boolean z2) {
        super(2, sxVar);
        this.j = bv1Var;
        this.k = z;
        this.l = z2;
        this.m = ej0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((uz) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new uz(sxVar, this.m, this.j, this.k, this.l);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                ix.Q(obj);
                return obj;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        ej0 ej0Var = this.m;
        bv1 bv1Var = this.j;
        boolean z = this.l;
        boolean z2 = this.k;
        wz wzVar = new wz(null, ej0Var, bv1Var, z, z2);
        this.i = 1;
        Object objL = bv1Var.l(z2, wzVar, this);
        fz fzVar = fz.e;
        return objL == fzVar ? fzVar : objL;
    }
}

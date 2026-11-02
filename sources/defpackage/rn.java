package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rn implements pe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hf0 f;

    public /* synthetic */ rn(hf0 hf0Var, int i) {
        this.e = i;
        this.f = hf0Var;
    }

    @Override // defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        hf0 hf0Var = this.f;
        switch (i) {
            case 0:
                Object objA = hf0Var.a(new qn(qe0Var, 0), sxVar);
                return objA == fzVar ? objA : ll2Var;
            case 1:
                Object objA2 = hf0Var.a(new qn(qe0Var, 1), sxVar);
                return objA2 == fzVar ? objA2 : ll2Var;
            case 2:
                Object objA3 = hf0Var.a(new qn(qe0Var, 3), sxVar);
                return objA3 == fzVar ? objA3 : ll2Var;
            case 3:
                Object objA4 = hf0Var.a(new qn(qe0Var, 4), sxVar);
                return objA4 == fzVar ? objA4 : ll2Var;
            default:
                Object objA5 = hf0Var.a(new qn(qe0Var, 5), sxVar);
                return objA5 == fzVar ? objA5 : ll2Var;
        }
    }
}

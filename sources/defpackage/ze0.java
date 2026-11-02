package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 implements pe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ze0(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) throws Throwable {
        int i = this.e;
        int i2 = 2;
        int i3 = 3;
        sx sxVar2 = null;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                Object objA = ((to) obj2).a(new cb(new cs1(), qe0Var, (pr1) obj, 2), sxVar);
                return objA == fzVar ? objA : ll2Var;
            case 1:
                Object objM = nj2.m(sxVar, qe0Var, new bf0(1, sxVar2, (qm0) obj), (pe0[]) obj2);
                return objM == fzVar ? objM : ll2Var;
            case 2:
                Object objM2 = nj2.m(sxVar, qe0Var, new bf0(i2, sxVar2, (lj0) obj), (pe0[]) obj2);
                return objM2 == fzVar ? objM2 : ll2Var;
            case 3:
                Object objM3 = nj2.m(sxVar, qe0Var, new bf0(i3, sxVar2, (jn0) obj), (pe0[]) obj2);
                return objM3 == fzVar ? objM3 : ll2Var;
            default:
                Object objA2 = ((pe0) obj2).a(new j60(i3, qe0Var, (g61) obj), sxVar);
                return objA2 == fzVar ? objA2 : ll2Var;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements pe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pe0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ qj0 h;

    public /* synthetic */ hf0(pe0 pe0Var, Object obj, qj0 qj0Var, int i) {
        this.e = i;
        this.f = pe0Var;
        this.g = obj;
        this.h = qj0Var;
    }

    @Override // defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) throws Throwable {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        qj0 qj0Var = this.h;
        Object obj = this.g;
        pe0 pe0Var = this.f;
        switch (i) {
            case 0:
                Object objM = nj2.m(sxVar, qe0Var, new bf0((jj0) qj0Var, (sx) null, 4), new pe0[]{pe0Var, (pe0) obj});
                return objM == fzVar ? objM : ll2Var;
            default:
                Object objA = pe0Var.a(new cb(qe0Var, (bv1) obj, (ej0) qj0Var, 3), sxVar);
                return objA == fzVar ? objA : ll2Var;
        }
    }
}

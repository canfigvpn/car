package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends wa2 implements ej0 {
    public final /* synthetic */ nk1 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ ej0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk1(nk1 nk1Var, String str, ej0 ej0Var, sx sxVar) {
        super(1, sxVar);
        this.i = nk1Var;
        this.j = str;
        this.k = ej0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        String str = this.j;
        ej0 ej0Var = this.k;
        return new mk1(this.i, str, ej0Var, (sx) obj).r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        xv1 xv1VarC = this.i.b.C(this.j);
        try {
            Object objH = this.k.h(xv1VarC);
            ir2.h(xv1VarC, null);
            return objH;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }
}

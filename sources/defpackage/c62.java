package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c62 implements ij0 {
    public final /* synthetic */ ij0 e;
    public final /* synthetic */ gt f;
    public final /* synthetic */ ij0 g;
    public final /* synthetic */ vf2 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;

    public c62(ij0 ij0Var, gt gtVar, ij0 ij0Var2, vf2 vf2Var, long j, long j2) {
        this.e = ij0Var;
        this.f = gtVar;
        this.g = ij0Var2;
        this.h = vf2Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            ak0Var.W(-168976609);
            n02.a(this.f, this.e, this.g, this.h, this.i, this.j, ak0Var, 0);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ gt g;
    public final /* synthetic */ ij0 h;
    public final /* synthetic */ ij0 i;
    public final /* synthetic */ ha1 j;
    public final /* synthetic */ ij0 k;

    public ex1(int i, ij0 ij0Var, gt gtVar, ij0 ij0Var2, ij0 ij0Var3, ha1 ha1Var, ij0 ij0Var4) {
        this.e = i;
        this.f = ij0Var;
        this.g = gtVar;
        this.h = ij0Var2;
        this.i = ij0Var3;
        this.j = ha1Var;
        this.k = ij0Var4;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            ix.g(this.e, this.f, this.g, this.h, this.i, this.j, this.k, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

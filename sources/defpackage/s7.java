package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 implements ij0 {
    public final /* synthetic */ u71 e;
    public final /* synthetic */ ea1 f;
    public final /* synthetic */ da1 g;
    public final /* synthetic */ zx1 h;
    public final /* synthetic */ u32 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ gt l;

    public s7(u71 u71Var, ea1 ea1Var, da1 da1Var, zx1 zx1Var, u32 u32Var, long j, float f, gt gtVar) {
        this.e = u71Var;
        this.f = ea1Var;
        this.g = da1Var;
        this.h = zx1Var;
        this.i = u32Var;
        this.j = j;
        this.k = f;
        this.l = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            sv0.G(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, ak0Var, 384);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

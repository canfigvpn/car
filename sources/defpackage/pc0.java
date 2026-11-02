package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pc0 implements ij0 {
    public final /* synthetic */ vc0 e;
    public final /* synthetic */ u71 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ea1 h;
    public final /* synthetic */ da1 i;
    public final /* synthetic */ zx1 j;
    public final /* synthetic */ u32 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ float m;
    public final /* synthetic */ gt n;

    public pc0(vc0 vc0Var, u71 u71Var, boolean z, ea1 ea1Var, da1 da1Var, zx1 zx1Var, u32 u32Var, long j, float f, gt gtVar) {
        this.e = vc0Var;
        this.f = u71Var;
        this.g = z;
        this.h = ea1Var;
        this.i = da1Var;
        this.j = zx1Var;
        this.k = u32Var;
        this.l = j;
        this.m = f;
        this.n = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            vc0 vc0Var = this.e;
            sv0.G(sv0.k0(this.f, new uc0(0, vc0Var.j, vc0Var.k, this.g)), this.h, this.i, this.j, this.k, this.l, this.m, this.n, ak0Var, 384);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

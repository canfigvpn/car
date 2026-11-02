package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rp implements ij0 {
    public final /* synthetic */ nz1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ gt h;
    public final /* synthetic */ vf2 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ gj1 k;

    public rp(nz1 nz1Var, boolean z, boolean z2, gt gtVar, vf2 vf2Var, float f, gj1 gj1Var) {
        this.e = nz1Var;
        this.f = z;
        this.g = z2;
        this.h = gtVar;
        this.i = vf2Var;
        this.j = f;
        this.k = gj1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            nz1 nz1Var = this.e;
            boolean z = this.f;
            boolean z2 = this.g;
            if (z) {
                j = !z2 ? nz1Var.b : nz1Var.k;
            } else {
                j = nz1Var.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? nz1Var.c : nz1Var.l;
            } else {
                j2 = nz1Var.g;
            }
            if (z) {
                j3 = !z2 ? nz1Var.d : nz1Var.m;
            } else {
                j3 = nz1Var.h;
            }
            sp.a(this.h, this.i, j4, j2, j3, this.j, this.k, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

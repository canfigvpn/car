package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 implements ij0 {
    public final /* synthetic */ ij0 e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ u32 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ij0 l;
    public final /* synthetic */ gt m;

    public q3(ij0 ij0Var, ij0 ij0Var2, u32 u32Var, long j, long j2, long j3, long j4, ij0 ij0Var3, gt gtVar) {
        this.e = ij0Var;
        this.f = ij0Var2;
        this.g = u32Var;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = ij0Var3;
        this.m = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            r3.a(vs0.C(1367541877, new p3(this.l, this.m, 1), ak0Var), null, this.e, this.f, this.g, this.h, lr.e(vs0.l, ak0Var), this.i, this.j, this.k, ak0Var, 6);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

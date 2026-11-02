package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d62 implements ij0 {
    public final /* synthetic */ ij0 e;
    public final /* synthetic */ gt f;
    public final /* synthetic */ ij0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    public d62(ij0 ij0Var, gt gtVar, ij0 ij0Var2, long j, long j2) {
        this.e = ij0Var;
        this.f = gtVar;
        this.g = ij0Var2;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            sv.a(ef2.a.a(ik2.a(dv1.E, ak0Var)), vs0.C(969655473, new c62(this.e, this.f, this.g, ik2.a(dv1.y, ak0Var), this.h, this.i), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

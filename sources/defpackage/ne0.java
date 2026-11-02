package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ne0 implements ij0 {
    public final /* synthetic */ long e;
    public final /* synthetic */ vf2 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ gt h;

    public ne0(long j, vf2 vf2Var, float f, gt gtVar) {
        this.e = j;
        this.f = vf2Var;
        this.g = f;
        this.h = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            vv.d(this.e, this.f, vs0.C(-1767363041, new me0(this.g, this.h), ak0Var), ak0Var, 384);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

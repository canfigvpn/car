package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nl implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ qj0 h;

    public /* synthetic */ nl(long j, Object obj, qj0 qj0Var, int i) {
        this.e = i;
        this.f = j;
        this.g = obj;
        this.h = qj0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        qj0 qj0Var = this.h;
        Object obj3 = this.g;
        int i2 = 1;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    vv.d(this.f, ((gk2) ak0Var.j(ik2.a)).m, vs0.C(417635459, new ji(i2, (gj1) obj3, (jj0) qj0Var), ak0Var), ak0Var, 384);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    j12.b(this.f, (vf2) obj3, (ij0) qj0Var, ak0Var2, 0);
                }
                break;
        }
        return ll2Var;
    }
}

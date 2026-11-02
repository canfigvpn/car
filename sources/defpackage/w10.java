package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w10 implements ij0 {
    public final /* synthetic */ ti0 e;
    public final /* synthetic */ u71 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ jo0 h;
    public final /* synthetic */ String i;

    public w10(ti0 ti0Var, u71 u71Var, boolean z, jo0 jo0Var, String str) {
        this.e = ti0Var;
        this.f = u71Var;
        this.g = z;
        this.h = jo0Var;
        this.i = str;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            j20.d(this.e, this.f, this.g, null, null, vs0.C(-1301085432, new ji(3, this.h, this.i, z), ak0Var), ak0Var, 1572864, 56);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

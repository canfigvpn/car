package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 implements ij0 {
    public final /* synthetic */ boolean e;

    public mz1(boolean z) {
        this.e = z;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            kz1.a.b(this.e, null, ak0Var, 3072);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

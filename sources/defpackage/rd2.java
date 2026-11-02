package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rd2 implements ij0 {
    public final /* synthetic */ long e;
    public final /* synthetic */ ij0 f;

    public rd2(long j, ij0 ij0Var) {
        this.e = j;
        this.f = ij0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            j12.c(this.e, this.f, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

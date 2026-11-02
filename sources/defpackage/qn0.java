package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 extends dw0 implements ij0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rn0[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn0(rn0[] rn0VarArr, int i) {
        super(2);
        this.f = i;
        this.g = rn0VarArr;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        rn0[] rn0VarArr = this.g;
        switch (i) {
            case 0:
                return Float.valueOf(ex.D((im1) obj, true, rn0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(ex.D((im1) obj, false, rn0VarArr, ((Number) obj2).floatValue()));
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m30 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p82 f;

    public /* synthetic */ m30(p82 p82Var, int i) {
        this.e = i;
        this.f = p82Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        p82 p82Var = this.f;
        switch (i) {
            case 0:
                l80 l80Var = (l80) obj;
                long j = ((dr) p82Var.getValue()).a;
                if (!vk2.a(j, dr.g)) {
                    l80.c0(l80Var, j, 0L, 0L, 126);
                }
                break;
            case 1:
                ((bu1) obj).c(((Number) p82Var.getValue()).floatValue());
                break;
            default:
                ((bu1) obj).c(((Number) p82Var.getValue()).floatValue());
                break;
        }
        return ll2Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ki0(ij0 ij0Var, Object obj, Object obj2, int i) {
        this.e = i;
        this.f = ij0Var;
        this.h = obj;
        this.g = obj2;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj = this.g;
        Object obj2 = this.h;
        ij0 ij0Var = this.f;
        switch (i) {
            case 0:
                ij0Var.g(Long.valueOf(((oi0) ((p82) obj).getValue()).a), Long.valueOf(((di0) obj2).a.a));
                break;
            case 1:
                ij0Var.g(Long.valueOf(((om0) ((p82) obj).getValue()).a), Long.valueOf(((lm0) obj2).a.a));
                break;
            default:
                ij0Var.g(Long.valueOf(((wm) obj2).a), Long.valueOf(((ul2) obj).a.a));
                break;
        }
        return ll2Var;
    }
}

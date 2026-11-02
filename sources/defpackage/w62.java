package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w62 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ej0 f;

    public /* synthetic */ w62(ej0 ej0Var, int i) {
        this.e = i;
        this.f = ej0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ej0 ej0Var = this.f;
        switch (i) {
            case 0:
                o62 o62Var = (o62) ej0Var.h((u62) obj);
                synchronized (x62.c) {
                    x62.d = x62.d.e(o62Var.g());
                }
                return o62Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return ej0Var.h(l);
        }
    }
}

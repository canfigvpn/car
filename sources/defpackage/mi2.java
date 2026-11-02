package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mi2 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ki2 f;

    public /* synthetic */ mi2(ki2 ki2Var, int i) {
        this.e = i;
        this.f = ki2Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ki2 ki2Var = this.f;
        switch (i) {
            case 0:
                return new ni2(ki2Var, 1);
            default:
                return new ni2(ki2Var, 0);
        }
    }
}

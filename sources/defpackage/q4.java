package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ jm1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(jm1 jm1Var, int i) {
        super(1);
        this.f = i;
        this.g = jm1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        jm1 jm1Var = this.g;
        switch (i) {
            case 0:
                ((im1) obj).h(jm1Var, 0, 0, 0.0f);
                break;
            case 1:
                im1.k((im1) obj, jm1Var, 0, 0);
                break;
            case 2:
                ((im1) obj).h(jm1Var, 0, 0, 0.0f);
                break;
            case 3:
                ((im1) obj).h(jm1Var, 0, 0, 0.0f);
                break;
            case 4:
                ((im1) obj).h(jm1Var, 0, 0, 0.0f);
                break;
            case 5:
                im1.k((im1) obj, jm1Var, 0, 0);
                break;
            default:
                im1.m((im1) obj, jm1Var, 0, 0);
                break;
        }
        return ll2Var;
    }
}

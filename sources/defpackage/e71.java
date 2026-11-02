package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e71 implements ej0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e71(cs1 cs1Var, cs1 cs1Var2, rb1 rb1Var, boolean z, le leVar) {
        this.g = cs1Var;
        this.h = cs1Var2;
        this.i = rb1Var;
        this.f = z;
        this.j = leVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        float fFloatValue;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.j;
        boolean z = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                dk1 dk1Var = ((ea1) obj5).c;
                da1 da1Var = (da1) obj4;
                p82 p82Var = (p82) obj3;
                p82 p82Var2 = (p82) obj2;
                bu1 bu1Var = (bu1) obj;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) dk1Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) p82Var.getValue()).floatValue();
                }
                bu1Var.h(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) p82Var.getValue()).floatValue();
                } else if (((Boolean) dk1Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                bu1Var.i(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) p82Var2.getValue()).floatValue();
                } else if (!((Boolean) dk1Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                bu1Var.c(fFloatValue3);
                bu1Var.n(((ai2) da1Var.getValue()).a);
                break;
            default:
                kb1 kb1Var = (kb1) obj;
                kb1Var.getClass();
                ((cs1) obj5).e = true;
                ((cs1) obj4).e = true;
                ((rb1) obj3).n(kb1Var, z, (le) obj2);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ e71(boolean z, ea1 ea1Var, da1 da1Var, ii2 ii2Var, ii2 ii2Var2) {
        this.f = z;
        this.g = ea1Var;
        this.h = da1Var;
        this.i = ii2Var;
        this.j = ii2Var2;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class em2 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fm2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em2(fm2 fm2Var, int i) {
        super(1);
        this.f = i;
        this.g = fm2Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        fm2 fm2Var = this.g;
        switch (i) {
            case 0:
                fm2Var.d = true;
                fm2Var.f.a();
                return ll2Var;
            default:
                l80 l80Var = (l80) obj;
                nl0 nl0Var = fm2Var.b;
                float f = fm2Var.k;
                float f2 = fm2Var.l;
                ud udVarB = l80Var.B();
                long jM = udVarB.m();
                udVarB.g().l();
                try {
                    ((ao2) udVarB.b).s(f, f2, 0L);
                    nl0Var.a(l80Var);
                    return ll2Var;
                } finally {
                    k3.s(udVarB, jM);
                }
        }
    }
}

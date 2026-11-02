package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gs1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4(gs1 gs1Var, int i) {
        super(1);
        this.f = i;
        this.g = gs1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        boolean z;
        int i = this.f;
        gs1 gs1Var = this.g;
        switch (i) {
            case 0:
                gs1Var.e = (cg0) obj;
                return Boolean.TRUE;
            case 1:
                vn0 vn0Var = (vn0) obj;
                Object obj2 = gs1Var.e;
                if (obj2 == null && vn0Var.u) {
                    gs1Var.e = vn0Var;
                } else if (obj2 != null) {
                    vn0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (si2) obj;
                if (((t71) obj3).e.r) {
                    gs1Var.e = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

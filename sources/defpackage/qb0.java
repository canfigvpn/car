package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qb0 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rb0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb0(rb0 rb0Var, int i) {
        super(1);
        this.f = i;
        this.g = rb0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        hb0 hb0Var = hb0.g;
        hb0 hb0Var2 = hb0.f;
        hb0 hb0Var3 = hb0.e;
        rb0 rb0Var = this.g;
        switch (i) {
            case 0:
                gi2 gi2Var = (gi2) obj;
                boolean zB = gi2Var.b(hb0Var3, hb0Var2);
                Object obj2 = null;
                if (zB) {
                    jo joVar = rb0Var.x.a.c;
                    if (joVar != null) {
                        obj2 = joVar.c;
                    }
                } else if (gi2Var.b(hb0Var2, hb0Var)) {
                    jo joVar2 = rb0Var.y.a.c;
                    if (joVar2 != null) {
                        obj2 = joVar2.c;
                    }
                } else {
                    obj2 = nb0.d;
                }
                return obj2 == null ? nb0.d : obj2;
            default:
                gi2 gi2Var2 = (gi2) obj;
                if (gi2Var2.b(hb0Var3, hb0Var2)) {
                    i52 i52Var = rb0Var.x.a.b;
                    return i52Var != null ? i52Var.b : nb0.c;
                }
                if (!gi2Var2.b(hb0Var2, hb0Var)) {
                    return nb0.c;
                }
                i52 i52Var2 = rb0Var.y.a.b;
                return i52Var2 != null ? i52Var2.b : nb0.c;
        }
    }
}

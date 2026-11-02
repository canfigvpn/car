package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class na extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        boolean zBooleanValue;
        int i = this.f;
        int i2 = 1;
        ai2 ai2Var = null;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                return new r1((h72) obj4, obj3, (ab) obj2, i2);
            case 1:
                si2 si2Var = (si2) obj;
                d70 d70Var = (d70) si2Var;
                if (!((r6) ((e5) qx.W((d70) obj3)).getDragAndDropManager()).b.contains(d70Var) || !qx.v(d70Var, ux.v((ao2) obj2))) {
                    return ri2.e;
                }
                ((gs1) obj4).e = si2Var;
                return ri2.g;
            case 2:
                bu1 bu1Var = (bu1) obj;
                p82 p82Var = (p82) obj3;
                p82 p82Var2 = (p82) obj4;
                bu1Var.c(p82Var2 != null ? ((Number) p82Var2.getValue()).floatValue() : 1.0f);
                bu1Var.h(p82Var != null ? ((Number) p82Var.getValue()).floatValue() : 1.0f);
                bu1Var.i(p82Var != null ? ((Number) p82Var.getValue()).floatValue() : 1.0f);
                p82 p82Var3 = (p82) obj2;
                bu1Var.n(p82Var3 != null ? ((ai2) p82Var3.getValue()).a : ai2.b);
                return ll2.a;
            case 3:
                li2 li2Var = ((sb0) obj3).a;
                kc0 kc0Var = (kc0) obj2;
                int iOrdinal = ((hb0) obj).ordinal();
                if (iOrdinal == 0) {
                    hx1 hx1Var = li2Var.d;
                    if (hx1Var != null) {
                        ai2Var = new ai2(hx1Var.b);
                    } else {
                        hx1 hx1Var2 = kc0Var.a.d;
                        if (hx1Var2 != null) {
                            ai2Var = new ai2(hx1Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    ai2Var = (ai2) obj4;
                } else {
                    if (iOrdinal != 2) {
                        qj.p();
                        return null;
                    }
                    hx1 hx1Var3 = kc0Var.a.d;
                    if (hx1Var3 != null) {
                        ai2Var = new ai2(hx1Var3.b);
                    } else {
                        hx1 hx1Var4 = li2Var.d;
                        if (hx1Var4 != null) {
                            ai2Var = new ai2(hx1Var4.b);
                        }
                    }
                }
                return new ai2(ai2Var != null ? ai2Var.a : ai2.b);
            default:
                cg0 cg0Var = (cg0) obj;
                if (ws0.j(cg0Var, (cg0) obj4)) {
                    zBooleanValue = false;
                } else {
                    if (ws0.j(cg0Var, ((vf0) obj3).c)) {
                        fu1.h("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((ej0) obj2).h(cg0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }
}

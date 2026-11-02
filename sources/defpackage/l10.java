package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l10 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ f20 f;

    public /* synthetic */ l10(f20 f20Var, int i) {
        this.e = i;
        this.f = f20Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        f20 f20Var = this.f;
        switch (i) {
            case 0:
                bm bmVar = f20Var.c;
                x50 x50Var = (x50) obj;
                int i2 = x50Var.a;
                Long lB = f20Var.b();
                if (lB != null) {
                    em emVarF = bmVar.f(bmVar.f(lB.longValue()).e);
                    if (f20Var.a.a(emVarF.a)) {
                        f20Var.e.setValue(emVarF);
                    }
                }
                f20Var.g.setValue(x50Var);
                break;
            case 1:
                Long l = (Long) obj;
                dk1 dk1Var = f20Var.f;
                if (l == null) {
                    dk1Var.setValue(null);
                } else {
                    zl zlVarB = f20Var.c.b(l.longValue());
                    dk1Var.setValue(f20Var.a.a(zlVarB.e) ? zlVarB : null);
                }
                break;
            default:
                em emVarF2 = f20Var.c.f(((Long) obj).longValue());
                if (f20Var.a.a(emVarF2.a)) {
                    f20Var.e.setValue(emVarF2);
                }
                break;
        }
        return ll2Var;
    }
}

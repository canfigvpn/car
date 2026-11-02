package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ f11 f;

    public /* synthetic */ ey(f11 f11Var, int i) {
        this.e = i;
        this.f = f11Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        f11 f11Var = this.f;
        switch (i) {
            case 0:
                jw0 jw0Var = (jw0) obj;
                if2 if2VarD = f11Var.d();
                if (if2VarD != null) {
                    if2VarD.c = jw0Var;
                }
                return ll2Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                f11Var.q.setValue(bool);
                return ll2Var;
            case 2:
                dk1 dk1Var = f11Var.t;
                te2 te2Var = (te2) obj;
                String str = te2Var.a.f;
                yb ybVar = f11Var.j;
                if (!ws0.j(str, ybVar != null ? ybVar.f : null)) {
                    f11Var.k.setValue(sl0.e);
                    if (((Boolean) dk1Var.getValue()).booleanValue()) {
                        dk1Var.setValue(Boolean.FALSE);
                    } else {
                        f11Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = of2.b;
                f11Var.f(j);
                f11Var.e(j);
                f11Var.u.h(te2Var);
                lr1 lr1Var = f11Var.b;
                qv qvVar = lr1Var.a;
                if (qvVar != null) {
                    qvVar.s(lr1Var, null);
                }
                return ll2Var;
            case 3:
                f11Var.r.u(((no0) obj).a);
                return ll2Var;
            default:
                return Boolean.valueOf(f11Var.r.u(((no0) obj).a));
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ py f;

    public /* synthetic */ ny(py pyVar, int i) {
        this.e = i;
        this.f = pyVar;
    }

    @Override // defpackage.ti0
    public final Object a() {
        l72 l72Var;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        py pyVar = this.f;
        switch (i) {
            case 0:
                qx.S(pyVar);
                return ll2Var;
            case 1:
                pyVar.A.e(true);
                break;
            case 2:
                pyVar.A.a(true);
                break;
            case 3:
                pyVar.A.c();
                break;
            case 4:
                qx.S(pyVar);
                return ll2Var;
            case 5:
                pyVar.A.o();
                break;
            case 6:
                pyVar.w.w.f.r.u(pyVar.B.e);
                break;
            default:
                f11 f11Var = pyVar.w;
                xf0 xf0Var = pyVar.C;
                boolean z = pyVar.x;
                if (!f11Var.b()) {
                    xf0.a(xf0Var);
                } else if (!z && (l72Var = f11Var.c) != null) {
                    ((e40) l72Var).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}

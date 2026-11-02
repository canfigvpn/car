package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ ii(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        String str = this.f;
        z02 z02Var = (z02) obj;
        switch (i) {
            case 0:
                w02.c(z02Var, 1);
                w02.d(z02Var, str);
                break;
            case 1:
                w02.c(z02Var, 0);
                w02.b(z02Var, str);
                break;
            case 2:
                yb ybVar = new yb(str);
                lv0[] lv0VarArr = w02.a;
                z02Var.a(u02.C, vs0.u(ybVar));
                w02.e(z02Var, 0);
                break;
            case 3:
                yb ybVar2 = new yb(str);
                lv0[] lv0VarArr2 = w02.a;
                z02Var.a(u02.C, vs0.u(ybVar2));
                w02.e(z02Var, 0);
                break;
            case 4:
                w02.d(z02Var, str);
                break;
            case 5:
                w02.c(z02Var, 0);
                w02.b(z02Var, str);
                break;
            case 6:
                w02.d(z02Var, str);
                break;
            case 7:
                w02.b(z02Var, str);
                w02.e(z02Var, 5);
                break;
            default:
                lv0[] lv0VarArr3 = w02.a;
                z02Var.a(u02.M, str);
                break;
        }
        return ll2Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ z02 f;

    public /* synthetic */ kp(z02 z02Var, int i) {
        this.e = i;
        this.f = z02Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        boolean z = true;
        z02 z02Var = this.f;
        switch (i) {
            case 0:
                si2 si2Var = (si2) obj;
                si2Var.getClass();
                fk1 fk1Var = (fk1) si2Var;
                fk1Var.t = true;
                fk1Var.s.h(z02Var);
                n02.l(fk1Var);
                return Boolean.FALSE;
            default:
                y6 y6Var = (y6) obj;
                Boolean boolValueOf = y6Var.a.isToggle() ? Boolean.valueOf(y6Var.a.getToggleValue()) : null;
                if (boolValueOf != null) {
                    ch2 ch2Var = boolValueOf.booleanValue() ? ch2.e : ch2.f;
                    lv0[] lv0VarArr = w02.a;
                    y02 y02Var = u02.K;
                    lv0 lv0Var = w02.a[26];
                    z02Var.a(y02Var, ch2Var);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}

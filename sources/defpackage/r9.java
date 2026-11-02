package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r9 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ da1 f;

    public /* synthetic */ r9(da1 da1Var, int i) {
        this.e = i;
        this.f = da1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        da1 da1Var = this.f;
        switch (i) {
            case 0:
                jw0 jw0Var = (jw0) da1Var.getValue();
                if (jw0Var != null) {
                    return jw0Var;
                }
                yp0.d("Required value was null.");
                qj.e();
                return null;
            case 1:
                da1Var.setValue(Boolean.valueOf(!((Boolean) da1Var.getValue()).booleanValue()));
                return ll2Var;
            case 2:
                jw0 jw0Var2 = (jw0) da1Var.getValue();
                if (jw0Var2 != null) {
                    return jw0Var2;
                }
                yp0.d("Required value was null.");
                qj.e();
                return null;
            case 3:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 4:
                da1Var.setValue(Boolean.TRUE);
                return ll2Var;
            case 5:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 6:
                Boolean bool = (Boolean) da1Var.getValue();
                bool.booleanValue();
                return bool;
            case 7:
                da1Var.setValue(Boolean.valueOf(!((Boolean) da1Var.getValue()).booleanValue()));
                return ll2Var;
            case 8:
                da1Var.setValue(ll2Var);
                return ll2Var;
            case 9:
                ((nc0) da1Var.getValue()).getClass();
                da1Var.setValue(new nc0());
                return ll2Var;
            case 10:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 11:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 12:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 13:
                da1Var.setValue(Boolean.TRUE);
                return ll2Var;
            case 14:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 15:
                da1Var.setValue(Boolean.TRUE);
                return ll2Var;
            case 16:
                return new yx0((ej0) da1Var.getValue());
            case 17:
                return (jz0) ((ti0) da1Var.getValue()).a();
            case 18:
                return new f01((ej0) da1Var.getValue());
            case 19:
                da1Var.setValue(Boolean.TRUE);
                return ll2Var;
            case 20:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 21:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 22:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 23:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 24:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            case 25:
                da1Var.setValue(Boolean.TRUE);
                return ll2Var;
            case 26:
                jw0 jw0Var3 = (jw0) da1Var.getValue();
                if (jw0Var3 != null) {
                    return jw0Var3;
                }
                yp0.d("Required value was null.");
                qj.e();
                return null;
            case 27:
                da1Var.setValue(Boolean.TRUE);
                return ll2Var;
            case 28:
                da1Var.setValue(Boolean.FALSE);
                return ll2Var;
            default:
                return (jw0) da1Var.getValue();
        }
    }
}

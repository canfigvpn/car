package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s9 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ da1 f;

    public /* synthetic */ s9(da1 da1Var, int i) {
        this.e = i;
        this.f = da1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        da1 da1Var = this.f;
        switch (i) {
            case 0:
                da1Var.setValue((jw0) obj);
                return ll2Var;
            case 1:
                nt0 nt0Var = (nt0) obj;
                nt0Var.getClass();
                da1Var.setValue(nt0Var);
                return ll2Var;
            case 2:
                da1Var.setValue((jw0) obj);
                return ll2Var;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                da1Var.setValue(bool);
                return ll2Var;
            case 4:
                z02 z02Var = (z02) obj;
                if (!h92.I((CharSequence) da1Var.getValue())) {
                    String str = (String) da1Var.getValue();
                    lv0[] lv0VarArr = w02.a;
                    z02Var.a(u02.M, str);
                }
                return ll2Var;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str2.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                da1Var.setValue(h92.P(sb.toString(), 7));
                return ll2Var;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                da1Var.setValue(bool2);
                return ll2Var;
            case 7:
                da1Var.setValue((jw0) obj);
                return ll2Var;
            case 8:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((ej0) da1Var.getValue()).h(f)).floatValue());
            case 9:
                ((ej0) da1Var.getValue()).h((uf1) obj);
                return ll2Var;
            default:
                da1Var.setValue((jw0) obj);
                return ll2Var;
        }
    }
}

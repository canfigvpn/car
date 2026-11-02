package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb0 implements ti0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vb0(int i, ej0 ej0Var, da1 da1Var) {
        this.g = ej0Var;
        this.f = i;
        this.h = da1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        Object obj = this.h;
        int iIntValue = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                String str = (String) obj2;
                wb0 wb0Var = (wb0) obj;
                s12[] s12VarArr = new s12[iIntValue];
                for (int i2 = 0; i2 < iIntValue; i2++) {
                    s12VarArr[i2] = v12.e(str + '.' + wb0Var.e[i2], q92.e, new s12[0]);
                }
                return s12VarArr;
            default:
                ej0 ej0Var = (ej0) obj2;
                Integer numA = o92.A((String) ((da1) obj).getValue());
                if (numA != null) {
                    iIntValue = numA.intValue();
                }
                ej0Var.h(Integer.valueOf(iIntValue));
                return ll2.a;
        }
    }

    public /* synthetic */ vb0(int i, String str, wb0 wb0Var) {
        this.f = i;
        this.g = str;
        this.h = wb0Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements fr1, jo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jk1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fr1
    public final vv1 b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((nk1) obj).b;
            default:
                return ((qo1) obj).b;
        }
    }

    @Override // defpackage.jo1
    public final Object d(String str, ej0 ej0Var, tx txVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((nk1) obj).d(str, ej0Var, txVar);
            default:
                return ((qo1) obj).d(str, ej0Var, txVar);
        }
    }
}

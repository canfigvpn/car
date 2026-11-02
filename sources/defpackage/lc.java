package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ti0 f;

    public /* synthetic */ lc(int i, ti0 ti0Var) {
        this.e = i;
        this.f = ti0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        ti0 ti0Var = this.f;
        switch (i) {
            case 0:
                ((bu1) obj).c(((Number) ti0Var.a()).floatValue());
                return ll2Var;
            case 1:
                z02 z02Var = (z02) obj;
                Object objA = ti0Var.a();
                if (Float.isNaN(((Number) objA).floatValue())) {
                    objA = null;
                }
                Float f = (Float) objA;
                oq1 oq1Var = new oq1(f != null ? f.floatValue() : 0.0f, new pq(1.0f));
                lv0[] lv0VarArr = w02.a;
                y02 y02Var = u02.c;
                lv0 lv0Var = w02.a[1];
                z02Var.a(y02Var, oq1Var);
                return ll2Var;
            default:
                return (uf1) ti0Var.a();
        }
    }
}

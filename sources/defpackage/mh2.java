package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mh2 {
    public final pa1 a;
    public final ea1 b = new ea1(Boolean.FALSE);
    public om c;

    public mh2(pa1 pa1Var) {
        this.a = pa1Var;
    }

    public final void a() {
        this.b.c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        ea1 ea1Var = this.b;
        return ((Boolean) ea1Var.b.getValue()).booleanValue() || ((Boolean) ea1Var.c.getValue()).booleanValue();
    }

    public final Object c(ia1 ia1Var, wa2 wa2Var) {
        sx sxVar = null;
        tn tnVar = new tn(this, new fe2(1, sxVar, this), ia1Var, sxVar, 2);
        pa1 pa1Var = this.a;
        pa1Var.getClass();
        Object objW = qx.w(new na1(ia1Var, pa1Var, tnVar, null), wa2Var);
        return objW == fz.e ? objW : ll2.a;
    }
}

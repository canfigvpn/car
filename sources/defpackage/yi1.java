package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yi1 {
    public static final zv a = new zv(new xi1(0));

    public static final v6 a(ak0 ak0Var) {
        ak0Var.W(282942128);
        w6 w6Var = (w6) ak0Var.j(a);
        if (w6Var == null) {
            ak0Var.p(false);
            return null;
        }
        boolean zF = ak0Var.f(w6Var);
        Object objL = ak0Var.L();
        if (zF || objL == cv.a) {
            Object v6Var = new v6(w6Var.a, w6Var.b, w6Var.c, w6Var.d);
            ak0Var.g0(v6Var);
            objL = v6Var;
        }
        v6 v6Var2 = (v6) objL;
        ak0Var.p(false);
        return v6Var2;
    }
}

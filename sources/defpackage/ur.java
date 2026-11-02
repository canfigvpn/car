package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur {
    public static final wr a = new wr(ws0.g, q90.r);

    public static final wr a(ie ieVar, ui uiVar, ak0 ak0Var, int i) {
        if (ieVar.equals(ws0.g) && uiVar.equals(q90.r)) {
            ak0Var.W(-1446604504);
            ak0Var.p(false);
            return a;
        }
        ak0Var.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ak0Var.f(ieVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ak0Var.f(uiVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objL = ak0Var.L();
        if (z3 || objL == cv.a) {
            objL = new wr(ieVar, uiVar);
            ak0Var.g0(objL);
        }
        wr wrVar = (wr) objL;
        ak0Var.p(false);
        return wrVar;
    }
}

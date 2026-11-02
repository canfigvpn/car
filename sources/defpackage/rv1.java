package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rv1 {
    public static final sv1 a = new sv1(ws0.e, q90.o);

    public static final sv1 a(ge geVar, vi viVar, ak0 ak0Var, int i) {
        if (geVar.equals(ws0.e) && ws0.j(viVar, q90.o)) {
            ak0Var.W(-1073830487);
            ak0Var.p(false);
            return a;
        }
        ak0Var.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && ak0Var.f(geVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !ak0Var.f(viVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objL = ak0Var.L();
        if (z3 || objL == cv.a) {
            objL = new sv1(geVar, viVar);
            ak0Var.g0(objL);
        }
        sv1 sv1Var = (sv1) objL;
        ak0Var.p(false);
        return sv1Var;
    }
}

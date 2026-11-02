package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uy0 {
    public static final gy0 a = new gy0(null, 0, false, 0.0f, new ty0(0), 0.0f, false, qx.b(ab0.e), vv.a(), 0, new n30(25), new n30(26), cb0.e, 0, 0, 0, di1.e, 0, 0);

    public static final ry0 a(int i, int i2, ak0 ak0Var) {
        int i3 = 0;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        ru1 ru1Var = ry0.w;
        boolean zD = ak0Var.d(i) | ak0Var.d(0);
        Object objL = ak0Var.L();
        if (zD || objL == cv.a) {
            objL = new sy0(i, i3);
            ak0Var.g0(objL);
        }
        return (ry0) ex.I(objArr, ru1Var, (ti0) objL, ak0Var, 0);
    }
}

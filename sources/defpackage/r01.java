package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r01 {
    public static final k01 a = new k01(null, 0, false, 0.0f, new ty0(1), 0.0f, false, qx.b(ab0.e), vv.a(), tw.b(0, 0, 15), cb0.e, 0, 0, 0, di1.e, 0, 0);

    public static final q01 a(int i, int i2, ak0 ak0Var) {
        int i3 = 1;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        ru1 ru1Var = q01.x;
        boolean zD = ak0Var.d(i) | ak0Var.d(0);
        Object objL = ak0Var.L();
        if (zD || objL == cv.a) {
            objL = new sy0(i, i3);
            ak0Var.g0(objL);
        }
        return (q01) ex.I(objArr, ru1Var, (ti0) objL, ak0Var, 0);
    }
}

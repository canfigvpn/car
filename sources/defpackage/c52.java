package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c52 {
    static {
        s5.T(0.0f, 0.0f, null, 7);
    }

    public static final p82 a(long j, g82 g82Var, ak0 ak0Var) {
        boolean zF = ak0Var.f(dr.e(j));
        Object objL = ak0Var.L();
        if (zF || objL == cv.a) {
            mj2 mj2Var = new mj2(x4.s, new y3(7, dr.e(j)));
            ak0Var.g0(mj2Var);
            objL = mj2Var;
        }
        return ka.c(new dr(j), (mj2) objL, g82Var, null, "ColorAnimation", ak0Var, 0, 8);
    }
}

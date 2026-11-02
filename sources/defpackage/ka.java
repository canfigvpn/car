package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ka {
    public static final g82 a = s5.T(0.0f, 0.0f, null, 7);

    static {
        Map map = ho2.a;
        s5.T(0.0f, 0.0f, new w60(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final p82 a(float f, g82 g82Var, ak0 ak0Var) {
        return c(new w60(f), ir2.X, g82Var, null, "DpAnimation", ak0Var, 0, 8);
    }

    public static final p82 b(float f, g82 g82Var, ak0 ak0Var) {
        Float fValueOf = Float.valueOf(0.01f);
        if (g82Var == a) {
            ak0Var.W(1144089983);
            boolean zC = ak0Var.c(0.01f);
            Object objL = ak0Var.L();
            if (zC || objL == cv.a) {
                objL = s5.T(0.0f, 0.0f, fValueOf, 3);
                ak0Var.g0(objL);
            }
            g82Var = (g82) objL;
            ak0Var.p(false);
        } else {
            ak0Var.W(1144199909);
            ak0Var.p(false);
        }
        return c(Float.valueOf(f), ir2.V, g82Var, fValueOf, "FloatAnimation", ak0Var, 0, 0);
    }

    public static final p82 c(Object obj, mj2 mj2Var, nb nbVar, Float f, String str, ak0 ak0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objL = ak0Var.L();
        Object obj2 = cv.a;
        if (objL == obj2) {
            objL = y12.s(null);
            ak0Var.g0(objL);
        }
        da1 da1Var = (da1) objL;
        Object objL2 = ak0Var.L();
        if (objL2 == obj2) {
            objL2 = new ia(obj, mj2Var, f);
            ak0Var.g0(objL2);
        }
        ia iaVar = (ia) objL2;
        Object objT = y12.t(null, ak0Var);
        if (f != null && (nbVar instanceof g82)) {
            g82 g82Var = (g82) nbVar;
            if (!ws0.j(g82Var.c, f)) {
                nbVar = new g82(g82Var.a, g82Var.b, f);
            }
        }
        Object objT2 = y12.t(nbVar, ak0Var);
        Object objL3 = ak0Var.L();
        if (objL3 == obj2) {
            objL3 = s5.d(-1, 6, null);
            ak0Var.g0(objL3);
        }
        Object obj3 = (lo) objL3;
        boolean zH = ak0Var.h(obj3) | ak0Var.h(obj);
        Object objL4 = ak0Var.L();
        if (zH || objL4 == obj2) {
            objL4 = new n1(2, obj3, obj);
            ak0Var.g0(objL4);
        }
        s5.v((ti0) objL4, ak0Var);
        boolean zH2 = ak0Var.h(obj3) | ak0Var.h(iaVar) | ak0Var.f(objT2) | ak0Var.f(objT);
        Object objL5 = ak0Var.L();
        if (zH2 || objL5 == obj2) {
            Object jaVar = new ja(obj3, iaVar, objT2, objT, null, 0);
            ak0Var.g0(jaVar);
            objL5 = jaVar;
        }
        s5.o((ij0) objL5, ak0Var, obj3);
        p82 p82Var = (p82) da1Var.getValue();
        return p82Var == null ? iaVar.c : p82Var;
    }
}

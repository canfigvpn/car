package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oi2 {
    public static final v22 a = new v22(17);
    public static final rx0 b = vv.F(v01.f, new xc2(3));

    public static final void a(ki2 ki2Var, ii2 ii2Var, Object obj, Object obj2, ld0 ld0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(867041821);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(ki2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(ii2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ak0Var.f(obj) : ak0Var.h(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? ak0Var.f(obj2) : ak0Var.h(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? ak0Var.f(ld0Var) : ak0Var.h(ld0Var) ? 16384 : 8192;
        }
        if (!ak0Var.O(i2 & 1, (i2 & 9363) != 9362)) {
            ak0Var.R();
        } else if (ki2Var.g()) {
            ii2Var.g(obj, obj2, ld0Var);
        } else {
            ii2Var.h(obj2, ld0Var);
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eo(ki2Var, ii2Var, obj, obj2, ld0Var, i, 1);
        }
    }

    public static final fi2 b(ki2 ki2Var, mj2 mj2Var, String str, ak0 ak0Var, int i, int i2) {
        ei2 ei2Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ak0Var.f(ki2Var);
        Object objL = ak0Var.L();
        Object obj = cv.a;
        if (zF || objL == obj) {
            objL = new fi2(ki2Var, mj2Var, str);
            ak0Var.g0(objL);
        }
        fi2 fi2Var = (fi2) objL;
        boolean zF2 = ak0Var.f(ki2Var) | ak0Var.h(fi2Var);
        Object objL2 = ak0Var.L();
        if (zF2 || objL2 == obj) {
            objL2 = new kc1(22, ki2Var, fi2Var);
            ak0Var.g0(objL2);
        }
        s5.e(fi2Var, (ej0) objL2, ak0Var);
        if (ki2Var.g() && (ei2Var = (ei2) fi2Var.b.getValue()) != null) {
            ki2 ki2Var2 = fi2Var.c;
            ei2Var.e.g(ei2Var.g.h(ki2Var2.f().a()), ei2Var.g.h(ki2Var2.f().c()), (ld0) ei2Var.f.h(ki2Var2.f()));
        }
        return fi2Var;
    }

    public static final ii2 c(ki2 ki2Var, Object obj, Object obj2, ld0 ld0Var, mj2 mj2Var, ak0 ak0Var, int i) {
        boolean zF = ak0Var.f(ki2Var);
        Object objL = ak0Var.L();
        Object obj3 = cv.a;
        if (zF || objL == obj3) {
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                tb tbVar = (tb) mj2Var.a.h(obj2);
                tbVar.d();
                objL = new ii2(ki2Var, obj, tbVar, mj2Var);
                c12.s(o62VarJ, o62VarP, ej0VarE);
                ak0Var.g0(objL);
            } catch (Throwable th) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                throw th;
            }
        }
        ii2 ii2Var = (ii2) objL;
        a(ki2Var, ii2Var, obj, obj2, ld0Var, ak0Var, 0);
        boolean zF2 = ak0Var.f(ki2Var) | ak0Var.f(ii2Var);
        Object objL2 = ak0Var.L();
        if (zF2 || objL2 == obj3) {
            objL2 = new kc1(20, ki2Var, ii2Var);
            ak0Var.g0(objL2);
        }
        s5.e(ii2Var, (ej0) objL2, ak0Var);
        return ii2Var;
    }

    public static final ki2 d(tu tuVar, String str, ak0 ak0Var, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && ak0Var.f(tuVar)) || (i & 6) == 4;
        Object objL = ak0Var.L();
        Object obj = cv.a;
        sx sxVar = null;
        if (z || objL == obj) {
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                Object ki2Var = new ki2(tuVar, null, str);
                c12.s(o62VarJ, o62VarP, ej0VarE);
                ak0Var.g0(ki2Var);
                objL = ki2Var;
            } catch (Throwable th) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                throw th;
            }
        }
        ki2 ki2Var2 = (ki2) objL;
        if (tuVar instanceof fz1) {
            ak0Var.W(-1357607479);
            fz1 fz1Var = (fz1) tuVar;
            Object value = fz1Var.c.getValue();
            Object value2 = fz1Var.b.getValue();
            boolean z2 = (i2 > 4 && ak0Var.f(tuVar)) || (i & 6) == 4;
            Object objL2 = ak0Var.L();
            if (z2 || objL2 == obj) {
                objL2 = new g(26, sxVar, tuVar);
                ak0Var.g0(objL2);
            }
            s5.p(value, value2, (ij0) objL2, ak0Var);
            ak0Var.p(false);
        } else {
            ak0Var.W(-1357145920);
            ki2Var2.a(tuVar.h(), ak0Var, 0);
            ak0Var.p(false);
        }
        boolean zF = ak0Var.f(ki2Var2);
        Object objL3 = ak0Var.L();
        if (zF || objL3 == obj) {
            objL3 = new mi2(ki2Var2, 1);
            ak0Var.g0(objL3);
        }
        s5.e(ki2Var2, (ej0) objL3, ak0Var);
        return ki2Var2;
    }

    public static final ki2 e(Object obj, String str, ak0 ak0Var, int i) {
        Object objL = ak0Var.L();
        is1 is1Var = cv.a;
        if (objL == is1Var) {
            objL = new ki2(new ea1(obj), null, str);
            ak0Var.g0(objL);
        }
        ki2 ki2Var = (ki2) objL;
        ki2Var.a(obj, ak0Var, (i & 8) | 48 | (i & 14));
        Object objL2 = ak0Var.L();
        if (objL2 == is1Var) {
            objL2 = new mi2(ki2Var, 0);
            ak0Var.g0(objL2);
        }
        s5.e(ki2Var, (ej0) objL2, ak0Var);
        return ki2Var;
    }
}

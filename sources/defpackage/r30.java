package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 {
    public static final r30 a = new r30();

    public final void a(z42 z42Var, ak0 ak0Var, int i) {
        ak0 ak0Var2 = ak0Var;
        float f = z42Var.g;
        ak0Var2.X(2137486921);
        int i2 = i | (ak0Var2.f(z42Var) ? 4 : 2);
        if (ak0Var2.O(i2 & 1, (i2 & 3) != 2)) {
            nh2 nh2Var = z42Var.i;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                qj.r("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = ak0Var2.f(nh2Var) | ak0Var2.f(null);
            Object objL = ak0Var2.L();
            is1 is1Var = cv.a;
            if (zF || objL == is1Var) {
                objL = e72.b(new q30(0, z42Var));
                ak0Var2.g0(objL);
            }
            p82 p82VarA = c52.a(((dr) ((p82) objL).getValue()).a, rw.Q(h81.g, ak0Var2), ak0Var2);
            gt gtVarC = vs0.C(-1658896622, new h30(3, z42Var), ak0Var2);
            ak0Var2.W(690108113);
            ak0Var2.p(false);
            u71 u71Var = z42Var.a;
            r71 r71Var = r71.a;
            u71 u71VarC = u71Var.c(r71Var);
            boolean zF2 = ak0Var2.f(p82VarA);
            Object objL2 = ak0Var2.L();
            if (zF2 || objL2 == is1Var) {
                objL2 = new m30(p82VarA, 0);
                ak0Var2.g0(objL2);
            }
            u71 u71VarL = ir2.l(u71VarC, (ej0) objL2);
            Object objL3 = ak0Var2.L();
            if (objL3 == is1Var) {
                objL3 = new n30(0);
                ak0Var2.g0(objL3);
            }
            u71 u71VarA = l02.a(u71VarL, false, (ej0) objL3);
            Object objL4 = ak0Var2.L();
            if (objL4 == is1Var) {
                objL4 = p30.b;
                ak0Var2.g0(objL4);
            }
            u71 u71VarA2 = ya2.a(u71VarA, ll2.a, (PointerInputEventHandler) objL4);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var2);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, u71VarA2);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, w61VarC);
            p12.l(vu.e, ak0Var2, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var2, iX, raVar);
            }
            p12.l(vu.d, ak0Var2, u71VarB);
            u71 u71VarL2 = nj2.l(vs0.F(r71Var, z42Var.h));
            a90 a90Var = nc.a;
            boolean z = (i2 & 14) == 4;
            Object objL5 = ak0Var2.L();
            if (z || objL5 == is1Var) {
                objL5 = new o30();
                ak0Var2.g0(objL5);
            }
            zd0 zd0Var = (zd0) objL5;
            long j = nh2Var.c;
            long j2 = nh2Var.d;
            long j3 = nh2Var.e;
            long j4 = nh2Var.f;
            gt gtVar = z42Var.b;
            vf2 vf2Var = z42Var.c;
            vf2 vf2Var2 = z42Var.d;
            ij0 ij0Var = z42Var.e;
            float f2 = z42Var.g;
            Object objL6 = ak0Var2.L();
            if (objL6 == is1Var) {
                objL6 = new m2(18);
                ak0Var2.g0(objL6);
            }
            nc.c(u71VarL2, zd0Var, j, j2, j4, j3, gtVar, vf2Var, vf2Var2, (ti0) objL6, ij0Var, gtVarC, f2, ak0Var2, 0);
            ak0Var2 = ak0Var2;
            ak0Var2.p(true);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(this, z42Var, i, 9);
        }
    }
}

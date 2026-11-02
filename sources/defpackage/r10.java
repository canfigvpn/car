package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ej0 f;
    public final /* synthetic */ u71 g;

    public r10(int i, ej0 ej0Var, u71 u71Var) {
        this.e = i;
        this.f = ej0Var;
        this.g = u71Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = this.e;
            is1 is1Var = cv.a;
            ej0 ej0Var = this.f;
            if (i == 0) {
                ak0Var.W(-101264927);
                jo0 jo0VarB = qx.d;
                if (jo0VarB == null) {
                    io0 io0Var = new io0("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i2 = jm2.a;
                    o72 o72Var = new o72(dr.b);
                    qk1 qk1Var = new qk1(0);
                    qk1Var.A(3.0f, 17.25f);
                    qk1Var.H(21.0f);
                    qk1Var.x(3.75f);
                    qk1Var.y(17.81f, 9.94f);
                    qk1Var.z(-3.75f, -3.75f);
                    qk1Var.y(3.0f, 17.25f);
                    qk1Var.s();
                    qk1Var.A(20.71f, 7.04f);
                    qk1Var.t(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                    qk1Var.z(-2.34f, -2.34f);
                    qk1Var.t(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    qk1Var.z(-1.83f, 1.83f);
                    qk1Var.z(3.75f, 3.75f);
                    qk1Var.z(1.83f, -1.83f);
                    qk1Var.s();
                    io0.a(io0Var, (ArrayList) qk1Var.f, o72Var);
                    jo0VarB = io0Var.b();
                    qx.d = jo0VarB;
                }
                String strL = r02.l(R.string.m3c_date_picker_switch_to_input_mode, ak0Var);
                boolean zF = ak0Var.f(ej0Var);
                Object objL = ak0Var.L();
                if (zF || objL == is1Var) {
                    objL = new q10(ej0Var, 0);
                    ak0Var.g0(objL);
                }
                e20.h((ti0) objL, jo0VarB, strL, this.g, false, ak0Var, 0, 16);
                ak0Var.p(false);
            } else {
                ak0Var.W(-100967048);
                jo0 jo0VarB2 = qx.e;
                if (jo0VarB2 == null) {
                    io0 io0Var2 = new io0("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i3 = jm2.a;
                    o72 o72Var2 = new o72(dr.b);
                    qk1 qk1Var2 = new qk1(0);
                    qk1Var2.A(9.0f, 11.0f);
                    qk1Var2.y(7.0f, 11.0f);
                    qk1Var2.I(2.0f);
                    qk1Var2.x(2.0f);
                    qk1Var2.I(-2.0f);
                    qk1Var2.s();
                    qk1Var2.A(13.0f, 11.0f);
                    qk1Var2.x(-2.0f);
                    qk1Var2.I(2.0f);
                    qk1Var2.x(2.0f);
                    qk1Var2.I(-2.0f);
                    qk1Var2.s();
                    qk1Var2.A(17.0f, 11.0f);
                    qk1Var2.x(-2.0f);
                    qk1Var2.I(2.0f);
                    qk1Var2.x(2.0f);
                    qk1Var2.I(-2.0f);
                    qk1Var2.s();
                    qk1Var2.A(19.0f, 4.0f);
                    qk1Var2.x(-1.0f);
                    qk1Var2.y(18.0f, 2.0f);
                    qk1Var2.x(-2.0f);
                    qk1Var2.I(2.0f);
                    qk1Var2.y(8.0f, 4.0f);
                    qk1Var2.y(8.0f, 2.0f);
                    qk1Var2.y(6.0f, 2.0f);
                    qk1Var2.I(2.0f);
                    qk1Var2.y(5.0f, 4.0f);
                    qk1Var2.t(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                    qk1Var2.y(3.0f, 20.0f);
                    qk1Var2.t(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    qk1Var2.x(14.0f);
                    qk1Var2.t(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    qk1Var2.y(21.0f, 6.0f);
                    qk1Var2.t(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    qk1Var2.s();
                    qk1Var2.A(19.0f, 20.0f);
                    qk1Var2.y(5.0f, 20.0f);
                    qk1Var2.y(5.0f, 9.0f);
                    qk1Var2.x(14.0f);
                    qk1Var2.I(11.0f);
                    qk1Var2.s();
                    io0.a(io0Var2, (ArrayList) qk1Var2.f, o72Var2);
                    jo0VarB2 = io0Var2.b();
                    qx.e = jo0VarB2;
                }
                String strL2 = r02.l(R.string.m3c_date_picker_switch_to_calendar_mode, ak0Var);
                boolean zF2 = ak0Var.f(ej0Var);
                Object objL2 = ak0Var.L();
                if (zF2 || objL2 == is1Var) {
                    objL2 = new q10(ej0Var, 1);
                    ak0Var.g0(objL2);
                }
                e20.h((ti0) objL2, jo0VarB2, strL2, this.g, false, ak0Var, 0, 16);
                ak0Var.p(false);
            }
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

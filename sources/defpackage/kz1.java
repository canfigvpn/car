package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 {
    public static final kz1 a = new kz1();
    public static final float b = ws0.E;
    public static final float c = ws0.J;
    public static final kj1 d = hl.b;

    public static u32 c(int i, int i2, ak0 ak0Var) {
        u32 u32VarA = j42.a(ws0.H, ak0Var);
        u32VarA.getClass();
        jv1 jv1Var = (jv1) u32VarA;
        if (i2 == 1) {
            return jv1Var;
        }
        if (i == 0) {
            x60 x60Var = x32.i;
            return jv1.b(jv1Var, null, x60Var, x60Var, null, 9);
        }
        if (i != i2 - 1) {
            return vs0.C;
        }
        x60 x60Var2 = x32.i;
        return jv1.b(jv1Var, x60Var2, null, null, x60Var2, 6);
    }

    public final void a(int i, ak0 ak0Var) {
        ak0 ak0Var2;
        ak0Var.X(-1273041460);
        if (ak0Var.O(i & 1, (i & 3) != 2)) {
            jo0 jo0VarB = qx.c;
            if (jo0VarB == null) {
                io0 io0Var = new io0("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i2 = jm2.a;
                o72 o72Var = new o72(dr.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new xk1(9.0f, 16.17f));
                arrayList.add(new wk1(4.83f, 12.0f));
                arrayList.add(new el1(-1.42f, 1.41f));
                arrayList.add(new wk1(9.0f, 19.0f));
                arrayList.add(new wk1(21.0f, 7.0f));
                arrayList.add(new el1(-1.41f, -1.41f));
                arrayList.add(tk1.c);
                io0.a(io0Var, arrayList, o72Var);
                jo0VarB = io0Var.b();
                qx.c = jo0VarB;
            }
            ak0Var2 = ak0Var;
            fo0.a(jo0VarB, null, f52.j(c), 0L, ak0Var2, 48, 8);
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new x7(i, 25, this);
        }
    }

    public final void b(boolean z, ij0 ij0Var, ak0 ak0Var, int i) {
        ij0 ij0Var2;
        ak0Var.X(-657462570);
        int i2 = i | (ak0Var.g(z) ? 4 : 2) | 432;
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            gt gtVar = xt.a;
            ak0Var.W(-1416314439);
            dv1.c(z, null, nb0.c(rw.Q(h81.g, ak0Var), 2).a(new sb0(new li2((zc0) null, (i52) null, (jo) null, new hx1(0.0f, j12.d(0.0f, 1.0f), rw.Q(h81.f, ak0Var)), (LinkedHashMap) null, 119))), kc0.b, null, vs0.C(2059591811, new kt(5), ak0Var), ak0Var, (i2 & 14) | 196608, 18);
            ak0Var.p(false);
            ij0Var2 = gtVar;
        } else {
            ak0Var.R();
            ij0Var2 = ij0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new qc0(this, z, ij0Var2, i, 1);
        }
    }
}

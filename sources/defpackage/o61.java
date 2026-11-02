package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o61 {
    public static final a90 a;

    static {
        vv.G(new vr0(14));
        a = new a90(1, new vr0(15));
    }

    public static final void a(jr jrVar, g81 g81Var, i42 i42Var, gk2 gk2Var, ak0 ak0Var, int i) {
        int i2;
        gt gtVar = ir2.t;
        ak0Var.X(904511636);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(jrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(g81Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.f(i42Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.f(gk2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.h(gtVar) ? 16384 : 8192;
        }
        if (ak0Var.O(i2 & 1, (i2 & 9363) != 9362)) {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            vu1 vu1VarA = tu1.a(false, 0.0f, 7);
            long j = jrVar.a;
            boolean zE = ak0Var.e(j);
            Object objL = ak0Var.L();
            if (zE || objL == cv.a) {
                objL = new pf2(j, dr.b(0.4f, j));
                ak0Var.g0(objL);
            }
            sv.b(new vq1[]{lr.a.a(jrVar), a.a(g81Var), yo0.a.a(vu1VarA), j42.a.a(i42Var), qf2.a.a((pf2) objL), ik2.a.a(gk2Var)}, vs0.C(-1750539308, new h30(5, gk2Var), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new i3(jrVar, g81Var, i42Var, gk2Var, i, 4);
        }
    }

    public static final void b(jr jrVar, i42 i42Var, gk2 gk2Var, ak0 ak0Var, int i) {
        int i2;
        i42 i42Var2;
        int i3;
        gt gtVar = ir2.t;
        ak0Var.X(-449719819);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(jrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.f(gk2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.h(gtVar) ? 2048 : 1024;
        }
        if (ak0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                int i4 = i2 & (-113);
                i42Var2 = (i42) ak0Var.j(j42.a);
                i3 = i4;
            } else {
                ak0Var.R();
                i3 = i2 & (-113);
                i42Var2 = i42Var;
            }
            ak0Var.q();
            int i5 = i3 & 14;
            int i6 = i3 << 3;
            a(jrVar, (g81) ak0Var.j(a), i42Var2, gk2Var, ak0Var, (i6 & 57344) | i5 | (i6 & 7168));
        } else {
            ak0Var.R();
            i42Var2 = i42Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(jrVar, i42Var2, gk2Var, i, 13);
        }
    }
}

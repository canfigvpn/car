package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xj {
    public static final w91 a = b(true);
    public static final w91 b = b(false);
    public static final n6 c = n6.d;

    public static final void a(u71 u71Var, ak0 ak0Var, int i) {
        ak0Var.X(-211209833);
        int i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        int i3 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(ak0Var.T);
            u71 u71VarB = nj2.B(ak0Var, u71Var);
            sl1 sl1VarL = ak0Var.l();
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, c);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new x7(i, i3, u71Var);
        }
    }

    public static final w91 b(boolean z) {
        w91 w91Var = new w91(9);
        wi wiVar = q90.f;
        w91Var.m(wiVar, new ak(wiVar, z));
        wi wiVar2 = q90.g;
        w91Var.m(wiVar2, new ak(wiVar2, z));
        wi wiVar3 = q90.h;
        w91Var.m(wiVar3, new ak(wiVar3, z));
        wi wiVar4 = q90.i;
        w91Var.m(wiVar4, new ak(wiVar4, z));
        wi wiVar5 = q90.j;
        w91Var.m(wiVar5, new ak(wiVar5, z));
        wi wiVar6 = q90.k;
        w91Var.m(wiVar6, new ak(wiVar6, z));
        wi wiVar7 = q90.l;
        w91Var.m(wiVar7, new ak(wiVar7, z));
        wi wiVar8 = q90.m;
        w91Var.m(wiVar8, new ak(wiVar8, z));
        wi wiVar9 = q90.n;
        w91Var.m(wiVar9, new ak(wiVar9, z));
        return w91Var;
    }

    public static final w61 c(wi wiVar, boolean z) {
        w61 w61Var = (w61) (z ? a : b).g(wiVar);
        return w61Var == null ? new ak(wiVar, z) : w61Var;
    }

    public static final void d(im1 im1Var, jm1 jm1Var, r61 r61Var, kw0 kw0Var, int i, int i2, wi wiVar) {
        wi wiVar2;
        Object objJ = r61Var.j();
        wj wjVar = objJ instanceof wj ? (wj) objJ : null;
        im1.j(im1Var, jm1Var, ((wjVar == null || (wiVar2 = wjVar.s) == null) ? wiVar : wiVar2).a((((long) jm1Var.e) << 32) | (((long) jm1Var.f) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), kw0Var));
    }
}

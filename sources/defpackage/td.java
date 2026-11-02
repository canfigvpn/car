package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class td implements kj0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ej0 g;

    public td(List list, int i, ej0 ej0Var) {
        this.e = list;
        this.f = i;
        this.g = ej0Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a90 a90Var;
        long j;
        long j2;
        by0 by0Var = (by0) obj;
        int iIntValue = ((Number) obj2).intValue();
        ak0 ak0Var = (ak0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (ak0Var.f(by0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ak0Var.d(iIntValue) ? 32 : 16;
        }
        if (ak0Var.O(i & 1, (i & 147) != 146)) {
            int iIntValue3 = ((Number) this.e.get(iIntValue)).intValue();
            ak0Var.W(-725808251);
            boolean z = iIntValue3 == this.f;
            wi wiVar = q90.j;
            r71 r71Var = r71.a;
            u71 u71VarC0 = p61.c0(r71Var, 4.0f);
            w61 w61VarC = xj.c(wiVar, false);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarC0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            String strN = dv1.N(String.valueOf(iIntValue3));
            vf2 vf2Var = ((gk2) ak0Var.j(ik2.a)).j;
            if (z) {
                ak0Var.W(-1743255622);
                a90Var = lr.a;
                j = ((jr) ak0Var.j(a90Var)).b;
                ak0Var.p(false);
            } else {
                ak0Var.W(-1743253670);
                a90Var = lr.a;
                j = ((jr) ak0Var.j(a90Var)).q;
                ak0Var.p(false);
            }
            u71 u71VarK = nj2.k(r71Var, kv1.a);
            if (z) {
                ak0Var.W(-1743247208);
                j2 = ((jr) ak0Var.j(a90Var)).a;
                ak0Var.p(false);
            } else {
                ak0Var.W(-1743245051);
                j2 = ((jr) ak0Var.j(a90Var)).G;
                ak0Var.p(false);
            }
            u71 u71VarS = p61.s(u71VarK, j2, vs0.C);
            ej0 ej0Var = this.g;
            boolean zF = ak0Var.f(ej0Var) | ak0Var.d(iIntValue3);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new rd(ej0Var, iIntValue3);
                ak0Var.g0(objL);
            }
            ef2.b(strN, p61.d0(sv0.T(u71VarS, false, null, null, (ti0) objL, 15), 16.0f, 8.0f), j, 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var, ak0Var, 0, 0, 131064);
            ak0Var.p(true);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nx {
    public final h72 a = new h72();

    public static void b(nx nxVar, ij0 ij0Var, gt gtVar, ti0 ti0Var, int i) {
        if ((i & 8) != 0) {
            gtVar = null;
        }
        nxVar.a.add(new gt(new kz0(ij0Var, nxVar, gtVar, ti0Var), true, -1789283891));
    }

    public final void a(lx lxVar, ak0 ak0Var, int i) {
        ak0Var.X(-798501095);
        int i2 = (ak0Var.f(lxVar) ? 4 : 2) | i | (ak0Var.f(this) ? 32 : 16);
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            h72 h72Var = this.a;
            int size = h72Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((jj0) h72Var.get(i3)).d(lxVar, ak0Var, Integer.valueOf(i2 & 14));
            }
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(this, lxVar, i, 6);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 extends zh1 {
    public static final zg1 c = new zg1(0, 2, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        int i;
        nr0 nr0Var = (nr0) vpVar.e(0);
        int iC = o52Var.c((vj0) vpVar.e(1));
        if (o52Var.t >= iC) {
            hv.a("Check failed");
        }
        rw.J(o52Var, aeVar, iC);
        int i2 = o52Var.t;
        int iD = o52Var.v;
        while (iD >= 0 && !o52Var.x(iD)) {
            iD = o52Var.D(o52Var.b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (o52Var.u(i2, iT)) {
                if (o52Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += o52Var.x(iT) ? 1 : o52Var.b[(o52Var.q(iT) * 5) + 1] & 67108863;
                iT += o52Var.t(iT);
            }
        }
        while (true) {
            i = o52Var.t;
            if (i >= iC) {
                break;
            }
            if (o52Var.u(iC, i)) {
                int i3 = o52Var.t;
                if (i3 < o52Var.u && (o52Var.b[(o52Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    aeVar.d(o52Var.C(o52Var.t));
                    iK = 0;
                }
                o52Var.O();
            } else {
                iK += o52Var.K();
            }
        }
        if (i != iC) {
            hv.a("Check failed");
        }
        nr0Var.a = iK;
    }
}

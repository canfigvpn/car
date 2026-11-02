package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends zh1 {
    public static final uh1 c = new uh1(1, 0, 2);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        int iD = vpVar.d(0);
        int i = o52Var.v;
        int iM = o52Var.M(o52Var.b, o52Var.q(i));
        int iF = o52Var.f(o52Var.b, o52Var.q(i + 1));
        for (int iMax = Math.max(iM, iF - iD); iMax < iF; iMax++) {
            Object obj = o52Var.c[o52Var.g(iMax)];
            if (obj instanceof ek0) {
                rs1Var.f((ek0) obj);
            } else if (obj instanceof lr1) {
                ((lr1) obj).c();
            }
        }
        if (iD <= 0) {
            hv.a("Check failed");
        }
        int i2 = o52Var.v;
        int iM2 = o52Var.M(o52Var.b, o52Var.q(i2));
        int iF2 = o52Var.f(o52Var.b, o52Var.q(i2 + 1)) - iD;
        if (iF2 < iM2) {
            hv.a("Check failed");
        }
        o52Var.I(iF2, iD, i2);
        int i3 = o52Var.i;
        if (i3 >= iM2) {
            o52Var.i = i3 - iD;
        }
    }
}

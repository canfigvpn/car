package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends zh1 {
    public static final ug1 c = new ug1(0, 2, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        vj0 vj0Var = (vj0) vpVar.e(0);
        Object objE = vpVar.e(1);
        if (objE instanceof ek0) {
            ek0 ek0Var = (ek0) objE;
            ((fa1) rs1Var.d).b(ek0Var);
            ((x91) rs1Var.g).a(ek0Var);
        }
        if (o52Var.n != 0) {
            hv.a("Can only append a slot if not current inserting");
        }
        int i = o52Var.i;
        int i2 = o52Var.j;
        int iC = o52Var.c(vj0Var);
        int iF = o52Var.f(o52Var.b, o52Var.q(iC + 1));
        o52Var.i = iF;
        o52Var.j = iF;
        o52Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        o52Var.c[iF] = objE;
        o52Var.i = i;
        o52Var.j = i2;
    }
}

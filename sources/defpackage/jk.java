package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jk extends t71 implements bk, hw0 {
    public cx s;
    public boolean t;

    public static final yr1 F0(jk jkVar, me1 me1Var, v4 v4Var) {
        yr1 yr1Var;
        if (jkVar.r && jkVar.t) {
            me1 me1VarU = qx.U(jkVar);
            if (!me1Var.S0().r) {
                me1Var = null;
            }
            if (me1Var != null && (yr1Var = (yr1) v4Var.a()) != null) {
                return yr1Var.i(me1VarU.K(me1Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.bk
    public final Object a0(me1 me1Var, v4 v4Var, tx txVar) {
        Object objW = qx.w(new ik(this, me1Var, v4Var, new vf(this, me1Var, v4Var, 2), null), txVar);
        return objW == fz.e ? objW : ll2.a;
    }

    @Override // defpackage.hw0
    public final void o(jw0 jw0Var) {
        this.t = true;
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}

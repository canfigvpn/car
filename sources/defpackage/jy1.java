package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jy1 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ny1 f;

    public /* synthetic */ jy1(ny1 ny1Var, int i) {
        this.e = i;
        this.f = ny1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ny1 ny1Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(ny1Var.r);
            default:
                cg0 cg0Var = ny1Var.T;
                if (!cg0Var.e.r) {
                    return null;
                }
                bg0 bg0VarK0 = cg0Var.K0();
                int iOrdinal = bg0VarK0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    qj.p();
                    return null;
                }
                if (bg0VarK0.a()) {
                    return cg0Var.I0(null);
                }
                cg0 cg0VarF = ((vf0) ((e5) qx.W(cg0Var)).getFocusOwner()).f();
                if (cg0VarF != null) {
                    return cg0VarF.I0(qx.U(cg0Var));
                }
                return null;
        }
    }
}

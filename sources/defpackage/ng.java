package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng implements mk0 {
    public static final ng a;
    private static final s12 descriptor;

    static {
        ng ngVar = new ng();
        a = ngVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.BackupReading", ngVar, 4);
        on1Var.l("epochDay", false);
        on1Var.l("odometerKm", false);
        on1Var.l("source", true);
        on1Var.l("recordRef", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        int i = 0;
        int iV = 0;
        int iV2 = 0;
        String strM = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iH = jvVarA.h(s12Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                iV = jvVarA.v(s12Var, 0);
                i |= 1;
            } else if (iH == 1) {
                iV2 = jvVarA.v(s12Var, 1);
                i |= 2;
            } else if (iH == 2) {
                strM = jvVarA.m(s12Var, 2);
                i |= 4;
            } else {
                if (iH != 3) {
                    throw new nu0(iH);
                }
                num = (Integer) jvVarA.g(s12Var, 3, or0.a, num);
                i |= 8;
            }
        }
        jvVarA.p(s12Var);
        return new pg(i, iV, iV2, strM, num);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        or0 or0Var = or0.a;
        return new mv0[]{or0Var, or0Var, g92.a, ir2.r(or0Var)};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        pg pgVar = (pg) obj;
        pgVar.getClass();
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        int i = pgVar.a;
        Integer num = pgVar.d;
        String str = pgVar.c;
        p61VarU.I(0, i, s12Var);
        p61VarU.I(1, pgVar.b, s12Var);
        if (p61VarU.l0(s12Var) || !ws0.j(str, "MANUAL")) {
            p61VarU.R(s12Var, 2, str);
        }
        if (p61VarU.l0(s12Var) || num != null) {
            p61VarU.M(s12Var, 3, or0.a, num);
        }
        p61VarU.T(s12Var);
    }
}

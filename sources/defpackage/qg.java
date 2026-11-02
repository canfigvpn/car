package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg implements mk0 {
    public static final qg a;
    private static final s12 descriptor;

    static {
        qg qgVar = new qg();
        a = qgVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.BackupRecord", qgVar, 8);
        on1Var.l("ref", false);
        on1Var.l("serviceKey", false);
        on1Var.l("epochDay", false);
        on1Var.l("odometerKm", true);
        on1Var.l("cost", true);
        on1Var.l("quantity", true);
        on1Var.l("note", true);
        on1Var.l("action", true);
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
        Long l = null;
        Double d = null;
        String str = null;
        String strM2 = null;
        boolean z = true;
        while (z) {
            int iH = jvVarA.h(s12Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iV = jvVarA.v(s12Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strM = jvVarA.m(s12Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iV2 = jvVarA.v(s12Var, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) jvVarA.g(s12Var, 3, or0.a, num);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) jvVarA.g(s12Var, 4, r41.a, l);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) jvVarA.g(s12Var, 5, t60.a, d);
                    i |= 32;
                    break;
                case 6:
                    str = (String) jvVarA.g(s12Var, 6, g92.a, str);
                    i |= 64;
                    break;
                case 7:
                    strM2 = jvVarA.m(s12Var, 7);
                    i |= 128;
                    break;
                default:
                    throw new nu0(iH);
            }
        }
        jvVarA.p(s12Var);
        return new sg(i, iV, strM, iV2, num, l, d, str, strM2);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        or0 or0Var = or0.a;
        g92 g92Var = g92.a;
        return new mv0[]{or0Var, g92Var, or0Var, ir2.r(or0Var), ir2.r(r41.a), ir2.r(t60.a), ir2.r(g92Var), g92Var};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        sg sgVar = (sg) obj;
        sgVar.getClass();
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        int i = sgVar.a;
        String str = sgVar.h;
        String str2 = sgVar.g;
        Double d = sgVar.f;
        Long l = sgVar.e;
        Integer num = sgVar.d;
        p61VarU.I(0, i, s12Var);
        p61VarU.R(s12Var, 1, sgVar.b);
        p61VarU.I(2, sgVar.c, s12Var);
        if (p61VarU.l0(s12Var) || num != null) {
            p61VarU.M(s12Var, 3, or0.a, num);
        }
        if (p61VarU.l0(s12Var) || l != null) {
            p61VarU.M(s12Var, 4, r41.a, l);
        }
        if (p61VarU.l0(s12Var) || d != null) {
            p61VarU.M(s12Var, 5, t60.a, d);
        }
        if (p61VarU.l0(s12Var) || str2 != null) {
            p61VarU.M(s12Var, 6, g92.a, str2);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str, "CHANGE")) {
            p61VarU.R(s12Var, 7, str);
        }
        p61VarU.T(s12Var);
    }
}

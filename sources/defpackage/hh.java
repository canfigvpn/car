package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hh implements mk0 {
    public static final hh a;
    private static final s12 descriptor;

    static {
        hh hhVar = new hh();
        a = hhVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.BackupServiceType", hhVar, 8);
        on1Var.l("key", false);
        on1Var.l("customName", true);
        on1Var.l("icon", true);
        on1Var.l("defaultIntervalKm", true);
        on1Var.l("defaultIntervalMonths", true);
        on1Var.l("tracksQuantity", true);
        on1Var.l("isBuiltIn", true);
        on1Var.l("sortOrder", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        int i = 0;
        boolean zR = false;
        boolean zR2 = false;
        int iV = 0;
        String strM = null;
        String str = null;
        String strM2 = null;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        while (z) {
            int iH = jvVarA.h(s12Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strM = jvVarA.m(s12Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) jvVarA.g(s12Var, 1, g92.a, str);
                    i |= 2;
                    break;
                case 2:
                    strM2 = jvVarA.m(s12Var, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) jvVarA.g(s12Var, 3, or0.a, num);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) jvVarA.g(s12Var, 4, or0.a, num2);
                    i |= 16;
                    break;
                case 5:
                    zR = jvVarA.r(s12Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zR2 = jvVarA.r(s12Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iV = jvVarA.v(s12Var, 7);
                    i |= 128;
                    break;
                default:
                    throw new nu0(iH);
            }
        }
        jvVarA.p(s12Var);
        return new jh(i, strM, str, strM2, num, num2, zR, zR2, iV);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        g92 g92Var = g92.a;
        mv0 mv0VarR = ir2.r(g92Var);
        or0 or0Var = or0.a;
        mv0 mv0VarR2 = ir2.r(or0Var);
        mv0 mv0VarR3 = ir2.r(or0Var);
        hj hjVar = hj.a;
        return new mv0[]{g92Var, mv0VarR, g92Var, mv0VarR2, mv0VarR3, hjVar, hjVar, or0Var};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        jh jhVar = (jh) obj;
        jhVar.getClass();
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        String str = jhVar.a;
        int i = jhVar.h;
        boolean z = jhVar.g;
        boolean z2 = jhVar.f;
        Integer num = jhVar.e;
        Integer num2 = jhVar.d;
        String str2 = jhVar.c;
        String str3 = jhVar.b;
        p61VarU.R(s12Var, 0, str);
        if (p61VarU.l0(s12Var) || str3 != null) {
            p61VarU.M(s12Var, 1, g92.a, str3);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str2, "🔧")) {
            p61VarU.R(s12Var, 2, str2);
        }
        if (p61VarU.l0(s12Var) || num2 != null) {
            p61VarU.M(s12Var, 3, or0.a, num2);
        }
        if (p61VarU.l0(s12Var) || num != null) {
            p61VarU.M(s12Var, 4, or0.a, num);
        }
        if (p61VarU.l0(s12Var) || z2) {
            p61VarU.C(s12Var, 5);
            p61VarU.y(z2);
        }
        if (p61VarU.l0(s12Var) || !z) {
            p61VarU.C(s12Var, 6);
            p61VarU.y(z);
        }
        if (p61VarU.l0(s12Var) || i != 1000) {
            p61VarU.I(7, i, s12Var);
        }
        p61VarU.T(s12Var);
    }
}

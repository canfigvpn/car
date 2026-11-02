package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh implements mk0 {
    public static final eh a;
    private static final s12 descriptor;

    static {
        eh ehVar = new eh();
        a = ehVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.BackupSchedule", ehVar, 4);
        on1Var.l("serviceKey", false);
        on1Var.l("intervalKm", true);
        on1Var.l("intervalMonths", true);
        on1Var.l("enabled", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        int i = 0;
        boolean zR = false;
        String strM = null;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        while (z) {
            int iH = jvVarA.h(s12Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strM = jvVarA.m(s12Var, 0);
                i |= 1;
            } else if (iH == 1) {
                num = (Integer) jvVarA.g(s12Var, 1, or0.a, num);
                i |= 2;
            } else if (iH == 2) {
                num2 = (Integer) jvVarA.g(s12Var, 2, or0.a, num2);
                i |= 4;
            } else {
                if (iH != 3) {
                    throw new nu0(iH);
                }
                zR = jvVarA.r(s12Var, 3);
                i |= 8;
            }
        }
        jvVarA.p(s12Var);
        return new gh(i, strM, num, num2, zR);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        or0 or0Var = or0.a;
        return new mv0[]{g92.a, ir2.r(or0Var), ir2.r(or0Var), hj.a};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        gh ghVar = (gh) obj;
        ghVar.getClass();
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        String str = ghVar.a;
        boolean z = ghVar.d;
        Integer num = ghVar.c;
        Integer num2 = ghVar.b;
        p61VarU.R(s12Var, 0, str);
        if (p61VarU.l0(s12Var) || num2 != null) {
            p61VarU.M(s12Var, 1, or0.a, num2);
        }
        if (p61VarU.l0(s12Var) || num != null) {
            p61VarU.M(s12Var, 2, or0.a, num);
        }
        if (p61VarU.l0(s12Var) || !z) {
            p61VarU.C(s12Var, 3);
            p61VarU.y(z);
        }
        p61VarU.T(s12Var);
    }
}

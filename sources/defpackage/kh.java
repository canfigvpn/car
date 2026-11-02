package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh implements mk0 {
    public static final kh a;
    private static final s12 descriptor;

    static {
        kh khVar = new kh();
        a = khVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.BackupSettings", khVar, 4);
        on1Var.l("themeMode", true);
        on1Var.l("dynamicColor", true);
        on1Var.l("language", true);
        on1Var.l("smartOdometer", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        int i = 0;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        Boolean bool2 = null;
        boolean z = true;
        while (z) {
            int iH = jvVarA.h(s12Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                str = (String) jvVarA.g(s12Var, 0, g92.a, str);
                i |= 1;
            } else if (iH == 1) {
                bool = (Boolean) jvVarA.g(s12Var, 1, hj.a, bool);
                i |= 2;
            } else if (iH == 2) {
                str2 = (String) jvVarA.g(s12Var, 2, g92.a, str2);
                i |= 4;
            } else {
                if (iH != 3) {
                    throw new nu0(iH);
                }
                bool2 = (Boolean) jvVarA.g(s12Var, 3, hj.a, bool2);
                i |= 8;
            }
        }
        jvVarA.p(s12Var);
        return new mh(i, str, bool, str2, bool2);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        g92 g92Var = g92.a;
        mv0 mv0VarR = ir2.r(g92Var);
        hj hjVar = hj.a;
        return new mv0[]{mv0VarR, ir2.r(hjVar), ir2.r(g92Var), ir2.r(hjVar)};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        mh mhVar = (mh) obj;
        mhVar.getClass();
        Boolean bool = mhVar.d;
        String str = mhVar.c;
        Boolean bool2 = mhVar.b;
        String str2 = mhVar.a;
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        if (p61VarU.l0(s12Var) || str2 != null) {
            p61VarU.M(s12Var, 0, g92.a, str2);
        }
        if (p61VarU.l0(s12Var) || bool2 != null) {
            p61VarU.M(s12Var, 1, hj.a, bool2);
        }
        if (p61VarU.l0(s12Var) || str != null) {
            p61VarU.M(s12Var, 2, g92.a, str);
        }
        if (p61VarU.l0(s12Var) || bool != null) {
            p61VarU.M(s12Var, 3, hj.a, bool);
        }
        p61VarU.T(s12Var);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y31 implements mk0 {
    public static final y31 a;
    private static final s12 descriptor;

    static {
        y31 y31Var = new y31();
        a = y31Var;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.ui.navigation.LogServiceRoute", y31Var, 3);
        on1Var.l("carId", false);
        on1Var.l("recordId", true);
        on1Var.l("serviceTypeId", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        int i = 0;
        long jZ = 0;
        long jZ2 = 0;
        long jZ3 = 0;
        boolean z = true;
        while (z) {
            int iH = jvVarA.h(s12Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                jZ = jvVarA.z(s12Var, 0);
                i |= 1;
            } else if (iH == 1) {
                jZ2 = jvVarA.z(s12Var, 1);
                i |= 2;
            } else {
                if (iH != 2) {
                    throw new nu0(iH);
                }
                jZ3 = jvVarA.z(s12Var, 2);
                i |= 4;
            }
        }
        jvVarA.p(s12Var);
        return new a41(i, jZ, jZ2, jZ3);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        r41 r41Var = r41.a;
        return new mv0[]{r41Var, r41Var, r41Var};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        a41 a41Var = (a41) obj;
        a41Var.getClass();
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        long j = a41Var.a;
        long j2 = a41Var.c;
        long j3 = a41Var.b;
        p61VarU.K(s12Var, 0, j);
        if (p61VarU.l0(s12Var) || j3 != 0) {
            p61VarU.K(s12Var, 1, j3);
        }
        if (p61VarU.l0(s12Var) || j2 != 0) {
            p61VarU.K(s12Var, 2, j2);
        }
        p61VarU.T(s12Var);
    }
}

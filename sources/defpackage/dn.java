package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dn implements mk0 {
    public static final dn a;
    private static final s12 descriptor;

    static {
        dn dnVar = new dn();
        a = dnVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.ui.navigation.CarFormRoute", dnVar, 1);
        on1Var.l("carId", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        long jZ = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iH = jvVarA.h(s12Var);
            if (iH == -1) {
                z = false;
            } else {
                if (iH != 0) {
                    throw new nu0(iH);
                }
                jZ = jvVarA.z(s12Var, 0);
                i = 1;
            }
        }
        jvVarA.p(s12Var);
        return new fn(i, jZ);
    }

    @Override // defpackage.mk0
    public final mv0[] b() {
        return new mv0[]{r41.a};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        fn fnVar = (fn) obj;
        fnVar.getClass();
        long j = fnVar.a;
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        if (p61VarU.l0(s12Var) || j != 0) {
            p61VarU.K(s12Var, 0, j);
        }
        p61VarU.T(s12Var);
    }
}

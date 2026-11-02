package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk0 implements mk0 {
    public static final fk0 a;
    private static final s12 descriptor;

    static {
        fk0 fk0Var = new fk0();
        a = fk0Var;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.GarageBackup", fk0Var, 7);
        on1Var.l("app", false);
        on1Var.l("format", false);
        on1Var.l("exportedEpochDay", true);
        on1Var.l("appVersion", true);
        on1Var.l("serviceTypes", true);
        on1Var.l("cars", true);
        on1Var.l("settings", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        rx0[] rx0VarArr = hk0.h;
        int i = 0;
        int iV = 0;
        int iV2 = 0;
        String strM = null;
        String strM2 = null;
        List list = null;
        List list2 = null;
        mh mhVar = null;
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
                    iV = jvVarA.v(s12Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iV2 = jvVarA.v(s12Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strM2 = jvVarA.m(s12Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) jvVarA.u(s12Var, 4, (mv0) rx0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) jvVarA.u(s12Var, 5, (mv0) rx0VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    mhVar = (mh) jvVarA.g(s12Var, 6, kh.a, mhVar);
                    i |= 64;
                    break;
                default:
                    throw new nu0(iH);
            }
        }
        jvVarA.p(s12Var);
        return new hk0(i, strM, iV, iV2, strM2, list, list2, mhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mk0
    public final mv0[] b() {
        rx0[] rx0VarArr = hk0.h;
        g92 g92Var = g92.a;
        or0 or0Var = or0.a;
        return new mv0[]{g92Var, or0Var, or0Var, g92Var, rx0VarArr[4].getValue(), rx0VarArr[5].getValue(), ir2.r(kh.a)};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        hk0 hk0Var = (hk0) obj;
        hk0Var.getClass();
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        rx0[] rx0VarArr = hk0.h;
        String str = hk0Var.a;
        mh mhVar = hk0Var.g;
        List list = hk0Var.f;
        List list2 = hk0Var.e;
        String str2 = hk0Var.d;
        int i = hk0Var.c;
        p61VarU.R(s12Var, 0, str);
        p61VarU.I(1, hk0Var.b, s12Var);
        if (p61VarU.l0(s12Var) || i != 0) {
            p61VarU.I(2, i, s12Var);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str2, "")) {
            p61VarU.R(s12Var, 3, str2);
        }
        boolean zL0 = p61VarU.l0(s12Var);
        cb0 cb0Var = cb0.e;
        if (zL0 || !ws0.j(list2, cb0Var)) {
            p61VarU.N(s12Var, 4, (mv0) rx0VarArr[4].getValue(), list2);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(list, cb0Var)) {
            p61VarU.N(s12Var, 5, (mv0) rx0VarArr[5].getValue(), list);
        }
        if (p61VarU.l0(s12Var) || mhVar != null) {
            p61VarU.M(s12Var, 6, kh.a, mhVar);
        }
        p61VarU.T(s12Var);
    }
}

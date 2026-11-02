package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg implements mk0 {
    public static final kg a;
    private static final s12 descriptor;

    static {
        kg kgVar = new kg();
        a = kgVar;
        on1 on1Var = new on1("ir.alirezaivaz.mygarage.data.backup.BackupCar", kgVar, 16);
        on1Var.l("name", true);
        on1Var.l("make", true);
        on1Var.l("model", true);
        on1Var.l("year", true);
        on1Var.l("plate2", true);
        on1Var.l("plateLetter", true);
        on1Var.l("plate3", true);
        on1Var.l("plateRegion", true);
        on1Var.l("fuelType", true);
        on1Var.l("currentOdometerKm", true);
        on1Var.l("odometerUpdatedEpochDay", true);
        on1Var.l("typicalDailyKm", true);
        on1Var.l("createdEpochDay", true);
        on1Var.l("schedules", true);
        on1Var.l("records", true);
        on1Var.l("readings", true);
        descriptor = on1Var;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        s12 s12Var = descriptor;
        jv jvVarA = n20Var.A(s12Var);
        rx0[] rx0VarArr = mg.q;
        Integer num = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        Integer num2 = null;
        String strM4 = null;
        String strM5 = null;
        String strM6 = null;
        String strM7 = null;
        String strM8 = null;
        int i = 0;
        boolean z = true;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        while (z) {
            rx0VarArr = rx0VarArr;
            int iH = jvVarA.h(s12Var);
            switch (iH) {
                case -1:
                    z = false;
                    strM = strM;
                    break;
                case 0:
                    i |= 1;
                    strM = jvVarA.m(s12Var, 0);
                    break;
                case 1:
                    strM2 = jvVarA.m(s12Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strM3 = jvVarA.m(s12Var, 2);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) jvVarA.g(s12Var, 3, or0.a, num2);
                    i |= 8;
                    strM = strM;
                    break;
                case 4:
                    strM4 = jvVarA.m(s12Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strM5 = jvVarA.m(s12Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strM6 = jvVarA.m(s12Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strM7 = jvVarA.m(s12Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strM8 = jvVarA.m(s12Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iV = jvVarA.v(s12Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iV2 = jvVarA.v(s12Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    num = (Integer) jvVarA.g(s12Var, 11, or0.a, num);
                    i |= 2048;
                    strM = strM;
                    break;
                case 12:
                    iV3 = jvVarA.v(s12Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    list2 = (List) jvVarA.u(s12Var, 13, (mv0) rx0VarArr[13].getValue(), list2);
                    i |= 8192;
                    strM = strM;
                    break;
                case 14:
                    list3 = (List) jvVarA.u(s12Var, 14, (mv0) rx0VarArr[14].getValue(), list3);
                    i |= 16384;
                    strM = strM;
                    break;
                case 15:
                    list = (List) jvVarA.u(s12Var, 15, (mv0) rx0VarArr[15].getValue(), list);
                    i |= 32768;
                    strM = strM;
                    break;
                default:
                    throw new nu0(iH);
            }
        }
        jvVarA.p(s12Var);
        return new mg(i, strM, strM2, strM3, num2, strM4, strM5, strM6, strM7, strM8, iV, iV2, num, iV3, list2, list3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mk0
    public final mv0[] b() {
        rx0[] rx0VarArr = mg.q;
        g92 g92Var = g92.a;
        or0 or0Var = or0.a;
        return new mv0[]{g92Var, g92Var, g92Var, ir2.r(or0Var), g92Var, g92Var, g92Var, g92Var, g92Var, or0Var, or0Var, ir2.r(or0Var), or0Var, rx0VarArr[13].getValue(), rx0VarArr[14].getValue(), rx0VarArr[15].getValue()};
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        List list;
        List list2;
        List list3;
        mg mgVar = (mg) obj;
        mgVar.getClass();
        List list4 = mgVar.p;
        List list5 = mgVar.o;
        List list6 = mgVar.n;
        int i = mgVar.m;
        Integer num = mgVar.l;
        int i2 = mgVar.k;
        int i3 = mgVar.j;
        String str = mgVar.i;
        String str2 = mgVar.h;
        String str3 = mgVar.g;
        String str4 = mgVar.f;
        String str5 = mgVar.e;
        Integer num2 = mgVar.d;
        String str6 = mgVar.c;
        String str7 = mgVar.b;
        String str8 = mgVar.a;
        s12 s12Var = descriptor;
        p61 p61VarU = p61Var.u(s12Var);
        rx0[] rx0VarArr = mg.q;
        if (p61VarU.l0(s12Var) || !ws0.j(str8, "")) {
            p61VarU.R(s12Var, 0, str8);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str7, "")) {
            p61VarU.R(s12Var, 1, str7);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str6, "")) {
            p61VarU.R(s12Var, 2, str6);
        }
        if (p61VarU.l0(s12Var) || num2 != null) {
            p61VarU.M(s12Var, 3, or0.a, num2);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str5, "")) {
            p61VarU.R(s12Var, 4, str5);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str4, "")) {
            p61VarU.R(s12Var, 5, str4);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str3, "")) {
            p61VarU.R(s12Var, 6, str3);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str2, "")) {
            p61VarU.R(s12Var, 7, str2);
        }
        if (p61VarU.l0(s12Var) || !ws0.j(str, "GASOLINE")) {
            p61VarU.R(s12Var, 8, str);
        }
        if (p61VarU.l0(s12Var) || i3 != 0) {
            p61VarU.I(9, i3, s12Var);
        }
        if (p61VarU.l0(s12Var) || i2 != 0) {
            p61VarU.I(10, i2, s12Var);
        }
        if (p61VarU.l0(s12Var) || num != null) {
            p61VarU.M(s12Var, 11, or0.a, num);
        }
        if (p61VarU.l0(s12Var) || i != 0) {
            p61VarU.I(12, i, s12Var);
        }
        boolean zL0 = p61VarU.l0(s12Var);
        cb0 cb0Var = cb0.e;
        if (!zL0) {
            list = list6;
            if (!ws0.j(list, cb0Var)) {
            }
            if (p61VarU.l0(s12Var)) {
                list2 = list5;
                if (!ws0.j(list2, cb0Var)) {
                }
                if (p61VarU.l0(s12Var)) {
                    list3 = list4;
                    if (!ws0.j(list3, cb0Var)) {
                    }
                    p61VarU.T(s12Var);
                }
                list3 = list4;
                p61VarU.N(s12Var, 15, (mv0) rx0VarArr[15].getValue(), list3);
                p61VarU.T(s12Var);
            }
            list2 = list5;
            p61VarU.N(s12Var, 14, (mv0) rx0VarArr[14].getValue(), list2);
            if (p61VarU.l0(s12Var)) {
                list3 = list4;
                if (!ws0.j(list3, cb0Var)) {
                }
                p61VarU.T(s12Var);
            }
            list3 = list4;
            p61VarU.N(s12Var, 15, (mv0) rx0VarArr[15].getValue(), list3);
            p61VarU.T(s12Var);
        }
        list = list6;
        p61VarU.N(s12Var, 13, (mv0) rx0VarArr[13].getValue(), list);
        if (p61VarU.l0(s12Var)) {
            list2 = list5;
            if (!ws0.j(list2, cb0Var)) {
            }
            if (p61VarU.l0(s12Var)) {
                list3 = list4;
                if (!ws0.j(list3, cb0Var)) {
                }
                p61VarU.T(s12Var);
            }
            list3 = list4;
            p61VarU.N(s12Var, 15, (mv0) rx0VarArr[15].getValue(), list3);
            p61VarU.T(s12Var);
        }
        list2 = list5;
        p61VarU.N(s12Var, 14, (mv0) rx0VarArr[14].getValue(), list2);
        if (p61VarU.l0(s12Var)) {
            list3 = list4;
            if (!ws0.j(list3, cb0Var)) {
            }
            p61VarU.T(s12Var);
        }
        list3 = list4;
        p61VarU.N(s12Var, 15, (mv0) rx0VarArr[15].getValue(), list3);
        p61VarU.T(s12Var);
    }
}

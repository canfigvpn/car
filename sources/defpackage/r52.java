package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r52 implements jj0 {
    public final /* synthetic */ u52 e;
    public final /* synthetic */ u52 f;
    public final /* synthetic */ bd0 g;
    public final /* synthetic */ String h;

    public r52(u52 u52Var, u52 u52Var2, bd0 bd0Var, String str) {
        this.e = u52Var;
        this.f = u52Var2;
        this.g = bd0Var;
        this.h = str;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        ij0 ij0Var = (ij0) obj;
        ak0 ak0Var = (ak0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ak0Var.h(ij0Var) ? 4 : 2;
        }
        if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
            u52 u52Var = this.f;
            u52 u52Var2 = this.e;
            boolean zJ = ws0.j(u52Var2, u52Var);
            g82 g82VarQ = rw.Q(h81.h, ak0Var);
            boolean zF = ak0Var.f(u52Var2);
            Object obj4 = this.g;
            boolean zH = zF | ak0Var.h(obj4);
            Object objL = ak0Var.L();
            Object obj5 = cv.a;
            if (zH || objL == obj5) {
                objL = new gp1(5, u52Var2, obj4);
                ak0Var.g0(objL);
            }
            ti0 ti0Var = (ti0) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == obj5) {
                objL2 = sv0.D(!zJ ? 1.0f : 0.0f);
                ak0Var.g0(objL2);
            }
            ia iaVar = (ia) objL2;
            Boolean boolValueOf = Boolean.valueOf(zJ);
            boolean zH2 = ak0Var.h(iaVar) | ak0Var.g(zJ) | ak0Var.h(g82VarQ) | ak0Var.f(ti0Var);
            Object objL3 = ak0Var.L();
            if (zH2 || objL3 == obj5) {
                Object jVar = new j(iaVar, zJ, g82VarQ, ti0Var, (sx) null);
                ak0Var.g0(jVar);
                objL3 = jVar;
            }
            s5.o((ij0) objL3, ak0Var, boolValueOf);
            ob obVar = iaVar.c;
            g82 g82VarQ2 = rw.Q(h81.f, ak0Var);
            Object objL4 = ak0Var.L();
            if (objL4 == obj5) {
                objL4 = sv0.D(zJ ? 0.8f : 1.0f);
                ak0Var.g0(objL4);
            }
            ia iaVar2 = (ia) objL4;
            Boolean boolValueOf2 = Boolean.valueOf(zJ);
            boolean zH3 = ak0Var.h(iaVar2) | ak0Var.g(zJ) | ak0Var.h(g82VarQ2);
            Object objL5 = ak0Var.L();
            if (zH3 || objL5 == obj5) {
                objL5 = new t52(iaVar2, zJ, g82VarQ2, null);
                ak0Var.g0(objL5);
            }
            s5.o((ij0) objL5, ak0Var, boolValueOf2);
            ob obVar2 = iaVar2.c;
            u71 u71VarU = nj2.u(r71.a, ((Number) obVar2.f.getValue()).floatValue(), ((Number) obVar2.f.getValue()).floatValue(), ((Number) obVar.f.getValue()).floatValue(), 0.0f, null, 131064);
            boolean zG = ak0Var.g(zJ) | ak0Var.f(u52Var2);
            String str = this.h;
            boolean zF2 = zG | ak0Var.f(str);
            Object objL6 = ak0Var.L();
            if (zF2 || objL6 == obj5) {
                objL6 = new c50(zJ, str, u52Var2);
                ak0Var.g0(objL6);
            }
            u71 u71VarA = l02.a(u71VarU, false, (ej0) objL6);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarA);
            wu.c.getClass();
            ti0 ti0Var2 = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var2);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            ij0Var.g(ak0Var, Integer.valueOf(iIntValue & 14));
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

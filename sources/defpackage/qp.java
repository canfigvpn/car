package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qp implements ij0 {
    public final /* synthetic */ float e;
    public final /* synthetic */ gj1 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ gt h;
    public final /* synthetic */ long i;

    public qp(float f, gj1 gj1Var, long j, gt gtVar, long j2) {
        this.e = f;
        this.f = gj1Var;
        this.g = j;
        this.h = gtVar;
        this.i = j2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            g82 g82VarQ = rw.Q(h81.i, ak0Var);
            g82 g82VarQ2 = rw.Q(h81.h, ak0Var);
            g82 g82VarQ3 = rw.Q(h81.f, ak0Var);
            g82 g82VarQ4 = rw.Q(h81.g, ak0Var);
            float f = this.e;
            r71 r71Var = r71.a;
            u71 u71VarB0 = p61.b0(f52.b(r71Var, 0.0f, f, 1), this.f);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new up();
                ak0Var.g0(objL);
            }
            up upVar = (up) objL;
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarB0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, upVar);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar3);
            }
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            u71 u71VarS = vs0.s(r71Var, "leadingIcon");
            ui uiVar = q90.r;
            dv1.c(false, u71VarS, nb0.a(g82VarQ3, uiVar, 12).a(nb0.c(g82VarQ, 2)), nb0.e(g82VarQ4, uiVar, 12).a(nb0.d(g82VarQ2, 2)), null, vs0.C(687705959, new kt(3, this.g), ak0Var), ak0Var, 196656, 16);
            u71 u71VarS2 = vs0.s(r71Var, "label");
            kj1 kj1Var = sp.a;
            u71 u71VarE0 = p61.e0(u71VarS2, 8.0f, 0.0f, 2);
            sv1 sv1VarA = rv1.a(ws0.e, q90.p, ak0Var, 54);
            int iX2 = ws0.x(ak0Var);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarE0);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, sv1VarA);
            p12.l(raVar2, ak0Var, sl1VarL2);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                k3.p(iX2, ak0Var, iX2, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB2);
            k3.o(0, this.h, ak0Var, true);
            u71 u71VarS3 = vs0.s(r71Var, "trailingIcon");
            ui uiVar2 = q90.t;
            dv1.c(false, u71VarS3, nb0.a(g82VarQ3, uiVar2, 12).a(nb0.c(g82VarQ, 2)), nb0.e(g82VarQ4, uiVar2, 12).a(nb0.d(g82VarQ2, 2)), null, vs0.C(1905252304, new kt(4, this.i), ak0Var), ak0Var, 196656, 16);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

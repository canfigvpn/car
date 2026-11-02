package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class le0 implements ij0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gt f;
    public final /* synthetic */ gt g;

    public le0(boolean z, gt gtVar, gt gtVar2) {
        this.e = z;
        this.f = gtVar;
        this.g = gtVar2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.e;
            u71 u71VarF0 = p61.f0(f52.m(r71.a, z ? mx.d : sv0.n, 0.0f, 0.0f, 14), z ? mx.a : 0.0f, 0.0f, z ? mx.c : 0.0f, 0.0f, 10);
            vi viVar = q90.p;
            boolean z2 = this.e;
            sv1 sv1VarA = rv1.a(z2 ? ws0.e : ws0.h, viVar, ak0Var, 48);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarF0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, sv1VarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            this.f.g(ak0Var, 0);
            sb0 sb0VarC = nb0.c(rw.Q(h81.g, ak0Var), 2);
            g82 g82VarQ = rw.Q(h81.f, ak0Var);
            ui uiVar = q90.r;
            dv1.b(z2, null, sb0VarC.a(nb0.a(g82VarQ, uiVar, 12)), nb0.d(rw.Q(h81.h, ak0Var), 2).a(nb0.e(rw.Q(h81.e, ak0Var), uiVar, 12)), null, vs0.C(-660008666, new v10(i, this.g), ak0Var), ak0Var, 1572870);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

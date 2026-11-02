package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements ij0 {
    public final /* synthetic */ ij0 e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ gt j;

    public m3(ij0 ij0Var, ij0 ij0Var2, long j, long j2, long j3, long j4, gt gtVar) {
        this.e = ij0Var;
        this.f = ij0Var2;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        int i2 = 0;
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            u71 u71VarB0 = p61.b0(r71.a, r3.a);
            wr wrVarA = ur.a(ws0.g, q90.r, ak0Var, 0);
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
            p12.l(raVar, ak0Var, wrVarA);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar3);
            }
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            ak0Var.W(346092326);
            ak0Var.p(false);
            ij0 ij0Var = this.e;
            if (ij0Var == null) {
                ak0Var.W(346396529);
            } else {
                ak0Var.W(346396530);
                vv.d(this.g, ik2.a(vs0.q, ak0Var), vs0.C(71284337, new l3(i2, ij0Var), ak0Var), ak0Var, 384);
            }
            ak0Var.p(false);
            ij0 ij0Var2 = this.f;
            if (ij0Var2 == null) {
                ak0Var.W(347174009);
            } else {
                ak0Var.W(347174010);
                vv.d(this.h, ik2.a(vs0.s, ak0Var), vs0.C(705583346, new l3(i, ij0Var2), ak0Var), ak0Var, 384);
            }
            ak0Var.p(false);
            mn0 mn0Var = new mn0(q90.t);
            w61 w61VarC = xj.c(q90.f, false);
            int iX2 = ws0.x(ak0Var);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, mn0Var);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC);
            p12.l(raVar2, ak0Var, sl1VarL2);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                k3.p(iX2, ak0Var, iX2, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB2);
            vv.d(this.i, ik2.a(vs0.m, ak0Var), this.j, ak0Var, 0);
            ak0Var.p(true);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

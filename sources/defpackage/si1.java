package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 implements ij0 {
    public final /* synthetic */ u71 e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ jd2 h;
    public final /* synthetic */ te2 i;
    public final /* synthetic */ ej0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ vf2 l;
    public final /* synthetic */ aw0 m;
    public final /* synthetic */ zv0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ io2 r;
    public final /* synthetic */ f91 s;
    public final /* synthetic */ ij0 t;
    public final /* synthetic */ ij0 u;
    public final /* synthetic */ u32 v;

    public si1(u71 u71Var, ij0 ij0Var, boolean z, jd2 jd2Var, te2 te2Var, ej0 ej0Var, boolean z2, vf2 vf2Var, aw0 aw0Var, zv0 zv0Var, boolean z3, int i, int i2, io2 io2Var, f91 f91Var, ij0 ij0Var2, ij0 ij0Var3, u32 u32Var) {
        this.e = u71Var;
        this.f = ij0Var;
        this.g = z;
        this.h = jd2Var;
        this.i = te2Var;
        this.j = ej0Var;
        this.k = z2;
        this.l = vf2Var;
        this.m = aw0Var;
        this.n = zv0Var;
        this.o = z3;
        this.p = i;
        this.q = i2;
        this.r = io2Var;
        this.s = f91Var;
        this.t = ij0Var2;
        this.u = ij0Var3;
        this.v = u32Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            ij0 ij0Var = this.f;
            u71 u71VarF0 = r71.a;
            if (ij0Var != null) {
                ak0Var.W(-1901539802);
                Object objL = ak0Var.L();
                if (objL == cv.a) {
                    objL = new o01(29);
                    ak0Var.g0(objL);
                }
                u71VarF0 = p61.f0(l02.a(u71VarF0, true, (ej0) objL), 0.0f, j12.k(ak0Var), 0.0f, 0.0f, 13);
                ak0Var.p(false);
            } else {
                ak0Var.W(-1901156115);
                ak0Var.p(false);
            }
            u71 u71VarC = this.e.c(u71VarF0);
            String strL = r02.l(R.string.default_error_message, ak0Var);
            boolean z = this.g;
            if (z) {
                u71VarC = l02.a(u71VarC, false, new ii(strL, 8));
            }
            u71 u71VarA = f52.a(u71VarC, 280.0f, 56.0f);
            jd2 jd2Var = this.h;
            o72 o72Var = new o72(z ? jd2Var.j : jd2Var.i);
            ij0 ij0Var2 = this.u;
            u32 u32Var = this.v;
            te2 te2Var = this.i;
            boolean z2 = this.k;
            boolean z3 = this.o;
            io2 io2Var = this.r;
            f91 f91Var = this.s;
            bi.a(te2Var, this.j, u71VarA, z2, this.l, this.m, this.n, z3, this.p, this.q, io2Var, null, f91Var, o72Var, vs0.C(674541106, new ri1(te2Var, z2, z3, io2Var, f91Var, this.g, this.f, this.t, ij0Var2, jd2Var, u32Var), ak0Var), ak0Var, 0);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

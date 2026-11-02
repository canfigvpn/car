package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qi1 implements ij0 {
    public final /* synthetic */ u71 e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ jd2 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ ej0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ vf2 m;
    public final /* synthetic */ aw0 n;
    public final /* synthetic */ zv0 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ io2 s;
    public final /* synthetic */ f91 t;
    public final /* synthetic */ ij0 u;
    public final /* synthetic */ ij0 v;
    public final /* synthetic */ ij0 w;
    public final /* synthetic */ u32 x;

    public qi1(u71 u71Var, ij0 ij0Var, boolean z, jd2 jd2Var, String str, ej0 ej0Var, boolean z2, boolean z3, vf2 vf2Var, aw0 aw0Var, zv0 zv0Var, boolean z4, int i, int i2, io2 io2Var, f91 f91Var, ij0 ij0Var2, ij0 ij0Var3, ij0 ij0Var4, u32 u32Var) {
        this.e = u71Var;
        this.f = ij0Var;
        this.g = z;
        this.h = jd2Var;
        this.i = str;
        this.j = ej0Var;
        this.k = z2;
        this.l = z3;
        this.m = vf2Var;
        this.n = aw0Var;
        this.o = zv0Var;
        this.p = z4;
        this.q = i;
        this.r = i2;
        this.s = io2Var;
        this.t = f91Var;
        this.u = ij0Var2;
        this.v = ij0Var3;
        this.w = ij0Var4;
        this.x = u32Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            ij0 ij0Var = this.f;
            u71 u71VarF0 = r71.a;
            if (ij0Var != null) {
                ak0Var.W(-903490605);
                Object objL = ak0Var.L();
                if (objL == cv.a) {
                    objL = new o01(28);
                    ak0Var.g0(objL);
                }
                u71VarF0 = p61.f0(l02.a(u71VarF0, true, (ej0) objL), 0.0f, j12.k(ak0Var), 0.0f, 0.0f, 13);
                ak0Var.p(false);
            } else {
                ak0Var.W(-903106918);
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
            ij0 ij0Var2 = this.w;
            u32 u32Var = this.x;
            String str = this.i;
            boolean z2 = this.k;
            boolean z3 = this.p;
            io2 io2Var = this.s;
            f91 f91Var = this.t;
            bi.b(str, this.j, u71VarA, z2, this.l, this.m, this.n, this.o, z3, this.q, this.r, io2Var, null, f91Var, o72Var, vs0.C(-1189274459, new pi1(str, z2, z3, io2Var, f91Var, this.g, this.f, this.u, this.v, ij0Var2, jd2Var, u32Var), ak0Var), ak0Var, 0, 4096);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

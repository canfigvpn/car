package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p10 implements ij0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ l00 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public p10(String str, l00 l00Var, boolean z, boolean z2, boolean z3) {
        this.e = str;
        this.f = l00Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            u71 u71VarG = f52.g(r71.a, nj2.F, nj2.D);
            w61 w61VarC = xj.c(q90.j, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarG);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
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
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new s1(27);
                ak0Var.g0(objL);
            }
            AtomicInteger atomicInteger = l02.a;
            gq gqVar = new gq((ej0) objL);
            l00 l00Var = this.f;
            long j = l00Var.o;
            boolean z = this.h;
            boolean z2 = this.i;
            if (z && z2) {
                j = l00Var.p;
            } else if (z && !z2) {
                j = l00Var.q;
            } else if (this.g && z2) {
                j = l00Var.t;
            } else if (z2) {
                j = l00Var.n;
            }
            ak0Var.W(-969417610);
            p82 p82VarA = c52.a(j, rw.Q(h81.g, ak0Var), ak0Var);
            ak0Var.p(false);
            ef2.b(this.e, gqVar, ((dr) p82VarA.getValue()).a, 0L, 0L, new gc2(3), 0L, 0, false, 0, 0, null, ak0Var, 0, 0, 261112);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

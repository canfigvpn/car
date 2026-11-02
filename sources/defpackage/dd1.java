package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 implements ij0 {
    public final /* synthetic */ yc1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ g82 h;
    public final /* synthetic */ ij0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ gt k;

    public dd1(yc1 yc1Var, boolean z, boolean z2, g82 g82Var, ij0 ij0Var, boolean z3, gt gtVar) {
        this.e = yc1Var;
        this.f = z;
        this.g = z2;
        this.h = g82Var;
        this.i = ij0Var;
        this.j = z3;
        this.k = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        long j;
        u71 gqVar;
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.g;
            boolean z2 = this.f;
            yc1 yc1Var = this.e;
            if (z) {
                j = z2 ? yc1Var.a : yc1Var.d;
            } else {
                j = yc1Var.f;
            }
            p82 p82VarA = c52.a(j, this.h, ak0Var);
            if (this.i == null || !(this.j || z2)) {
                ak0Var.W(-634793532);
                ak0Var.p(false);
                gqVar = r71.a;
            } else {
                ak0Var.W(-634794445);
                Object objL = ak0Var.L();
                if (objL == cv.a) {
                    objL = new o01(23);
                    ak0Var.g0(objL);
                }
                AtomicInteger atomicInteger = l02.a;
                gqVar = new gq((ej0) objL);
                ak0Var.p(false);
            }
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, gqVar);
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
            a90 a90Var = yw.a;
            dr drVar = (dr) p82VarA.getValue();
            long j2 = drVar.a;
            sv.a(a90Var.a(drVar), this.k, ak0Var, 8);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

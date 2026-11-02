package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c20 implements ij0 {
    public final /* synthetic */ bm e;
    public final /* synthetic */ long f;
    public final /* synthetic */ lr0 g;
    public final /* synthetic */ u71 h;
    public final /* synthetic */ l00 i;
    public final /* synthetic */ ej0 j;
    public final /* synthetic */ n00 k;

    public c20(bm bmVar, long j, lr0 lr0Var, u71 u71Var, l00 l00Var, ej0 ej0Var, n00 n00Var) {
        this.e = bmVar;
        this.f = j;
        this.g = lr0Var;
        this.h = u71Var;
        this.i = l00Var;
        this.j = ej0Var;
        this.k = n00Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            bm bmVar = this.e;
            final int i = bmVar.g(bmVar.h()).a;
            final int i2 = bmVar.f(this.f).a;
            lr0 lr0Var = this.g;
            ry0 ry0VarA = uy0.a(Math.max(0, (i2 - lr0Var.e) - 3), 2, ak0Var);
            kl0 kl0Var = new kl0();
            l00 l00Var = this.i;
            u71 u71VarS = p61.s(this.h, l00Var.a, vs0.C);
            is1 is1Var = ws0.i;
            he heVar = new he(e20.d, new ut(1));
            boolean zH = ak0Var.h(bmVar) | ak0Var.h(lr0Var) | ak0Var.d(i2) | ak0Var.d(i) | ak0Var.f(this.j) | ak0Var.f(this.k) | ak0Var.f(l00Var);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                final lr0 lr0Var2 = this.g;
                final bm bmVar2 = this.e;
                final ej0 ej0Var = this.j;
                final n00 n00Var = this.k;
                final l00 l00Var2 = this.i;
                ej0 ej0Var2 = new ej0() { // from class: z10
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ej0
                    public final Object h(Object obj3) {
                        int size;
                        yx0 yx0Var = (yx0) obj3;
                        lr0 lr0Var3 = lr0Var2;
                        lr0Var3.getClass();
                        if (lr0Var3 instanceof Collection) {
                            size = ((Collection) lr0Var3).size();
                        } else {
                            Iterator it = lr0Var3.iterator();
                            int i3 = 0;
                            while (((kr0) it).g) {
                                ((er0) it).next();
                                i3++;
                                if (i3 < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                            size = i3;
                        }
                        gt gtVar = new gt(new b20(lr0Var3, bmVar2, i2, i, ej0Var, n00Var, l00Var2), true, 674613074);
                        yx0Var.e.a(size, new xx0(yx0.f, jy0.f, gtVar));
                        return ll2.a;
                    }
                };
                ak0Var.g0(ej0Var2);
                objL = ej0Var2;
            }
            qx.e(kl0Var, u71VarS, ry0VarA, null, heVar, is1Var, null, false, null, (ej0) objL, ak0Var, 1769472, 920);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

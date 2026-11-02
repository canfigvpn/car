package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hy implements w61 {
    public final /* synthetic */ f11 a;
    public final /* synthetic */ ej0 b;
    public final /* synthetic */ te2 c;
    public final /* synthetic */ xf1 d;
    public final /* synthetic */ m40 e;
    public final /* synthetic */ int f;

    public hy(f11 f11Var, ej0 ej0Var, te2 te2Var, xf1 xf1Var, m40 m40Var, int i) {
        this.a = f11Var;
        this.b = ej0Var;
        this.c = te2Var;
        this.d = xf1Var;
        this.e = m40Var;
        this.f = i;
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        f11 f11Var = this.a;
        f11Var.a.a(os0Var.getLayoutDirection());
        xf xfVar = f11Var.a.j;
        if (xfVar != null) {
            return j02.e(xfVar.c());
        }
        fu1.h("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [jw0] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        hf2 hf2Var;
        kw0 kw0Var;
        x61 x61Var;
        hf2 hf2Var2;
        int i;
        hy hyVar;
        int iE;
        ?? r14;
        f11 f11Var = this.a;
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            if2 if2VarD = f11Var.d();
            c12.s(o62VarJ, o62VarP, ej0VarE);
            hf2 hf2Var3 = if2VarD != null ? if2VarD.a : null;
            gd2 gd2Var = f11Var.a;
            kw0 layoutDirection = y61Var.getLayoutDirection();
            int i2 = gd2Var.f;
            boolean z = gd2Var.e;
            int i3 = gd2Var.c;
            if (hf2Var3 != null) {
                t81 t81Var = hf2Var3.b;
                gf2 gf2Var = hf2Var3.a;
                yb ybVar = gd2Var.a;
                vf2 vf2Var = gd2Var.b;
                List list2 = gd2Var.i;
                x61Var = null;
                m40 m40Var = gd2Var.g;
                jg0 jg0Var = gd2Var.h;
                hf2 hf2Var4 = hf2Var3;
                if (!t81Var.a.b()) {
                    yb ybVar2 = gf2Var.a;
                    long j2 = gf2Var.j;
                    if (ws0.j(ybVar2, ybVar) && gf2Var.b.c(vf2Var) && ws0.j(gf2Var.c, list2) && gf2Var.d == i3 && gf2Var.e == z && gf2Var.f == i2 && ws0.j(gf2Var.g, m40Var)) {
                        kw0Var = layoutDirection;
                        if (gf2Var.h == kw0Var && ws0.j(gf2Var.i, jg0Var) && sw.j(j) == sw.j(j2) && ((!z && i2 != 2) || (sw.h(j) == sw.h(j2) && sw.g(j) == sw.g(j2)))) {
                            hf2Var = hf2Var4;
                            hf2Var2 = new hf2(new gf2(gf2Var.a, gd2Var.b, gf2Var.c, gf2Var.d, gf2Var.e, gf2Var.f, gf2Var.g, gf2Var.h, gf2Var.i, j), t81Var, tw.d(j, (((long) j02.e(t81Var.e)) & 4294967295L) | (((long) j02.e(t81Var.d)) << 32)));
                        }
                    } else {
                        j = j;
                        hf2Var = hf2Var4;
                        kw0Var = layoutDirection;
                    }
                    long j3 = hf2Var2.c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (ws0.j(hf2Var, hf2Var2)) {
                        i = 0;
                        hyVar = this;
                    } else {
                        if (if2VarD != null) {
                            r14 = if2VarD.c;
                        } else {
                            r14 = x61Var;
                        }
                        f11Var.i.setValue(new if2(hf2Var2, r14));
                        i = 0;
                        f11Var.p = false;
                        hyVar = this;
                        hyVar.b.h(hf2Var2);
                        sv.P(f11Var, hyVar.c, hyVar.d);
                    }
                    if (hyVar.f == 1) {
                        iE = j02.e(hf2Var2.b.b(i));
                    } else {
                        iE = i;
                    }
                    f11Var.g.setValue(new w60(hyVar.e.n0(iE)));
                    return y61Var.d0(iIntValue, iIntValue2, h61.f0(new qj1(x3.a, Integer.valueOf(Math.round(hf2Var2.d))), new qj1(x3.b, Integer.valueOf(Math.round(hf2Var2.e)))), new s1(21));
                }
                kw0Var = layoutDirection;
                hf2Var = hf2Var4;
            } else {
                j = j;
                hf2Var = hf2Var3;
                kw0Var = layoutDirection;
                x61Var = null;
            }
            gd2Var.a(kw0Var);
            int iJ = sw.j(j);
            int iH = ((z || i2 == 2) && sw.d(j)) ? sw.h(j) : Integer.MAX_VALUE;
            int i4 = (z || i2 != 2) ? i3 : 1;
            if (iJ != iH) {
                xf xfVar = gd2Var.j;
                if (xfVar == null) {
                    fu1.h("layoutIntrinsics must be called first");
                    return x61Var;
                }
                iH = ex.h(j02.e(xfVar.c()), iJ, iH);
            }
            xf xfVar2 = gd2Var.j;
            if (xfVar2 == null) {
                fu1.h("layoutIntrinsics must be called first");
                return x61Var;
            }
            t81 t81Var2 = new t81(xfVar2, rw.w(0, iH, 0, sw.g(j)), i4, gd2Var.f);
            hf2Var2 = new hf2(new gf2(gd2Var.a, gd2Var.b, gd2Var.i, gd2Var.c, gd2Var.e, gd2Var.f, gd2Var.g, kw0Var, gd2Var.h, j), t81Var2, tw.d(j, (((long) j02.e(t81Var2.d)) << 32) | (((long) j02.e(t81Var2.e)) & 4294967295L)));
            long j4 = hf2Var2.c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (ws0.j(hf2Var, hf2Var2)) {
                if (if2VarD != null) {
                    r14 = if2VarD.c;
                } else {
                    r14 = x61Var;
                }
                f11Var.i.setValue(new if2(hf2Var2, r14));
                i = 0;
                f11Var.p = false;
                hyVar = this;
                hyVar.b.h(hf2Var2);
                sv.P(f11Var, hyVar.c, hyVar.d);
            } else {
                i = 0;
                hyVar = this;
            }
            if (hyVar.f == 1) {
                iE = j02.e(hf2Var2.b.b(i));
            } else {
                iE = i;
            }
            f11Var.g.setValue(new w60(hyVar.e.n0(iE)));
            return y61Var.d0(iIntValue3, iIntValue4, h61.f0(new qj1(x3.a, Integer.valueOf(Math.round(hf2Var2.d))), new qj1(x3.b, Integer.valueOf(Math.round(hf2Var2.e)))), new s1(21));
        } catch (Throwable th) {
            c12.s(o62VarJ, o62VarP, ej0VarE);
            throw th;
        }
    }
}

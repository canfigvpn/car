package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements w61 {
    public final /* synthetic */ ti0 a;
    public final /* synthetic */ ij0 b;
    public final /* synthetic */ boolean c;

    public ed1(ti0 ti0Var, ij0 ij0Var, boolean z) {
        this.a = ti0Var;
        this.b = ij0Var;
        this.c = z;
    }

    @Override // defpackage.w61
    public final x61 g(final y61 y61Var, List list, long j) {
        float f;
        Object obj;
        jm1 jm1VarE;
        jm1 jm1VarE2;
        float fFloatValue = ((Number) this.a.a()).floatValue();
        float f2 = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jA = sw.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r61 r61Var = (r61) list.get(i);
            if (ws0.j(vs0.p(r61Var), "icon")) {
                final jm1 jm1VarE3 = r61Var.e(jA);
                float f3 = 2.0f;
                int iO = y61Var.O(fd1.d * 2.0f) + jm1VarE3.e;
                int iJ0 = p61.j0(iO * f2);
                int iO2 = y61Var.O(fd1.e * 2.0f) + jm1VarE3.f;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    r61 r61Var2 = (r61) list.get(i2);
                    float f4 = f3;
                    if (ws0.j(vs0.p(r61Var2), "indicatorRipple")) {
                        if (!((iO >= 0) & (iO2 >= 0))) {
                            xp0.a("width and height must be >= 0");
                        }
                        final jm1 jm1VarE4 = r61Var2.e(tw.h(iO, iO, iO2, iO2));
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                f = f2;
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            f = f2;
                            if (ws0.j(vs0.p((r61) obj), "indicator")) {
                                break;
                            }
                            i3++;
                            f2 = f;
                        }
                        r61 r61Var3 = (r61) obj;
                        if (r61Var3 != null) {
                            if (!((iJ0 >= 0) & (iO2 >= 0))) {
                                xp0.a("width and height must be >= 0");
                            }
                            jm1VarE = r61Var3.e(tw.h(iJ0, iJ0, iO2, iO2));
                        } else {
                            jm1VarE = null;
                        }
                        ij0 ij0Var = this.b;
                        if (ij0Var != null) {
                            int size4 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size4) {
                                    c31.b("Collection contains no element matching the predicate.");
                                    qj.e();
                                    return null;
                                }
                                r61 r61Var4 = (r61) list.get(i4);
                                if (ws0.j(vs0.p(r61Var4), "label")) {
                                    jm1VarE2 = r61Var4.e(jA);
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            jm1VarE2 = null;
                        }
                        db0 db0Var = db0.e;
                        if (ij0Var == null) {
                            final int iO3 = sw.h(j) == Integer.MAX_VALUE ? (y61Var.O(fd1.g) * 2) + jm1VarE3.e : sw.h(j);
                            final int iF = tw.f(y61Var.O(fd1.a), j);
                            final int i5 = (iO3 - jm1VarE3.e) / 2;
                            final int i6 = (iF - jm1VarE3.f) / 2;
                            final int i7 = (iO3 - jm1VarE4.e) / 2;
                            final int i8 = (iF - jm1VarE4.f) / 2;
                            final jm1 jm1Var = jm1VarE;
                            return y61Var.d0(iO3, iF, db0Var, new ej0() { // from class: cd1
                                @Override // defpackage.ej0
                                public final Object h(Object obj2) {
                                    im1 im1Var = (im1) obj2;
                                    jm1 jm1Var2 = jm1Var;
                                    if (jm1Var2 != null) {
                                        im1.k(im1Var, jm1Var2, (iO3 - jm1Var2.e) / 2, (iF - jm1Var2.f) / 2);
                                    }
                                    im1.k(im1Var, jm1VarE3, i5, i6);
                                    im1.k(im1Var, jm1VarE4, i7, i8);
                                    return ll2.a;
                                }
                            });
                        }
                        final jm1 jm1Var2 = jm1VarE;
                        jm1VarE2.getClass();
                        float f5 = jm1VarE3.f;
                        float f6 = fd1.e;
                        float fX = y61Var.x(f6) + f5;
                        float f7 = fd1.c;
                        float fX2 = y61Var.x(f7) + fX + jm1VarE2.f;
                        float fI = (sw.i(j) - fX2) / f4;
                        float fX3 = y61Var.x(f6);
                        if (fI < fX3) {
                            fI = fX3;
                        }
                        float f8 = (fI * f4) + fX2;
                        final boolean z = this.c;
                        final float f9 = (1.0f - f) * ((z ? fI : (f8 - jm1VarE3.f) / f4) - fI);
                        final float fX4 = y61Var.x(f7) + y61Var.x(f6) + jm1VarE3.f + fI;
                        final int iO4 = sw.h(j) == Integer.MAX_VALUE ? (y61Var.O(fd1.g) * 2) + jm1VarE3.e : sw.h(j);
                        final int i9 = (iO4 - jm1VarE2.e) / 2;
                        final int i10 = (iO4 - jm1VarE3.e) / 2;
                        final int i11 = (iO4 - jm1VarE4.e) / 2;
                        final float fX5 = fI - y61Var.x(f6);
                        final float f10 = fI;
                        final jm1 jm1Var3 = jm1VarE2;
                        final float f11 = f;
                        return y61Var.d0(iO4, p61.j0(f8), db0Var, new ej0() { // from class: bd1
                            @Override // defpackage.ej0
                            public final Object h(Object obj2) {
                                im1 im1Var = (im1) obj2;
                                jm1 jm1Var4 = jm1Var2;
                                float f12 = f9;
                                float f13 = f10;
                                if (jm1Var4 != null) {
                                    im1.k(im1Var, jm1Var4, (iO4 - jm1Var4.e) / 2, p61.j0((f13 - y61Var.O(fd1.e)) + f12));
                                }
                                if (z || f11 != 0.0f) {
                                    im1.k(im1Var, jm1Var3, i9, p61.j0(fX4 + f12));
                                }
                                im1.k(im1Var, jm1VarE3, i10, p61.j0(f13 + f12));
                                im1.k(im1Var, jm1VarE4, i11, p61.j0(fX5 + f12));
                                return ll2.a;
                            }
                        });
                    }
                    i2++;
                    f3 = f4;
                }
                c31.b("Collection contains no element matching the predicate.");
                qj.e();
                return null;
            }
        }
        c31.b("Collection contains no element matching the predicate.");
        qj.e();
        return null;
    }
}

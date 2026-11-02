package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ph2 implements w61 {
    public final zd0 a;
    public final float b;

    public ph2(zd0 zd0Var, float f) {
        this.a = zd0Var;
        this.b = f;
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        Integer numValueOf;
        int iO = os0Var.O(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r61) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r61) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iO, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        int size = list.size();
        int iA0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA0 += ((r61) list.get(i2)).a0(i);
        }
        return iA0;
    }

    @Override // defpackage.w61
    public final x61 g(final y61 y61Var, List list, final long j) {
        int iH;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            r61 r61Var = (r61) list.get(i2);
            if (ws0.j(vs0.p(r61Var), "navigationIcon")) {
                final jm1 jm1VarE = r61Var.e(sw.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    r61 r61Var2 = (r61) list.get(i3);
                    if (ws0.j(vs0.p(r61Var2), "actionIcons")) {
                        final jm1 jm1VarE2 = r61Var2.e(sw.a(j, 0, 0, 0, 0, 14));
                        if (sw.h(j) == Integer.MAX_VALUE) {
                            iH = sw.h(j);
                        } else {
                            iH = (sw.h(j) - jm1VarE.e) - jm1VarE2.e;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i4 = iH;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            r61 r61Var3 = (r61) list.get(i5);
                            if (ws0.j(vs0.p(r61Var3), "title")) {
                                final jm1 jm1VarE3 = r61Var3.e(sw.a(j, 0, i4, 0, 0, 12));
                                on0 on0Var = x3.b;
                                int iF0 = jm1VarE3.f0(on0Var) != Integer.MIN_VALUE ? jm1VarE3.f0(on0Var) : 0;
                                float fA = this.a.a();
                                int iJ0 = Float.isNaN(fA) ? 0 : p61.j0(fA);
                                final int iMax = Math.max(y61Var.O(this.b), jm1VarE3.f);
                                if (sw.g(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iJ0 + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iF0;
                                return y61Var.d0(sw.h(j), i, db0.e, new ej0(i, jm1VarE3, jm1VarE2, j, y61Var, this, i7, iMax) { // from class: oh2
                                    public final /* synthetic */ int f;
                                    public final /* synthetic */ jm1 g;
                                    public final /* synthetic */ jm1 h;
                                    public final /* synthetic */ long i;
                                    public final /* synthetic */ y61 j;

                                    @Override // defpackage.ej0
                                    public final Object h(Object obj) {
                                        int iH2;
                                        im1 im1Var = (im1) obj;
                                        jm1 jm1Var = this.e;
                                        int i8 = jm1Var.f;
                                        int i9 = this.f;
                                        im1.k(im1Var, jm1Var, 0, (i9 - i8) / 2);
                                        int iMax2 = Math.max(this.j.O(nc.c), jm1Var.e);
                                        jm1 jm1Var2 = this.h;
                                        int i10 = jm1Var2.e;
                                        jm1 jm1Var3 = this.g;
                                        int i11 = jm1Var3.e;
                                        long j2 = this.i;
                                        int iRound = Math.round((1.0f - 1.0f) * ((sw.h(j2) - i11) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (jm1Var3.e + iRound > sw.h(j2) - i10) {
                                                iH2 = (sw.h(j2) - i10) - (jm1Var3.e + iRound);
                                            }
                                            im1.k(im1Var, jm1Var3, iRound, (i9 - jm1Var3.f) / 2);
                                            im1.k(im1Var, jm1Var2, sw.h(j2) - jm1Var2.e, (i9 - jm1Var2.f) / 2);
                                            return ll2.a;
                                        }
                                        iH2 = iMax2 - iRound;
                                        iRound += iH2;
                                        im1.k(im1Var, jm1Var3, iRound, (i9 - jm1Var3.f) / 2);
                                        im1.k(im1Var, jm1Var2, sw.h(j2) - jm1Var2.e, (i9 - jm1Var2.f) / 2);
                                        return ll2.a;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        c31.b("Collection contains no element matching the predicate.");
                        qj.e();
                        return null;
                    }
                    i3++;
                    this = this;
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

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        Integer numValueOf;
        int iO = os0Var.O(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r61) list.get(0)).e0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r61) list.get(i2)).e0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iO, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
        int size = list.size();
        int iU = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iU += ((r61) list.get(i2)).U(i);
        }
        return iU;
    }
}

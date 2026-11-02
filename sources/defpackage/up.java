package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class up implements w61 {
    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
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
    public final x61 g(y61 y61Var, List list, long j) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ws0.j(vs0.p((r61) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        r61 r61Var = (r61) obj;
        final jm1 jm1VarE = r61Var != null ? r61Var.e(sw.a(j, 0, 0, 0, 0, 10)) : null;
        int i2 = jm1VarE != null ? jm1VarE.e : 0;
        final int i3 = jm1VarE != null ? jm1VarE.f : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (ws0.j(vs0.p((r61) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        r61 r61Var2 = (r61) obj2;
        final jm1 jm1VarE2 = r61Var2 != null ? r61Var2.e(sw.a(j, 0, 0, 0, 0, 10)) : null;
        int i5 = jm1VarE2 != null ? jm1VarE2.e : 0;
        final int i6 = jm1VarE2 != null ? jm1VarE2.f : 0;
        int size3 = list.size();
        int i7 = 0;
        while (i7 < size3) {
            r61 r61Var3 = (r61) list.get(i7);
            if (ws0.j(vs0.p(r61Var3), "label")) {
                final jm1 jm1VarE3 = r61Var3.e(tw.j(-(i2 + i5), 0, 2, j));
                int i8 = jm1VarE3.e + i2 + i5;
                final int iMax = Math.max(i3, Math.max(jm1VarE3.f, i6));
                final int i9 = i2;
                return y61Var.d0(i8, iMax, db0.e, new ej0() { // from class: tp
                    @Override // defpackage.ej0
                    public final Object h(Object obj3) {
                        im1 im1Var = (im1) obj3;
                        jm1 jm1Var = jm1VarE;
                        int i10 = iMax;
                        if (jm1Var != null) {
                            im1.k(im1Var, jm1Var, 0, Math.round(((i10 - i3) / 2.0f) * 1.0f));
                        }
                        jm1 jm1Var2 = jm1VarE3;
                        int i11 = i9;
                        im1.k(im1Var, jm1Var2, i11, 0);
                        jm1 jm1Var3 = jm1VarE2;
                        if (jm1Var3 != null) {
                            im1.k(im1Var, jm1Var3, i11 + jm1Var2.e, Math.round(((i10 - i6) / 2.0f) * 1.0f));
                        }
                        return ll2.a;
                    }
                });
            }
            i7++;
            jm1VarE = jm1VarE;
            i2 = i2;
        }
        c31.b("Collection contains no element matching the predicate.");
        qj.e();
        return null;
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
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

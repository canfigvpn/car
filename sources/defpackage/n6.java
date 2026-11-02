package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n6 implements w61 {
    public static final n6 b = new n6(0);
    public static final n6 c = new n6(1);
    public static final n6 d = new n6(2);
    public static final n6 e = new n6(3);
    public static final n30 f = new n30(1);
    public static final n6 g = new n6(4);
    public static final n6 h = new n6(5);
    public final /* synthetic */ int a;

    public /* synthetic */ n6(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x011b A[PHI: r6 r7
  0x011b: PHI (r6v16 int) = (r6v15 int), (r6v21 int), (r6v21 int) binds: [B:69:0x0135, B:62:0x010f, B:64:0x0115] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r7v24 int) = (r7v23 int), (r7v29 int), (r7v29 int) binds: [B:69:0x0135, B:62:0x010f, B:64:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        Object obj;
        Object obj2;
        int iO;
        int iMax;
        int i;
        int iF0;
        long j2 = j;
        int i2 = this.a;
        db0 db0Var = db0.e;
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    jm1 jm1VarE = ((r61) list.get(i4)).e(j2);
                    iJ = Math.max(iJ, jm1VarE.e);
                    i3 = Math.max(i3, jm1VarE.f);
                    arrayList.add(jm1VarE);
                }
                if (list.isEmpty()) {
                    iJ = sw.j(j2);
                    i3 = sw.i(j2);
                }
                return y61Var.d0(iJ, i3, db0Var, new m6(0, arrayList));
            case 1:
                int iMax2 = 0;
                int size2 = list.size();
                if (size2 == 0) {
                    return y61Var.d0(0, 0, db0Var, x4.o);
                }
                if (size2 == 1) {
                    jm1 jm1VarE2 = ((r61) list.get(0)).e(j2);
                    return y61Var.d0(jm1VarE2.e, jm1VarE2.f, db0Var, new q4(jm1VarE2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax3 = 0;
                for (int i5 = 0; i5 < size3; i5++) {
                    jm1 jm1VarE3 = ((r61) list.get(i5)).e(j2);
                    iMax2 = Math.max(iMax2, jm1VarE3.e);
                    iMax3 = Math.max(iMax3, jm1VarE3.f);
                    arrayList2.add(jm1VarE3);
                }
                return y61Var.d0(iMax2, iMax3, db0Var, new m6(1, arrayList2));
            case 2:
                return y61Var.d0(sw.j(j2), sw.i(j2), db0Var, new s1(9));
            case 3:
                return y61Var.d0(sw.h(j2), sw.g(j2), db0Var, f);
            case 4:
                int iMax4 = 0;
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                int iMax5 = 0;
                for (int i6 = 0; i6 < size4; i6++) {
                    jm1 jm1VarE4 = ((r61) list.get(i6)).e(j2);
                    iMax4 = Math.max(iMax4, jm1VarE4.e);
                    iMax5 = Math.max(iMax5, jm1VarE4.f);
                    arrayList3.add(jm1VarE4);
                }
                return y61Var.d0(iMax4, iMax5, db0Var, new tr1(7, arrayList3));
            case 5:
                return y61Var.d0(sw.f(j2) ? sw.h(j2) : 0, sw.e(j2) ? sw.g(j2) : 0, db0Var, new v22(2));
            default:
                int iMin = Math.min(sw.h(j2), y61Var.O(600.0f));
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size5) {
                        obj = list.get(i7);
                        if (!ws0.j(vs0.p((r61) obj), "action")) {
                            i7++;
                        }
                    } else {
                        obj = null;
                    }
                }
                r61 r61Var = (r61) obj;
                jm1 jm1VarE5 = r61Var != null ? r61Var.e(j2) : null;
                int size6 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size6) {
                        obj2 = list.get(i8);
                        if (!ws0.j(vs0.p((r61) obj2), "dismissAction")) {
                            i8++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                r61 r61Var2 = (r61) obj2;
                jm1 jm1VarE6 = r61Var2 != null ? r61Var2.e(j2) : null;
                int i9 = jm1VarE5 != null ? jm1VarE5.e : 0;
                int i10 = jm1VarE5 != null ? jm1VarE5.f : 0;
                int i11 = jm1VarE6 != null ? jm1VarE6.e : 0;
                int i12 = jm1VarE6 != null ? jm1VarE6.f : 0;
                int iO2 = ((iMin - i9) - i11) - (i11 == 0 ? y61Var.O(8.0f) : 0);
                int iJ2 = sw.j(j2);
                if (iO2 < iJ2) {
                    iO2 = iJ2;
                }
                int size7 = list.size();
                int i13 = 0;
                while (i13 < size7) {
                    r61 r61Var3 = (r61) list.get(i13);
                    int i14 = i10;
                    if (ws0.j(vs0.p(r61Var3), "text")) {
                        int i15 = i12;
                        final jm1 jm1VarE7 = r61Var3.e(sw.a(j, 0, iO2, 0, 0, 9));
                        on0 on0Var = x3.a;
                        int iF1 = jm1VarE7.f0(on0Var);
                        int iF2 = jm1VarE7.f0(x3.b);
                        final int i16 = iMin - i11;
                        final int i17 = i16 - i9;
                        if (iF1 == iF2 || !(iF1 != Integer.MIN_VALUE && iF2 != Integer.MIN_VALUE)) {
                            iMax = Math.max(y61Var.O(dv1.F), Math.max(i14, i15));
                            iO = (iMax - jm1VarE7.f) / 2;
                            if (jm1VarE5 == null || (iF0 = jm1VarE5.f0(on0Var)) == Integer.MIN_VALUE) {
                                i = 0;
                            } else {
                                i = (iF1 + iO) - iF0;
                            }
                        } else {
                            iO = y61Var.O(30.0f) - iF1;
                            iMax = Math.max(y61Var.O(dv1.G), jm1VarE7.f + iO);
                            if (jm1VarE5 != null) {
                                i = (iMax - jm1VarE5.f) / 2;
                            } else {
                                i = 0;
                            }
                        }
                        final int i18 = i;
                        final int i19 = iO;
                        final int i20 = jm1VarE6 != null ? (iMax - jm1VarE6.f) / 2 : 0;
                        final jm1 jm1Var = jm1VarE5;
                        final jm1 jm1Var2 = jm1VarE6;
                        return y61Var.d0(iMin, iMax, db0Var, new ej0() { // from class: b62
                            @Override // defpackage.ej0
                            public final Object h(Object obj3) {
                                im1 im1Var = (im1) obj3;
                                im1.k(im1Var, jm1VarE7, 0, i19);
                                jm1 jm1Var3 = jm1Var2;
                                if (jm1Var3 != null) {
                                    im1.k(im1Var, jm1Var3, i16, i20);
                                }
                                jm1 jm1Var4 = jm1Var;
                                if (jm1Var4 != null) {
                                    im1.k(im1Var, jm1Var4, i17, i18);
                                }
                                return ll2.a;
                            }
                        });
                    }
                    i13++;
                    j2 = j2;
                    i10 = i14;
                    iO2 = iO2;
                    jm1VarE5 = jm1VarE5;
                    i12 = i12;
                }
                c31.b("Collection contains no element matching the predicate.");
                qj.e();
                return null;
        }
    }
}

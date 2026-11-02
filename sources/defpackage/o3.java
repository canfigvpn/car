package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements w61 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public o3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void a(ArrayList arrayList, es1 es1Var, y61 y61Var, float f, ArrayList arrayList2, ArrayList arrayList3, es1 es1Var2, ArrayList arrayList4, es1 es1Var3, es1 es1Var4) {
        if (!arrayList.isEmpty()) {
            es1Var.e = y61Var.O(f) + es1Var.e;
        }
        arrayList.add(0, vq.h0(arrayList2));
        arrayList3.add(Integer.valueOf(es1Var2.e));
        arrayList4.add(Integer.valueOf(es1Var.e));
        es1Var.e += es1Var2.e;
        es1Var3.e = Math.max(es1Var3.e, es1Var4.e);
        arrayList2.clear();
        es1Var4.e = 0;
        es1Var2.e = 0;
    }

    @Override // defpackage.w61
    public final x61 g(final y61 y61Var, List list, long j) {
        jm1 jm1Var;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        es1 es1Var = new es1();
        es1 es1Var2 = new es1();
        ArrayList arrayList4 = new ArrayList();
        es1 es1Var3 = new es1();
        es1 es1Var4 = new es1();
        int size = list.size();
        int i = 0;
        while (i < size) {
            jm1 jm1VarE = ((r61) list.get(i)).e(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i2 = size;
            float f = this.a;
            if (zIsEmpty) {
                jm1Var = jm1VarE;
            } else {
                ArrayList arrayList5 = arrayList;
                es1 es1Var5 = es1Var2;
                if (y61Var.O(f) + es1Var3.e + jm1VarE.e <= sw.h(j)) {
                    arrayList = arrayList5;
                    es1Var2 = es1Var5;
                    jm1Var = jm1VarE;
                } else {
                    es1Var2 = es1Var5;
                    jm1Var = jm1VarE;
                    arrayList = arrayList5;
                    a(arrayList, es1Var2, y61Var, this.b, arrayList4, arrayList2, es1Var4, arrayList3, es1Var, es1Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                es1Var3.e = y61Var.O(f) + es1Var3.e;
            }
            arrayList4.add(jm1Var);
            es1Var3.e += jm1Var.e;
            es1Var4.e = Math.max(es1Var4.e, jm1Var.f);
            i++;
            size = i2;
        }
        if (!arrayList4.isEmpty()) {
            a(arrayList, es1Var2, y61Var, this.b, arrayList4, arrayList2, es1Var4, arrayList3, es1Var, es1Var3);
        }
        final int iMax = Math.max(es1Var.e, sw.j(j));
        int iMax2 = Math.max(es1Var2.e, sw.i(j));
        final float f2 = this.a;
        return y61Var.d0(iMax, iMax2, db0.e, new ej0() { // from class: n3
            @Override // defpackage.ej0
            public final Object h(Object obj) {
                y61 y61Var2;
                im1 im1Var = (im1) obj;
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    List list2 = (List) arrayList6.get(i3);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i4 = 0;
                    while (true) {
                        y61Var2 = y61Var;
                        if (i4 >= size3) {
                            break;
                        }
                        iArr[i4] = ((jm1) list2.get(i4)).e + (i4 < list2.size() + (-1) ? y61Var2.O(f2) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size3];
                    if (y61Var2.getLayoutDirection() == kw0.e) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = iMax - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size3) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size3 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size4 = list2.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        im1Var.h((jm1) list2.get(i14), iArr2[i14], ((Number) arrayList3.get(i3)).intValue(), 0.0f);
                    }
                }
                return ll2.a;
            }
        });
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 {
    public final ez a;
    public final g82 b;
    public ia c;
    public Integer d;

    public jz1(ez ezVar, g82 g82Var) {
        this.a = ezVar;
        this.b = g82Var;
    }

    public final x61 a(y61 y61Var, ArrayList arrayList, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        List list = (List) arrayList.get(0);
        int i = 1;
        List list2 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((r61) list.get(i2)).e(j));
        }
        if (!arrayList2.isEmpty()) {
            obj = arrayList2.get(0);
            int i3 = ((jm1) obj).e;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i4);
                    int i5 = ((jm1) obj4).e;
                    if (i3 < i5) {
                        obj = obj4;
                        i3 = i5;
                    }
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            obj = null;
        }
        jm1 jm1Var = (jm1) obj;
        int i6 = jm1Var != null ? jm1Var.e : 0;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            arrayList3.add(((r61) list2.get(i7)).e(j));
        }
        if (!arrayList3.isEmpty()) {
            obj2 = arrayList3.get(0);
            int i8 = ((jm1) obj2).e;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i9 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i9);
                    int i10 = ((jm1) obj5).e;
                    if (i8 < i10) {
                        obj2 = obj5;
                        i8 = i10;
                    }
                    if (i9 == size4) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            obj2 = null;
        }
        jm1 jm1Var2 = (jm1) obj2;
        Integer numValueOf = jm1Var2 != null ? Integer.valueOf(jm1Var2.e) : null;
        if (!arrayList3.isEmpty()) {
            obj3 = arrayList3.get(0);
            int i11 = ((jm1) obj3).f;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i);
                    int i12 = ((jm1) obj6).f;
                    if (i11 < i12) {
                        obj3 = obj6;
                        i11 = i12;
                    }
                    if (i == size5) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            obj3 = null;
        }
        jm1 jm1Var3 = (jm1) obj3;
        int i13 = jm1Var3 != null ? jm1Var3.f : 0;
        float f = kz1.c;
        int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + y61Var.O(8.0f) + Math.max(y61Var.O(f), i6);
        int i14 = i6 == 0 ? (-(y61Var.O(8.0f) + y61Var.O(f))) / 2 : 0;
        Integer num = this.d;
        if (num == null) {
            this.d = Integer.valueOf(i14);
        } else {
            ia iaVar = this.c;
            if (iaVar == null) {
                iaVar = new ia(num, ir2.W, null, 12);
                this.c = iaVar;
            }
            if (((Number) iaVar.e.getValue()).intValue() != i14) {
                nj2.y(this.a, null, new n01(iaVar, i14, this, null), 3);
            }
        }
        return y61Var.d0(iIntValue, i13, db0.e, new yj(arrayList2, y61Var, this, i14, arrayList3, i13));
    }
}

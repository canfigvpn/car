package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b12 {
    public static final Comparator[] a;
    public static final x02 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new a12(new a12(i == 0 ? dg0.e : dg0.c));
            i++;
        }
        a = comparatorArr;
        b = x02.h;
    }

    public static final void a(p02 p02Var, ArrayList arrayList, y3 y3Var, y3 y3Var2, d91 d91Var) {
        i02 i02Var = p02Var.d;
        Object objG = i02Var.e.g(u02.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) y3Var2.h(p02Var)).booleanValue()) && ((Boolean) y3Var.h(p02Var)).booleanValue()) {
            arrayList.add(p02Var);
        }
        if (zBooleanValue) {
            d91Var.h(p02Var.f, b(p02Var, y3Var, y3Var2, p02.j(7, p02Var)));
            return;
        }
        List listJ = p02.j(7, p02Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((p02) listJ.get(i), arrayList, y3Var, y3Var2, d91Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(p02 p02Var, y3 y3Var, y3 y3Var2, List list) {
        int i;
        d91 d91Var = hr0.a;
        d91 d91Var2 = new d91();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((p02) list.get(i2), arrayList, y3Var, y3Var2, d91Var2);
        }
        int i3 = 1;
        char c = p02Var.c.C == kw0.f ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                p02 p02Var2 = (p02) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new qj1(p02Var2.h(), vs0.w(p02Var2)));
                    break;
                }
                float f = p02Var2.h().b;
                float f2 = p02Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        yr1 yr1Var = (yr1) ((qj1) arrayList2.get(i6)).e;
                        float f3 = yr1Var.b;
                        i = i3;
                        float f4 = yr1Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new qj1(new yr1(Math.max(yr1Var.a, 0.0f), Math.max(yr1Var.b, f), Math.min(yr1Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((qj1) arrayList2.get(i6)).f));
                            ((List) ((qj1) arrayList2.get(i6)).f).add(p02Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new qj1(p02Var2.h(), vs0.w(p02Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        } else {
            i = 1;
        }
        zq.H(arrayList2, dg0.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            qj1 qj1Var = (qj1) arrayList2.get(i8);
            zq.H((List) qj1Var.f, comparator);
            arrayList3.addAll((Collection) qj1Var.f);
        }
        int i9 = i;
        zq.H(arrayList3, new ks(i9, b));
        int size5 = 0;
        while (size5 <= arrayList3.size() - i9) {
            List list2 = (List) d91Var2.b(((p02) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) y3Var2.h(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}

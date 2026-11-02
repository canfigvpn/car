package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ zj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ArrayList arrayList;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                jm1[] jm1VarArr = (jm1[]) obj7;
                List list = (List) obj6;
                y61 y61Var = (y61) obj5;
                es1 es1Var = (es1) obj4;
                es1 es1Var2 = (es1) obj3;
                ak akVar = (ak) obj2;
                im1 im1Var = (im1) obj;
                int length = jm1VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    jm1 jm1Var = jm1VarArr[i3];
                    jm1Var.getClass();
                    xj.d(im1Var, jm1Var, (r61) list.get(i2), y61Var.getLayoutDirection(), es1Var.e, es1Var2.e, akVar.a);
                    i3++;
                    i2++;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj7;
                wm wmVar = (wm) obj6;
                da1 da1Var = (da1) obj5;
                ti0 ti0Var = (ti0) obj3;
                ij0 ij0Var = (ij0) obj2;
                f01 f01Var = (f01) obj;
                f01Var.getClass();
                boolean z = true;
                f01.U(f01Var, null, new gt(new gn(wmVar, da1Var, (da1) obj4, 4), true, 1187241302), 3);
                mi0 mi0Var = ((hn0) da1Var.getValue()).c;
                if (mi0Var != null) {
                    f01.U(f01Var, null, new gt(new in(6, mi0Var, ti0Var), true, 1744503802), 3);
                }
                f01.U(f01Var, null, p61.h, 3);
                if (arrayList2.isEmpty()) {
                    f01.U(f01Var, null, p61.i, 3);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj8 = arrayList2.get(i4);
                        i4++;
                        t22 t22Var = ((ul2) obj8).i;
                        ?? arrayList3 = linkedHashMap.get(t22Var);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(t22Var, arrayList3);
                        }
                        ((List) arrayList3).add(obj8);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        t22 t22Var2 = (t22) entry.getKey();
                        List list2 = (List) entry.getValue();
                        int i5 = 7;
                        int i6 = 2;
                        f01.U(f01Var, "band-" + t22Var2, new gt(new ji0(i5, t22Var2), z, -281065963), 2);
                        list2.getClass();
                        if (list2 instanceof RandomAccess) {
                            int size2 = list2.size();
                            arrayList = new ArrayList((int) ((size2 / 2) + (size2 % 2 == 0 ? 0 : z)));
                            int i7 = 0;
                            while (i7 >= 0 && i7 < size2) {
                                int i8 = size2 - i7;
                                if (i6 <= i8) {
                                    i8 = i6;
                                }
                                ArrayList arrayList4 = new ArrayList(i8);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    arrayList4.add(list2.get(i9 + i7));
                                }
                                arrayList.add(arrayList4);
                                i7 += 2;
                                i6 = 2;
                            }
                        } else {
                            arrayList = new ArrayList();
                            Iterator it = list2.iterator();
                            it.getClass();
                            Iterator itI = !it.hasNext() ? bb0.e : p12.i(new j52(it, null));
                            while (itI.hasNext()) {
                                arrayList.add((List) itI.next());
                            }
                        }
                        z = true;
                        f01Var.V(arrayList.size(), new qi(i5, new n30(13), arrayList), new qk(1 == true ? 1 : 0, arrayList), new gt(new fn0(arrayList, ij0Var, wmVar, da1Var), true, 802480018));
                    }
                }
                break;
        }
        return ll2Var;
    }
}

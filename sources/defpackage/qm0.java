package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qm0 extends wa2 implements kj0 {
    public /* synthetic */ List i;
    public /* synthetic */ List j;
    public /* synthetic */ long k;
    public final /* synthetic */ wm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(wm wmVar, sx sxVar) {
        super(4, sxVar);
        this.l = wmVar;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        qm0 qm0Var = new qm0(this.l, (sx) obj4);
        qm0Var.i = (List) obj;
        qm0Var.j = (List) obj2;
        qm0Var.k = jLongValue;
        return qm0Var.r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        List list = this.i;
        List list2 = this.j;
        long j = this.k;
        ix.Q(obj);
        int iE0 = h61.e0(wq.G(list2, 10));
        if (iE0 < 16) {
            iE0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iE0);
        for (Object obj2 : list2) {
            linkedHashMap.put(new Long(((u22) obj2).a), obj2);
        }
        ArrayList arrayList = new ArrayList(wq.G(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Long(((g22) it.next()).c));
        }
        Set setK0 = vq.k0(arrayList);
        Long l = new Long(j);
        if (!setK0.contains(new Long(l.longValue()))) {
            l = null;
        }
        long jLongValue = l != null ? l.longValue() : 0L;
        long j2 = this.l.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            g22 g22Var = (g22) obj3;
            if (jLongValue == 0 || g22Var.c == jLongValue) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(wq.G(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj4 = arrayList2.get(i);
            i++;
            g22 g22Var2 = (g22) obj4;
            arrayList3.add(new lm0(g22Var2, (u22) linkedHashMap.get(new Long(g22Var2.c))));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list2) {
            if (setK0.contains(new Long(((u22) obj5).a))) {
                arrayList4.add(obj5);
            }
        }
        return new om0(j2, arrayList3, arrayList4, jLongValue, false);
    }
}

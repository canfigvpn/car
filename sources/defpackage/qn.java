package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qn implements qe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ qe0 f;

    public /* synthetic */ qn(qe0 qe0Var, int i) {
        this.e = i;
        this.f = qe0Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0227  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        pn pnVar;
        sn snVar;
        Object ut1Var;
        p51 p51Var;
        l22 l22Var;
        m22 m22Var;
        n22 n22Var;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        qe0 qe0Var = this.f;
        fz fzVar = fz.e;
        int i2 = 1;
        switch (i) {
            case 0:
                if (sxVar instanceof pn) {
                    pnVar = (pn) sxVar;
                    int i3 = pnVar.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pnVar.i = i3 - Integer.MIN_VALUE;
                    } else {
                        pnVar = new pn(this, sxVar);
                    }
                } else {
                    pnVar = new pn(this, sxVar);
                }
                Object obj2 = pnVar.h;
                int i4 = pnVar.i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ix.Q(obj2);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(wq.G(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ei1.I((cn) it.next()));
                }
                pnVar.i = 1;
                return qe0Var.k(arrayList, pnVar) == fzVar ? fzVar : ll2Var;
            case 1:
                if (sxVar instanceof sn) {
                    snVar = (sn) sxVar;
                    int i5 = snVar.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        snVar.i = i5 - Integer.MIN_VALUE;
                    } else {
                        snVar = new sn(this, sxVar);
                    }
                } else {
                    snVar = new sn(this, sxVar);
                }
                Object obj3 = snVar.h;
                int i6 = snVar.i;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ix.Q(obj3);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj3);
                List<sf1> list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(wq.G(list2, 10));
                for (sf1 sf1Var : list2) {
                    sf1Var.getClass();
                    long j = sf1Var.a;
                    long j2 = sf1Var.b;
                    int i7 = sf1Var.c;
                    int i8 = sf1Var.d;
                    try {
                        ut1Var = tf1.valueOf(sf1Var.e);
                    } catch (Throwable th) {
                        ut1Var = new ut1(th);
                    }
                    if (ut1Var instanceof ut1) {
                        ut1Var = tf1.e;
                    }
                    arrayList2.add(new qf1(j, j2, i7, i8, (tf1) ut1Var, sf1Var.f));
                    break;
                }
                snVar.i = 1;
                return qe0Var.k(arrayList2, snVar) == fzVar ? fzVar : ll2Var;
            case 2:
                if (sxVar instanceof p51) {
                    p51Var = (p51) sxVar;
                    int i9 = p51Var.i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        p51Var.i = i9 - Integer.MIN_VALUE;
                    } else {
                        p51Var = new p51(this, sxVar);
                    }
                } else {
                    p51Var = new p51(this, sxVar);
                }
                Object obj4 = p51Var.h;
                int i10 = p51Var.i;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ix.Q(obj4);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj4);
                Boolean bool = Boolean.TRUE;
                p51Var.i = 1;
                return qe0Var.k(bool, p51Var) == fzVar ? fzVar : ll2Var;
            case 3:
                if (sxVar instanceof l22) {
                    l22Var = (l22) sxVar;
                    int i11 = l22Var.i;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        l22Var.i = i11 - Integer.MIN_VALUE;
                    } else {
                        l22Var = new l22(this, sxVar);
                    }
                } else {
                    l22Var = new l22(this, sxVar);
                }
                Object obj5 = l22Var.h;
                int i12 = l22Var.i;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ix.Q(obj5);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj5);
                List list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(wq.G(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(ei1.J((j22) it2.next()));
                }
                l22Var.i = 1;
                return qe0Var.k(arrayList3, l22Var) == fzVar ? fzVar : ll2Var;
            case 4:
                if (sxVar instanceof m22) {
                    m22Var = (m22) sxVar;
                    int i13 = m22Var.i;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        m22Var.i = i13 - Integer.MIN_VALUE;
                    } else {
                        m22Var = new m22(this, sxVar);
                    }
                } else {
                    m22Var = new m22(this, sxVar);
                }
                Object obj6 = m22Var.h;
                int i14 = m22Var.i;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ix.Q(obj6);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj6);
                List<xn> list4 = (List) obj;
                ArrayList arrayList4 = new ArrayList(wq.G(list4, 10));
                for (xn xnVar : list4) {
                    xnVar.getClass();
                    arrayList4.add(new r22(xnVar.a, xnVar.b, xnVar.c, xnVar.d, xnVar.e));
                }
                m22Var.i = 1;
                return qe0Var.k(arrayList4, m22Var) == fzVar ? fzVar : ll2Var;
            default:
                if (sxVar instanceof n22) {
                    n22Var = (n22) sxVar;
                    int i15 = n22Var.i;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        n22Var.i = i15 - Integer.MIN_VALUE;
                    } else {
                        n22Var = new n22(this, sxVar);
                    }
                } else {
                    n22Var = new n22(this, sxVar);
                }
                Object obj7 = n22Var.h;
                int i16 = n22Var.i;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ix.Q(obj7);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj7);
                List<x22> list5 = (List) obj;
                ArrayList arrayList5 = new ArrayList(wq.G(list5, 10));
                for (x22 x22Var : list5) {
                    x22Var.getClass();
                    arrayList5.add(new u22(x22Var.a, x22Var.b, x22Var.c, x22Var.d, x22Var.e, x22Var.f, x22Var.g, x22Var.h));
                    i2 = 1;
                }
                n22Var.i = i2;
                return qe0Var.k(arrayList5, n22Var) == fzVar ? fzVar : ll2Var;
        }
    }
}

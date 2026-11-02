package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 {
    public final iq1 a;
    public final s82 b;
    public final s82 c;
    public boolean d;
    public final jr1 e;
    public final jr1 f;
    public final qd1 g;
    public final /* synthetic */ ic1 h;

    public pb1(ic1 ic1Var, qd1 qd1Var) {
        qd1Var.getClass();
        this.h = ic1Var;
        this.a = new iq1(18);
        s82 s82VarF = j20.f(cb0.e);
        this.b = s82VarF;
        s82 s82VarF2 = j20.f(gb0.e);
        this.c = s82VarF2;
        this.e = new jr1(s82VarF);
        this.f = new jr1(s82VarF2);
        this.g = qd1Var;
    }

    public final void a(kb1 kb1Var) {
        kb1Var.getClass();
        synchronized (this.a) {
            s82 s82Var = this.b;
            s82Var.j(null, vq.Z((Collection) s82Var.getValue(), kb1Var));
        }
    }

    public final kb1 b(zb1 zb1Var, Bundle bundle) {
        rb1 rb1Var = this.h.b;
        rb1Var.getClass();
        return w40.g(rb1Var.a.c, zb1Var, bundle, rb1Var.h(), rb1Var.o);
    }

    public final void c(kb1 kb1Var) {
        sb1 sb1Var;
        bo2 bo2Var;
        kb1Var.getClass();
        rb1 rb1Var = this.h.b;
        s82 s82Var = rb1Var.h;
        String str = kb1Var.j;
        LinkedHashMap linkedHashMap = rb1Var.w;
        boolean zJ = ws0.j(linkedHashMap.get(kb1Var), Boolean.TRUE);
        s82 s82Var2 = this.c;
        Set set = (Set) s82Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(h61.e0(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && ws0.j(obj, kb1Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        s82Var2.j(null, linkedHashSet);
        linkedHashMap.remove(kb1Var);
        le leVar = rb1Var.f;
        if (leVar.contains(kb1Var)) {
            if (this.d) {
                return;
            }
            rb1Var.s();
            s82 s82Var3 = rb1Var.g;
            ArrayList arrayList = new ArrayList(leVar);
            s82Var3.getClass();
            s82Var3.j(null, arrayList);
            ArrayList arrayListP = rb1Var.p();
            s82Var.getClass();
            s82Var.j(null, arrayListP);
            return;
        }
        rb1Var.r(kb1Var);
        if (kb1Var.l.j.h.compareTo(r11.g) >= 0) {
            kb1Var.a(r11.e);
        }
        if (!leVar.isEmpty()) {
            Iterator it = leVar.iterator();
            while (it.hasNext()) {
                if (((kb1) it.next()).j.equals(str)) {
                }
            }
            if (!zJ) {
                bo2Var.a();
            }
        } else if (!zJ && (sb1Var = rb1Var.o) != null && (bo2Var = (bo2) sb1Var.b.remove(str)) != null) {
            bo2Var.a();
        }
        rb1Var.s();
        ArrayList arrayListP2 = rb1Var.p();
        s82Var.getClass();
        s82Var.j(null, arrayListP2);
    }

    public final void d(kb1 kb1Var, boolean z) {
        rb1 rb1Var = this.h.b;
        n1 n1Var = new n1(this, kb1Var, z);
        rb1Var.getClass();
        qd1 qd1VarB = rb1Var.s.b(kb1Var.f.e);
        rb1Var.w.put(kb1Var, Boolean.valueOf(z));
        if (!qd1VarB.equals(this.g)) {
            Object obj = rb1Var.t.get(qd1VarB);
            obj.getClass();
            ((pb1) obj).d(kb1Var, z);
            return;
        }
        e71 e71Var = rb1Var.v;
        if (e71Var != null) {
            e71Var.h(kb1Var);
            n1Var.a();
            return;
        }
        le leVar = rb1Var.f;
        int iIndexOf = leVar.indexOf(kb1Var);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + kb1Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != leVar.g) {
            rb1Var.m(((kb1) leVar.get(i)).f.f.a, true, false);
        }
        rb1.o(rb1Var, kb1Var);
        n1Var.a();
        rb1Var.b.a();
        rb1Var.b();
    }

    public final void e(kb1 kb1Var, boolean z) {
        Object objPrevious;
        s82 s82Var = this.e.e;
        s82 s82Var2 = this.c;
        Iterable iterable = (Iterable) s82Var2.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((kb1) it.next()) == kb1Var) {
                    Iterable iterable2 = (Iterable) s82Var.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((kb1) it2.next()) == kb1Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        s82Var2.j(null, d32.r((Set) s82Var2.getValue(), kb1Var));
        List list = (List) s82Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            kb1 kb1Var2 = (kb1) objPrevious;
            if (!ws0.j(kb1Var2, kb1Var) && ((List) s82Var.getValue()).lastIndexOf(kb1Var2) < ((List) s82Var.getValue()).lastIndexOf(kb1Var)) {
                break;
            }
        }
        kb1 kb1Var3 = (kb1) objPrevious;
        if (kb1Var3 != null) {
            s82Var2.j(null, d32.r((Set) s82Var2.getValue(), kb1Var3));
        }
        d(kb1Var, z);
    }

    public final void f(kb1 kb1Var) {
        kb1Var.getClass();
        rb1 rb1Var = this.h.b;
        rb1Var.getClass();
        qd1 qd1VarB = rb1Var.s.b(kb1Var.f.e);
        if (!qd1VarB.equals(this.g)) {
            Object obj = rb1Var.t.get(qd1VarB);
            if (obj != null) {
                ((pb1) obj).f(kb1Var);
                return;
            } else {
                qj.h(kb1Var.f.e, " should already be created", "NavigatorBackStack for ");
                return;
            }
        }
        ej0 ej0Var = rb1Var.u;
        if (ej0Var != null) {
            ej0Var.h(kb1Var);
            a(kb1Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + kb1Var.f + " outside of the call to navigate(). ");
        }
    }
}

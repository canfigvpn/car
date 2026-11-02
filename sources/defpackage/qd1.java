package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd1 {
    public pb1 a;
    public boolean b;

    public abstract zb1 a();

    public final pb1 b() {
        pb1 pb1Var = this.a;
        if (pb1Var != null) {
            return pb1Var;
        }
        fu1.h("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, sc1 sc1Var) {
        id0 id0Var = new id0(new jd0(new tb2(new cr(0, list), new m(24, this, sc1Var), 1), new yw1(19), 0));
        while (id0Var.hasNext()) {
            b().f((kb1) id0Var.next());
        }
    }

    public void e(kb1 kb1Var, boolean z) {
        List list = (List) b().e.e.getValue();
        if (!list.contains(kb1Var)) {
            qj.s("popBackStack was called with ", kb1Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        kb1 kb1Var2 = null;
        while (f()) {
            kb1Var2 = (kb1) listIterator.previous();
            if (ws0.j(kb1Var2, kb1Var)) {
                break;
            }
        }
        if (kb1Var2 != null) {
            b().d(kb1Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public zb1 c(zb1 zb1Var) {
        return zb1Var;
    }
}

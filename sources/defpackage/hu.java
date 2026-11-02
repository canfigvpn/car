package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@pd1("composable")
public final class hu extends qd1 {
    public final dk1 c = y12.s(Boolean.FALSE);

    @Override // defpackage.qd1
    public final zb1 a() {
        return new gu(this, ot.a);
    }

    @Override // defpackage.qd1
    public final void d(List list, sc1 sc1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kb1 kb1Var = (kb1) it.next();
            pb1 pb1VarB = b();
            s82 s82Var = pb1VarB.e.e;
            kb1Var.getClass();
            s82 s82Var2 = pb1VarB.c;
            Iterable iterable = (Iterable) s82Var2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((kb1) it2.next()) == kb1Var) {
                            Iterable iterable2 = (Iterable) s82Var.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((kb1) it3.next()) == kb1Var) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            kb1 kb1Var2 = (kb1) vq.X((List) s82Var.getValue());
            if (kb1Var2 != null) {
                s82Var2.j(null, d32.r((Set) s82Var2.getValue(), kb1Var2));
            }
            s82Var2.j(null, d32.r((Set) s82Var2.getValue(), kb1Var));
            pb1VarB.f(kb1Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.qd1
    public final void e(kb1 kb1Var, boolean z) {
        b().e(kb1Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(kb1 kb1Var) {
        pb1 pb1VarB = b();
        kb1Var.getClass();
        s82 s82Var = pb1VarB.c;
        s82Var.j(null, d32.r((Set) s82Var.getValue(), kb1Var));
        rb1 rb1Var = pb1VarB.h.b;
        rb1Var.getClass();
        if (rb1Var.f.contains(kb1Var)) {
            kb1Var.a(r11.h);
        } else {
            fu1.h("Cannot transition entry that is not in the back stack");
        }
    }
}

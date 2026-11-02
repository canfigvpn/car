package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o12 extends q12 {
    public static m12 s(Iterator it) {
        it.getClass();
        return new qw(new cr(1, it));
    }

    public static m12 t(Object obj, ej0 ej0Var) {
        return obj == null ? fb0.a : new jd0(new r12(0, obj), ej0Var, 1);
    }

    public static List u(m12 m12Var) {
        Iterator it = m12Var.iterator();
        if (!it.hasNext()) {
            return cb0.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return vs0.u(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

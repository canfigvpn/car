package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@pd1("dialog")
public final class h50 extends qd1 {
    @Override // defpackage.qd1
    public final zb1 a() {
        gt gtVar = st.a;
        return new g50(this);
    }

    @Override // defpackage.qd1
    public final void d(List list, sc1 sc1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((kb1) it.next());
        }
    }

    @Override // defpackage.qd1
    public final void e(kb1 kb1Var, boolean z) {
        b().e(kb1Var, z);
        int iS = vq.S((Iterable) b().f.e.getValue(), kb1Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.e.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            kb1 kb1Var2 = (kb1) obj;
            if (i > iS) {
                b().c(kb1Var2);
            }
            i = i2;
        }
    }
}

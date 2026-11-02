package defpackage;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hg extends un2 {
    public final String b;
    public mo2 c;

    public hg(kw1 kw1Var) {
        Object obj;
        String string = (String) kw1Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            if (string != null) {
                ArrayList arrayList = mw1.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    do {
                        if (i < size) {
                            obj = arrayList.get(i);
                            i++;
                        }
                    } while (!((Class) obj).isInstance(string));
                }
                fu1.f(string.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = mw1.a;
            kw1Var.a.get("SaveableStateHolder_BackStackEntryKey");
            kw1Var.b.l(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = string;
    }

    @Override // defpackage.un2
    public final void d() {
        mo2 mo2Var = this.c;
        if (mo2Var == null) {
            ws0.U("saveableStateHolderRef");
            throw null;
        }
        ew1 ew1Var = (ew1) mo2Var.a.get();
        if (ew1Var != null) {
            ew1Var.c(this.b);
        }
        mo2 mo2Var2 = this.c;
        if (mo2Var2 != null) {
            mo2Var2.a.clear();
        } else {
            ws0.U("saveableStateHolderRef");
            throw null;
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s51 extends p61 {
    public final l2 o0;

    public s51(l2 l2Var) {
        this.o0 = l2Var;
    }

    public final void t0(Object obj) {
        o2 o2Var = this.o0.a;
        if (o2Var == null) {
            fu1.h("Launcher has not been initialized");
            return;
        }
        zs zsVar = o2Var.o0;
        LinkedHashMap linkedHashMap = zsVar.b;
        ArrayList arrayList = zsVar.d;
        String str = o2Var.p0;
        Object obj2 = linkedHashMap.get(str);
        sv0 sv0Var = o2Var.q0;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + sv0Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            zsVar.b(iIntValue, sv0Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}

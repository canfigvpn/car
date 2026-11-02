package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rd1 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(qd1 qd1Var) {
        qd1Var.getClass();
        String strC = ix.C(qd1Var.getClass());
        if (strC.length() <= 0) {
            qj.r("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        qd1 qd1Var2 = (qd1) linkedHashMap.get(strC);
        if (ws0.j(qd1Var2, qd1Var)) {
            return;
        }
        if (qd1Var2 != null && qd1Var2.b) {
            qj.s("Navigator ", qd1Var, " is replacing an already attached ", qd1Var2);
        } else if (qd1Var.b) {
            qj.h(qd1Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final qd1 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            qj.r("navigator name cannot be an empty string");
            return null;
        }
        qd1 qd1Var = (qd1) this.a.get(str);
        if (qd1Var != null) {
            return qd1Var;
        }
        fu1.h(k3.j("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}

package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kw1 {
    public final LinkedHashMap a;
    public final xf b;

    public kw1() {
        this.a = new LinkedHashMap();
        this.b = new xf(db0.e);
    }

    public final Object a(String str) {
        Object value;
        str.getClass();
        xf xfVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) xfVar.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) xfVar.h;
        try {
            s82 s82Var = (s82) linkedHashMap2.get(str);
            if (s82Var != null && (value = s82Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) xfVar.g).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public kw1(x51 x51Var) {
        this.a = new LinkedHashMap();
        this.b = new xf(x51Var);
    }
}

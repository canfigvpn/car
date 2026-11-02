package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dq {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public dq(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            q11 q11Var = (q11) entry.getValue();
            List arrayList = (List) this.a.get(q11Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(q11Var, arrayList);
            }
            arrayList.add((eq) entry.getKey());
        }
    }

    public static void a(List list, y11 y11Var, q11 q11Var, x11 x11Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                eq eqVar = (eq) list.get(size);
                Method method = eqVar.b;
                try {
                    int i = eqVar.a;
                    if (i == 0) {
                        method.invoke(x11Var, null);
                    } else if (i == 1) {
                        method.invoke(x11Var, y11Var);
                    } else if (i == 2) {
                        method.invoke(x11Var, y11Var, q11Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}

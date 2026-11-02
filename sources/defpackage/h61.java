package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h61 extends qx {
    public static Object d0(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int e0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f0(qj1... qj1VarArr) {
        if (qj1VarArr.length <= 0) {
            return db0.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0(qj1VarArr.length));
        for (qj1 qj1Var : qj1VarArr) {
            linkedHashMap.put(qj1Var.e, qj1Var.f);
        }
        return linkedHashMap;
    }

    public static Map g0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return db0.e;
        }
        int i = 0;
        if (size == 1) {
            qj1 qj1Var = (qj1) arrayList.get(0);
            qj1Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(qj1Var.e, qj1Var.f);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            qj1 qj1Var2 = (qj1) obj;
            linkedHashMap.put(qj1Var2.e, qj1Var2.f);
        }
        return linkedHashMap;
    }

    public static Map h0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return db0.e;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}

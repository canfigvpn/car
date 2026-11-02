package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class e51 {
    public final int a;
    public final qp0 b;
    public final w40 c;
    public int d;
    public int e;
    public int f;

    public e51(int i) {
        this.a = i;
        if (i <= 0) {
            qj.r("maxSize <= 0");
            throw null;
        }
        this.b = new qp0(1);
        this.c = new w40(14);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            objPut = this.b.a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.a.isEmpty()) {
                        Set setEntrySet = this.b.a.entrySet();
                        setEntrySet.getClass();
                        Set set = setEntrySet;
                        Object next = null;
                        if (set instanceof List) {
                            List list = (List) set;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        qp0 qp0Var = this.b;
                        key.getClass();
                        qp0Var.a.remove(key);
                        int i2 = this.d;
                        value.getClass();
                        this.d = i2 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final Object c(Object obj) {
        Object objRemove;
        synchronized (this.c) {
            objRemove = this.b.a.remove(obj);
            if (objRemove != null) {
                this.d--;
            }
        }
        return objRemove;
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

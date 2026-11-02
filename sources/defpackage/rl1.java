package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rl1 extends AbstractMap implements Map, hv0 {
    public w40 e = new w40(17);
    public wi2 f;
    public Object g;
    public int h;
    public int i;
    public sl1 j;

    public rl1(sl1 sl1Var) {
        this.f = sl1Var.e;
        this.i = sl1Var.f;
        this.j = sl1Var;
    }

    public final sl1 a() {
        wi2 wi2Var = this.f;
        sl1 sl1Var = this.j;
        if (wi2Var != sl1Var.e) {
            this.e = new w40(17);
            sl1Var = new sl1(this.f, this.i);
        }
        this.j = sl1Var;
        return sl1Var;
    }

    public final boolean b(Object obj) {
        return this.f.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f = wi2.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof tq1) {
            return b((tq1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof cm2) {
            return super.containsValue((cm2) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.g = null;
        wi2 wi2VarN = this.f.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (wi2VarN == null) {
            wi2VarN = wi2.e;
        }
        this.f = wi2VarN;
        return this.g;
    }

    public final void e(int i) {
        this.i = i;
        this.h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new wl1(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof tq1) {
            return (cm2) c((tq1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof tq1) ? obj2 : (cm2) super.getOrDefault((tq1) obj, (cm2) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new wl1(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.g = null;
        this.f = this.f.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        tl1 tl1VarA = null;
        tl1 tl1Var = map instanceof tl1 ? (tl1) map : null;
        if (tl1Var == null) {
            rl1 rl1Var = map instanceof rl1 ? (rl1) map : null;
            if (rl1Var != null) {
                tl1VarA = rl1Var.a();
            }
        } else {
            tl1VarA = tl1Var;
        }
        if (tl1VarA == null) {
            super.putAll(map);
            return;
        }
        l40 l40Var = new l40();
        l40Var.a = 0;
        int i = this.i;
        wi2 wi2Var = this.f;
        wi2 wi2Var2 = tl1VarA.e;
        wi2Var2.getClass();
        this.f = wi2Var.m(wi2Var2, 0, l40Var, this);
        int i2 = (tl1VarA.f + i) - l40Var.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.i;
        wi2 wi2VarO = this.f.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (wi2VarO == null) {
            wi2VarO = wi2.e;
        }
        this.f = wi2VarO;
        return i != this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new z51(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof tq1) {
            return (cm2) d((tq1) obj);
        }
        return null;
    }
}

package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 implements Map, Serializable, hv0 {
    public static final x51 r;
    public Object[] e;
    public Object[] f;
    public int[] g;
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public y51 n;
    public z51 o;
    public y51 p;
    public boolean q;

    static {
        x51 x51Var = new x51(0);
        x51Var.q = true;
        r = x51Var;
    }

    public x51(int i) {
        if (i < 0) {
            qj.r("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.e = objArr;
        this.f = null;
        this.g = iArr;
        this.h = new int[iHighestOneBit];
        this.i = 2;
        this.j = 0;
        this.k = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.i * 2;
            int length = this.h.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.h;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.j;
                    Object[] objArr = this.e;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.j = i6;
                    objArr[i5] = obj;
                    this.g[i5] = i;
                    iArr[i] = i6;
                    this.m++;
                    this.l++;
                    if (i3 > this.i) {
                        this.i = i3;
                    }
                    return i5;
                }
                if (ws0.j(this.e[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.h.length * 2);
                    break;
                }
                i = i == 0 ? this.h.length - 1 : i - 1;
            }
        }
    }

    public final x51 b() {
        c();
        this.q = true;
        if (this.m > 0) {
            return this;
        }
        x51 x51Var = r;
        x51Var.getClass();
        return x51Var;
    }

    public final void c() {
        if (this.q) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.j - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.h[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ux.F(this.e, 0, this.j);
        Object[] objArr = this.f;
        if (objArr != null) {
            ux.F(objArr, 0, this.j);
        }
        this.m = 0;
        this.j = 0;
        this.l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.g;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.e;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.h[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ux.F(this.e, i3, i);
        if (objArr != null) {
            ux.F(objArr, i3, this.j);
        }
        this.j = i3;
    }

    public final boolean e(Collection collection) {
        boolean zJ;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zJ = false;
                    } else {
                        Object[] objArr = this.f;
                        objArr.getClass();
                        zJ = ws0.j(objArr[iG], entry.getValue());
                    }
                    if (!zJ) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        y51 y51Var = this.p;
        if (y51Var != null) {
            return y51Var;
        }
        y51 y51Var2 = new y51(this, 0);
        this.p = y51Var2;
        return y51Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.m == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int i2 = this.j;
        int i3 = length - i2;
        int i4 = i2 - this.m;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.e = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f;
            this.f = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.g = Arrays.copyOf(this.g, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.h.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.i;
        while (true) {
            int i3 = this.h[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (ws0.j(this.e[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.h.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.j;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.g[i] >= 0) {
                Object[] objArr = this.f;
                objArr.getClass();
                if (ws0.j(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        u51 u51Var = new u51(this, 0);
        int i = 0;
        while (u51Var.hasNext()) {
            int i2 = u51Var.e;
            x51 x51Var = (x51) u51Var.h;
            if (i2 >= x51Var.j) {
                qj.t();
                return 0;
            }
            u51Var.e = i2 + 1;
            u51Var.f = i2;
            Object obj = x51Var.e[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = x51Var.f;
            objArr.getClass();
            Object obj2 = objArr[u51Var.f];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            u51Var.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m == 0;
    }

    public final void j(int i) {
        int[] iArr;
        this.l++;
        int i2 = 0;
        if (this.j > this.m) {
            d(false);
        }
        this.h = new int[i];
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.j) {
            int i3 = i2 + 1;
            int i4 = i(this.e[i2]);
            int i5 = this.i;
            while (true) {
                iArr = this.h;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    fu1.h("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
            iArr[i4] = i3;
            this.g[i2] = i4;
            i2 = i3;
        }
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.e;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.f;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.g[i];
        loop0: while (true) {
            int i5 = length;
            int i6 = 0;
            do {
                length = length == 0 ? this.h.length - 1 : length - 1;
                int[] iArr2 = this.h;
                i2 = iArr2[length];
                i6++;
                if (i6 > this.i) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.e[i3]) - length;
                    iArr = this.h;
                }
            } while ((i4 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.g[i3] = i5;
        }
        this.g[i] = -1;
        this.m--;
        this.l++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        y51 y51Var = this.n;
        if (y51Var != null) {
            return y51Var;
        }
        y51 y51Var2 = new y51(this, 1);
        this.n = y51Var2;
        return y51Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f;
        if (objArr == null) {
            int length = this.e.length;
            if (length < 0) {
                qj.r("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f;
            if (objArr == null) {
                int length = this.e.length;
                if (length < 0) {
                    qj.r("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!ws0.j(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m * 3) + 2);
        sb.append("{");
        int i = 0;
        u51 u51Var = new u51(this, 0);
        while (u51Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = u51Var.e;
            x51 x51Var = (x51) u51Var.h;
            if (i2 >= x51Var.j) {
                qj.t();
                return null;
            }
            u51Var.e = i2 + 1;
            u51Var.f = i2;
            Object obj = x51Var.e[i2];
            if (obj == x51Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = x51Var.f;
            objArr.getClass();
            Object obj2 = objArr[u51Var.f];
            if (obj2 == x51Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            u51Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        z51 z51Var = this.o;
        if (z51Var != null) {
            return z51Var;
        }
        z51 z51Var2 = new z51(0, this);
        this.o = z51Var2;
        return z51Var2;
    }

    public x51() {
        this(8);
    }
}

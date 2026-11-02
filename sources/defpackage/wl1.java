package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wl1 extends b0 {
    public final /* synthetic */ int e;
    public final rl1 f;

    public /* synthetic */ wl1(int i, rl1 rl1Var) {
        this.e = i;
        this.f = rl1Var;
    }

    @Override // defpackage.b0
    public final int a() {
        int i = this.e;
        rl1 rl1Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return rl1Var.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.e;
        rl1 rl1Var = this.f;
        switch (i) {
            case 0:
                rl1Var.clear();
                break;
            default:
                rl1Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    rl1 rl1Var = this.f;
                    Object obj2 = rl1Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && rl1Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        rl1 rl1Var = this.f;
        switch (i) {
            case 0:
                return new xl1(rl1Var);
            default:
                xi2[] xi2VarArr = new xi2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    xi2VarArr[i2] = new yi2(1);
                }
                return new yl1(rl1Var, xi2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f.remove(entry.getKey(), entry.getValue());
            default:
                rl1 rl1Var = this.f;
                if (!rl1Var.containsKey(obj)) {
                    return false;
                }
                rl1Var.remove(obj);
                return true;
        }
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bm1 extends m0 implements Set, Collection, fv0 {
    public static final bm1 h;
    public final Object e;
    public final Object f;
    public final tl1 g;

    static {
        q90 q90Var = q90.J;
        h = new bm1(q90Var, q90Var, tl1.g);
    }

    public bm1(Object obj, Object obj2, tl1 tl1Var) {
        this.e = obj;
        this.f = obj2;
        this.g = tl1Var;
    }

    @Override // defpackage.n
    public final int a() {
        return this.g.f;
    }

    @Override // defpackage.n, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new nk0(this.e, this.g);
    }
}

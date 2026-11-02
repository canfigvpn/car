package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends y {
    public abstract d0 b(int i, Object obj);

    public abstract d0 c(Object obj);

    @Override // defpackage.n, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.n, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public d0 d(Collection collection) {
        dm1 dm1VarE = e();
        dm1VarE.addAll(collection);
        return dm1VarE.c();
    }

    public abstract dm1 e();

    public abstract d0 f(c0 c0Var);

    public abstract d0 g(int i);

    public abstract d0 h(int i, Object obj);

    @Override // defpackage.y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.y, java.util.List
    public final List subList(int i, int i2) {
        return new qo0(this, i, i2);
    }
}

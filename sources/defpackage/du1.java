package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 extends y {
    public final List e;

    public du1(List list) {
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.n
    public final int a() {
        return this.e.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= vs0.o(this)) {
            return this.e.get(vs0.o(this) - i);
        }
        StringBuilder sbM = k3.m(i, "Element index ", " must be in range [");
        sbM.append(new lr0(0, vs0.o(this), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    @Override // defpackage.y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new cu1(this, 0);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator() {
        return new cu1(this, 0);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator(int i) {
        return new cu1(this, i);
    }
}

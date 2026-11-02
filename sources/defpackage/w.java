package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v implements ListIterator {
    public final /* synthetic */ y h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, int i) {
        super(0, yVar);
        this.h = yVar;
        int iA = yVar.a();
        if (i < 0 || i > iA) {
            qj.j(k3.h(i, iA, "index: ", ", size: "));
            throw null;
        }
        this.f = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            qj.t();
            return null;
        }
        int i = this.f - 1;
        this.f = i;
        return this.h.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

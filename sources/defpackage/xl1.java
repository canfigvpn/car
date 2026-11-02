package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xl1 implements Iterator, fv0 {
    public final /* synthetic */ int e = 1;
    public final Iterator f;

    public xl1(rl1 rl1Var) {
        xi2[] xi2VarArr = new xi2[8];
        for (int i = 0; i < 8; i++) {
            xi2VarArr[i] = new zi2(this);
        }
        this.f = new vl1(rl1Var, xi2VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((vl1) this.f).g;
            default:
                return this.f.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return (Map.Entry) ((vl1) this.f).next();
            default:
                return (km2) this.f.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((vl1) this.f).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xl1(im2 im2Var) {
        this.f = im2Var.n.iterator();
    }
}

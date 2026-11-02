package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oe implements Iterator, fv0 {
    public int e;
    public int f;
    public boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oe(se seVar, int i) {
        this(seVar.g);
        this.h = i;
        switch (i) {
            case 1:
                this.i = seVar;
                this(seVar.g);
                break;
            default:
                this.i = seVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            qj.t();
            return null;
        }
        int i = this.f;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                objE = ((se) obj).e(i);
                break;
            case 1:
                objE = ((se) obj).h(i);
                break;
            default:
                objE = ((ue) obj).f[i];
                break;
        }
        this.f++;
        this.g = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            fu1.h("Call next() before removing an element.");
            return;
        }
        int i = this.f - 1;
        this.f = i;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((se) obj).f(i);
                break;
            case 1:
                ((se) obj).f(i);
                break;
            default:
                ((ue) obj).a(i);
                break;
        }
        this.e--;
        this.g = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oe(ue ueVar) {
        this(ueVar.g);
        this.h = 2;
        this.i = ueVar;
    }

    public oe(int i) {
        this.e = i;
    }
}

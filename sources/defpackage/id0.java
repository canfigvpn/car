package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class id0 implements Iterator, fv0 {
    public final Iterator f;
    public Object h;
    public final /* synthetic */ m12 i;
    public final /* synthetic */ int e = 0;
    public int g = -1;

    public id0(jd0 jd0Var) {
        this.i = jd0Var;
        this.f = new ci2((tb2) jd0Var.b);
    }

    public void a() {
        Object next;
        jd0 jd0Var = (jd0) this.i;
        do {
            Iterator it = this.f;
            if (!it.hasNext()) {
                this.g = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((yw1) jd0Var.c).h(next)).booleanValue());
        this.h = next;
        this.g = 1;
    }

    public void b() {
        Iterator it = this.f;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((tb2) this.i).c.h(next)).booleanValue()) {
                this.g = 1;
                this.h = next;
                return;
            }
        }
        this.g = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.g == -1) {
                    a();
                }
                return this.g == 1;
            default:
                if (this.g == -1) {
                    b();
                }
                return this.g == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.g == -1) {
                    a();
                }
                if (this.g == 0) {
                    qj.t();
                    return null;
                }
                Object obj = this.h;
                this.h = null;
                this.g = -1;
                return obj;
            default:
                if (this.g == -1) {
                    b();
                }
                if (this.g == 0) {
                    qj.t();
                    return null;
                }
                Object obj2 = this.h;
                this.h = null;
                this.g = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public id0(tb2 tb2Var) {
        this.i = tb2Var;
        this.f = tb2Var.b.iterator();
    }
}

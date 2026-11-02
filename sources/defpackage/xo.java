package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xo extends gz1 {
    public final zk g;
    public final /* synthetic */ AtomicReferenceArray h;

    public xo(long j, xo xoVar, zk zkVar, int i) {
        super(j, xoVar, i);
        this.g = zkVar;
        this.h = new AtomicReferenceArray(bl.b * 2);
    }

    @Override // defpackage.gz1
    public final int f() {
        return bl.b;
    }

    @Override // defpackage.gz1
    public final void g(int i, uy uyVar) {
        zk zkVar;
        int i2 = bl.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof jo2;
            zkVar = this.g;
            if (z2 || (objK instanceof ko2)) {
                if (j(i, objK, z ? bl.j : bl.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        zkVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objK == bl.j || objK == bl.k) {
                    break;
                }
                if (objK != bl.g && objK != bl.f) {
                    if (objK == bl.i || objK == bl.d || objK == bl.l) {
                        return;
                    }
                    qj.i(objK, "unexpected state: ");
                    return;
                }
            }
        }
        m(i, null);
        if (z) {
            zkVar.getClass();
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            zk zkVar = this.g;
            zkVar.getClass();
            zkVar.L((this.d * ((long) bl.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}

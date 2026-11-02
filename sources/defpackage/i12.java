package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i12 extends gz1 {
    public final /* synthetic */ AtomicReferenceArray g;

    public i12(long j, i12 i12Var, int i) {
        super(j, i12Var, i);
        this.g = new AtomicReferenceArray(h12.f);
    }

    @Override // defpackage.gz1
    public final int f() {
        return h12.f;
    }

    @Override // defpackage.gz1
    public final void g(int i, uy uyVar) {
        this.g.set(i, h12.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}

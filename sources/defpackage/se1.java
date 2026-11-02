package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class se1 extends t implements ot0 {
    public static final se1 f = new se1(q90.P);

    @Override // defpackage.ot0
    public final Object A(tx txVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.ot0
    public final e60 B(boolean z, boolean z2, f fVar) {
        return te1.e;
    }

    @Override // defpackage.ot0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ot0
    public final hp j(vt0 vt0Var) {
        return te1.e;
    }

    @Override // defpackage.ot0
    public final CancellationException r() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.ot0
    public final boolean start() {
        return false;
    }

    @Override // defpackage.ot0
    public final e60 t(ej0 ej0Var) {
        return te1.e;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.ot0, defpackage.lo
    public final void d(CancellationException cancellationException) {
    }
}

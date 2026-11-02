package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 extends ba1 {
    @Override // defpackage.ba1
    public final ba1 C(ej0 ej0Var, ej0 ej0Var2) {
        return (ba1) ((o62) x62.b(new w62(new qi(4, ej0Var, ej0Var2), 0)));
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void c() {
        synchronized (x62.c) {
            o();
        }
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void k() {
        c22.s();
        throw null;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void l() {
        c22.s();
        throw null;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void m() {
        x62.c();
    }

    @Override // defpackage.ba1, defpackage.o62
    public final o62 u(ej0 ej0Var) {
        int i = 0;
        return (ir1) ((o62) x62.b(new w62(new sk0(ej0Var, i), i)));
    }

    @Override // defpackage.ba1
    public final j12 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}

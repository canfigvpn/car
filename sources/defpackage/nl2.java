package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 extends xy {
    public static final nl2 g = new nl2();

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        j30.h.g.d(runnable, true, false);
    }

    @Override // defpackage.xy
    public final void F(uy uyVar, Runnable runnable) {
        j30.h.g.d(runnable, true, true);
    }

    @Override // defpackage.xy
    public final xy H(int i) {
        qx.p(i);
        return i >= fc2.d ? this : super.H(i);
    }

    @Override // defpackage.xy
    public final String toString() {
        return "Dispatchers.IO";
    }
}

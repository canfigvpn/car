package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j30 extends ic0 {
    public static final j30 h;
    public dz g;

    static {
        int i = fc2.c;
        int i2 = fc2.d;
        long j = fc2.e;
        String str = fc2.a;
        j30 j30Var = new j30();
        j30Var.g = new dz(i, i2, j, str);
        h = j30Var;
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        dz.h(this.g, runnable, 6);
    }

    @Override // defpackage.xy
    public final void F(uy uyVar, Runnable runnable) {
        dz.h(this.g, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.xy
    public final String toString() {
        return "Dispatchers.Default";
    }
}

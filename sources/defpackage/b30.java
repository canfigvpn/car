package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends ic0 implements Executor {
    public static final b30 g = new b30();
    public static final xy h;

    static {
        nl2 nl2Var = nl2.g;
        int i = nb2.a;
        if (64 >= i) {
            i = 64;
        }
        h = nl2Var.H(j12.o(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        h.E(uyVar, runnable);
    }

    @Override // defpackage.xy
    public final void F(uy uyVar, Runnable runnable) {
        h.F(uyVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        E(ab0.e, runnable);
    }

    @Override // defpackage.xy
    public final String toString() {
        return "Dispatchers.IO";
    }
}

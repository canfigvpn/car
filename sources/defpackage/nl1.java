package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 {
    public final qv a;
    public final lv b;
    public final ak0 c;
    public final ij0 d;
    public final boolean e;
    public final gl2 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(pl1.g);
    public long i = y12.d();
    public x91 j;
    public final rs1 k;
    public final sr1 l;

    public nl1(qv qvVar, lv lvVar, ak0 ak0Var, z91 z91Var, ij0 ij0Var, boolean z, gl2 gl2Var, Object obj) {
        this.a = qvVar;
        this.b = lvVar;
        this.c = ak0Var;
        this.d = ij0Var;
        this.e = z;
        this.f = gl2Var;
        this.g = obj;
        x91 x91Var = kx1.a;
        x91Var.getClass();
        this.j = x91Var;
        rs1 rs1Var = new rs1(0);
        rs1Var.i(z91Var, ak0Var.z());
        this.k = rs1Var;
        this.l = new sr1(gl2Var.g);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((pl1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    pl1 pl1Var = pl1.j;
                    pl1 pl1Var2 = pl1.k;
                    while (!atomicReference.compareAndSet(pl1Var, pl1Var2)) {
                        if (atomicReference.get() != pl1Var) {
                            cp1.b("Unexpected state change from: " + pl1Var + " to: " + pl1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new ps();
            }
        } catch (Exception e) {
            atomicReference.set(pl1.e);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                    this.k.c();
                    this.a.u = null;
                } catch (Throwable th) {
                    this.k.c();
                    this.a.u = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((pl1) this.h.get()).compareTo(pl1.j) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        pl1 pl1Var;
        pl1 pl1Var2;
        do {
            atomicReference = this.h;
            pl1Var = pl1.h;
            pl1Var2 = pl1.j;
            if (atomicReference.compareAndSet(pl1Var, pl1Var2)) {
                return;
            }
        } while (atomicReference.get() == pl1Var);
        cp1.b("Unexpected state change from: " + pl1Var + " to: " + pl1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0127 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:25:0x007b->B:82:?, LOOP_END, SYNTHETIC] */
    public final boolean e(v42 v42Var) throws Exception {
        long j;
        pl1 pl1Var = pl1.i;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((pl1) atomicReference.get()).ordinal();
            pl1 pl1Var2 = pl1.h;
            qv qvVar = this.a;
            lv lvVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    ak0 ak0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        ak0Var.z = 0;
                        ak0Var.y = true;
                    }
                    try {
                        this.j = lvVar.b(qvVar, v42Var, this.d);
                        if (z) {
                            ak0Var.s();
                        }
                        pl1 pl1Var3 = pl1.g;
                        while (!atomicReference.compareAndSet(pl1Var3, pl1Var2)) {
                            if (atomicReference.get() != pl1Var3) {
                                cp1.b("Unexpected state change from: " + pl1Var3 + " to: " + pl1Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z) {
                            ak0Var.s();
                        }
                        throw th;
                    }
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(pl1Var2, pl1Var)) {
                            if (atomicReference.get() != pl1Var2) {
                                cp1.b("Unexpected state change from: " + pl1Var2 + " to: " + pl1Var + '.');
                                j = this.i;
                                this.i = y12.d();
                                this.j = lvVar.n(qvVar, v42Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(pl1Var, pl1Var2)) {
                                    if (atomicReference.get() != pl1Var) {
                                        cp1.b("Unexpected state change from: " + pl1Var + " to: " + pl1Var2 + '.');
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = y12.d();
                        this.j = lvVar.n(qvVar, v42Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(pl1Var, pl1Var2)) {
                            if (atomicReference.get() != pl1Var) {
                                cp1.b("Unexpected state change from: " + pl1Var + " to: " + pl1Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(pl1Var, pl1Var2)) {
                            if (atomicReference.get() != pl1Var) {
                                cp1.b("Unexpected state change from: " + pl1Var + " to: " + pl1Var2 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.i;
                case 4:
                    hv.b("Recursive call to resume()");
                    throw new ps();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new ps();
            }
        } catch (Exception e) {
            atomicReference.set(pl1.e);
            throw e;
        }
    }
}

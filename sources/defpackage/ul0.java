package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 extends xy implements z30 {
    public final Handler g;
    public final String h;
    public final boolean i;
    public final ul0 j;

    public ul0(Handler handler, String str, boolean z) {
        this.g = handler;
        this.h = str;
        this.i = z;
        this.j = z ? this : new ul0(handler, str, true);
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        if (this.g.post(runnable)) {
            return;
        }
        I(uyVar, runnable);
    }

    @Override // defpackage.xy
    public final boolean G(uy uyVar) {
        return (this.i && ws0.j(Looper.myLooper(), this.g.getLooper())) ? false : true;
    }

    public final void I(uy uyVar, Runnable runnable) {
        mx.p(uyVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        j30 j30Var = u50.a;
        b30.g.E(uyVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ul0)) {
            return false;
        }
        ul0 ul0Var = (ul0) obj;
        return ul0Var.g == this.g && ul0Var.i == this.i;
    }

    @Override // defpackage.z30
    public final void h(long j, om omVar) {
        hm hmVar = new hm(1, omVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(hmVar, j)) {
            omVar.x(new d(17, this, hmVar));
        } else {
            I(omVar.i, hmVar);
        }
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.g);
    }

    @Override // defpackage.z30
    public final e60 n(long j, final Runnable runnable, uy uyVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(runnable, j)) {
            return new e60() { // from class: tl0
                @Override // defpackage.e60
                public final void a() {
                    this.e.g.removeCallbacks(runnable);
                }
            };
        }
        I(uyVar, runnable);
        return te1.e;
    }

    @Override // defpackage.xy
    public final String toString() {
        ul0 ul0Var;
        String str;
        j30 j30Var = u50.a;
        ul0 ul0Var2 = o51.a;
        if (this == ul0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ul0Var = ul0Var2.j;
            } catch (UnsupportedOperationException unused) {
                ul0Var = null;
            }
            str = this == ul0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.h;
        if (string == null) {
            string = this.g.toString();
        }
        if (!this.i) {
            return string;
        }
        return string + ".immediate";
    }

    public ul0(Handler handler) {
        this(handler, null, false);
    }
}

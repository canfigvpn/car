package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends xy {
    public static final hb2 q = new hb2(t5.p);
    public static final w9 r = new w9(0);
    public final Choreographer g;
    public final Handler h;
    public boolean m;
    public boolean n;
    public final aa p;
    public final Object i = new Object();
    public final le j = new le();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public final x9 o = new x9(this);

    public y9(Choreographer choreographer, Handler handler) {
        this.g = choreographer;
        this.h = handler;
        this.p = new aa(choreographer, this);
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        synchronized (this.i) {
            this.j.addLast(runnable);
            if (!this.m) {
                this.m = true;
                this.h.post(this.o);
                if (!this.n) {
                    this.n = true;
                    this.g.postFrameCallback(this.o);
                }
            }
        }
    }

    public final void I() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.i) {
                le leVar = this.j;
                runnable = (Runnable) (leVar.isEmpty() ? null : leVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.i) {
                    le leVar2 = this.j;
                    runnable = (Runnable) (leVar2.isEmpty() ? null : leVar2.removeFirst());
                }
            }
            synchronized (this.i) {
                if (this.j.isEmpty()) {
                    z = false;
                    this.m = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}

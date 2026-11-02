package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ y9 e;

    public x9(y9 y9Var) {
        this.e = y9Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.h.removeCallbacks(this);
        this.e.I();
        y9 y9Var = this.e;
        synchronized (y9Var.i) {
            if (y9Var.n) {
                y9Var.n = false;
                ArrayList arrayList = y9Var.k;
                y9Var.k = y9Var.l;
                y9Var.l = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.I();
        y9 y9Var = this.e;
        synchronized (y9Var.i) {
            if (y9Var.k.isEmpty()) {
                y9Var.g.removeFrameCallback(this);
                y9Var.n = false;
            }
        }
    }
}

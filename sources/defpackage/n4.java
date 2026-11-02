package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ e5 f;

    public /* synthetic */ n4(e5 e5Var, int i) {
        this.e = i;
        this.f = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        e5 e5Var = this.f;
        switch (i) {
            case 0:
                le leVar = e5Var.m;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!leVar.isEmpty()) {
                    try {
                        ((ti0) leVar.removeLast()).a();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                e5Var.H0 = false;
                MotionEvent motionEvent = e5Var.z0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    e5Var.H(motionEvent);
                    return;
                } else {
                    fu1.h("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                e5.n(e5Var.getRoot());
                return;
            default:
                e5.n(e5Var.getRoot());
                return;
        }
    }
}

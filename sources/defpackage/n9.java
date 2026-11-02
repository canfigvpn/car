package defpackage;

import android.view.ActionMode;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ n9(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                p9 p9Var = (p9) this.f;
                l9 l9Var = (l9) this.g;
                m9 m9Var = (m9) this.h;
                ActionMode actionModeStartActionMode = p9Var.a.startActionMode(new oe0(l9Var), 1);
                ws0.j(p9Var.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    m9Var.close();
                    return;
                }
                return;
            default:
                b7 b7Var = (b7) this.f;
                vv vvVar = (vv) this.g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.h;
                try {
                    vg0 vg0VarL = ei1.l(b7Var.a);
                    if (vg0VarL == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ug0 ug0Var = (ug0) ((ba0) vg0VarL.b);
                    synchronized (ug0Var.c) {
                        ug0Var.e = threadPoolExecutor;
                        break;
                    }
                    ((ba0) vg0VarL.b).a(new ea0(vvVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    vvVar.I(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}

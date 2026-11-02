package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf2 implements Executor {
    public final /* synthetic */ Choreographer e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.postFrameCallback(new kq1(runnable));
    }
}

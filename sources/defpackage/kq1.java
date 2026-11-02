package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq1 implements Choreographer.FrameCallback {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new lq1((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

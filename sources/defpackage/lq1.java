package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ lq1(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        int i2 = 1;
        Context context = this.f;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new lq1(context, i2));
                break;
            default:
                nj2.L(context, new ce(1), nj2.z0, false);
                break;
        }
    }
}

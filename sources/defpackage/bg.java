package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bg {
    public final e4 a;
    public final ig1 b;

    public bg(e4 e4Var, ig1 ig1Var) {
        this.a = e4Var;
        this.b = ig1Var;
        if ((e4Var == null ? ig1Var : e4Var) != null) {
            return;
        }
        qj.r("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(u0 u0Var) {
        e4 e4Var = this.a;
        if (e4Var != null) {
            e4.c(e4Var, (zf) u0Var.b);
            return;
        }
        ig1 ig1Var = this.b;
        if (ig1Var == null) {
            fu1.h("Unreachable");
            return;
        }
        ag agVar = (ag) u0Var.a;
        agVar.getClass();
        dg1 dg1Var = new dg1(agVar, new eg1(agVar, null));
        agVar.a.add(dg1Var);
        e4.c(ig1Var.a(), dg1Var);
    }

    public final void b(u0 u0Var) throws Exception {
        boolean zIsTerminated;
        if (this.a != null) {
            ((zf) u0Var.b).e();
            return;
        }
        if (this.b == null) {
            fu1.h("Unreachable");
            return;
        }
        ag agVar = (ag) u0Var.a;
        ArrayList arrayList = agVar.a;
        CopyOnWriteArrayList copyOnWriteArrayList = agVar.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((dg1) obj).e();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }
}

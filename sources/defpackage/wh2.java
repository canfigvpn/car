package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wh2 implements Executor {
    public final Executor e;
    public Runnable g;
    public final ArrayDeque f = new ArrayDeque();
    public final Object h = new Object();

    public wh2(Executor executor) {
        this.e = executor;
    }

    public final void a() {
        synchronized (this.h) {
            Object objPoll = this.f.poll();
            Runnable runnable = (Runnable) objPoll;
            this.g = runnable;
            if (objPoll != null) {
                this.e.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.h) {
            this.f.offer(new w5(4, runnable, this));
            if (this.g == null) {
                a();
            }
        }
    }
}

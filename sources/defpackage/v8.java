package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v8 implements kp1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long l;
    public final View e;
    public boolean g;
    public boolean j;
    public long k;
    public final PriorityQueue f = new PriorityQueue(11, new t8(0));
    public final Choreographer h = Choreographer.getInstance();
    public final u8 i = new u8();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public v8(View view) {
        float refreshRate;
        this.e = view;
        if (l == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            l = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.j = true;
        }
    }

    @Override // defpackage.kp1
    public final void a(jp1 jp1Var) {
        this.f.add(new aq1(1, jp1Var));
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.post(this);
    }

    public final boolean b() {
        u8 u8Var = this.i;
        long jA = u8Var.a();
        nj2.G("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((aq1) objPeek).b.c(u8Var)) {
                priorityQueue.poll();
                z = false;
            }
            u8Var.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.j) {
            this.k = j;
            this.e.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.j = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.e.removeCallbacks(this);
        this.h.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f;
        if (!priorityQueue.isEmpty() && this.g && this.j) {
            View view = this.e;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * l) + nanos;
                u8 u8Var = this.i;
                u8Var.a = z;
                u8Var.b = Math.max(this.k, nanos) + l;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (u8Var.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.h.postFrameCallback(this);
                } else {
                    this.g = false;
                }
                nj2.G("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.g = false;
    }
}

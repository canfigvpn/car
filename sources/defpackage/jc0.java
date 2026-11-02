package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends ic0 implements z30 {
    public final Executor g;

    public jc0(Executor executor) {
        this.g = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.xy
    public final void E(uy uyVar, Runnable runnable) {
        try {
            this.g.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            mx.p(uyVar, cancellationException);
            j30 j30Var = u50.a;
            b30.g.E(uyVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jc0) && ((jc0) obj).g == this.g;
    }

    @Override // defpackage.z30
    public final void h(long j, om omVar) {
        Executor executor = this.g;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            hm hmVar = new hm(4, this, omVar);
            uy uyVar = omVar.i;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(hmVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                mx.p(uyVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            omVar.z(new km(0, scheduledFutureSchedule));
        } else {
            t20.o.h(j, omVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.g);
    }

    @Override // defpackage.z30
    public final e60 n(long j, Runnable runnable, uy uyVar) {
        Executor executor = this.g;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                mx.p(uyVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new d60(scheduledFutureSchedule) : t20.o.n(j, runnable, uyVar);
    }

    @Override // defpackage.xy
    public final String toString() {
        return this.g.toString();
    }
}

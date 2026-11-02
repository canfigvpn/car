package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements e60 {
    public final ScheduledFuture e;

    public d60(ScheduledFuture scheduledFuture) {
        this.e = scheduledFuture;
    }

    @Override // defpackage.e60
    public final void a() {
        this.e.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.e + ']';
    }
}

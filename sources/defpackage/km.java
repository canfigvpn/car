package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class km implements ve1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ km(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ej0) obj).getClass().getSimpleName() + '@' + j20.s(this) + ']';
            default:
                return "DisposeOnCancel[" + ((e60) obj) + ']';
        }
    }
}

package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ys(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.h;
        int i2 = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((zs) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((jq1) ((x40) obj2).c).i(i2, obj);
                break;
        }
    }
}

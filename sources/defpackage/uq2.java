package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uq2 extends ContentObserver {
    public final /* synthetic */ zk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq2(zk zkVar, Handler handler) {
        super(handler);
        this.a = zkVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.c(ll2.a);
    }
}

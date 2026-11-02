package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qm extends os {
    public static final /* synthetic */ long c = we.a.objectFieldOffset(qm.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    public qm(om omVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + omVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}

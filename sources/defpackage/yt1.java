package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 {
    public final HashSet a = new HashSet();

    public final void a() {
        if (v12.a == null) {
            v12.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != v12.a) {
            fu1.h("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            fu1.c();
        }
    }
}

package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ig1 {
    public final Runnable a;
    public final hb2 b = new hb2(new w8(19, this));

    public ig1(Runnable runnable) {
        this.a = runnable;
    }

    public final e4 a() {
        return ((gg1) this.b.getValue()).c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().e(new bg1(onBackInvokedDispatcher, 0), 1);
        a().e(new bg1(onBackInvokedDispatcher, 1000000), 0);
    }
}

package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yd implements lk0 {
    public volatile zz e;
    public final Object f = new Object();
    public final ao2 g;

    public yd(ao2 ao2Var) {
        this.g = ao2Var;
    }

    @Override // defpackage.lk0
    public final Object d() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new zz(new b7((Context) this.g.f, (byte) 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }
}

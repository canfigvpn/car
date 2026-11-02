package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements ia2 {
    public final Context e;
    public final String f;
    public final qs g;
    public final hb2 h;
    public boolean i;

    public ai0(Context context, String str, qs qsVar) {
        qsVar.getClass();
        this.e = context;
        this.f = str;
        this.g = qsVar;
        this.h = new hb2(new w8(10, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h.f != is1.t) {
            ((zh0) this.h.getValue()).close();
        }
    }

    @Override // defpackage.ia2
    public final String getDatabaseName() {
        return this.f;
    }

    @Override // defpackage.ia2
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.h.f != is1.t) {
            ((zh0) this.h.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.i = z;
    }

    @Override // defpackage.ia2
    public final vh0 z() {
        return ((zh0) this.h.getValue()).b(true);
    }
}

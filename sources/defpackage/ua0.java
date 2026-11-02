package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ua0 extends aa0 implements Runnable {
    public final WeakReference e;

    public ua0(oc ocVar) {
        this.e = new WeakReference(ocVar);
    }

    @Override // defpackage.aa0
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.e.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        va0.a((EditText) this.e.get(), 1);
    }
}

package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = uh2.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (ca0.d()) {
                ca0.a().e();
            }
        } finally {
            int i2 = uh2.a;
            Trace.endSection();
        }
    }
}

package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        p91 p91Var = e5.T0;
        synchronized (p91Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = p91Var.a;
                int i2 = p91Var.b;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        e5 e5Var = (e5) objArr[i3];
                        boolean showLayoutBounds = e5Var.getShowLayoutBounds();
                        Class cls = e5.Q0;
                        e5Var.setShowLayoutBounds(j20.t());
                        if (showLayoutBounds != e5Var.getShowLayoutBounds()) {
                            e5Var.post(new n4(e5Var, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        e5 e5Var2 = (e5) objArr[i3];
                        e5Var2.post(new n4(e5Var2, 3));
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

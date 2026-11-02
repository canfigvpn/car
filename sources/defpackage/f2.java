package defpackage;

import android.app.Application;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements lk0 {
    public volatile xz e;
    public final Object f = new Object();
    public final MainActivity g;
    public final x2 h;
    public dv i;

    public f2(MainActivity mainActivity) {
        this.g = mainActivity;
        this.h = new x2(mainActivity);
    }

    public final xz a() {
        String str;
        MainActivity mainActivity = this.g;
        if (mainActivity.getApplication() instanceof lk0) {
            yz yzVar = (yz) ((e2) ux.q(this.h, e2.class));
            return new xz(yzVar.a, yzVar.b);
        }
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    @Override // defpackage.lk0
    public final Object d() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }
}

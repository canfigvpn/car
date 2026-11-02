package ir.alirezaivaz.mygarage;

import android.app.Application;
import defpackage.ao2;
import defpackage.lk0;
import defpackage.ua1;
import defpackage.yd;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class MyGarageApp extends Application implements lk0 {
    public boolean e = false;
    public final yd f = new yd(new ao2(21, this));

    @Override // defpackage.lk0
    public final Object d() {
        return this.f.d();
    }

    @Override // android.app.Application
    public final void onCreate() {
        if (!this.e) {
            this.e = true;
            ((ua1) this.f.d()).getClass();
        }
        super.onCreate();
    }
}

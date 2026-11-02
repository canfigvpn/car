package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.iq1;
import defpackage.kq1;
import defpackage.pp0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements pp0 {
    @Override // defpackage.pp0
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.pp0
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new kq1(this, context.getApplicationContext()));
        return new iq1(1);
    }
}

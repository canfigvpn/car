package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 extends View {
    public final /* synthetic */ di e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(di diVar, Context context) {
        super(context);
        this.e = diVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.e.run();
    }
}

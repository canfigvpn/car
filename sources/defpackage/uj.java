package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uj implements tj, oq2 {
    public static final uj e = new uj();
    public static final uj f = new uj();

    @Override // defpackage.tj
    public Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.oq2
    public kq2 b(ContextWrapper contextWrapper, n40 n40Var) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f2 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new kq2(bounds, f2);
    }
}

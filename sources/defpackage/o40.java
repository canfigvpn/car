package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o40 implements n40, oq2 {
    public static final o40 e = new o40();
    public static final o40 f = new o40();

    @Override // defpackage.oq2
    public kq2 b(ContextWrapper contextWrapper, n40 n40Var) {
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new kq2(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.n40
    public float f(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}

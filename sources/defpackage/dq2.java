package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class dq2 extends j12 {
    public final WindowInsetsController a;
    public final Window b;

    public dq2(Window window) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // defpackage.j12
    public void l(boolean z) {
        r(16, 16, z);
    }

    @Override // defpackage.j12
    public void m(boolean z) {
        r(8192, 8, z);
    }

    public final void r(int i, int i2, boolean z) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}

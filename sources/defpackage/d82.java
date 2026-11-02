package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d82 extends ru1 {
    public SplashScreenView d;

    @Override // defpackage.ru1
    public final View j() {
        SplashScreenView splashScreenView = this.d;
        if (splashScreenView == null) {
            ws0.U("platformView");
            throw null;
        }
        if (splashScreenView.getIconView() == null) {
            return new View((MainActivity) this.b);
        }
        SplashScreenView splashScreenView2 = this.d;
        if (splashScreenView2 == null) {
            ws0.U("platformView");
            throw null;
        }
        View iconView = splashScreenView2.getIconView();
        iconView.getClass();
        return iconView;
    }

    @Override // defpackage.ru1
    public final ViewGroup l() {
        SplashScreenView splashScreenView = this.d;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        ws0.U("platformView");
        throw null;
    }

    @Override // defpackage.ru1
    public final void p() {
        MainActivity mainActivity = (MainActivity) this.b;
        SplashScreenView splashScreenView = this.d;
        if (splashScreenView == null) {
            ws0.U("platformView");
            throw null;
        }
        splashScreenView.remove();
        if (Build.VERSION.SDK_INT < 33) {
            Resources.Theme theme = mainActivity.getTheme();
            theme.getClass();
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            j12.e(theme, decorView, new TypedValue());
        }
    }

    @Override // defpackage.ru1
    public final void h() {
    }
}

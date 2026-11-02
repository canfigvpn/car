package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import ir.alirezaivaz.mygarage.MainActivity;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 extends x40 {
    public x72 i;
    public boolean j;
    public final a82 k;

    public b82(MainActivity mainActivity) {
        super(mainActivity);
        this.j = true;
        this.k = new a82(this, mainActivity);
    }

    public static boolean m(SplashScreenView splashScreenView) {
        splashScreenView.getClass();
        WindowInsets windowInsetsBuild = jq0.h().build();
        windowInsetsBuild.getClass();
        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
    }

    @Override // defpackage.x40
    public final void d() {
        int i;
        MainActivity mainActivity = (MainActivity) this.b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.k);
        }
    }

    @Override // defpackage.x40
    public final void h(p2 p2Var) {
        this.f = p2Var;
        View viewFindViewById = ((MainActivity) this.b).findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.i);
        }
        x72 x72Var = new x72(this, viewFindViewById, 1);
        this.i = x72Var;
        viewTreeObserver.addOnPreDrawListener(x72Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z72] */
    @Override // defpackage.x40
    public final void i(qj qjVar) {
        ((MainActivity) this.b).getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener(qjVar) { // from class: z72
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                b82 b82Var = this.a;
                MainActivity mainActivity = (MainActivity) b82Var.b;
                splashScreenView.getClass();
                if (Build.VERSION.SDK_INT < 33) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = mainActivity.getTheme();
                    Window window = mainActivity.getWindow();
                    if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                        window.setStatusBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                        window.setNavigationBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                        if (typedValue.data != 0) {
                            window.addFlags(Integer.MIN_VALUE);
                        } else {
                            window.clearFlags(Integer.MIN_VALUE);
                        }
                    }
                    View decorView = window.getDecorView();
                    decorView.getClass();
                    ViewGroup viewGroup = (ViewGroup) decorView;
                    j12.e(theme, viewGroup, typedValue);
                    viewGroup.setOnHierarchyChangeListener(null);
                    window.setDecorFitsSystemWindows(b82Var.j);
                }
                qk1 qk1Var = new qk1(mainActivity);
                ((d82) ((ru1) qk1Var.f)).d = splashScreenView;
                qj.v(qk1Var);
            }
        });
    }
}

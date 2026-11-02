package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fp2 {
    public ep2 a;

    public fp2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new dp2(c1.h(i, interpolator, j));
        } else {
            this.a = new ap2(i, interpolator, j);
        }
    }

    public static void a(View view, vo2 vo2Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(vo2Var != null ? new cp2(vo2Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = ap2.e;
        View.OnApplyWindowInsetsListener zo2Var = vo2Var != null ? new zo2(view, vo2Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, zo2Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(zo2Var);
        }
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import ir.alirezaivaz.mygarage.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ap2 extends ep2 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final dd0 f = new dd0();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(fp2 fp2Var, View view) {
        vo2 vo2VarJ = j(view);
        if (vo2VarJ != null) {
            vo2VarJ.b(fp2Var);
            if (vo2VarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(fp2Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, fp2 fp2Var, aq2 aq2Var, boolean z) {
        vo2 vo2VarJ = j(view);
        if (vo2VarJ != null) {
            vo2VarJ.e = aq2Var;
            if (!z) {
                vo2VarJ.c(fp2Var);
                z = vo2VarJ.f == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), fp2Var, aq2Var, z);
            }
        }
    }

    public static void h(View view, aq2 aq2Var, List list) {
        vo2 vo2VarJ = j(view);
        if (vo2VarJ != null) {
            aq2Var = vo2VarJ.d(aq2Var, list);
            if (vo2VarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), aq2Var, list);
            }
        }
    }

    public static void i(View view, fp2 fp2Var, ru1 ru1Var) {
        vo2 vo2VarJ = j(view);
        if (vo2VarJ != null) {
            vo2VarJ.e(fp2Var, ru1Var);
            if (vo2VarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), fp2Var, ru1Var);
            }
        }
    }

    public static vo2 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof zo2) {
            return ((zo2) tag).a;
        }
        return null;
    }
}

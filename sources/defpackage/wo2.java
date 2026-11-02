package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ fp2 a;
    public final /* synthetic */ aq2 b;
    public final /* synthetic */ aq2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public wo2(fp2 fp2Var, aq2 aq2Var, aq2 aq2Var2, int i, View view) {
        this.a = fp2Var;
        this.b = aq2Var;
        this.c = aq2Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        np2 hp2Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        fp2 fp2Var = this.a;
        ep2 ep2Var = fp2Var.a;
        ep2Var.e(animatedFraction);
        float fC = ep2Var.c();
        PathInterpolator pathInterpolator = ap2.e;
        int i = Build.VERSION.SDK_INT;
        aq2 aq2Var = this.b;
        if (i >= 36) {
            hp2Var = new mp2(aq2Var);
        } else if (i >= 35) {
            hp2Var = new lp2(aq2Var);
        } else if (i >= 34) {
            hp2Var = new kp2(aq2Var);
        } else if (i >= 31) {
            hp2Var = new jp2(aq2Var);
        } else if (i >= 30) {
            hp2Var = new ip2(aq2Var);
        } else {
            hp2Var = i >= 29 ? new hp2(aq2Var) : new gp2(aq2Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            xp2 xp2Var = aq2Var.a;
            if (i3 == 0) {
                hp2Var.d(i2, xp2Var.h(i2));
            } else {
                kq0 kq0VarH = xp2Var.h(i2);
                kq0 kq0VarH2 = this.c.a.h(i2);
                float f = 1.0f - fC;
                hp2Var.d(i2, aq2.a(kq0VarH, (int) (((double) ((kq0VarH.a - kq0VarH2.a) * f)) + 0.5d), (int) (((double) ((kq0VarH.b - kq0VarH2.b) * f)) + 0.5d), (int) (((double) ((kq0VarH.c - kq0VarH2.c) * f)) + 0.5d), (int) (((double) ((kq0VarH.d - kq0VarH2.d) * f)) + 0.5d)));
            }
        }
        ap2.h(this.e, hp2Var.b(), Collections.singletonList(fp2Var));
    }
}

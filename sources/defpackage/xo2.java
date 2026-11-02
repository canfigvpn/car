package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xo2 extends AnimatorListenerAdapter {
    public final /* synthetic */ fp2 a;
    public final /* synthetic */ View b;

    public xo2(fp2 fp2Var, View view) {
        this.a = fp2Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fp2 fp2Var = this.a;
        fp2Var.a.e(1.0f);
        ap2.f(fp2Var, this.b);
    }
}

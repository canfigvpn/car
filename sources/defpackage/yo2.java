package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yo2 implements Runnable {
    public final /* synthetic */ View e;
    public final /* synthetic */ fp2 f;
    public final /* synthetic */ ru1 g;
    public final /* synthetic */ ValueAnimator h;

    public yo2(View view, fp2 fp2Var, ru1 ru1Var, ValueAnimator valueAnimator) {
        this.e = view;
        this.f = fp2Var;
        this.g = ru1Var;
        this.h = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap2.i(this.e, this.f, this.g);
        this.h.start();
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rq2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View e;
    public final /* synthetic */ rr1 f;

    public rq2(View view, rr1 rr1Var) {
        this.e = view;
        this.f = rr1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.e.removeOnAttachStateChangeListener(this);
        this.f.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

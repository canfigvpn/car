package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y72 implements View.OnLayoutChangeListener {
    public final /* synthetic */ x40 a;
    public final /* synthetic */ qk1 b;

    public y72(x40 x40Var, qk1 qk1Var) {
        this.a = x40Var;
        this.b = qk1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            x40 x40Var = this.a;
            boolean zB = ((c82) x40Var.f).b();
            qk1 qk1Var = this.b;
            if (zB) {
                x40Var.h = qk1Var;
                return;
            }
            qj qjVar = (qj) x40Var.g;
            if (qjVar == null) {
                return;
            }
            x40Var.g = null;
            ((ru1) qk1Var.f).l().postOnAnimation(new w5(3, qk1Var, qjVar));
        }
    }
}

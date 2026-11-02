package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x72 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;
    public final /* synthetic */ x40 g;

    public /* synthetic */ x72(x40 x40Var, View view, int i) {
        this.e = i;
        this.g = x40Var;
        this.f = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        qj qjVar;
        int i = this.e;
        View view = this.f;
        x40 x40Var = this.g;
        switch (i) {
            case 0:
                if (((c82) x40Var.f).b()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                qk1 qk1Var = (qk1) x40Var.h;
                if (qk1Var == null || (qjVar = (qj) x40Var.g) == null) {
                    return true;
                }
                x40Var.g = null;
                ((ru1) qk1Var.f).l().postOnAnimation(new w5(3, qk1Var, qjVar));
                return true;
            default:
                if (((c82) ((b82) x40Var).f).b()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}

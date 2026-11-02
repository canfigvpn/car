package defpackage;

import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xu extends r {
    public final dk1 n;
    public boolean o;

    public xu(MainActivity mainActivity) {
        super(mainActivity);
        this.n = y12.s(null);
    }

    @Override // defpackage.r
    public final void b(int i, ak0 ak0Var) {
        ak0Var.X(420213850);
        int i2 = (ak0Var.h(this) ? 4 : 2) | i;
        if (ak0Var.O(i2 & 1, (i2 & 3) != 2)) {
            ij0 ij0Var = (ij0) this.n.getValue();
            if (ij0Var == null) {
                ak0Var.W(-1238823553);
            } else {
                ak0Var.W(98585282);
                ij0Var.g(ak0Var, 0);
            }
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return xu.class.getName();
    }

    @Override // defpackage.r
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o;
    }

    public final void setContent(ij0 ij0Var) {
        this.o = true;
        this.n.setValue(ij0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

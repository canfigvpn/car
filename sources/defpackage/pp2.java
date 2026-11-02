package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class pp2 extends op2 {
    public kq0 r;

    public pp2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.xp2
    public aq2 b() {
        return aq2.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.xp2
    public aq2 c() {
        return aq2.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.xp2
    public final kq0 k() {
        kq0 kq0Var = this.r;
        if (kq0Var != null) {
            return kq0Var;
        }
        WindowInsets windowInsets = this.c;
        kq0 kq0VarB = kq0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.r = kq0VarB;
        return kq0VarB;
    }

    @Override // defpackage.xp2
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.xp2
    public void x(kq0 kq0Var) {
        this.r = kq0Var;
    }
}

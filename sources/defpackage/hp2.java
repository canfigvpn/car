package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class hp2 extends np2 {
    public final WindowInsets.Builder e;

    public hp2(aq2 aq2Var) {
        super(aq2Var);
        WindowInsets windowInsetsB = aq2Var.b();
        this.e = windowInsetsB != null ? jq0.i(windowInsetsB) : jq0.h();
    }

    @Override // defpackage.np2
    public aq2 b() {
        a();
        aq2 aq2VarC = aq2.c(this.e.build(), null);
        kq0[] kq0VarArr = this.b;
        xp2 xp2Var = aq2VarC.a;
        xp2Var.v(kq0VarArr);
        xp2Var.u(null);
        xp2Var.z(this.c);
        xp2Var.A(this.d);
        return aq2VarC;
    }

    @Override // defpackage.np2
    public void e(kq0 kq0Var) {
        this.e.setMandatorySystemGestureInsets(kq0Var.d());
    }

    @Override // defpackage.np2
    public void f(kq0 kq0Var) {
        this.e.setStableInsets(kq0Var.d());
    }

    @Override // defpackage.np2
    public void g(kq0 kq0Var) {
        this.e.setSystemGestureInsets(kq0Var.d());
    }

    @Override // defpackage.np2
    public void h(kq0 kq0Var) {
        this.e.setSystemWindowInsets(kq0Var.d());
    }

    @Override // defpackage.np2
    public void i(kq0 kq0Var) {
        this.e.setTappableElementInsets(kq0Var.d());
    }

    public hp2() {
        this.e = jq0.h();
    }
}

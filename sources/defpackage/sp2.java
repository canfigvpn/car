package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class sp2 extends qp2 {
    public kq0 s;
    public kq0 t;
    public kq0 u;

    public sp2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.xp2
    public kq0 j() {
        kq0 kq0Var = this.t;
        if (kq0Var != null) {
            return kq0Var;
        }
        kq0 kq0VarC = kq0.c(this.c.getMandatorySystemGestureInsets());
        this.t = kq0VarC;
        return kq0VarC;
    }

    @Override // defpackage.xp2
    public kq0 l() {
        kq0 kq0Var = this.s;
        if (kq0Var != null) {
            return kq0Var;
        }
        kq0 kq0VarC = kq0.c(this.c.getSystemGestureInsets());
        this.s = kq0VarC;
        return kq0VarC;
    }

    @Override // defpackage.xp2
    public kq0 n() {
        kq0 kq0Var = this.u;
        if (kq0Var != null) {
            return kq0Var;
        }
        kq0 kq0VarC = kq0.c(this.c.getTappableElementInsets());
        this.u = kq0VarC;
        return kq0VarC;
    }

    @Override // defpackage.op2, defpackage.xp2
    public aq2 q(int i, int i2, int i3, int i4) {
        return aq2.c(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.pp2, defpackage.xp2
    public void x(kq0 kq0Var) {
    }
}

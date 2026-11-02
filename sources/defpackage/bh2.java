package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bh2 extends jq {
    public boolean Q;
    public ej0 R;
    public final r12 S;

    public bh2(boolean z, f91 f91Var, boolean z2, boolean z3, wu1 wu1Var, ej0 ej0Var) {
        super(f91Var, null, z2, z3, null, wu1Var, new iw(ej0Var, z, 4));
        this.Q = z;
        this.R = ej0Var;
        this.S = new r12(10, this);
    }

    @Override // defpackage.jq
    public final void I0(z02 z02Var) {
        ch2 ch2Var = this.Q ? ch2.e : ch2.f;
        lv0[] lv0VarArr = w02.a;
        y02 y02Var = u02.K;
        lv0[] lv0VarArr2 = w02.a;
        lv0 lv0Var = lv0VarArr2[26];
        z02Var.a(y02Var, ch2Var);
        b6 b6Var = q90.z;
        y02 y02Var2 = u02.s;
        lv0 lv0Var2 = lv0VarArr2[9];
        z02Var.a(y02Var2, b6Var);
        y6 y6Var = Build.VERSION.SDK_INT >= 26 ? new y6(AutofillValue.forToggle(this.Q)) : null;
        if (y6Var != null) {
            y02 y02Var3 = u02.t;
            lv0 lv0Var3 = lv0VarArr2[10];
            z02Var.a(y02Var3, y6Var);
        }
        z02Var.a(h02.h, new p0(null, new kp(z02Var, 1)));
    }
}

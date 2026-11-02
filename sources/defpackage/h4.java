package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends qf implements rf0 {
    public final qk1 e;
    public final t02 f;
    public final e5 g;
    public final as1 h;
    public final String i;
    public final Rect j = new Rect();
    public final AutofillId k;
    public final e91 l;
    public boolean m;

    public h4(qk1 qk1Var, t02 t02Var, e5 e5Var, as1 as1Var, String str) {
        this.e = qk1Var;
        this.f = t02Var;
        this.g = e5Var;
        this.h = as1Var;
        this.i = str;
        e5Var.setImportantForAutofill(1);
        pf pfVarI = c12.i(e5Var);
        AutofillId autofillIdB = pfVarI != null ? of.b(pfVarI.a) : null;
        if (autofillIdB == null) {
            throw k3.g("Required value was null.");
        }
        this.k = autofillIdB;
        this.l = new e91();
    }

    @Override // defpackage.rf0
    public final void a(cg0 cg0Var, cg0 cg0Var2) {
        ax0 ax0VarV;
        i02 i02VarW;
        ax0 ax0VarV2;
        i02 i02VarW2;
        if (cg0Var != null && (ax0VarV2 = qx.V(cg0Var)) != null && (i02VarW2 = ax0VarV2.w()) != null) {
            w91 w91Var = i02VarW2.e;
            if (w91Var.b(h02.g) || w91Var.b(h02.h)) {
                ((AutofillManager) this.e.f).notifyViewExited(this.g, ax0VarV2.f);
            }
        }
        if (cg0Var2 == null || (ax0VarV = qx.V(cg0Var2)) == null || (i02VarW = ax0VarV.w()) == null) {
            return;
        }
        w91 w91Var2 = i02VarW.e;
        if (w91Var2.b(h02.g) || w91Var2.b(h02.h)) {
            int i = ax0VarV.f;
            this.h.b.j(i, new f4(this, i));
        }
    }
}

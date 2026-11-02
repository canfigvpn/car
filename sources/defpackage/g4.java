package defpackage;

import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends dw0 implements kj0 {
    public final /* synthetic */ h4 f;
    public final /* synthetic */ ax0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var, ax0 ax0Var) {
        super(4);
        this.f = h4Var;
        this.g = ax0Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        h4 h4Var = this.f;
        h4Var.j.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        qk1 qk1Var = h4Var.e;
        ((AutofillManager) qk1Var.f).requestAutofill(h4Var.g, this.g.f, h4Var.j);
        return ll2.a;
    }
}

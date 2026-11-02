package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends dw0 implements kj0 {
    public final /* synthetic */ h4 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, int i) {
        super(4);
        this.f = h4Var;
        this.g = i;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        h4 h4Var = this.f;
        qk1 qk1Var = h4Var.e;
        ((AutofillManager) qk1Var.f).notifyViewEntered(h4Var.g, this.g, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return ll2.a;
    }
}

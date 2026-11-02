package defpackage;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class so1 extends dw0 implements kj0 {
    public final /* synthetic */ ViewStructure f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so1(ViewStructure viewStructure) {
        super(4);
        this.f = viewStructure;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return ll2.a;
    }
}

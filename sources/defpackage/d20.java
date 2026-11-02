package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d20 implements jj0 {
    public final /* synthetic */ gt e;
    public final /* synthetic */ boolean f;

    public d20(gt gtVar, boolean z) {
        this.e = gtVar;
        this.f = z;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        String strL;
        ak0 ak0Var = (ak0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.e.g(ak0Var, 0);
            r02.b(ak0Var, f52.j(hl.e));
            jo0 jo0VarZ = qx.z();
            boolean z = this.f;
            if (z) {
                ak0Var.W(1509384391);
                strL = r02.l(R.string.m3c_date_picker_switch_to_day_selection, ak0Var);
                ak0Var.p(false);
            } else {
                ak0Var.W(1509478662);
                strL = r02.l(R.string.m3c_date_picker_switch_to_year_selection, ak0Var);
                ak0Var.p(false);
            }
            fo0.a(jo0VarZ, strL, qx.X(z ? 180.0f : 0.0f), 0L, ak0Var, 0, 8);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

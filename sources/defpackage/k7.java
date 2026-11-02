package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 implements qe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k7(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                dq0 dq0Var = (dq0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    dq0Var.q().startStylusHandwriting((View) dq0Var.f);
                }
                return ll2Var;
            case 1:
                ((gs1) obj2).e = obj;
                throw new a(this);
            case 2:
                if (((tr0) obj) instanceof sp1) {
                    ((da1) obj2).setValue(Boolean.TRUE);
                }
                return ll2Var;
            case 3:
                ((b81) obj2).g.i(((Number) obj).floatValue());
                return ll2Var;
            default:
                tr0 tr0Var = (tr0) obj;
                ak1 ak1Var = (ak1) obj2;
                if ((tr0Var instanceof rp1) || (tr0Var instanceof nf0)) {
                    ak1Var.i(ak1Var.h() + 1);
                } else if ((tr0Var instanceof sp1) || (tr0Var instanceof of0) || (tr0Var instanceof qp1)) {
                    ak1Var.i(ak1Var.h() - 1);
                }
                return ll2Var;
        }
    }
}

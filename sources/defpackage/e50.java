package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e50 extends vo2 {
    public final /* synthetic */ f50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(f50 f50Var) {
        super(1);
        this.g = f50Var;
    }

    @Override // defpackage.vo2
    public final aq2 d(aq2 aq2Var, List list) {
        f50 f50Var = this.g;
        if (!f50Var.q) {
            View childAt = f50Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, f50Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, f50Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return aq2Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return aq2Var;
    }

    @Override // defpackage.vo2
    public final ru1 e(fp2 fp2Var, ru1 ru1Var) {
        f50 f50Var = this.g;
        if (!f50Var.q) {
            View childAt = f50Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, f50Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, f50Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                kq0 kq0VarB = kq0.b(iMax, iMax2, iMax3, iMax4);
                int i = kq0VarB.a;
                kq0 kq0Var = (kq0) ru1Var.b;
                int i2 = kq0VarB.b;
                int i3 = kq0VarB.c;
                int i4 = kq0VarB.d;
                return new ru1(11, aq2.a(kq0Var, i, i2, i3, i4), aq2.a((kq0) ru1Var.c, i, i2, i3, i4));
            }
        }
        return ru1Var;
    }
}

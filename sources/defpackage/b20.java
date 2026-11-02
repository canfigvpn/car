package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 implements kj0 {
    public final /* synthetic */ lr0 e;
    public final /* synthetic */ bm f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ej0 i;
    public final /* synthetic */ n00 j;
    public final /* synthetic */ l00 k;

    public b20(lr0 lr0Var, bm bmVar, int i, int i2, ej0 ej0Var, n00 n00Var, l00 l00Var) {
        this.e = lr0Var;
        this.f = bmVar;
        this.g = i;
        this.h = i2;
        this.i = ej0Var;
        this.j = n00Var;
        this.k = l00Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        ak0 ak0Var = (ak0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= ak0Var.d(iIntValue) ? 32 : 16;
        }
        if (ak0Var.O(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            int i = iIntValue + this.e.e;
            String strA = am.a(i, this.f.a);
            u71 u71VarG = f52.g(r71.a, nj2.Y, nj2.X);
            boolean z = i == this.g;
            boolean z2 = i == this.h;
            ej0 ej0Var = this.i;
            boolean zF = ak0Var.f(ej0Var) | ak0Var.d(i);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new a20(i, 0, ej0Var);
                ak0Var.g0(objL);
            }
            this.j.getClass();
            e20.m(strA, u71VarG, z, z2, (ti0) objL, String.format(r02.l(R.string.m3c_date_picker_navigate_to_year_description, ak0Var), Arrays.copyOf(new Object[]{strA}, 1)), this.k, ak0Var, 48);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

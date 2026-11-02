package defpackage;

import android.content.res.Configuration;
import ir.alirezaivaz.mygarage.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o00 {
    public static final o00 a = new o00();
    public static final lr0 b = new lr0(1900, 2100, 1);
    public static final n00 c = new n00();

    public static l00 c(ak0 ak0Var) {
        jr jrVar = (jr) ak0Var.j(lr.a);
        l00 l00Var = jrVar.b0;
        if (l00Var != null) {
            ak0Var.W(642290457);
            ak0Var.p(false);
            return l00Var;
        }
        ak0Var.W(642416503);
        long jD = lr.d(jrVar, nj2.z);
        long jD2 = lr.d(jrVar, nj2.Q);
        long jD3 = lr.d(jrVar, nj2.O);
        long jD4 = lr.d(jrVar, nj2.V);
        long jD5 = lr.d(jrVar, nj2.U);
        long j = jrVar.s;
        kr krVar = nj2.d0;
        long jD6 = lr.d(jrVar, krVar);
        long jB = dr.b(0.38f, lr.d(jrVar, krVar));
        kr krVar2 = nj2.L;
        long jD7 = lr.d(jrVar, krVar2);
        kr krVar3 = nj2.b0;
        long jD8 = lr.d(jrVar, krVar3);
        long jB2 = dr.b(0.38f, lr.d(jrVar, krVar3));
        kr krVar4 = nj2.a0;
        long jD9 = lr.d(jrVar, krVar4);
        long jB3 = dr.b(0.38f, lr.d(jrVar, krVar4));
        kr krVar5 = nj2.M;
        long jD10 = lr.d(jrVar, krVar5);
        long jB4 = dr.b(0.38f, lr.d(jrVar, krVar5));
        kr krVar6 = nj2.I;
        long jD11 = lr.d(jrVar, krVar6);
        long jB5 = dr.b(0.38f, lr.d(jrVar, krVar6));
        kr krVar7 = nj2.H;
        l00 l00Var2 = new l00(jD, jD2, jD3, jD4, jD5, j, jD6, jB, jD7, jD8, jB2, jD9, jB3, jD10, jB4, jD11, jB5, lr.d(jrVar, krVar7), dr.b(0.38f, lr.d(jrVar, krVar7)), lr.d(jrVar, krVar2), lr.d(jrVar, nj2.J), lr.d(jrVar, nj2.S), lr.d(jrVar, nj2.T), lr.d(jrVar, dv1.i), q90.l(jrVar, ak0Var));
        jrVar.b0 = l00Var2;
        ak0Var.p(false);
        return l00Var2;
    }

    public final void a(final Long l, final int i, final r00 r00Var, final u71 u71Var, final long j, ak0 ak0Var, final int i2) {
        ak0Var.X(1913724796);
        int i3 = i2 | (ak0Var.f(l) ? 4 : 2) | (ak0Var.d(i) ? 32 : 16) | (ak0Var.f(r00Var) ? 256 : 128) | (ak0Var.e(j) ? 16384 : 8192);
        if (ak0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            ak0Var.T();
            if ((i2 & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            ak0Var.W(2088426481);
            Locale locale = ((Configuration) ak0Var.j(u5.a)).getLocales().get(0);
            ak0Var.p(false);
            String strA = r00Var.a(l, locale, false);
            String strA2 = r00Var.a(l, locale, true);
            String strL = "";
            if (strA2 == null) {
                ak0Var.W(380185931);
                if (i == 0) {
                    ak0Var.W(843549871);
                    strA2 = r02.l(R.string.m3c_date_picker_no_selection_description, ak0Var);
                    ak0Var.p(false);
                } else if (i == 1) {
                    ak0Var.W(843552842);
                    strA2 = r02.l(R.string.m3c_date_input_no_input_description, ak0Var);
                    ak0Var.p(false);
                } else {
                    ak0Var.W(380407362);
                    ak0Var.p(false);
                    strA2 = "";
                }
                ak0Var.p(false);
            } else {
                ak0Var.W(843542258);
                ak0Var.p(false);
            }
            if (strA == null) {
                ak0Var.W(380507587);
                if (i == 0) {
                    ak0Var.W(843560257);
                    strA = r02.l(R.string.m3c_date_picker_headline, ak0Var);
                    ak0Var.p(false);
                } else if (i == 1) {
                    ak0Var.W(843562784);
                    strA = r02.l(R.string.m3c_date_input_headline, ak0Var);
                    ak0Var.p(false);
                } else {
                    ak0Var.W(380705954);
                    ak0Var.p(false);
                    strA = "";
                }
                ak0Var.p(false);
            } else {
                ak0Var.W(843557408);
                ak0Var.p(false);
            }
            if (i == 0) {
                ak0Var.W(843570444);
                strL = r02.l(R.string.m3c_date_picker_headline_description, ak0Var);
                ak0Var.p(false);
            } else if (i == 1) {
                ak0Var.W(843573323);
                strL = r02.l(R.string.m3c_date_input_headline_description, ak0Var);
                ak0Var.p(false);
            } else {
                ak0Var.W(381043234);
                ak0Var.p(false);
            }
            String str = String.format(strL, Arrays.copyOf(new Object[]{strA2}, 1));
            boolean zF = ak0Var.f(str);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new ii(str, 1);
                ak0Var.g0(objL);
            }
            ef2.b(strA, l02.a(u71Var, false, (ej0) objL), j, 0L, 0L, null, 0L, 0, false, 1, 0, null, ak0Var, (i3 >> 6) & 896, 24576, 245752);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(l, i, r00Var, u71Var, j, i2) { // from class: m00
                public final /* synthetic */ Long f;
                public final /* synthetic */ int g;
                public final /* synthetic */ r00 h;
                public final /* synthetic */ u71 i;
                public final /* synthetic */ long j;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(199681);
                    this.e.a(this.f, this.g, this.h, this.i, this.j, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public final void b(int i, u71 u71Var, long j, ak0 ak0Var, int i2) {
        ak0 ak0Var2;
        ak0Var.X(-390880814);
        int i3 = i2 | (ak0Var.d(i) ? 4 : 2) | (ak0Var.e(j) ? 256 : 128);
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            ak0Var.T();
            if ((i2 & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            if (i == 0) {
                ak0Var.W(-1974299164);
                ef2.b(r02.l(R.string.m3c_date_picker_title, ak0Var), u71Var, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var, i3 & 1008, 0, 262136);
                ak0Var2 = ak0Var;
                ak0Var2.p(false);
            } else {
                ak0Var2 = ak0Var;
                if (i == 1) {
                    ak0Var2.W(-1974291869);
                    ef2.b(r02.l(R.string.m3c_date_input_title, ak0Var2), u71Var, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var2, i3 & 1008, 0, 262136);
                    ak0Var2 = ak0Var2;
                    ak0Var2.p(false);
                } else {
                    ak0Var2.W(-1073325776);
                    ak0Var2.p(false);
                }
            }
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new uq1(this, i, u71Var, j, i2);
        }
    }
}

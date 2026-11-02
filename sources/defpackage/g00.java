package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g00 implements ej0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ da1 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ g00(d00 d00Var, da1 da1Var, ej0 ej0Var, bm bmVar, Locale locale, k00 k00Var, da1 da1Var2) {
        this.h = d00Var;
        this.g = da1Var;
        this.f = ej0Var;
        this.j = bmVar;
        this.k = locale;
        this.l = k00Var;
        this.i = da1Var2;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        float f;
        int i = this.e;
        da1 da1Var = this.g;
        ll2 ll2Var = ll2.a;
        Long lValueOf = null;
        int i2 = 0;
        Object obj2 = this.i;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.f;
        Object obj7 = this.h;
        switch (i) {
            case 0:
                ej0 ej0Var = (ej0) obj6;
                bm bmVar = (bm) obj5;
                Locale locale = (Locale) obj4;
                k00 k00Var = (k00) obj3;
                da1 da1Var2 = (da1) obj2;
                te2 te2Var = (te2) obj;
                yb ybVar = te2Var.a;
                String str = ybVar.f;
                String str2 = ybVar.f;
                int length = str.length();
                String str3 = ((d00) obj7).c;
                if (length <= str3.length()) {
                    while (i2 < str2.length()) {
                        if (Character.isDigit(str2.charAt(i2))) {
                            i2++;
                        }
                    }
                    da1Var2.setValue(te2Var);
                    String string = h92.Q(str2).toString();
                    if (string.length() != 0 && string.length() >= str3.length()) {
                        zl zlVarJ = bmVar.j(string, str3, locale);
                        da1Var.setValue(k00Var.a(zlVarJ, locale));
                        if (((CharSequence) da1Var.getValue()).length() == 0 && zlVarJ != null) {
                            lValueOf = Long.valueOf(zlVarJ.h);
                        }
                        ej0Var.h(lValueOf);
                    } else {
                        da1Var.setValue("");
                        ej0Var.h(null);
                    }
                }
                return ll2Var;
            case 1:
                k91 k91Var = (k91) obj7;
                hu huVar = (hu) obj2;
                ej0 ej0Var2 = (ej0) obj6;
                ej0 ej0Var3 = (ej0) obj5;
                ej0 ej0Var4 = (ej0) obj4;
                ab abVar = (ab) obj;
                if (!((List) ((p82) obj3).getValue()).contains(abVar.a())) {
                    return p61.q0(sb0.b, kc0.b);
                }
                String str4 = ((kb1) abVar.a()).j;
                int iB = k91Var.b(str4);
                if (iB >= 0) {
                    f = k91Var.c[iB];
                } else {
                    k91Var.d(str4, 0.0f);
                    f = 0.0f;
                }
                if (!((kb1) abVar.c()).j.equals(((kb1) abVar.a()).j)) {
                    f = (((Boolean) huVar.c.getValue()).booleanValue() || ((Boolean) da1Var.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                k91Var.d(((kb1) abVar.c()).j, f);
                return new fx((sb0) ej0Var2.h(abVar), (kc0) ej0Var3.h(abVar), f, (h52) ej0Var4.h(abVar));
            default:
                o32 o32Var = (o32) obj7;
                p82 p82Var = (p82) obj6;
                f01 f01Var = (f01) obj;
                f01Var.getClass();
                f01.U(f01Var, null, j20.k, 3);
                f01.U(f01Var, null, new gt(new f32(o32Var, p82Var, i2), true, 1395606747), 3);
                f01.U(f01Var, null, j20.l, 3);
                f01.U(f01Var, null, new gt(new h32(p82Var, o32Var, (Activity) obj5, i2), true, 279638621), 3);
                f01.U(f01Var, null, j20.m, 3);
                f01.U(f01Var, null, new gt(new f32(o32Var, p82Var, 1), true, -836329505), 3);
                f01.U(f01Var, null, j20.n, 3);
                f01.U(f01Var, null, new gt(new j32((s51) obj4, (ph) obj3, this.g, (da1) obj2, 0), true, -1952297631), 3);
                f01.U(f01Var, null, j20.o, 3);
                f01.U(f01Var, null, j20.p, 3);
                return ll2Var;
        }
    }

    public /* synthetic */ g00(k91 k91Var, hu huVar, ej0 ej0Var, ej0 ej0Var2, ej0 ej0Var3, p82 p82Var, da1 da1Var) {
        this.h = k91Var;
        this.i = huVar;
        this.f = ej0Var;
        this.j = ej0Var2;
        this.k = ej0Var3;
        this.l = p82Var;
        this.g = da1Var;
    }

    public /* synthetic */ g00(o32 o32Var, p82 p82Var, Activity activity, s51 s51Var, ph phVar, da1 da1Var, da1 da1Var2) {
        this.h = o32Var;
        this.f = p82Var;
        this.j = activity;
        this.k = s51Var;
        this.l = phVar;
        this.g = da1Var;
        this.i = da1Var2;
    }
}

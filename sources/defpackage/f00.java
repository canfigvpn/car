package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f00 implements ti0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Locale f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ f00(k00 k00Var, bm bmVar, d00 d00Var, Locale locale, da1 da1Var) {
        this.g = k00Var;
        this.h = bmVar;
        this.i = d00Var;
        this.f = locale;
        this.j = da1Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        String strA;
        int i = this.e;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                k00 k00Var = (k00) obj4;
                bm bmVar = (bm) obj3;
                d00 d00Var = (d00) obj2;
                da1 da1Var = (da1) obj;
                if (((te2) da1Var.getValue()).a.f.length() > 0) {
                    String str = ((te2) da1Var.getValue()).a.f;
                    String str2 = d00Var.c;
                    Locale locale = this.f;
                    strA = k00Var.a(bmVar.j(str, str2, locale), locale);
                } else {
                    strA = "";
                }
                return y12.s(strA);
            default:
                return new f20((Long) obj4, (Long) obj3, (lr0) obj2, 0, (n00) obj, this.f);
        }
    }

    public /* synthetic */ f00(Long l, Long l2, lr0 lr0Var, n00 n00Var, Locale locale) {
        this.g = l;
        this.h = l2;
        this.i = lr0Var;
        this.j = n00Var;
        this.f = locale;
    }
}

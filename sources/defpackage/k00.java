package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k00 {
    public final lr0 a;
    public final n00 b;
    public final d00 c;
    public final String d;
    public final String e;

    public k00(lr0 lr0Var, n00 n00Var, d00 d00Var, r00 r00Var, String str, String str2, String str3) {
        this.a = lr0Var;
        this.b = n00Var;
        this.c = d00Var;
        this.d = str;
        this.e = str2;
    }

    public final String a(zl zlVar, Locale locale) {
        if (zlVar == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.d, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i = zlVar.e;
        lr0 lr0Var = this.a;
        if (lr0Var.a(i)) {
            this.b.getClass();
            return "";
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{am.a(lr0Var.e, locale), am.a(lr0Var.f, locale)}, 2);
        return String.format(this.e, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
    }
}

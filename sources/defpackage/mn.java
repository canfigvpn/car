package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mn extends un2 {
    public final vn b;
    public final sz1 c;
    public final fn d;
    public final s82 e;
    public final jr1 f;

    public mn(vn vnVar, sz1 sz1Var, kw1 kw1Var) {
        vnVar.getClass();
        sz1Var.getClass();
        kw1Var.getClass();
        this.b = vnVar;
        this.c = sz1Var;
        fn fnVar = (fn) sv.X(kw1Var, js1.a(fn.class));
        this.d = fnVar;
        s82 s82VarF = j20.f(new kn(fnVar.a, "", "", "", "", new j11("", "", "", ""), ni0.e, "", "", false, false));
        this.e = s82VarF;
        this.f = new jr1(s82VarF);
        if (fnVar.a != 0) {
            nj2.y(s5.H(this), null, new ln(0, (sx) null, this), 3);
        }
    }

    public static String e(String str, int i) {
        int i2;
        ArrayList arrayList = new ArrayList(str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (1776 > cCharAt || cCharAt >= 1786) {
                if (1632 <= cCharAt && cCharAt < 1642) {
                    i2 = cCharAt - 1584;
                }
                arrayList.add(Character.valueOf(cCharAt));
            } else {
                i2 = cCharAt - 1728;
            }
            cCharAt = (char) i2;
            arrayList.add(Character.valueOf(cCharAt));
        }
        String strV = vq.V(arrayList, "", null, null, null, 62);
        StringBuilder sb = new StringBuilder();
        int length = strV.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt2 = strV.charAt(i4);
            if (Character.isDigit(cCharAt2)) {
                sb.append(cCharAt2);
            }
        }
        return h92.P(sb.toString(), i);
    }
}

package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xb1 {
    public static final ls1 m = new ls1("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final ls1 n = new ls1("\\{(.+?)\\}");
    public static final ls1 o = new ls1("http[s]?://");
    public static final ls1 p = new ls1(".*");
    public static final ls1 q = new ls1("([^/]*?|)");
    public static final ls1 r = new ls1("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final hb2 d;
    public final hb2 e;
    public final rx0 f;
    public boolean g;
    public final rx0 h;
    public final rx0 i;
    public final rx0 j;
    public final hb2 k;
    public final boolean l;

    public xb1(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.d = new hb2(new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i2 = i;
                xb1 xb1Var = this.f;
                switch (i2) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i3 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i3) {
                                        String strQuote = Pattern.quote(str6.substring(i3, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = udVarT.l().f + 1;
                                }
                                if (i3 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e = new hb2(new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i3 = i2;
                xb1 xb1Var = this.f;
                switch (i3) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i4 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i4) {
                                        String strQuote = Pattern.quote(str6.substring(i4, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = udVarT.l().f + 1;
                                }
                                if (i4 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i4));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        ti0 ti0Var = new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i4 = i3;
                xb1 xb1Var = this.f;
                switch (i4) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i5 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i5) {
                                        String strQuote = Pattern.quote(str6.substring(i5, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i5 = udVarT.l().f + 1;
                                }
                                if (i5 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i5));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        v01 v01Var = v01.f;
        this.f = vv.F(v01Var, ti0Var);
        final int i4 = 3;
        this.h = vv.F(v01Var, new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i5 = i4;
                xb1 xb1Var = this.f;
                switch (i5) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i6 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i6) {
                                        String strQuote = Pattern.quote(str6.substring(i6, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i6 = udVarT.l().f + 1;
                                }
                                if (i6 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i6));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.i = vv.F(v01Var, new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i6 = i5;
                xb1 xb1Var = this.f;
                switch (i6) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i7 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i7) {
                                        String strQuote = Pattern.quote(str6.substring(i7, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i7 = udVarT.l().f + 1;
                                }
                                if (i7 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i7));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.j = vv.F(v01Var, new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i7 = i6;
                xb1 xb1Var = this.f;
                switch (i7) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i8 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i8) {
                                        String strQuote = Pattern.quote(str6.substring(i8, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = udVarT.l().f + 1;
                                }
                                if (i8 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i8));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.k = new hb2(new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i8 = i7;
                xb1 xb1Var = this.f;
                switch (i8) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i9 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i9) {
                                        String strQuote = Pattern.quote(str6.substring(i9, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = udVarT.l().f + 1;
                                }
                                if (i9 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i9));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new hb2(new ti0(this) { // from class: ub1
            public final /* synthetic */ xb1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                List list;
                int i9 = i8;
                xb1 xb1Var = this.f;
                switch (i9) {
                    case 0:
                        String str2 = xb1Var.c;
                        if (str2 != null) {
                            return new ls1(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = xb1Var.a;
                        ls1 ls1Var = xb1.r;
                        ls1Var.getClass();
                        return Boolean.valueOf(ls1Var.e.matcher(str3).matches());
                    case 2:
                        String str4 = xb1Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            uri.getClass();
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    qj.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) vq.R(queryParameters);
                                if (str6 == null) {
                                    xb1Var.g = true;
                                    str6 = str5;
                                }
                                ls1 ls1Var2 = xb1.n;
                                ls1Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ls1Var2.e.matcher(str6);
                                matcher.getClass();
                                wb1 wb1Var = new wb1();
                                int i10 = 0;
                                for (ud udVarT = rw.t(matcher, 0, str6); udVarT != null; udVarT = udVarT.r()) {
                                    j61 j61VarB = ((k61) udVarT.d).b(1);
                                    j61VarB.getClass();
                                    wb1Var.b.add(j61VarB.a);
                                    if (udVarT.l().e > i10) {
                                        String strQuote = Pattern.quote(str6.substring(i10, udVarT.l().e));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i10 = udVarT.l().f + 1;
                                }
                                if (i10 < str6.length()) {
                                    String strQuote2 = Pattern.quote(str6.substring(i10));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                wb1Var.a = xb1.h(sb.toString());
                                linkedHashMap.put(str5, wb1Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = xb1Var.a;
                        Uri uri2 = Uri.parse(str7);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        xb1.a(fragment, arrayList2, sb2);
                        return new qj1(arrayList2, sb2.toString());
                    case 4:
                        qj1 qj1Var = (qj1) xb1Var.h.getValue();
                        return (qj1Var == null || (list = (List) qj1Var.e) == null) ? new ArrayList() : list;
                    case 5:
                        qj1 qj1Var2 = (qj1) xb1Var.h.getValue();
                        if (qj1Var2 != null) {
                            return (String) qj1Var2.f;
                        }
                        return null;
                    case 6:
                        String str8 = (String) xb1Var.j.getValue();
                        if (str8 != null) {
                            return new ls1(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.e.matcher(str).find()) {
            String strPattern = o.e.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        ud udVarT = rw.t(matcher, 0, str);
        if (udVarT != null) {
            a(str.substring(0, udVarT.l().e), arrayList, sb);
            if (!p.e.matcher(sb).find() && !q.e.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        ls1 ls1Var = n;
        ls1Var.getClass();
        Matcher matcher = ls1Var.e.matcher(str);
        matcher.getClass();
        int i = 0;
        for (ud udVarT = rw.t(matcher, 0, str); udVarT != null; udVarT = udVarT.r()) {
            j61 j61VarB = ((k61) udVarT.d).b(1);
            j61VarB.getClass();
            arrayList.add(j61VarB.a);
            if (udVarT.l().e > i) {
                String strQuote = Pattern.quote(str.substring(i, udVarT.l().e));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = q.e.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = udVarT.l().f + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, jb1 jb1Var) {
        if (jb1Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            xc1 xc1Var = jb1Var.a;
            str.getClass();
            xc1Var.e(bundle, str, xc1Var.d(str2));
        }
    }

    public static String h(String str) {
        if (h92.C(str, "\\Q", false) && h92.C(str, "\\E", false)) {
            return o92.y(str, ".*", "\\E.*\\Q");
        }
        return h92.C(str, "\\.\\*", false) ? o92.y(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        List<String> pathSegments2 = uri2.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ar.I(((wb1) it.next()).b, arrayList);
        }
        return vq.a0(vq.a0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        ud udVarA;
        ud udVarA2;
        String strDecode;
        uri.getClass();
        ls1 ls1Var = (ls1) this.d.getValue();
        if (ls1Var != null && (udVarA = ls1Var.a(uri.toString())) != null) {
            Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
            if (e(udVarA, bundleW, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleW, linkedHashMap))) {
                String fragment = uri.getFragment();
                ls1 ls1Var2 = (ls1) this.k.getValue();
                if (ls1Var2 != null && (udVarA2 = ls1Var2.a(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(wq.G(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            vs0.D();
                            throw null;
                        }
                        String str = (String) obj;
                        j61 j61VarB = ((k61) udVarA2.d).b(i2);
                        if (j61VarB != null) {
                            strDecode = Uri.decode(j61VarB.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleW, str, strDecode, (jb1) linkedHashMap.get(str));
                            arrayList.add(ll2.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (mx.F(linkedHashMap, new vb1(bundleW, 0)).isEmpty()) {
                    return bundleW;
                }
            }
        }
        return null;
    }

    public final boolean e(ud udVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(wq.G(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            String str = (String) obj;
            j61 j61VarB = ((k61) udVar.d).b(i3);
            if (j61VarB != null) {
                strDecode = Uri.decode(j61VarB.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (jb1) linkedHashMap.get(str));
                arrayList2.add(ll2.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof xb1)) {
            return false;
        }
        return this.a.equals(((xb1) obj).a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        ud udVar;
        ?? r14;
        Object objValueOf;
        boolean z;
        String query;
        xb1 xb1Var = this;
        for (Map.Entry entry : ((Map) xb1Var.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            wb1 wb1Var = (wb1) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (xb1Var.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = vs0.u(query);
            }
            ll2 ll2Var = ll2.a;
            boolean z2 = false;
            Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
            ArrayList arrayList = wb1Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                jb1 jb1Var = (jb1) linkedHashMap.get(str2);
                xc1 xc1Var = jb1Var != null ? jb1Var.a : null;
                if ((xc1Var instanceof uq) && !jb1Var.c) {
                    uq uqVar = (uq) xc1Var;
                    uqVar.e(bundleW, str2, uqVar.g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = wb1Var.a;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    patternCompile.getClass();
                    str3.getClass();
                    Matcher matcher = patternCompile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        udVar = new ud(matcher, str3);
                    } else {
                        udVar = null;
                    }
                } else {
                    udVar = null;
                }
                if (udVar == null) {
                    return z2;
                }
                ArrayList arrayList2 = wb1Var.b;
                ArrayList arrayList3 = new ArrayList(wq.G(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z3 = z2;
                int i2 = z3 ? 1 : 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    int i3 = r14 + 1;
                    if (r14 < 0) {
                        r14 = z3;
                        vs0.D();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    j61 j61VarB = ((k61) udVar.d).b(i3);
                    String str6 = j61VarB != null ? j61VarB.a : null;
                    if (str6 == null) {
                        r14 = z3;
                        r14 = z3;
                        str6 = "";
                    }
                    r14 = z3;
                    r14 = z3;
                    jb1 jb1Var2 = (jb1) linkedHashMap.get(str5);
                    try {
                        str5.getClass();
                        if (bundleW.containsKey(str5)) {
                            if (bundleW.containsKey(str5)) {
                                if (jb1Var2 != null) {
                                    xc1 xc1Var2 = jb1Var2.a;
                                    Object objA = xc1Var2.a(str5, bundleW);
                                    if (!bundleW.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    xc1Var2.e(bundleW, str5, xc1Var2.c(objA, str6));
                                    objValueOf = ll2Var;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            g(bundleW, str5, str6, jb1Var2);
                            objValueOf = ll2Var;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList3.add(objValueOf);
                    linkedHashMap = linkedHashMap;
                    r14 = i3;
                    z2 = false;
                }
                r14 = z3;
                linkedHashMap = linkedHashMap;
            }
            bundle.putAll(bundleW);
            xb1Var = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}

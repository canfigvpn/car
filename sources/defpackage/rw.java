package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rw implements hz1 {
    public static jo0 a;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static final void A(ak0 ak0Var, ij0 ij0Var) {
        ij0Var.getClass();
        nj2.i(2, ij0Var);
        ij0Var.g(ak0Var, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(qg2 qg2Var, mu muVar, Throwable th, tx txVar) throws IllegalAccessException, InvocationTargetException {
        we0 we0Var;
        if (txVar instanceof we0) {
            we0Var = (we0) txVar;
            int i = we0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                we0Var.j = i - Integer.MIN_VALUE;
            } else {
                we0Var = new we0(txVar);
            }
        } else {
            we0Var = new we0(txVar);
        }
        Object obj = we0Var.i;
        int i2 = we0Var.j;
        ll2 ll2Var = ll2.a;
        try {
            if (i2 == 0) {
                ix.Q(obj);
                we0Var.h = th;
                we0Var.j = 1;
                muVar.d(qg2Var, th, we0Var);
                fz fzVar = fz.e;
                if (ll2Var == fzVar) {
                    return fzVar;
                }
            } else {
                if (i2 != 1) {
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = we0Var.h;
                ix.Q(obj);
            }
            return ll2Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                vv.e(th2, th);
            }
            throw th2;
        }
    }

    public static final void C(String str) {
        str.getClass();
        throw new IllegalArgumentException(k3.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final float D(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int E(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static x61 F(pv1 pv1Var, int i, int i2, int i3, int i4, int i5, y61 y61Var, List list, jm1[] jm1VarArr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            r61 r61Var = (r61) list2.get(i11);
            float fA = vv.A(vv.t(r61Var));
            if (fA > 0.0f) {
                f2 += fA;
                i12++;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                jm1 jm1VarE = jm1VarArr[i11];
                if (jm1VarE == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    jm1VarE = r61Var.e(pv1Var.e(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                jm1 jm1Var = jm1VarE;
                int i15 = pv1Var.i(jm1Var);
                int iF = pv1Var.f(jm1Var);
                iArr[i8] = i15;
                int i16 = i14 - i15;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i5, i16);
                i13 += i15 + iMin;
                iMax = Math.max(iMax, iF);
                jm1VarArr[i8] = jm1Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j = j;
        }
        long j2 = j;
        int i17 = i12;
        if (i17 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j3 = ((long) (i17 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i18 = 0; i18 < i6; i18++) {
                jRound -= (long) Math.round(vv.A(vv.t((r61) list2.get(i18))) * f3);
            }
            int i19 = iMax;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i6) {
                if (jm1VarArr[i20] == null) {
                    r61 r61Var2 = (r61) list2.get(i20);
                    qv1 qv1VarT = vv.t(r61Var2);
                    float fA2 = vv.A(qv1VarT);
                    if (fA2 <= 0.0f) {
                        tp0.b("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fA2 * f) + iSignum);
                    jm1 jm1VarE2 = r61Var2.e(pv1Var.e((!(qv1VarT != null ? qv1VarT.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int i22 = pv1Var.i(jm1VarE2);
                    int iF2 = pv1Var.f(jm1VarE2);
                    iArr[i20] = i22;
                    i21 += i22;
                    int iMax3 = Math.max(i19, iF2);
                    jm1VarArr[i20] = jm1VarE2;
                    i19 = iMax3;
                } else {
                    f = f3;
                }
                i20++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (((long) i21) + j3);
            int i23 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i23) {
                i7 = i23;
            }
            iMax = i19;
        }
        int i24 = i7 + i13;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax4 = Math.max(i24, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        pv1Var.d(iMax4, iArr, iArr2, y61Var);
        return pv1Var.a(jm1VarArr, y61Var, iArr2, iMax4, iMax5);
    }

    public static ah0 H(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            O(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xq1.b);
        int i2 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i3 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xq1.c);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            O(xmlResourceParser);
                        }
                        arrayList.add(new ch0(string7, i4, z, string6, i6, resourceId2));
                    } else {
                        O(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new bh0((ch0[]) arrayList.toArray(new ch0[0]));
        }
        List listN = N(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xq1.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i2);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i3) {
                            O(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            try {
                                tg0 tg0Var = new tg0(string, string2, string8, listN, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(tg0Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                O(xmlResourceParser);
                i3 = i3;
                integer = integer;
                i = 2;
                i2 = 0;
            }
        }
        int i8 = integer;
        if (!arrayList2.isEmpty()) {
            return new dh0(arrayList2, i8, integer2, string5);
        }
        if (string3 == null) {
            qj.r("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new tg0(string, string2, string3, listN, null, null));
        if (string4 != null) {
            arrayList2.add(new tg0(string, string2, string4, listN, null, null));
        }
        return new dh0(arrayList2, i8, integer2, string5);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long I(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        z80 z80Var;
        char cCharAt2;
        z80 z80Var2;
        long jM;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d2;
        long jK0;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            qj.r("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c2 = '-';
        char c3 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            qj.r("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            qj.r("");
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            qj.r("");
            return 0L;
        }
        int i21 = 0;
        z80 z80Var3 = null;
        long jL = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                k41 k41Var = k41.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c3) {
                    if (cCharAt10 != c2) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = k41Var.a;
                                if (j > j4 || (j == j4 && i17 > k41Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    qj.r("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                k41Var = k41Var;
                                i = i18;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            z80Var = z80.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i16 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i3 = i14;
                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                            i3++;
                                        }
                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                            qj.r("");
                                            return 0L;
                                        }
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d3 = j5;
                                        switch (z80Var.ordinal()) {
                                            case 0:
                                                d2 = 1.0E-15d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            case 1:
                                                d2 = 1.0E-12d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            case 2:
                                                d2 = 1.0E-9d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            case 3:
                                                d2 = 1.0E-6d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            case 4:
                                                d2 = 6.0E-5d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            case 5:
                                                d2 = 0.0036d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            case 6:
                                                d2 = 0.0864d;
                                                jK0 = p61.k0(d3 * d2);
                                                break;
                                            default:
                                                qj.i(z80Var, "Unknown unit: ");
                                                jK0 = 0;
                                                break;
                                        }
                                        j3 = jK0 * j6;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                qj.r("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            z80Var2 = z80.DAYS;
                            if (cCharAt2 == 'D') {
                                z80Var = z80Var2;
                            } else if (cCharAt2 == 'H') {
                                z80Var = z80.HOURS;
                            } else if (cCharAt2 == 'M') {
                                z80Var = z80.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                z80Var = null;
                            }
                            if (z80Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (z80Var3 == null && z80Var3.compareTo(z80Var) <= 0) {
                                qj.r("Unexpected order of duration components");
                                return 0L;
                            }
                            if (z80Var == z80Var2) {
                                if (i21 != 0) {
                                    qj.r("");
                                    return 0L;
                                }
                                jL = ex.l(j2, z80Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    qj.r("");
                                    return 0L;
                                }
                                jM = m(jL, ex.l(j2, z80Var) * ((long) i4));
                                if (jM == 9223372036854759646L) {
                                    qj.r("");
                                    return 0L;
                                }
                                jL = jM;
                            }
                            i20 = i3 + 1;
                            z80Var3 = z80Var;
                            i19 = i22;
                            i = i6;
                            c2 = '-';
                            c3 = '+';
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            z80Var = z80.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    qj.r("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                qj.r("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            z80Var2 = z80.DAYS;
                            if (cCharAt2 == 'D') {
                                z80Var = z80Var2;
                            } else if (cCharAt2 == 'H') {
                                z80Var = z80.HOURS;
                            } else if (cCharAt2 == 'M') {
                                z80Var = z80.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                z80Var = null;
                            }
                            if (z80Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (z80Var3 == null) {
                            }
                            if (z80Var == z80Var2) {
                                if (i21 != 0) {
                                    qj.r("");
                                    return 0L;
                                }
                                jL = ex.l(j2, z80Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    qj.r("");
                                    return 0L;
                                }
                                jM = m(jL, ex.l(j2, z80Var) * ((long) i4));
                                if (jM == 9223372036854759646L) {
                                    qj.r("");
                                    return 0L;
                                }
                                jL = jM;
                            }
                            i20 = i3 + 1;
                            z80Var3 = z80Var;
                            i19 = i22;
                            i = i6;
                            c2 = '-';
                            c3 = '+';
                        }
                        qj.r("");
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        z80Var = z80.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                qj.r("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            qj.r("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        z80Var2 = z80.DAYS;
                        if (cCharAt2 == 'D') {
                            z80Var = z80Var2;
                        } else if (cCharAt2 == 'H') {
                            z80Var = z80.HOURS;
                        } else if (cCharAt2 == 'M') {
                            z80Var = z80.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            z80Var = null;
                        }
                        if (z80Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (z80Var3 == null) {
                        }
                        if (z80Var == z80Var2) {
                            if (i21 != 0) {
                                qj.r("");
                                return 0L;
                            }
                            jL = ex.l(j2, z80Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                qj.r("");
                                return 0L;
                            }
                            jM = m(jL, ex.l(j2, z80Var) * ((long) i4));
                            if (jM == 9223372036854759646L) {
                                qj.r("");
                                return 0L;
                            }
                            jL = jM;
                        }
                        i20 = i3 + 1;
                        z80Var3 = z80Var;
                        i19 = i22;
                        i = i6;
                        c2 = '-';
                        c3 = '+';
                    }
                    qj.r("");
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    k41Var = k41Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    qj.r("");
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jE = w80.e(P(jL, z80.MILLISECONDS), P(j3, z80.NANOSECONDS));
        return (i23 == 0 || jE == w80.i) ? jE : w80.g(jE);
    }

    public static final void J(o52 o52Var, ae aeVar, int i) {
        while (true) {
            int i2 = o52Var.v;
            if (i > i2 && i < o52Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            o52Var.L();
            if (o52Var.x(o52Var.v)) {
                aeVar.s();
            }
            o52Var.i();
        }
    }

    public static final long L(dp0 dp0Var, di1 di1Var, cp0 cp0Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (di1Var == null) {
            return dp0Var.c;
        }
        int i = cp0Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (dp0Var.c >> 32));
        } else {
            if (i != 2) {
                return dp0Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (dp0Var.c & 4294967295L));
        }
        if (di1Var == di1.f) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final long M(dp0 dp0Var, di1 di1Var, cp0 cp0Var) {
        float fIntBitsToFloat;
        long j = dp0Var.g;
        if (di1Var == null) {
            return j;
        }
        int i = cp0Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (i != 2) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (di1Var == di1.f) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public static List N(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void O(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final long P(long j, z80 z80Var) {
        TimeUnit timeUnit = z80Var.e;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            w40 w40Var = w80.f;
            long j2 = jConvert2 << 1;
            int i = x80.a;
            return j2;
        }
        if (z80Var.compareTo(z80.MILLISECONDS) < 0) {
            return r(ex.i(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return r(ex.l(Math.abs(j), z80Var) * jSignum);
    }

    public static final g82 Q(h81 h81Var, ak0 ak0Var) {
        g81 g81Var = (g81) ak0Var.j(o61.a);
        int iOrdinal = h81Var.ordinal();
        if (iOrdinal == 0) {
            g81Var.getClass();
            g82 g82Var = g81.b;
            g82Var.getClass();
            return g82Var;
        }
        if (iOrdinal == 1) {
            g81Var.getClass();
            g82 g82Var2 = g81.c;
            g82Var2.getClass();
            return g82Var2;
        }
        if (iOrdinal == 2) {
            g81Var.getClass();
            g82 g82Var3 = g81.d;
            g82Var3.getClass();
            return g82Var3;
        }
        if (iOrdinal == 3) {
            g81Var.getClass();
            g82 g82Var4 = g81.e;
            g82Var4.getClass();
            return g82Var4;
        }
        if (iOrdinal == 4) {
            g81Var.getClass();
            g82 g82Var5 = g81.f;
            g82Var5.getClass();
            return g82Var5;
        }
        if (iOrdinal != 5) {
            qj.p();
            return null;
        }
        g81Var.getClass();
        g82 g82Var6 = g81.g;
        g82Var6.getClass();
        return g82Var6;
    }

    public static final int R(k01 k01Var) {
        List list = k01Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((l01) list.get(i2)).m;
        }
        return (i / list.size()) + k01Var.q;
    }

    public static final void c(h50 h50Var, ak0 ak0Var, int i) {
        h50 h50Var2;
        ak0 ak0Var2;
        h50 h50Var3 = h50Var;
        ak0 ak0Var3 = ak0Var;
        ak0Var3.X(294589392);
        if ((((ak0Var3.h(h50Var3) ? 4 : 2) | i) & 3) == 2 && ak0Var3.A()) {
            ak0Var3.R();
            h50Var2 = h50Var3;
            ak0Var2 = ak0Var3;
        } else {
            fw1 fw1VarD = ux.D(ak0Var3);
            jr1 jr1Var = h50Var3.b().e;
            da1 da1VarF = v12.f(jr1Var, jr1Var.e.getValue(), ak0Var3, 0, 0);
            List list = (List) da1VarF.getValue();
            boolean zBooleanValue = ((Boolean) ak0Var3.j(uq0.a)).booleanValue();
            boolean zF = ak0Var3.f(list);
            Object objL = ak0Var3.L();
            is1 is1Var = cv.a;
            Object obj = objL;
            if (zF || objL == is1Var) {
                h72 h72Var = new h72();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    kb1 kb1Var = (kb1) obj2;
                    if (zBooleanValue || kb1Var.l.j.h.compareTo(r11.h) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                h72Var.addAll(arrayList);
                ak0Var3.g0(h72Var);
                obj = h72Var;
            }
            h72 h72Var2 = (h72) obj;
            g(h72Var2, (List) da1VarF.getValue(), ak0Var3, 0);
            jr1 jr1Var2 = h50Var3.b().f;
            da1 da1VarF2 = v12.f(jr1Var2, jr1Var2.e.getValue(), ak0Var3, 0, 0);
            Object objL2 = ak0Var3.L();
            if (objL2 == is1Var) {
                objL2 = new h72();
                ak0Var3.g0(objL2);
            }
            h72 h72Var3 = (h72) objL2;
            ak0Var3.W(-367418626);
            ListIterator listIterator = h72Var2.listIterator();
            ak0 ak0Var4 = ak0Var3;
            while (true) {
                tm0 tm0Var = (tm0) listIterator;
                if (!tm0Var.hasNext()) {
                    break;
                }
                kb1 kb1Var2 = (kb1) tm0Var.next();
                zb1 zb1Var = kb1Var2.f;
                zb1Var.getClass();
                g50 g50Var = (g50) zb1Var;
                boolean zH = ak0Var4.h(h50Var3) | ak0Var4.h(kb1Var2);
                Object objL3 = ak0Var4.L();
                if (zH || objL3 == is1Var) {
                    objL3 = new n1(14, h50Var3, kb1Var2);
                    ak0Var4.g0(objL3);
                }
                ti0 ti0Var = (ti0) objL3;
                i50 i50Var = g50Var.j;
                h50 h50Var4 = h50Var3;
                fw1 fw1Var = fw1VarD;
                gt gtVarC = vs0.C(1129586364, new j10(kb1Var2, h50Var3, fw1VarD, h72Var3, g50Var, 3), ak0Var4);
                ak0 ak0Var5 = ak0Var4;
                p61.d(ti0Var, i50Var, gtVarC, ak0Var5, 384, 0);
                h50Var3 = h50Var4;
                h72Var3 = h72Var3;
                ak0Var4 = ak0Var5;
                fw1VarD = fw1Var;
            }
            h50Var2 = h50Var3;
            ak0 ak0Var6 = ak0Var4;
            h72 h72Var4 = h72Var3;
            ak0Var6.p(false);
            Set set = (Set) da1VarF2.getValue();
            boolean zF2 = ak0Var6.f(da1VarF2) | ak0Var6.h(h50Var2);
            Object objL4 = ak0Var6.L();
            if (zF2 || objL4 == is1Var) {
                objL4 = new d50(da1VarF2, h50Var2, h72Var4, null);
                ak0Var6.g0(objL4);
            }
            s5.p(set, h72Var4, (ij0) objL4, ak0Var6);
            ak0Var2 = ak0Var6;
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new x7(i, 8, h50Var2);
        }
    }

    public static y7 f(String str, vf2 vf2Var, long j, m40 m40Var, jg0 jg0Var, int i, int i2) {
        cb0 cb0Var = cb0.e;
        return new y7(new c8(str, vf2Var, cb0Var, cb0Var, jg0Var, m40Var), i, 1, j);
    }

    public static final void g(List list, Collection collection, ak0 ak0Var, int i) {
        ak0Var.X(1537894851);
        if ((((ak0Var.h(list) ? 4 : 2) | i | (ak0Var.h(collection) ? 32 : 16)) & 19) == 18 && ak0Var.A()) {
            ak0Var.R();
        } else {
            boolean zBooleanValue = ((Boolean) ak0Var.j(uq0.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                kb1 kb1Var = (kb1) it.next();
                b21 b21Var = kb1Var.l.j;
                boolean zG = ak0Var.g(zBooleanValue) | ak0Var.h(list) | ak0Var.h(kb1Var);
                Object objL = ak0Var.L();
                if (zG || objL == cv.a) {
                    objL = new c50(0, kb1Var, list, zBooleanValue);
                    ak0Var.g0(objL);
                }
                s5.e(b21Var, (ej0) objL, ak0Var);
            }
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(list, collection, i, 12);
        }
    }

    public static final void h(final boolean z, u71 u71Var, boolean z2, br1 br1Var, ak0 ak0Var, final int i) {
        int i2;
        final u71 u71Var2;
        final boolean z3;
        final br1 br1Var2;
        br1 br1Var3;
        boolean z4;
        long j;
        Object objT;
        ak0Var.X(408580840);
        if ((i & 6) == 0) {
            i2 = (ak0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(null) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 = i2 | 11648;
        }
        int i4 = 196608 | i3;
        if (ak0Var.O(i4 & 1, (74899 & i4) != 74898)) {
            ak0Var.T();
            int i5 = i & 1;
            r71 r71Var = r71.a;
            if (i5 == 0 || ak0Var.y()) {
                jr jrVar = (jr) ak0Var.j(lr.a);
                br1Var3 = jrVar.f0;
                if (br1Var3 == null) {
                    br1 br1Var4 = new br1(lr.d(jrVar, j20.N), lr.d(jrVar, j20.O), dr.b(0.38f, lr.d(jrVar, j20.K)), dr.b(0.38f, lr.d(jrVar, j20.L)));
                    jrVar.f0 = br1Var4;
                    br1Var3 = br1Var4;
                }
                u71Var2 = r71Var;
                z4 = true;
            } else {
                ak0Var.R();
                u71Var2 = u71Var;
                z4 = z2;
                br1Var3 = br1Var;
                r71Var = r71Var;
            }
            ak0Var.q();
            p82 p82VarA = ka.a(z ? 6.0f : 0.0f, Q(h81.f, ak0Var), ak0Var);
            br1Var3.getClass();
            if (z4 && z) {
                j = br1Var3.a;
            } else if (!z4 || z) {
                j = (z4 || !z) ? br1Var3.d : br1Var3.c;
            } else {
                j = br1Var3.b;
            }
            if (z4) {
                ak0Var.W(1194696477);
                objT = c52.a(j, Q(h81.g, ak0Var), ak0Var);
                ak0Var.p(false);
            } else {
                ak0Var.W(1194874138);
                objT = y12.t(new dr(j), ak0Var);
                ak0Var.p(false);
            }
            r71 r71Var2 = r71Var;
            u71 u71VarC0 = p61.c0(f52.p(u71Var2.c(r71Var2).c(r71Var2), 2), 2.0f);
            float f = j20.M;
            u71 u71VarC = u71VarC0.c(new e52(f, f, f, f, false));
            boolean zF = ak0Var.f(objT) | ak0Var.f(p82VarA);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new kc1(6, objT, p82VarA);
                ak0Var.g0(objL);
            }
            nj2.b(u71VarC, (ej0) objL, ak0Var, 0);
            br1Var2 = br1Var3;
            z3 = z4;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z3 = z2;
            br1Var2 = br1Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: cr1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rw.h(z, u71Var2, z3, br1Var2, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void i(final y42 y42Var, final boolean z, final ti0 ti0Var, final u32 u32Var, u71 u71Var, boolean z2, iz1 iz1Var, oj ojVar, gj1 gj1Var, ij0 ij0Var, final gt gtVar, ak0 ak0Var, final int i) {
        int i2;
        final u71 u71Var2;
        final boolean z3;
        final iz1 iz1Var2;
        final oj ojVar2;
        final gj1 gj1Var2;
        final ij0 ij0Var2;
        iz1 iz1Var3;
        long j;
        int i3;
        u71 u71Var3;
        oj ojVar3;
        iz1 iz1Var4;
        gj1 gj1Var3;
        ij0 ij0Var3;
        boolean z4;
        boolean z5;
        long j2;
        ij0 ij0Var4;
        long j3;
        int i4;
        ak0Var.X(1532041126);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(y42Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ti0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.f(u32Var) ? 2048 : 1024;
        }
        int i5 = 221184 | i2;
        if ((1572864 & i) == 0) {
            i5 = 745472 | i2;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = 905969664 | i5;
        if (ak0Var.O(i6 & 1, (306783379 & i6) != 306783378)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                kz1 kz1Var = kz1.a;
                jr jrVar = (jr) ak0Var.j(lr.a);
                iz1 iz1Var5 = jrVar.g0;
                if (iz1Var5 == null) {
                    kr krVar = ws0.F;
                    long jD = lr.d(jrVar, krVar);
                    long jD2 = lr.d(jrVar, ws0.G);
                    kr krVar2 = ws0.D;
                    long jD3 = lr.d(jrVar, krVar2);
                    long j4 = dr.f;
                    long jD4 = lr.d(jrVar, ws0.I);
                    long jD5 = lr.d(jrVar, krVar2);
                    long jD6 = lr.d(jrVar, krVar);
                    kr krVar3 = ws0.z;
                    long jD7 = lr.d(jrVar, krVar3);
                    float f = ws0.A;
                    long jB = dr.b(f, jD7);
                    long jD8 = lr.d(jrVar, krVar2);
                    float f2 = ws0.B;
                    iz1Var3 = new iz1(jD, jD2, jD3, j4, jD4, jD5, jD6, jB, dr.b(f2, jD8), j4, dr.b(f, lr.d(jrVar, krVar3)), dr.b(f2, lr.d(jrVar, krVar2)));
                    jrVar.g0 = iz1Var3;
                } else {
                    iz1Var3 = iz1Var5;
                }
                if (z) {
                    j = iz1Var3.c;
                } else {
                    j = !z ? iz1Var3.f : iz1Var3.l;
                }
                oj ojVarE = sv0.E(kz1.b, j);
                kj1 kj1Var = kz1.d;
                gt gtVarC = vs0.C(-643804033, new mz1(z), ak0Var);
                i3 = i6 & (-33030145);
                u71Var3 = r71.a;
                ojVar3 = ojVarE;
                iz1Var4 = iz1Var3;
                gj1Var3 = kj1Var;
                ij0Var3 = gtVarC;
                z4 = true;
            } else {
                ak0Var.R();
                z4 = z2;
                iz1Var4 = iz1Var;
                ojVar3 = ojVar;
                gj1Var3 = gj1Var;
                ij0Var3 = ij0Var;
                i3 = i6 & (-33030145);
                u71Var3 = u71Var;
            }
            ak0Var.q();
            ak0Var.W(-1579561419);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            iz1Var4.getClass();
            if (z4 && z) {
                z5 = z4;
                j2 = iz1Var4.a;
            } else {
                z5 = z4;
                if (!z5 || z) {
                    j2 = (z5 || !z) ? iz1Var4.j : iz1Var4.g;
                } else {
                    j2 = iz1Var4.d;
                }
            }
            if (z5 && z) {
                ij0Var4 = ij0Var3;
                j3 = iz1Var4.b;
            } else {
                ij0Var4 = ij0Var3;
                if (!z5 || z) {
                    j3 = (z5 || !z) ? iz1Var4.k : iz1Var4.h;
                } else {
                    j3 = iz1Var4.e;
                }
            }
            Object objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = new ak1(0);
                ak0Var.g0(objL2);
            }
            ak1 ak1Var = (ak1) objL2;
            boolean zF = ak0Var.f(f91Var);
            Object objL3 = ak0Var.L();
            if (zF || objL3 == obj) {
                i4 = 2;
                objL3 = new cv1(i4, null, f91Var, ak1Var);
                ak0Var.g0(objL3);
            } else {
                i4 = 2;
            }
            s5.o((ij0) objL3, ak0Var, f91Var);
            u71 u71VarA = f52.a(sv0.k0(y42Var.a(u71Var3, 1.0f), new g9(ak1Var, z, i4)), hl.c, hl.d);
            Object objL4 = ak0Var.L();
            if (objL4 == obj) {
                objL4 = new yw1(15);
                ak0Var.g0(objL4);
            }
            ij0 ij0Var5 = ij0Var4;
            boolean z6 = z5;
            gj1 gj1Var4 = gj1Var3;
            ra2.b(z, ti0Var, l02.a(u71VarA, false, (ej0) objL4), z6, u32Var, j2, j3, 0.0f, ojVar3, f91Var, vs0.C(-1208080836, new p00(ij0Var5, gtVar, gj1Var3, 3), ak0Var), ak0Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | (57344 & (i3 << 3)), 384);
            z3 = z6;
            ojVar2 = ojVar3;
            iz1Var2 = iz1Var4;
            ij0Var2 = ij0Var5;
            gj1Var2 = gj1Var4;
            u71Var2 = u71Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z3 = z2;
            iz1Var2 = iz1Var;
            ojVar2 = ojVar;
            gj1Var2 = gj1Var;
            ij0Var2 = ij0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: lz1
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    rw.i(y42Var, z, ti0Var, u32Var, u71Var2, z3, iz1Var2, ojVar2, gj1Var2, ij0Var2, gtVar, (ak0) obj2, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void j(ij0 ij0Var, gt gtVar, gj1 gj1Var, ak0 ak0Var, int i) {
        ak0Var.X(-1069265073);
        int i2 = 4;
        int i3 = (ak0Var.h(ij0Var) ? 4 : 2) | i | (ak0Var.h(gtVar) ? 32 : 16) | (ak0Var.f(gj1Var) ? 256 : 128);
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            wi wiVar = q90.j;
            u71 u71VarB0 = p61.b0(r71.a, gj1Var);
            w61 w61VarC = xj.c(wiVar, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarB0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            ef2.a(ik2.a(ws0.C, ak0Var), vs0.C(-1372614088, new p00(ij0Var, gtVar, Q(h81.f, ak0Var), i2), ak0Var), ak0Var, 48);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(ij0Var, gtVar, gj1Var, i, 13);
        }
    }

    public static final void k(u71 u71Var, float f, gt gtVar, ak0 ak0Var, int i) {
        ak0Var.X(2041406825);
        int i2 = i | 48;
        int i3 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            f = kz1.b;
            u71 u71VarS = dv1.S(f52.b(l02.a(u71Var, false, new yw1(16)), 0.0f, 40.0f, 1), qs0.e);
            sv1 sv1VarA = rv1.a(new he(-f, new ut(i3)), q90.p, ak0Var, 48);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarS);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, sv1VarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new y42();
                ak0Var.g0(objL);
            }
            gtVar.d((y42) objL, ak0Var, 54);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new k11(u71Var, f, gtVar, i);
        }
    }

    public static final void l(qk1 qk1Var, dp0 dp0Var, di1 di1Var, cp0 cp0Var, lp0 lp0Var, long j) {
        float fIntBitsToFloat;
        ArrayList arrayList = lp0Var.b;
        long j2 = dp0Var.c;
        boolean z = dp0Var.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (dp0Var.c & 4294967295L));
        boolean z2 = dp0Var.h;
        if (!z2 && z) {
            lp0Var.a = 0;
            arrayList.clear();
        }
        if (!o(dp0Var) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i = lp0Var.a;
                lp0Var.a = i + 1;
                arrayList.set(i, dp0Var);
            } else {
                arrayList.add(dp0Var);
            }
            if (lp0Var.a == 3) {
                lp0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((dp0) arrayList.get(i2)).c >> 32))));
            }
            fIntBitsToFloat2 = (float) vq.N(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((dp0) arrayList.get(i3)).c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) vq.N(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (di1Var != null) {
            int i4 = cp0Var.a;
            if (i4 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i4 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = di1Var == di1.f ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((w30) qk1Var.f).a(dp0Var.b, uf1.e(jFloatToRawIntBits, j));
    }

    public static final long m(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : ex.i(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final List n(jz0 jz0Var, qz0 qz0Var, ck ckVar) {
        lr0 lr0Var;
        fa1 fa1Var = ckVar.a;
        if (!(fa1Var.g != 0) && qz0Var.e.isEmpty()) {
            return cb0.e;
        }
        ArrayList arrayList = new ArrayList();
        if (ckVar.a.g != 0) {
            int i = fa1Var.g;
            if (i == 0) {
                fu1.k("MutableVector is empty.");
                return null;
            }
            Object[] objArr = fa1Var.e;
            int i2 = ((wy0) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((wy0) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                yp0.a("negative minIndex");
            }
            int i5 = fa1Var.g;
            if (i5 == 0) {
                fu1.k("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = fa1Var.e;
            int i6 = ((wy0) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((wy0) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            lr0Var = new lr0(i2, Math.min(i6, jz0Var.a() - 1), 1);
        } else {
            lr0Var = lr0.h;
        }
        int size = qz0Var.e.size();
        for (int i9 = 0; i9 < size; i9++) {
            pz0 pz0Var = (pz0) qz0Var.get(i9);
            int iQ = ei1.q(jz0Var, pz0Var.a, pz0Var.c);
            int i10 = lr0Var.e;
            if ((iQ > lr0Var.f || i10 > iQ) && iQ >= 0 && iQ < jz0Var.a()) {
                arrayList.add(Integer.valueOf(iQ));
            }
        }
        int i11 = lr0Var.e;
        int i12 = lr0Var.f;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static final boolean o(dp0 dp0Var) {
        return dp0Var.h && !dp0Var.d;
    }

    public static final String p(yt0 yt0Var, s12 s12Var) {
        s12Var.getClass();
        yt0Var.getClass();
        for (Annotation annotation : s12Var.getAnnotations()) {
            if (annotation instanceof du0) {
                return ((du0) annotation).discriminator();
            }
        }
        return yt0Var.a.e;
    }

    public static un2 q(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (un2) objNewInstance;
            } catch (IllegalAccessException e) {
                qj.m("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                qj.m("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            qj.m("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final long r(long j) {
        long j2 = (j << 1) + 1;
        w80.f.getClass();
        int i = x80.a;
        return j2;
    }

    public static final float s(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final ud t(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new ud(matcher, charSequence);
        }
        return null;
    }

    public static zb1 u(cc1 cc1Var) {
        Iterator it = o12.t(cc1Var, new o01(18)).iterator();
        if (!it.hasNext()) {
            fu1.k("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (zb1) next;
    }

    public static long v(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    tw.l(i6);
                    qj.e();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return tw.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long w(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    tw.l(i6);
                    qj.e();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return tw.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static Set y() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final void z(sw0 sw0Var) {
        qx.V(sw0Var).E();
    }

    public abstract int G(int i);

    public abstract int K(int i);

    @Override // defpackage.hz1
    public int a(int i) {
        return K(i);
    }

    @Override // defpackage.hz1
    public int b(int i) {
        return G(i);
    }

    @Override // defpackage.hz1
    public int d(int i) {
        int iG = G(i);
        if (iG == -1 || G(iG) == -1) {
            return -1;
        }
        return iG;
    }

    @Override // defpackage.hz1
    public int e(int i) {
        int iK = K(i);
        if (iK == -1 || K(iK) == -1) {
            return -1;
        }
        return iK;
    }

    public abstract void x(g42 g42Var, float f, float f2);
}

package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 implements uj1 {
    public final String e;
    public final vf2 f;
    public final List g;
    public final List h;
    public final jg0 i;
    public final m40 j;
    public final t9 k;
    public final CharSequence l;
    public final pw0 m;
    public ud n;
    public final boolean o;
    public final int p;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:218:0x0436  */
    /* JADX WARN: Code duplicated, block: B:234:0x047a  */
    /* JADX WARN: Code duplicated, block: B:246:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:249:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:257:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:259:0x051b  */
    /* JADX WARN: Code duplicated, block: B:262:0x052c  */
    /* JADX WARN: Code duplicated, block: B:264:0x0538  */
    /* JADX WARN: Code duplicated, block: B:273:0x054e  */
    /* JADX WARN: Code duplicated, block: B:286:0x056b  */
    /* JADX WARN: Code duplicated, block: B:289:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:291:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:296:0x05db  */
    /* JADX WARN: Code duplicated, block: B:298:0x05ea A[LOOP:8: B:297:0x05e8->B:298:0x05ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x0600  */
    /* JADX WARN: Code duplicated, block: B:303:0x0605  */
    /* JADX WARN: Code duplicated, block: B:305:0x060c  */
    /* JADX WARN: Code duplicated, block: B:307:0x0610  */
    /* JADX WARN: Code duplicated, block: B:308:0x0619  */
    /* JADX WARN: Code duplicated, block: B:310:0x0622  */
    /* JADX WARN: Code duplicated, block: B:321:0x065a  */
    /* JADX WARN: Code duplicated, block: B:326:0x0677  */
    /* JADX WARN: Code duplicated, block: B:328:0x0683  */
    /* JADX WARN: Code duplicated, block: B:335:0x0697  */
    /* JADX WARN: Code duplicated, block: B:387:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:389:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:391:0x07df  */
    /* JADX WARN: Code duplicated, block: B:398:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:412:0x084d  */
    /* JADX WARN: Code duplicated, block: B:414:0x085e  */
    /* JADX WARN: Code duplicated, block: B:415:0x0862  */
    /* JADX WARN: Code duplicated, block: B:417:0x086d  */
    /* JADX WARN: Code duplicated, block: B:420:0x0877 A[LOOP:6: B:419:0x0875->B:420:0x0877, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:423:0x0888  */
    /* JADX WARN: Code duplicated, block: B:425:0x0893  */
    /* JADX WARN: Code duplicated, block: B:427:0x08a0 A[LOOP:7: B:426:0x089e->B:427:0x08a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:430:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:434:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:446:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:425:0x0893, please report this as an issue */
    public c8(String str, vf2 vf2Var, List list, List list2, jg0 jg0Var, m40 m40Var) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        lh0 lh0Var;
        int i2;
        Typeface typeface;
        CharSequence charSequence;
        int length;
        int i3;
        xe2 xe2Var;
        wj1 wj1Var;
        ArrayList arrayList;
        int size;
        int i4;
        r72 r72Var;
        kg0 kg0Var;
        r72 r72Var2;
        in inVar;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        int i13;
        int i14;
        int size5;
        int i15;
        boolean z;
        List list3;
        m40 m40Var2;
        List list4;
        m40 m40Var3;
        xe2 xe2Var2;
        int size6;
        int i16;
        int i17;
        xb xbVar;
        long j;
        long jB;
        int size7;
        int i18;
        xb xbVar2;
        ub ubVar;
        int i19;
        m40 m40Var4;
        int i20;
        Object h11Var;
        xb xbVar3;
        Object obj2;
        m40 m40Var5;
        int i21;
        int i22;
        xb xbVar4;
        Object obj3;
        r72 r72Var3;
        int i23;
        long j2;
        long j3;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        ym1 ym1Var;
        CharSequence charSequence2;
        ym1 ym1Var2;
        this.e = str;
        this.f = vf2Var;
        this.g = list;
        this.h = list2;
        this.i = jg0Var;
        this.j = m40Var;
        float fB = m40Var.b();
        t9 t9Var = new t9(1);
        ((TextPaint) t9Var).density = fB;
        t9Var.b = ed2.b;
        t9Var.c = 3;
        t9Var.d = q32.d;
        this.k = t9Var;
        boolean z2 = ws0.z(vf2Var);
        r72 r72Var4 = vf2Var.a;
        wj1 wj1Var2 = vf2Var.b;
        int i24 = 0;
        if (z2) {
            ao2 ao2Var = ga0.a;
            ao2 ao2Var2 = ga0.a;
            p82 p82VarL = (p82) ao2Var2.f;
            if (p82VarL == null) {
                if (ca0.d()) {
                    p82VarL = ao2Var2.l();
                    ao2Var2.f = p82VarL;
                } else {
                    p82VarL = j20.x;
                }
            }
            zBooleanValue = ((Boolean) p82VarL.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.o = zBooleanValue;
        int i25 = wj1Var2.b;
        q31 q31Var = r72Var4.k;
        if (i25 == 4) {
            i = 2;
        } else if (i25 == 5) {
            i = 3;
        } else if (i25 == 1) {
            i = 0;
        } else if (i25 == 2) {
            i = 1;
        } else {
            if (i25 != 3 && i25 != 0) {
                fu1.h("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((q31Var == null || (locale = ((p31) q31Var.e.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.p = i;
        b8 b8Var = new b8(i24, this);
        mf2 mf2Var = wj1Var2.i;
        mf2Var = mf2Var == null ? mf2.c : mf2Var;
        t9Var.setFlags(mf2Var.b ? t9Var.getFlags() | 128 : t9Var.getFlags() & (-129));
        int i26 = mf2Var.a;
        if (i26 == 1) {
            t9Var.setFlags(t9Var.getFlags() | 64);
            t9Var.setHinting(0);
        } else if (i26 == 2) {
            t9Var.getFlags();
            t9Var.setHinting(1);
        } else if (i26 == 3) {
            t9Var.getFlags();
            t9Var.setHinting(0);
        } else {
            t9Var.getFlags();
        }
        int size8 = list.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i27);
            if (((xb) obj).a instanceof r72) {
                break;
            } else {
                i27++;
            }
        }
        boolean z3 = obj != null;
        long j4 = r72Var4.b;
        lh0 lh0Var2 = r72Var4.c;
        hh0 hh0Var = r72Var4.d;
        String str2 = r72Var4.g;
        q31 q31Var2 = r72Var4.k;
        ve2 ve2Var = r72Var4.a;
        we2 we2Var = r72Var4.j;
        long j5 = r72Var4.h;
        long jB4 = yf2.b(j4);
        boolean z4 = z3;
        if (zf2.a(jB4, 4294967296L)) {
            t9Var.setTextSize(m40Var.b0(j4));
        } else if (zf2.a(jB4, 8589934592L)) {
            t9Var.setTextSize(yf2.c(j4) * t9Var.getTextSize());
        }
        kg0 kg0Var2 = r72Var4.f;
        if (kg0Var2 != null || hh0Var != null || lh0Var2 != null) {
            if (lh0Var2 == null) {
                lh0Var = lh0.i;
            }
            if (hh0Var != null) {
                lh0Var = lh0Var2;
                i2 = hh0Var.a;
            } else {
                lh0Var = lh0Var2;
                i2 = 0;
            }
            ih0 ih0Var = r72Var4.e;
            int i28 = ih0Var != null ? ih0Var.a : 65535;
            c8 c8Var = (c8) b8Var.f;
            ek2 ek2VarB = ((lg0) c8Var.i).b(kg0Var2, lh0Var, i2, i28);
            if (ek2VarB instanceof dk2) {
                Object obj4 = ((dk2) ek2VarB).e;
                obj4.getClass();
                typeface = (Typeface) obj4;
            } else {
                ud udVar = new ud(ek2VarB, c8Var.n);
                c8Var.n = udVar;
                Object obj5 = udVar.d;
                obj5.getClass();
                typeface = (Typeface) obj5;
            }
            t9Var.setTypeface(typeface);
        }
        if (q31Var2 != null) {
            q31 q31Var3 = q31.g;
            if (!q31Var2.equals(qm1.a.h())) {
                ArrayList arrayList3 = new ArrayList(wq.G(q31Var2, 10));
                Iterator it = q31Var2.e.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((p31) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                t9Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            t9Var.setFontFeatureSettings(str2);
        }
        if (we2Var != null && !we2Var.equals(we2.c)) {
            t9Var.setTextScaleX(t9Var.getTextScaleX() * we2Var.a);
            t9Var.setTextSkewX(t9Var.getTextSkewX() + we2Var.b);
        }
        t9Var.d(ve2Var.b());
        t9Var.c(ve2Var.c(), 9205357640488583168L, ve2Var.a());
        t9Var.f(r72Var4.n);
        t9Var.g(r72Var4.m);
        t9Var.e(r72Var4.p);
        if (zf2.a(yf2.b(j5), 4294967296L) && yf2.c(j5) != 0.0f) {
            float textScaleX = t9Var.getTextScaleX() * t9Var.getTextSize();
            float fB0 = m40Var.b0(j5);
            if (textScaleX != 0.0f) {
                t9Var.setLetterSpacing(fB0 / textScaleX);
            }
        } else if (zf2.a(yf2.b(j5), 8589934592L)) {
            t9Var.setLetterSpacing(yf2.c(j5));
        }
        long j6 = r72Var4.l;
        th thVar = r72Var4.i;
        boolean z5 = z4 && zf2.a(yf2.b(j5), 4294967296L) && yf2.c(j5) != 0.0f;
        long j7 = dr.g;
        boolean z6 = (vk2.a(j6, j7) || vk2.a(j6, dr.f)) ? false : true;
        boolean z7 = (thVar == null || Float.compare(thVar.a, 0.0f) == 0) ? false : true;
        r72 r72Var5 = (z5 || z6 || z7) ? new r72(0L, 0L, (lh0) null, (hh0) null, (ih0) null, (kg0) null, (String) null, z5 ? j5 : yf2.c, z7 ? thVar : null, (we2) null, (q31) null, z6 ? j6 : j7, (ed2) null, (q32) null, 63103) : null;
        List list5 = this.g;
        if (r72Var5 != null) {
            int size9 = list5.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i29 = 0;
            while (i29 < size9) {
                arrayList4.add(i29 == 0 ? new xb(0, this.e.length(), r72Var5) : (xb) this.g.get(i29 - 1));
                i29++;
            }
            list5 = arrayList4;
        }
        String str3 = this.e;
        float textSize = this.k.getTextSize();
        vf2 vf2Var2 = this.f;
        List list6 = this.h;
        m40 m40Var6 = this.j;
        boolean z8 = this.o;
        z7 z7Var = a8.a;
        if (z8 && ca0.d()) {
            ln1 ln1Var = vf2Var2.c;
            ra0 ra0Var = (ln1Var == null || (ym1Var2 = ln1Var.b) == null) ? null : new ra0(ym1Var2.b);
            CharSequence charSequenceG = ca0.a().g(str3, 0, str3.length(), (ra0Var != null && ra0Var.a == 2) ? 1 : 0);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!list5.isEmpty() || !list6.isEmpty() || !ws0.j(vf2Var2.b.d, xe2.c) || (vf2Var2.b.c & 1095216660480L) != 0) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            r72 r72Var6 = vf2Var2.a;
            wj1 wj1Var3 = vf2Var2.b;
            if (ws0.j(r72Var6.m, ed2.c)) {
                spannableString.setSpan(a8.a, 0, str3.length(), 33);
            }
            ln1 ln1Var2 = vf2Var2.c;
            if (((ln1Var2 == null || (ym1Var = ln1Var2.b) == null) ? false : ym1Var.a) && wj1Var3.f == null) {
                float fR = c12.r(wj1Var3.c, textSize, m40Var6);
                if (!Float.isNaN(fR)) {
                    spannableString.setSpan(new k21(fR), 0, spannableString.length(), 33);
                }
            } else {
                o21 o21Var = wj1Var3.f;
                o21Var = o21Var == null ? o21.d : o21Var;
                float fR2 = c12.r(wj1Var3.c, textSize, m40Var6);
                if (!Float.isNaN(fR2)) {
                    if (spannableString.length() == 0) {
                        length = spannableString.length() + 1;
                    } else {
                        if (spannableString.length() == 0) {
                            fu1.k("Char sequence is empty.");
                            throw null;
                        }
                        if (spannableString.charAt(spannableString.length() - 1) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                    }
                    int i30 = length;
                    int i31 = o21Var.b;
                    i3 = 0;
                    spannableString.setSpan(new p21(fR2, i30, (i31 & 1) > 0, (i31 & 16) > 0, o21Var.a, o21Var.c), 0, spannableString.length(), 33);
                }
                xe2Var = wj1Var3.d;
                if (xe2Var != null) {
                    i23 = i3;
                    j2 = xe2Var.a;
                    j3 = xe2Var.b;
                    if ((!yf2.a(j2, r02.k(i23)) && yf2.a(j3, r02.k(i23))) || (j2 & 1095216660480L) == r13 || (j3 & 1095216660480L) == 0) {
                        wj1Var = wj1Var3;
                    } else {
                        jB2 = yf2.b(j2);
                        wj1Var = wj1Var3;
                        if (zf2.a(jB2, 4294967296L)) {
                            fC = m40Var6.b0(j2);
                        } else if (zf2.a(jB2, 8589934592L)) {
                            fC = yf2.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = yf2.b(j3);
                        if (zf2.a(jB3, 4294967296L)) {
                            fC2 = m40Var6.b0(j3);
                        } else if (zf2.a(jB3, 8589934592L)) {
                            fC2 = yf2.c(j3) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                } else {
                    wj1Var = wj1Var3;
                }
                arrayList = new ArrayList(list5.size());
                size = list5.size();
                for (i4 = 0; i4 < size; i4++) {
                    xbVar4 = (xb) list5.get(i4);
                    obj3 = xbVar4.a;
                    if (obj3 instanceof r72) {
                        r72Var3 = (r72) obj3;
                        if (r72Var3.f == null || r72Var3.d != null || r72Var3.c != null || ((r72) obj3).e != null) {
                            arrayList.add(xbVar4);
                        }
                    }
                }
                r72Var = vf2Var2.a;
                kg0Var = r72Var.f;
                if (kg0Var != null && r72Var.d == null && r72Var.c == null && r72Var.e == null) {
                    r72Var2 = null;
                } else {
                    r72Var2 = new r72(0L, 0L, r72Var.c, r72Var.d, r72Var.e, kg0Var, (String) null, 0L, (th) null, (we2) null, (q31) null, 0L, (ed2) null, (q32) null, 65475);
                }
                inVar = new in(12, spannableString, b8Var);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        xb xbVar5 = (xb) arrayList.get(i6);
                        iArr[i6] = xbVar5.b;
                        iArr[i6 + size2] = xbVar5.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        fu1.k("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                        } else {
                            size4 = arrayList.size();
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                xb xbVar6 = (xb) arrayList.get(i10);
                                int i32 = i8;
                                i13 = xbVar6.b;
                                int i33 = i5;
                                i14 = xbVar6.c;
                                if (i13 == i14 && zb.b(i7, i9, i13, i14)) {
                                    r72 r72Var7 = (r72) xbVar6.a;
                                    r72Var2 = r72Var2 != null ? r72Var2.c(r72Var7) : r72Var7;
                                }
                                i10++;
                                i8 = i32;
                                arrayList = arrayList5;
                                i5 = i33;
                            }
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                            if (r72Var2 != null) {
                                inVar.d(r72Var2, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        r72Var2 = r72Var2;
                        arrayList = arrayList2;
                        i5 = i12;
                    }
                } else if (!arrayList.isEmpty()) {
                    r72 r72Var8 = (r72) ((xb) arrayList.get(0)).a;
                    inVar.d(r72Var2 != null ? r72Var2.c(r72Var8) : r72Var8, Integer.valueOf(((xb) arrayList.get(0)).b), Integer.valueOf(((xb) arrayList.get(0)).c));
                }
                size5 = list5.size();
                i15 = 0;
                z = false;
                while (i15 < size5) {
                    xbVar3 = (xb) list5.get(i15);
                    obj2 = xbVar3.a;
                    if (obj2 instanceof r72) {
                        i21 = xbVar3.b;
                        int i34 = xbVar3.c;
                        if (i21 >= 0 || i21 >= spannableString.length() || i34 <= i21 || i34 > spannableString.length()) {
                            size5 = size5;
                            i15 = i15;
                            list5 = list5;
                            m40Var5 = m40Var6;
                        } else {
                            r72 r72Var9 = (r72) obj2;
                            long j8 = r72Var9.h;
                            th thVar2 = r72Var9.i;
                            ve2 ve2Var2 = r72Var9.a;
                            if (thVar2 != null) {
                                spannableString.setSpan(new uh(0, thVar2.a), i21, i34, 33);
                            }
                            c12.u(spannableString, ve2Var2.b(), i21, i34);
                            rk rkVarC = ve2Var2.c();
                            float fA = ve2Var2.a();
                            if (rkVarC != null) {
                                if (rkVarC instanceof o72) {
                                    c12.u(spannableString, ((o72) rkVarC).a, i21, i34);
                                } else {
                                    spannableString.setSpan(new p32((sk) rkVarC, fA), i21, i34, 33);
                                }
                            }
                            ed2 ed2Var = r72Var9.m;
                            if (ed2Var != null) {
                                int i35 = ed2Var.a;
                                fd2 fd2Var = new fd2((i35 | 1) == i35, (i35 | 2) == i35);
                                i22 = 33;
                                spannableString.setSpan(fd2Var, i21, i34, 33);
                            } else {
                                i22 = 33;
                            }
                            int i36 = i22;
                            c12.w(spannableString, r72Var9.b, m40Var6, i21, i34);
                            String str4 = r72Var9.g;
                            if (str4 != null) {
                                spannableString.setSpan(new ng0(0, str4), i21, i34, i36);
                            }
                            we2 we2Var2 = r72Var9.j;
                            if (we2Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(we2Var2.a), i21, i34, i36);
                                spannableString.setSpan(new uh(1, we2Var2.b), i21, i34, i36);
                            }
                            c12.z(spannableString, r72Var9.k, i21, i34);
                            m40Var5 = m40Var6;
                            long j9 = r72Var9.l;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(ws0.V(j9)), i21, i34, i36);
                            }
                            q32 q32Var = r72Var9.n;
                            if (q32Var != null) {
                                long j10 = q32Var.b;
                                int iV = ws0.V(q32Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = q32Var.c;
                                t32 t32Var = new t32(iV, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                i21 = i21;
                                i36 = 33;
                                spannableString.setSpan(t32Var, i21, i34, 33);
                            }
                            m80 m80Var = r72Var9.p;
                            if (m80Var != null) {
                                spannableString.setSpan(new n80(m80Var), i21, i34, i36);
                            }
                            if (zf2.a(yf2.b(j8), 4294967296L) || zf2.a(yf2.b(j8), 8589934592L)) {
                                z = true;
                            }
                        }
                    } else {
                        size5 = size5;
                        i15 = i15;
                        list5 = list5;
                        m40Var5 = m40Var6;
                    }
                    i15++;
                    list5 = list5;
                    m40Var6 = m40Var5;
                    size5 = size5;
                }
                list3 = list5;
                m40Var2 = m40Var6;
                if (z) {
                    size7 = list3.size();
                    i18 = 0;
                    while (i18 < size7) {
                        List list7 = list3;
                        xbVar2 = (xb) list7.get(i18);
                        ubVar = (ub) xbVar2.a;
                        if (ubVar instanceof r72) {
                            i20 = xbVar2.b;
                            int i37 = xbVar2.c;
                            if (i20 >= 0 || i20 >= spannableString.length() || i37 <= i20 || i37 > spannableString.length()) {
                                i19 = size7;
                                m40Var4 = m40Var2;
                            } else {
                                long j11 = ((r72) ubVar).h;
                                long jB5 = yf2.b(j11);
                                m40 m40Var7 = m40Var2;
                                i19 = size7;
                                if (zf2.a(jB5, 4294967296L)) {
                                    m40Var4 = m40Var7;
                                    h11Var = new i11(m40Var4.b0(j11));
                                } else {
                                    m40Var4 = m40Var7;
                                    h11Var = zf2.a(jB5, 8589934592L) ? new h11(yf2.c(j11)) : null;
                                }
                                if (h11Var != null) {
                                    spannableString.setSpan(h11Var, i20, i37, 33);
                                }
                            }
                        } else {
                            i19 = size7;
                            m40Var4 = m40Var2;
                        }
                        i18++;
                        m40Var2 = m40Var4;
                        size7 = i19;
                        list3 = list7;
                    }
                }
                list4 = list3;
                m40Var3 = m40Var2;
                xe2Var2 = wj1Var.d;
                if (xe2Var2 != null) {
                    j = xe2Var2.a;
                    jB = yf2.b(j);
                    if (zf2.a(jB, 4294967296L)) {
                        m40Var3.b0(j);
                    } else if (zf2.a(jB, 8589934592L)) {
                        yf2.c(j);
                    }
                }
                size6 = list4.size();
                for (i16 = 0; i16 < size6; i16++) {
                    Object obj6 = ((xb) list4.get(i16)).a;
                }
                charSequence2 = spannableString;
                if (list6.size() > 0) {
                    xbVar = (xb) list6.get(0);
                    if (xbVar.a == null) {
                        fu1.c();
                        throw null;
                    }
                    for (Object obj7 : spannableString.getSpans(xbVar.b, xbVar.c, ak2.class)) {
                        spannableString.removeSpan((ak2) obj7);
                    }
                    throw null;
                }
            }
            i3 = 0;
            xe2Var = wj1Var3.d;
            if (xe2Var != null) {
                i23 = i3;
                j2 = xe2Var.a;
                j3 = xe2Var.b;
                if (!yf2.a(j2, r02.k(i23))) {
                    jB2 = yf2.b(j2);
                    wj1Var = wj1Var3;
                    if (zf2.a(jB2, 4294967296L)) {
                        fC = m40Var6.b0(j2);
                    } else if (zf2.a(jB2, 8589934592L)) {
                        fC = yf2.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = yf2.b(j3);
                    if (zf2.a(jB3, 4294967296L)) {
                        fC2 = m40Var6.b0(j3);
                    } else if (zf2.a(jB3, 8589934592L)) {
                        fC2 = yf2.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = yf2.b(j2);
                    wj1Var = wj1Var3;
                    if (zf2.a(jB2, 4294967296L)) {
                        fC = m40Var6.b0(j2);
                    } else if (zf2.a(jB2, 8589934592L)) {
                        fC = yf2.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = yf2.b(j3);
                    if (zf2.a(jB3, 4294967296L)) {
                        fC2 = m40Var6.b0(j3);
                    } else if (zf2.a(jB3, 8589934592L)) {
                        fC2 = yf2.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            } else {
                wj1Var = wj1Var3;
            }
            arrayList = new ArrayList(list5.size());
            size = list5.size();
            while (i4 < size) {
                xbVar4 = (xb) list5.get(i4);
                obj3 = xbVar4.a;
                if (obj3 instanceof r72) {
                    r72Var3 = (r72) obj3;
                    if (r72Var3.f == null) {
                        arrayList.add(xbVar4);
                    } else {
                        arrayList.add(xbVar4);
                    }
                }
            }
            r72Var = vf2Var2.a;
            kg0Var = r72Var.f;
            if (kg0Var != null) {
                r72Var2 = new r72(0L, 0L, r72Var.c, r72Var.d, r72Var.e, kg0Var, (String) null, 0L, (th) null, (we2) null, (q31) null, 0L, (ed2) null, (q32) null, 65475);
            } else {
                r72Var2 = new r72(0L, 0L, r72Var.c, r72Var.d, r72Var.e, kg0Var, (String) null, 0L, (th) null, (we2) null, (q31) null, 0L, (ed2) null, (q32) null, 65475);
            }
            inVar = new in(12, spannableString, b8Var);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    xb xbVar7 = (xb) arrayList.get(i6);
                    iArr[i6] = xbVar7.b;
                    iArr[i6 + size2] = xbVar7.c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    fu1.k("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        i11 = i8;
                        i12 = i5;
                    } else {
                        size4 = arrayList.size();
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList6 = arrayList;
                            xb xbVar8 = (xb) arrayList.get(i10);
                            int i38 = i8;
                            i13 = xbVar8.b;
                            int i39 = i5;
                            i14 = xbVar8.c;
                            if (i13 == i14) {
                            }
                            i10++;
                            i8 = i38;
                            arrayList = arrayList6;
                            i5 = i39;
                        }
                        arrayList2 = arrayList;
                        i11 = i8;
                        i12 = i5;
                        if (r72Var2 != null) {
                            inVar.d(r72Var2, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    r72Var2 = r72Var2;
                    arrayList = arrayList2;
                    i5 = i12;
                }
            } else if (!arrayList.isEmpty()) {
                r72 r72Var10 = (r72) ((xb) arrayList.get(0)).a;
                inVar.d(r72Var2 != null ? r72Var2.c(r72Var10) : r72Var10, Integer.valueOf(((xb) arrayList.get(0)).b), Integer.valueOf(((xb) arrayList.get(0)).c));
            }
            size5 = list5.size();
            i15 = 0;
            z = false;
            while (i15 < size5) {
                xbVar3 = (xb) list5.get(i15);
                obj2 = xbVar3.a;
                if (obj2 instanceof r72) {
                    i21 = xbVar3.b;
                    int i310 = xbVar3.c;
                    if (i21 >= 0) {
                        size5 = size5;
                        i15 = i15;
                        list5 = list5;
                        m40Var5 = m40Var6;
                    } else {
                        size5 = size5;
                        i15 = i15;
                        list5 = list5;
                        m40Var5 = m40Var6;
                    }
                } else {
                    size5 = size5;
                    i15 = i15;
                    list5 = list5;
                    m40Var5 = m40Var6;
                }
                i15++;
                list5 = list5;
                m40Var6 = m40Var5;
                size5 = size5;
            }
            list3 = list5;
            m40Var2 = m40Var6;
            if (z) {
                size7 = list3.size();
                i18 = 0;
                while (i18 < size7) {
                    List list8 = list3;
                    xbVar2 = (xb) list8.get(i18);
                    ubVar = (ub) xbVar2.a;
                    if (ubVar instanceof r72) {
                        i20 = xbVar2.b;
                        int i311 = xbVar2.c;
                        if (i20 >= 0) {
                            i19 = size7;
                            m40Var4 = m40Var2;
                        } else {
                            i19 = size7;
                            m40Var4 = m40Var2;
                        }
                    } else {
                        i19 = size7;
                        m40Var4 = m40Var2;
                    }
                    i18++;
                    m40Var2 = m40Var4;
                    size7 = i19;
                    list3 = list8;
                }
            }
            list4 = list3;
            m40Var3 = m40Var2;
            xe2Var2 = wj1Var.d;
            if (xe2Var2 != null) {
                j = xe2Var2.a;
                jB = yf2.b(j);
                if (zf2.a(jB, 4294967296L)) {
                    m40Var3.b0(j);
                } else if (zf2.a(jB, 8589934592L)) {
                    yf2.c(j);
                }
            }
            size6 = list4.size();
            while (i16 < size6) {
                Object obj8 = ((xb) list4.get(i16)).a;
            }
            charSequence2 = spannableString;
            if (list6.size() > 0) {
                xbVar = (xb) list6.get(0);
                if (xbVar.a == null) {
                    fu1.c();
                    throw null;
                }
                while (i17 < r1) {
                    spannableString.removeSpan((ak2) obj7);
                }
                throw null;
            }
        }
        charSequence2 = charSequence;
        this.l = charSequence2;
        this.m = new pw0(charSequence2, this.k, this.p);
    }

    @Override // defpackage.uj1
    public final float a() {
        pw0 pw0Var = this.m;
        float f = pw0Var.e;
        TextPaint textPaint = pw0Var.b;
        if (!Float.isNaN(f)) {
            return pw0Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = pw0Var.a;
        lineInstance.setText(new cp(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, ws0.x);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new lr0(i, next, 1));
            } else {
                lr0 lr0Var = (lr0) priorityQueue.peek();
                if (lr0Var != null && lr0Var.f - lr0Var.e < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new lr0(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                qj.t();
                return 0.0f;
            }
            lr0 lr0Var2 = (lr0) it.next();
            desiredWidth = Layout.getDesiredWidth(pw0Var.b(), lr0Var2.e, lr0Var2.f, textPaint);
            while (it.hasNext()) {
                lr0 lr0Var3 = (lr0) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(pw0Var.b(), lr0Var3.e, lr0Var3.f, textPaint));
            }
        }
        pw0Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.uj1
    public final boolean b() {
        ud udVar = this.n;
        if (udVar != null ? udVar.q() : false) {
            return true;
        }
        if (!this.o && ws0.z(this.f)) {
            ao2 ao2Var = ga0.a;
            ao2 ao2Var2 = ga0.a;
            p82 p82VarL = (p82) ao2Var2.f;
            if (p82VarL == null) {
                if (ca0.d()) {
                    p82VarL = ao2Var2.l();
                    ao2Var2.f = p82VarL;
                } else {
                    p82VarL = j20.x;
                }
            }
            if (((Boolean) p82VarL.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uj1
    public final float c() {
        return this.m.c();
    }
}

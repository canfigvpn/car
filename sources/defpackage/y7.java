package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y7 {
    public final c8 a;
    public final int b;
    public final long c;
    public final ff2 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0213  */
    /* JADX WARN: Code duplicated, block: B:139:0x0216  */
    /* JADX WARN: Code duplicated, block: B:141:0x0230  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:145:0x024e A[LOOP:1: B:144:0x024c->B:145:0x024e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x0279  */
    /* JADX WARN: Code duplicated, block: B:149:0x027d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0295  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:154:0x02af  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02da  */
    /* JADX WARN: Code duplicated, block: B:187:0x032c  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x024a, please report this as an issue */
    public y7(c8 c8Var, int i, int i2, long j) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        ff2 ff2VarA;
        int i9;
        y7 y7Var;
        int i10;
        Layout layout;
        Spanned spanned;
        p32[] p32VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i11;
        List list;
        int spanEnd;
        int lineForOffset;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int i13;
        CharSequence charSequence2 = c8Var.l;
        this.a = c8Var;
        this.b = i;
        this.c = j;
        if (sw.i(j) != 0 || sw.j(j) != 0) {
            wp0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            wp0.a("maxLines should be greater than 0");
        }
        vf2 vf2Var = c8Var.f;
        if (i2 == 2) {
            i3 = 0;
            if (!yf2.a(vf2Var.a.h, r02.k(0)) && !yf2.a(vf2Var.a.h, yf2.c) && (i13 = vf2Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!j12.i(spannableString, uo0.class)) {
                    spannableString.setSpan(new uo0(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        wj1 wj1Var = vf2Var.b;
        r72 r72Var = vf2Var.a;
        int i14 = wj1Var.a;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        Throwable th = null;
        int i17 = wj1Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = wj1Var.g;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                i8 = i17;
                truncateAt = TextUtils.TruncateAt.START;
                c = ' ';
            } else {
                i8 = i17;
                r72Var = r72Var;
                truncateAt = null;
                c = ' ';
            }
            ff2VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = ff2VarA.f;
            if (Build.VERSION.SDK_INT < 35 || c8Var.k.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                y7Var = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                y7Var = this;
                i10 = i;
                ff2VarA = y7Var.a(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = ff2VarA.g;
            if (i2 == i9 || ff2VarA.a() <= sw.g(j) || i10 <= 1) {
                y7Var.d = ff2VarA;
            } else {
                int iG = sw.g(j);
                for (int i23 = 0; i23 < i22; i23++) {
                    if (ff2VarA.e(i23) > iG) {
                        i22 = i23;
                        break;
                    }
                }
                if (i22 >= 0 && i22 != y7Var.b) {
                    ff2VarA = y7Var.a(i15, i16, truncateAt, i22 < 1 ? 1 : i22, i8, i4, i5, i7, y7Var.e);
                }
                y7Var.d = ff2VarA;
            }
            r72 r72Var2 = r72Var;
            y7Var.a.k.c(r72Var2.a.c(), (((long) Float.floatToRawIntBits(y7Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(y7Var.d())) << c), r72Var2.a.a());
            layout = ff2VarA.f;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned = (Spanned) text;
                if (spanned.nextSpanTransition(-1, spanned.length(), p32.class) != spanned.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    p32VarArr = (p32[]) ((Spanned) text2).getSpans(0, layout.getText().length(), p32.class);
                } else {
                    p32VarArr = null;
                }
            } else {
                p32VarArr = null;
            }
            if (p32VarArr != null) {
                for (p32 p32Var : p32VarArr) {
                    p32Var.g.setValue(new d52((((long) Float.floatToRawIntBits(y7Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(y7Var.d())) << c)));
                }
            }
            charSequence = y7Var.e;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                spans = spanned2.getSpans(0, charSequence.length(), mm1.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i11 = 0;
                while (i11 < length) {
                    mm1 mm1Var = (mm1) spans[i11];
                    int spanStart = spanned2.getSpanStart(mm1Var);
                    spanEnd = spanned2.getSpanEnd(mm1Var);
                    lineForOffset = y7Var.d.f.getLineForOffset(spanStart);
                    if (lineForOffset >= y7Var.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (y7Var.d.f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= y7Var.d.f.getEllipsisStart(lineForOffset) + y7Var.d.f.getLineStart(lineForOffset)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > y7Var.d.f(lineForOffset)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3) {
                        if (!z) {
                            boolean z4 = y7Var.d.f.getParagraphDirection(lineForOffset) == 1;
                            boolean zIsRtlCharAt = y7Var.d.f.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                y7Var.d.h(spanStart, false);
                                mm1Var.b();
                                throw th;
                            }
                            if (z4 && zIsRtlCharAt) {
                                y7Var.d.i(spanStart, false);
                                mm1Var.b();
                                throw th;
                            }
                            ff2 ff2Var = y7Var.d;
                            if (zIsRtlCharAt) {
                                ff2Var.h(spanStart, false);
                                mm1Var.b();
                                throw th;
                            }
                            ff2Var.i(spanStart, false);
                            mm1Var.b();
                            throw th;
                        }
                    }
                    arrayList.add(th);
                    i11++;
                    th = th;
                }
                list = arrayList;
            } else {
                list = cb0.e;
            }
            y7Var.f = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        ff2VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = ff2VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            y7Var = this;
            i10 = i;
        } else {
            i9 = 2;
            y7Var = this;
            i10 = i;
        }
        int i24 = ff2VarA.g;
        if (i2 == i9) {
            y7Var.d = ff2VarA;
        } else {
            y7Var.d = ff2VarA;
        }
        r72 r72Var3 = r72Var;
        y7Var.a.k.c(r72Var3.a.c(), (((long) Float.floatToRawIntBits(y7Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(y7Var.d())) << c), r72Var3.a.a());
        layout = ff2VarA.f;
        if (layout.getText() instanceof Spanned) {
            p32VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), p32.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                p32VarArr = (p32[]) ((Spanned) text4).getSpans(0, layout.getText().length(), p32.class);
            } else {
                p32VarArr = null;
            }
        }
        if (p32VarArr != null) {
            while (i12 < r2) {
                p32Var.g.setValue(new d52((((long) Float.floatToRawIntBits(y7Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(y7Var.d())) << c)));
            }
        }
        charSequence = y7Var.e;
        if (charSequence instanceof Spanned) {
            list = cb0.e;
        } else {
            spanned2 = (Spanned) charSequence;
            spans = spanned2.getSpans(0, charSequence.length(), mm1.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i11 = 0;
            while (i11 < length) {
                mm1 mm1Var2 = (mm1) spans[i11];
                int spanStart2 = spanned2.getSpanStart(mm1Var2);
                spanEnd = spanned2.getSpanEnd(mm1Var2);
                lineForOffset = y7Var.d.f.getLineForOffset(spanStart2);
                if (lineForOffset >= y7Var.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (y7Var.d.f.getEllipsisCount(lineForOffset) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > y7Var.d.f(lineForOffset)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(th);
                i11++;
                th = th;
            }
            list = arrayList;
        }
        y7Var.f = list;
    }

    public final ff2 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        ym1 ym1Var;
        float fD = d();
        c8 c8Var = this.a;
        t9 t9Var = c8Var.k;
        int i8 = c8Var.p;
        pw0 pw0Var = c8Var.m;
        vf2 vf2Var = c8Var.f;
        z7 z7Var = a8.a;
        ln1 ln1Var = vf2Var.c;
        return new ff2(charSequence, fD, t9Var, i, truncateAt, i8, (ln1Var == null || (ym1Var = ln1Var.b) == null) ? false : ym1Var.a, i3, i5, i6, i7, i4, i2, pw0Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    public final long c(yr1 yr1Var, int i, fu1 fu1Var) {
        hz1 xk0Var;
        int i2;
        int[] iArrE;
        RectF rectFK = ux.K(yr1Var);
        int i3 = 0;
        int i4 = (i != 0 && i == 1) ? 1 : 0;
        x7 x7Var = new x7(i3, fu1Var);
        ff2 ff2Var = this.d;
        Layout layout = ff2Var.f;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            iArrE = t0.e(ff2Var, rectFK, i4, x7Var);
        } else {
            xf xfVarC = ff2Var.c();
            if (i4 == 1) {
                xk0Var = new ru1(12, layout.getText(), ff2Var.j());
            } else {
                CharSequence text = layout.getText();
                xk0Var = i5 >= 29 ? new xk0(text, ff2Var.a) : new yk0(text);
            }
            hz1 hz1Var = xk0Var;
            int lineForVertical = layout.getLineForVertical((int) rectFK.top);
            if (rectFK.top <= ff2Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < ff2Var.g) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFK.bottom);
                if (lineForVertical2 != 0 || rectFK.bottom >= ff2Var.g(0)) {
                    int iH = c22.h(ff2Var, layout, xfVarC, i6, rectFK, hz1Var, x7Var, true);
                    while (true) {
                        i2 = i6;
                        if (iH != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iH = c22.h(ff2Var, layout, xfVarC, i6, rectFK, hz1Var, x7Var, true);
                    }
                    if (iH == -1) {
                        iArrE = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iH2 = c22.h(ff2Var, layout, xfVarC, i7, rectFK, hz1Var, x7Var, false);
                        while (iH2 == -1 && i2 < i7) {
                            i7--;
                            iH2 = c22.h(ff2Var, layout, xfVarC, i7, rectFK, hz1Var, x7Var, false);
                        }
                        if (iH2 == -1) {
                            iArrE = null;
                        } else {
                            iArrE = new int[]{hz1Var.a(iH + 1), hz1Var.b(iH2 - 1)};
                        }
                    }
                } else {
                    iArrE = null;
                }
            } else {
                iArrE = null;
            }
        }
        return iArrE == null ? of2.b : j02.c(iArrE[0], iArrE[1]);
    }

    public final float d() {
        return sw.h(this.c);
    }

    public final void e(sm smVar) {
        Canvas canvasA = k4.a(smVar);
        ff2 ff2Var = this.d;
        if (ff2Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = ff2Var.h;
        if (canvasA.getClipBounds(ff2Var.o)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = jf2.a;
            Object ic2Var = threadLocal.get();
            if (ic2Var == null) {
                ic2Var = new ic2();
                threadLocal.set(ic2Var);
            }
            ic2 ic2Var2 = (ic2) ic2Var;
            ic2Var2.a = canvasA;
            try {
                ff2Var.f.draw(ic2Var2);
                ic2Var2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                ic2Var2.a = null;
                throw th;
            }
        }
        if (ff2Var.d) {
            canvasA.restore();
        }
    }

    public final void f(sm smVar, long j, q32 q32Var, ed2 ed2Var, m80 m80Var) {
        t9 t9Var = this.a.k;
        int i = t9Var.c;
        t9Var.d(j);
        t9Var.f(q32Var);
        t9Var.g(ed2Var);
        t9Var.e(m80Var);
        t9Var.b(3);
        e(smVar);
        t9Var.b(i);
    }

    public final void g(sm smVar, rk rkVar, float f, q32 q32Var, ed2 ed2Var, m80 m80Var) {
        t9 t9Var = this.a.k;
        int i = t9Var.c;
        float fD = d();
        t9Var.c(rkVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        t9Var.f(q32Var);
        t9Var.g(ed2Var);
        t9Var.e(m80Var);
        t9Var.b(3);
        e(smVar);
        t9Var.b(i);
    }
}

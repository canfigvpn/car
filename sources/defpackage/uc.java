package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uc {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public uc(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            wp0.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            wp0.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new cp(charSequence, i));
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new gc(i, 1, this));
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        wp0.a("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public int c() {
        vp vpVar = (vp) this.e;
        String str = (String) this.d;
        if (vpVar == null) {
            return str.length();
        }
        return (vpVar.b - vpVar.c()) + (str.length() - (this.c - this.b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!ca0.d()) {
                    return false;
                }
                ca0 ca0VarA = ca0.a();
                if (ca0VarA.c() != 1 || ca0VarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return c22.j(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (ws0.j(unicodeBlockOf, unicodeBlock) && ws0.j(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return ws0.j(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && ws0.j(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!ca0.d()) {
                return false;
            }
            ca0 ca0VarA = ca0.a();
            if (ca0VarA.c() != 1 || ca0VarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return c22.j(Character.codePointAt((CharSequence) this.d, i));
    }

    public int j(int i) {
        b(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (h(iFollowing + (-1)) && h(iFollowing) && !g(iFollowing)) ? j(iFollowing) : iFollowing;
    }

    public void l(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = yc.a(typeface, i, (this.c & 2) != 0);
        }
        zc zcVar = (zc) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (zcVar.m) {
            zcVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = zcVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new vc(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public int m(int i) {
        b(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (h(iPreceding) && d(iPreceding) && !g(iPreceding)) ? m(iPreceding) : iPreceding;
    }

    public void n(int i, int i2, String str) {
        if (i > i2) {
            wp0.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            wp0.a("start must be non-negative, but was " + i);
        }
        vp vpVar = (vp) this.e;
        if (vpVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            vp vpVar2 = new vp(1);
            vpVar2.b = iMax;
            vpVar2.e = cArr;
            vpVar2.c = length;
            vpVar2.d = i4;
            this.e = vpVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > vpVar.b - vpVar.c()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            n(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > vpVar.c()) {
            int iC = length2 - vpVar.c();
            int i9 = vpVar.b;
            do {
                i9 *= 2;
            } while (i9 - vpVar.b < iC);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) vpVar.e, 0, cArr2, 0, vpVar.c);
            int i10 = vpVar.b;
            int i11 = vpVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) vpVar.e, i11, cArr2, i13, (i12 + i11) - i11);
            vpVar.e = cArr2;
            vpVar.b = i9;
            vpVar.d = i13;
        }
        int i14 = vpVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) vpVar.e;
            System.arraycopy(cArr3, i8, cArr3, vpVar.d - i15, i15);
            vpVar.c = i7;
            vpVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iC2 = vpVar.c() + i7;
            int iC3 = vpVar.c() + i8;
            int i16 = vpVar.d;
            int i17 = iC2 - i16;
            char[] cArr4 = (char[]) vpVar.e;
            System.arraycopy(cArr4, i16, cArr4, vpVar.c, i17);
            i7 = vpVar.c + i17;
            vpVar.c = i7;
            vpVar.d = iC3;
        } else {
            vpVar.d = vpVar.c() + i8;
            vpVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) vpVar.e, i7);
        vpVar.c = str.length() + vpVar.c;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                vp vpVar = (vp) this.e;
                String str = (String) this.d;
                if (vpVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) vpVar.e, 0, vpVar.c);
                char[] cArr = (char[]) vpVar.e;
                int i = vpVar.d;
                sb.append(cArr, i, vpVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void k(int i) {
    }

    public /* synthetic */ uc() {
    }

    public uc(zc zcVar, int i, int i2, WeakReference weakReference) {
        this.e = zcVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}

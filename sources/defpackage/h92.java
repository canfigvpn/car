package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h92 extends o92 {
    public static boolean C(String str, String str2, boolean z) {
        return H(str, str2, 0, z, 2) >= 0;
    }

    public static boolean D(CharSequence charSequence, char c) {
        charSequence.getClass();
        return G(charSequence, c, 0, 2) >= 0;
    }

    public static boolean E(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : M(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int F(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        lr0 lr0Var = new lr0(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = lr0Var.f;
        if (!z2) {
            if (i2 > i3) {
                return -1;
            }
            int i4 = i2;
            while (!M(str, 0, charSequence, i4, str.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4++;
            }
            return i4;
        }
        if (i2 > i3) {
            return -1;
        }
        int i5 = i2;
        while (true) {
            String str2 = (String) charSequence;
            int length3 = str.length();
            if (!z ? str.regionMatches(0, str2, i5, length3) : str.regionMatches(z, 0, str2, i5, length3)) {
                return i5;
            }
            if (i5 == i3) {
                return -1;
            }
            i5++;
        }
    }

    public static int G(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(ve.H0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (!j20.n(cArr[0], charSequence.charAt(i), false)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return F(charSequence, str, i, z);
    }

    public static boolean I(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!j20.x(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int J(CharSequence charSequence, char c) {
        int length = charSequence.length() - 1;
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, length);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ve.H0(cArr), length);
        }
        int length2 = charSequence.length() - 1;
        if (length > length2) {
            length = length2;
        }
        while (-1 < length) {
            if (j20.n(cArr[0], charSequence.charAt(length), false)) {
                return length;
            }
            length--;
        }
        return -1;
    }

    public static List K(CharSequence charSequence) {
        t21 t21Var = new t21(charSequence);
        if (!t21Var.hasNext()) {
            return cb0.e;
        }
        Object next = t21Var.next();
        if (!t21Var.hasNext()) {
            return vs0.u(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (t21Var.hasNext()) {
            arrayList.add(t21Var.next());
        }
        return arrayList;
    }

    public static String L(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean M(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence2.getClass();
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (j20.n(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String N(String str, String str2, String str3) {
        int iH = H(str, str2, 0, false, 6);
        return iH == -1 ? str3 : str.substring(str2.length() + iH, str.length());
    }

    public static String O(String str) {
        str.getClass();
        str.getClass();
        int iJ = J(str, '/');
        return iJ == -1 ? str : str.substring(iJ + 1, str.length());
    }

    public static String P(String str, int i) {
        str.getClass();
        if (i < 0) {
            fu1.i("Requested character count ", i, " is less than zero.");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence Q(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zX = j20.x(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zX) {
                    break;
                }
                length--;
            } else if (zX) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}

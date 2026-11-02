package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i92 extends n02 {
    public static String r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        t21 t21Var = new t21(str);
        int i = 0;
        while (t21Var.hasNext()) {
            String strConcat = (String) t21Var.next();
            strConcat.getClass();
            if (!h92.I(strConcat)) {
                strConcat = "    ".concat(strConcat);
            } else if (strConcat.length() < 4) {
                strConcat = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            n02.e(sb, strConcat, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String s(String str) {
        Comparable comparable;
        String strSubstring;
        List listK = h92.K(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (!h92.I((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(wq.G(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!j20.x(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listK.size();
        int size2 = listK.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listK) {
            int i3 = i + 1;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && h92.I(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    fu1.i("Requested character count ", iIntValue, " is less than zero.");
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        vq.U(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String t(String str) {
        if (h92.I("|")) {
            qj.r("marginPrefix must be non-blank string.");
            return null;
        }
        List listK = h92.K(str);
        int length = str.length();
        listK.size();
        int size = listK.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listK) {
            int i2 = i + 1;
            if (i < 0) {
                vs0.D();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && h92.I(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!j20.x(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        vq.U(arrayList, sb, null, 124);
        return sb.toString();
    }
}

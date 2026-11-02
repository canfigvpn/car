package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class fc1 {
    public final /* synthetic */ int a;
    public int b;
    public String c;
    public String d;
    public final Object e;
    public final Object f;

    public fc1(String str) {
        this.a = 1;
        str.getClass();
        h7 h7Var = new h7(2);
        h7Var.g = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        h7Var.h = iArr;
        h7Var.f = -1;
        this.e = h7Var;
        this.f = new StringBuilder();
        this.d = str;
    }

    public static /* synthetic */ void l(fc1 fc1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = fc1Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        fc1Var.k(i, str, str2);
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (p(charSequence, i + 3) + (p(charSequence, i) << 12) + (p(charSequence, i + 1) << 8) + (p(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.b);
        }
        l(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = this.d;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public void c(String str, int i) {
        String str2 = this.d;
        if (str2.length() - i < str.length()) {
            l(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                l(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String d() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = this.d;
        g('\"');
        int i = this.b;
        int iG = h92.G(str, '\"', i, 4);
        if (iG == -1) {
            j();
            int i2 = this.b;
            l(this, k3.j("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iG) {
            if (str.charAt(i3) == '\\') {
                int iU = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iU, i3);
                        int iU2 = u(i3 + 1);
                        if (iU2 == -1) {
                            l(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iU2 + 1;
                        char cCharAt2 = str.charAt(iU2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? bp.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                l(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iU = u(iA);
                        if (iU == -1) {
                            l(this, "Unexpected EOF", iU, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iU, i3);
                            iU = u(i3);
                            if (iU == -1) {
                                l(this, "Unexpected EOF", iU, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iU;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iU, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iU, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iG + 1;
        return str.substring(i, iG);
    }

    public byte e() {
        String str = this.d;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return dv1.k(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte f(byte b) {
        String str = this.d;
        byte bE = e();
        if (bE == b) {
            return bE;
        }
        String strQ = dv1.Q(b);
        int i = this.b;
        int i2 = i - 1;
        l(this, "Expected " + strQ + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    public void g(char c) {
        int i = this.b;
        if (i == -1) {
            x(c);
            throw null;
        }
        String str = this.d;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                x(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        x(c);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long h() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iU = u(v());
        String str = this.d;
        ?? r6 = 0;
        if (iU >= str.length() || iU == -1) {
            l(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iU) == '\"') {
            iU++;
            if (iU == str.length()) {
                l(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iU;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                if (cCharAt == '-' && z4) {
                    if (i == iU) {
                        l(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    z2 = z;
                    if (cCharAt != '-') {
                        if (dv1.k(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            l(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * 10) + ((long) i2);
                        } else {
                            j3 = (j3 * 10) - ((long) i2);
                            if (j3 > 0) {
                                l(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z = z2;
                    } else {
                        if (i != iU) {
                            l(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z = z2;
                        r6 = 0;
                        z5 = true;
                    }
                } else {
                    if (i == iU) {
                        l(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    r6 = 0;
                    z3 = true;
                }
                r6 = 0;
            } else {
                if (i == iU) {
                    l(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                    throw r6;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iU;
        if (iU == i || (z5 && iU == i - 1)) {
            l(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z2) {
            if (!z6) {
                l(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                l(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z4) {
            double d = j4;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    qj.p();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                l(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                l(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        l(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String i() {
        String str = this.c;
        if (str == null) {
            return d();
        }
        str.getClass();
        this.c = null;
        return str;
    }

    public String j() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = this.d;
        String str2 = this.c;
        if (str2 != null) {
            str2.getClass();
            this.c = null;
            return str2;
        }
        int iV = v();
        if (iV >= str.length() || iV == -1) {
            l(this, "EOF", iV, null, 4);
            throw null;
        }
        byte bK = dv1.k(str.charAt(iV));
        if (bK == 1) {
            return i();
        }
        if (bK != 0) {
            l(this, "Expected beginning of the string, but got " + str.charAt(iV), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (dv1.k(str.charAt(iV)) == 0) {
            iV++;
            if (iV >= str.length()) {
                sb.append((CharSequence) str, this.b, iV);
                int iU = u(iV);
                if (iU == -1) {
                    this.b = iV;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iV = iU;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iV);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iV).toString();
        }
        this.b = iV;
        return string;
    }

    public void k(int i, String str, String str2) {
        str2.getClass();
        throw ux.c(i, str + " at path: " + ((h7) this.e).d() + (str2.length() == 0 ? "" : "\n".concat(str2)), this.d);
    }

    public zb1 m(int i) {
        return o(i, (cc1) this.e, null, false);
    }

    public zb1 n(String str, boolean z) {
        Object next;
        cc1 cc1Var;
        zb1 zb1Var;
        str.getClass();
        Iterator it = ((qw) o12.s(new v(4, (v72) this.f))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            zb1Var = (zb1) next;
            if (o92.v((String) zb1Var.f.e, str, false)) {
                break;
            }
        } while (zb1Var.f.c(str) == null);
        zb1 zb1Var2 = (zb1) next;
        if (zb1Var2 != null) {
            return zb1Var2;
        }
        if (!z || (cc1Var = ((cc1) this.e).g) == null) {
            return null;
        }
        fc1 fc1Var = cc1Var.j;
        fc1Var.getClass();
        if (h92.I(str)) {
            return null;
        }
        return fc1Var.n(str, true);
    }

    public zb1 o(int i, zb1 zb1Var, zb1 zb1Var2, boolean z) {
        cc1 cc1Var = (cc1) this.e;
        v72 v72Var = (v72) this.f;
        zb1 zb1VarO = (zb1) s5.B(v72Var, i);
        if (zb1Var2 != null) {
            if (ws0.j(zb1VarO, zb1Var2) && ws0.j(zb1VarO.g, zb1Var2.g)) {
                return zb1VarO;
            }
            zb1VarO = null;
        } else if (zb1VarO != null) {
            return zb1VarO;
        }
        if (z) {
            Iterator it = ((qw) o12.s(new v(4, v72Var))).iterator();
            do {
                if (!it.hasNext()) {
                    zb1VarO = null;
                    break;
                }
                zb1 zb1Var3 = (zb1) it.next();
                zb1VarO = (!(zb1Var3 instanceof cc1) || zb1Var3.equals(zb1Var)) ? null : ((cc1) zb1Var3).j.o(i, cc1Var, zb1Var2, true);
            } while (zb1VarO == null);
        }
        if (zb1VarO != null) {
            return zb1VarO;
        }
        cc1 cc1Var2 = cc1Var.g;
        if (cc1Var2 == null || cc1Var2.equals(zb1Var)) {
            return null;
        }
        cc1 cc1Var3 = cc1Var.g;
        cc1Var3.getClass();
        return cc1Var3.j.o(i, cc1Var, zb1Var2, z);
    }

    public int p(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        l(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public yb1 q(yb1 yb1Var, ud udVar, boolean z, zb1 zb1Var) {
        yb1 yb1VarD;
        cc1 cc1Var = (cc1) this.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = cc1Var.iterator();
        while (true) {
            ec1 ec1Var = (ec1) it;
            yb1VarD = null;
            if (!ec1Var.hasNext()) {
                break;
            }
            zb1 zb1Var2 = (zb1) ec1Var.next();
            yb1VarD = ws0.j(zb1Var2, zb1Var) ? null : zb1Var2.c(udVar);
            if (yb1VarD != null) {
                arrayList.add(yb1VarD);
            }
        }
        yb1 yb1Var2 = (yb1) vq.Y(arrayList);
        cc1 cc1Var2 = cc1Var.g;
        if (cc1Var2 != null && z && !cc1Var2.equals(zb1Var)) {
            yb1VarD = cc1Var2.d(udVar, cc1Var);
        }
        return (yb1) vq.Y(ve.D0(new yb1[]{yb1Var, yb1Var2, yb1VarD}));
    }

    public String r(String str) {
        str.getClass();
        int i = this.b;
        try {
            if (e() == 6 && ws0.j(t(), str)) {
                this.c = null;
                if (e() == 5) {
                    return t();
                }
            }
            return null;
        } finally {
            this.b = i;
            this.c = null;
        }
    }

    public byte s() {
        String str = this.d;
        int i = this.b;
        while (true) {
            int iU = u(i);
            if (iU == -1) {
                this.b = iU;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iU);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iU;
                return dv1.k(cCharAt);
            }
            i = iU + 1;
        }
    }

    public String t() {
        if (s() != 1) {
            return null;
        }
        String strI = i();
        this.c = strI;
        return strI;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) this.d);
                sb.append("', currentPosition=");
                return k3.l(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u(int i) {
        if (i < this.d.length()) {
            return i;
        }
        return -1;
    }

    public int v() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = this.d;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean w() {
        int iV = v();
        String str = this.d;
        if (iV >= str.length() || iV == -1 || str.charAt(iV) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public void x(char c) {
        String str = this.d;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strJ = j();
                this.b = i;
                if (ws0.j(strJ, "null")) {
                    k(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strQ = dv1.Q(dv1.k(c));
        int i2 = this.b;
        int i3 = i2 - 1;
        l(this, "Expected " + strQ + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    public fc1(cc1 cc1Var) {
        this.a = 0;
        this.e = cc1Var;
        this.f = new v72();
    }
}

package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 implements vv1 {
    public final vh0 e;

    public ha2(vh0 vh0Var) {
        vh0Var.getClass();
        this.e = vh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vv1
    public final xv1 C(String str) {
        ka2 ka2Var;
        int i;
        str.getClass();
        vh0 vh0Var = this.e;
        is1 is1Var = null;
        if (!vh0Var.isOpen()) {
            ix.R("connection is closed", 21);
            throw null;
        }
        String upperCase = h92.Q(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iG = 0;
            loop0: while (iG < length) {
                char cCharAt = upperCase.charAt(iG);
                if (ws0.n(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iG2 = iG + 1;
                            if (upperCase.charAt(iG2) == '*') {
                                do {
                                    iG2 = h92.G(upperCase, '*', iG2 + 1, 4);
                                    if (iG2 < 0) {
                                        break loop0;
                                    }
                                    i = iG2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iG = iG2 + 2;
                            }
                        }
                        i2 = iG;
                        break;
                    }
                    if (upperCase.charAt(iG + 1) != '-') {
                        i2 = iG;
                        break;
                    }
                    iG = h92.G(upperCase, '\n', iG + 2, 4);
                    if (iG < 0) {
                        break;
                    }
                }
                iG++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new la2(vh0Var, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    ka2Var = null;
                } else if (!h92.C(upperCase, "EXCLUSIVE", false)) {
                    ka2Var = !h92.C(upperCase, "IMMEDIATE", false) ? ka2.i : ka2.h;
                } else {
                    ka2Var = ka2.g;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    ka2Var = null;
                } else {
                    ka2Var = ka2.e;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    ka2Var = null;
                } else {
                    ka2Var = ka2.e;
                }
                break;
            case 81327:
                ka2Var = (!strSubstring.equals("ROL") || h92.C(upperCase, " TO ", false)) ? null : ka2.f;
                break;
            default:
                ka2Var = null;
                break;
        }
        if (ka2Var != null) {
            return new la2(vh0Var, str, ka2Var);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (h92.C(h92.N(lowerCase, "journal_mode", ""), "=", false)) {
                is1Var = is1.p;
            }
        }
        if (is1Var != null) {
            return new la2(vh0Var, str, new ma2(vh0Var, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new la2(vh0Var, str) : new ma2(vh0Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // defpackage.vv1
    public final boolean l() {
        return this.e.l();
    }
}

package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends u0 {
    public static v0 e;
    public static v0 f;
    public static v0 g;
    public static final jt1 h = jt1.f;
    public static final jt1 i = jt1.e;
    public final /* synthetic */ int c;
    public Object d;

    @Override // defpackage.u0
    public final int[] a(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        ws0.U("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            ws0.U("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        ws0.U("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!m(i2) && (!m(i2) || (i2 != 0 && m(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        ws0.U("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    ws0.U("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !l(iFollowing2)) {
                    return null;
                }
                return b(i2, iFollowing2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                hf2 hf2Var = (hf2) this.d;
                jt1 jt1Var = h;
                if (i2 < 0) {
                    if (hf2Var == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    iD = hf2Var.b.d(0);
                } else {
                    if (hf2Var == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    int iD2 = hf2Var.b.d(i2);
                    iD = j(iD2, jt1Var) == i2 ? iD2 : iD2 + 1;
                }
                hf2 hf2Var2 = (hf2) this.d;
                if (hf2Var2 == null) {
                    ws0.U("layoutResult");
                    throw null;
                }
                if (iD >= hf2Var2.b.f) {
                    return null;
                }
                return b(j(iD, jt1Var), j(iD, i) + 1);
        }
    }

    @Override // defpackage.u0
    public final int[] i(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        ws0.U("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            ws0.U("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        ws0.U("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !m(i2 - 1) && !l(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        ws0.U("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    ws0.U("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !m(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m(iPreceding2 - 1)) {
                    return b(iPreceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                hf2 hf2Var = (hf2) this.d;
                jt1 jt1Var = i;
                if (i2 > length3) {
                    if (hf2Var == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    iD = hf2Var.b.d(c().length());
                } else {
                    if (hf2Var == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    int iD2 = hf2Var.b.d(i2);
                    iD = j(iD2, jt1Var) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return b(j(iD, h), j(iD, jt1Var) + 1);
        }
    }

    public int j(int i2, jt1 jt1Var) {
        hf2 hf2Var = (hf2) this.d;
        if (hf2Var == null) {
            ws0.U("layoutResult");
            throw null;
        }
        int iF = hf2Var.f(i2);
        hf2 hf2Var2 = (hf2) this.d;
        if (hf2Var2 == null) {
            ws0.U("layoutResult");
            throw null;
        }
        jt1 jt1VarG = hf2Var2.g(iF);
        hf2 hf2Var3 = (hf2) this.d;
        if (jt1Var != jt1VarG) {
            if (hf2Var3 != null) {
                return hf2Var3.f(i2);
            }
            ws0.U("layoutResult");
            throw null;
        }
        if (hf2Var3 != null) {
            return hf2Var3.b.c(i2, false) - 1;
        }
        ws0.U("layoutResult");
        throw null;
    }

    public void k(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    ws0.U("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    ws0.U("impl");
                    throw null;
                }
        }
    }

    public boolean l(int i2) {
        if (i2 <= 0 || !m(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !m(i2);
    }

    public boolean m(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}

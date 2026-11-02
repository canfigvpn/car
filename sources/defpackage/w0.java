package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends u0 {
    public static w0 e;
    public static final jt1 f = jt1.f;
    public static final jt1 g = jt1.e;
    public hf2 c;
    public p02 d;

    @Override // defpackage.u0
    public final int[] a(int i) {
        int iE;
        if (c().length() > 0 && i < c().length()) {
            try {
                p02 p02Var = this.d;
                if (p02Var == null) {
                    ws0.U("node");
                    throw null;
                }
                yr1 yr1VarG = p02Var.g();
                int iRound = Math.round(yr1VarG.d - yr1VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                hf2 hf2Var = this.c;
                if (hf2Var == null) {
                    ws0.U("layoutResult");
                    throw null;
                }
                int iD = hf2Var.b.d(i);
                hf2 hf2Var2 = this.c;
                if (hf2Var2 == null) {
                    ws0.U("layoutResult");
                    throw null;
                }
                float f2 = hf2Var2.b.f(iD) + iRound;
                hf2 hf2Var3 = this.c;
                if (hf2Var3 == null) {
                    ws0.U("layoutResult");
                    throw null;
                }
                t81 t81Var = hf2Var3.b;
                float f3 = t81Var.f(t81Var.f - 1);
                hf2 hf2Var4 = this.c;
                if (f2 < f3) {
                    if (hf2Var4 == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    iE = hf2Var4.b.e(f2);
                } else {
                    if (hf2Var4 == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    iE = hf2Var4.b.f;
                }
                return b(i, j(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.u0
    public final int[] i(int i) {
        int iE;
        if (c().length() > 0 && i > 0) {
            try {
                p02 p02Var = this.d;
                if (p02Var == null) {
                    ws0.U("node");
                    throw null;
                }
                yr1 yr1VarG = p02Var.g();
                int iRound = Math.round(yr1VarG.d - yr1VarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                hf2 hf2Var = this.c;
                if (hf2Var == null) {
                    ws0.U("layoutResult");
                    throw null;
                }
                int iD = hf2Var.b.d(i);
                hf2 hf2Var2 = this.c;
                if (hf2Var2 == null) {
                    ws0.U("layoutResult");
                    throw null;
                }
                float f2 = hf2Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    hf2 hf2Var3 = this.c;
                    if (hf2Var3 == null) {
                        ws0.U("layoutResult");
                        throw null;
                    }
                    iE = hf2Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == c().length() && iE < iD) {
                    iE++;
                }
                return b(j(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int j(int i, jt1 jt1Var) {
        hf2 hf2Var = this.c;
        if (hf2Var == null) {
            ws0.U("layoutResult");
            throw null;
        }
        int iF = hf2Var.f(i);
        hf2 hf2Var2 = this.c;
        if (hf2Var2 == null) {
            ws0.U("layoutResult");
            throw null;
        }
        jt1 jt1VarG = hf2Var2.g(iF);
        hf2 hf2Var3 = this.c;
        if (jt1Var != jt1VarG) {
            if (hf2Var3 != null) {
                return hf2Var3.f(i);
            }
            ws0.U("layoutResult");
            throw null;
        }
        if (hf2Var3 != null) {
            return hf2Var3.b.c(i, false) - 1;
        }
        ws0.U("layoutResult");
        throw null;
    }
}

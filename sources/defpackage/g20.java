package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g20 implements io2 {
    public final d00 e;
    public final int f;
    public final int g;
    public final int h;
    public final ao2 i;

    public g20(d00 d00Var) {
        this.e = d00Var;
        String str = d00Var.a;
        char c = d00Var.b;
        this.f = h92.G(str, c, 0, 6);
        this.g = h92.J(str, c);
        this.h = d00Var.c.length();
        this.i = new ao2(11, this);
    }

    @Override // defpackage.io2
    public final bi2 a(yb ybVar) {
        int length = ybVar.f.length();
        String strSubstring = ybVar.f;
        int i = 0;
        int i2 = this.h;
        if (length > i2) {
            lr0 lr0VarS = ex.S(0, i2);
            strSubstring.getClass();
            lr0VarS.getClass();
            strSubstring = strSubstring.substring(lr0VarS.e, lr0VarS.f + 1);
        }
        String str = "";
        int i3 = 0;
        while (i < strSubstring.length()) {
            int i4 = i3 + 1;
            str = str + strSubstring.charAt(i);
            if (i4 == this.f || i3 + 2 == this.g) {
                str = str + this.e.b;
            }
            i++;
            i3 = i4;
        }
        return new bi2(new yb(str), this.i);
    }
}

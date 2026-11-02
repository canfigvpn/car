package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 {
    public final uc a;
    public int b;
    public int c;
    public int d;
    public int e;

    public s90(yb ybVar, long j) {
        String str = ybVar.f;
        uc ucVar = new uc();
        ucVar.d = str;
        ucVar.b = -1;
        ucVar.c = -1;
        this.a = ucVar;
        this.b = of2.f(j);
        this.c = of2.e(j);
        this.d = -1;
        this.e = -1;
        int iF = of2.f(j);
        int iE = of2.e(j);
        if (iF < 0 || iF > str.length()) {
            qj.n(k3.m(iF, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            qj.n(k3.m(iE, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        qj.r(k3.h(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jC = j02.c(i, i2);
        this.a.n(i, i2, "");
        long jO = ux.O(j02.c(this.b, this.c), jC);
        h(of2.f(jO));
        g(of2.e(jO));
        int i3 = this.d;
        if (i3 != -1) {
            long jO2 = ux.O(j02.c(i3, this.e), jC);
            if (of2.c(jO2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = of2.f(jO2);
                this.e = of2.e(jO2);
            }
        }
    }

    public final char b(int i) {
        uc ucVar = this.a;
        vp vpVar = (vp) ucVar.e;
        if (vpVar == null) {
            return ((String) ucVar.d).charAt(i);
        }
        if (i < ucVar.b) {
            return ((String) ucVar.d).charAt(i);
        }
        int iC = vpVar.b - vpVar.c();
        int i2 = ucVar.b;
        if (i >= iC + i2) {
            return ((String) ucVar.d).charAt(i - ((iC - ucVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = vpVar.c;
        char[] cArr = (char[]) vpVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + vpVar.d];
    }

    public final of2 c() {
        int i = this.d;
        if (i != -1) {
            return new of2(j02.c(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        uc ucVar = this.a;
        if (i < 0 || i > ucVar.c()) {
            qj.n(k3.m(i, "start (", ") offset is outside of text region "), ucVar.c());
            return;
        }
        if (i2 < 0 || i2 > ucVar.c()) {
            qj.n(k3.m(i2, "end (", ") offset is outside of text region "), ucVar.c());
            return;
        }
        if (i > i2) {
            qj.r(k3.h(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        ucVar.n(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        uc ucVar = this.a;
        if (i < 0 || i > ucVar.c()) {
            qj.n(k3.m(i, "start (", ") offset is outside of text region "), ucVar.c());
            return;
        }
        if (i2 < 0 || i2 > ucVar.c()) {
            qj.n(k3.m(i2, "end (", ") offset is outside of text region "), ucVar.c());
        } else if (i >= i2) {
            qj.r(k3.h(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        uc ucVar = this.a;
        if (i < 0 || i > ucVar.c()) {
            qj.n(k3.m(i, "start (", ") offset is outside of text region "), ucVar.c());
            return;
        }
        if (i2 < 0 || i2 > ucVar.c()) {
            qj.n(k3.m(i2, "end (", ") offset is outside of text region "), ucVar.c());
        } else if (i > i2) {
            qj.r(k3.h(i, i2, "Do not set reversed range: ", " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            wp0.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            wp0.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}

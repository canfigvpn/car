package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vj1 {
    public String a;
    public vf2 b;
    public jg0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public m40 i;
    public y7 j;
    public boolean k;
    public m71 m;
    public uj1 n;
    public kw0 o;
    public long s;
    public long h = zp0.a;
    public long l = 0;
    public long p = tw.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public vj1(String str, vf2 vf2Var, jg0 jg0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = vf2Var;
        this.c = jg0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(vj1 vj1Var, long j, kw0 kw0Var) {
        int i;
        vf2 vf2Var = vj1Var.b;
        m71 m71Var = vj1Var.m;
        m40 m40Var = vj1Var.i;
        m40Var.getClass();
        jg0 jg0Var = vj1Var.c;
        if ((m71Var == null || kw0Var != m71Var.a || !n02.p(vf2Var, kw0Var).equals(m71Var.b) || m40Var.b() != m71Var.c.e || jg0Var != m71Var.d) && ((m71Var = m71.h) == null || kw0Var != m71Var.a || !n02.p(vf2Var, kw0Var).equals(m71Var.b) || m40Var.b() != m71Var.c.e || jg0Var != m71Var.d)) {
            m71Var = new m71(kw0Var, n02.p(vf2Var, kw0Var), new p40(m40Var.b(), m40Var.l()), jg0Var);
            m71.h = m71Var;
        }
        vj1Var.m = m71Var;
        int i2 = vj1Var.g;
        p40 p40Var = m71Var.c;
        vf2 vf2Var2 = m71Var.e;
        float f = m71Var.g;
        float f2 = m71Var.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float fB = rw.f(n71.a, vf2Var2, tw.b(0, 0, 15), p40Var, m71Var.d, 1, 96).b();
            float fB2 = rw.f(n71.b, vf2Var2, tw.b(0, 0, 15), p40Var, m71Var.d, 2, 96).b() - fB;
            m71Var.g = fB;
            m71Var.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i2 != 1) {
            int iRound = Math.round((f2 * (i2 - 1)) + f);
            i = iRound >= 0 ? iRound : 0;
            int iG = sw.g(j);
            if (i > iG) {
                i = iG;
            }
        } else {
            i = sw.i(j);
        }
        return tw.a(sw.j(j), sw.h(j), i, sw.g(j));
    }

    public final int a(int i, kw0 kw0Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = tw.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, kw0Var);
        }
        uj1 uj1VarE = e(kw0Var);
        long jP = ei1.p(jA, this.e, this.d, uj1VarE.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iE = j02.e(new y7((c8) uj1VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jP).b());
        int i6 = sw.i(jA);
        if (iE < i6) {
            iE = i6;
        }
        this.q = i;
        this.r = iE;
        return iE;
    }

    public final boolean b(long j, kw0 kw0Var) {
        uj1 uj1Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, kw0Var) : j;
        y7 y7Var = this.j;
        boolean z2 = false;
        if (y7Var != null && (uj1Var = this.n) != null && !uj1Var.b() && kw0Var == this.o && (sw.b(jF, this.p) || (sw.h(jF) == sw.h(this.p) && sw.j(jF) == sw.j(this.p) && sw.g(jF) >= y7Var.b() && !y7Var.d.d))) {
            if (!sw.b(jF, this.p)) {
                y7 y7Var2 = this.j;
                y7Var2.getClass();
                long jD = tw.d(jF, (((long) j02.e(Math.min(y7Var2.a.m.c(), y7Var2.d()))) << 32) | (((long) j02.e(y7Var2.b())) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= y7Var2.d() && ((int) (4294967295L & jD)) >= y7Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        uj1 uj1VarE = e(kw0Var);
        long jP = ei1.p(jF, this.e, this.d, uj1VarE.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        y7 y7Var3 = new y7((c8) uj1VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jP);
        this.p = jF;
        long jD2 = tw.d(jF, (((long) j02.e(y7Var3.b())) & 4294967295L) | (((long) j02.e(y7Var3.d())) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < y7Var3.d() || ((int) (jD2 & 4294967295L)) < y7Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = y7Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = tw.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(m40 m40Var) {
        long jA;
        m40 m40Var2 = this.i;
        if (m40Var != null) {
            int i = zp0.b;
            jA = zp0.a(m40Var.b(), m40Var.l());
        } else {
            jA = zp0.a;
        }
        if (m40Var2 == null) {
            this.i = m40Var;
            this.h = jA;
        } else if (m40Var == null || this.h != jA) {
            this.i = m40Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final uj1 e(kw0 kw0Var) {
        uj1 c8Var = this.n;
        if (c8Var == null || kw0Var != this.o || c8Var.b()) {
            this.o = kw0Var;
            String str = this.a;
            vf2 vf2VarP = n02.p(this.b, kw0Var);
            m40 m40Var = this.i;
            m40Var.getClass();
            jg0 jg0Var = this.c;
            cb0 cb0Var = cb0.e;
            c8Var = new c8(str, vf2VarP, cb0Var, cb0Var, jg0Var, m40Var);
        }
        this.n = c8Var;
        return c8Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) zp0.b(this.h));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}

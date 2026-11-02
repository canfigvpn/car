package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vf2 {
    public static final vf2 d = new vf2(0, 0, null, 0, 0, 0, 16777215);
    public final r72 a;
    public final wj1 b;
    public final ln1 c;

    public vf2(long j, long j2, lh0 lh0Var, long j3, int i, long j4, int i2) {
        this(new r72((i2 & 1) != 0 ? dr.g : j, (i2 & 2) != 0 ? yf2.c : j2, (i2 & 4) != 0 ? null : lh0Var, (hh0) null, (ih0) null, (kg0) null, (String) null, (i2 & 128) != 0 ? yf2.c : j3, (th) null, (we2) null, (q31) null, dr.g, (ed2) null, (q32) null, (gn1) null), new wj1((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? yf2.c : j4, null, null, null, 0, 0, null), null);
    }

    public static vf2 a(vf2 vf2Var, long j, long j2, lh0 lh0Var, kg0 kg0Var, long j3, long j4, o21 o21Var, int i) {
        ve2 srVar;
        ln1 ln1Var = s5.j;
        long jB = (i & 1) != 0 ? vf2Var.a.a.b() : j;
        long j5 = (i & 2) != 0 ? vf2Var.a.b : j2;
        lh0 lh0Var2 = (i & 4) != 0 ? vf2Var.a.c : lh0Var;
        r72 r72Var = vf2Var.a;
        hh0 hh0Var = r72Var.d;
        ih0 ih0Var = r72Var.e;
        kg0 kg0Var2 = (i & 32) != 0 ? r72Var.f : kg0Var;
        String str = r72Var.g;
        long j6 = (i & 128) != 0 ? r72Var.h : j3;
        th thVar = r72Var.i;
        we2 we2Var = r72Var.j;
        q31 q31Var = r72Var.k;
        long j7 = r72Var.l;
        ed2 ed2Var = r72Var.m;
        q32 q32Var = r72Var.n;
        m80 m80Var = r72Var.p;
        int i2 = (i & 32768) != 0 ? vf2Var.b.a : 3;
        wj1 wj1Var = vf2Var.b;
        int i3 = wj1Var.b;
        long j8 = (i & 131072) != 0 ? wj1Var.c : j4;
        xe2 xe2Var = wj1Var.d;
        ln1 ln1Var2 = (i & 524288) != 0 ? vf2Var.c : ln1Var;
        o21 o21Var2 = (i & 1048576) != 0 ? wj1Var.f : o21Var;
        int i4 = wj1Var.g;
        int i5 = wj1Var.h;
        mf2 mf2Var = wj1Var.i;
        long jB2 = r72Var.a.b();
        int i6 = dr.h;
        if (vk2.a(jB, jB2)) {
            srVar = r72Var.a;
        } else {
            srVar = jB != 16 ? new sr(jB) : ue2.a;
        }
        return new vf2(new r72(srVar, j5, lh0Var2, hh0Var, ih0Var, kg0Var2, str, j6, thVar, we2Var, q31Var, j7, ed2Var, q32Var, ln1Var2 != null ? ln1Var2.a : null, m80Var), new wj1(i2, i3, j8, xe2Var, ln1Var2 != null ? ln1Var2.b : null, o21Var2, i4, i5, mf2Var), ln1Var2);
    }

    public static vf2 e(vf2 vf2Var, long j, long j2, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? yf2.c : j2;
        long j6 = (i2 & 128) != 0 ? yf2.c : j3;
        long j7 = dr.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? yf2.c : j4;
        r72 r72VarA = s72.a(vf2Var.a, j, null, Float.NaN, j5, null, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        wj1 wj1VarA = xj1.a(vf2Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (vf2Var.a == r72VarA && vf2Var.b == wj1VarA) ? vf2Var : new vf2(r72VarA, wj1VarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(vf2 vf2Var) {
        if (this != vf2Var) {
            return ws0.j(this.b, vf2Var.b) && this.a.a(vf2Var.a);
        }
        return true;
    }

    public final vf2 d(vf2 vf2Var) {
        return (vf2Var == null || vf2Var.equals(d)) ? this : new vf2(this.a.c(vf2Var.a), this.b.a(vf2Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf2)) {
            return false;
        }
        vf2 vf2Var = (vf2) obj;
        return ws0.j(this.a, vf2Var.a) && ws0.j(this.b, vf2Var.b) && ws0.j(this.c, vf2Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ln1 ln1Var = this.c;
        return iHashCode + (ln1Var != null ? ln1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) dr.h(b()));
        sb.append(", brush=");
        r72 r72Var = this.a;
        sb.append(r72Var.a.c());
        sb.append(", alpha=");
        sb.append(r72Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) yf2.d(r72Var.b));
        sb.append(", fontWeight=");
        sb.append(r72Var.c);
        sb.append(", fontStyle=");
        sb.append(r72Var.d);
        sb.append(", fontSynthesis=");
        sb.append(r72Var.e);
        sb.append(", fontFamily=");
        sb.append(r72Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(r72Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) yf2.d(r72Var.h));
        sb.append(", baselineShift=");
        sb.append(r72Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(r72Var.j);
        sb.append(", localeList=");
        sb.append(r72Var.k);
        sb.append(", background=");
        k3.r(r72Var.l, sb, ", textDecoration=");
        sb.append(r72Var.m);
        sb.append(", shadow=");
        sb.append(r72Var.n);
        sb.append(", drawStyle=");
        sb.append(r72Var.p);
        sb.append(", textAlign=");
        wj1 wj1Var = this.b;
        sb.append((Object) gc2.a(wj1Var.a));
        sb.append(", textDirection=");
        sb.append((Object) hd2.a(wj1Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) yf2.d(wj1Var.c));
        sb.append(", textIndent=");
        sb.append(wj1Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(wj1Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) j21.a(wj1Var.g));
        sb.append(", hyphens=");
        sb.append((Object) yn0.a(wj1Var.h));
        sb.append(", textMotion=");
        sb.append(wj1Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vf2(r72 r72Var, wj1 wj1Var) {
        gn1 gn1Var = r72Var.o;
        ym1 ym1Var = wj1Var.e;
        this(r72Var, wj1Var, (gn1Var == null && ym1Var == null) ? null : new ln1(gn1Var, ym1Var));
    }

    public vf2(r72 r72Var, wj1 wj1Var, ln1 ln1Var) {
        this.a = r72Var;
        this.b = wj1Var;
        this.c = ln1Var;
    }
}

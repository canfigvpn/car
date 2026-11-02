package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r72 implements ub {
    public final ve2 a;
    public final long b;
    public final lh0 c;
    public final hh0 d;
    public final ih0 e;
    public final kg0 f;
    public final String g;
    public final long h;
    public final th i;
    public final we2 j;
    public final q31 k;
    public final long l;
    public final ed2 m;
    public final q32 n;
    public final gn1 o;
    public final m80 p;

    public r72(long j, long j2, lh0 lh0Var, hh0 hh0Var, ih0 ih0Var, kg0 kg0Var, String str, long j3, th thVar, we2 we2Var, q31 q31Var, long j4, ed2 ed2Var, q32 q32Var, int i) {
        this((i & 1) != 0 ? dr.g : j, (i & 2) != 0 ? yf2.c : j2, (i & 4) != 0 ? null : lh0Var, (i & 8) != 0 ? null : hh0Var, (i & 16) != 0 ? null : ih0Var, (i & 32) != 0 ? null : kg0Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? yf2.c : j3, (i & 256) != 0 ? null : thVar, (i & 512) != 0 ? null : we2Var, (i & 1024) != 0 ? null : q31Var, (i & 2048) != 0 ? dr.g : j4, (i & 4096) != 0 ? null : ed2Var, (i & 8192) != 0 ? null : q32Var, (gn1) null);
    }

    public final boolean a(r72 r72Var) {
        if (this == r72Var) {
            return true;
        }
        if (!yf2.a(this.b, r72Var.b) || !ws0.j(this.c, r72Var.c) || !ws0.j(this.d, r72Var.d) || !ws0.j(this.e, r72Var.e) || !ws0.j(this.f, r72Var.f) || !ws0.j(this.g, r72Var.g) || !yf2.a(this.h, r72Var.h) || !ws0.j(this.i, r72Var.i) || !ws0.j(this.j, r72Var.j) || !ws0.j(this.k, r72Var.k)) {
            return false;
        }
        long j = r72Var.l;
        int i = dr.h;
        return vk2.a(this.l, j) && ws0.j(this.o, r72Var.o);
    }

    public final boolean b(r72 r72Var) {
        return ws0.j(this.a, r72Var.a) && ws0.j(this.m, r72Var.m) && ws0.j(this.n, r72Var.n) && ws0.j(this.p, r72Var.p);
    }

    public final r72 c(r72 r72Var) {
        if (r72Var == null) {
            return this;
        }
        ve2 ve2Var = r72Var.a;
        return s72.a(this, ve2Var.b(), ve2Var.c(), ve2Var.a(), r72Var.b, r72Var.c, r72Var.d, r72Var.e, r72Var.f, r72Var.g, r72Var.h, r72Var.i, r72Var.j, r72Var.k, r72Var.l, r72Var.m, r72Var.n, r72Var.o, r72Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r72)) {
            return false;
        }
        r72 r72Var = (r72) obj;
        return a(r72Var) && b(r72Var);
    }

    public final int hashCode() {
        ve2 ve2Var = this.a;
        long jB = ve2Var.b();
        int i = dr.h;
        int iHashCode = Long.hashCode(jB) * 31;
        rk rkVarC = ve2Var.c();
        int iHashCode2 = (Float.hashCode(ve2Var.a()) + ((iHashCode + (rkVarC != null ? rkVarC.hashCode() : 0)) * 31)) * 31;
        zf2[] zf2VarArr = yf2.b;
        int iC = k3.c(iHashCode2, 31, this.b);
        lh0 lh0Var = this.c;
        int i2 = (iC + (lh0Var != null ? lh0Var.e : 0)) * 31;
        hh0 hh0Var = this.d;
        int iHashCode3 = (i2 + (hh0Var != null ? Integer.hashCode(hh0Var.a) : 0)) * 31;
        ih0 ih0Var = this.e;
        int iHashCode4 = (iHashCode3 + (ih0Var != null ? Integer.hashCode(ih0Var.a) : 0)) * 31;
        kg0 kg0Var = this.f;
        int iHashCode5 = (iHashCode4 + (kg0Var != null ? kg0Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = k3.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        th thVar = this.i;
        int iHashCode6 = (iC2 + (thVar != null ? Float.hashCode(thVar.a) : 0)) * 31;
        we2 we2Var = this.j;
        int iHashCode7 = (iHashCode6 + (we2Var != null ? we2Var.hashCode() : 0)) * 31;
        q31 q31Var = this.k;
        int iC3 = k3.c((iHashCode7 + (q31Var != null ? q31Var.e.hashCode() : 0)) * 31, 31, this.l);
        ed2 ed2Var = this.m;
        int i3 = (iC3 + (ed2Var != null ? ed2Var.a : 0)) * 31;
        q32 q32Var = this.n;
        int iHashCode8 = (i3 + (q32Var != null ? q32Var.hashCode() : 0)) * 31;
        gn1 gn1Var = this.o;
        int iHashCode9 = (iHashCode8 + (gn1Var != null ? gn1Var.hashCode() : 0)) * 31;
        m80 m80Var = this.p;
        return iHashCode9 + (m80Var != null ? m80Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        ve2 ve2Var = this.a;
        sb.append((Object) dr.h(ve2Var.b()));
        sb.append(", brush=");
        sb.append(ve2Var.c());
        sb.append(", alpha=");
        sb.append(ve2Var.a());
        sb.append(", fontSize=");
        sb.append((Object) yf2.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) yf2.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        k3.r(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public r72(ve2 ve2Var, long j, lh0 lh0Var, hh0 hh0Var, ih0 ih0Var, kg0 kg0Var, String str, long j2, th thVar, we2 we2Var, q31 q31Var, long j3, ed2 ed2Var, q32 q32Var, gn1 gn1Var, m80 m80Var) {
        this.a = ve2Var;
        this.b = j;
        this.c = lh0Var;
        this.d = hh0Var;
        this.e = ih0Var;
        this.f = kg0Var;
        this.g = str;
        this.h = j2;
        this.i = thVar;
        this.j = we2Var;
        this.k = q31Var;
        this.l = j3;
        this.m = ed2Var;
        this.n = q32Var;
        this.o = gn1Var;
        this.p = m80Var;
    }

    public r72(long j, long j2, lh0 lh0Var, hh0 hh0Var, ih0 ih0Var, kg0 kg0Var, String str, long j3, th thVar, we2 we2Var, q31 q31Var, long j4, ed2 ed2Var, q32 q32Var, gn1 gn1Var) {
        ve2 srVar;
        if (j != 16) {
            srVar = new sr(j);
        } else {
            srVar = ue2.a;
        }
        this(srVar, j2, lh0Var, hh0Var, ih0Var, kg0Var, str, j3, thVar, we2Var, q31Var, j4, ed2Var, q32Var, gn1Var, null);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 {
    public final yb a;
    public final vf2 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final m40 g;
    public final kw0 h;
    public final jg0 i;
    public final long j;

    public gf2(yb ybVar, vf2 vf2Var, List list, int i, boolean z, int i2, m40 m40Var, kw0 kw0Var, jg0 jg0Var, long j) {
        this.a = ybVar;
        this.b = vf2Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = m40Var;
        this.h = kw0Var;
        this.i = jg0Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf2)) {
            return false;
        }
        gf2 gf2Var = (gf2) obj;
        return ws0.j(this.a, gf2Var.a) && ws0.j(this.b, gf2Var.b) && ws0.j(this.c, gf2Var.c) && this.d == gf2Var.d && this.e == gf2Var.e && this.f == gf2Var.f && ws0.j(this.g, gf2Var.g) && this.h == gf2Var.h && ws0.j(this.i, gf2Var.i) && sw.b(this.j, gf2Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + k3.b(this.f, k3.f((((this.c.hashCode() + k3.d(this.a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) sw.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}

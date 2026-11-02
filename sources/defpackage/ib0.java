package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ib0 extends y71 {
    public final ki2 a;
    public final fi2 b;
    public final fi2 c;
    public final fi2 d;
    public final sb0 e;
    public final kc0 f;
    public final ti0 g;
    public final jb0 h;

    public ib0(ki2 ki2Var, fi2 fi2Var, fi2 fi2Var2, fi2 fi2Var3, sb0 sb0Var, kc0 kc0Var, ti0 ti0Var, jb0 jb0Var) {
        this.a = ki2Var;
        this.b = fi2Var;
        this.c = fi2Var2;
        this.d = fi2Var3;
        this.e = sb0Var;
        this.f = kc0Var;
        this.g = ti0Var;
        this.h = jb0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return ib0Var.a == this.a && ws0.j(ib0Var.b, this.b) && ws0.j(ib0Var.c, this.c) && ws0.j(ib0Var.d, this.d) && ib0Var.e.equals(this.e) && ws0.j(ib0Var.f, this.f) && ib0Var.g == this.g && ws0.j(ib0Var.h, this.h);
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new rb0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        rb0 rb0Var = (rb0) t71Var;
        rb0Var.t = this.a;
        rb0Var.u = this.b;
        rb0Var.v = this.c;
        rb0Var.w = this.d;
        rb0Var.x = this.e;
        rb0Var.y = this.f;
        rb0Var.z = this.g;
        rb0Var.A = this.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fi2 fi2Var = this.b;
        int iHashCode2 = (iHashCode + (fi2Var != null ? fi2Var.hashCode() : 0)) * 31;
        fi2 fi2Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (fi2Var2 != null ? fi2Var2.hashCode() : 0)) * 31;
        fi2 fi2Var3 = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((iHashCode3 + (fi2Var3 != null ? fi2Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}

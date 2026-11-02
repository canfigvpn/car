package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class hq extends y71 {
    public final f91 a;
    public final bp0 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final wu1 f;
    public final ti0 g;

    public hq(f91 f91Var, bp0 bp0Var, boolean z, boolean z2, String str, wu1 wu1Var, ti0 ti0Var) {
        this.a = f91Var;
        this.b = bp0Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = wu1Var;
        this.g = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hq.class != obj.getClass()) {
            return false;
        }
        hq hqVar = (hq) obj;
        return ws0.j(this.a, hqVar.a) && ws0.j(this.b, hqVar.b) && this.c == hqVar.c && this.d == hqVar.d && ws0.j(this.e, hqVar.e) && ws0.j(this.f, hqVar.f) && this.g == hqVar.g;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new jq(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((jq) t71Var).O0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        f91 f91Var = this.a;
        int iHashCode = (f91Var != null ? f91Var.hashCode() : 0) * 31;
        bp0 bp0Var = this.b;
        int iF = k3.f(k3.f((iHashCode + (bp0Var != null ? bp0Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iF + (str != null ? str.hashCode() : 0)) * 31;
        wu1 wu1Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (wu1Var != null ? Integer.hashCode(wu1Var.a) : 0)) * 31);
    }
}

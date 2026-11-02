package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class wa<S> extends y71 {
    public final fi2 a;
    public final da1 b;
    public final ab c;

    public wa(fi2 fi2Var, da1 da1Var, ab abVar) {
        this.a = fi2Var;
        this.b = da1Var;
        this.c = abVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return ws0.j(waVar.a, this.a) && waVar.b.equals(this.b);
    }

    @Override // defpackage.y71
    public final t71 f() {
        za zaVar = new za(1);
        zaVar.t = this.a;
        zaVar.u = this.b;
        zaVar.v = this.c;
        zaVar.w = -9223372034707292160L;
        return zaVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        za zaVar = (za) t71Var;
        zaVar.t = this.a;
        zaVar.u = this.b;
        zaVar.v = this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        fi2 fi2Var = this.a;
        return this.b.hashCode() + ((iHashCode + (fi2Var != null ? fi2Var.hashCode() : 0)) * 31);
    }
}

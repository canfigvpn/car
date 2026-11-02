package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class pq0 extends y71 {
    public final uo2 a;

    public pq0(uo2 uo2Var) {
        this.a = uo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pq0) {
            return ws0.j(((pq0) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new rq0(this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        rq0 rq0Var = (rq0) t71Var;
        uo2 uo2Var = rq0Var.u;
        uo2 uo2Var2 = this.a;
        if (ws0.j(uo2Var2, uo2Var)) {
            return;
        }
        rq0Var.u = uo2Var2;
        rq0Var.G0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

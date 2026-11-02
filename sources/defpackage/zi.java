package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class zi extends y71 {
    public final ej0 a;

    public zi(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zi) {
            return this.a == ((zi) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new aj(this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        me1 me1Var;
        aj ajVar = (aj) t71Var;
        ej0 ej0Var = this.a;
        ajVar.s = ej0Var;
        if (ajVar.e.r && (me1Var = qx.T(ajVar, 2).t) != null) {
            me1Var.r1(ej0Var, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

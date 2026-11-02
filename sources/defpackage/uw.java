package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class uw extends y71 {
    public final ej0 a;

    public uw(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw) && ((uw) obj).a == this.a;
    }

    @Override // defpackage.y71
    public final t71 f() {
        vw vwVar = new vw();
        vwVar.u = this.a;
        return vwVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        vw vwVar = (vw) t71Var;
        ej0 ej0Var = vwVar.u;
        ej0 ej0Var2 = this.a;
        if (ej0Var2 != ej0Var) {
            vwVar.u = ej0Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

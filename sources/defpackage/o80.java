package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class o80 extends y71 {
    public final ej0 a;

    public o80(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o80) {
            return this.a == ((o80) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new rl(new sl(), this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        rl rlVar = (rl) t71Var;
        rlVar.u = this.a;
        rlVar.F0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

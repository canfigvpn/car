package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class lb2 extends y71 {
    public final gm2 a;

    public lb2(gm2 gm2Var) {
        this.a = gm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lb2) {
            return this.a == ((lb2) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        mb2 mb2Var = new mb2(j20.X);
        mb2Var.v = this.a;
        return mb2Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        mb2 mb2Var = (mb2) t71Var;
        gm2 gm2Var = mb2Var.v;
        gm2 gm2Var2 = this.a;
        if (gm2Var != gm2Var2) {
            mb2Var.v = gm2Var2;
            fq2 fq2Var = mb2Var.w;
            if (fq2Var != null) {
                fa faVar = fq2Var.c;
                if (ws0.j(faVar, mb2Var.u)) {
                    return;
                }
                mb2Var.u = faVar;
                mb2Var.G0();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

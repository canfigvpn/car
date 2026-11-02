package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class dk extends y71 {
    public final fk a;

    public dk(fk fkVar) {
        this.a = fkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dk) {
            return ws0.j(this.a, ((dk) obj).a);
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        gk gkVar = new gk();
        gkVar.s = this.a;
        return gkVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        gk gkVar = (gk) t71Var;
        fk fkVar = gkVar.s;
        if (fkVar != null) {
            fkVar.a.j(gkVar);
        }
        fk fkVar2 = this.a;
        if (fkVar2 != null) {
            fkVar2.a.b(gkVar);
        }
        gkVar.s = fkVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

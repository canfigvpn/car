package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ds implements u71 {
    public final u71 a;
    public final u71 b;

    public ds(u71 u71Var, u71 u71Var2) {
        this.a = u71Var;
        this.b = u71Var2;
    }

    @Override // defpackage.u71
    public final Object a(ij0 ij0Var, Object obj) {
        return this.b.a(ij0Var, this.a.a(ij0Var, obj));
    }

    @Override // defpackage.u71
    public final boolean b(ej0 ej0Var) {
        return this.a.b(ej0Var) && this.b.b(ej0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        return this.a.equals(dsVar.a) && ws0.j(this.b, dsVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a(ra.i, "")) + ']';
    }
}

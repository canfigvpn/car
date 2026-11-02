package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class pc2 extends y71 {
    public final ee2 a;

    public pc2(ee2 ee2Var) {
        this.a = ee2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pc2) {
            return this.a == ((pc2) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new rc2(this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((rc2) t71Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

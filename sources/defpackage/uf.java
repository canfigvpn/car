package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uf extends y71 {
    public tf a;
    public ls b;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new tf(this);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
    }

    public final Object h(tx txVar) {
        ls lsVar = this.b;
        if (lsVar == null) {
            lsVar = new ls(true);
            lsVar.R(null);
            this.b = lsVar;
            tf tfVar = this.a;
            if (tfVar != null && tfVar.r) {
                tfVar.F0();
            }
        }
        Object objH0 = lsVar.h0(txVar);
        return objH0 == fz.e ? objH0 : ll2.a;
    }

    public final int hashCode() {
        return 234;
    }
}

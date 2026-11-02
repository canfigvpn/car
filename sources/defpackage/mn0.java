package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mn0 extends y71 {
    public final ui a;

    public mn0(ui uiVar) {
        this.a = uiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mn0 mn0Var = obj instanceof mn0 ? (mn0) obj : null;
        if (mn0Var == null) {
            return false;
        }
        return this.a.equals(mn0Var.a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        nn0 nn0Var = new nn0();
        nn0Var.s = this.a;
        return nn0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((nn0) t71Var).s = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}

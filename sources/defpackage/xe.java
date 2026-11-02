package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class xe extends y71 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xe ? (xe) obj : null) == null) {
            return false;
        }
        ((xe) obj).getClass();
        return true;
    }

    @Override // defpackage.y71
    public final t71 f() {
        ze zeVar = new ze();
        zeVar.s = 0.5714286f;
        zeVar.t = true;
        return zeVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ze zeVar = (ze) t71Var;
        zeVar.s = 0.5714286f;
        zeVar.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(0.5714286f) * 31);
    }
}

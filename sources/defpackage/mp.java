package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mp extends y71 {
    public final s1 a;

    public mp(s1 s1Var) {
        this.a = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mp) {
            return this.a == ((mp) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        lp lpVar = new lp();
        lpVar.s = this.a;
        return lpVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        lp lpVar = (lp) t71Var;
        lpVar.s = this.a;
        n02.l(lpVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

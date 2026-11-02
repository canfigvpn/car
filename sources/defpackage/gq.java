package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gq extends y71 implements k02 {
    public final ej0 a;

    public gq(ej0 ej0Var) {
        this.a = ej0Var;
    }

    @Override // defpackage.k02
    public final i02 d() {
        i02 i02Var = new i02();
        i02Var.g = false;
        i02Var.h = true;
        this.a.h(i02Var);
        return i02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gq) {
            return this.a == ((gq) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new vx(false, true, this.a);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((vx) t71Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

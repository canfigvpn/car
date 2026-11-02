package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xd extends y71 implements k02 {
    public final boolean a;
    public final ej0 b;

    public xd(ej0 ej0Var, boolean z) {
        this.a = z;
        this.b = ej0Var;
    }

    @Override // defpackage.k02
    public final i02 d() {
        i02 i02Var = new i02();
        i02Var.g = this.a;
        this.b.h(i02Var);
        return i02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return this.a == xdVar.a && this.b == xdVar.b;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new vx(this.a, false, this.b);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        vx vxVar = (vx) t71Var;
        vxVar.s = this.a;
        vxVar.u = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}

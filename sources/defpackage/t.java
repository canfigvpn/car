package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements sy {
    public final ty e;

    public t(ty tyVar) {
        this.e = tyVar;
    }

    @Override // defpackage.sy
    public final ty getKey() {
        return this.e;
    }

    @Override // defpackage.uy
    public final /* bridge */ uy k(uy uyVar) {
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public /* bridge */ sy p(ty tyVar) {
        return ex.t(this, tyVar);
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.uy
    public /* bridge */ uy u(ty tyVar) {
        return ex.E(this, tyVar);
    }
}

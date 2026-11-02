package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rm implements sy, ty {
    public static final is1 f = new is1(21);
    public static final rm g = new rm(1);
    public static final rm h = new rm(2);
    public final /* synthetic */ int e;

    public /* synthetic */ rm(int i) {
        this.e = i;
    }

    @Override // defpackage.sy
    public final ty getKey() {
        switch (this.e) {
            case 0:
                return f;
            case 1:
                return g;
            default:
                return this;
        }
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ex.t(this, tyVar);
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ex.E(this, tyVar);
    }
}

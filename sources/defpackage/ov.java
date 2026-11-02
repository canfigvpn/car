package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ov implements ai1, sy {
    public static final is1 f = new is1(23);
    public final ak0 e;

    public ov(ak0 ak0Var) {
        this.e = ak0Var;
    }

    @Override // defpackage.ai1
    public final List c(Integer num) {
        return this.e.E();
    }

    @Override // defpackage.ai1
    public final boolean f() {
        return this.e.C;
    }

    @Override // defpackage.sy
    public final ty getKey() {
        return f;
    }

    @Override // defpackage.uy
    public final /* bridge */ uy k(uy uyVar) {
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final /* bridge */ sy p(ty tyVar) {
        return ex.t(this, tyVar);
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.uy
    public final /* bridge */ uy u(ty tyVar) {
        return ex.E(this, tyVar);
    }
}

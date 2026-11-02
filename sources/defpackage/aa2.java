package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 {
    public final da2 a;
    public ox0 b;
    public final z92 c = new z92(this, 2);
    public final z92 d = new z92(this, 0);
    public final z92 e = new z92(this, 1);

    public aa2(da2 da2Var) {
        this.a = da2Var;
    }

    public final ox0 a() {
        ox0 ox0Var = this.b;
        if (ox0Var != null) {
            return ox0Var;
        }
        qj.r("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}

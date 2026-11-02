package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ox0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nx0(ox0 ox0Var, Object obj, int i) {
        this.a = i;
        this.b = ox0Var;
        this.c = obj;
    }

    public gx0 b() {
        ox0 ox0Var = this.b;
        ax0 ax0Var = (ax0) ox0Var.n.g(this.c);
        if (ax0Var != null) {
            return (gx0) ox0Var.j.g(ax0Var);
        }
        return null;
    }

    public final boolean c() {
        nl1 nl1Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                gx0 gx0VarB = b();
                if (gx0VarB == null || (nl1Var = gx0VarB.f) == null) {
                    return true;
                }
                return nl1Var.c();
        }
    }

    private final void a() {
    }
}

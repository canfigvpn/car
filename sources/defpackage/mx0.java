package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 implements y92 {
    public final e91 a;
    public final /* synthetic */ ox0 b;
    public final /* synthetic */ Object c;

    public mx0(ox0 ox0Var, Object obj) {
        this.b = ox0Var;
        this.c = obj;
        int[] iArr = pr0.a;
        this.a = new e91();
    }

    @Override // defpackage.y92
    public final void a() {
        this.b.g(this.c);
    }

    @Override // defpackage.y92
    public final int b() {
        ax0 ax0Var = (ax0) this.b.n.g(this.c);
        if (ax0Var != null) {
            return ((fa1) ((n91) ax0Var.n()).f).g;
        }
        return 0;
    }

    @Override // defpackage.y92
    public final void c(gc1 gc1Var) {
        he1 he1Var;
        ax0 ax0Var = (ax0) this.b.n.g(this.c);
        t71 t71Var = (ax0Var == null || (he1Var = ax0Var.I) == null) ? null : he1Var.f;
        if (t71Var == null || !t71Var.r) {
            return;
        }
        p12.o(t71Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", gc1Var);
    }

    @Override // defpackage.y92
    public final long d(int i) {
        ax0 ax0Var = (ax0) this.b.n.g(this.c);
        if (ax0Var == null || !ax0Var.H()) {
            return 0L;
        }
        int i2 = ((fa1) ((n91) ax0Var.n()).f).g;
        if (i < 0 || i >= i2) {
            vp0.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        int i3 = ((ax0) ((n91) ax0Var.n()).get(i)).J.p.e;
        return (((long) ((ax0) ((n91) ax0Var.n()).get(i)).J.p.f) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // defpackage.y92
    public final void e(int i, long j) {
        ox0 ox0Var = this.b;
        ax0 ax0Var = (ax0) ox0Var.n.g(this.c);
        if (ax0Var == null || !ax0Var.H()) {
            return;
        }
        int i2 = ((fa1) ((n91) ax0Var.n()).f).g;
        if (i < 0 || i >= i2) {
            vp0.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (ax0Var.I()) {
            vp0.a("Pre-measure called on node that is not placed");
        }
        ax0 ax0Var2 = ox0Var.e;
        ax0Var2.t = true;
        ((e5) dx0.a(ax0Var)).w((ax0) ((n91) ax0Var.n()).get(i), j);
        ax0Var2.t = false;
        this.a.a(i);
    }
}

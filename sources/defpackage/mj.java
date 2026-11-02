package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mj extends c40 implements m02 {
    public ij u;
    public float v;
    public o72 w;
    public u32 x;
    public final rl y;

    public mj(float f, o72 o72Var, u32 u32Var) {
        this.v = f;
        this.w = o72Var;
        this.x = u32Var;
        rl rlVar = new rl(new sl(), new m(6, this));
        F0(rlVar);
        this.y = rlVar;
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        w02.f(z02Var, this.x);
    }

    @Override // defpackage.m02
    public final boolean i() {
        return false;
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}

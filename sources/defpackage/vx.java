package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vx extends t71 implements m02 {
    public boolean s;
    public final boolean t;
    public ej0 u;

    public vx(boolean z, boolean z2, ej0 ej0Var) {
        this.s = z;
        this.t = z2;
        this.u = ej0Var;
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        this.u.h(z02Var);
    }

    @Override // defpackage.m02
    public final boolean g0() {
        return this.t;
    }

    @Override // defpackage.m02
    public final boolean h0() {
        return this.s;
    }
}

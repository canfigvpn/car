package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d01 implements bz0 {
    public final q01 a;

    public d01(q01 q01Var) {
        this.a = q01Var;
    }

    @Override // defpackage.bz0
    public final int a() {
        return this.a.j().n;
    }

    @Override // defpackage.bz0
    public final int b() {
        return Math.min(a() - 1, ((l01) vq.W(this.a.j().k)).a);
    }

    @Override // defpackage.bz0
    public final boolean c() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.bz0
    public final int d() {
        int i;
        q01 q01Var = this.a;
        if (q01Var.j().k.isEmpty()) {
            return 0;
        }
        k01 k01VarJ = q01Var.j();
        int iG = (int) (k01VarJ.o == di1.e ? k01VarJ.g() & 4294967295L : k01VarJ.g() >> 32);
        int iR = rw.R(q01Var.j());
        if (iR != 0 && (i = iG / iR) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.bz0
    public final int e() {
        return Math.max(0, this.a.h());
    }
}

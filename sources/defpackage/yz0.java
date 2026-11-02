package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 implements xz0 {
    public final v40 a;
    public final /* synthetic */ q01 b;
    public final /* synthetic */ boolean c;

    public yz0(q01 q01Var, boolean z) {
        this.b = q01Var;
        this.c = z;
        this.a = e72.b(new b10(q01Var, 1));
    }

    @Override // defpackage.xz0
    public final int a() {
        q01 q01Var = this.b;
        return (int) (q01Var.j().o == di1.e ? q01Var.j().g() & 4294967295L : q01Var.j().g() >> 32);
    }

    @Override // defpackage.xz0
    public final Object b(int i, m10 m10Var) {
        Object objL = q01.l(this.b, i, m10Var);
        return objL == fz.e ? objL : ll2.a;
    }

    @Override // defpackage.xz0
    public final float c() {
        q01 q01Var = this.b;
        return (q01Var.h() * 500) + q01Var.i();
    }

    @Override // defpackage.xz0
    public final sq d() {
        boolean z = this.c;
        v40 v40Var = this.a;
        return z ? new sq(((Number) v40Var.getValue()).intValue(), 1) : new sq(1, ((Number) v40Var.getValue()).intValue());
    }

    @Override // defpackage.xz0
    public final int e() {
        q01 q01Var = this.b;
        return (-q01Var.j().l) + q01Var.j().p;
    }

    @Override // defpackage.xz0
    public final float f() {
        q01 q01Var = this.b;
        int iH = q01Var.h();
        int i = q01Var.i();
        return q01Var.c() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u61 extends dw0 implements ti0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ v61 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u61(v61 v61Var, int i) {
        super(0);
        this.f = i;
        this.g = v61Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        v61 v61Var = this.g;
        switch (i) {
            case 0:
                ex0 ex0Var = v61Var.j;
                ex0Var.i = 0;
                fa1 fa1VarZ = ex0Var.a.z();
                Object[] objArr = fa1VarZ.e;
                int i2 = fa1VarZ.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    v61 v61Var2 = ((ax0) objArr[i3]).J.p;
                    v61Var2.l = v61Var2.m;
                    v61Var2.m = Integer.MAX_VALUE;
                    v61Var2.x = false;
                    if (v61Var2.p == yw0.f) {
                        v61Var2.p = yw0.g;
                    }
                }
                ax0 ax0Var = ex0Var.a;
                ax0 ax0Var2 = ex0Var.a;
                fa1 fa1VarZ2 = ax0Var.z();
                Object[] objArr2 = fa1VarZ2.e;
                int i4 = fa1VarZ2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((ax0) objArr2[i5]).J.p.B.d = false;
                }
                if (v61Var.o().o) {
                    n91 n91Var = (n91) ax0Var2.n();
                    int i6 = ((fa1) n91Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((ax0) n91Var.get(i7)).I.d.o = true;
                    }
                }
                v61Var.o().A0().b();
                if (v61Var.o().o) {
                    n91 n91Var2 = (n91) ax0Var2.n();
                    int i8 = ((fa1) n91Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((ax0) n91Var2.get(i9)).I.d.o = false;
                    }
                }
                fa1 fa1VarZ3 = ax0Var2.z();
                Object[] objArr3 = fa1VarZ3.e;
                int i10 = fa1VarZ3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    ax0 ax0Var3 = (ax0) objArr3[i11];
                    ex0 ex0Var2 = ax0Var3.J;
                    if (ex0Var2.p.l != ax0Var3.v()) {
                        ax0Var2.O();
                        ax0Var2.C();
                        if (ax0Var3.v() == Integer.MAX_VALUE) {
                            if (ex0Var2.c || ex.B(ax0Var3)) {
                                d51 d51Var = ex0Var2.q;
                                d51Var.getClass();
                                d51Var.t0(false);
                            }
                            ex0Var2.p.u0();
                        }
                    }
                }
                fa1 fa1VarZ4 = ax0Var2.z();
                Object[] objArr4 = fa1VarZ4.e;
                int i12 = fa1VarZ4.g;
                for (int i13 = 0; i13 < i12; i13++) {
                    bx0 bx0Var = ((ax0) objArr4[i13]).J.p.B;
                    bx0Var.e = bx0Var.d;
                }
                break;
            case 1:
                v61Var.j.a().e(v61Var.F);
                break;
            default:
                ex0 ex0Var3 = v61Var.j;
                me1 me1Var = ex0Var3.a().u;
                im1 placementScope = me1Var != null ? me1Var.p : ((e5) dx0.a(ex0Var3.a)).getPlacementScope();
                ej0 ej0Var = v61Var.K;
                if (ej0Var == null) {
                    me1 me1VarA = ex0Var3.a();
                    long j = v61Var.L;
                    float f = v61Var.M;
                    placementScope.f(me1VarA);
                    me1VarA.l0(ir0.c(j, me1VarA.i), f, null);
                } else {
                    me1 me1VarA2 = ex0Var3.a();
                    long j2 = v61Var.L;
                    float f2 = v61Var.M;
                    placementScope.f(me1VarA2);
                    me1VarA2.l0(ir0.c(j2, me1VarA2.i), f2, ej0Var);
                }
                break;
        }
        return ll2Var;
    }
}

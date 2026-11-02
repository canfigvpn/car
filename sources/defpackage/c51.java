package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c51 extends dw0 implements ti0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d51 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c51(d51 d51Var, int i) {
        super(0);
        this.f = i;
        this.g = d51Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        z41 z41VarQ0;
        int i = this.f;
        ll2 ll2Var = ll2.a;
        d51 d51Var = this.g;
        switch (i) {
            case 0:
                ex0 ex0Var = d51Var.j;
                ex0Var.h = 0;
                fa1 fa1VarZ = ex0Var.a.z();
                Object[] objArr = fa1VarZ.e;
                int i2 = fa1VarZ.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    d51 d51Var2 = ((ax0) objArr[i3]).J.q;
                    d51Var2.getClass();
                    d51Var2.l = d51Var2.m;
                    d51Var2.m = Integer.MAX_VALUE;
                    if (d51Var2.n == yw0.f) {
                        d51Var2.n = yw0.g;
                    }
                }
                ax0 ax0Var = ex0Var.a;
                ax0 ax0Var2 = ex0Var.a;
                fa1 fa1VarZ2 = ax0Var.z();
                Object[] objArr2 = fa1VarZ2.e;
                int i4 = fa1VarZ2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    d51 d51Var3 = ((ax0) objArr2[i5]).J.q;
                    d51Var3.getClass();
                    d51Var3.v.d = false;
                }
                aq0 aq0Var = d51Var.o().W;
                if (aq0Var != null) {
                    boolean z = aq0Var.o;
                    n91 n91Var = (n91) ax0Var2.n();
                    int i6 = ((fa1) n91Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        z41 z41VarQ1 = ((ax0) n91Var.get(i7)).I.d.Q0();
                        if (z41VarQ1 != null) {
                            z41VarQ1.o = z;
                        }
                    }
                }
                aq0 aq0Var2 = d51Var.o().W;
                aq0Var2.getClass();
                aq0Var2.A0().b();
                if (d51Var.o().W != null) {
                    n91 n91Var2 = (n91) ax0Var2.n();
                    int i8 = ((fa1) n91Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        z41 z41VarQ2 = ((ax0) n91Var2.get(i9)).I.d.Q0();
                        if (z41VarQ2 != null) {
                            z41VarQ2.o = false;
                        }
                    }
                }
                fa1 fa1VarZ3 = ax0Var2.z();
                Object[] objArr3 = fa1VarZ3.e;
                int i10 = fa1VarZ3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    d51 d51Var4 = ((ax0) objArr3[i11]).J.q;
                    d51Var4.getClass();
                    int i12 = d51Var4.l;
                    int i13 = d51Var4.m;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        d51Var4.t0(true);
                    }
                }
                fa1 fa1VarZ4 = ax0Var2.z();
                Object[] objArr4 = fa1VarZ4.e;
                int i14 = fa1VarZ4.g;
                for (int i15 = 0; i15 < i14; i15++) {
                    d51 d51Var5 = ((ax0) objArr4[i15]).J.q;
                    d51Var5.getClass();
                    bx0 bx0Var = d51Var5.v;
                    bx0Var.e = bx0Var.d;
                }
                break;
            case 1:
                ex0 ex0Var2 = d51Var.j;
                im1 placementScope = null;
                if (ex.B(ex0Var2.a) || ex0Var2.c) {
                    me1 me1Var = ex0Var2.a().u;
                    if (me1Var != null) {
                        placementScope = me1Var.p;
                    }
                } else {
                    me1 me1Var2 = ex0Var2.a().u;
                    if (me1Var2 != null && (z41VarQ0 = me1Var2.Q0()) != null) {
                        placementScope = z41VarQ0.p;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((e5) dx0.a(ex0Var2.a)).getPlacementScope();
                }
                z41 z41VarQ3 = ex0Var2.a().Q0();
                z41VarQ3.getClass();
                im1.j(placementScope, z41VarQ3, d51Var.s);
                break;
            default:
                z41 z41VarQ4 = d51Var.j.a().Q0();
                z41VarQ4.getClass();
                z41VarQ4.e(d51Var.C);
                break;
        }
        return ll2Var;
    }
}

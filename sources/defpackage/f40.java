package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f40 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h40 f;

    public /* synthetic */ f40(h40 h40Var, int i) {
        this.e = i;
        this.f = h40Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        h40 h40Var = this.f;
        switch (i) {
            case 0:
                pu1 pu1Var = (pu1) ir2.j(h40Var, tu1.a);
                x8 x8Var = h40Var.y;
                if (pu1Var == null) {
                    if (x8Var != null) {
                        h40Var.G0(x8Var);
                    }
                    h40Var.y = null;
                } else if (x8Var == null) {
                    g40 g40Var = new g40(h40Var);
                    f40 f40Var = new f40(h40Var, 1);
                    ur0 ur0Var = h40Var.u;
                    boolean z = h40Var.v;
                    float f = h40Var.w;
                    lj2 lj2Var = uu1.a;
                    x8 x8Var2 = new x8(ur0Var, z, f, g40Var, f40Var);
                    h40Var.F0(x8Var2);
                    h40Var.y = x8Var2;
                }
                return ll2.a;
            default:
                return ws0.L;
        }
    }
}

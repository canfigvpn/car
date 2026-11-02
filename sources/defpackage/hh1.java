package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hh1 extends zh1 {
    public static final hh1 d;
    public static final hh1 e;
    public static final hh1 f;
    public static final hh1 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new hh1(i, 2, 0);
        int i2 = 1;
        e = new hh1(i2, i2, 1);
        f = new hh1(i, 2, 2);
        int i3 = 1;
        g = new hh1(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        switch (this.c) {
            case 0:
                Object objA = ((ti0) vpVar.e(0)).a();
                vj0 vj0Var = (vj0) vpVar.e(1);
                int iD = vpVar.d(0);
                vj0Var.getClass();
                o52Var.T(o52Var.c(vj0Var), objA);
                aeVar.f(iD, objA);
                aeVar.d(objA);
                break;
            case 1:
                vj0 vj0Var2 = (vj0) vpVar.e(0);
                int iD2 = vpVar.d(0);
                aeVar.s();
                vj0Var2.getClass();
                aeVar.c(iD2, o52Var.C(o52Var.c(vj0Var2)));
                break;
            case 2:
                Object objE = vpVar.e(0);
                vj0 vj0Var3 = (vj0) vpVar.e(1);
                int iD3 = vpVar.d(0);
                if (objE instanceof ek0) {
                    ek0 ek0Var = (ek0) objE;
                    ((fa1) rs1Var.d).b(ek0Var);
                    ((x91) rs1Var.g).a(ek0Var);
                }
                Object objJ = o52Var.J(o52Var.c(vj0Var3), iD3, objE);
                if (objJ instanceof ek0) {
                    rs1Var.f((ek0) objJ);
                } else if (objJ instanceof lr1) {
                    ((lr1) objJ).c();
                }
                break;
            default:
                Object objE2 = vpVar.e(0);
                int iD4 = vpVar.d(0);
                if (objE2 instanceof ek0) {
                    ek0 ek0Var2 = (ek0) objE2;
                    ((fa1) rs1Var.d).b(ek0Var2);
                    ((x91) rs1Var.g).a(ek0Var2);
                }
                Object objJ2 = o52Var.J(o52Var.t, iD4, objE2);
                if (objJ2 instanceof ek0) {
                    rs1Var.f((ek0) objJ2);
                } else if (objJ2 instanceof lr1) {
                    ((lr1) objJ2).c();
                }
                break;
        }
    }

    @Override // defpackage.zh1
    public vj0 b(vp vpVar) {
        switch (this.c) {
            case 0:
                return (vj0) vpVar.e(1);
            case 1:
                return (vj0) vpVar.e(0);
            default:
                return super.b(vpVar);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg0 extends tj0 implements ij0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        boolean zA;
        int i = this.l;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                bg0 bg0Var = (bg0) obj;
                bg0 bg0Var2 = (bg0) obj2;
                gg0 gg0Var = (gg0) obj3;
                if (gg0Var.r && (zA = bg0Var2.a()) != bg0Var.a()) {
                    ej0 ej0Var = gg0Var.v;
                    if (ej0Var != null) {
                        ej0Var.h(Boolean.valueOf(zA));
                    }
                    sx sxVar = null;
                    if (zA) {
                        nj2.y(gg0Var.t0(), null, new ln(3, sxVar, gg0Var), 3);
                        gs1 gs1Var = new gs1();
                        ux.C(gg0Var, new n1(16, gs1Var, gg0Var));
                        pz0 pz0Var = (pz0) gs1Var.e;
                        if (pz0Var != null) {
                            pz0Var.a();
                        } else {
                            pz0Var = null;
                        }
                        gg0Var.x = pz0Var;
                        me1 me1Var = gg0Var.y;
                        if (me1Var != null && me1Var.S0().r) {
                            gg0Var.J0();
                        }
                    } else {
                        pz0 pz0Var2 = gg0Var.x;
                        if (pz0Var2 != null) {
                            pz0Var2.b();
                        }
                        gg0Var.x = null;
                        gg0Var.J0();
                    }
                    n02.l(gg0Var);
                    f91 f91Var = gg0Var.u;
                    if (f91Var != null) {
                        nf0 nf0Var = gg0Var.w;
                        if (zA) {
                            if (nf0Var != null) {
                                gg0Var.I0(f91Var, new of0(nf0Var));
                                gg0Var.w = null;
                            }
                            nf0 nf0Var2 = new nf0();
                            gg0Var.I0(f91Var, nf0Var2);
                            gg0Var.w = nf0Var2;
                        } else if (nf0Var != null) {
                            gg0Var.I0(f91Var, new of0(nf0Var));
                            gg0Var.w = null;
                        }
                    }
                }
                return ll2.a;
            case 1:
                s12 s12Var = (s12) obj;
                int iIntValue = ((Number) obj2).intValue();
                s12Var.getClass();
                ku0 ku0Var = (ku0) obj3;
                ku0Var.getClass();
                boolean z = !s12Var.k(iIntValue) && s12Var.j(iIntValue).h();
                ku0Var.b = z;
                return Boolean.valueOf(z);
            case 2:
                return dv1.p((bv1) obj3, (ej0) obj, (sx) obj2);
            default:
                return dv1.p((bv1) obj3, (ej0) obj, (sx) obj2);
        }
    }
}

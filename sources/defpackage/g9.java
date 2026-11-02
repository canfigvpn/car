package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g9 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g9(Object obj, boolean z, int i) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        is1 is1Var = cv.a;
        int i2 = 1;
        final boolean z = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                final ti0 ti0Var = (ti0) obj4;
                u71 u71Var = (u71) obj;
                ak0 ak0Var = (ak0) obj2;
                ((Integer) obj3).getClass();
                ak0Var.W(-196777734);
                final long j = ((pf2) ak0Var.j(qf2.a)).a;
                boolean zE = ak0Var.e(j) | ak0Var.f(ti0Var) | ak0Var.g(z);
                Object objL = ak0Var.L();
                if (zE || objL == is1Var) {
                    objL = new ej0() { // from class: h9
                        @Override // defpackage.ej0
                        public final Object h(Object obj5) {
                            sl slVar = (sl) obj5;
                            final g7 g7VarU = sv0.U(slVar, Float.intBitsToFloat((int) (slVar.e.d() >> 32)) / 2.0f);
                            final yi yiVar = new yi(5, j);
                            final ti0 ti0Var2 = ti0Var;
                            final boolean z2 = z;
                            return slVar.a(new ej0() { // from class: z8
                                @Override // defpackage.ej0
                                public final Object h(Object obj6) {
                                    cx0 cx0Var = (cx0) obj6;
                                    cx0Var.a();
                                    um umVar = cx0Var.e;
                                    boolean zBooleanValue = ((Boolean) ti0Var2.a()).booleanValue();
                                    ll2 ll2Var = ll2.a;
                                    if (!zBooleanValue) {
                                        return ll2Var;
                                    }
                                    boolean z3 = z2;
                                    g7 g7Var = g7VarU;
                                    yi yiVar2 = yiVar;
                                    if (!z3) {
                                        l80.J(cx0Var, g7Var, yiVar2);
                                        return ll2Var;
                                    }
                                    long jV = umVar.V();
                                    ud udVar = umVar.f;
                                    long jM = udVar.m();
                                    udVar.g().l();
                                    try {
                                        ((ao2) udVar.b).s(-1.0f, 1.0f, jV);
                                        l80.J(cx0Var, g7Var, yiVar2);
                                        return ll2Var;
                                    } finally {
                                        k3.s(udVar, jM);
                                    }
                                }
                            });
                        }
                    };
                    ak0Var.g0(objL);
                }
                u71 u71VarM = ir2.m(u71Var, (ej0) objL);
                ak0Var.p(false);
                return u71VarM;
            case 1:
                ic1 ic1Var = (ic1) obj4;
                gj1 gj1Var = (gj1) obj;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gj1Var.getClass();
                int i3 = 2;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ak0Var2.f(gj1Var) ? 4 : 2;
                }
                if (ak0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    wm0 wm0Var = wm0.INSTANCE;
                    u71 u71VarF0 = p61.f0(r71.a, 0.0f, 0.0f, 0.0f, z ? gj1Var.c() : 0.0f, 7);
                    boolean zH = ak0Var2.h(ic1Var);
                    Object objL2 = ak0Var2.L();
                    if (zH || objL2 == is1Var) {
                        objL2 = new eb1(ic1Var, i3);
                        ak0Var2.g0(objL2);
                    }
                    ei1.c(ic1Var, wm0Var, u71VarF0, null, null, null, null, null, null, (ej0) objL2, ak0Var2, 48);
                } else {
                    ak0Var2.R();
                }
                return ll2.a;
            default:
                jm1 jm1VarE = ((r61) obj2).e(((sw) obj3).a);
                return ((y61) obj).d0(jm1VarE.e, jm1VarE.f, db0.e, new c50(i2, (p82) obj4, jm1VarE, z));
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xh implements wc2 {
    public final gt a;
    public final pa1 b = new pa1();
    public final dk1 c = y12.s(null);

    public xh(gt gtVar) {
        this.a = gtVar;
    }

    @Override // defpackage.wc2
    public final Object a(nc2 nc2Var, wa2 wa2Var) {
        Object objW = qx.w(new na1(ia1.e, this.b, new o9(1, null, this, new wh(nc2Var)), null), wa2Var);
        return objW == fz.e ? objW : ll2.a;
    }

    public final void b(final ti0 ti0Var, ak0 ak0Var, final int i) {
        final ti0 ti0Var2;
        ak0 ak0Var2;
        ak0Var.X(723898654);
        int i2 = (ak0Var.f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            wh whVar = (wh) this.c.getValue();
            if (whVar == null) {
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0(this, ti0Var, i, i3) { // from class: vh
                        public final /* synthetic */ int e;
                        public final /* synthetic */ xh f;
                        public final /* synthetic */ ti0 g;

                        {
                            this.e = i3;
                            this.f = this;
                        }

                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            int i5 = this.e;
                            ll2 ll2Var = ll2.a;
                            ti0 ti0Var3 = this.g;
                            xh xhVar = this.f;
                            ak0 ak0Var3 = (ak0) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    xhVar.b(ti0Var3, ak0Var3, ei1.P(7));
                                    break;
                                default:
                                    xhVar.b(ti0Var3, ak0Var3, ei1.P(7));
                                    break;
                            }
                            return ll2Var;
                        }
                    };
                    return;
                }
                return;
            }
            ti0Var2 = ti0Var;
            ak0Var2 = ak0Var;
            this.a.j(whVar, whVar.a, ti0Var2, ak0Var2, 384);
        } else {
            ti0Var2 = ti0Var;
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR2 = ak0Var2.r();
        if (lr1VarR2 != null) {
            lr1VarR2.d = new ij0(this, ti0Var2, i, i4) { // from class: vh
                public final /* synthetic */ int e;
                public final /* synthetic */ xh f;
                public final /* synthetic */ ti0 g;

                {
                    this.e = i4;
                    this.f = this;
                }

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    int i5 = this.e;
                    ll2 ll2Var = ll2.a;
                    ti0 ti0Var3 = this.g;
                    xh xhVar = this.f;
                    ak0 ak0Var3 = (ak0) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            xhVar.b(ti0Var3, ak0Var3, ei1.P(7));
                            break;
                        default:
                            xhVar.b(ti0Var3, ak0Var3, ei1.P(7));
                            break;
                    }
                    return ll2Var;
                }
            };
        }
    }
}

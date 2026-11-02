package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ax extends wa2 implements ij0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(bn1 bn1Var, String str, long j, of2 of2Var, me2 me2Var, xf1 xf1Var, sx sxVar) {
        super(2, sxVar);
        this.l = bn1Var;
        this.m = str;
        this.k = j;
        this.n = of2Var;
        this.o = me2Var;
        this.p = xf1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((ax) p((sx) obj2, (sy1) obj)).r(ll2Var);
            default:
                return ((ax) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                ax axVar = new ax((wl2) obj5, (cx) obj4, (mk) obj3, this.k, (ot0) obj2, sxVar);
                axVar.l = obj;
                return axVar;
            default:
                return new ax((bn1) this.l, (String) obj5, this.k, (of2) obj4, (me2) obj3, (xf1) obj2, sxVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        Object objK;
        int i = this.i;
        Object obj2 = this.n;
        fz fzVar = fz.e;
        Object obj3 = this.o;
        Object obj4 = this.m;
        Object obj5 = this.p;
        ll2 ll2Var = ll2.a;
        sx sxVar = null;
        switch (i) {
            case 0:
                mk mkVar = (mk) obj3;
                cx cxVar = (cx) obj2;
                wl2 wl2Var = (wl2) obj4;
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    sy1 sy1Var = (sy1) this.l;
                    wl2Var.e = cxVar.F0(mkVar, this.k);
                    o1 o1Var = new o1(cxVar, wl2Var, (ot0) obj5, sy1Var);
                    vf vfVar = new vf(cxVar, wl2Var, mkVar, 5);
                    this.j = 1;
                    if (wl2Var.a(o1Var, vfVar, this) == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i2 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                xf1 xf1Var = (xf1) obj5;
                String str = (String) obj4;
                me2 me2Var = (me2) obj3;
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    bn1 bn1Var = (bn1) this.l;
                    this.j = 1;
                    en1 en1Var = (en1) bn1Var;
                    en1Var.getClass();
                    if (str.length() == 0) {
                        objK = null;
                    } else {
                        long j = this.k;
                        if (of2.c(j)) {
                            objK = null;
                        } else {
                            objK = nj2.K(en1Var.a, new n7(8, sxVar, en1Var, new dn1(j, null, en1Var, str)), this);
                        }
                    }
                    if (objK == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                    objK = obj;
                    str = str;
                }
                of2 of2Var = (of2) objK;
                if (of2Var != null) {
                    long j2 = of2Var.a;
                    long jC = j02.c(xf1Var.n((int) (j2 >> 32)), xf1Var.n((int) (j2 & 4294967295L)));
                    if (!of2.a(jC, (of2) obj2) && ws0.j(me2Var.l().a.f, str) && xf1Var == me2Var.b) {
                        me2Var.c.h(me2.b(me2Var.l().a, jC));
                        me2Var.v = new of2(jC);
                    }
                }
                return ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(wl2 wl2Var, cx cxVar, mk mkVar, long j, ot0 ot0Var, sx sxVar) {
        super(2, sxVar);
        this.m = wl2Var;
        this.n = cxVar;
        this.o = mkVar;
        this.k = j;
        this.p = ot0Var;
    }
}

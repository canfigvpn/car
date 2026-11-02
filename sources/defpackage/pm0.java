package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 extends wa2 implements jj0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ qe0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm0(int i, sx sxVar, Object obj, Object obj2) {
        super(3, sxVar);
        this.i = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj4 = this.n;
        Object obj5 = this.m;
        qe0 qe0Var = (qe0) obj;
        sx sxVar = (sx) obj3;
        switch (i) {
            case 0:
                pm0 pm0Var = new pm0(0, sxVar, (q22) obj5, (rm0) obj4);
                pm0Var.k = qe0Var;
                pm0Var.l = obj2;
                return pm0Var.r(ll2Var);
            default:
                pm0 pm0Var2 = new pm0(1, sxVar, (ln0) obj5, (m32) obj4);
                pm0Var2.k = qe0Var;
                pm0Var2.l = obj2;
                return pm0Var2.r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        qe0 qe0Var;
        pe0 ze0Var;
        pe0 ze0Var2;
        int i = this.i;
        Object obj2 = this.n;
        fz fzVar = fz.e;
        Object obj3 = this.m;
        ll2 ll2Var = ll2.a;
        int i2 = 1;
        switch (i) {
            case 0:
                q22 q22Var = (q22) obj3;
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    qe0 qe0Var2 = this.k;
                    wm wmVar = (wm) this.l;
                    if (wmVar == null) {
                        ze0Var = new ue0(0, new om0(15));
                        qe0Var = null;
                    } else {
                        rn rnVarB = q22Var.b(wmVar.a);
                        rn rnVarD = q22Var.d();
                        s82 s82Var = ((rm0) obj2).b;
                        qe0Var = null;
                        ze0Var = new ze0(i2, new pe0[]{rnVarB, rnVarD, s82Var}, new qm0(wmVar, null));
                    }
                    this.k = qe0Var;
                    this.l = qe0Var;
                    this.j = 1;
                    if (qe0Var2 instanceof qg2) {
                        throw ((qg2) qe0Var2).e;
                    }
                    Object objA = ze0Var.a(qe0Var2, this);
                    if (objA != fzVar) {
                        objA = ll2Var;
                    }
                    if (objA == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                ln0 ln0Var = (ln0) obj3;
                q22 q22Var2 = ln0Var.c;
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    qe0 qe0Var3 = this.k;
                    wm wmVar2 = (wm) this.l;
                    if (wmVar2 == null) {
                        ze0Var2 = new ue0(0, new hn0(14));
                    } else {
                        long j = wmVar2.a;
                        rn rnVarD2 = q22Var2.d();
                        rn rnVarC = q22Var2.c(j);
                        rn rnVarB2 = q22Var2.b(j);
                        rn rnVar = new rn(ei1.n(ln0Var.b.f.a, new String[]{"odometer_readings"}, new g6(6, j)), 1);
                        jr1 jr1Var = ((m32) obj2).i;
                        ze0Var2 = new ze0(3, new pe0[]{rnVarD2, rnVarC, rnVarB2, rnVar, jr1Var}, new jn0(ln0Var, wmVar2, null));
                    }
                    this.k = null;
                    this.l = null;
                    this.j = 1;
                    if (qe0Var3 instanceof qg2) {
                        throw ((qg2) qe0Var3).e;
                    }
                    Object objA2 = ze0Var2.a(qe0Var3, this);
                    if (objA2 != fzVar) {
                        objA2 = ll2Var;
                    }
                    if (objA2 == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i4 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
        }
    }
}

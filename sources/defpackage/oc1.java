package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 extends wa2 implements ij0 {
    public final /* synthetic */ int i = 0;
    public int j;
    public float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(float f, fz1 fz1Var, kb1 kb1Var, sx sxVar) {
        super(2, sxVar);
        this.k = f;
        this.l = fz1Var;
        this.m = kb1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((oc1) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new oc1(this.k, (fz1) this.l, (kb1) obj2, sxVar);
            case 1:
                return new oc1((jp) this.l, this.k, (nb) obj2, sxVar);
            default:
                oc1 oc1Var = new oc1((ki2) obj2, sxVar);
                oc1Var.l = obj;
                return oc1Var;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        Object objA;
        final float fK;
        ez ezVar;
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.m;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                fz1 fz1Var = (fz1) this.l;
                float f = this.k;
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    if (f > 0.0f) {
                        this.j = 1;
                        if (fz1Var.s(f, fz1Var.b.getValue(), this) != fzVar) {
                        }
                    }
                    return fzVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                if (f != 0.0f) {
                    return ll2Var;
                }
                kb1 kb1Var = (kb1) obj2;
                this.j = 2;
                ki2 ki2Var = fz1Var.e;
                if (ki2Var == null || ((ws0.j(fz1Var.c.getValue(), kb1Var) && ws0.j(fz1Var.b.getValue(), kb1Var)) || (objA = qa1.a(fz1Var.k, new zy1(fz1Var, kb1Var, ki2Var, (sx) null), this)) != fzVar)) {
                    objA = ll2Var;
                }
                if (objA != fzVar) {
                    return ll2Var;
                }
                return fzVar;
            case 1:
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    return ia.a((ia) ((jp) this.l).c, new Float(this.k), (nb) obj2, this) == fzVar ? fzVar : ll2Var;
                }
                if (i3 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    ez ezVar2 = (ez) this.l;
                    fK = c12.k(ezVar2.h());
                    ezVar = ezVar2;
                } else {
                    if (i4 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fK = this.k;
                    ezVar = (ez) this.l;
                    ix.Q(obj);
                }
                while (qx.H(ezVar)) {
                    final ki2 ki2Var2 = (ki2) obj2;
                    ej0 ej0Var = new ej0() { // from class: ji2
                        @Override // defpackage.ej0
                        public final Object h(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            ki2 ki2Var3 = ki2Var2;
                            boolean zG = ki2Var3.g();
                            bk1 bk1Var = ki2Var3.g;
                            if (!zG) {
                                if (bk1Var.h() == Long.MIN_VALUE) {
                                    bk1Var.i(jLongValue);
                                    ((dk1) ki2Var3.a.a).setValue(Boolean.TRUE);
                                }
                                long jH = jLongValue - bk1Var.h();
                                float f2 = fK;
                                if (f2 != 0.0f) {
                                    jH = p61.k0(jH / ((double) f2));
                                }
                                ki2Var3.n(jH);
                                ki2Var3.h(jH, f2 == 0.0f);
                            }
                            return ll2.a;
                        }
                    };
                    this.l = ezVar;
                    this.k = fK;
                    this.j = 1;
                    uy uyVar = this.f;
                    uyVar.getClass();
                    if (sv.K(uyVar).a(this, ej0Var) == fzVar) {
                        return fzVar;
                    }
                }
                return ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(jp jpVar, float f, nb nbVar, sx sxVar) {
        super(2, sxVar);
        this.l = jpVar;
        this.k = f;
        this.m = nbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(ki2 ki2Var, sx sxVar) {
        super(2, sxVar);
        this.m = ki2Var;
    }
}

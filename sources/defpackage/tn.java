package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tn extends wa2 implements ej0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn(Object obj, Serializable serializable, Object obj2, sx sxVar, int i) {
        super(1, sxVar);
        this.i = i;
        this.k = obj;
        this.l = serializable;
        this.m = obj2;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                return new tn((vn) obj3, (wm) obj2, (sx) obj).r(ll2Var);
            case 1:
                return new tn((nk1) this.k, (xh2) obj3, (ij0) obj2, (sx) obj, 1).r(ll2Var);
            default:
                return new tn((mh2) this.k, (fe2) obj3, (ia1) obj2, (sx) obj, 2).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        Object objR;
        cn cnVar;
        int i = this.i;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        Object obj2 = this.l;
        Object obj3 = this.m;
        int i2 = 1;
        sx sxVar = null;
        switch (i) {
            case 0:
                vn vnVar = (vn) obj2;
                wm wmVar = (wm) obj3;
                int i3 = this.j;
                int i4 = 3;
                if (i3 == 0) {
                    ix.Q(obj);
                    bn bnVar = vnVar.c;
                    long j = wmVar.a;
                    this.j = 1;
                    objR = sv.R(this, new g6(i4, j), bnVar.a, true, false);
                    if (objR != fzVar) {
                    }
                    return fzVar;
                }
                if (i3 == 1) {
                    ix.Q(obj);
                    objR = obj;
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            ix.Q(obj);
                            return ll2Var;
                        }
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cnVar = (cn) this.k;
                    ix.Q(obj);
                }
                if (cnVar == null && cnVar.k != wmVar.h) {
                    rf1 rf1Var = vnVar.f;
                    long j2 = wmVar.a;
                    vnVar.b.getClass();
                    sf1 sf1Var = new sf1(0L, j2, jb2.a(), wmVar.h, "MANUAL", null);
                    this.k = null;
                    this.j = 3;
                    if (rf1Var.a(sf1Var, this) != fzVar) {
                        return ll2Var;
                    }
                    return fzVar;
                }
                cnVar = (cn) objR;
                bn bnVar2 = vnVar.c;
                cn cnVarK = ei1.K(wmVar);
                this.k = cnVar;
                this.j = 2;
                Object objR2 = sv.R(this, new ym(bnVar2, cnVarK, i2), bnVar2.a, false, true);
                if (objR2 != fzVar) {
                    objR2 = ll2Var;
                }
                if (objR2 != fzVar) {
                    return cnVar == null ? ll2Var : ll2Var;
                }
                return fzVar;
            case 1:
                int i5 = this.j;
                if (i5 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    Object objE = ((nk1) this.k).e((xh2) obj2, (ij0) obj3, this);
                    return objE == fzVar ? fzVar : objE;
                }
                if (i5 == 1) {
                    ix.Q(obj);
                    return obj;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ia1 ia1Var = (ia1) obj3;
                fe2 fe2Var = (fe2) obj2;
                mh2 mh2Var = (mh2) this.k;
                int i6 = this.j;
                ia1 ia1Var2 = ia1.g;
                try {
                    if (i6 == 0) {
                        ix.Q(obj);
                        ln lnVar = new ln(17, sxVar, fe2Var);
                        this.j = 2;
                        if (c22.r(new vg2(1500L, this), lnVar) == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i6 != 1 && i6 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    if (ia1Var == ia1Var2) {
                        return ll2Var;
                    }
                    mh2Var.a();
                    return ll2Var;
                } catch (Throwable th) {
                    if (ia1Var != ia1Var2) {
                        mh2Var.a();
                    }
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(vn vnVar, wm wmVar, sx sxVar) {
        super(1, sxVar);
        this.i = 0;
        this.l = vnVar;
        this.m = wmVar;
    }
}

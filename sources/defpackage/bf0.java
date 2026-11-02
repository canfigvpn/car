package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends wa2 implements jj0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ qe0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf0(int i, sx sxVar, Object obj) {
        super(3, sxVar);
        this.i = i;
        this.m = obj;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj4 = this.m;
        qe0 qe0Var = (qe0) obj;
        switch (i) {
            case 0:
                bf0 bf0Var = new bf0((ij0) obj4, (sx) obj3, 0);
                bf0Var.k = qe0Var;
                bf0Var.l = obj2;
                return bf0Var.r(ll2Var);
            case 1:
                bf0 bf0Var2 = new bf0(1, (sx) obj3, (qm0) obj4);
                bf0Var2.k = qe0Var;
                bf0Var2.l = (Object[]) obj2;
                return bf0Var2.r(ll2Var);
            case 2:
                bf0 bf0Var3 = new bf0(2, (sx) obj3, (lj0) obj4);
                bf0Var3.k = qe0Var;
                bf0Var3.l = (Object[]) obj2;
                return bf0Var3.r(ll2Var);
            case 3:
                bf0 bf0Var4 = new bf0(3, (sx) obj3, (jn0) obj4);
                bf0Var4.k = qe0Var;
                bf0Var4.l = (Object[]) obj2;
                return bf0Var4.r(ll2Var);
            case 4:
                bf0 bf0Var5 = new bf0((jj0) obj4, (sx) obj3, 4);
                bf0Var5.k = qe0Var;
                bf0Var5.l = (Object[]) obj2;
                return bf0Var5.r(ll2Var);
            default:
                bf0 bf0Var6 = new bf0(5, (sx) obj3, (q22) obj4);
                bf0Var6.k = qe0Var;
                bf0Var6.l = obj2;
                return bf0Var6.r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        qe0 qe0Var;
        Object objG;
        qe0 qe0Var2;
        Object objL;
        qe0 qe0Var3;
        Object objJ;
        qe0 qe0Var4;
        Object objR;
        qe0 qe0Var5;
        Object objD;
        int i = this.i;
        fz fzVar = fz.e;
        Object obj2 = this.m;
        int i2 = 0;
        ll2 ll2Var = ll2.a;
        sx sxVar = null;
        switch (i) {
            case 0:
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qe0Var = this.k;
                        ix.Q(obj);
                        objG = obj;
                    } else {
                        if (i3 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    return ll2Var;
                }
                ix.Q(obj);
                qe0Var = this.k;
                Object obj3 = this.l;
                this.k = qe0Var;
                this.j = 1;
                objG = ((ij0) obj2).g(obj3, this);
                if (objG == fzVar) {
                    return fzVar;
                }
                this.k = null;
                this.j = 2;
                if (qe0Var.k(objG, this) == fzVar) {
                    return fzVar;
                }
                return ll2Var;
            case 1:
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qe0Var2 = this.k;
                        ix.Q(obj);
                        objL = obj;
                    } else {
                        if (i4 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    return ll2Var;
                }
                ix.Q(obj);
                qe0Var2 = this.k;
                Object[] objArr = (Object[]) this.l;
                Object obj4 = objArr[0];
                Object obj5 = objArr[1];
                Object obj6 = objArr[2];
                this.k = qe0Var2;
                this.j = 1;
                objL = ((qm0) obj2).l(obj4, obj5, obj6, this);
                if (objL == fzVar) {
                    return fzVar;
                }
                this.k = null;
                this.j = 2;
                if (qe0Var2.k(objL, this) == fzVar) {
                    return fzVar;
                }
                return ll2Var;
            case 2:
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qe0 qe0Var6 = this.k;
                        ix.Q(obj);
                        qe0Var3 = qe0Var6;
                        objJ = obj;
                    } else {
                        if (i5 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    return ll2Var;
                }
                ix.Q(obj);
                qe0Var3 = this.k;
                Object[] objArr2 = (Object[]) this.l;
                Object obj7 = objArr2[0];
                Object obj8 = objArr2[1];
                Object obj9 = objArr2[2];
                Object obj10 = objArr2[3];
                this.k = qe0Var3;
                this.j = 1;
                objJ = ((lj0) obj2).j(obj7, obj8, obj9, obj10, this);
                if (objJ == fzVar) {
                    return fzVar;
                }
                this.k = null;
                this.j = 2;
                if (qe0Var3.k(objJ, this) == fzVar) {
                    return fzVar;
                }
                return ll2Var;
            case 3:
                int i6 = this.j;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qe0Var4 = this.k;
                        ix.Q(obj);
                        objR = obj;
                    } else {
                        if (i6 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    return ll2Var;
                }
                ix.Q(obj);
                qe0Var4 = this.k;
                Object[] objArr3 = (Object[]) this.l;
                jn0 jn0Var = (jn0) obj2;
                Object obj11 = objArr3[0];
                Object obj12 = objArr3[1];
                Object obj13 = objArr3[2];
                Object obj14 = objArr3[3];
                Object obj15 = objArr3[4];
                this.k = qe0Var4;
                this.j = 1;
                boolean zBooleanValue = ((Boolean) obj15).booleanValue();
                jn0 jn0Var2 = new jn0(jn0Var.n, jn0Var.o, this);
                jn0Var2.i = (List) obj11;
                jn0Var2.j = (List) obj12;
                jn0Var2.k = (List) obj13;
                jn0Var2.l = (List) obj14;
                jn0Var2.m = zBooleanValue;
                objR = jn0Var2.r(ll2Var);
                if (objR == fzVar) {
                    return fzVar;
                }
                this.k = null;
                this.j = 2;
                if (qe0Var4.k(objR, this) == fzVar) {
                    return fzVar;
                }
                return ll2Var;
            case 4:
                int i7 = this.j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qe0Var5 = this.k;
                        ix.Q(obj);
                        objD = obj;
                    } else {
                        if (i7 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    return ll2Var;
                }
                ix.Q(obj);
                qe0Var5 = this.k;
                Object[] objArr4 = (Object[]) this.l;
                Object obj16 = objArr4[0];
                Object obj17 = objArr4[1];
                this.k = qe0Var5;
                this.j = 1;
                objD = ((jj0) obj2).d(obj16, obj17, this);
                if (objD == fzVar) {
                    return fzVar;
                }
                this.k = null;
                this.j = 2;
                if (qe0Var5.k(objD, this) == fzVar) {
                    return fzVar;
                }
                return ll2Var;
            default:
                q22 q22Var = (q22) obj2;
                int i8 = this.j;
                if (i8 == 0) {
                    ix.Q(obj);
                    qe0 qe0Var7 = this.k;
                    wm wmVar = (wm) this.l;
                    pe0 ue0Var = wmVar == null ? new ue0(i2, new oi0(15)) : new hf0(q22Var.d(), q22Var.b(wmVar.a), new pi0(i2, sxVar, wmVar), i2);
                    this.k = null;
                    this.l = null;
                    this.j = 1;
                    if (qe0Var7 instanceof qg2) {
                        throw ((qg2) qe0Var7).e;
                    }
                    Object objA = ue0Var.a(qe0Var7, this);
                    if (objA != fzVar) {
                        objA = ll2Var;
                    }
                    if (objA == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i8 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf0(qj0 qj0Var, sx sxVar, int i) {
        super(3, sxVar);
        this.i = i;
        this.m = qj0Var;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cb implements qe0 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;
    public final Object h;

    public cb(qe0 qe0Var, uy uyVar) {
        this.e = 5;
        this.f = uyVar;
        this.g = p61.m0(uyVar);
        this.h = new cv1(8, null, qe0Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        af0 af0Var;
        qe0 qe0Var;
        if0 if0Var;
        qe0 qe0Var2;
        cb cbVar = this;
        Object obj2 = obj;
        int i = cbVar.e;
        fz fzVar = fz.e;
        sx sxVar2 = null;
        ll2 ll2Var = ll2.a;
        Object obj3 = cbVar.h;
        Object obj4 = cbVar.g;
        Object obj5 = cbVar.f;
        switch (i) {
            case 0:
                ki2 ki2Var = (ki2) obj4;
                ((gq1) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((ij0) ((da1) obj3).getValue()).g(ki2Var.a.f(), ki2Var.d.getValue())).booleanValue() : false));
                return ll2Var;
            case 1:
                tr0 tr0Var = (tr0) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (tr0Var instanceof wn0) {
                    arrayList.add(tr0Var);
                } else if (tr0Var instanceof xn0) {
                    arrayList.remove(((xn0) tr0Var).a);
                } else if (tr0Var instanceof nf0) {
                    arrayList.add(tr0Var);
                } else if (tr0Var instanceof of0) {
                    arrayList.remove(((of0) tr0Var).a);
                } else if (tr0Var instanceof rp1) {
                    arrayList.add(tr0Var);
                } else if (tr0Var instanceof sp1) {
                    arrayList.remove(((sp1) tr0Var).a);
                } else if (tr0Var instanceof qp1) {
                    arrayList.remove(((qp1) tr0Var).a);
                }
                nj2.y((ez) obj4, null, new e(16, sxVar2, (he0) obj3, (tr0) vq.X(arrayList)), 3);
                return ll2Var;
            case 2:
                if (sxVar instanceof af0) {
                    af0Var = (af0) sxVar;
                    int i2 = af0Var.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        af0Var.l = i2 - Integer.MIN_VALUE;
                    } else {
                        af0Var = new af0(cbVar, sxVar);
                    }
                } else {
                    af0Var = new af0(cbVar, sxVar);
                }
                Object objG = af0Var.j;
                int i3 = af0Var.l;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            Object obj6 = af0Var.i;
                            cb cbVar2 = af0Var.h;
                            ix.Q(objG);
                            obj2 = obj6;
                            cbVar = cbVar2;
                            if (!((Boolean) objG).booleanValue()) {
                                ((cs1) cbVar.f).e = true;
                                qe0Var = (qe0) cbVar.g;
                                af0Var.h = null;
                                af0Var.i = null;
                                af0Var.l = 3;
                                if (qe0Var.k(obj2, af0Var) == fzVar) {
                                    return fzVar;
                                }
                            }
                        } else if (i3 != 3) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    ix.Q(objG);
                } else {
                    ix.Q(objG);
                    if (((cs1) obj5).e) {
                        af0Var.l = 1;
                        if (((qe0) obj4).k(obj2, af0Var) == fzVar) {
                            return fzVar;
                        }
                    } else {
                        af0Var.h = cbVar;
                        af0Var.i = obj2;
                        af0Var.l = 2;
                        objG = ((pr1) obj3).g(obj2, af0Var);
                        if (objG == fzVar) {
                            return fzVar;
                        }
                        if (!((Boolean) objG).booleanValue()) {
                            ((cs1) cbVar.f).e = true;
                            qe0Var = (qe0) cbVar.g;
                            af0Var.h = null;
                            af0Var.i = null;
                            af0Var.l = 3;
                            if (qe0Var.k(obj2, af0Var) == fzVar) {
                                return fzVar;
                            }
                        }
                    }
                }
                return ll2Var;
            case 3:
                if (sxVar instanceof if0) {
                    if0Var = (if0) sxVar;
                    int i4 = if0Var.i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        if0Var.i = i4 - Integer.MIN_VALUE;
                    } else {
                        if0Var = new if0(cbVar, sxVar);
                    }
                } else {
                    if0Var = new if0(cbVar, sxVar);
                }
                Object obj7 = if0Var.h;
                int i5 = if0Var.i;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qe0Var2 = if0Var.j;
                        ix.Q(obj7);
                    } else {
                        if (i5 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj7);
                    }
                    return ll2Var;
                }
                ix.Q(obj7);
                qe0 qe0Var3 = (qe0) obj5;
                if0Var.j = qe0Var3;
                if0Var.i = 1;
                Object objR = sv.R(if0Var, (ej0) obj3, (bv1) obj4, true, false);
                if (objR == fzVar) {
                    return fzVar;
                }
                qe0Var2 = qe0Var3;
                obj7 = objR;
                if0Var.j = null;
                if0Var.i = 2;
                if (qe0Var2.k(obj7, if0Var) == fzVar) {
                    return fzVar;
                }
                return ll2Var;
            case 4:
                yf yfVar = (yf) obj2;
                if (((List) ((da1) obj3).getValue()).size() > 1) {
                    ((da1) obj5).setValue(Boolean.TRUE);
                    ((zj1) obj4).i(yfVar.c);
                }
                return ll2Var;
            default:
                Object objJ = ir2.J((uy) obj5, obj2, obj4, (cv1) obj3, sxVar);
                return objJ == fzVar ? objJ : ll2Var;
        }
    }

    public /* synthetic */ cb(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    public cb(da1 da1Var, da1 da1Var2, zj1 zj1Var) {
        this.e = 4;
        this.h = da1Var;
        this.f = da1Var2;
        this.g = zj1Var;
    }
}

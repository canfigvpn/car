package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 implements qe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j60(k60 k60Var, gs1 gs1Var, qe0 qe0Var) {
        this.e = 0;
        this.f = gs1Var;
        this.g = qe0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, sx sxVar) {
        m82 m82Var;
        if (sxVar instanceof m82) {
            m82Var = (m82) sxVar;
            int i2 = m82Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m82Var.j = i2 - Integer.MIN_VALUE;
            } else {
                m82Var = new m82(this, sxVar);
            }
        } else {
            m82Var = new m82(this, sxVar);
        }
        Object obj = m82Var.h;
        int i3 = m82Var.j;
        ll2 ll2Var = ll2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                ix.Q(obj);
                return ll2Var;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        if (i > 0) {
            cs1 cs1Var = (cs1) this.f;
            if (!cs1Var.e) {
                cs1Var.e = true;
                qe0 qe0Var = (qe0) this.g;
                m82Var.j = 1;
                Object objK = qe0Var.k(p42.e, m82Var);
                fz fzVar = fz.e;
                if (objK == fzVar) {
                    return fzVar;
                }
            }
        }
        return ll2Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01db  */
    /* JADX WARN: Code duplicated, block: B:142:0x0282  */
    /* JADX WARN: Code duplicated, block: B:162:0x02dc  */
    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        i60 i60Var;
        df0 df0Var;
        f61 f61Var;
        sp1 sp1Var;
        qp1 qp1Var;
        Object sp1Var2;
        j60 j60Var = this;
        Object obj2 = obj;
        int i = j60Var.e;
        sx sxVar2 = null;
        fz fzVar = fz.e;
        Object obj3 = j60Var.f;
        ll2 ll2Var = ll2.a;
        Object obj4 = j60Var.g;
        switch (i) {
            case 0:
                gs1 gs1Var = (gs1) obj3;
                if (sxVar instanceof i60) {
                    i60Var = (i60) sxVar;
                    int i2 = i60Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        i60Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        i60Var = new i60(j60Var, sxVar);
                    }
                } else {
                    i60Var = new i60(j60Var, sxVar);
                }
                Object obj5 = i60Var.h;
                int i3 = i60Var.j;
                if (i3 == 0) {
                    ix.Q(obj5);
                    Object obj6 = gs1Var.e;
                    if (obj6 == s5.J || !ws0.j(obj6, obj2)) {
                        gs1Var.e = obj2;
                        i60Var.j = 1;
                        if (((qe0) obj4).k(obj2, i60Var) == fzVar) {
                            return fzVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj5);
                }
                return ll2Var;
            case 1:
                if (sxVar instanceof df0) {
                    df0Var = (df0) sxVar;
                    int i4 = df0Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        df0Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        df0Var = new df0(j60Var, sxVar);
                    }
                } else {
                    df0Var = new df0(j60Var, sxVar);
                }
                Object objG = df0Var.i;
                int i5 = df0Var.j;
                if (i5 == 0) {
                    ix.Q(objG);
                    df0Var.h = j60Var;
                    df0Var.l = obj2;
                    df0Var.j = 1;
                    objG = ((ij0) obj4).g(obj2, df0Var);
                    if (objG == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i5 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj7 = df0Var.l;
                    j60 j60Var2 = df0Var.h;
                    ix.Q(objG);
                    obj2 = obj7;
                    j60Var = j60Var2;
                }
                if (!((Boolean) objG).booleanValue()) {
                    return ll2Var;
                }
                ((gs1) j60Var.f).e = obj2;
                throw new a(j60Var);
            case 2:
                tr0 tr0Var = (tr0) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                if (tr0Var instanceof nf0) {
                    arrayList.add(tr0Var);
                } else if (tr0Var instanceof of0) {
                    arrayList.remove(((of0) tr0Var).a);
                }
                ((da1) obj4).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return ll2Var;
            case 3:
                g61 g61Var = (g61) obj3;
                LinkedHashMap linkedHashMap = g61Var.b;
                if (sxVar instanceof f61) {
                    f61Var = (f61) sxVar;
                    int i6 = f61Var.i;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        f61Var.i = i6 - Integer.MIN_VALUE;
                    } else {
                        f61Var = new f61(j60Var, sxVar);
                    }
                } else {
                    f61Var = new f61(j60Var, sxVar);
                }
                Object obj8 = f61Var.h;
                int i7 = f61Var.i;
                if (i7 == 0) {
                    ix.Q(obj8);
                    qe0 qe0Var = (qe0) obj4;
                    tr0 tr0Var2 = (tr0) obj2;
                    if (tr0Var2 instanceof rp1) {
                        rp1 rp1Var = new rp1(uf1.d(((rp1) tr0Var2).a, g61Var.a));
                        linkedHashMap.put(tr0Var2, rp1Var);
                        sp1Var2 = rp1Var;
                    } else if (tr0Var2 instanceof qp1) {
                        qp1Var = (qp1) tr0Var2;
                        rp1 rp1Var2 = (rp1) linkedHashMap.remove(qp1Var.a);
                        if (rp1Var2 != null) {
                            sp1Var2 = qp1Var;
                            sp1Var2 = new qp1(rp1Var2);
                        }
                    } else if (tr0Var2 instanceof sp1) {
                        sp1Var = (sp1) tr0Var2;
                        rp1 rp1Var3 = (rp1) linkedHashMap.remove(sp1Var.a);
                        if (rp1Var3 != null) {
                            sp1Var2 = tr0Var2;
                            sp1Var2 = sp1Var;
                            sp1Var2 = new sp1(rp1Var3);
                        }
                    }
                    sp1Var2 = tr0Var2;
                    sp1Var2 = sp1Var;
                    sp1Var2 = tr0Var2;
                    sp1Var2 = qp1Var;
                    f61Var.i = 1;
                    if (qe0Var.k(sp1Var2, f61Var) == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i7 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj8);
                }
                return ll2Var;
            case 4:
                tr0 tr0Var3 = (tr0) obj2;
                x8 x8Var = (x8) obj3;
                if (!(tr0Var3 instanceof tp1)) {
                    ez ezVar = (ez) obj4;
                    jp jpVar = x8Var.x;
                    float f = 0.0f;
                    if (jpVar == null) {
                        boolean z = x8Var.t;
                        f40 f40Var = x8Var.w;
                        jpVar = new jp();
                        jpVar.a = z;
                        jpVar.b = f40Var;
                        jpVar.c = sv0.D(0.0f);
                        jpVar.d = new ArrayList();
                        vv.B(x8Var);
                        x8Var.x = jpVar;
                    }
                    ArrayList arrayList2 = (ArrayList) jpVar.d;
                    if (tr0Var3 instanceof wn0) {
                        arrayList2.add(tr0Var3);
                    } else if (tr0Var3 instanceof xn0) {
                        arrayList2.remove(((xn0) tr0Var3).a);
                    } else if (tr0Var3 instanceof nf0) {
                        arrayList2.add(tr0Var3);
                    } else if (tr0Var3 instanceof of0) {
                        arrayList2.remove(((of0) tr0Var3).a);
                    } else if (tr0Var3 instanceof b80) {
                        arrayList2.add(tr0Var3);
                    } else if (tr0Var3 instanceof c80) {
                        arrayList2.remove(((c80) tr0Var3).a);
                    } else if (tr0Var3 instanceof a80) {
                        arrayList2.remove(((a80) tr0Var3).a);
                    }
                    tr0 tr0Var4 = (tr0) vq.X(arrayList2);
                    if (!ws0.j((tr0) jpVar.e, tr0Var4)) {
                        if (tr0Var4 != null) {
                            ((f40) jpVar.b).a();
                            boolean z2 = tr0Var4 instanceof wn0;
                            if (z2) {
                                f = 0.08f;
                            } else if (tr0Var4 instanceof nf0) {
                                f = 0.1f;
                            } else if (tr0Var4 instanceof b80) {
                                f = 0.16f;
                            }
                            lj2 lj2Var = uu1.a;
                            if (!z2 && ((tr0Var4 instanceof nf0) || (tr0Var4 instanceof b80))) {
                                lj2Var = new lj2(45, 0, d90.c);
                            }
                            nj2.y(ezVar, null, new oc1(jpVar, f, lj2Var, (sx) null), 3);
                        } else {
                            tr0 tr0Var5 = (tr0) jpVar.e;
                            lj2 lj2Var2 = uu1.a;
                            if (!(tr0Var5 instanceof wn0) && !(tr0Var5 instanceof nf0) && (tr0Var5 instanceof b80)) {
                                lj2Var2 = new lj2(150, 0, d90.c);
                            }
                            nj2.y(ezVar, null, new cv1(5, sxVar2, jpVar, lj2Var2), 3);
                        }
                        jpVar.e = tr0Var4;
                    }
                } else if (x8Var.A) {
                    x8Var.F0((tp1) tr0Var3);
                } else {
                    x8Var.B.a(tr0Var3);
                }
                return ll2Var;
            case 5:
                uf1 uf1Var = (uf1) obj2;
                long j = uf1Var.a;
                ia iaVar = (ia) obj3;
                if ((((uf1) iaVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((uf1) iaVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objE = iaVar.e(sxVar, uf1Var);
                    return objE == fzVar ? objE : ll2Var;
                }
                nj2.y((ez) obj4, null, new in0(iaVar, j, null, 1), 3);
                return ll2Var;
            case 6:
                return j60Var.a(((Number) obj2).intValue(), sxVar);
            default:
                tr0 tr0Var6 = (tr0) obj2;
                es1 es1Var = (es1) obj3;
                if (tr0Var6 instanceof rp1) {
                    es1Var.e++;
                } else if ((tr0Var6 instanceof sp1) || (tr0Var6 instanceof qp1)) {
                    es1Var.e--;
                }
                boolean z3 = es1Var.e > 0;
                tg2 tg2Var = (tg2) obj4;
                if (tg2Var.v != z3) {
                    tg2Var.v = z3;
                    rw.z(tg2Var);
                }
                return ll2Var;
        }
    }

    public /* synthetic */ j60(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ j60(int i, Object obj, Object obj2) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }
}

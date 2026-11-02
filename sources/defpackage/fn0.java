package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 implements kj0 {
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ wm g;
    public final /* synthetic */ da1 h;

    public fn0(ArrayList arrayList, ij0 ij0Var, wm wmVar, da1 da1Var) {
        this.e = arrayList;
        this.f = ij0Var;
        this.g = wmVar;
        this.h = da1Var;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x016f  */
    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        List<String> list;
        double d;
        String str;
        Object next;
        d22 d22Var;
        String strS;
        vy0 vy0Var = (vy0) obj;
        int iIntValue = ((Number) obj2).intValue();
        ak0 ak0Var = (ak0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i = 4;
        int i2 = 2;
        int i3 = (iIntValue2 & 6) == 0 ? (ak0Var.f(vy0Var) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i3 |= ak0Var.d(iIntValue) ? 32 : 16;
        }
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            List<ul2> list2 = (List) this.e.get(iIntValue);
            ak0Var.W(1727136707);
            u71 u71VarX = dv1.x(f52.a, qs0.f);
            sv1 sv1VarA = rv1.a(new he(12.0f, new ut(1)), q90.o, ak0Var, 6);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarX);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, sv1VarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            ak0Var.W(-1437354234);
            for (ul2 ul2Var : list2) {
                List list3 = ((hn0) this.h.getValue()).b;
                ak0Var.W(7192481);
                t22 t22Var = ul2Var.i;
                String strS2 = null;
                if ((t22Var == t22.e || t22Var == t22.f) && (list = (List) e22.c.get(ul2Var.a.b)) != null) {
                    ak0Var.W(-1677952057);
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : list) {
                        Iterator it = list3.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!ws0.j(((ul2) next).a.b, str2));
                        ul2 ul2Var2 = (ul2) next;
                        if (ul2Var2 == null) {
                            strS = null;
                        } else {
                            u22 u22Var = ul2Var2.a;
                            t22 t22Var2 = ul2Var2.i;
                            t22Var2.getClass();
                            int iOrdinal = t22Var2.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                d22Var = d22.e;
                            } else {
                                if (iOrdinal != i2) {
                                    if (iOrdinal == 3) {
                                        d22Var = d22.e;
                                    } else if (iOrdinal != i) {
                                        qj.p();
                                        return null;
                                    }
                                }
                                d22Var = d22.f;
                            }
                            int iOrdinal2 = d22Var.ordinal();
                            if (iOrdinal2 == 0) {
                                ak0Var.W(182518013);
                                strS = j02.s(R.string.home_also_change, new Object[]{f22.d(u22Var, ak0Var)}, ak0Var);
                                ak0Var.p(false);
                            } else {
                                if (iOrdinal2 != 1) {
                                    ak0Var.W(182514553);
                                    ak0Var.p(false);
                                    qj.p();
                                    return null;
                                }
                                ak0Var.W(182522045);
                                strS = j02.s(R.string.home_also_review, new Object[]{f22.d(u22Var, ak0Var)}, ak0Var);
                                ak0Var.p(false);
                            }
                        }
                        if (strS != null) {
                            arrayList.add(strS);
                        }
                    }
                    d = 0.0d;
                    ak0Var.p(false);
                    if (arrayList.isEmpty()) {
                        ak0Var.p(false);
                    } else {
                        strS2 = j02.s(R.string.home_also_prefix, new Object[]{vq.V(arrayList, " · ", null, null, null, 62)}, ak0Var);
                        ak0Var.p(false);
                    }
                    str = strS2;
                } else {
                    ak0Var.p(false);
                    str = null;
                    d = 0.0d;
                }
                ij0 ij0Var = this.f;
                boolean zF = ak0Var.f(ij0Var);
                wm wmVar = this.g;
                boolean zF2 = zF | ak0Var.f(wmVar) | ak0Var.f(ul2Var);
                Object objL = ak0Var.L();
                if (zF2 || objL == cv.a) {
                    objL = new ki0(ij0Var, wmVar, ul2Var, i2);
                    ak0Var.g0(objL);
                }
                ti0 ti0Var = (ti0) objL;
                int i4 = i2;
                if (1.0f <= d) {
                    tp0.a("invalid weight; must be greater than zero");
                }
                gn0.f(ul2Var, str, ti0Var, new px0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).c(f52.b), ak0Var, 0);
                i2 = i4;
                i = 4;
            }
            ak0Var.p(false);
            ak0Var.W(-1437331426);
            int size = 2 - list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (1.0f <= 0.0d) {
                    tp0.a("invalid weight; must be greater than zero");
                }
                r02.b(ak0Var, new px0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            }
            ak0Var.p(false);
            ak0Var.p(true);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}

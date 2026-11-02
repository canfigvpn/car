package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw1 implements ij0 {
    public final /* synthetic */ int e;

    public /* synthetic */ xw1(int i) {
        this.e = 25;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ac acVar;
        Object objA;
        switch (this.e) {
            case 0:
                return Integer.valueOf(((ih0) obj2).a);
            case 1:
                yf2 yf2Var = (yf2) obj2;
                return yf2Var != null ? yf2.a(yf2Var.a, yf2.c) : false ? Boolean.FALSE : vs0.g(Float.valueOf(yf2.c(yf2Var.a)), ax1.a(new zf2(yf2.b(yf2Var.a)), ax1.y, (dw1) obj));
            case 2:
                u21 u21Var = (u21) obj2;
                return vs0.g(u21Var.a, ax1.a(u21Var.b, ax1.j, (dw1) obj));
            case 3:
                long j = ((zf2) obj2).a;
                if (zf2.a(j, 8589934592L)) {
                    return 0;
                }
                if (zf2.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 4:
                uf1 uf1Var = (uf1) obj2;
                return uf1Var != null ? uf1.b(uf1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : vs0.g(Float.valueOf(Float.intBitsToFloat((int) (uf1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (uf1Var.a & 4294967295L))));
            case 5:
                dw1 dw1Var = (dw1) obj;
                xb xbVar = (xb) obj2;
                Object obj3 = xbVar.a;
                if (obj3 instanceof wj1) {
                    acVar = ac.e;
                } else if (obj3 instanceof r72) {
                    acVar = ac.f;
                } else if (obj3 instanceof xm2) {
                    acVar = ac.g;
                } else if (obj3 instanceof xl2) {
                    acVar = ac.h;
                } else if (obj3 instanceof v21) {
                    acVar = ac.i;
                } else if (obj3 instanceof u21) {
                    acVar = ac.j;
                } else {
                    if (!(obj3 instanceof e92)) {
                        throw new UnsupportedOperationException();
                    }
                    acVar = ac.k;
                }
                switch (acVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = ax1.a((wj1) obj3, ax1.h, dw1Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = ax1.a((r72) obj3, ax1.i, dw1Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = ax1.a((xm2) obj3, ax1.d, dw1Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = ax1.a((xl2) obj3, ax1.e, dw1Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = ax1.a((v21) obj3, ax1.f, dw1Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = ax1.a((u21) obj3, ax1.g, dw1Var);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((e92) obj3).a;
                        break;
                    default:
                        qj.p();
                        return null;
                }
                return vs0.g(acVar, objA, Integer.valueOf(xbVar.b), Integer.valueOf(xbVar.c), xbVar.d);
            case 6:
                dw1 dw1Var2 = (dw1) obj;
                List list = ((q31) obj2).e;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(ax1.a((p31) list.get(i), ax1.B, dw1Var2));
                }
                return arrayList;
            case 7:
                return ((p31) obj2).a.toLanguageTag();
            case 8:
                dw1 dw1Var3 = (dw1) obj;
                o21 o21Var = (o21) obj2;
                return vs0.g(ax1.a(new l21(o21Var.a), ax1.D, dw1Var3), ax1.a(new n21(o21Var.b), ax1.E, dw1Var3), ax1.a(new m21(o21Var.c), ax1.F, dw1Var3));
            case 9:
                return Float.valueOf(((l21) obj2).a);
            case 10:
                return Integer.valueOf(((n21) obj2).a);
            case 11:
                return Integer.valueOf(((m21) obj2).a);
            case 12:
                return ((xm2) obj2).a;
            case 13:
                dw1 dw1Var4 = (dw1) obj;
                wj1 wj1Var = (wj1) obj2;
                Object objA2 = ax1.a(new gc2(wj1Var.a), ax1.s, dw1Var4);
                Object objA3 = ax1.a(new hd2(wj1Var.b), ax1.t, dw1Var4);
                Object objA4 = ax1.a(new yf2(wj1Var.c), ax1.x, dw1Var4);
                xe2 xe2Var = wj1Var.d;
                xe2 xe2Var2 = xe2.c;
                Object objA5 = ax1.a(xe2Var, ax1.m, dw1Var4);
                Object objA6 = ax1.a(wj1Var.e, dv1.s, dw1Var4);
                o21 o21Var2 = wj1Var.f;
                o21 o21Var3 = o21.d;
                return vs0.g(objA2, objA3, objA4, objA5, objA6, ax1.a(o21Var2, ax1.C, dw1Var4), ax1.a(new j21(wj1Var.g), dv1.u, dw1Var4), ax1.a(new yn0(wj1Var.h), ax1.u, dw1Var4), ax1.a(wj1Var.i, dv1.v, dw1Var4));
            case 14:
                return ((xl2) obj2).a;
            case 15:
                dw1 dw1Var5 = (dw1) obj;
                r72 r72Var = (r72) obj2;
                dr drVar = new dr(r72Var.a.b());
                zw1 zw1Var = ax1.r;
                Object objA7 = ax1.a(drVar, zw1Var, dw1Var5);
                yf2 yf2Var2 = new yf2(r72Var.b);
                zw1 zw1Var2 = ax1.x;
                Object objA8 = ax1.a(yf2Var2, zw1Var2, dw1Var5);
                lh0 lh0Var = r72Var.c;
                lh0 lh0Var2 = lh0.f;
                Object objA9 = ax1.a(lh0Var, ax1.n, dw1Var5);
                Object objA10 = ax1.a(r72Var.d, ax1.v, dw1Var5);
                Object objA11 = ax1.a(r72Var.e, ax1.w, dw1Var5);
                String str = r72Var.g;
                Object objA12 = ax1.a(new yf2(r72Var.h), zw1Var2, dw1Var5);
                Object objA13 = ax1.a(r72Var.i, ax1.o, dw1Var5);
                Object objA14 = ax1.a(r72Var.j, ax1.l, dw1Var5);
                q31 q31Var = r72Var.k;
                q31 q31Var2 = q31.g;
                Object objA15 = ax1.a(q31Var, ax1.A, dw1Var5);
                Object objA16 = ax1.a(new dr(r72Var.l), zw1Var, dw1Var5);
                Object objA17 = ax1.a(r72Var.m, ax1.k, dw1Var5);
                q32 q32Var = r72Var.n;
                q32 q32Var2 = q32.d;
                return vs0.g(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, ax1.a(q32Var, ax1.q, dw1Var5));
            case 16:
                dw1 dw1Var6 = (dw1) obj;
                kf2 kf2Var = (kf2) obj2;
                r72 r72Var2 = kf2Var.a;
                ru1 ru1Var = ax1.i;
                return vs0.g(ax1.a(r72Var2, ru1Var, dw1Var6), ax1.a(kf2Var.b, ru1Var, dw1Var6), ax1.a(kf2Var.c, ru1Var, dw1Var6), ax1.a(kf2Var.d, ru1Var, dw1Var6));
            case 17:
                ym1 ym1Var = (ym1) obj2;
                Boolean boolValueOf = Boolean.valueOf(ym1Var.a);
                ru1 ru1Var2 = ax1.a;
                return vs0.g(boolValueOf, ax1.a(new ra0(ym1Var.b), dv1.t, (dw1) obj));
            case 18:
                return Integer.valueOf(((ra0) obj2).a);
            case 19:
                return Integer.valueOf(((j21) obj2).a);
            case 20:
                mf2 mf2Var = (mf2) obj2;
                return vs0.g(ax1.a(new lf2(mf2Var.a), dv1.w, (dw1) obj), Boolean.valueOf(mf2Var.b));
            case 21:
                return Integer.valueOf(((lf2) obj2).a);
            case 22:
                return Integer.valueOf(((zx1) obj2).a.h());
            case 23:
                aq aqVar = (aq) obj;
                List list2 = (List) obj2;
                aqVar.getClass();
                list2.getClass();
                ArrayList arrayListQ = c22.q(vs0.D, list2, true);
                arrayListQ.getClass();
                return c22.l(aqVar, arrayListQ, new br(1, list2));
            case 24:
                aq aqVar2 = (aq) obj;
                List list3 = (List) obj2;
                aqVar2.getClass();
                list3.getClass();
                ArrayList arrayListQ2 = c22.q(vs0.D, list3, true);
                arrayListQ2.getClass();
                mv0 mv0VarL = c22.l(aqVar2, arrayListQ2, new br(2, list3));
                if (mv0VarL != null) {
                    return ir2.r(mv0VarL);
                }
                return null;
            case 25:
                ((Integer) obj2).getClass();
                l32.a(ei1.P(1), (ak0) obj);
                return ll2.a;
            case 26:
                de2 de2Var = (de2) obj2;
                return vs0.v(Float.valueOf(de2Var.a.h()), Boolean.valueOf(((di1) de2Var.f.getValue()) == di1.e));
            case 27:
                dw1 dw1Var7 = (dw1) obj;
                te2 te2Var = (te2) obj2;
                return vs0.g(ax1.a(te2Var.a, ax1.a, dw1Var7), ax1.a(new of2(te2Var.b), ax1.p, dw1Var7));
            case 28:
                sy syVar = (sy) obj2;
                if (!(syVar instanceof hg2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? syVar : Integer.valueOf(iIntValue + 1);
            default:
                hg2 hg2Var = (hg2) obj;
                sy syVar2 = (sy) obj2;
                if (hg2Var != null) {
                    return hg2Var;
                }
                if (syVar2 instanceof hg2) {
                    return (hg2) syVar2;
                }
                return null;
        }
    }

    public /* synthetic */ xw1(int i, byte b) {
        this.e = i;
    }
}

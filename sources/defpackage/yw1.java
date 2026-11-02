package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw1 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ yw1(int i) {
        this.e = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) throws Exception {
        xb xbVar;
        dr drVar;
        dr drVar2;
        Float fValueOf;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        boolean z = false;
        wj1 wj1Var = null;
        ra0Var = null;
        ra0 ra0Var = null;
        q32Var = null;
        q32 q32Var = null;
        mf2Var = null;
        mf2 mf2Var = null;
        u21Var = null;
        u21 u21Var = null;
        v21Var = null;
        v21 v21Var = null;
        xl2Var = null;
        xl2 xl2Var = null;
        xm2Var = null;
        xm2 xm2Var = null;
        r72Var = null;
        r72 r72Var = null;
        wj1Var = null;
        switch (i) {
            case 0:
                obj.getClass();
                float fFloatValue = ((Float) obj).floatValue();
                l21.a(fFloatValue);
                return new l21(fFloatValue);
            case 1:
                obj.getClass();
                return new n21(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                ac acVar = obj2 != null ? (ac) obj2 : null;
                acVar.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (acVar.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        ru1 ru1Var = ax1.h;
                        if (!ws0.j(obj6, Boolean.FALSE) && obj6 != null) {
                            wj1Var = (wj1) ((ej0) ru1Var.c).h(obj6);
                        }
                        wj1 wj1Var2 = wj1Var;
                        wj1Var2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, wj1Var2, str);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        ru1 ru1Var2 = ax1.i;
                        if (!ws0.j(obj7, Boolean.FALSE) && obj7 != null) {
                            r72Var = (r72) ((ej0) ru1Var2.c).h(obj7);
                        }
                        r72 r72Var2 = r72Var;
                        r72Var2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, r72Var2, str);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        ru1 ru1Var3 = ax1.d;
                        if (!ws0.j(obj8, Boolean.FALSE) && obj8 != null) {
                            xm2Var = (xm2) ((ej0) ru1Var3.c).h(obj8);
                        }
                        xm2 xm2Var2 = xm2Var;
                        xm2Var2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, xm2Var2, str);
                        break;
                    case 3:
                        Object obj9 = list.get(1);
                        ru1 ru1Var4 = ax1.e;
                        if (!ws0.j(obj9, Boolean.FALSE) && obj9 != null) {
                            xl2Var = (xl2) ((ej0) ru1Var4.c).h(obj9);
                        }
                        xl2 xl2Var2 = xl2Var;
                        xl2Var2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, xl2Var2, str);
                        break;
                    case 4:
                        Object obj10 = list.get(1);
                        ru1 ru1Var5 = ax1.f;
                        if (!ws0.j(obj10, Boolean.FALSE) && obj10 != null) {
                            v21Var = (v21) ((ej0) ru1Var5.c).h(obj10);
                        }
                        v21 v21Var2 = v21Var;
                        v21Var2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, v21Var2, str);
                        break;
                    case 5:
                        Object obj11 = list.get(1);
                        ru1 ru1Var6 = ax1.g;
                        if (!ws0.j(obj11, Boolean.FALSE) && obj11 != null) {
                            u21Var = (u21) ((ej0) ru1Var6.c).h(obj11);
                        }
                        u21 u21Var2 = u21Var;
                        u21Var2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, u21Var2, str);
                        break;
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        xbVar = new xb(iIntValue, iIntValue2, new e92(str2), str);
                        break;
                    default:
                        qj.p();
                        return null;
                }
                return xbVar;
            case 3:
                obj.getClass();
                return new m21(((Integer) obj).intValue());
            case 4:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new xm2(str3);
            case 5:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new xl2(str4);
            case 6:
                obj.getClass();
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                zw1 zw1Var = ax1.s;
                Boolean bool = Boolean.FALSE;
                ws0.j(obj13, bool);
                gc2 gc2Var = obj13 != null ? (gc2) zw1Var.b.h(obj13) : null;
                gc2Var.getClass();
                int i2 = gc2Var.a;
                Object obj14 = list2.get(1);
                zw1 zw1Var2 = ax1.t;
                ws0.j(obj14, bool);
                hd2 hd2Var = obj14 != null ? (hd2) zw1Var2.b.h(obj14) : null;
                hd2Var.getClass();
                int i3 = hd2Var.a;
                Object obj15 = list2.get(2);
                zf2[] zf2VarArr = yf2.b;
                zw1 zw1Var3 = ax1.x;
                ws0.j(obj15, bool);
                yf2 yf2Var = obj15 != null ? (yf2) zw1Var3.b.h(obj15) : null;
                yf2Var.getClass();
                long j = yf2Var.a;
                Object obj16 = list2.get(3);
                xe2 xe2Var = xe2.c;
                xe2 xe2Var2 = (ws0.j(obj16, bool) || obj16 == null) ? null : (xe2) ((ej0) ax1.m.c).h(obj16);
                Object obj17 = list2.get(4);
                ym1 ym1Var = (ws0.j(obj17, bool) || obj17 == null) ? null : (ym1) ((ej0) dv1.s.c).h(obj17);
                Object obj18 = list2.get(5);
                o21 o21Var = o21.d;
                o21 o21Var2 = (ws0.j(obj18, bool) || obj18 == null) ? null : (o21) ((ej0) ax1.C.c).h(obj18);
                Object obj19 = list2.get(6);
                j21 j21Var = (ws0.j(obj19, bool) || obj19 == null) ? null : (j21) ((ej0) dv1.u.c).h(obj19);
                j21Var.getClass();
                int i4 = j21Var.a;
                Object obj20 = list2.get(7);
                zw1 zw1Var4 = ax1.u;
                ws0.j(obj20, bool);
                yn0 yn0Var = obj20 != null ? (yn0) zw1Var4.b.h(obj20) : null;
                yn0Var.getClass();
                int i5 = yn0Var.a;
                Object obj21 = list2.get(8);
                ru1 ru1Var7 = dv1.v;
                if (!ws0.j(obj21, bool) && obj21 != null) {
                    mf2Var = (mf2) ((ej0) ru1Var7.c).h(obj21);
                }
                return new wj1(i2, i3, j, xe2Var2, ym1Var, o21Var2, i4, i5, mf2Var);
            case 7:
                obj.getClass();
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i6 = dr.h;
                Boolean bool2 = Boolean.FALSE;
                ws0.j(obj22, bool2);
                if (obj22 != null) {
                    drVar = ws0.j(obj22, Boolean.FALSE) ? new dr(dr.g) : new dr(ws0.c(((Integer) obj22).intValue()));
                } else {
                    drVar = null;
                }
                drVar.getClass();
                long j2 = drVar.a;
                Object obj23 = list3.get(1);
                zf2[] zf2VarArr2 = yf2.b;
                ej0 ej0Var = ax1.x.b;
                ws0.j(obj23, bool2);
                yf2 yf2Var2 = obj23 != null ? (yf2) ej0Var.h(obj23) : null;
                yf2Var2.getClass();
                long j3 = yf2Var2.a;
                Object obj24 = list3.get(2);
                lh0 lh0Var = lh0.f;
                lh0 lh0Var2 = (ws0.j(obj24, bool2) || obj24 == null) ? null : (lh0) ((ej0) ax1.n.c).h(obj24);
                Object obj25 = list3.get(3);
                hh0 hh0Var = (ws0.j(obj25, bool2) || obj25 == null) ? null : (hh0) ((ej0) ax1.v.c).h(obj25);
                Object obj26 = list3.get(4);
                ih0 ih0Var = (ws0.j(obj26, bool2) || obj26 == null) ? null : (ih0) ((ej0) ax1.w.c).h(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                ws0.j(obj28, bool2);
                yf2 yf2Var3 = obj28 != null ? (yf2) ej0Var.h(obj28) : null;
                yf2Var3.getClass();
                long j4 = yf2Var3.a;
                Object obj29 = list3.get(8);
                th thVar = (ws0.j(obj29, bool2) || obj29 == null) ? null : (th) ((ej0) ax1.o.c).h(obj29);
                Object obj30 = list3.get(9);
                we2 we2Var = (ws0.j(obj30, bool2) || obj30 == null) ? null : (we2) ((ej0) ax1.l.c).h(obj30);
                Object obj31 = list3.get(10);
                q31 q31Var = q31.g;
                q31 q31Var2 = (ws0.j(obj31, bool2) || obj31 == null) ? null : (q31) ((ej0) ax1.A.c).h(obj31);
                Object obj32 = list3.get(11);
                ws0.j(obj32, bool2);
                if (obj32 != null) {
                    drVar2 = ws0.j(obj32, Boolean.FALSE) ? new dr(dr.g) : new dr(ws0.c(((Integer) obj32).intValue()));
                } else {
                    drVar2 = null;
                }
                drVar2.getClass();
                long j5 = drVar2.a;
                Object obj33 = list3.get(12);
                ed2 ed2Var = (ws0.j(obj33, bool2) || obj33 == null) ? null : (ed2) ((ej0) ax1.k.c).h(obj33);
                Object obj34 = list3.get(13);
                q32 q32Var2 = q32.d;
                ru1 ru1Var8 = ax1.q;
                if (!ws0.j(obj34, bool2) && obj34 != null) {
                    q32Var = (q32) ((ej0) ru1Var8.c).h(obj34);
                }
                return new r72(j2, j3, lh0Var2, hh0Var, ih0Var, (kg0) null, str5, j4, thVar, we2Var, q31Var2, j5, ed2Var, q32Var, 49184);
            case 8:
                obj.getClass();
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                ru1 ru1Var9 = dv1.t;
                if (!ws0.j(obj36, Boolean.FALSE) && obj36 != null) {
                    ra0Var = (ra0) ((ej0) ru1Var9.c).h(obj36);
                }
                ra0 ra0Var2 = ra0Var;
                ra0Var2.getClass();
                return new ym1(ra0Var2.a, zBooleanValue);
            case 9:
                obj.getClass();
                return new ra0(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                return new j21(((Integer) obj).intValue());
            case 11:
                obj.getClass();
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                lf2 lf2Var = (ws0.j(obj37, Boolean.FALSE) || obj37 == null) ? null : (lf2) ((ej0) dv1.w.c).h(obj37);
                lf2Var.getClass();
                int i7 = lf2Var.a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                bool4.getClass();
                return new mf2(i7, bool4.booleanValue());
            case 12:
                obj.getClass();
                return new lf2(((Integer) obj).intValue());
            case 13:
                return new zx1(((Integer) obj).intValue());
            case 14:
                co1 co1Var = (co1) obj;
                if (co1Var != null && co1Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 15:
                w02.e((z02) obj, 3);
                return ll2Var;
            case 16:
                lv0[] lv0VarArr = w02.a;
                ((z02) obj).a(u02.e, ll2Var);
                return ll2Var;
            case 17:
                uf1 uf1Var = (uf1) obj;
                long j6 = uf1Var.a;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new qb(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (uf1Var.a & 4294967295L))) : f02.a;
            case 18:
                qb qbVar = (qb) obj;
                return new uf1((((long) Float.floatToRawIntBits(qbVar.a)) << 32) | (((long) Float.floatToRawIntBits(qbVar.b)) & 4294967295L));
            case 19:
                return Boolean.valueOf(obj == null);
            case 20:
                aq aqVar = (aq) obj;
                aqVar.getClass();
                Object objO = c22.o(aqVar);
                if (objO == null) {
                    if (!vv.q(aqVar).isInterface()) {
                        return null;
                    }
                    objO = new fo1(aqVar);
                }
                return objO;
            case 21:
                aq aqVar2 = (aq) obj;
                aqVar2.getClass();
                mv0 mv0VarO = c22.o(aqVar2);
                if (mv0VarO == null) {
                    mv0VarO = vv.q(aqVar2).isInterface() ? new fo1(aqVar2) : null;
                }
                if (mv0VarO != null) {
                    return ir2.r(mv0VarO);
                }
                return null;
            case 22:
                ul2 ul2Var = (ul2) obj;
                ul2Var.getClass();
                Double dC = ul2Var.c();
                return Double.valueOf(dC != null ? dC.doubleValue() : Double.MAX_VALUE);
            case 23:
                ul2 ul2Var2 = (ul2) obj;
                ul2Var2.getClass();
                Iterator it = ve.D0(new Float[]{ul2Var2.b(), ul2Var2.e()}).iterator();
                if (it.hasNext()) {
                    float fFloatValue2 = ((Number) it.next()).floatValue();
                    while (it.hasNext()) {
                        fFloatValue2 = Math.max(fFloatValue2, ((Number) it.next()).floatValue());
                    }
                    fValueOf = Float.valueOf(fFloatValue2);
                } else {
                    fValueOf = null;
                }
                Float fValueOf2 = fValueOf != null ? Float.valueOf(1.0f - fValueOf.floatValue()) : null;
                return Double.valueOf(fValueOf2 != null ? fValueOf2.floatValue() : Double.MAX_VALUE);
            case 24:
                ul2 ul2Var3 = (ul2) obj;
                ul2Var3.getClass();
                return Integer.valueOf(ul2Var3.i.ordinal());
            case 25:
                ul2 ul2Var4 = (ul2) obj;
                ul2Var4.getClass();
                return ul2Var4.a.b;
            case 26:
                vv1 vv1Var = (vv1) obj;
                vv1Var.getClass();
                xv1 xv1VarC = vv1Var.C("SELECT * FROM service_records ORDER BY carId, epochDay, id");
                try {
                    int iX = mx.x(xv1VarC, "id");
                    int iX2 = mx.x(xv1VarC, "carId");
                    int iX3 = mx.x(xv1VarC, "serviceTypeId");
                    int iX4 = mx.x(xv1VarC, "epochDay");
                    int iX5 = mx.x(xv1VarC, "odometerKm");
                    int iX6 = mx.x(xv1VarC, "cost");
                    int iX7 = mx.x(xv1VarC, "quantity");
                    int iX8 = mx.x(xv1VarC, "note");
                    int iX9 = mx.x(xv1VarC, "action");
                    ArrayList arrayList = new ArrayList();
                    while (xv1VarC.y()) {
                        arrayList.add(new j22(xv1VarC.getLong(iX), xv1VarC.getLong(iX2), xv1VarC.getLong(iX3), (int) xv1VarC.getLong(iX4), xv1VarC.isNull(iX5) ? null : Integer.valueOf((int) xv1VarC.getLong(iX5)), xv1VarC.isNull(iX6) ? null : Long.valueOf(xv1VarC.getLong(iX6)), xv1VarC.isNull(iX7) ? null : Double.valueOf(xv1VarC.getDouble(iX7)), xv1VarC.isNull(iX8) ? null : xv1VarC.f(iX8), xv1VarC.f(iX9)));
                        break;
                    }
                    return arrayList;
                } finally {
                    xv1VarC.close();
                }
            case 27:
                vv1 vv1Var2 = (vv1) obj;
                vv1Var2.getClass();
                xv1 xv1VarC2 = vv1Var2.C("SELECT * FROM car_service_schedules");
                try {
                    int iX10 = mx.x(xv1VarC2, "carId");
                    int iX11 = mx.x(xv1VarC2, "serviceTypeId");
                    int iX12 = mx.x(xv1VarC2, "intervalKm");
                    int iX13 = mx.x(xv1VarC2, "intervalMonths");
                    int iX14 = mx.x(xv1VarC2, "enabled");
                    ArrayList arrayList2 = new ArrayList();
                    while (xv1VarC2.y()) {
                        arrayList2.add(new xn(xv1VarC2.getLong(iX10), xv1VarC2.getLong(iX11), xv1VarC2.isNull(iX12) ? null : Integer.valueOf((int) xv1VarC2.getLong(iX12)), xv1VarC2.isNull(iX13) ? null : Integer.valueOf((int) xv1VarC2.getLong(iX13)), ((int) xv1VarC2.getLong(iX14)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    xv1VarC2.close();
                }
            case 28:
                vv1 vv1Var3 = (vv1) obj;
                vv1Var3.getClass();
                xv1 xv1VarC3 = vv1Var3.C("DELETE FROM service_types WHERE isBuiltIn = 0");
                try {
                    xv1VarC3.y();
                    return ll2Var;
                } finally {
                    xv1VarC3.close();
                }
            default:
                vv1 vv1Var4 = (vv1) obj;
                vv1Var4.getClass();
                xv1 xv1VarC4 = vv1Var4.C("SELECT * FROM service_types ORDER BY sortOrder, id");
                try {
                    int iX15 = mx.x(xv1VarC4, "id");
                    int iX16 = mx.x(xv1VarC4, "key");
                    int iX17 = mx.x(xv1VarC4, "customName");
                    int iX18 = mx.x(xv1VarC4, "icon");
                    int iX19 = mx.x(xv1VarC4, "defaultIntervalKm");
                    int iX20 = mx.x(xv1VarC4, "defaultIntervalMonths");
                    int iX21 = mx.x(xv1VarC4, "tracksQuantity");
                    int iX22 = mx.x(xv1VarC4, "isBuiltIn");
                    int iX23 = mx.x(xv1VarC4, "sortOrder");
                    ArrayList arrayList3 = new ArrayList();
                    while (xv1VarC4.y()) {
                        arrayList3.add(new x22(xv1VarC4.getLong(iX15), xv1VarC4.f(iX16), xv1VarC4.isNull(iX17) ? null : xv1VarC4.f(iX17), xv1VarC4.f(iX18), xv1VarC4.isNull(iX19) ? null : Integer.valueOf((int) xv1VarC4.getLong(iX19)), xv1VarC4.isNull(iX20) ? null : Integer.valueOf((int) xv1VarC4.getLong(iX20)), ((int) xv1VarC4.getLong(iX21)) != 0, ((int) xv1VarC4.getLong(iX22)) != 0, (int) xv1VarC4.getLong(iX23)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    xv1VarC4.close();
                }
        }
    }
}

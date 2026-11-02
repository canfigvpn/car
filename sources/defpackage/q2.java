package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ q2(ez ezVar, da1 da1Var, q01 q01Var, lr0 lr0Var, em emVar) {
        this.e = 2;
        this.f = ezVar;
        this.j = da1Var;
        this.g = q01Var;
        this.h = lr0Var;
        this.i = emVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        Object objC;
        Number number;
        List listSubList;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                l2 l2Var = (l2) obj6;
                zs zsVar = (zs) obj5;
                String str = (String) obj4;
                sv0 sv0Var = (sv0) obj3;
                p2 p2Var = new p2((da1) obj2);
                da1 da1Var = (da1) p2Var.e;
                Bundle bundle = zsVar.g;
                LinkedHashMap linkedHashMap = zsVar.a;
                LinkedHashMap linkedHashMap2 = zsVar.f;
                str.getClass();
                LinkedHashMap linkedHashMap3 = zsVar.b;
                if (((Integer) linkedHashMap3.get(str)) == null) {
                    m2 m2Var = new m2(0);
                    Iterator it = new qw(new jd0(m2Var, new tr1(6, m2Var), 1)).iterator();
                    do {
                        if (!it.hasNext()) {
                            fu1.k("Sequence contains no element matching the predicate.");
                            return null;
                        }
                        number = (Number) it.next();
                    } while (linkedHashMap.containsKey(Integer.valueOf(number.intValue())));
                    int iIntValue = number.intValue();
                    linkedHashMap.put(Integer.valueOf(iIntValue), str);
                    linkedHashMap3.put(str, Integer.valueOf(iIntValue));
                }
                zsVar.e.put(str, new n2(p2Var, sv0Var));
                if (linkedHashMap2.containsKey(str)) {
                    Object obj7 = linkedHashMap2.get(str);
                    linkedHashMap2.remove(str);
                    ((ej0) da1Var.getValue()).h(obj7);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    objC = h1.c(str, bundle);
                } else {
                    Parcelable parcelable = bundle.getParcelable(str);
                    objC = j2.class.isInstance(parcelable) ? parcelable : null;
                }
                j2 j2Var = (j2) objC;
                if (j2Var != null) {
                    bundle.remove(str);
                    ((ej0) da1Var.getValue()).h(sv0Var.l0(j2Var.f, j2Var.e));
                }
                l2Var.a = new o2(zsVar, str, sv0Var);
                return new r2(0, l2Var);
            case 1:
                g11 g11Var = (g11) obj;
                z01 z01Var = ((o7) obj5).a;
                g11Var.h = (te2) obj6;
                g11Var.i = (oo0) obj4;
                g11Var.c = (o1) obj3;
                g11Var.d = (ej0) obj2;
                g11Var.e = z01Var != null ? z01Var.t : null;
                g11Var.f = z01Var != null ? z01Var.u : null;
                g11Var.g = z01Var != null ? (on2) ir2.j(z01Var, yv.t) : null;
                return ll2Var;
            case 2:
                da1 da1Var2 = (da1) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                kj1 kj1Var = e20.a;
                da1Var2.setValue(Boolean.valueOf(!((Boolean) da1Var2.getValue()).booleanValue()));
                nj2.y((ez) obj6, null, new as((q01) obj5, iIntValue2, (lr0) obj4, (em) obj3, null, 1), 3);
                return ll2Var;
            case 3:
                x40 x40Var = (x40) obj6;
                gs1 gs1Var = (gs1) obj5;
                ds1 ds1Var = (ds1) obj4;
                uy1 uy1Var = (uy1) obj3;
                cs1 cs1Var = (cs1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                j81 j81VarJ = x40.j((zk) x40Var.f);
                if (j81VarJ != null) {
                    x40Var.k(j81VarJ);
                    j81 j81VarA = ((j81) gs1Var.e).a(j81VarJ);
                    gs1Var.e = j81VarA;
                    float fI = uy1Var.i(uy1Var.e(j81VarA.a));
                    ds1Var.e = fI;
                    cs1Var.e = !ex.A(fI - fFloatValue);
                }
                return Boolean.valueOf(j81VarJ != null);
            case 4:
                ArrayList arrayList = (ArrayList) obj5;
                es1 es1Var = (es1) obj4;
                rb1 rb1Var = (rb1) obj3;
                Bundle bundle2 = (Bundle) obj2;
                kb1 kb1Var = (kb1) obj;
                kb1Var.getClass();
                ((cs1) obj6).e = true;
                int iIndexOf = arrayList.indexOf(kb1Var);
                if (iIndexOf != -1) {
                    int i2 = iIndexOf + 1;
                    listSubList = arrayList.subList(es1Var.e, i2);
                    es1Var.e = i2;
                } else {
                    listSubList = cb0.e;
                }
                rb1Var.a(kb1Var.f, bundle2, kb1Var, listSubList);
                return ll2Var;
            default:
                xf1 xf1Var = (xf1) obj5;
                te2 te2Var = (te2) obj4;
                f11 f11Var = (f11) obj3;
                o72 o72Var = (o72) obj2;
                cx0 cx0Var = (cx0) obj;
                cx0Var.a();
                um umVar = cx0Var.e;
                float fH = ((rz) obj6).c.h();
                if (fH != 0.0f) {
                    long j = te2Var.b;
                    int i3 = of2.c;
                    int iR = xf1Var.r((int) (j >> 32));
                    if2 if2VarD = f11Var.d();
                    yr1 yr1VarC = if2VarD != null ? if2VarD.a.c(iR) : new yr1(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(cx0Var.x(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = yr1VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (umVar.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(yr1VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(yr1VarC.d)) & 4294967295L);
                    sm smVar = umVar.e.c;
                    v7 v7VarC = umVar.h;
                    if (v7VarC == null) {
                        v7VarC = vs0.c();
                        v7VarC.l(1);
                        umVar.h = v7VarC;
                    }
                    Paint paint = (Paint) v7VarC.b;
                    o72Var.a(fH, umVar.d(), v7VarC);
                    if (!ws0.j((yi) v7VarC.d, null)) {
                        v7VarC.f(null);
                    }
                    if (v7VarC.a != 3) {
                        v7VarC.d(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        v7VarC.k(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (v7VarC.a() != 0) {
                        v7VarC.i(0);
                    }
                    if (v7VarC.b() != 0) {
                        v7VarC.j(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        v7VarC.g(1);
                    }
                    smVar.m(jFloatToRawIntBits, jFloatToRawIntBits2, v7VarC);
                }
                return ll2Var;
        }
    }

    public /* synthetic */ q2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }
}

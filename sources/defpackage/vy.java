package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vy implements ij0 {
    public final /* synthetic */ int e;

    public /* synthetic */ vy(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d5 A[LOOP:1: B:39:0x018e->B:52:0x01d5, LOOP_END] */
    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        Bundle bundleW = null;
        switch (this.e) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 1:
                f20 f20Var = (f20) obj2;
                Long lB = f20Var.b();
                Long lValueOf = Long.valueOf(((em) f20Var.e.getValue()).e);
                lr0 lr0Var = f20Var.a;
                return vs0.v(lB, lValueOf, Integer.valueOf(lr0Var.e), Integer.valueOf(lr0Var.f), Integer.valueOf(f20Var.a()));
            case 2:
                return Boolean.valueOf(ws0.j(obj, obj2));
            case 3:
                ((Integer) obj2).getClass();
                return new ll0(1L);
            case 4:
                ry0 ry0Var = (ry0) obj2;
                return vs0.v(Integer.valueOf(ry0Var.d.b.h()), Integer.valueOf(ry0Var.d.c.h()));
            case 5:
                q01 q01Var = (q01) obj2;
                return vs0.v(Integer.valueOf(q01Var.h()), Integer.valueOf(q01Var.i()));
            case 6:
                Map mapE = ((s01) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            case 7:
                ic1 ic1Var = (ic1) obj2;
                rb1 rb1Var = ic1Var.b;
                LinkedHashMap linkedHashMap = rb1Var.m;
                le<kb1> leVar = rb1Var.f;
                LinkedHashMap linkedHashMap2 = rb1Var.l;
                ArrayList arrayList = new ArrayList();
                Bundle bundleW2 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                for (Map.Entry entry : h61.h0(rb1Var.s.a).entrySet()) {
                    ((qd1) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                    ex.G(bundleW2, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundleW.putBundle("android-support-nav:controller:navigatorState", bundleW2);
                }
                if (!leVar.isEmpty()) {
                    if (bundleW == null) {
                        bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (kb1 kb1Var : leVar) {
                        kb1Var.getClass();
                        int i = kb1Var.f.f.a;
                        String str = kb1Var.j;
                        mb1 mb1Var = kb1Var.l;
                        Bundle bundleA = mb1Var.a();
                        Bundle bundleW3 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                        mb1Var.h.n(bundleW3);
                        Bundle bundleW4 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                        bundleW4.putString("nav-entry-state:id", str);
                        bundleW4.putInt("nav-entry-state:destination-id", i);
                        if (bundleA == null) {
                            bundleA = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                        }
                        bundleW4.putBundle("nav-entry-state:args", bundleA);
                        bundleW4.putBundle("nav-entry-state:saved-state", bundleW3);
                        arrayList2.add(bundleW4);
                    }
                    bundleW.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleW == null) {
                        bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i3 = i2 + 1;
                        iArr[i2] = iIntValue;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList3.add(str2);
                        i2 = i3;
                    }
                    bundleW.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    ex.G(bundleW, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleW == null) {
                        bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        le leVar2 = (le) entry3.getValue();
                        arrayList4.add(str3);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = leVar2.iterator();
                        while (it.hasNext()) {
                            v7 v7Var = ((ob1) it.next()).a;
                            Bundle bundleW5 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                            bundleW5.putString("nav-entry-state:id", (String) v7Var.b);
                            bundleW5.putInt("nav-entry-state:destination-id", v7Var.a);
                            Bundle bundleW6 = (Bundle) v7Var.c;
                            if (bundleW6 == null) {
                                bundleW6 = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                            }
                            bundleW5.putBundle("nav-entry-state:args", bundleW6);
                            bundleW5.putBundle("nav-entry-state:saved-state", (Bundle) v7Var.d);
                            arrayList5.add(bundleW5);
                        }
                        bundleW.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
                    }
                    ex.G(bundleW, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (ic1Var.e) {
                    if (bundleW == null) {
                        bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                    }
                    bundleW.putBoolean("android-support-nav:controller:deepLinkHandled", ic1Var.e);
                }
                return bundleW;
            case 8:
                return Integer.valueOf(((r61) obj).e0(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((r61) obj).a0(((Integer) obj2).intValue()));
            case 10:
                return Integer.valueOf(((r61) obj).f(((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(((r61) obj).U(((Integer) obj2).intValue()));
            case 12:
                dw1 dw1Var = (dw1) obj;
                da1 da1Var = (da1) obj2;
                if (!(da1Var instanceof b72)) {
                    qj.r("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                b72 b72Var = (b72) da1Var;
                Object objG = ((ij0) te2.d.b).g(dw1Var, b72Var.getValue());
                if (objG == null) {
                    return null;
                }
                d72 d72VarE = b72Var.e();
                d72VarE.getClass();
                return new dk1(objG, d72VarE);
            case 13:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 14:
                fw1 fw1Var = (fw1) obj2;
                Map map = fw1Var.e;
                w91 w91Var = fw1Var.f;
                Object[] objArr = w91Var.b;
                Object[] objArr2 = w91Var.c;
                long[] jArr = w91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    Object obj3 = objArr[i7];
                                    Map mapE2 = ((gw1) objArr2[i7]).e();
                                    if (mapE2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapE2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i5 == 8) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        } else if (i4 != length) {
                            i4++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 15:
                return obj2;
            case 16:
                yb ybVar = (yb) obj2;
                return vs0.g(ybVar.f, ax1.a(ybVar.e, ax1.b, (dw1) obj));
            case 17:
                return Integer.valueOf(((ed2) obj2).a);
            case 18:
                we2 we2Var = (we2) obj2;
                return vs0.g(Float.valueOf(we2Var.a), Float.valueOf(we2Var.b));
            case 19:
                dw1 dw1Var2 = (dw1) obj;
                xe2 xe2Var = (xe2) obj2;
                yf2 yf2Var = new yf2(xe2Var.a);
                zw1 zw1Var = ax1.x;
                return vs0.g(ax1.a(yf2Var, zw1Var, dw1Var2), ax1.a(new yf2(xe2Var.b), zw1Var, dw1Var2));
            case 20:
                return Integer.valueOf(((lh0) obj2).e);
            case 21:
                v21 v21Var = (v21) obj2;
                return vs0.g(v21Var.a, ax1.a(v21Var.b, ax1.j, (dw1) obj));
            case 22:
                return Float.valueOf(((th) obj2).a);
            case 23:
                dw1 dw1Var3 = (dw1) obj;
                List list = (List) obj2;
                ArrayList arrayList6 = new ArrayList(list.size());
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList6.add(ax1.a((xb) list.get(i8), ax1.c, dw1Var3));
                }
                return arrayList6;
            case 24:
                of2 of2Var = (of2) obj2;
                return vs0.g(Integer.valueOf((int) (of2Var.a >> 32)), Integer.valueOf((int) (of2Var.a & 4294967295L)));
            case 25:
                dw1 dw1Var4 = (dw1) obj;
                q32 q32Var = (q32) obj2;
                return vs0.g(ax1.a(new dr(q32Var.a), ax1.r, dw1Var4), ax1.a(new uf1(q32Var.b), ax1.z, dw1Var4), Float.valueOf(q32Var.c));
            case 26:
                return Integer.valueOf(((gc2) obj2).a);
            case 27:
                return Integer.valueOf(((hd2) obj2).a);
            case 28:
                return Integer.valueOf(((yn0) obj2).a);
            default:
                return Integer.valueOf(((hh0) obj2).a);
        }
    }
}

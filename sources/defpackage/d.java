package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(boolean z, String str, String str2, String str3, tc0 tc0Var, l72 l72Var) {
        this.e = 13;
        this.f = tc0Var;
        this.g = l72Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0363  */
    /* JADX WARN: Code duplicated, block: B:117:0x0374  */
    /* JADX WARN: Code duplicated, block: B:119:0x0383  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0442  */
    /* JADX WARN: Code duplicated, block: B:173:0x0453  */
    /* JADX WARN: Code duplicated, block: B:175:0x0462  */
    /* JADX WARN: Code duplicated, block: B:179:0x046e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0479  */
    /* JADX WARN: Code duplicated, block: B:186:0x048e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0496  */
    /* JADX WARN: Code duplicated, block: B:189:0x0498  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:202:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:205:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:207:0x04db  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:282:0x0603  */
    /* JADX WARN: Code duplicated, block: B:298:0x0651  */
    /* JADX WARN: Code duplicated, block: B:299:0x0653  */
    /* JADX WARN: Code duplicated, block: B:368:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[LOOP:1: B:28:0x0091->B:38:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:390:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x04de A[SYNTHETIC] */
    @Override // defpackage.ej0
    public final Object h(Object obj) throws Throwable {
        d31 d31Var;
        qj1 qj1Var;
        Object ck2Var;
        Object objH;
        Object objH2;
        int size;
        int i;
        lh0 lh0Var;
        int size2;
        int i2;
        lh0 lh0Var2;
        lh0 lh0Var3;
        ArrayList arrayList;
        int size3;
        int i3;
        Object obj2;
        lh0 lh0Var4;
        int i4;
        Object obj3;
        int size4;
        int i5;
        Object obj4;
        int size5;
        int i6;
        Object obj5;
        Typeface typefaceJ;
        Typeface typefaceJ2;
        dk2 dk2Var;
        int i7;
        String str;
        Object value;
        int i8 = 5;
        int i9 = 8;
        int i10 = 2;
        int i11 = 0;
        switch (this.e) {
            case 0:
                ((f91) this.f).c((qp1) this.g);
                return ll2.a;
            case 1:
                f31 f31Var = (f31) this.f;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.g;
                if (((q11) obj) == q11.ON_RESUME) {
                    f31Var.getClass();
                    f31Var.g.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(f31Var);
                    e31 e31Var = f31Var.h;
                    if (e31Var != null) {
                        e31Var.e.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(e31Var);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (d31Var = f31Var.i) != null) {
                        d31Var.a.setValue(Boolean.valueOf(f31.a(accessibilityManager)));
                        d31Var.b.setValue(Boolean.valueOf(f31.b(accessibilityManager)));
                        h1.a(accessibilityManager, e1.c(d31Var));
                    }
                }
                return ll2.a;
            case 2:
                ak1 ak1Var = (ak1) this.f;
                da1 da1Var = (da1) this.g;
                ak1Var.i(((Integer) obj).intValue());
                da1Var.setValue(Boolean.FALSE);
                return ll2.a;
            case 3:
                tf tfVar = (tf) this.f;
                uf ufVar = (uf) this.g;
                ll2 ll2Var = ll2.a;
                og2 og2Var = tfVar.s;
                if (og2Var != null) {
                    og2Var.b();
                }
                tfVar.s = null;
                ls lsVar = ufVar.b;
                if (lsVar != null) {
                    lsVar.U(ll2Var);
                }
                ufVar.b = null;
                return ll2Var;
            case 4:
                bg bgVar = (bg) this.f;
                cu cuVar = (cu) this.g;
                bgVar.a(cuVar);
                return new gg(i11, bgVar, cuVar);
            case 5:
                te2 te2Var = (te2) this.f;
                ej0 ej0Var = (ej0) this.g;
                te2 te2Var2 = (te2) obj;
                if (!ws0.j(te2Var, te2Var2)) {
                    ej0Var.h(te2Var2);
                }
                return ll2.a;
            case 6:
                nj2.y((ez) this.f, null, new e(5, null, (bg0) obj, (mh2) this.g), 3);
                return ll2.a;
            case 7:
                d8 d8Var = (d8) this.f;
                rk rkVar = (rk) this.g;
                cx0 cx0Var = (cx0) obj;
                cx0Var.a();
                l80.s(cx0Var, d8Var, rkVar, 0.0f, null, 60);
                return ll2.a;
            case 8:
                gi1 gi1Var = (gi1) this.f;
                rk rkVar2 = (rk) this.g;
                cx0 cx0Var2 = (cx0) obj;
                cx0Var2.a();
                l80.s(cx0Var2, gi1Var.i, rkVar2, 0.0f, null, 60);
                return ll2.a;
            case 9:
                ((ck) this.f).a.j((zw) this.g);
                return ll2.a;
            case 10:
                f11 f11Var = (f11) this.f;
                rk rkVar3 = (rk) this.g;
                cx0 cx0Var3 = (cx0) obj;
                cx0Var3.a();
                if (((Boolean) f11Var.s.getValue()).booleanValue() || ((Boolean) f11Var.t.getValue()).booleanValue()) {
                    l80.T(cx0Var3, rkVar3, 0L, 0L, 0.0f, null, 126);
                }
                return ll2.a;
            case 11:
                w02.b((z02) obj, ((String) this.f) + ", " + ((String) this.g));
                return ll2.a;
            case 12:
                n00 n00Var = (n00) this.f;
                Locale locale = (Locale) this.g;
                List list = (List) obj;
                Long l = (Long) list.get(0);
                Long l2 = (Long) list.get(1);
                Object obj6 = list.get(2);
                obj6.getClass();
                int iIntValue = ((Integer) obj6).intValue();
                Object obj7 = list.get(3);
                obj7.getClass();
                lr0 lr0Var = new lr0(iIntValue, ((Integer) obj7).intValue(), 1);
                Object obj8 = list.get(4);
                obj8.getClass();
                return new f20(l, l2, lr0Var, ((Integer) obj8).intValue(), n00Var, locale);
            case 13:
                tc0 tc0Var = (tc0) this.f;
                l72 l72Var = (l72) this.g;
                z02 z02Var = (z02) obj;
                w02.e(z02Var, 6);
                z02Var.a(h02.b, new p0(null, new w8(tc0Var, l72Var)));
                return ll2.a;
            case 14:
                return new r2(8, new xc0((View) this.f, (ti0) this.g));
            case 15:
                ((f91) this.f).c((tr0) this.g);
                return ll2.a;
            case 16:
                lg0 lg0Var = (lg0) this.f;
                bk2 bk2Var = (bk2) this.g;
                ej0 ej0Var2 = (ej0) obj;
                qg0 qg0Var = lg0Var.d;
                b7 b7Var = lg0Var.a;
                m mVar = lg0Var.f;
                kg0 kg0Var = bk2Var.a;
                if (kg0Var instanceof og0) {
                    List list2 = ((og0) kg0Var).g;
                    lh0 lh0Var5 = bk2Var.b;
                    int i12 = bk2Var.c;
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size6 = list2.size();
                    for (int i13 = 0; i13 < size6; i13++) {
                        Object obj9 = list2.get(i13);
                        if (ws0.j(((kt1) obj9).b, lh0Var5) && i12 == 0) {
                            arrayList2.add(obj9);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size7 = list2.size();
                        for (int i14 = 0; i14 < size7; i14++) {
                            Object obj10 = list2.get(i14);
                            ((kt1) obj10).getClass();
                            if (i12 == 0) {
                                arrayList3.add(obj10);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            list2 = arrayList3;
                        }
                        int iCompareTo = lh0Var5.compareTo(lh0.f);
                        int i15 = lh0Var5.e;
                        if (iCompareTo < 0) {
                            int size8 = list2.size();
                            lh0 lh0Var6 = null;
                            lh0 lh0Var7 = null;
                            for (int i16 = 0; i16 < size8; i16++) {
                                lh0 lh0Var8 = ((kt1) list2.get(i16)).b;
                                int i17 = lh0Var8.e;
                                if (ws0.n(i17, i15) < 0) {
                                    if (lh0Var6 == null || ws0.n(i17, lh0Var6.e) > 0) {
                                        lh0Var6 = lh0Var8;
                                    }
                                } else if (ws0.n(i17, i15) <= 0) {
                                    lh0Var6 = lh0Var8;
                                    lh0Var7 = lh0Var6;
                                    if (lh0Var6 == null) {
                                        lh0Var6 = lh0Var7;
                                    }
                                    arrayList = new ArrayList(list2.size());
                                    size5 = list2.size();
                                    for (i6 = 0; i6 < size5; i6++) {
                                        obj5 = list2.get(i6);
                                        if (ws0.j(((kt1) obj5).b, lh0Var6)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                } else if (lh0Var7 == null || ws0.n(i17, lh0Var7.e) < 0) {
                                    lh0Var7 = lh0Var8;
                                }
                            }
                            if (lh0Var6 == null) {
                                lh0Var6 = lh0Var7;
                            }
                            arrayList = new ArrayList(list2.size());
                            size5 = list2.size();
                            while (i6 < size5) {
                                obj5 = list2.get(i6);
                                if (ws0.j(((kt1) obj5).b, lh0Var6)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            lh0 lh0Var9 = lh0.g;
                            if (lh0Var5.compareTo(lh0Var9) > 0) {
                                int size9 = list2.size();
                                lh0 lh0Var10 = null;
                                lh0 lh0Var11 = null;
                                for (int i18 = 0; i18 < size9; i18++) {
                                    lh0 lh0Var12 = ((kt1) list2.get(i18)).b;
                                    int i19 = lh0Var12.e;
                                    if (ws0.n(i19, i15) < 0) {
                                        if (lh0Var10 == null || ws0.n(i19, lh0Var10.e) > 0) {
                                            lh0Var10 = lh0Var12;
                                        }
                                    } else if (ws0.n(i19, i15) <= 0) {
                                        lh0Var10 = lh0Var12;
                                        lh0Var11 = lh0Var10;
                                        if (lh0Var11 != null) {
                                            lh0Var10 = lh0Var11;
                                        }
                                        arrayList = new ArrayList(list2.size());
                                        size4 = list2.size();
                                        for (i5 = 0; i5 < size4; i5++) {
                                            obj4 = list2.get(i5);
                                            if (ws0.j(((kt1) obj4).b, lh0Var10)) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    } else if (lh0Var11 == null || ws0.n(i19, lh0Var11.e) < 0) {
                                        lh0Var11 = lh0Var12;
                                    }
                                }
                                if (lh0Var11 != null) {
                                    lh0Var10 = lh0Var11;
                                }
                                arrayList = new ArrayList(list2.size());
                                size4 = list2.size();
                                while (i5 < size4) {
                                    obj4 = list2.get(i5);
                                    if (ws0.j(((kt1) obj4).b, lh0Var10)) {
                                        arrayList.add(obj4);
                                    }
                                }
                            } else {
                                int size10 = list2.size();
                                lh0 lh0Var13 = null;
                                lh0 lh0Var14 = null;
                                for (int i20 = 0; i20 < size10; i20++) {
                                    lh0 lh0Var15 = ((kt1) list2.get(i20)).b;
                                    if (ws0.n(lh0Var15.e, lh0Var9.e) <= 0) {
                                        int i21 = lh0Var15.e;
                                        if (ws0.n(i21, i15) < 0) {
                                            if (lh0Var13 == null || ws0.n(i21, lh0Var13.e) > 0) {
                                                lh0Var13 = lh0Var15;
                                            }
                                        } else if (ws0.n(i21, i15) <= 0) {
                                            lh0Var13 = lh0Var15;
                                            lh0Var14 = lh0Var13;
                                            if (lh0Var14 != null) {
                                                lh0Var13 = lh0Var14;
                                            }
                                            arrayList2 = new ArrayList(list2.size());
                                            size = list2.size();
                                            for (i = 0; i < size; i++) {
                                                obj3 = list2.get(i);
                                                if (ws0.j(((kt1) obj3).b, lh0Var13)) {
                                                    arrayList2.add(obj3);
                                                }
                                            }
                                            if (arrayList2.isEmpty()) {
                                                lh0Var = lh0.g;
                                                size2 = list2.size();
                                                lh0Var2 = null;
                                                lh0Var3 = null;
                                                for (i2 = 0; i2 < size2; i2++) {
                                                    lh0Var4 = ((kt1) list2.get(i2)).b;
                                                    if (lh0Var != null || ws0.n(lh0Var4.e, lh0Var.e) >= 0) {
                                                        i4 = lh0Var4.e;
                                                        if (ws0.n(i4, i15) < 0) {
                                                            if (lh0Var2 != null || ws0.n(i4, lh0Var2.e) > 0) {
                                                                lh0Var2 = lh0Var4;
                                                            }
                                                        } else if (ws0.n(i4, i15) <= 0) {
                                                            lh0Var2 = lh0Var4;
                                                            lh0Var3 = lh0Var2;
                                                            if (lh0Var3 != null) {
                                                                lh0Var2 = lh0Var3;
                                                            }
                                                            arrayList = new ArrayList(list2.size());
                                                            size3 = list2.size();
                                                            for (i3 = 0; i3 < size3; i3++) {
                                                                obj2 = list2.get(i3);
                                                                if (ws0.j(((kt1) obj2).b, lh0Var2)) {
                                                                    arrayList.add(obj2);
                                                                }
                                                            }
                                                        } else if (lh0Var3 != null || ws0.n(i4, lh0Var3.e) < 0) {
                                                            lh0Var3 = lh0Var4;
                                                        }
                                                    }
                                                }
                                                if (lh0Var3 != null) {
                                                    lh0Var2 = lh0Var3;
                                                }
                                                arrayList = new ArrayList(list2.size());
                                                size3 = list2.size();
                                                while (i3 < size3) {
                                                    obj2 = list2.get(i3);
                                                    if (ws0.j(((kt1) obj2).b, lh0Var2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            }
                                        } else if (lh0Var14 == null || ws0.n(i21, lh0Var14.e) < 0) {
                                            lh0Var14 = lh0Var15;
                                        }
                                    }
                                }
                                if (lh0Var14 != null) {
                                    lh0Var13 = lh0Var14;
                                }
                                arrayList2 = new ArrayList(list2.size());
                                size = list2.size();
                                while (i < size) {
                                    obj3 = list2.get(i);
                                    if (ws0.j(((kt1) obj3).b, lh0Var13)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    lh0Var = lh0.g;
                                    size2 = list2.size();
                                    lh0Var2 = null;
                                    lh0Var3 = null;
                                    while (i2 < size2) {
                                        lh0Var4 = ((kt1) list2.get(i2)).b;
                                        if (lh0Var != null) {
                                            i4 = lh0Var4.e;
                                            if (ws0.n(i4, i15) < 0) {
                                                if (lh0Var2 != null) {
                                                    lh0Var2 = lh0Var4;
                                                } else {
                                                    lh0Var2 = lh0Var4;
                                                }
                                            } else if (ws0.n(i4, i15) <= 0) {
                                                lh0Var2 = lh0Var4;
                                                lh0Var3 = lh0Var2;
                                                if (lh0Var3 != null) {
                                                    lh0Var2 = lh0Var3;
                                                }
                                                arrayList = new ArrayList(list2.size());
                                                size3 = list2.size();
                                                while (i3 < size3) {
                                                    obj2 = list2.get(i3);
                                                    if (ws0.j(((kt1) obj2).b, lh0Var2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (lh0Var3 != null) {
                                                lh0Var3 = lh0Var4;
                                            } else {
                                                lh0Var3 = lh0Var4;
                                            }
                                        } else {
                                            i4 = lh0Var4.e;
                                            if (ws0.n(i4, i15) < 0) {
                                                if (lh0Var2 != null) {
                                                    lh0Var2 = lh0Var4;
                                                } else {
                                                    lh0Var2 = lh0Var4;
                                                }
                                            } else if (ws0.n(i4, i15) <= 0) {
                                                lh0Var2 = lh0Var4;
                                                lh0Var3 = lh0Var2;
                                                if (lh0Var3 != null) {
                                                    lh0Var2 = lh0Var3;
                                                }
                                                arrayList = new ArrayList(list2.size());
                                                size3 = list2.size();
                                                while (i3 < size3) {
                                                    obj2 = list2.get(i3);
                                                    if (ws0.j(((kt1) obj2).b, lh0Var2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (lh0Var3 != null) {
                                                lh0Var3 = lh0Var4;
                                            } else {
                                                lh0Var3 = lh0Var4;
                                            }
                                        }
                                    }
                                    if (lh0Var3 != null) {
                                        lh0Var2 = lh0Var3;
                                    }
                                    arrayList = new ArrayList(list2.size());
                                    size3 = list2.size();
                                    while (i3 < size3) {
                                        obj2 = list2.get(i3);
                                        if (ws0.j(((kt1) obj2).b, lh0Var2)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList2 = arrayList;
                    }
                    ud udVar = qg0Var.a;
                    if (arrayList2.size() > 0) {
                        kt1 kt1Var = (kt1) arrayList2.get(0);
                        kt1Var.getClass();
                        synchronized (((iq1) udVar.d)) {
                            try {
                                df dfVar = new df(kt1Var);
                                cf cfVar = (cf) ((e51) udVar.b).a(dfVar);
                                if (cfVar == null) {
                                    cfVar = (cf) ((w91) udVar.c).g(dfVar);
                                }
                                if (cfVar != null) {
                                    objH2 = cfVar.a;
                                } else {
                                    try {
                                        objH = b7Var.b(kt1Var);
                                    } catch (Exception unused) {
                                        objH = mVar.h(bk2Var);
                                    }
                                    udVar.getClass();
                                    df dfVar2 = new df(kt1Var);
                                    synchronized (((iq1) udVar.d)) {
                                        try {
                                            if (objH == null) {
                                                ((w91) udVar.c).m(dfVar2, new cf(null));
                                            } else {
                                                ((e51) udVar.b).b(dfVar2, new cf(objH));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    objH2 = objH;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        if (objH2 == null) {
                            objH2 = mVar.h(bk2Var);
                        }
                        qj1Var = new qj1(null, ix.P(bk2Var.d, objH2, kt1Var, bk2Var.b, bk2Var.c));
                    } else {
                        qj1Var = new qj1(null, mVar.h(bk2Var));
                    }
                    List list3 = (List) qj1Var.e;
                    Object obj11 = qj1Var.f;
                    if (list3 == null) {
                        ck2Var = new dk2(obj11, true);
                    } else {
                        bf bfVar = new bf(list3, obj11, bk2Var, qg0Var.a, ej0Var2, b7Var);
                        nj2.y(qg0Var.b, null, new ln(4, (sx) null, bfVar), 1);
                        ck2Var = new ck2(bfVar);
                    }
                } else {
                    ck2Var = null;
                }
                if (ck2Var != null) {
                    return ck2Var;
                }
                w40 w40Var = (w40) lg0Var.e.f;
                kg0 kg0Var2 = bk2Var.a;
                int i22 = bk2Var.c;
                lh0 lh0Var16 = bk2Var.b;
                if (kg0Var2 != null && !(kg0Var2 instanceof x20)) {
                    if (kg0Var2 instanceof ok0) {
                        ok0 ok0Var = (ok0) kg0Var2;
                        switch (w40Var.e) {
                            case 26:
                                ok0Var.getClass();
                                typefaceJ2 = w40.j("sans-serif", lh0Var16, i22);
                                break;
                            default:
                                ok0Var.getClass();
                                int i23 = lh0Var16.e / 100;
                                if (i23 >= 0 && i23 < 2) {
                                    str = "sans-serif-thin";
                                } else if (2 <= i23 && i23 < 4) {
                                    str = "sans-serif-light";
                                } else if (i23 == 4) {
                                    str = "sans-serif";
                                } else if (i23 == 5) {
                                    str = "sans-serif-medium";
                                } else {
                                    if (6 <= i23) {
                                        i7 = 8;
                                        if (i23 < 8) {
                                            str = "sans-serif";
                                        }
                                    } else {
                                        i7 = 8;
                                    }
                                    if (i7 > i23 || i23 >= 11) {
                                        str = "sans-serif";
                                    } else {
                                        str = "sans-serif-black";
                                    }
                                }
                                if (str.length() == 0) {
                                    typefaceJ2 = null;
                                } else {
                                    typefaceJ2 = w40.k(str, lh0Var16, i22);
                                    if (ws0.j(typefaceJ2, Typeface.create(Typeface.DEFAULT, nj2.p(lh0Var16, i22))) || ws0.j(typefaceJ2, w40.k(null, lh0Var16, i22))) {
                                        typefaceJ2 = null;
                                    }
                                }
                                if (typefaceJ2 == null) {
                                    typefaceJ2 = w40.k("sans-serif", lh0Var16, i22);
                                }
                                break;
                        }
                    } else {
                        dk2Var = null;
                    }
                    if (dk2Var != null) {
                        return dk2Var;
                    }
                    fu1.h("Could not load font");
                    return null;
                }
                switch (w40Var.e) {
                    case 26:
                        typefaceJ = w40.j(null, lh0Var16, i22);
                        break;
                    default:
                        typefaceJ = w40.k(null, lh0Var16, i22);
                        break;
                }
                typefaceJ2 = typefaceJ;
                dk2Var = new dk2(typefaceJ2, true);
                if (dk2Var != null) {
                    return dk2Var;
                }
                fu1.h("Could not load font");
                return null;
            case 17:
                ((ul0) this.f).g.removeCallbacks((hm) this.g);
                return ll2.a;
            case 18:
                rm0 rm0Var = (rm0) this.f;
                p82 p82Var = (p82) this.g;
                f01 f01Var = (f01) obj;
                f01Var.getClass();
                f01.U(f01Var, null, new gt(new in(i8, rm0Var, p82Var), true, -1970519544), 3);
                List list4 = ((om0) p82Var.getValue()).c;
                f01Var.V(list4.size(), new qi(i8, new n30(10), list4), new sd(2, list4), new gt(new li0(list4, rm0Var, p82Var, i10), true, 802480018));
                return ll2.a;
            case 19:
                ln0 ln0Var = (ln0) this.f;
                da1 da1Var2 = (da1) this.g;
                int iIntValue2 = ((Integer) obj).intValue();
                wm wmVar = ((hn0) ln0Var.e.e.getValue()).a;
                if (wmVar != null) {
                    nj2.y(s5.H(ln0Var), null, new kn0(ln0Var, wmVar.a, iIntValue2, null), 3);
                }
                da1Var2.setValue(Boolean.FALSE);
                return ll2.a;
            case 20:
                ((ej0) this.f).h(r22.a(((es0) this.g).b, null, null, ((Boolean) obj).booleanValue(), 15));
                return ll2.a;
            case 21:
                p82 p82Var2 = (p82) this.f;
                ls0 ls0Var = (ls0) this.g;
                f01 f01Var2 = (f01) obj;
                f01Var2.getClass();
                f01.U(f01Var2, null, dv1.e, 3);
                List list5 = ((ks0) p82Var2.getValue()).a;
                f01Var2.V(list5.size(), new qi(i9, new n30(20), list5), new sd(4, list5), new gt(new js0(list5, ls0Var), true, 802480018));
                return ll2.a;
            case 22:
                ny0 ny0Var = (ny0) this.f;
                dy0 dy0Var = (dy0) this.g;
                nh0 nh0VarB = ny0Var.b(((Integer) obj).intValue());
                int i24 = nh0VarB.a;
                List list6 = nh0VarB.b;
                ArrayList arrayList4 = new ArrayList(list6.size());
                int size11 = list6.size();
                int i25 = 0;
                while (i11 < size11) {
                    int i26 = (int) ((ll0) list6.get(i11)).a;
                    arrayList4.add(new qj1(Integer.valueOf(i24), new sw(dy0Var.a(i25, i26))));
                    i24++;
                    i25 += i26;
                    i11++;
                }
                return arrayList4;
            case 23:
                dy0 dy0Var2 = (dy0) this.f;
                cy0 cy0Var = (cy0) this.g;
                int iIntValue3 = ((Integer) obj).intValue();
                ny0 ny0Var2 = dy0Var2.e;
                int i27 = ny0Var2.i;
                int iE = ny0Var2.e(iIntValue3);
                return cy0Var.n(iIntValue3, 0, iE, cy0Var.d, dy0Var2.a(0, iE));
            case 24:
                s01 s01Var = (s01) this.f;
                Object obj12 = this.g;
                s01Var.g.i(obj12);
                return new gg(i10, s01Var, obj12);
            case 25:
                return new s01((gw1) this.f, (Map) obj, (ew1) this.g);
            case 26:
                f41 f41Var = (f41) this.f;
                da1 da1Var3 = (da1) this.g;
                int iIntValue4 = ((Integer) obj).intValue();
                s82 s82Var = f41Var.g;
                do {
                    value = s82Var.getValue();
                } while (!s82Var.h(value, d41.a((d41) value, null, 0L, iIntValue4, null, null, null, null, null, null, null, false, 8183)));
                da1Var3.setValue(Boolean.FALSE);
                return ll2.a;
            case 27:
                ((y81) this.f).c.add(new v81(obj, (k12) this.g));
                return ll2.a;
            case 28:
                Set set = (Set) this.f;
                y81 y81Var = (y81) this.g;
                if (set.contains(obj)) {
                    w91 w91Var = y81Var.b;
                    x91 x91Var = y81Var.d;
                    Object objG = w91Var.g(obj);
                    if (objG != null) {
                        if (objG instanceof x91) {
                            x91 x91Var2 = (x91) objG;
                            Object[] objArr = x91Var2.b;
                            long[] jArr = x91Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i28 = 0;
                                while (true) {
                                    long j = jArr[i28];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i28 - length)) >>> 31);
                                        for (int i30 = 0; i30 < i29; i30++) {
                                            if ((255 & j) < 128) {
                                                x91Var.a((k12) objArr[(i28 << 3) + i30]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i29 == 8) {
                                            if (i28 != length) {
                                                i28++;
                                            }
                                        }
                                    } else if (i28 != length) {
                                        i28++;
                                    }
                                }
                            }
                        } else {
                            x91Var.a((k12) objG);
                        }
                    }
                }
                return ll2.a;
            default:
                zb1 zb1Var = (zb1) this.f;
                rb1 rb1Var = ((ic1) this.g).b;
                tc1 tc1Var = (tc1) obj;
                tc1Var.getClass();
                yc0 yc0Var = tc1Var.a;
                yc0Var.a = 0;
                yc0Var.b = 0;
                if (zb1Var instanceof cc1) {
                    int i31 = zb1.i;
                    for (zb1 zb1Var2 : vv.o(zb1Var)) {
                        zb1 zb1VarF = rb1Var.f();
                        if (ws0.j(zb1Var2, zb1VarF != null ? zb1VarF.g : null)) {
                        }
                    }
                    int i32 = cc1.k;
                    tc1Var.d = rw.u(rb1Var.g()).f.a;
                    tc1Var.e = true;
                }
                return ll2.a;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}

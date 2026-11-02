package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n1(pb1 pb1Var, kb1 kb1Var, boolean z) {
        this.e = 27;
        this.f = pb1Var;
        this.g = kb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0334  */
    /* JADX WARN: Code duplicated, block: B:144:0x0352  */
    @Override // defpackage.ti0
    public final Object a() {
        d31 d31Var;
        List listA0;
        k52 k52VarC;
        String[] strArrNames;
        gf1 gf1Var = null;
        int i = 0;
        switch (this.e) {
            case 0:
                f31 f31Var = (f31) this.f;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.g;
                f31Var.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(f31Var);
                e31 e31Var = f31Var.h;
                if (e31Var != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(e31Var);
                }
                if (Build.VERSION.SDK_INT >= 33 && (d31Var = f31Var.i) != null) {
                    h1.i(accessibilityManager, e1.c(d31Var));
                }
                return ll2.a;
            case 1:
                ((gs1) this.f).e = ((ti0) this.g).a();
                return ll2.a;
            case 2:
                ((lo) this.f).c(this.g);
                return ll2.a;
            case 3:
                ((ej0) this.f).h(Integer.valueOf(((nt0) ((da1) this.g).getValue()).a()));
                return ll2.a;
            case 4:
                ((ej0) this.f).h((nt0) this.g);
                return ll2.a;
            case 5:
                f20 f20Var = (f20) this.f;
                ej0 ej0Var = (ej0) this.g;
                Long lB = f20Var.b();
                if (lB != null) {
                    ej0Var.h(Integer.valueOf((int) Math.floorDiv(lB.longValue(), 86400000L)));
                }
                return ll2.a;
            case 6:
                ((cu) this.f).c = (ti0) this.g;
                return ll2.a;
            case 7:
                jg jgVar = (jg) this.f;
                cx0 cx0Var = (cx0) this.g;
                jgVar.y = jgVar.t.a(cx0Var.e.d(), cx0Var.getLayoutDirection(), cx0Var);
                return ll2.a;
            case 8:
                te2 te2Var = (te2) this.f;
                da1 da1Var = (da1) this.g;
                if (!of2.b(te2Var.b, ((te2) da1Var.getValue()).b) || !ws0.j(te2Var.c, ((te2) da1Var.getValue()).c)) {
                    da1Var.setValue(te2Var);
                }
                return ll2.a;
            case 9:
                nj2.y((ez) this.f, null, new ki((mh2) this.g, 0 == true ? 1 : 0, i), 3);
                return Boolean.TRUE;
            case 10:
                ti0 ti0Var = (ti0) this.f;
                ((da1) this.g).setValue(Boolean.FALSE);
                ti0Var.a();
                return ll2.a;
            case 11:
                ov ovVar = (ov) this.f;
                Object obj = this.g;
                ak0 ak0Var = ovVar.e;
                l52 l52Var = ak0Var.c;
                k52 k52VarC2 = l52Var.c();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < l52Var.f) {
                            if (k52VarC2.l(i2)) {
                                Object objN = k52VarC2.n(i2);
                                if (objN != obj) {
                                    ek0 ek0Var = objN instanceof ek0 ? (ek0) objN : null;
                                    if ((ek0Var != null ? ek0Var.a : null) == obj) {
                                    }
                                }
                                gf1 gf1Var2 = new gf1(i2, null);
                                k52VarC2.c();
                                gf1Var = gf1Var2;
                                if (gf1Var != null) {
                                    int i3 = gf1Var.a;
                                    Integer num = gf1Var.b;
                                    k52VarC = l52Var.c();
                                    try {
                                        ArrayList arrayListM0 = sv0.m0(k52VarC, i3, num);
                                        k52VarC.c();
                                        listA0 = vq.a0(arrayListM0, ak0Var.E());
                                    } catch (Throwable th) {
                                        k52VarC.c();
                                        throw th;
                                    }
                                } else {
                                    listA0 = cb0.e;
                                }
                                return new su(listA0, ak0Var.C);
                            }
                            int[] iArr = k52VarC2.b;
                            int i4 = i2 + 1;
                            int iD = (i4 < k52VarC2.c ? iArr[(i4 * 5) + 4] : k52VarC2.e) - n52.d(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iD) {
                                    i2 = i4;
                                } else {
                                    Object objH = k52VarC2.h(i2, i5);
                                    if (objH != obj) {
                                        ek0 ek0Var2 = objH instanceof ek0 ? (ek0) objH : null;
                                        if ((ek0Var2 != null ? ek0Var2.a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    gf1Var = new gf1(i2, Integer.valueOf(i5));
                                }
                            }
                        }
                        k52VarC2.c();
                        if (gf1Var != null) {
                            int i6 = gf1Var.a;
                            Integer num2 = gf1Var.b;
                            k52VarC = l52Var.c();
                            ArrayList arrayListM1 = sv0.m0(k52VarC, i6, num2);
                            k52VarC.c();
                            listA0 = vq.a0(arrayListM1, ak0Var.E());
                        } else {
                            listA0 = cb0.e;
                        }
                        return new su(listA0, ak0Var.C);
                    } catch (Throwable th2) {
                        k52VarC2.c();
                        throw th2;
                    }
                }
            case 12:
                return new ir0(mx.N(((nc2) this.f).h((jw0) ((ti0) this.g).a())));
            case 13:
                ((uc2) this.f).d.h((ad2) this.g);
                return ll2.a;
            case 14:
                ((h50) this.f).e((kb1) this.g, false);
                return ll2.a;
            case 15:
                zb0 zb0Var = (zb0) this.f;
                String str = (String) this.g;
                Enum[] enumArr = zb0Var.a;
                wb0 wb0Var = new wb0(str, enumArr.length);
                for (Enum r0 : enumArr) {
                    wb0Var.l(r0.name(), false);
                }
                return wb0Var;
            case 16:
                ((gs1) this.f).e = ir2.j((gg0) this.g, hm1.a);
                return ll2.a;
            case 17:
                ij0 ij0Var = (ij0) this.f;
                p82 p82Var = (p82) this.g;
                ij0Var.g(Long.valueOf(((oi0) p82Var.getValue()).a), Long.valueOf(((oi0) p82Var.getValue()).b));
                return ll2.a;
            case 18:
                da1 da1Var2 = (da1) this.f;
                da1 da1Var3 = (da1) this.g;
                da1Var2.setValue(Boolean.FALSE);
                da1Var3.setValue(Boolean.TRUE);
                return ll2.a;
            case 19:
                ((ij0) this.f).g(Long.valueOf(((wm) this.g).a), 0L);
                return ll2.a;
            case 20:
                ln0 ln0Var = (ln0) this.f;
                ((da1) this.g).setValue(Boolean.FALSE);
                wm wmVar = ((hn0) ln0Var.e.e.getValue()).a;
                if (wmVar != null) {
                    nj2.y(s5.H(ln0Var), null, new in0(ln0Var, wmVar.a, null, 0), 3);
                }
                return ll2.a;
            case 21:
                s12 s12Var = (s12) this.f;
                yt0 yt0Var = (yt0) this.g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ir2.w(yt0Var, s12Var);
                int iD2 = s12Var.d();
                for (int i7 = 0; i7 < iD2; i7++) {
                    List listI = s12Var.i(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listI) {
                        if (obj2 instanceof su0) {
                            arrayList.add(obj2);
                        }
                    }
                    su0 su0Var = (su0) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (su0Var != null && (strArrNames = su0Var.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = ws0.j(s12Var.c(), x12.b) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new nu0("The suggested name '" + str2 + "' for " + str3 + ' ' + s12Var.e(i7) + " is already one of the names for " + str3 + ' ' + s12Var.e(((Number) h61.d0(str2, linkedHashMap)).intValue()) + " in " + s12Var);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? db0.e : linkedHashMap;
            case 22:
                v40 v40Var = (v40) this.f;
                ry0 ry0Var = (ry0) this.g;
                yx0 yx0Var = (yx0) v40Var.getValue();
                return new zx0(ry0Var, yx0Var, new h7((lr0) ry0Var.d.f.getValue(), yx0Var));
            case 23:
                return new s01((gw1) this.f, db0.e, (ew1) this.g);
            case 24:
                f41 f41Var = (f41) this.f;
                ((da1) this.g).setValue(Boolean.FALSE);
                d41 d41Var = (d41) f41Var.g.getValue();
                if (d41Var.a != 0) {
                    nj2.y(s5.H(f41Var), null, new e(21, 0 == true ? 1 : 0, f41Var, d41Var), 3);
                }
                return ll2.a;
            case 25:
                ((ej0) this.f).h((is) this.g);
                return ll2.a;
            case 26:
                ei1.C((ic1) this.g, (qh2) this.f);
                return ll2.a;
            case 27:
                pb1 pb1Var = (pb1) this.f;
                kb1 kb1Var = (kb1) this.g;
                synchronized (pb1Var.a) {
                    try {
                        s82 s82Var = pb1Var.b;
                        Iterable iterable = (Iterable) s82Var.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (ws0.j((kb1) obj3, kb1Var)) {
                                s82Var.j(null, arrayList2);
                            } else {
                                arrayList2.add(obj3);
                            }
                        }
                        s82Var.j(null, arrayList2);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return ll2.a;
            case 28:
                ud udVar = (ud) this.f;
                mr1 mr1Var = (mr1) this.g;
                if (((ff) udVar.b).get() == 0) {
                    mr1Var.a();
                }
                return ll2.a;
            default:
                return v12.d((String) this.f, q92.e, new s12[0], new m(25, (hf1) this.g));
        }
    }

    public /* synthetic */ n1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}

package defpackage;

import android.app.Activity;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dn0 implements jj0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ da1 f;
    public final /* synthetic */ da1 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ dn0(wm wmVar, ti0 ti0Var, q01 q01Var, da1 da1Var, ti0 ti0Var2, ij0 ij0Var, da1 da1Var2) {
        this.h = wmVar;
        this.i = ti0Var;
        this.k = q01Var;
        this.f = da1Var;
        this.j = ti0Var2;
        this.l = ij0Var;
        this.g = da1Var2;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        is1 is1Var = cv.a;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        switch (i) {
            case 0:
                wm wmVar = (wm) obj8;
                ti0 ti0Var = (ti0) obj7;
                q01 q01Var = (q01) obj5;
                ti0 ti0Var2 = (ti0) obj6;
                ij0 ij0Var = (ij0) obj4;
                gj1 gj1Var = (gj1) obj;
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gj1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ak0Var.f(gj1Var) ? 4 : 2;
                }
                if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    da1 da1Var = this.f;
                    if (wmVar == null) {
                        ak0Var.W(-1488350186);
                        if (((hn0) da1Var.getValue()).e) {
                            ak0Var.W(-1496217087);
                        } else {
                            ak0Var.W(-1488316768);
                            dv1.f("🚗", j02.r(R.string.garage_empty_title, ak0Var), j02.r(R.string.garage_empty_body, ak0Var), p61.b0(r71.a, gj1Var), j02.r(R.string.garage_add_car, ak0Var), ti0Var, ak0Var, 6, 0);
                        }
                        ak0Var.p(false);
                        ak0Var.p(false);
                    } else {
                        ak0Var.W(-1496217087);
                        ak0Var.p(false);
                        List list = ((hn0) da1Var.getValue()).b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj9 : list) {
                            if (((ul2) obj9).i != t22.i) {
                                arrayList.add(obj9);
                            }
                        }
                        u71 u71VarB0 = p61.b0(f52.c, gj1Var);
                        kj1 kj1Var = new kj1(16.0f, 16.0f, 16.0f, 96.0f);
                        he heVar = new he(12.0f, new ut(1));
                        boolean zF = ak0Var.f(wmVar) | ak0Var.f(da1Var) | ak0Var.f(ti0Var2) | ak0Var.h(arrayList) | ak0Var.f(ij0Var);
                        Object objL = ak0Var.L();
                        if (zF || objL == is1Var) {
                            zj zjVar = new zj(arrayList, wmVar, da1Var, this.g, ti0Var2, ij0Var, 1);
                            ak0Var.g0(zjVar);
                            objL = zjVar;
                        }
                        mx.e(u71VarB0, q01Var, kj1Var, heVar, null, null, false, null, (ej0) objL, ak0Var, 24960, 488);
                    }
                } else {
                    ak0Var.R();
                }
                break;
            default:
                p82 p82Var = (p82) obj8;
                o32 o32Var = (o32) obj7;
                Activity activity = (Activity) obj6;
                s51 s51Var = (s51) obj5;
                ph phVar = (ph) obj4;
                gj1 gj1Var2 = (gj1) obj;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gj1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ak0Var2.f(gj1Var2) ? 4 : 2;
                }
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    u71 u71VarB1 = p61.b0(f52.c, gj1Var2);
                    kj1 kj1Var2 = new kj1(16.0f, 16.0f, 16.0f, 16.0f);
                    he heVar2 = new he(12.0f, new ut(1));
                    boolean zF2 = ak0Var2.f(p82Var) | ak0Var2.h(o32Var) | ak0Var2.h(activity);
                    da1 da1Var2 = this.f;
                    boolean zF3 = zF2 | ak0Var2.f(da1Var2) | ak0Var2.h(s51Var) | ak0Var2.h(phVar);
                    Object objL2 = ak0Var2.L();
                    if (zF3 || objL2 == is1Var) {
                        objL2 = new g00(o32Var, p82Var, activity, s51Var, phVar, da1Var2, this.g);
                        ak0Var2.g0(objL2);
                    }
                    mx.e(u71VarB1, null, kj1Var2, heVar2, null, null, false, null, (ej0) objL2, ak0Var2, 24960, 490);
                } else {
                    ak0Var2.R();
                }
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ dn0(da1 da1Var, o32 o32Var, Activity activity, da1 da1Var2, s51 s51Var, ph phVar, da1 da1Var3) {
        this.h = da1Var;
        this.i = o32Var;
        this.j = activity;
        this.f = da1Var2;
        this.k = s51Var;
        this.l = phVar;
        this.g = da1Var3;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase_Impl;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w8(tc0 tc0Var, l72 l72Var) {
        this.e = 9;
        this.f = tc0Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        boolean z = true;
        z = true;
        char c = 0;
        ll2 ll2Var = ll2.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                vv.B((x8) obj);
                return ll2Var;
            case 1:
                return ((nc2) obj).o0();
            case 2:
                return ((sk) ((rk) obj)).c;
            case 3:
                return new v(true ? 1 : 0, (Object[]) obj);
            case 4:
                return (yr1) obj;
            case 5:
                return ((dq0) obj).d(":memory:");
            case 6:
                return ((f11) obj).d();
            case 7:
                return new de2((di1) obj, 0.0f);
            case 8:
                ((ad2) obj).close();
                return ll2Var;
            case 9:
                ((tc0) obj).a();
                return Boolean.TRUE;
            case 10:
                ai0 ai0Var = (ai0) obj;
                Context context = ai0Var.e;
                String str = ai0Var.f;
                ao2 ao2Var = new ao2(20, c);
                ao2Var.f = null;
                zh0 zh0Var = new zh0(context, str, ao2Var, ai0Var.g);
                zh0Var.setWriteAheadLoggingEnabled(ai0Var.i);
                return zh0Var;
            case 11:
                s82 s82Var = ((rm0) obj).b;
                s82Var.getClass();
                s82Var.j(null, 0L);
                return ll2Var;
            case 12:
                Object systemService = ((View) ((dq0) obj).f).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                MyGarageDatabase_Impl myGarageDatabase_Impl = ((gt0) obj).a;
                if (myGarageDatabase_Impl.i() && !myGarageDatabase_Impl.k()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                return new BaseInputConnection(((g11) obj).a, false);
            case 15:
                Object objG = ((zk) obj).g();
                return (j81) (objG instanceof vo ? null : objG);
            case 16:
                mb1 mb1Var = ((kb1) obj).l;
                if (!mb1Var.i) {
                    fu1.h("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (mb1Var.j.h == r11.e) {
                    fu1.h("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                kb1 kb1Var = mb1Var.a;
                yn2 yn2Var = (yn2) mb1Var.m.getValue();
                lz lzVarJ = v12.j(kb1Var);
                yn2Var.getClass();
                lzVarJ.getClass();
                e4 e4Var = new e4(kb1Var.g(), yn2Var, lzVarJ);
                aq aqVarA = js1.a(lb1.class);
                String strB = aqVarA.b();
                if (strB != null) {
                    return ((lb1) e4Var.j(aqVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                }
                qj.r("Local and anonymous classes can not be ViewModels");
                return null;
            case 17:
                return new xb1((String) obj);
            case 18:
                return ix.r((Context) obj);
            case 19:
                return new gg1((ig1) obj);
            case 20:
                return new w60(rw.D(24.0f, 16.0f, ((ud2) obj).a()));
            case 21:
                pk1 pk1Var = (pk1) obj;
                return pk1Var.e.d(pk1Var.f);
            case 22:
                fo1 fo1Var = (fo1) obj;
                return new kx(v12.d("kotlinx.serialization.Polymorphic", eo1.b, new s12[0], new m(27, fo1Var)), fo1Var.a);
            case 23:
                float fFloatValue = ((Number) ((ti0) obj).a()).floatValue();
                float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 24:
                dw1 dw1Var = (dw1) obj;
                ww1 ww1Var = dw1Var.e;
                Object obj2 = dw1Var.h;
                if (obj2 != null) {
                    return ww1Var.f(dw1Var, obj2);
                }
                qj.r("Value should be initialized");
                return null;
            case 25:
                ru1 ru1Var = ((jw1) obj).g;
                if (ru1Var == null) {
                    return null;
                }
                Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                ru1Var.n(bundleW);
                if (bundleW.isEmpty()) {
                    return null;
                }
                return bundleW;
            case 26:
                return sv0.e0((co2) obj);
            case 27:
                tw1 tw1Var = (tw1) obj;
                tw1Var.h().a(new xr1(c, tw1Var));
                return ll2Var;
            case 28:
                by1 by1Var = (by1) obj;
                w6 w6Var = (w6) ir2.j(by1Var, yi1.a);
                by1Var.D = w6Var;
                by1Var.E = w6Var != null ? new v6(w6Var.a, w6Var.b, w6Var.c, w6Var.d) : null;
                return ll2Var;
            default:
                fz1 fz1Var = (fz1) obj;
                ki2 ki2Var = fz1Var.e;
                fz1Var.f = ki2Var != null ? ((Number) ki2Var.l.getValue()).longValue() : 0L;
                return ll2Var;
        }
    }

    public /* synthetic */ w8(rk rkVar, long j) {
        this.e = 2;
        this.f = rkVar;
    }

    public /* synthetic */ w8(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}

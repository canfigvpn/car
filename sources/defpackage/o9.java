package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 extends wa2 implements ej0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(int i, sx sxVar, Object obj, Object obj2) {
        super(1, sxVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        sx sxVar = (sx) obj;
        switch (i) {
            case 0:
                return new o9(0, sxVar, (p9) obj3, (nc2) obj2).r(ll2Var);
            case 1:
                return new o9(1, sxVar, (xh) obj3, (wh) obj2).r(ll2Var);
            default:
                return new o9(2, sxVar, (bv1) obj3, (ej0) obj2).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        l9 l9Var;
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.l;
        fz fzVar = fz.e;
        Object obj3 = this.k;
        sx sxVar = null;
        switch (i) {
            case 0:
                p9 p9Var = (p9) obj3;
                k72 k72Var = p9Var.e;
                View view = p9Var.a;
                int i2 = this.j;
                int i3 = 3;
                try {
                    if (i2 == 0) {
                        ix.Q(obj);
                        m9 m9Var = new m9();
                        nc2 nc2Var = (nc2) obj2;
                        int i4 = 0;
                        l9 l9Var2 = new l9(m9Var, new j9(p9Var, nc2Var, 0), new j9(p9Var, nc2Var, 1), view);
                        ej0 ej0Var = p9Var.b;
                        if (ej0Var != null && (l9Var = (l9) ej0Var.h(l9Var2)) != null) {
                            l9Var2 = l9Var;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            n9 n9Var = p9Var.i;
                            if (n9Var == null) {
                                n9Var = new n9(p9Var, l9Var2, m9Var, i4);
                                p9Var.i = n9Var;
                            }
                            view.post(n9Var);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new oe0(l9Var2), 1);
                            if (actionModeStartActionMode == null) {
                                return ll2Var;
                            }
                            p9Var.h = actionModeStartActionMode;
                        }
                        this.j = 1;
                        Object objL = m9Var.a.l(this);
                        if (objL != fzVar) {
                            objL = ll2Var;
                        }
                        if (objL == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i2 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    k72Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable pVar = p9Var.j;
                        if (pVar == null) {
                            pVar = new p(i3, p9Var);
                            p9Var.j = pVar;
                        }
                        view.post(pVar);
                    } else {
                        ActionMode actionMode = p9Var.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    n9 n9Var2 = p9Var.i;
                    if (n9Var2 != null) {
                        view.removeCallbacks(n9Var2);
                    }
                    p9Var.h = null;
                    return ll2Var;
                } catch (Throwable th) {
                    k72Var.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable pVar2 = p9Var.j;
                        if (pVar2 == null) {
                            pVar2 = new p(i3, p9Var);
                            p9Var.j = pVar2;
                        }
                        view.post(pVar2);
                    } else {
                        ActionMode actionMode2 = p9Var.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    n9 n9Var3 = p9Var.i;
                    if (n9Var3 != null) {
                        view.removeCallbacks(n9Var3);
                    }
                    p9Var.h = null;
                    throw th;
                }
            case 1:
                wh whVar = (wh) obj2;
                dk1 dk1Var = ((xh) obj3).c;
                int i5 = this.j;
                try {
                    if (i5 == 0) {
                        ix.Q(obj);
                        dk1Var.setValue(whVar);
                        this.j = 1;
                        Object objL2 = whVar.b.l(this);
                        if (objL2 != fzVar) {
                            objL2 = ll2Var;
                        }
                        if (objL2 == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i5 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    dk1Var.setValue(null);
                    return ll2Var;
                } catch (Throwable th2) {
                    dk1Var.setValue(null);
                    throw th2;
                }
            default:
                bv1 bv1Var = (bv1) obj3;
                int i6 = this.j;
                try {
                    if (i6 == 0) {
                        ix.Q(obj);
                        bv1Var.a();
                        bv1Var.a();
                        vh0 vh0VarZ = bv1Var.f().z();
                        if (!vh0VarZ.l()) {
                            ln lnVar = new ln(5, sxVar, bv1Var.e());
                            Thread.interrupted();
                            dv1.J(ab0.e, new qz(2, sxVar, lnVar));
                        }
                        if (vh0VarZ.e.isWriteAheadLoggingEnabled()) {
                            vh0VarZ.d();
                        } else {
                            vh0VarZ.b();
                        }
                        this.j = 1;
                        obj = ((ej0) obj2).h(this);
                        if (obj == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i6 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    bv1Var.f().z().n();
                    bv1Var.f().z().h();
                    if (!bv1Var.j()) {
                        gt0 gt0VarE = bv1Var.e();
                        gt0VarE.b.c(gt0VarE.e, gt0VarE.f);
                    }
                    return obj;
                } catch (Throwable th3) {
                    bv1Var.f().z().h();
                    if (!bv1Var.j()) {
                        gt0 gt0VarE2 = bv1Var.e();
                        gt0VarE2.b.c(gt0VarE2.e, gt0VarE2.f);
                    }
                    throw th3;
                }
        }
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends t71 implements bk, m02, vv0, sw0, si2 {
    public final y3 s = new y3(2, this);
    public final /* synthetic */ e5 t;

    public r4(e5 e5Var) {
        this.t = e5Var;
    }

    @Override // defpackage.vv0
    public final boolean R(KeyEvent keyEvent) {
        lf0 lf0Var;
        int[] iArr = pf0.a;
        long jD0 = sv0.d0(keyEvent);
        Integer num = null;
        if (pv0.a(jD0, pv0.b)) {
            lf0Var = new lf0(2);
        } else if (pv0.a(jD0, pv0.c)) {
            lf0Var = new lf0(1);
        } else if (pv0.a(jD0, pv0.p)) {
            lf0Var = new lf0(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (pv0.a(jD0, pv0.g)) {
            lf0Var = new lf0(4);
        } else if (pv0.a(jD0, pv0.f)) {
            lf0Var = new lf0(3);
        } else if (pv0.a(jD0, pv0.d) || pv0.a(jD0, pv0.C)) {
            lf0Var = new lf0(5);
        } else if (pv0.a(jD0, pv0.e) || pv0.a(jD0, pv0.D)) {
            lf0Var = new lf0(6);
        } else if (pv0.a(jD0, pv0.h) || pv0.a(jD0, pv0.r) || pv0.a(jD0, pv0.E)) {
            lf0Var = new lf0(7);
        } else {
            lf0Var = (pv0.a(jD0, pv0.a) || pv0.a(jD0, pv0.u)) ? new lf0(8) : null;
        }
        if (lf0Var != null) {
            int i = lf0Var.a;
            if (sv0.g0(keyEvent) == 2) {
                e5 e5Var = this.t;
                ((vf0) e5Var.getFocusOwner()).getClass();
                Boolean boolE = ((vf0) e5Var.getFocusOwner()).e(i, e5Var.getEmbeddedViewFocusRect(), new y3(1, lf0Var));
                if (boolE != null ? boolE.booleanValue() : true) {
                    return true;
                }
                if (i == 1 || i == 2) {
                    if (i == 5) {
                        num = 33;
                    } else if (i == 6) {
                        num = 130;
                    } else if (i == 3) {
                        num = 17;
                    } else if (i == 4) {
                        num = 66;
                    } else if (i == 1) {
                        num = 2;
                    } else if (i == 2) {
                        num = 1;
                    }
                    int iIntValue = num != null ? num.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = e5Var.getRootView();
                    rootView.getClass();
                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, e5Var.getView(), iIntValue);
                    if (viewFindNextFocus == null || viewFindNextFocus.equals(e5Var)) {
                        return ((vf0) e5Var.getFocusOwner()).h(i);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bk
    public final Object a0(me1 me1Var, v4 v4Var, tx txVar) {
        long jR = me1Var.R(0L);
        yr1 yr1Var = (yr1) v4Var.a();
        yr1 yr1VarI = yr1Var != null ? yr1Var.i(jR) : null;
        if (yr1VarI != null) {
            this.t.requestRectangleOnScreen(new Rect((int) yr1VarI.a, (int) yr1VarI.b, (int) yr1VarI.c, (int) yr1VarI.d), false);
        }
        return ll2.a;
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        jm1 jm1VarE = r61Var.e(j);
        return y61Var.N(jm1VarE.e, jm1VarE.f, db0.e, this.s, new q4(jm1VarE, 0));
    }

    @Override // defpackage.vv0
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.si2
    public final Object p() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
    }
}

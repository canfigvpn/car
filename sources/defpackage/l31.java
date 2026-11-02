package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l31 {
    public static final a90 a = new a90(0, new vr0(11));

    public static jg1 a(ak0 ak0Var) {
        jg1 jg1Var = (jg1) ak0Var.j(a);
        Object obj = null;
        if (jg1Var == null) {
            ak0Var.W(1208426157);
            View view = (View) ak0Var.j(u5.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    jg1Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                jg1 jg1Var2 = tag instanceof jg1 ? (jg1) tag : null;
                if (jg1Var2 != null) {
                    jg1Var = jg1Var2;
                    break;
                }
                Object objL = y12.l(view);
                view = objL instanceof View ? (View) objL : null;
            }
        } else {
            ak0Var.W(1208423708);
        }
        ak0Var.p(false);
        if (jg1Var != null) {
            ak0Var.W(1208423789);
            ak0Var.p(false);
            return jg1Var;
        }
        ak0Var.W(1208428160);
        for (Context baseContext = (Context) ak0Var.j(u5.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof jg1) {
                obj = baseContext;
                break;
            }
        }
        jg1 jg1Var3 = (jg1) obj;
        ak0Var.p(false);
        return jg1Var3;
    }
}

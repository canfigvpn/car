package defpackage;

import android.view.View;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k31 {
    public static final a90 a = new a90(0, new vr0(10));

    public static id1 a(ak0 ak0Var) {
        id1 id1Var;
        id1 id1Var2 = (id1) ak0Var.j(a);
        if (id1Var2 != null) {
            ak0Var.W(950834231);
            ak0Var.p(false);
            return id1Var2;
        }
        ak0Var.W(950836184);
        View view = (View) ak0Var.j(u5.f);
        view.getClass();
        while (true) {
            id1Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            id1 id1Var3 = tag instanceof id1 ? (id1) tag : null;
            if (id1Var3 != null) {
                id1Var = id1Var3;
                break;
            }
            Object objL = y12.l(view);
            view = objL instanceof View ? (View) objL : null;
        }
        ak0Var.p(false);
        return id1Var;
    }
}

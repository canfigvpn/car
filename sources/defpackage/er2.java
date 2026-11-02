package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class er2 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    public static final cr2 a(r rVar, av avVar, gt gtVar) {
        e5 e5Var;
        cr2 cr2Var;
        byte b = 0;
        if (uk0.a.compareAndSet(false, true)) {
            zk zkVarD = s5.d(1, 6, null);
            nj2.y(qx.b((uy) y9.q.getValue()), null, new g(12, b == true ? 1 : 0, zkVarD), 3);
            y3 y3Var = new y3(11, zkVarD);
            synchronized (x62.c) {
                x62.i = vq.Z(x62.i, y3Var);
            }
            x62.c();
        }
        if (rVar.getChildCount() > 0) {
            View childAt = rVar.getChildAt(0);
            e5Var = childAt instanceof e5 ? (e5) childAt : null;
            if (e5Var != null) {
                e5Var.setComposeViewContext(avVar);
            }
            if (e5Var == null) {
                e5Var = new e5(rVar.getContext(), avVar);
                rVar.addView(e5Var.getView(), a);
            }
            e5Var.setComposeViewContext(avVar);
            if (rVar.getComposeViewContext$ui() != null) {
                avVar.c();
                e5Var.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = e5Var.getTag(R.id.wrapped_composition_tag);
            cr2Var = tag instanceof cr2 ? (cr2) tag : null;
            if (cr2Var == null) {
                cr2Var = new cr2(e5Var, new qv(avVar.b, new gl2(e5Var.getRoot())));
                e5Var.setTag(R.id.wrapped_composition_tag, cr2Var);
            }
            cr2Var.c(gtVar);
            e5Var.setFrameEndScheduler$ui(new dr2(avVar.b));
            return cr2Var;
        }
        rVar.removeAllViews();
        e5Var = null;
        if (e5Var == null) {
            e5Var = new e5(rVar.getContext(), avVar);
            rVar.addView(e5Var.getView(), a);
        }
        e5Var.setComposeViewContext(avVar);
        if (rVar.getComposeViewContext$ui() != null) {
            avVar.c();
            e5Var.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = e5Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof cr2) {
        }
        if (cr2Var == null) {
            cr2Var = new cr2(e5Var, new qv(avVar.b, new gl2(e5Var.getRoot())));
            e5Var.setTag(R.id.wrapped_composition_tag, cr2Var);
        }
        cr2Var.c(gtVar);
        e5Var.setFrameEndScheduler$ui(new dr2(avVar.b));
        return cr2Var;
    }
}

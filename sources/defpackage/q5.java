package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 {
    public static final q5 a = new q5();

    public final void a(View view, un1 un1Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = un1Var instanceof k8 ? PointerIcon.getSystemIcon(context, ((k8) un1Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (ws0.j(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}

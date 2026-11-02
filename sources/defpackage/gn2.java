package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn2 {
    public static aq2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        aq2 aq2VarC = aq2.c(rootWindowInsets, null);
        xp2 xp2Var = aq2VarC.a;
        xp2Var.w(aq2VarC);
        View rootView = view.getRootView();
        xp2Var.d(rootView);
        xp2Var.o(rootView);
        xp2Var.p();
        return aq2VarC;
    }
}

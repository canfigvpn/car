package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss implements w11 {
    public final /* synthetic */ ig1 e;
    public final /* synthetic */ bt f;

    public /* synthetic */ ss(ig1 ig1Var, bt btVar) {
        this.e = ig1Var;
        this.f = btVar;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) {
        if (q11Var == q11.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.f.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.e.b(onBackInvokedDispatcher);
        }
    }
}

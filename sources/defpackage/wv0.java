package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends t71 implements vv0 {
    public ej0 s;
    public ej0 t;

    @Override // defpackage.vv0
    public final boolean R(KeyEvent keyEvent) {
        ej0 ej0Var = this.s;
        if (ej0Var != null) {
            return ((Boolean) ej0Var.h(new rv0(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.vv0
    public final boolean k(KeyEvent keyEvent) {
        ej0 ej0Var = this.t;
        if (ej0Var != null) {
            return ((Boolean) ej0Var.h(new rv0(keyEvent))).booleanValue();
        }
        return false;
    }
}

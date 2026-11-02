package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p9 implements wc2 {
    public final View a;
    public final ej0 b;
    public final ti0 c;
    public final pa1 d = new pa1();
    public final k72 e = new k72(new i9(this, 0));
    public final i9 f = new i9(this, 1);
    public final i9 g = new i9(this, 2);
    public ActionMode h;
    public n9 i;
    public Runnable j;

    public p9(View view, ej0 ej0Var, ti0 ti0Var) {
        this.a = view;
        this.b = ej0Var;
        this.c = ti0Var;
    }

    @Override // defpackage.wc2
    public final Object a(nc2 nc2Var, wa2 wa2Var) {
        o9 o9Var = new o9(0, null, this, nc2Var);
        pa1 pa1Var = this.d;
        pa1Var.getClass();
        Object objW = qx.w(new na1(ia1.e, pa1Var, o9Var, null), wa2Var);
        return objW == fz.e ? objW : ll2.a;
    }
}

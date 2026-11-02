package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i9 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p9 f;

    public /* synthetic */ i9(p9 p9Var, int i) {
        this.e = i;
        this.f = p9Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        p9 p9Var = this.f;
        switch (i) {
            case 0:
                ti0 ti0Var = (ti0) obj;
                View view = p9Var.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ti0Var.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new o4(2, ti0Var));
                    }
                }
                return ll2Var;
            case 1:
                ActionMode actionMode = p9Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return ll2Var;
            case 2:
                ActionMode actionMode2 = p9Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return ll2Var;
            default:
                p9Var.e.d();
                return new r2(3, p9Var);
        }
    }
}

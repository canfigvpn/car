package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(e5 e5Var, int i) {
        super(1);
        this.f = i;
        this.g = e5Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        e5 e5Var = this.g;
        switch (i) {
            case 0:
                ((vf0) e5Var.getFocusOwner()).g(((lf0) obj).a, false);
                return ll2Var;
            case 1:
                ti0 ti0Var = (ti0) obj;
                e5Var.getUncaughtExceptionHandler$ui();
                Handler handler = e5Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ti0Var.a();
                } else {
                    Handler handler2 = e5Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new o4(1, ti0Var));
                    }
                }
                return ll2Var;
            default:
                return new j8(e5Var, e5Var.getTextInputService(), (ez) obj);
        }
    }
}

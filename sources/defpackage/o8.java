package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o8 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ uo1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8(uo1 uo1Var, int i) {
        super(1);
        this.f = i;
        this.g = uo1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        uo1 uo1Var = this.g;
        switch (i) {
            case 0:
                jw0 jw0VarK = ((jw0) obj).k();
                jw0VarK.getClass();
                uo1Var.q(jw0VarK);
                break;
            case 1:
                qr0 qr0Var = (qr0) obj;
                long j = qr0Var.a;
                uo1Var.m12setPopupContentSizefhxjrPA(qr0Var);
                uo1Var.r();
                break;
            default:
                ti0 ti0Var = (ti0) obj;
                Handler handler = uo1Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = uo1Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new o4(3, ti0Var));
                    }
                } else {
                    ti0Var.a();
                }
                break;
        }
        return ll2Var;
    }
}

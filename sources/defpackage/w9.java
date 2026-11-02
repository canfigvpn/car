package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ w9(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    y9 y9Var = new y9(choreographer, ei1.m(looperMyLooper));
                    return ex.F(y9Var, y9Var.p);
                }
                fu1.h("no Looper on this thread");
                return null;
            default:
                return new Random();
        }
    }
}

package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gt1 implements Runnable {
    public final /* synthetic */ int e = 0;
    public Object f;
    public Object g;
    public Object h;

    public gt1(om omVar, bv1 bv1Var, cv1 cv1Var) {
        this.f = omVar;
        this.g = bv1Var;
        this.h = cv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.e) {
            case 0:
                try {
                    objCall = ((wg0) this.f).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.h).post(new hm(3, (xg0) this.g, objCall));
                break;
            default:
                om omVar = (om) this.f;
                try {
                    dv1.J(omVar.i.u(q90.A), new n7((bv1) this.g, omVar, (cv1) this.h, (sx) null, 11));
                } catch (Throwable th) {
                    omVar.o(th);
                }
                break;
        }
    }

    public /* synthetic */ gt1() {
    }
}

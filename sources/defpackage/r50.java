package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r50 extends dc2 {
    public int g;

    public r50(int i) {
        super(0L, false);
        this.g = i;
    }

    public abstract sx c();

    public Throwable d(Object obj) {
        os osVar = obj instanceof os ? (os) obj : null;
        if (osVar != null) {
            return osVar.a;
        }
        return null;
    }

    public final void h(Throwable th) throws IllegalAccessException, InvocationTargetException {
        mx.B(c().f(), new iz("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        try {
            sx sxVarC = c();
            sxVarC.getClass();
            p50 p50Var = (p50) sxVarC;
            tx txVar = p50Var.i;
            Object obj = p50Var.k;
            uy uyVarF = txVar.f();
            Object objS0 = p61.s0(uyVarF, obj);
            ot0 ot0Var = null;
            il2 il2VarT = objS0 != p61.j0 ? ix.T(txVar, uyVarF, objS0) : null;
            try {
                uy uyVarF2 = txVar.f();
                Object objJ = j();
                Throwable thD = d(objJ);
                if (thD == null) {
                    int i = this.g;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        ot0Var = (ot0) uyVarF2.p(q90.P);
                    }
                }
                if (ot0Var != null && !ot0Var.b()) {
                    CancellationException cancellationExceptionR = ot0Var.r();
                    b(cancellationExceptionR);
                    txVar.i(ix.q(cancellationExceptionR));
                } else if (thD != null) {
                    txVar.i(new ut1(thD));
                } else {
                    txVar.i(g(objJ));
                }
            } finally {
                if (il2VarT == null || il2VarT.k0()) {
                    p61.h0(uyVarF, objS0);
                }
            }
        } catch (Throwable th) {
            h(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}

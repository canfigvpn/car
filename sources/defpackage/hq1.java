package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hq1 extends s implements lo, k12 {
    public final zk h;

    public hq1(uy uyVar, zk zkVar) {
        super(uyVar, true);
        this.h = zkVar;
    }

    @Override // defpackage.vt0
    public final void D(CancellationException cancellationException) {
        this.h.e(cancellationException, true);
        C(cancellationException);
    }

    @Override // defpackage.k12
    public final Object a(sx sxVar, Object obj) {
        return this.h.a(sxVar, obj);
    }

    @Override // defpackage.k12
    public final Object c(Object obj) {
        return this.h.c(obj);
    }

    @Override // defpackage.vt0, defpackage.ot0, defpackage.lo
    public final void d(CancellationException cancellationException) {
        Object objO = O();
        if (objO instanceof os) {
            return;
        }
        if ((objO instanceof ut0) && ((ut0) objO).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new pt0(F(), null, this);
        }
        D(cancellationException);
    }

    @Override // defpackage.lo
    public final Object g() {
        return this.h.g();
    }

    @Override // defpackage.s
    public final void h0(Throwable th, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (this.h.e(th, false) || z) {
            return;
        }
        mx.B(this.g, th);
    }

    @Override // defpackage.s
    public final void i0(Object obj) {
        j12.g(this.h);
    }

    @Override // defpackage.lo
    public final wk iterator() {
        zk zkVar = this.h;
        zkVar.getClass();
        return new wk(zkVar);
    }

    @Override // defpackage.lo
    public final Object l(sx sxVar) {
        return this.h.l(sxVar);
    }

    @Override // defpackage.lo
    public final Object w(bs bsVar) {
        zk zkVar = this.h;
        zkVar.getClass();
        return zk.D(zkVar, bsVar);
    }
}

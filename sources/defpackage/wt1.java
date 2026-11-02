package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends rt0 {
    public final st0 i;

    public wt1(st0 st0Var) {
        this.i = st0Var;
    }

    @Override // defpackage.rt0
    public final boolean m() {
        return false;
    }

    @Override // defpackage.rt0
    public final void n(Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objO = l().O();
        boolean z = objO instanceof os;
        st0 st0Var = this.i;
        if (z) {
            st0Var.i(ix.q(((os) objO).a));
        } else {
            st0Var.i(nj2.H(objO));
        }
    }
}

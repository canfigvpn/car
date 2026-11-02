package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u01 extends j82 {
    public final sx h;

    public u01(uy uyVar, ij0 ij0Var) {
        super(uyVar, false);
        this.h = ex.m(this, this, ij0Var);
    }

    @Override // defpackage.vt0
    public final void a0() throws IllegalAccessException, InvocationTargetException {
        try {
            ws0.O(ex.y(this.h), ll2.a);
        } catch (Throwable th) {
            i(new ut1(th));
            throw th;
        }
    }
}

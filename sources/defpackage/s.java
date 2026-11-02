package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends vt0 implements sx, ez {
    public final uy g;

    public s(uy uyVar, boolean z) {
        super(z);
        R((ot0) uyVar.p(q90.P));
        this.g = uyVar.k(this);
    }

    @Override // defpackage.vt0
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.vt0
    public final void Q(ps psVar) throws IllegalAccessException, InvocationTargetException {
        mx.B(this.g, psVar);
    }

    @Override // defpackage.vt0
    public final void Z(Object obj) {
        if (!(obj instanceof os)) {
            i0(obj);
        } else {
            os osVar = (os) obj;
            h0(osVar.a, we.a.getIntVolatile(osVar, os.b) != 0);
        }
    }

    @Override // defpackage.sx
    public final uy f() {
        return this.g;
    }

    @Override // defpackage.ez
    public final uy h() {
        return this.g;
    }

    @Override // defpackage.sx
    public final void i(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = vt1.a(obj);
        if (thA != null) {
            obj = new os(thA, false);
        }
        Object objV = V(obj);
        if (objV == nj2.o0) {
            return;
        }
        z(objV);
    }

    public final void j0(hz hzVar, s sVar, ij0 ij0Var) throws IllegalAccessException, InvocationTargetException {
        Object objG;
        int iOrdinal = hzVar.ordinal();
        ll2 ll2Var = ll2.a;
        if (iOrdinal == 0) {
            try {
                ws0.O(ex.y(ex.m(sVar, this, ij0Var)), ll2Var);
                return;
            } catch (Throwable th) {
                i(new ut1(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ij0Var.getClass();
                ex.y(ex.m(sVar, this, ij0Var)).i(ll2Var);
                return;
            }
            if (iOrdinal != 3) {
                qj.p();
                return;
            }
            try {
                uy uyVar = this.g;
                Object objS0 = p61.s0(uyVar, null);
                try {
                    if (ij0Var instanceof sh) {
                        nj2.i(2, ij0Var);
                        objG = ij0Var.g(sVar, this);
                    } else {
                        objG = ex.T(ij0Var, sVar, this);
                    }
                    p61.h0(uyVar, objS0);
                    if (objG != fz.e) {
                        i(objG);
                    }
                } catch (Throwable th2) {
                    p61.h0(uyVar, objS0);
                    throw th2;
                }
            } catch (Throwable th3) {
                i(new ut1(th3));
            }
        }
    }

    public void i0(Object obj) {
    }

    public void h0(Throwable th, boolean z) {
    }
}

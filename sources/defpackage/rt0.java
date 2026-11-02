package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rt0 extends u31 implements e60, so0 {
    public vt0 h;

    @Override // defpackage.e60
    public final void a() {
        rt0 rt0Var;
        Unsafe unsafe;
        long j;
        vt0 vt0VarL = l();
        while (true) {
            Object objO = vt0VarL.O();
            if (objO instanceof rt0) {
                if (objO != this) {
                    return;
                }
                xa0 xa0Var = nj2.t0;
                do {
                    unsafe = we.a;
                    j = vt0.f;
                    if (unsafe.compareAndSwapObject(vt0VarL, j, objO, xa0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(vt0VarL, j) == objO);
            } else {
                if (!(objO instanceof so0) || ((so0) objO).d() == null) {
                    return;
                }
                while (true) {
                    Object objH = this.h();
                    if (objH instanceof ws1) {
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    objH.getClass();
                    u31 u31Var = (u31) objH;
                    Unsafe unsafe2 = we.a;
                    long j2 = u31.g;
                    ws1 ws1Var = (ws1) unsafe2.getObjectVolatile(u31Var, j2);
                    if (ws1Var == null) {
                        ws1Var = new ws1(u31Var);
                        unsafe2.putObjectVolatile(u31Var, j2, ws1Var);
                    }
                    ws1 ws1Var2 = ws1Var;
                    while (true) {
                        Unsafe unsafe3 = we.a;
                        long j3 = u31.e;
                        rt0Var = this;
                        if (unsafe3.compareAndSwapObject(rt0Var, j3, objH, ws1Var2)) {
                            u31Var.f();
                            return;
                        } else if (unsafe3.getObjectVolatile(rt0Var, j3) != objH) {
                            break;
                        } else {
                            this = rt0Var;
                        }
                    }
                    this = rt0Var;
                }
            }
        }
    }

    @Override // defpackage.so0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.so0
    public final oe1 d() {
        return null;
    }

    public ot0 getParent() {
        return l();
    }

    public final vt0 l() {
        vt0 vt0Var = this.h;
        if (vt0Var != null) {
            return vt0Var;
        }
        ws0.U("job");
        throw null;
    }

    public abstract boolean m();

    public abstract void n(Throwable th);

    @Override // defpackage.u31
    public final String toString() {
        return getClass().getSimpleName() + '@' + j20.s(this) + "[job@" + j20.s(l()) + ']';
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vn0 extends t71 implements si2, zn1, rv {
    public a70 s;
    public k8 t;
    public boolean u;

    public vn0(k8 k8Var, a70 a70Var) {
        this.s = a70Var;
        this.t = k8Var;
    }

    public final void F0() {
        k8 k8Var;
        gs1 gs1Var = new gs1();
        p12.n(this, new je1(gs1Var));
        vn0 vn0Var = (vn0) gs1Var.e;
        if (vn0Var == null || (k8Var = vn0Var.t) == null) {
            k8Var = this.t;
        }
        G0(k8Var);
    }

    @Override // defpackage.zn1
    public final void G(pn1 pn1Var, qn1 qn1Var, long j) {
        if (qn1Var == qn1.f) {
            List list = pn1Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (I0(((wn1) list.get(i)).i)) {
                    int i2 = pn1Var.f;
                    if (i2 == 4) {
                        this.u = true;
                        H0();
                        return;
                    } else {
                        if (i2 == 5) {
                            J0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public abstract void G0(un1 un1Var);

    public final void H0() {
        cs1 cs1Var = new cs1();
        cs1Var.e = true;
        p12.p(this, new c70(cs1Var));
        if (cs1Var.e) {
            F0();
        }
    }

    public abstract boolean I0(int i);

    public final void J0() {
        if (this.u) {
            this.u = false;
            if (this.r) {
                gs1 gs1Var = new gs1();
                p12.n(this, new w4(gs1Var, 1));
                vn0 vn0Var = (vn0) gs1Var.e;
                if (vn0Var != null) {
                    vn0Var.F0();
                } else {
                    G0(null);
                }
            }
        }
    }

    @Override // defpackage.zn1
    public final void f0() {
        J0();
    }

    @Override // defpackage.zn1
    public final long q() {
        if (this.s == null) {
            return rh2.a;
        }
        m40 m40Var = qx.V(this).B;
        int i = rh2.b;
        return n02.o(m40Var.O(10.0f), m40Var.O(40.0f), m40Var.O(10.0f), m40Var.O(40.0f));
    }

    @Override // defpackage.t71
    public final void y0() {
        J0();
    }
}

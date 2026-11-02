package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 extends sv0 {
    public final ru1 n0;
    public int o0;
    public String p0;
    public final iq1 q0;

    public nv1(kw1 kw1Var, LinkedHashMap linkedHashMap) {
        kw1Var.getClass();
        this.o0 = -1;
        this.p0 = "";
        this.q0 = vs0.D;
        this.n0 = new ru1(kw1Var, linkedHashMap);
    }

    @Override // defpackage.sv0
    public final Object X() {
        return n0();
    }

    @Override // defpackage.sv0, defpackage.n20
    public final boolean d() {
        return this.n0.i(this.p0) != null;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final Object f(mv0 mv0Var) {
        mv0Var.getClass();
        return n0();
    }

    @Override // defpackage.jv
    public final int h(s12 s12Var) {
        String strE;
        kw1 kw1Var;
        s12Var.getClass();
        int i = this.o0;
        do {
            i++;
            if (i >= s12Var.d()) {
                return -1;
            }
            strE = s12Var.e(i);
            strE.getClass();
            kw1Var = (kw1) this.n0.c;
            kw1Var.getClass();
        } while (!((LinkedHashMap) kw1Var.b.e).containsKey(strE));
        this.o0 = i;
        this.p0 = strE;
        return i;
    }

    public final Object n0() {
        Object objI = this.n0.i(this.p0);
        if (objI != null) {
            return objI;
        }
        qj.u(this.p0, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // defpackage.jv
    public final iq1 q() {
        return this.q0;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final n20 t(s12 s12Var) {
        s12Var.getClass();
        if (sv.O(s12Var)) {
            this.p0 = s12Var.e(0);
            this.o0 = 0;
        }
        return this;
    }
}

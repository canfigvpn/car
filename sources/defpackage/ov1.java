package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 extends p61 {
    public final mv0 o0;
    public final LinkedHashMap p0;
    public final iq1 q0 = vs0.D;
    public final LinkedHashMap r0 = new LinkedHashMap();
    public int s0 = -1;

    public ov1(mv0 mv0Var, LinkedHashMap linkedHashMap) {
        this.o0 = mv0Var;
        this.p0 = linkedHashMap;
    }

    @Override // defpackage.p61
    public final void C(s12 s12Var, int i) {
        s12Var.getClass();
        this.s0 = i;
    }

    @Override // defpackage.p61
    public final p61 F(s12 s12Var) {
        s12Var.getClass();
        if (sv.O(s12Var)) {
            this.s0 = 0;
        }
        return this;
    }

    @Override // defpackage.p61
    public final void L() {
        t0(null);
    }

    @Override // defpackage.p61
    public final void O(mv0 mv0Var, Object obj) {
        mv0Var.getClass();
        t0(obj);
    }

    @Override // defpackage.p61
    public final void S(Object obj) {
        t0(obj);
    }

    @Override // defpackage.p61
    public final iq1 Z() {
        return this.q0;
    }

    public final void t0(Object obj) {
        String strE = this.o0.c().e(this.s0);
        xc1 xc1Var = (xc1) this.p0.get(strE);
        if (xc1Var == null) {
            throw new IllegalStateException(k3.j("Cannot find NavType for argument ", strE, ". Please provide NavType through typeMap.").toString());
        }
        this.r0.put(strE, xc1Var instanceof uq ? ((uq) xc1Var).h(obj) : vs0.u(xc1Var.f(obj)));
    }
}

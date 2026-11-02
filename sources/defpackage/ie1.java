package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 implements ke1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.ke1
    public final boolean a(t71 t71Var) {
        ?? fa1Var = 0;
        while (true) {
            int i = 0;
            if (t71Var == 0) {
                return false;
            }
            if (t71Var instanceof zn1) {
                if (((zn1) t71Var).m0()) {
                    return true;
                }
            } else if ((t71Var.g & 16) != 0 && (t71Var instanceof c40)) {
                t71 t71Var2 = ((c40) t71Var).t;
                while (t71Var2 != null) {
                    if ((t71Var2.g & 16) != 0) {
                        i++;
                        if (i == 1) {
                            fa1Var = fa1Var;
                            t71Var = t71Var;
                            fa1Var = fa1Var;
                            t71Var = t71Var2;
                        } else {
                            if (fa1Var == 0) {
                                fa1Var = new fa1(new t71[16]);
                            }
                            if (t71Var != 0) {
                                fa1Var.b(t71Var);
                                t71Var = 0;
                            }
                            fa1Var.b(t71Var2);
                        }
                    } else {
                        fa1Var = fa1Var;
                        t71Var = t71Var;
                    }
                    t71Var2 = t71Var2.j;
                    fa1Var = fa1Var;
                    t71Var = t71Var;
                }
                if (i == 1) {
                    fa1Var = fa1Var;
                    t71Var = t71Var;
                } else {
                    fa1Var = fa1Var;
                    t71Var = t71Var;
                }
            }
            t71Var = qx.P(fa1Var);
        }
    }

    @Override // defpackage.ke1
    public final int b() {
        return 16;
    }

    @Override // defpackage.ke1
    public final void d(ax0 ax0Var, long j, vm0 vm0Var, int i, boolean z) {
        ax0Var.A(j, vm0Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.ke1
    public final boolean e(vm0 vm0Var, ax0 ax0Var) {
        me1 me1Var = ax0Var.I.d;
        me1Var.getClass();
        t71 t71VarU0 = me1Var.U0(ne1.g(16));
        if (t71VarU0 != null && t71VarU0.r) {
            if (!t71VarU0.e.r) {
                vp0.b("visitLocalDescendants called on an unattached node");
            }
            t71 t71Var = t71VarU0.e;
            if ((t71Var.h & 16) != 0) {
                while (t71Var != null) {
                    if ((t71Var.g & 16) != 0) {
                        ?? P = t71Var;
                        ?? fa1Var = 0;
                        while (P != 0) {
                            if (P instanceof zn1) {
                                if (((zn1) P).X()) {
                                    vm0Var.g = vm0Var.e.b - 1;
                                    return true;
                                }
                            } else if ((P.g & 16) != 0 && (P instanceof c40)) {
                                t71 t71Var2 = ((c40) P).t;
                                int i = 0;
                                while (t71Var2 != null) {
                                    if ((t71Var2.g & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            P = P;
                                            fa1Var = fa1Var;
                                            fa1Var = fa1Var;
                                            P = t71Var2;
                                        } else {
                                            if (fa1Var == 0) {
                                                fa1Var = new fa1(new t71[16]);
                                            }
                                            if (P != 0) {
                                                fa1Var.b(P);
                                                P = 0;
                                            }
                                            fa1Var.b(t71Var2);
                                        }
                                    } else {
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    t71Var2 = t71Var2.j;
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                                if (i == 1) {
                                    P = P;
                                    fa1Var = fa1Var;
                                } else {
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                            }
                            P = qx.P(fa1Var);
                        }
                    }
                    t71Var = t71Var.j;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ke1
    public final boolean f(ax0 ax0Var) {
        return true;
    }
}

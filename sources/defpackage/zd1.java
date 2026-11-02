package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 extends t71 implements si2 {
    public final dv s;
    public final e4 t;
    public zd1 u;
    public final String v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public zd1(dv dvVar, e4 e4Var) {
        this.s = dvVar;
        this.t = e4Var;
    }

    public final ez F0() {
        zd1 zd1Var;
        si2 si2Var;
        he1 he1Var;
        if (this.r) {
            if (!this.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = this.e.i;
            ax0 ax0VarV = qx.V(this);
            loop0: while (true) {
                if (ax0VarV == null) {
                    si2Var = null;
                    break;
                }
                if ((ax0VarV.I.f.h & 262144) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 262144) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    si2Var = (si2) t71VarP;
                                    if (ws0.j(p(), si2Var.p()) && zd1.class == si2Var.getClass()) {
                                        break loop0;
                                    }
                                }
                                if ((t71VarP.g & 262144) != 0 && (t71VarP instanceof c40)) {
                                    int i = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var = t71Var.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
            }
            zd1Var = (zd1) si2Var;
        } else {
            zd1Var = null;
        }
        ez ezVarF0 = zd1Var != null ? zd1Var.F0() : null;
        if (ezVarF0 != null && qx.H(ezVarF0)) {
            return ezVarF0;
        }
        ez ezVar = (ez) this.t.h;
        if (ezVar != null) {
            return ezVar;
        }
        fu1.h("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object G0(long j, long j2, tx txVar) {
        xd1 xd1Var;
        long j3;
        long j4;
        long j5;
        zd1 zd1Var;
        long j6;
        long j7;
        si2 si2Var;
        he1 he1Var;
        int i;
        int i2;
        if (txVar instanceof xd1) {
            xd1Var = (xd1) txVar;
            int i3 = xd1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xd1Var.l = i3 - Integer.MIN_VALUE;
            } else {
                xd1Var = new xd1(this, txVar);
            }
        } else {
            xd1Var = new xd1(this, txVar);
        }
        xd1 xd1Var2 = xd1Var;
        Object objD = xd1Var2.j;
        int i4 = xd1Var2.l;
        fa1 fa1Var = null;
        int i5 = 1;
        fz fzVar = fz.e;
        if (i4 == 0) {
            ix.Q(objD);
            xd1Var2.h = j;
            xd1Var2.i = j2;
            xd1Var2.l = 1;
            objD = this.s.d(j, j2, xd1Var2);
            if (objD != fzVar) {
                j3 = j;
                j4 = j2;
            }
            return fzVar;
        }
        if (i4 == 1) {
            j4 = xd1Var2.i;
            j3 = xd1Var2.h;
            ix.Q(objD);
        } else {
            if (i4 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = xd1Var2.h;
            ix.Q(objD);
        }
        j6 = ((sm2) objD).a;
        j5 = j7;
        return new sm2(sm2.e(j5, j6));
        j5 = ((sm2) objD).a;
        boolean z = this.r;
        if (!z) {
            zd1Var = this.u;
        } else if (z && z) {
            if (!this.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = this.e.i;
            ax0 ax0VarV = qx.V(this);
            loop0: while (true) {
                if (ax0VarV == null) {
                    si2Var = null;
                    break;
                }
                int i6 = 262144;
                if ((ax0VarV.I.f.h & 262144) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & i6) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var2 = fa1Var;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    si2Var = (si2) t71VarP;
                                    i = i6;
                                    if (ws0.j(p(), si2Var.p()) && zd1.class == si2Var.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i = i6;
                                }
                                if ((t71VarP.g & i) == 0 || !(t71VarP instanceof c40)) {
                                    i2 = i5;
                                } else {
                                    t71 t71Var2 = ((c40) t71VarP).t;
                                    int i7 = 0;
                                    while (t71Var2 != null) {
                                        if ((t71Var2.g & i) != 0) {
                                            i7++;
                                            if (i7 == i5) {
                                                t71VarP = t71Var2;
                                            } else {
                                                fa1 fa1Var3 = fa1Var2 == null ? new fa1(new t71[16]) : fa1Var2;
                                                if (t71VarP != null) {
                                                    fa1Var3.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var3.b(t71Var2);
                                                fa1Var2 = fa1Var3;
                                            }
                                        }
                                        t71Var2 = t71Var2.j;
                                        i5 = 1;
                                    }
                                    i2 = i5;
                                    if (i7 == i2) {
                                    }
                                    i6 = i;
                                    i5 = i2;
                                }
                                t71VarP = qx.P(fa1Var2);
                                i6 = i;
                                i5 = i2;
                            }
                        }
                        t71Var = t71Var.i;
                        i6 = i6;
                        i5 = i5;
                        fa1Var = null;
                    }
                }
                int i8 = i5;
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                i5 = i8;
                fa1Var = null;
            }
            zd1Var = (zd1) si2Var;
        } else {
            zd1Var = null;
        }
        if (zd1Var != null) {
            long jE = sm2.e(j3, j5);
            long jD = sm2.d(j4, j5);
            xd1Var2.h = j5;
            xd1Var2.l = 2;
            objD = zd1Var.G0(jE, jD, xd1Var2);
            if (objD != fzVar) {
                j7 = j5;
                j6 = ((sm2) objD).a;
                j5 = j7;
            }
            return fzVar;
        }
        j6 = 0;
        return new sm2(sm2.e(j5, j6));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long H0(int i, long j, long j2) {
        long jH;
        he1 he1Var;
        dv dvVar = this.s;
        if (dvVar.a) {
            uy1 uy1Var = (uy1) dvVar.b;
            if (uy1Var.a.b()) {
                jH = 0;
            } else {
                jH = uy1Var.h(uy1Var.d(uy1Var.a.e(uy1Var.d(uy1Var.g(j2)))));
            }
        } else {
            jH = 0;
        }
        boolean z = this.r;
        si2 si2Var = null;
        if (z && z) {
            if (!this.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = this.e.i;
            ax0 ax0VarV = qx.V(this);
            loop0: while (ax0VarV != null) {
                if ((ax0VarV.I.f.h & 262144) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 262144) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    si2 si2Var2 = (si2) t71VarP;
                                    if (ws0.j(p(), si2Var2.p()) && zd1.class == si2Var2.getClass()) {
                                        si2Var = si2Var2;
                                        break loop0;
                                    }
                                }
                                if ((t71VarP.g & 262144) != 0 && (t71VarP instanceof c40)) {
                                    int i2 = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var = t71Var.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
            }
            si2Var = (zd1) si2Var;
        }
        zd1 zd1Var = si2Var;
        return uf1.e(jH, zd1Var != 0 ? zd1Var.H0(i, uf1.e(j, jH), uf1.d(j2, jH)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d7 A[PHI: r14
  0x00d7: PHI (r14v2 fa1) = (r14v1 fa1), (r14v1 fa1), (r14v4 fa1) binds: [B:40:0x00a0, B:42:0x00a4, B:56:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    public final Object I0(long j, sx sxVar) {
        yd1 yd1Var;
        zd1 zd1Var;
        long j2;
        long j3;
        si2 si2Var;
        he1 he1Var;
        int i;
        sm2 sm2Var;
        long j4;
        if (sxVar instanceof yd1) {
            yd1Var = (yd1) sxVar;
            int i2 = yd1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yd1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                yd1Var = new yd1(this, (tx) sxVar);
            }
        } else {
            yd1Var = new yd1(this, (tx) sxVar);
        }
        Object objI0 = yd1Var.i;
        int i3 = yd1Var.k;
        fa1 fa1Var = null;
        fz fzVar = fz.e;
        if (i3 != 0) {
            if (i3 == 1) {
                j2 = yd1Var.h;
                ix.Q(objI0);
            } else {
                if (i3 != 2) {
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = yd1Var.h;
                ix.Q(objI0);
            }
            return new sm2(sm2.e(j4, ((sm2) objI0).a));
        }
        ix.Q(objI0);
        boolean z = this.r;
        if (z && z) {
            if (!this.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = this.e.i;
            ax0 ax0VarV = qx.V(this);
            loop0: while (true) {
                if (ax0VarV == null) {
                    si2Var = null;
                    break;
                }
                int i4 = 262144;
                if ((ax0VarV.I.f.h & 262144) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & i4) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var2 = fa1Var;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    si2 si2Var2 = (si2) t71VarP;
                                    i = i4;
                                    if (ws0.j(p(), si2Var2.p()) && zd1.class == si2Var2.getClass()) {
                                        si2Var = si2Var2;
                                        break loop0;
                                    }
                                } else {
                                    i = i4;
                                }
                                if ((t71VarP.g & i) == 0 || !(t71VarP instanceof c40)) {
                                    t71VarP = qx.P(fa1Var2);
                                } else {
                                    int i5 = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & i) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var2 == null) {
                                                    fa1Var2 = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var2.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var2.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i5 != 1) {
                                        t71VarP = qx.P(fa1Var2);
                                    }
                                }
                                i4 = i;
                            }
                        }
                        t71Var = t71Var.i;
                        i4 = i4;
                        fa1Var = null;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                fa1Var = null;
            }
            zd1Var = (zd1) si2Var;
        } else {
            zd1Var = null;
        }
        if (zd1Var != null) {
            yd1Var.h = j;
            yd1Var.k = 1;
            objI0 = zd1Var.I0(j, yd1Var);
            if (objI0 != fzVar) {
                j2 = j;
            }
        } else {
            j2 = j;
            j3 = 0;
            sm2.d(j2, j3);
            yd1Var.h = j3;
            yd1Var.k = 2;
            sm2Var = new sm2(0L);
            if (sm2Var != fzVar) {
                objI0 = sm2Var;
                j4 = j3;
                return new sm2(sm2.e(j4, ((sm2) objI0).a));
            }
        }
        return fzVar;
        j3 = ((sm2) objI0).a;
        sm2.d(j2, j3);
        yd1Var.h = j3;
        yd1Var.k = 2;
        sm2Var = new sm2(0L);
        if (sm2Var != fzVar) {
            objI0 = sm2Var;
            j4 = j3;
            return new sm2(sm2.e(j4, ((sm2) objI0).a));
        }
        return fzVar;
    }

    public final long J0(int i, long j) {
        he1 he1Var;
        boolean z = this.r;
        zd1 zd1Var = null;
        si2 si2Var = null;
        zd1Var = null;
        if (z && z) {
            if (!this.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = this.e.i;
            ax0 ax0VarV = qx.V(this);
            loop0: while (ax0VarV != null) {
                if ((ax0VarV.I.f.h & 262144) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 262144) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    si2 si2Var2 = (si2) t71VarP;
                                    if (ws0.j(p(), si2Var2.p()) && zd1.class == si2Var2.getClass()) {
                                        si2Var = si2Var2;
                                        break loop0;
                                    }
                                }
                                if ((t71VarP.g & 262144) != 0 && (t71VarP instanceof c40)) {
                                    int i2 = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var = t71Var.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
            }
            zd1Var = (zd1) si2Var;
        }
        long jJ0 = zd1Var != null ? zd1Var.J0(i, j) : 0L;
        uf1.d(j, jJ0);
        return uf1.e(jJ0, 0L);
    }

    @Override // defpackage.si2
    public final Object p() {
        return this.v;
    }

    @Override // defpackage.t71
    public final void x0() {
        e4 e4Var = this.t;
        e4Var.e = this;
        e4Var.f = null;
        this.u = null;
        e4Var.g = new h8(10, this);
        e4Var.h = t0();
    }

    @Override // defpackage.t71
    public final void y0() {
        gs1 gs1Var = new gs1();
        p12.n(this, new w4(gs1Var, 2));
        zd1 zd1Var = (zd1) ((si2) gs1Var.e);
        this.u = zd1Var;
        e4 e4Var = this.t;
        e4Var.f = zd1Var;
        if (((zd1) e4Var.e) == this) {
            e4Var.e = null;
        }
    }
}

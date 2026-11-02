package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cg0 extends t71 implements rv, hw0, lf1, w71, b40 {
    public final ij0 s;
    public boolean t;
    public boolean u;
    public final int v;

    public cg0(int i, ij0 ij0Var, int i2) {
        this.s = (i2 & 4) != 0 ? null : ij0Var;
        this.v = i;
    }

    public static boolean N0(cg0 cg0Var) {
        return cg0Var.M0(7);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0273  */
    /* JADX WARN: Code duplicated, block: B:167:0x027a A[ADDED_TO_REGION, LOOP:9: B:167:0x027a->B:174:0x028c, LOOP_START, PHI: r14
  0x027a: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:166:0x0278, B:174:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0289  */
    /* JADX WARN: Code duplicated, block: B:173:0x028b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0292  */
    /* JADX WARN: Code duplicated, block: B:178:0x029a  */
    /* JADX WARN: Code duplicated, block: B:182:0x02a5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:216:0x0210 A[SYNTHETIC] */
    public final boolean F0() {
        fa1 fa1Var;
        int i;
        cg0 cg0Var;
        bg0 bg0Var;
        he1 he1Var;
        boolean z;
        he1 he1Var2;
        int iOrdinal = qx.O(this).ordinal();
        if (iOrdinal == 0) {
            vf0 vf0Var = (vf0) ((e5) qx.W(this)).getFocusOwner();
            cg0 cg0VarF = vf0Var.f();
            bg0 bg0VarK0 = K0();
            if (cg0VarF == this) {
                G0(bg0VarK0, bg0VarK0);
                return true;
            }
            if (cg0VarF != null || ((vf0) ((e5) qx.W(this)).getFocusOwner()).a.E()) {
                if (cg0VarF != null) {
                    fa1Var = new fa1(new cg0[16]);
                    if (!cg0VarF.e.r) {
                        vp0.b("visitAncestors called on an unattached node");
                    }
                    t71 t71Var = cg0VarF.e.i;
                    ax0 ax0VarV = qx.V(cg0VarF);
                    while (ax0VarV != null) {
                        if ((ax0VarV.I.f.h & 1024) != 0) {
                            while (t71Var != null) {
                                if ((t71Var.g & 1024) != 0) {
                                    t71 t71VarP = t71Var;
                                    fa1 fa1Var2 = null;
                                    while (t71VarP != null) {
                                        if (t71VarP instanceof cg0) {
                                            fa1Var.b((cg0) t71VarP);
                                        } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                            int i2 = 0;
                                            for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                                if ((t71Var2.g & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
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
                                            if (i2 == 1) {
                                            }
                                        }
                                        t71VarP = qx.P(fa1Var2);
                                    }
                                }
                                t71Var = t71Var.i;
                            }
                        }
                        ax0VarV = ax0VarV.u();
                        t71Var = (ax0VarV == null || (he1Var2 = ax0VarV.I) == null) ? null : he1Var2.e;
                    }
                } else {
                    fa1Var = null;
                }
                Object[] objArr = new cg0[16];
                Object[] objArr2 = new cg0[16];
                if (!this.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var3 = this.e.i;
                ax0 ax0VarV2 = qx.V(this);
                int i3 = 0;
                int i4 = 0;
                boolean z2 = true;
                while (ax0VarV2 != null) {
                    if ((ax0VarV2.I.f.h & 1024) != 0) {
                        while (t71Var3 != null) {
                            if ((t71Var3.g & 1024) != 0) {
                                t71 t71VarP2 = t71Var3;
                                fa1 fa1Var3 = null;
                                while (t71VarP2 != null) {
                                    if (t71VarP2 instanceof cg0) {
                                        cg0 cg0Var2 = (cg0) t71VarP2;
                                        if (ws0.j(fa1Var != null ? Boolean.valueOf(fa1Var.j(cg0Var2)) : null, Boolean.TRUE)) {
                                            int i5 = i3 + 1;
                                            if (objArr.length < i5) {
                                                int length = objArr.length;
                                                Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                                System.arraycopy(objArr, 0, objArr3, 0, length);
                                                objArr = objArr3;
                                            }
                                            objArr[i3] = cg0Var2;
                                            i3 = i5;
                                        } else {
                                            vf0Var = vf0Var;
                                            int i6 = i4 + 1;
                                            if (objArr2.length < i6) {
                                                int length2 = objArr2.length;
                                                Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                                System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                                objArr2 = objArr4;
                                            }
                                            objArr2[i4] = cg0Var2;
                                            i4 = i6;
                                        }
                                        if (cg0Var2 == cg0VarF) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        vf0Var = vf0Var;
                                        z = true;
                                    }
                                    if (z && (t71VarP2.g & 1024) != 0 && (t71VarP2 instanceof c40)) {
                                        int i7 = 0;
                                        for (t71 t71Var4 = ((c40) t71VarP2).t; t71Var4 != null; t71Var4 = t71Var4.j) {
                                            if ((t71Var4.g & 1024) != 0) {
                                                int i8 = i7 + 1;
                                                if (i8 == 1) {
                                                    t71VarP2 = t71Var4;
                                                    i8 = i8;
                                                } else {
                                                    fa1 fa1Var4 = fa1Var3 == null ? new fa1(new t71[16]) : fa1Var3;
                                                    if (t71VarP2 != null) {
                                                        fa1Var4.b(t71VarP2);
                                                        t71VarP2 = null;
                                                    }
                                                    fa1Var4.b(t71Var4);
                                                    fa1Var3 = fa1Var4;
                                                }
                                                i7 = i8;
                                            }
                                        }
                                        if (i7 != 1) {
                                            t71VarP2 = qx.P(fa1Var3);
                                        }
                                    } else {
                                        t71VarP2 = qx.P(fa1Var3);
                                    }
                                }
                            }
                            t71Var3 = t71Var3.i;
                            vf0Var = vf0Var;
                        }
                    }
                    vf0 vf0Var2 = vf0Var;
                    ax0VarV2 = ax0VarV2.u();
                    t71Var3 = (ax0VarV2 == null || (he1Var = ax0VarV2.I) == null) ? null : he1Var.e;
                    vf0Var = vf0Var2;
                }
                vf0 vf0Var3 = vf0Var;
                if (!z2 || cg0VarF == null || qx.q(cg0VarF, false)) {
                    ux.C(this, new h8(4, this));
                    int iOrdinal2 = K0().ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            ((vf0) ((e5) qx.W(this)).getFocusOwner()).i(this);
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                qj.p();
                                return false;
                            }
                            ((vf0) ((e5) qx.W(this)).getFocusOwner()).i(this);
                        }
                    }
                    bg0 bg0Var2 = bg0.g;
                    bg0 bg0Var3 = bg0.e;
                    if (z2 && cg0VarF != null) {
                        cg0VarF.G0(bg0Var3, bg0Var2);
                    }
                    bg0 bg0Var4 = bg0.f;
                    if (fa1Var != null) {
                        int i9 = fa1Var.g - 1;
                        Object[] objArr5 = fa1Var.e;
                        if (i9 < objArr5.length) {
                            while (i9 >= 0) {
                                cg0 cg0Var3 = (cg0) objArr5[i9];
                                if (vf0Var3.f() == this) {
                                    cg0Var3.G0(bg0Var4, bg0Var2);
                                    i9--;
                                }
                            }
                            i = i4 - 1;
                            if (i < objArr2.length) {
                                while (i >= 0) {
                                    cg0Var = (cg0) objArr2[i];
                                    if (vf0Var3.f() == this) {
                                        if (cg0Var == cg0VarF) {
                                            bg0Var = bg0Var3;
                                        } else {
                                            bg0Var = bg0Var2;
                                        }
                                        cg0Var.G0(bg0Var, bg0Var4);
                                        i--;
                                    }
                                }
                                if (vf0Var3.f() == this) {
                                    G0(bg0VarK0, bg0Var3);
                                    if (vf0Var3.f() != this) {
                                        return true;
                                    }
                                }
                            } else if (vf0Var3.f() == this) {
                                G0(bg0VarK0, bg0Var3);
                                if (vf0Var3.f() != this) {
                                    return true;
                                }
                            }
                        } else {
                            i = i4 - 1;
                            if (i < objArr2.length) {
                                while (i >= 0) {
                                    cg0Var = (cg0) objArr2[i];
                                    if (vf0Var3.f() == this) {
                                        if (cg0Var == cg0VarF) {
                                            bg0Var = bg0Var3;
                                        } else {
                                            bg0Var = bg0Var2;
                                        }
                                        cg0Var.G0(bg0Var, bg0Var4);
                                        i--;
                                    }
                                }
                                if (vf0Var3.f() == this) {
                                    G0(bg0VarK0, bg0Var3);
                                    if (vf0Var3.f() != this) {
                                        return true;
                                    }
                                }
                            } else if (vf0Var3.f() == this) {
                                G0(bg0VarK0, bg0Var3);
                                if (vf0Var3.f() != this) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        i = i4 - 1;
                        if (i < objArr2.length) {
                            while (i >= 0) {
                                cg0Var = (cg0) objArr2[i];
                                if (vf0Var3.f() == this) {
                                    if (cg0Var == cg0VarF) {
                                        bg0Var = bg0Var3;
                                    } else {
                                        bg0Var = bg0Var2;
                                    }
                                    cg0Var.G0(bg0Var, bg0Var4);
                                    i--;
                                }
                            }
                            if (vf0Var3.f() == this) {
                                G0(bg0VarK0, bg0Var3);
                                if (vf0Var3.f() != this) {
                                    return true;
                                }
                            }
                        } else if (vf0Var3.f() == this) {
                            G0(bg0VarK0, bg0Var3);
                            if (vf0Var3.f() != this) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                qj.p();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [t71] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [t71] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [fa1] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void G0(bg0 bg0Var, bg0 bg0Var2) {
        he1 he1Var;
        ij0 ij0Var;
        vf0 vf0Var = (vf0) ((e5) qx.W(this)).getFocusOwner();
        cg0 cg0VarF = vf0Var.f();
        if (!bg0Var.equals(bg0Var2) && (ij0Var = this.s) != null) {
            ij0Var.g(bg0Var, bg0Var2);
        }
        t71 t71Var = this.e;
        if (!t71Var.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var2 = this.e;
        ax0 ax0VarV = qx.V(this);
        while (ax0VarV != null) {
            if ((ax0VarV.I.f.h & 5120) != 0) {
                while (t71Var2 != null) {
                    int i = t71Var2.g;
                    if ((i & 5120) != 0) {
                        if (t71Var2 != t71Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? P = t71Var2;
                            ?? fa1Var = 0;
                            while (P != 0) {
                                if (P instanceof mf0) {
                                    mf0 mf0Var = (mf0) P;
                                    if (cg0VarF == vf0Var.f()) {
                                        mf0Var.U(bg0Var2);
                                    }
                                } else if ((P.g & 4096) != 0 && (P instanceof c40)) {
                                    t71 t71Var3 = ((c40) P).t;
                                    int i2 = 0;
                                    P = P;
                                    fa1Var = fa1Var;
                                    while (t71Var3 != null) {
                                        if ((t71Var3.g & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                fa1Var = fa1Var;
                                                P = t71Var3;
                                            } else {
                                                if (fa1Var == 0) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var.b(P);
                                                    P = 0;
                                                }
                                                fa1Var.b(t71Var3);
                                            }
                                        }
                                        t71Var3 = t71Var3.j;
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                P = qx.P(fa1Var);
                            }
                        }
                    }
                    t71Var2 = t71Var2.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var2 = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
    }

    public final wf0 H0() {
        boolean z;
        he1 he1Var;
        wf0 wf0Var = new wf0();
        wf0Var.a = true;
        xf0 xf0Var = xf0.b;
        wf0Var.b = xf0Var;
        wf0Var.c = xf0Var;
        wf0Var.d = xf0Var;
        wf0Var.e = xf0Var;
        wf0Var.f = xf0Var;
        wf0Var.g = xf0Var;
        wf0Var.h = xf0Var;
        wf0Var.i = xf0Var;
        wf0Var.j = x4.F;
        wf0Var.k = x4.G;
        wf0Var.l = q90.L;
        int i = this.v;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((fq0) ((hq0) ((gq0) ir2.j(this, yv.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                fu1.h("Unknown Focusability");
                return null;
            }
            z = false;
        }
        wf0Var.a = z;
        t71 t71Var = this.e;
        if (!t71Var.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var2 = this.e;
        ax0 ax0VarV = qx.V(this);
        loop0: while (ax0VarV != null) {
            if ((ax0VarV.I.f.h & 3072) != 0) {
                while (t71Var2 != null) {
                    int i2 = t71Var2.g;
                    if ((i2 & 3072) != 0) {
                        if (t71Var2 != t71Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            fa1 fa1Var = null;
                            t71 t71VarP = t71Var2;
                            while (t71VarP != null) {
                                if (t71VarP instanceof rh) {
                                    s71 s71Var = ((rh) t71VarP).s;
                                    vp0.b("applyFocusProperties called on wrong node");
                                    s71Var.getClass();
                                    fu1.c();
                                    return null;
                                }
                                if ((t71VarP.g & 2048) != 0 && (t71VarP instanceof c40)) {
                                    int i3 = 0;
                                    for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                        if ((t71Var3.g & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                t71VarP = t71Var3;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    t71Var2 = t71Var2.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var2 = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
        return wf0Var;
    }

    @Override // defpackage.lf1
    public final void I() {
        L0();
    }

    public final yr1 I0(jw0 jw0Var) {
        yr1 yr1Var = H0().l;
        if (yr1Var != q90.L) {
            return jw0Var == null ? yr1Var : yr1Var.i(jw0Var.G(qx.U(this), 0L));
        }
        return jw0Var != null ? jw0Var.K(qx.U(this), false) : sv.e(0L, ux.M(qx.U(this).g));
    }

    public final az0 J0() {
        he1 he1Var;
        Object obj;
        if (!this.e.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var = this.e.i;
        ax0 ax0VarV = qx.V(this);
        loop0: while (ax0VarV != null) {
            if ((ax0VarV.I.f.h & 8388640) != 0) {
                while (t71Var != null) {
                    int i = t71Var.g;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(t71Var instanceof az0)) {
                                if (t71Var instanceof c40) {
                                    t71Var = null;
                                    for (t71 t71Var2 = ((c40) t71Var).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if (t71Var2 instanceof az0) {
                                            t71Var = t71Var2;
                                        }
                                    }
                                } else {
                                    t71Var = null;
                                }
                            }
                            az0 az0Var = (az0) t71Var;
                            if (az0Var != null) {
                                return az0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (t71Var instanceof w71) {
                                obj = t71Var;
                            } else if (t71Var instanceof c40) {
                                obj = null;
                                for (t71 t71Var3 = ((c40) t71Var).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                    if (t71Var3 instanceof w71) {
                                        obj = t71Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            w71 w71Var = (w71) obj;
                            if (w71Var != null) {
                                w71Var.j();
                            }
                        }
                    }
                    t71Var = t71Var.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
        return null;
    }

    public final bg0 K0() {
        cg0 cg0VarF;
        he1 he1Var;
        boolean z = this.r;
        bg0 bg0Var = bg0.g;
        if (!z || (cg0VarF = ((vf0) ((e5) qx.W(this)).getFocusOwner()).f()) == null) {
            return bg0Var;
        }
        if (this == cg0VarF) {
            return bg0.e;
        }
        if (cg0VarF.r) {
            if (!cg0VarF.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = cg0VarF.e.i;
            ax0 ax0VarV = qx.V(cg0VarF);
            while (ax0VarV != null) {
                if ((ax0VarV.I.f.h & 1024) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 1024) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof cg0) {
                                    if (this == ((cg0) t71VarP)) {
                                        return bg0.f;
                                    }
                                } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                    int i = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & 1024) != 0) {
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
        }
        return bg0Var;
    }

    public final void L0() {
        int iOrdinal = K0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                qj.p();
                return;
            }
        }
        gs1 gs1Var = new gs1();
        ux.C(this, new v4(4, gs1Var, this));
        Object obj = gs1Var.e;
        if (obj == null) {
            ws0.U("focusProperties");
            throw null;
        }
        if (((wf0) obj).a) {
            return;
        }
        ((vf0) ((e5) qx.W(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean M0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return H0().a ? F0() : y12.f(this, i, new je1(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void y0() {
        int iOrdinal = K0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((e5) qx.W(this)).getFocusOwner();
                ux.o(this);
                return;
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                qj.p();
                return;
            }
        }
        vf0 vf0Var = (vf0) ((e5) qx.W(this)).getFocusOwner();
        vf0Var.b(8, true, false);
        vf0Var.d.a();
    }

    @Override // defpackage.t71
    public final void z0() {
        if (K0().a()) {
            ((vf0) ((e5) qx.W(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // defpackage.hw0
    public final void o(jw0 jw0Var) {
    }
}

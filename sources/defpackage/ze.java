package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ze extends t71 implements sw0 {
    public float s;
    public boolean t;

    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.s) : r61Var.e0(i);
    }

    public final long F0(long j, boolean z) {
        int iRound;
        int iG = sw.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.s)) <= 0) {
            return 0L;
        }
        if (!z || sv0.j0(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long G0(long j, boolean z) {
        int iRound;
        int iH = sw.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.s)) <= 0) {
            return 0L;
        }
        if (!z || sv0.j0(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long H0(long j, boolean z) {
        int i = sw.i(j);
        int iRound = Math.round(i * this.s);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || sv0.j0(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long I0(long j, boolean z) {
        int iJ = sw.j(j);
        int iRound = Math.round(iJ / this.s);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || sv0.j0(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.s) : r61Var.U(i);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        long jF0;
        if (this.t) {
            jF0 = F0(j, true);
            if (qr0.a(jF0, 0L)) {
                jF0 = G0(j, true);
                if (qr0.a(jF0, 0L)) {
                    jF0 = H0(j, true);
                    if (qr0.a(jF0, 0L)) {
                        jF0 = I0(j, true);
                        if (qr0.a(jF0, 0L)) {
                            jF0 = F0(j, false);
                            if (qr0.a(jF0, 0L)) {
                                jF0 = G0(j, false);
                                if (qr0.a(jF0, 0L)) {
                                    jF0 = H0(j, false);
                                    if (qr0.a(jF0, 0L)) {
                                        jF0 = I0(j, false);
                                        if (qr0.a(jF0, 0L)) {
                                            jF0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jF0 = G0(j, true);
            if (qr0.a(jF0, 0L)) {
                jF0 = F0(j, true);
                if (qr0.a(jF0, 0L)) {
                    jF0 = I0(j, true);
                    if (qr0.a(jF0, 0L)) {
                        jF0 = H0(j, true);
                        if (qr0.a(jF0, 0L)) {
                            jF0 = G0(j, false);
                            if (qr0.a(jF0, 0L)) {
                                jF0 = F0(j, false);
                                if (qr0.a(jF0, 0L)) {
                                    jF0 = I0(j, false);
                                    if (qr0.a(jF0, 0L)) {
                                        jF0 = H0(j, false);
                                        if (qr0.a(jF0, 0L)) {
                                            jF0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!qr0.a(jF0, 0L)) {
            int i = (int) (jF0 >> 32);
            int i2 = (int) (4294967295L & jF0);
            if (!((i >= 0) & (i2 >= 0))) {
                xp0.a("width and height must be >= 0");
            }
            j = tw.h(i, i, i2, i2);
        }
        jm1 jm1VarE = r61Var.e(j);
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 0));
    }

    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.s) : r61Var.a0(i);
    }

    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.s) : r61Var.f(i);
    }
}

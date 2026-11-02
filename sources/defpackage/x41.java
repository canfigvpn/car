package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x41 extends jm1 implements f81, y61 {
    public u41 j;
    public ej0 k;
    public lm1 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final y41 p = new y41(0, this);
    public pc q;
    public w91 r;

    public static void E0(me1 me1Var) {
        bx0 bx0Var;
        me1 me1Var2 = me1Var.t;
        ax0 ax0Var = me1Var.s;
        if (!ws0.j(me1Var2 != null ? me1Var2.s : null, ax0Var)) {
            ax0Var.J.p.B.f();
            return;
        }
        z3 z3VarP = ax0Var.J.p.p();
        if (z3VarP == null || (bx0Var = ((v61) z3VarP).B) == null) {
            return;
        }
        bx0Var.f();
    }

    public abstract x61 A0();

    public abstract x41 B0();

    public abstract long C0();

    public final u41 D0() {
        u41 u41Var = this.j;
        if (u41Var != null) {
            return u41Var;
        }
        u41 u41Var2 = new u41(this);
        this.j = u41Var2;
        return u41Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(x91 x91Var) {
        ax0 ax0Var;
        Object[] objArr = x91Var.b;
        long[] jArr = x91Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (ax0Var = (ax0) ((lo2) objArr[(i << 3) + i3]).get()) != null) {
                        if (r()) {
                            ax0Var.S(false);
                        } else {
                            ax0Var.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void G0();

    @Override // defpackage.y61
    public final x61 N(int i, int i2, Map map, ej0 ej0Var, ej0 ej0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            vp0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new w41(i, i2, map, ej0Var, ej0Var2, this);
    }

    @Override // defpackage.jm1
    public final int f0(u3 u3Var) {
        int iT0;
        if (!y0() || (iT0 = t0(u3Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = u3Var instanceof bn2;
        long j = this.i;
        return iT0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.f81
    public final void n(boolean z) {
        x41 x41VarB0 = B0();
        ax0 ax0VarZ0 = x41VarB0 != null ? x41VarB0.z0() : null;
        if (ws0.j(ax0VarZ0, z0())) {
            this.m = z;
            return;
        }
        if ((ax0VarZ0 != null ? ax0VarZ0.J.d : null) != ww0.g) {
            if ((ax0VarZ0 != null ? ax0VarZ0.J.d : null) != ww0.h) {
                return;
            }
        }
        this.m = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(ax0 ax0Var, rn0 rn0Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        w91 w91Var = this.r;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (w91Var != null) {
            Object[] objArr = w91Var.c;
            long[] jArr3 = w91Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                x91 x91Var = (x91) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = x91Var.b;
                                long[] jArr4 = x91Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    ax0 ax0Var2 = (ax0) ((lo2) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (ax0Var2 != null) {
                                                        boolean zH = ax0Var2.H();
                                                        i4 = i8;
                                                        if (zH) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    x91Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        w91 w91Var2 = this.r;
        if (w91Var2 != null) {
            long[] jArr5 = w91Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((x91) w91Var2.c[i18]).g()) {
                                    w91Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        w91 w91Var3 = this.r;
        if (w91Var3 == null) {
            w91Var3 = new w91();
            this.r = w91Var3;
        }
        Object objG = w91Var3.g(rn0Var);
        if (objG == null) {
            objG = new x91();
            w91Var3.m(rn0Var, objG);
        }
        ((x91) objG).k(new lo2(ax0Var));
    }

    @Override // defpackage.os0
    public boolean r() {
        return false;
    }

    public abstract int t0(u3 u3Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(lm1 lm1Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        ax0 ax0Var;
        int i;
        char c2;
        long j6;
        x41 x41VarB0;
        cj1 snapshotObserver;
        w91 w91Var = this.r;
        pc pcVar = this.q;
        if (pcVar == null) {
            pcVar = new pc();
            this.q = pcVar;
        }
        pc pcVar2 = pcVar;
        aj1 aj1Var = z0().r;
        if (aj1Var != null && (snapshotObserver = ((e5) aj1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.c(lm1Var, x4.J, new v41(this, j, j2, lm1Var));
        }
        boolean zR = r();
        x91 x91Var = (x91) pcVar2.e;
        x91 x91Var2 = (x91) pcVar2.f;
        int i2 = pcVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) pcVar2.d)[i3];
            if (b == 3) {
                rn0 rn0Var = ((rn0[]) pcVar2.b)[i3];
                rn0Var.getClass();
                x91Var2.k(rn0Var);
            } else if (b != 0 && w91Var != null) {
                rn0 rn0Var2 = ((rn0[]) pcVar2.b)[i3];
                rn0Var2.getClass();
                x91 x91Var3 = (x91) w91Var.k(rn0Var2);
                if (x91Var3 != null) {
                    x91Var.j(x91Var3);
                }
            }
        }
        int i4 = pcVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) pcVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                rn0[] rn0VarArr = (rn0[]) pcVar2.b;
                rn0VarArr[i6 - i5] = rn0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = pcVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((rn0[]) pcVar2.b)[i8] = null;
        }
        pcVar2.a -= i5;
        x41 x41VarB1 = B0();
        Object[] objArr = x91Var2.b;
        long[] jArr = x91Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            rn0 rn0Var3 = (rn0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            x41 x41Var = x41VarB1 == null ? this : x41VarB1;
                            i = i9;
                            x41 x41Var2 = x41Var;
                            while (true) {
                                pc pcVar3 = x41Var2.q;
                                if ((pcVar3 != null && ve.G0((rn0[]) pcVar3.b, rn0Var3) >= 0) || (x41VarB0 = x41Var2.B0()) == null) {
                                    break;
                                } else {
                                    x41Var2 = x41VarB0;
                                }
                            }
                            w91 w91Var2 = x41Var2.r;
                            x91 x91Var4 = w91Var2 != null ? (x91) w91Var2.k(rn0Var3) : null;
                            if (x91Var4 != null) {
                                x41Var.F0(x91Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        x91Var2.b();
        Object[] objArr2 = x91Var.b;
        long[] jArr2 = x91Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (ax0Var = (ax0) ((lo2) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zR) {
                                ax0Var.S(false);
                            } else {
                                ax0Var.U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        x91Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[LOOP:0: B:11:0x001b->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[EDGE_INSN: B:48:0x0055->B:22:0x0055 BREAK  A[LOOP:0: B:11:0x001b->B:21:0x0052], SYNTHETIC] */
    public final void v0(x61 x61Var) {
        long j;
        long j2;
        w91 w91Var = this.r;
        if (this.o) {
            return;
        }
        ej0 ej0VarD = x61Var.d();
        if (ej0VarD != null) {
            boolean z = this.k != ej0VarD;
            if (z || !D0().e) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                jw0 jw0VarX0 = x0();
                long jN = mx.N(jw0VarX0.c(0L));
                long jP = jw0VarX0.P();
                j2 = jN;
                j = jP;
                z = (ir0.a(jN, D0().f) && qr0.a(jP, D0().g)) ? false : true;
            }
            if (z) {
                lm1 lm1Var = this.l;
                if (lm1Var != null) {
                    lm1Var.e = x61Var;
                } else {
                    lm1Var = new lm1(x61Var, this);
                    this.l = lm1Var;
                }
                u0(lm1Var, j2, j);
                this.k = x61Var.d();
                return;
            }
            return;
        }
        if (w91Var != null) {
            Object[] objArr = w91Var.c;
            long[] jArr = w91Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                F0((x91) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            w91Var.a();
        }
    }

    public abstract x41 w0();

    public abstract jw0 x0();

    public abstract boolean y0();

    public abstract ax0 z0();
}

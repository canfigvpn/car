package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class as1 {
    public final e5 a;
    public final h7 b;
    public final pg2 c;
    public final p91 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public o4 h;
    public long i;
    public final h8 j;
    public final v91 k;

    public as1(e5 e5Var) {
        this.a = e5Var;
        h7 h7Var = new h7(5);
        h7Var.g = new long[192];
        h7Var.h = new long[192];
        this.b = h7Var;
        this.c = new pg2();
        this.d = new p91();
        this.i = -1L;
        this.j = new h8(12, this);
        this.k = new v91();
    }

    public static boolean c(me1 me1Var) {
        zi1 zi1Var = me1Var.P;
        return (zi1Var == null || ex.z(((dl0) zi1Var).b())) ? false : true;
    }

    public static long e(ax0 ax0Var) {
        he1 he1Var = ax0Var.I;
        me1 me1Var = he1Var.d;
        long jC = 0;
        for (me1 me1Var2 = he1Var.c; me1Var2 != null && me1Var2 != me1Var; me1Var2 = me1Var2.u) {
            if (c(me1Var2)) {
                return 9223372034707292159L;
            }
            jC = ir0.c(jC, me1Var2.D);
        }
        return jC;
    }

    public static void h(ax0 ax0Var) {
        if (!ax0Var.g || c(ax0Var.I.d)) {
            return;
        }
        ax0Var.g = false;
        if (ax0Var.i) {
            ax0Var.h = e(ax0Var);
            ax0Var.i = false;
        }
        if (ir0.a(ax0Var.h, 9223372034707292159L)) {
            return;
        }
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            h((ax0) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x024b A[LOOP:11: B:102:0x0249->B:103:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[LOOP:9: B:95:0x0225->B:107:0x0256, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x025d A[ADDED_TO_REGION, LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_START, PHI: r1
  0x025d: PHI (r1v8 og2) = (r1v7 og2), (r1v9 og2) binds: [B:109:0x025b, B:111:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x025f A[LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x026a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0259 A[EDGE_INSN: B:136:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0259 A[EDGE_INSN: B:137:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[ADDED_TO_REGION, LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_START, PHI: r3
  0x0189: PHI (r3v6 og2) = (r3v5 og2), (r3v7 og2) binds: [B:72:0x0187, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018b A[LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x023c  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        og2 og2Var;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        og2 og2Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        og2 og2Var3;
        long[] jArr4;
        long j9;
        long j10;
        o4 o4Var = this.h;
        if (o4Var != null) {
            this.a.removeCallbacks(o4Var);
            this.h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        h7 h7Var = this.b;
        boolean z4 = true;
        pg2 pg2Var = this.c;
        if (z2) {
            this.e = false;
            p91 p91Var = this.d;
            Object[] objArr2 = p91Var.a;
            int i9 = p91Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((ti0) objArr2[i10]).a();
            }
            long[] jArr5 = (long[]) h7Var.g;
            int i11 = h7Var.f;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    og2 og2Var4 = (og2) pg2Var.a.b(((int) j11) & 33554431);
                    while (og2Var4 != null) {
                        og2 og2Var5 = og2Var4.d;
                        boolean z6 = z3;
                        long j14 = og2Var4.g;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        og2Var4.e = j12;
                        og2Var4.f = j13;
                        if (z7) {
                            og2Var4.g = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            og2Var4.a(j9, j10, pg2Var.d, pg2Var.e, pg2Var.g);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        og2Var4 = og2Var5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) h7Var.g;
            int i14 = h7Var.f;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j15 = pg2Var.d;
            long j16 = pg2Var.e;
            float[] fArr2 = pg2Var.g;
            d91 d91Var = pg2Var.a;
            j2 = 128;
            Object[] objArr3 = d91Var.c;
            long[] jArr7 = d91Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    h7Var = h7Var;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                og2 og2Var6 = (og2) objArr3[(i17 << 3) + i21];
                                while (og2Var6 != null) {
                                    pg2Var.a(og2Var6, j17, j16, fArr2, jCurrentTimeMillis);
                                    og2Var6 = og2Var6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    h7Var = h7Var;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = pg2Var.d;
                j8 = pg2Var.e;
                fArr = pg2Var.g;
                og2Var3 = pg2Var.b;
                if (og2Var3 != null) {
                    while (og2Var3 != null) {
                        ax0 ax0VarV = qx.V(og2Var3.b);
                        long jB = ((e5) dx0.a(ax0VarV)).getRectManager().b(ax0VarV);
                        og2Var3.e = jB;
                        v61 v61Var = ax0VarV.J.p;
                        og2Var3.f = (((long) (v61Var.e + ((int) (jB >> 32)))) << 32) | (((long) (v61Var.f + ((int) (jB & 4294967295L)))) & 4294967295L);
                        pg2Var.a(og2Var3, j7, j8, fArr, jCurrentTimeMillis);
                        og2Var3 = og2Var3.d;
                    }
                }
            }
            if (this.g) {
                i2 = 0;
                this.g = false;
                h7 h7Var2 = h7Var;
                jArr2 = (long[]) h7Var2.g;
                int i23 = h7Var2.f;
                jArr3 = (long[]) h7Var2.h;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != zr1.a) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                h7Var2.f = i7;
                h7Var2.g = jArr3;
                h7Var2.h = jArr2;
            } else {
                i2 = 0;
            }
            j4 = pg2Var.c;
            if (j4 <= jCurrentTimeMillis) {
                d91 d91Var2 = pg2Var.a;
                objArr = d91Var2.c;
                jArr = d91Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (og2Var2 = (og2) objArr[(i3 << 3) + i5]; og2Var2 != null; og2Var2 = og2Var2.d) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                og2Var = pg2Var.b;
                if (og2Var != null) {
                    while (og2Var != null) {
                        og2Var = og2Var.d;
                    }
                }
                j4 = -1;
                pg2Var.c = -1L;
            }
            if (j4 > j) {
                i();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = pg2Var.d;
            j8 = pg2Var.e;
            fArr = pg2Var.g;
            og2Var3 = pg2Var.b;
            if (og2Var3 != null) {
                while (og2Var3 != null) {
                    ax0 ax0VarV2 = qx.V(og2Var3.b);
                    long jB2 = ((e5) dx0.a(ax0VarV2)).getRectManager().b(ax0VarV2);
                    og2Var3.e = jB2;
                    v61 v61Var2 = ax0VarV2.J.p;
                    og2Var3.f = (((long) (v61Var2.e + ((int) (jB2 >> 32)))) << 32) | (((long) (v61Var2.f + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    pg2Var.a(og2Var3, j7, j8, fArr, jCurrentTimeMillis);
                    og2Var3 = og2Var3.d;
                }
            }
        }
        if (this.g) {
            i2 = 0;
            this.g = false;
            h7 h7Var3 = h7Var;
            jArr2 = (long[]) h7Var3.g;
            int i24 = h7Var3.f;
            jArr3 = (long[]) h7Var3.h;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != zr1.a) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            h7Var3.f = i7;
            h7Var3.g = jArr3;
            h7Var3.h = jArr2;
        } else {
            i2 = 0;
        }
        j4 = pg2Var.c;
        if (j4 <= jCurrentTimeMillis) {
            d91 d91Var3 = pg2Var.a;
            objArr = d91Var3.c;
            jArr = d91Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (og2Var2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            og2Var = pg2Var.b;
            if (og2Var != null) {
                while (og2Var != null) {
                    og2Var = og2Var.d;
                }
            }
            j4 = -1;
            pg2Var.c = -1L;
        }
        if (j4 > j) {
            i();
        }
    }

    public final long b(ax0 ax0Var) {
        long j;
        int i = ax0Var.f & 33554431;
        h7 h7Var = this.b;
        long[] jArr = (long[]) h7Var.g;
        int i2 = h7Var.f;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                j = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
            i3 += 3;
        }
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    public final void d(ax0 ax0Var) {
        boolean z;
        ax0 ax0VarU;
        int i;
        boolean z2 = true;
        ax0Var.g = true;
        he1 he1Var = ax0Var.I;
        v61 v61Var = ax0Var.J.p;
        int iH0 = v61Var.h0();
        float fG0 = v61Var.g0();
        v91 v91Var = this.k;
        v91Var.a = 0.0f;
        v91Var.b = 0.0f;
        v91Var.c = iH0;
        v91Var.d = fG0;
        for (me1 me1Var = he1Var.d; me1Var != null; me1Var = me1Var.u) {
            ax0 ax0Var2 = me1Var.s;
            if (me1Var == ax0Var2.I.d && !ax0Var2.g) {
                long jB = b(ax0Var2);
                if (!ir0.a(jB, 9223372034707292159L)) {
                    v91Var.c((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            zi1 zi1Var = me1Var.P;
            if (zi1Var != null) {
                float[] fArrB = ((dl0) zi1Var).b();
                if (!ex.z(fArrB)) {
                    q61.c(fArrB, v91Var);
                }
            }
            long j = me1Var.D;
            v91Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
        }
        int i2 = (int) v91Var.a;
        int i3 = (int) v91Var.b;
        int i4 = (int) v91Var.c;
        int i5 = (int) v91Var.d;
        int i6 = ax0Var.f;
        boolean z3 = ax0Var.k;
        ax0Var.k = true;
        h7 h7Var = this.b;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) h7Var.g;
            int i8 = h7Var.f;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    z = z2;
                    ax0VarU = ax0Var.u();
                    if (ax0VarU != null) {
                        i = ax0VarU.f;
                    } else {
                        i = -1;
                    }
                    h7Var.e(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, he1Var.c(1024), he1Var.c(16), this.c.a.a(i6), -1);
                } else {
                    int i10 = i9 + 2;
                    long j2 = jArr[i10];
                    z = z2;
                    if ((((int) j2) & 33554431) == i7) {
                        jArr[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
                        jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    } else {
                        i9 += 3;
                        z2 = z;
                    }
                }
            }
        } else {
            z = z2;
            ax0VarU = ax0Var.u();
            if (ax0VarU != null) {
                i = ax0VarU.f;
            } else {
                i = -1;
            }
            h7Var.e(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, he1Var.c(1024), he1Var.c(16), this.c.a.a(i6), -1);
        }
        ax0Var.j = false;
        this.e = z;
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i11 = fa1VarZ.g;
        for (int i12 = 0; i12 < i11; i12++) {
            ax0 ax0Var3 = (ax0) objArr[i12];
            if (ax0Var3.I()) {
                d(ax0Var3);
            }
        }
    }

    public final void f(ax0 ax0Var) {
        long j;
        boolean zI = ax0Var.I();
        he1 he1Var = ax0Var.I;
        if (zI && ax0Var.j) {
            ax0 ax0VarU = ax0Var.u();
            if (ax0VarU == null || ax0VarU.g) {
                j = ax0VarU == null ? 0L : 9223372034707292159L;
            } else {
                if (ax0VarU.i) {
                    ax0VarU.i = false;
                    ax0VarU.h = e(ax0VarU);
                }
                j = ax0VarU.h;
            }
            me1 me1Var = he1Var.d;
            if (ir0.a(j, 9223372034707292159L) || c(me1Var)) {
                d(ax0Var);
            } else if (ax0Var.g) {
                d(ax0Var);
                h(ax0Var);
            } else {
                long jC = ir0.c(j, me1Var.D);
                v61 v61Var = ax0Var.J.p;
                int iH0 = v61Var.h0();
                int iG0 = v61Var.g0();
                int i = ax0Var.f;
                boolean z = ax0Var.k;
                h7 h7Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    ax0Var.k = true;
                    boolean zC = he1Var.c(1024);
                    boolean zC2 = he1Var.c(16);
                    boolean zA = this.c.a.a(i);
                    if (ax0VarU != null) {
                        int i2 = ax0VarU.f;
                        int i3 = (int) (jC >> 32);
                        int i4 = (int) (jC & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) h7Var.g;
                        for (int i6 = h7Var.f - 3; i6 >= 0; i6 -= 3) {
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                h7Var.e(i5, i7, i8, i7 + iH0, i8 + iG0, i2, zC, zC2, zA, i6);
                                break;
                            }
                        }
                    } else {
                        int i9 = (int) (jC >> 32);
                        int i10 = (int) (jC & 4294967295L);
                        h7Var.e(i, i9, i10, i9 + iH0, i10 + iG0, (512 & 32) != 0 ? -1 : 0, zC, zC2, zA, -1);
                    }
                } else if (ax0VarU != null) {
                    int i11 = ax0VarU.f;
                    int i12 = (int) (jC >> 32);
                    int i13 = (int) (jC & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) h7Var.g;
                    int i15 = h7Var.f;
                    int i16 = 0;
                    loop0: while (i16 < jArr2.length - 2 && i16 < i15) {
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iH0;
                            int i20 = i18 + iG0;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = zr1.b;
                                        h7Var.i(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i16 += 3;
                                i11 = i22;
                                i12 = i23;
                                i13 = i24;
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jC >> 32);
                    int i29 = (int) (jC & 4294967295L);
                    int i30 = iH0 + i28;
                    int i31 = i29 + iG0;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) h7Var.g;
                    int i33 = h7Var.f;
                    for (int i34 = 0; i34 < jArr4.length - 2 && i34 < i33; i34 += 3) {
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if (!(i37 != 0) && !(i38 != 0)) {
                                break;
                            }
                            int i39 = zr1.b;
                            h7Var.i(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            break;
                        }
                    }
                }
            }
            ax0Var.j = false;
            this.e = true;
            i();
        }
    }

    public final void g(ax0 ax0Var) {
        if (ax0Var.k) {
            int i = ax0Var.f & 33554431;
            h7 h7Var = this.b;
            long[] jArr = (long[]) h7Var.g;
            int i2 = h7Var.f;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = zr1.a;
                    break;
                }
            }
            ax0Var.k = false;
            ax0Var.j = true;
            this.e = true;
            this.g = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        o4 o4Var = this.h;
        boolean z = o4Var != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            e5 e5Var = this.a;
            if (o4Var != null) {
                e5Var.removeCallbacks(o4Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.i = jMax;
            o4 o4Var2 = new o4(0, this.j);
            e5Var.postDelayed(o4Var2, jMax - jCurrentTimeMillis);
            this.h = o4Var2;
        }
    }
}

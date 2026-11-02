package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bi {
    static {
        mx.a(40.0f, 40.0f);
    }

    public static final void a(final te2 te2Var, final ej0 ej0Var, final u71 u71Var, final boolean z, final vf2 vf2Var, final aw0 aw0Var, final zv0 zv0Var, final boolean z2, final int i, final int i2, final io2 io2Var, ej0 ej0Var2, final f91 f91Var, final o72 o72Var, final gt gtVar, ak0 ak0Var, final int i3) {
        final ej0 ej0Var3;
        ej0 ej0Var4;
        ak0Var.X(-971111025);
        int i4 = i3 | (ak0Var.f(te2Var) ? 4 : 2) | (ak0Var.h(ej0Var) ? 32 : 16) | (ak0Var.f(u71Var) ? 256 : 128) | (ak0Var.g(z) ? 2048 : 1024) | (ak0Var.g(false) ? 16384 : 8192) | (ak0Var.f(vf2Var) ? 131072 : 65536) | (ak0Var.f(aw0Var) ? 1048576 : 524288) | (ak0Var.f(zv0Var) ? 8388608 : 4194304) | (ak0Var.g(z2) ? 67108864 : 33554432) | (ak0Var.d(i) ? 536870912 : 268435456);
        int i5 = 196608 | (ak0Var.d(i2) ? 4 : 2) | (ak0Var.f(io2Var) ? 32 : 16) | 384 | (ak0Var.f(f91Var) ? 2048 : 1024) | (ak0Var.f(o72Var) ? 16384 : 8192);
        if (ak0Var.O(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            ak0Var.T();
            int i6 = i3 & 1;
            is1 is1Var = cv.a;
            if (i6 == 0 || ak0Var.y()) {
                Object objL = ak0Var.L();
                if (objL == is1Var) {
                    objL = new s1(7);
                    ak0Var.g0(objL);
                }
                ej0Var4 = (ej0) objL;
            } else {
                ak0Var.R();
                ej0Var4 = ej0Var2;
            }
            ak0Var.q();
            oo0 oo0VarA = aw0Var.a(z2);
            boolean z3 = !z2;
            int i7 = z2 ? 1 : i2;
            int i8 = z2 ? 1 : i;
            boolean z4 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objL2 = ak0Var.L();
            if (z4 || objL2 == is1Var) {
                objL2 = new d(5, te2Var, ej0Var);
                ak0Var.g0(objL2);
            }
            int i9 = i5 << 9;
            int i10 = (i4 & 910) | ((i4 >> 6) & 7168) | (i9 & 57344) | 196608 | (i9 & 3670016) | (i9 & 29360128);
            int i11 = ((i4 >> 15) & 896) | (i4 & 7168) | (i4 & 57344) | 196608;
            ej0 ej0Var5 = ej0Var4;
            sv.c(te2Var, (ej0) objL2, u71Var, vf2Var, io2Var, ej0Var5, f91Var, o72Var, z3, i8, i7, oo0VarA, zv0Var, z, false, gtVar, ak0Var, i10, i11);
            ej0Var3 = ej0Var5;
        } else {
            ak0Var.R();
            ej0Var3 = ej0Var2;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(ej0Var, u71Var, z, vf2Var, aw0Var, zv0Var, z2, i, i2, io2Var, ej0Var3, f91Var, o72Var, gtVar, i3) { // from class: ai
                public final /* synthetic */ ej0 f;
                public final /* synthetic */ u71 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ vf2 i;
                public final /* synthetic */ aw0 j;
                public final /* synthetic */ zv0 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ int m;
                public final /* synthetic */ int n;
                public final /* synthetic */ io2 o;
                public final /* synthetic */ ej0 p;
                public final /* synthetic */ f91 q;
                public final /* synthetic */ o72 r;
                public final /* synthetic */ gt s;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    bi.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:134:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x020a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x023b  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0251  */
    /* JADX WARN: Code duplicated, block: B:171:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x025b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0274  */
    /* JADX WARN: Code duplicated, block: B:176:0x0277  */
    /* JADX WARN: Code duplicated, block: B:178:0x027b  */
    /* JADX WARN: Code duplicated, block: B:179:0x027e  */
    /* JADX WARN: Code duplicated, block: B:182:0x028c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0298  */
    /* JADX WARN: Code duplicated, block: B:189:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    public static final void b(String str, ej0 ej0Var, u71 u71Var, boolean z, boolean z2, vf2 vf2Var, aw0 aw0Var, zv0 zv0Var, boolean z3, int i, int i2, io2 io2Var, ej0 ej0Var2, f91 f91Var, o72 o72Var, gt gtVar, ak0 ak0Var, int i3, int i4) {
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        zv0 zv0Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z6;
        boolean z7;
        ej0 ej0Var3;
        f91 f91Var2;
        boolean z8;
        boolean z9;
        zv0 zv0Var3;
        int i22;
        int i23;
        lr1 lr1VarR;
        int i24;
        Object obj;
        int i25;
        int i26;
        Object objL;
        f91 f91Var3;
        ej0 ej0Var4;
        int i27;
        f91 f91Var4;
        boolean z10;
        int i28;
        Object objL2;
        da1 da1Var;
        te2 te2Var;
        boolean zF;
        Object objL3;
        boolean z11;
        Object objL4;
        da1 da1Var2;
        boolean z12;
        int i29;
        int i30;
        boolean z13;
        Object objL5;
        int i31;
        int i32;
        int i33;
        ak0Var.X(2026950908);
        if ((i3 & 6) == 0) {
            i5 = (ak0Var.f(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= ak0Var.f(u71Var) ? 256 : 128;
        }
        int i34 = i4 & 8;
        if (i34 == 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                i5 |= ak0Var.g(z4) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (ak0Var.g(z5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((i3 & 196608) == 0) {
                    if (ak0Var.f(vf2Var)) {
                        i33 = 131072;
                    } else {
                        i33 = 65536;
                    }
                    i5 |= i33;
                }
                if ((i3 & 1572864) == 0) {
                    if (ak0Var.f(aw0Var)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i5 |= i32;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    zv0Var2 = zv0Var;
                } else {
                    zv0Var2 = zv0Var;
                    if ((i3 & 12582912) == 0) {
                        if (ak0Var.f(zv0Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i5 |= i9;
                    }
                }
                if ((i3 & 100663296) == 0) {
                    if (ak0Var.g(z3)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i5 |= i31;
                }
                if ((i3 & 805306368) == 0) {
                    if ((i4 & 512) == 0) {
                        i10 = i;
                        int i35 = ak0Var.d(i10) ? 536870912 : 268435456;
                        i5 |= i35;
                    } else {
                        i10 = i;
                    }
                    i5 |= i35;
                } else {
                    i10 = i;
                }
                i11 = i4 & 1024;
                if (i11 != 0) {
                    i13 = 196614;
                } else {
                    if (ak0Var.d(i2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i13 = 196608 | i12;
                }
                if (ak0Var.f(io2Var)) {
                    i14 = 32;
                } else {
                    i14 = 16;
                }
                i15 = i13 | i14;
                i16 = i5;
                i17 = i15 | 384;
                i18 = i4 & 8192;
                if (i18 != 0) {
                    i20 = i15 | 3456;
                } else {
                    if (ak0Var.f(f91Var)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i20 = i17 | i19;
                }
                i21 = i20 | (ak0Var.f(o72Var) ? 16384 : 8192);
                if ((i16 & 306783379) == 306783378 || (i21 & 74899) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (ak0Var.O(i16 & 1, z6)) {
                    ak0Var.T();
                    i24 = i3 & 1;
                    obj = cv.a;
                    if (i24 != 0 || ak0Var.y()) {
                        if (i34 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            z5 = false;
                        }
                        if (i8 != 0) {
                            zv0Var2 = zv0.a;
                        }
                        if ((i4 & 512) != 0) {
                            if (z3) {
                                i10 = 1;
                            } else {
                                i10 = Integer.MAX_VALUE;
                            }
                            i25 = i16 & (-1879048193);
                        } else {
                            i25 = i16;
                        }
                        if (i11 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        objL = ak0Var.L();
                        if (objL == obj) {
                            objL = new s1(6);
                            ak0Var.g0(objL);
                        }
                        ej0 ej0Var5 = (ej0) objL;
                        if (i18 != 0) {
                            f91Var3 = null;
                        } else {
                            f91Var3 = f91Var;
                        }
                        int i36 = i26;
                        ej0Var4 = ej0Var5;
                        i27 = i36;
                        f91Var4 = f91Var3;
                    } else {
                        ak0Var.R();
                        if ((i4 & 512) != 0) {
                            i25 = i16 & (-1879048193);
                            i27 = i2;
                            ej0Var4 = ej0Var2;
                            f91Var4 = f91Var;
                        } else {
                            i27 = i2;
                            ej0Var4 = ej0Var2;
                            z8 = z4;
                            z10 = z5;
                            i25 = i16;
                            i28 = 6;
                            f91Var4 = f91Var;
                        }
                        zv0 zv0Var4 = zv0Var2;
                        ak0Var.q();
                        objL2 = ak0Var.L();
                        if (objL2 == obj) {
                            objL2 = y12.s(new te2(str, 0L, i28));
                            ak0Var.g0(objL2);
                        }
                        da1Var = (da1) objL2;
                        te2 te2Var2 = (te2) da1Var.getValue();
                        te2Var = new te2(new yb(str), te2Var2.b, te2Var2.c);
                        zF = ak0Var.f(te2Var);
                        objL3 = ak0Var.L();
                        if (zF || objL3 == obj) {
                            objL3 = new n1(8, te2Var, da1Var);
                            ak0Var.g0(objL3);
                        }
                        s5.v((ti0) objL3, ak0Var);
                        if ((i25 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objL4 = ak0Var.L();
                        if (z11 || objL4 == obj) {
                            objL4 = y12.s(str);
                            ak0Var.g0(objL4);
                        }
                        da1Var2 = (da1) objL4;
                        z7 = z3;
                        oo0 oo0VarA = aw0Var.a(z7);
                        boolean z14 = !z7;
                        z12 = false;
                        if (z7) {
                            i29 = 1;
                        } else {
                            i29 = i27;
                        }
                        if (z7) {
                            i30 = 1;
                        } else {
                            i30 = i10;
                        }
                        boolean zF2 = ak0Var.f(da1Var2);
                        if ((i25 & 112) == 32) {
                            z12 = true;
                        }
                        z13 = zF2 | z12;
                        objL5 = ak0Var.L();
                        if (z13 || objL5 == obj) {
                            objL5 = new o1(ej0Var, da1Var, da1Var2);
                            ak0Var.g0(objL5);
                        }
                        int i37 = i21 << 9;
                        sv.c(te2Var, (ej0) objL5, u71Var, vf2Var, io2Var, ej0Var4, f91Var4, o72Var, z14, i30, i29, oo0VarA, zv0Var4, z8, z10, gtVar, ak0Var, (i25 & 896) | ((i25 >> 6) & 7168) | (i37 & 57344) | 196608 | (3670016 & i37) | (i37 & 29360128), ((i25 >> 15) & 896) | (i25 & 7168) | (i25 & 57344) | 196608);
                        i22 = i27;
                        ej0Var3 = ej0Var4;
                        f91Var2 = f91Var4;
                        zv0Var3 = zv0Var4;
                        z9 = z10;
                    }
                    z8 = z4;
                    z10 = z5;
                    i28 = 6;
                    zv0 zv0Var5 = zv0Var2;
                    ak0Var.q();
                    objL2 = ak0Var.L();
                    if (objL2 == obj) {
                        objL2 = y12.s(new te2(str, 0L, i28));
                        ak0Var.g0(objL2);
                    }
                    da1Var = (da1) objL2;
                    te2 te2Var3 = (te2) da1Var.getValue();
                    te2Var = new te2(new yb(str), te2Var3.b, te2Var3.c);
                    zF = ak0Var.f(te2Var);
                    objL3 = ak0Var.L();
                    if (zF) {
                        objL3 = new n1(8, te2Var, da1Var);
                        ak0Var.g0(objL3);
                    } else {
                        objL3 = new n1(8, te2Var, da1Var);
                        ak0Var.g0(objL3);
                    }
                    s5.v((ti0) objL3, ak0Var);
                    if ((i25 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objL4 = ak0Var.L();
                    if (z11) {
                        objL4 = y12.s(str);
                        ak0Var.g0(objL4);
                    } else {
                        objL4 = y12.s(str);
                        ak0Var.g0(objL4);
                    }
                    da1Var2 = (da1) objL4;
                    z7 = z3;
                    oo0 oo0VarA2 = aw0Var.a(z7);
                    boolean z15 = !z7;
                    z12 = false;
                    if (z7) {
                        i29 = 1;
                    } else {
                        i29 = i27;
                    }
                    if (z7) {
                        i30 = 1;
                    } else {
                        i30 = i10;
                    }
                    boolean zF3 = ak0Var.f(da1Var2);
                    if ((i25 & 112) == 32) {
                        z12 = true;
                    }
                    z13 = zF3 | z12;
                    objL5 = ak0Var.L();
                    if (z13) {
                        objL5 = new o1(ej0Var, da1Var, da1Var2);
                        ak0Var.g0(objL5);
                    } else {
                        objL5 = new o1(ej0Var, da1Var, da1Var2);
                        ak0Var.g0(objL5);
                    }
                    int i38 = i21 << 9;
                    sv.c(te2Var, (ej0) objL5, u71Var, vf2Var, io2Var, ej0Var4, f91Var4, o72Var, z15, i30, i29, oo0VarA2, zv0Var5, z8, z10, gtVar, ak0Var, (i25 & 896) | ((i25 >> 6) & 7168) | (i38 & 57344) | 196608 | (3670016 & i38) | (i38 & 29360128), ((i25 >> 15) & 896) | (i25 & 7168) | (i25 & 57344) | 196608);
                    i22 = i27;
                    ej0Var3 = ej0Var4;
                    f91Var2 = f91Var4;
                    zv0Var3 = zv0Var5;
                    z9 = z10;
                } else {
                    z7 = z3;
                    ak0Var.R();
                    ej0Var3 = ej0Var2;
                    f91Var2 = f91Var;
                    z8 = z4;
                    z9 = z5;
                    zv0Var3 = zv0Var2;
                    i22 = i2;
                }
                i23 = i10;
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new zh(str, ej0Var, u71Var, z8, z9, vf2Var, aw0Var, zv0Var3, z7, i23, i22, io2Var, ej0Var3, f91Var2, o72Var, gtVar, i3, i4);
                }
            }
            i5 |= 24576;
            z5 = z2;
            if ((i3 & 196608) == 0) {
                if (ak0Var.f(vf2Var)) {
                    i33 = 131072;
                } else {
                    i33 = 65536;
                }
                i5 |= i33;
            }
            if ((i3 & 1572864) == 0) {
                if (ak0Var.f(aw0Var)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i5 |= i32;
            }
            i8 = i4 & 128;
            if (i8 != 0) {
                i5 |= 12582912;
                zv0Var2 = zv0Var;
            } else {
                zv0Var2 = zv0Var;
                if ((i3 & 12582912) == 0) {
                    if (ak0Var.f(zv0Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i5 |= i9;
                }
            }
            if ((i3 & 100663296) == 0) {
                if (ak0Var.g(z3)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i5 |= i31;
            }
            if ((i3 & 805306368) == 0) {
                if ((i4 & 512) == 0) {
                    i10 = i;
                    if (ak0Var.d(i10)) {
                    }
                    i5 |= i35;
                } else {
                    i10 = i;
                }
                i5 |= i35;
            } else {
                i10 = i;
            }
            i11 = i4 & 1024;
            if (i11 != 0) {
                i13 = 196614;
            } else {
                if (ak0Var.d(i2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i13 = 196608 | i12;
            }
            if (ak0Var.f(io2Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i15 = i13 | i14;
            i16 = i5;
            i17 = i15 | 384;
            i18 = i4 & 8192;
            if (i18 != 0) {
                i20 = i15 | 3456;
            } else {
                if (ak0Var.f(f91Var)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i20 = i17 | i19;
            }
            i21 = i20 | (ak0Var.f(o72Var) ? 16384 : 8192);
            if ((i16 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (ak0Var.O(i16 & 1, z6)) {
                ak0Var.T();
                i24 = i3 & 1;
                obj = cv.a;
                if (i24 != 0) {
                    if (i34 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        z5 = false;
                    }
                    if (i8 != 0) {
                        zv0Var2 = zv0.a;
                    }
                    if ((i4 & 512) != 0) {
                        if (z3) {
                            i10 = 1;
                        } else {
                            i10 = Integer.MAX_VALUE;
                        }
                        i25 = i16 & (-1879048193);
                    } else {
                        i25 = i16;
                    }
                    if (i11 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    objL = ak0Var.L();
                    if (objL == obj) {
                        objL = new s1(6);
                        ak0Var.g0(objL);
                    }
                    ej0 ej0Var6 = (ej0) objL;
                    if (i18 != 0) {
                        f91Var3 = null;
                    } else {
                        f91Var3 = f91Var;
                    }
                    int i39 = i26;
                    ej0Var4 = ej0Var6;
                    i27 = i39;
                    f91Var4 = f91Var3;
                    z8 = z4;
                    z10 = z5;
                    i28 = 6;
                } else {
                    if (i34 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        z5 = false;
                    }
                    if (i8 != 0) {
                        zv0Var2 = zv0.a;
                    }
                    if ((i4 & 512) != 0) {
                        if (z3) {
                            i10 = 1;
                        } else {
                            i10 = Integer.MAX_VALUE;
                        }
                        i25 = i16 & (-1879048193);
                    } else {
                        i25 = i16;
                    }
                    if (i11 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    objL = ak0Var.L();
                    if (objL == obj) {
                        objL = new s1(6);
                        ak0Var.g0(objL);
                    }
                    ej0 ej0Var7 = (ej0) objL;
                    if (i18 != 0) {
                        f91Var3 = null;
                    } else {
                        f91Var3 = f91Var;
                    }
                    int i310 = i26;
                    ej0Var4 = ej0Var7;
                    i27 = i310;
                    f91Var4 = f91Var3;
                    z8 = z4;
                    z10 = z5;
                    i28 = 6;
                }
                zv0 zv0Var6 = zv0Var2;
                ak0Var.q();
                objL2 = ak0Var.L();
                if (objL2 == obj) {
                    objL2 = y12.s(new te2(str, 0L, i28));
                    ak0Var.g0(objL2);
                }
                da1Var = (da1) objL2;
                te2 te2Var4 = (te2) da1Var.getValue();
                te2Var = new te2(new yb(str), te2Var4.b, te2Var4.c);
                zF = ak0Var.f(te2Var);
                objL3 = ak0Var.L();
                if (zF) {
                    objL3 = new n1(8, te2Var, da1Var);
                    ak0Var.g0(objL3);
                } else {
                    objL3 = new n1(8, te2Var, da1Var);
                    ak0Var.g0(objL3);
                }
                s5.v((ti0) objL3, ak0Var);
                if ((i25 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objL4 = ak0Var.L();
                if (z11) {
                    objL4 = y12.s(str);
                    ak0Var.g0(objL4);
                } else {
                    objL4 = y12.s(str);
                    ak0Var.g0(objL4);
                }
                da1Var2 = (da1) objL4;
                z7 = z3;
                oo0 oo0VarA3 = aw0Var.a(z7);
                boolean z16 = !z7;
                z12 = false;
                if (z7) {
                    i29 = 1;
                } else {
                    i29 = i27;
                }
                if (z7) {
                    i30 = 1;
                } else {
                    i30 = i10;
                }
                boolean zF4 = ak0Var.f(da1Var2);
                if ((i25 & 112) == 32) {
                    z12 = true;
                }
                z13 = zF4 | z12;
                objL5 = ak0Var.L();
                if (z13) {
                    objL5 = new o1(ej0Var, da1Var, da1Var2);
                    ak0Var.g0(objL5);
                } else {
                    objL5 = new o1(ej0Var, da1Var, da1Var2);
                    ak0Var.g0(objL5);
                }
                int i311 = i21 << 9;
                sv.c(te2Var, (ej0) objL5, u71Var, vf2Var, io2Var, ej0Var4, f91Var4, o72Var, z16, i30, i29, oo0VarA3, zv0Var6, z8, z10, gtVar, ak0Var, (i25 & 896) | ((i25 >> 6) & 7168) | (i311 & 57344) | 196608 | (3670016 & i311) | (i311 & 29360128), ((i25 >> 15) & 896) | (i25 & 7168) | (i25 & 57344) | 196608);
                i22 = i27;
                ej0Var3 = ej0Var4;
                f91Var2 = f91Var4;
                zv0Var3 = zv0Var6;
                z9 = z10;
            } else {
                z7 = z3;
                ak0Var.R();
                ej0Var3 = ej0Var2;
                f91Var2 = f91Var;
                z8 = z4;
                z9 = z5;
                zv0Var3 = zv0Var2;
                i22 = i2;
            }
            i23 = i10;
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new zh(str, ej0Var, u71Var, z8, z9, vf2Var, aw0Var, zv0Var3, z7, i23, i22, io2Var, ej0Var3, f91Var2, o72Var, gtVar, i3, i4);
            }
        }
        i5 |= 3072;
        z4 = z;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (ak0Var.g(z5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i3 & 196608) == 0) {
                if (ak0Var.f(vf2Var)) {
                    i33 = 131072;
                } else {
                    i33 = 65536;
                }
                i5 |= i33;
            }
            if ((i3 & 1572864) == 0) {
                if (ak0Var.f(aw0Var)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i5 |= i32;
            }
            i8 = i4 & 128;
            if (i8 != 0) {
                i5 |= 12582912;
                zv0Var2 = zv0Var;
            } else {
                zv0Var2 = zv0Var;
                if ((i3 & 12582912) == 0) {
                    if (ak0Var.f(zv0Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i5 |= i9;
                }
            }
            if ((i3 & 100663296) == 0) {
                if (ak0Var.g(z3)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i5 |= i31;
            }
            if ((i3 & 805306368) == 0) {
                if ((i4 & 512) == 0) {
                    i10 = i;
                    if (ak0Var.d(i10)) {
                    }
                    i5 |= i35;
                } else {
                    i10 = i;
                }
                i5 |= i35;
            } else {
                i10 = i;
            }
            i11 = i4 & 1024;
            if (i11 != 0) {
                i13 = 196614;
            } else {
                if (ak0Var.d(i2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i13 = 196608 | i12;
            }
            if (ak0Var.f(io2Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i15 = i13 | i14;
            i16 = i5;
            i17 = i15 | 384;
            i18 = i4 & 8192;
            if (i18 != 0) {
                i20 = i15 | 3456;
            } else {
                if (ak0Var.f(f91Var)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i20 = i17 | i19;
            }
            i21 = i20 | (ak0Var.f(o72Var) ? 16384 : 8192);
            if ((i16 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (ak0Var.O(i16 & 1, z6)) {
                ak0Var.T();
                i24 = i3 & 1;
                obj = cv.a;
                if (i24 != 0) {
                    if (i34 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        z5 = false;
                    }
                    if (i8 != 0) {
                        zv0Var2 = zv0.a;
                    }
                    if ((i4 & 512) != 0) {
                        if (z3) {
                            i10 = 1;
                        } else {
                            i10 = Integer.MAX_VALUE;
                        }
                        i25 = i16 & (-1879048193);
                    } else {
                        i25 = i16;
                    }
                    if (i11 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    objL = ak0Var.L();
                    if (objL == obj) {
                        objL = new s1(6);
                        ak0Var.g0(objL);
                    }
                    ej0 ej0Var8 = (ej0) objL;
                    if (i18 != 0) {
                        f91Var3 = null;
                    } else {
                        f91Var3 = f91Var;
                    }
                    int i312 = i26;
                    ej0Var4 = ej0Var8;
                    i27 = i312;
                    f91Var4 = f91Var3;
                    z8 = z4;
                    z10 = z5;
                    i28 = 6;
                } else {
                    if (i34 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        z5 = false;
                    }
                    if (i8 != 0) {
                        zv0Var2 = zv0.a;
                    }
                    if ((i4 & 512) != 0) {
                        if (z3) {
                            i10 = 1;
                        } else {
                            i10 = Integer.MAX_VALUE;
                        }
                        i25 = i16 & (-1879048193);
                    } else {
                        i25 = i16;
                    }
                    if (i11 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    objL = ak0Var.L();
                    if (objL == obj) {
                        objL = new s1(6);
                        ak0Var.g0(objL);
                    }
                    ej0 ej0Var9 = (ej0) objL;
                    if (i18 != 0) {
                        f91Var3 = null;
                    } else {
                        f91Var3 = f91Var;
                    }
                    int i313 = i26;
                    ej0Var4 = ej0Var9;
                    i27 = i313;
                    f91Var4 = f91Var3;
                    z8 = z4;
                    z10 = z5;
                    i28 = 6;
                }
                zv0 zv0Var7 = zv0Var2;
                ak0Var.q();
                objL2 = ak0Var.L();
                if (objL2 == obj) {
                    objL2 = y12.s(new te2(str, 0L, i28));
                    ak0Var.g0(objL2);
                }
                da1Var = (da1) objL2;
                te2 te2Var5 = (te2) da1Var.getValue();
                te2Var = new te2(new yb(str), te2Var5.b, te2Var5.c);
                zF = ak0Var.f(te2Var);
                objL3 = ak0Var.L();
                if (zF) {
                    objL3 = new n1(8, te2Var, da1Var);
                    ak0Var.g0(objL3);
                } else {
                    objL3 = new n1(8, te2Var, da1Var);
                    ak0Var.g0(objL3);
                }
                s5.v((ti0) objL3, ak0Var);
                if ((i25 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objL4 = ak0Var.L();
                if (z11) {
                    objL4 = y12.s(str);
                    ak0Var.g0(objL4);
                } else {
                    objL4 = y12.s(str);
                    ak0Var.g0(objL4);
                }
                da1Var2 = (da1) objL4;
                z7 = z3;
                oo0 oo0VarA4 = aw0Var.a(z7);
                boolean z17 = !z7;
                z12 = false;
                if (z7) {
                    i29 = 1;
                } else {
                    i29 = i27;
                }
                if (z7) {
                    i30 = 1;
                } else {
                    i30 = i10;
                }
                boolean zF5 = ak0Var.f(da1Var2);
                if ((i25 & 112) == 32) {
                    z12 = true;
                }
                z13 = zF5 | z12;
                objL5 = ak0Var.L();
                if (z13) {
                    objL5 = new o1(ej0Var, da1Var, da1Var2);
                    ak0Var.g0(objL5);
                } else {
                    objL5 = new o1(ej0Var, da1Var, da1Var2);
                    ak0Var.g0(objL5);
                }
                int i314 = i21 << 9;
                sv.c(te2Var, (ej0) objL5, u71Var, vf2Var, io2Var, ej0Var4, f91Var4, o72Var, z17, i30, i29, oo0VarA4, zv0Var7, z8, z10, gtVar, ak0Var, (i25 & 896) | ((i25 >> 6) & 7168) | (i314 & 57344) | 196608 | (3670016 & i314) | (i314 & 29360128), ((i25 >> 15) & 896) | (i25 & 7168) | (i25 & 57344) | 196608);
                i22 = i27;
                ej0Var3 = ej0Var4;
                f91Var2 = f91Var4;
                zv0Var3 = zv0Var7;
                z9 = z10;
            } else {
                z7 = z3;
                ak0Var.R();
                ej0Var3 = ej0Var2;
                f91Var2 = f91Var;
                z8 = z4;
                z9 = z5;
                zv0Var3 = zv0Var2;
                i22 = i2;
            }
            i23 = i10;
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new zh(str, ej0Var, u71Var, z8, z9, vf2Var, aw0Var, zv0Var3, z7, i23, i22, io2Var, ej0Var3, f91Var2, o72Var, gtVar, i3, i4);
            }
        }
        i5 |= 24576;
        z5 = z2;
        if ((i3 & 196608) == 0) {
            if (ak0Var.f(vf2Var)) {
                i33 = 131072;
            } else {
                i33 = 65536;
            }
            i5 |= i33;
        }
        if ((i3 & 1572864) == 0) {
            if (ak0Var.f(aw0Var)) {
                i32 = 1048576;
            } else {
                i32 = 524288;
            }
            i5 |= i32;
        }
        i8 = i4 & 128;
        if (i8 != 0) {
            i5 |= 12582912;
            zv0Var2 = zv0Var;
        } else {
            zv0Var2 = zv0Var;
            if ((i3 & 12582912) == 0) {
                if (ak0Var.f(zv0Var2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i5 |= i9;
            }
        }
        if ((i3 & 100663296) == 0) {
            if (ak0Var.g(z3)) {
                i31 = 67108864;
            } else {
                i31 = 33554432;
            }
            i5 |= i31;
        }
        if ((i3 & 805306368) == 0) {
            if ((i4 & 512) == 0) {
                i10 = i;
                if (ak0Var.d(i10)) {
                }
                i5 |= i35;
            } else {
                i10 = i;
            }
            i5 |= i35;
        } else {
            i10 = i;
        }
        i11 = i4 & 1024;
        if (i11 != 0) {
            i13 = 196614;
        } else {
            if (ak0Var.d(i2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i13 = 196608 | i12;
        }
        if (ak0Var.f(io2Var)) {
            i14 = 32;
        } else {
            i14 = 16;
        }
        i15 = i13 | i14;
        i16 = i5;
        i17 = i15 | 384;
        i18 = i4 & 8192;
        if (i18 != 0) {
            i20 = i15 | 3456;
        } else {
            if (ak0Var.f(f91Var)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i20 = i17 | i19;
        }
        i21 = i20 | (ak0Var.f(o72Var) ? 16384 : 8192);
        if ((i16 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (ak0Var.O(i16 & 1, z6)) {
            ak0Var.T();
            i24 = i3 & 1;
            obj = cv.a;
            if (i24 != 0) {
                if (i34 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    z5 = false;
                }
                if (i8 != 0) {
                    zv0Var2 = zv0.a;
                }
                if ((i4 & 512) != 0) {
                    if (z3) {
                        i10 = 1;
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    i25 = i16 & (-1879048193);
                } else {
                    i25 = i16;
                }
                if (i11 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                objL = ak0Var.L();
                if (objL == obj) {
                    objL = new s1(6);
                    ak0Var.g0(objL);
                }
                ej0 ej0Var10 = (ej0) objL;
                if (i18 != 0) {
                    f91Var3 = null;
                } else {
                    f91Var3 = f91Var;
                }
                int i315 = i26;
                ej0Var4 = ej0Var10;
                i27 = i315;
                f91Var4 = f91Var3;
                z8 = z4;
                z10 = z5;
                i28 = 6;
            } else {
                if (i34 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    z5 = false;
                }
                if (i8 != 0) {
                    zv0Var2 = zv0.a;
                }
                if ((i4 & 512) != 0) {
                    if (z3) {
                        i10 = 1;
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    i25 = i16 & (-1879048193);
                } else {
                    i25 = i16;
                }
                if (i11 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                objL = ak0Var.L();
                if (objL == obj) {
                    objL = new s1(6);
                    ak0Var.g0(objL);
                }
                ej0 ej0Var11 = (ej0) objL;
                if (i18 != 0) {
                    f91Var3 = null;
                } else {
                    f91Var3 = f91Var;
                }
                int i316 = i26;
                ej0Var4 = ej0Var11;
                i27 = i316;
                f91Var4 = f91Var3;
                z8 = z4;
                z10 = z5;
                i28 = 6;
            }
            zv0 zv0Var8 = zv0Var2;
            ak0Var.q();
            objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = y12.s(new te2(str, 0L, i28));
                ak0Var.g0(objL2);
            }
            da1Var = (da1) objL2;
            te2 te2Var6 = (te2) da1Var.getValue();
            te2Var = new te2(new yb(str), te2Var6.b, te2Var6.c);
            zF = ak0Var.f(te2Var);
            objL3 = ak0Var.L();
            if (zF) {
                objL3 = new n1(8, te2Var, da1Var);
                ak0Var.g0(objL3);
            } else {
                objL3 = new n1(8, te2Var, da1Var);
                ak0Var.g0(objL3);
            }
            s5.v((ti0) objL3, ak0Var);
            if ((i25 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objL4 = ak0Var.L();
            if (z11) {
                objL4 = y12.s(str);
                ak0Var.g0(objL4);
            } else {
                objL4 = y12.s(str);
                ak0Var.g0(objL4);
            }
            da1Var2 = (da1) objL4;
            z7 = z3;
            oo0 oo0VarA5 = aw0Var.a(z7);
            boolean z18 = !z7;
            z12 = false;
            if (z7) {
                i29 = 1;
            } else {
                i29 = i27;
            }
            if (z7) {
                i30 = 1;
            } else {
                i30 = i10;
            }
            boolean zF6 = ak0Var.f(da1Var2);
            if ((i25 & 112) == 32) {
                z12 = true;
            }
            z13 = zF6 | z12;
            objL5 = ak0Var.L();
            if (z13) {
                objL5 = new o1(ej0Var, da1Var, da1Var2);
                ak0Var.g0(objL5);
            } else {
                objL5 = new o1(ej0Var, da1Var, da1Var2);
                ak0Var.g0(objL5);
            }
            int i317 = i21 << 9;
            sv.c(te2Var, (ej0) objL5, u71Var, vf2Var, io2Var, ej0Var4, f91Var4, o72Var, z18, i30, i29, oo0VarA5, zv0Var8, z8, z10, gtVar, ak0Var, (i25 & 896) | ((i25 >> 6) & 7168) | (i317 & 57344) | 196608 | (3670016 & i317) | (i317 & 29360128), ((i25 >> 15) & 896) | (i25 & 7168) | (i25 & 57344) | 196608);
            i22 = i27;
            ej0Var3 = ej0Var4;
            f91Var2 = f91Var4;
            zv0Var3 = zv0Var8;
            z9 = z10;
        } else {
            z7 = z3;
            ak0Var.R();
            ej0Var3 = ej0Var2;
            f91Var2 = f91Var;
            z8 = z4;
            z9 = z5;
            zv0Var3 = zv0Var2;
            i22 = i2;
        }
        i23 = i10;
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new zh(str, ej0Var, u71Var, z8, z9, vf2Var, aw0Var, zv0Var3, z7, i23, i22, io2Var, ej0Var3, f91Var2, o72Var, gtVar, i3, i4);
        }
    }
}

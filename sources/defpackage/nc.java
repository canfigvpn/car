package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nc {
    public static final a90 a = new a90(0, new m2(3));
    public static final float b;
    public static final float c;

    static {
        new w01(new m2(4));
        new oz(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final u71 u71Var, final gt gtVar, final vf2 vf2Var, final vf2 vf2Var2, final ij0 ij0Var, final jj0 jj0Var, final float f, final uo2 uo2Var, final nh2 nh2Var, ak0 ak0Var, final int i, final int i2) {
        int i3;
        jj0 jj0Var2;
        float f2;
        int i4;
        ui uiVar = q90.r;
        ak0Var.X(-2033800111);
        if ((i & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ak0Var.f(vf2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ak0Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.f(vf2Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ak0Var.f(uiVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            jj0Var2 = jj0Var;
            i3 |= ak0Var.h(jj0Var2) ? 8388608 : 4194304;
        } else {
            jj0Var2 = jj0Var;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= ak0Var.c(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= ak0Var.f(uo2Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var.f(nh2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.f(null) ? 32 : 16;
        }
        if (ak0Var.O(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((r30) ak0Var.j(a)).a(new z42(u71Var, gtVar, vf2Var, vf2Var2, ij0Var, jj0Var2, f2, uo2Var, nh2Var), ak0Var, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: kc
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nc.a(u71Var, gtVar, vf2Var, vf2Var2, ij0Var, jj0Var, f, uo2Var, nh2Var, (ak0) obj, ei1.P(i | 1), ei1.P(i2));
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void b(final gt gtVar, u71 u71Var, ij0 ij0Var, jj0 jj0Var, float f, uo2 uo2Var, nh2 nh2Var, ak0 ak0Var, final int i, final int i2) {
        ij0 ij0Var2;
        int i3;
        final jj0 jj0Var2;
        int i4;
        int i5;
        boolean z;
        final float f2;
        final uo2 uo2Var2;
        final nh2 nh2Var2;
        final ij0 ij0Var3;
        final u71 u71Var2;
        lr1 lr1VarR;
        float f3;
        ij0 ij0Var4;
        jj0 jj0Var3;
        jr jrVar;
        nh2 nh2Var3;
        nh2 nh2Var4;
        jj0 jj0Var4;
        uo2 uo2Var3;
        nh2 nh2Var5;
        ij0 ij0Var5;
        float f4;
        int i6;
        u71 u71Var3;
        ak0Var.X(1784421840);
        int i7 = i | 48;
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                ij0Var2 = ij0Var;
                i7 |= ak0Var.h(ij0Var2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    jj0Var2 = jj0Var;
                    if (ak0Var.h(jj0Var2)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i7 |= i4;
                }
                i5 = i7 | 13197312;
                if ((4793491 & i5) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (ak0Var.O(i5 & 1, z)) {
                    ak0Var.T();
                    f3 = 64.0f;
                    if ((i & 1) != 0 || ak0Var.y()) {
                        if (i8 != 0) {
                            ij0Var4 = mt.a;
                        } else {
                            ij0Var4 = ij0Var2;
                        }
                        if (i3 != 0) {
                            jj0Var3 = mt.b;
                        } else {
                            jj0Var3 = jj0Var2;
                        }
                        WeakHashMap weakHashMap = fq2.v;
                        h21 h21Var = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                        jrVar = (jr) ak0Var.j(lr.a);
                        nh2Var3 = jrVar.a0;
                        if (nh2Var3 == null) {
                            nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                            jrVar.a0 = nh2Var4;
                        } else {
                            nh2Var4 = nh2Var3;
                        }
                        jj0Var4 = jj0Var3;
                        uo2Var3 = h21Var;
                        nh2Var5 = nh2Var4;
                        ij0Var5 = ij0Var4;
                        f4 = 64.0f;
                        i6 = i5 & (-4128769);
                        u71Var3 = r71.a;
                    } else {
                        ak0Var.R();
                        f4 = f;
                        uo2Var3 = uo2Var;
                        nh2Var5 = nh2Var;
                        i6 = i5 & (-4128769);
                        jj0Var4 = jj0Var2;
                        u71Var3 = u71Var;
                        ij0Var5 = ij0Var2;
                    }
                    ak0Var.q();
                    vf2 vf2VarA = ik2.a(nj2.a, ak0Var);
                    vf2 vf2Var = vf2.d;
                    if (!w60.b(f4, Float.NaN) && !w60.b(f4, Float.POSITIVE_INFINITY)) {
                        f3 = f4;
                    }
                    int i9 = i6 << 12;
                    a(u71Var3, gtVar, vf2VarA, vf2Var, ij0Var5, jj0Var4, f3, uo2Var3, nh2Var5, ak0Var, (3670016 & i9) | 224310 | (i9 & 29360128), 48);
                    u71Var2 = u71Var3;
                    ij0Var3 = ij0Var5;
                    jj0Var2 = jj0Var4;
                    uo2Var2 = uo2Var3;
                    nh2Var2 = nh2Var5;
                    f2 = f4;
                } else {
                    ak0Var.R();
                    f2 = f;
                    uo2Var2 = uo2Var;
                    nh2Var2 = nh2Var;
                    ij0Var3 = ij0Var2;
                    u71Var2 = u71Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: jc
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nc.b(gtVar, u71Var2, ij0Var3, jj0Var2, f2, uo2Var2, nh2Var2, (ak0) obj, ei1.P(i | 1), i2);
                            return ll2.a;
                        }
                    };
                }
            }
            i7 |= 3072;
            jj0Var2 = jj0Var;
            i5 = i7 | 13197312;
            if ((4793491 & i5) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (ak0Var.O(i5 & 1, z)) {
                ak0Var.T();
                f3 = 64.0f;
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        ij0Var4 = mt.a;
                    } else {
                        ij0Var4 = ij0Var2;
                    }
                    if (i3 != 0) {
                        jj0Var3 = mt.b;
                    } else {
                        jj0Var3 = jj0Var2;
                    }
                    WeakHashMap weakHashMap2 = fq2.v;
                    h21 h21Var2 = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                    jrVar = (jr) ak0Var.j(lr.a);
                    nh2Var3 = jrVar.a0;
                    if (nh2Var3 == null) {
                        nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                        jrVar.a0 = nh2Var4;
                    } else {
                        nh2Var4 = nh2Var3;
                    }
                    jj0Var4 = jj0Var3;
                    uo2Var3 = h21Var2;
                    nh2Var5 = nh2Var4;
                    ij0Var5 = ij0Var4;
                    f4 = 64.0f;
                    i6 = i5 & (-4128769);
                    u71Var3 = r71.a;
                } else {
                    if (i8 != 0) {
                        ij0Var4 = mt.a;
                    } else {
                        ij0Var4 = ij0Var2;
                    }
                    if (i3 != 0) {
                        jj0Var3 = mt.b;
                    } else {
                        jj0Var3 = jj0Var2;
                    }
                    WeakHashMap weakHashMap3 = fq2.v;
                    h21 h21Var3 = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                    jrVar = (jr) ak0Var.j(lr.a);
                    nh2Var3 = jrVar.a0;
                    if (nh2Var3 == null) {
                        nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                        jrVar.a0 = nh2Var4;
                    } else {
                        nh2Var4 = nh2Var3;
                    }
                    jj0Var4 = jj0Var3;
                    uo2Var3 = h21Var3;
                    nh2Var5 = nh2Var4;
                    ij0Var5 = ij0Var4;
                    f4 = 64.0f;
                    i6 = i5 & (-4128769);
                    u71Var3 = r71.a;
                }
                ak0Var.q();
                vf2 vf2VarA2 = ik2.a(nj2.a, ak0Var);
                vf2 vf2Var2 = vf2.d;
                if (!w60.b(f4, Float.NaN)) {
                    f3 = f4;
                }
                int i10 = i6 << 12;
                a(u71Var3, gtVar, vf2VarA2, vf2Var2, ij0Var5, jj0Var4, f3, uo2Var3, nh2Var5, ak0Var, (3670016 & i10) | 224310 | (i10 & 29360128), 48);
                u71Var2 = u71Var3;
                ij0Var3 = ij0Var5;
                jj0Var2 = jj0Var4;
                uo2Var2 = uo2Var3;
                nh2Var2 = nh2Var5;
                f2 = f4;
            } else {
                ak0Var.R();
                f2 = f;
                uo2Var2 = uo2Var;
                nh2Var2 = nh2Var;
                ij0Var3 = ij0Var2;
                u71Var2 = u71Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: jc
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nc.b(gtVar, u71Var2, ij0Var3, jj0Var2, f2, uo2Var2, nh2Var2, (ak0) obj, ei1.P(i | 1), i2);
                        return ll2.a;
                    }
                };
            }
        }
        i7 = i | 432;
        ij0Var2 = ij0Var;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                jj0Var2 = jj0Var;
                if (ak0Var.h(jj0Var2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i7 |= i4;
            }
            i5 = i7 | 13197312;
            if ((4793491 & i5) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (ak0Var.O(i5 & 1, z)) {
                ak0Var.T();
                f3 = 64.0f;
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        ij0Var4 = mt.a;
                    } else {
                        ij0Var4 = ij0Var2;
                    }
                    if (i3 != 0) {
                        jj0Var3 = mt.b;
                    } else {
                        jj0Var3 = jj0Var2;
                    }
                    WeakHashMap weakHashMap4 = fq2.v;
                    h21 h21Var4 = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                    jrVar = (jr) ak0Var.j(lr.a);
                    nh2Var3 = jrVar.a0;
                    if (nh2Var3 == null) {
                        nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                        jrVar.a0 = nh2Var4;
                    } else {
                        nh2Var4 = nh2Var3;
                    }
                    jj0Var4 = jj0Var3;
                    uo2Var3 = h21Var4;
                    nh2Var5 = nh2Var4;
                    ij0Var5 = ij0Var4;
                    f4 = 64.0f;
                    i6 = i5 & (-4128769);
                    u71Var3 = r71.a;
                } else {
                    if (i8 != 0) {
                        ij0Var4 = mt.a;
                    } else {
                        ij0Var4 = ij0Var2;
                    }
                    if (i3 != 0) {
                        jj0Var3 = mt.b;
                    } else {
                        jj0Var3 = jj0Var2;
                    }
                    WeakHashMap weakHashMap5 = fq2.v;
                    h21 h21Var5 = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                    jrVar = (jr) ak0Var.j(lr.a);
                    nh2Var3 = jrVar.a0;
                    if (nh2Var3 == null) {
                        nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                        jrVar.a0 = nh2Var4;
                    } else {
                        nh2Var4 = nh2Var3;
                    }
                    jj0Var4 = jj0Var3;
                    uo2Var3 = h21Var5;
                    nh2Var5 = nh2Var4;
                    ij0Var5 = ij0Var4;
                    f4 = 64.0f;
                    i6 = i5 & (-4128769);
                    u71Var3 = r71.a;
                }
                ak0Var.q();
                vf2 vf2VarA3 = ik2.a(nj2.a, ak0Var);
                vf2 vf2Var3 = vf2.d;
                if (!w60.b(f4, Float.NaN)) {
                    f3 = f4;
                }
                int i11 = i6 << 12;
                a(u71Var3, gtVar, vf2VarA3, vf2Var3, ij0Var5, jj0Var4, f3, uo2Var3, nh2Var5, ak0Var, (3670016 & i11) | 224310 | (i11 & 29360128), 48);
                u71Var2 = u71Var3;
                ij0Var3 = ij0Var5;
                jj0Var2 = jj0Var4;
                uo2Var2 = uo2Var3;
                nh2Var2 = nh2Var5;
                f2 = f4;
            } else {
                ak0Var.R();
                f2 = f;
                uo2Var2 = uo2Var;
                nh2Var2 = nh2Var;
                ij0Var3 = ij0Var2;
                u71Var2 = u71Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: jc
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nc.b(gtVar, u71Var2, ij0Var3, jj0Var2, f2, uo2Var2, nh2Var2, (ak0) obj, ei1.P(i | 1), i2);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 3072;
        jj0Var2 = jj0Var;
        i5 = i7 | 13197312;
        if ((4793491 & i5) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (ak0Var.O(i5 & 1, z)) {
            ak0Var.T();
            f3 = 64.0f;
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    ij0Var4 = mt.a;
                } else {
                    ij0Var4 = ij0Var2;
                }
                if (i3 != 0) {
                    jj0Var3 = mt.b;
                } else {
                    jj0Var3 = jj0Var2;
                }
                WeakHashMap weakHashMap6 = fq2.v;
                h21 h21Var6 = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                jrVar = (jr) ak0Var.j(lr.a);
                nh2Var3 = jrVar.a0;
                if (nh2Var3 == null) {
                    nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                    jrVar.a0 = nh2Var4;
                } else {
                    nh2Var4 = nh2Var3;
                }
                jj0Var4 = jj0Var3;
                uo2Var3 = h21Var6;
                nh2Var5 = nh2Var4;
                ij0Var5 = ij0Var4;
                f4 = 64.0f;
                i6 = i5 & (-4128769);
                u71Var3 = r71.a;
            } else {
                if (i8 != 0) {
                    ij0Var4 = mt.a;
                } else {
                    ij0Var4 = ij0Var2;
                }
                if (i3 != 0) {
                    jj0Var3 = mt.b;
                } else {
                    jj0Var3 = jj0Var2;
                }
                WeakHashMap weakHashMap7 = fq2.v;
                h21 h21Var7 = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 16);
                jrVar = (jr) ak0Var.j(lr.a);
                nh2Var3 = jrVar.a0;
                if (nh2Var3 == null) {
                    nh2Var4 = new nh2(lr.d(jrVar, ir2.a), lr.d(jrVar, ir2.c), lr.d(jrVar, ir2.b), lr.d(jrVar, ir2.e), lr.d(jrVar, ir2.f), lr.d(jrVar, ir2.d));
                    jrVar.a0 = nh2Var4;
                } else {
                    nh2Var4 = nh2Var3;
                }
                jj0Var4 = jj0Var3;
                uo2Var3 = h21Var7;
                nh2Var5 = nh2Var4;
                ij0Var5 = ij0Var4;
                f4 = 64.0f;
                i6 = i5 & (-4128769);
                u71Var3 = r71.a;
            }
            ak0Var.q();
            vf2 vf2VarA4 = ik2.a(nj2.a, ak0Var);
            vf2 vf2Var4 = vf2.d;
            if (!w60.b(f4, Float.NaN)) {
                f3 = f4;
            }
            int i12 = i6 << 12;
            a(u71Var3, gtVar, vf2VarA4, vf2Var4, ij0Var5, jj0Var4, f3, uo2Var3, nh2Var5, ak0Var, (3670016 & i12) | 224310 | (i12 & 29360128), 48);
            u71Var2 = u71Var3;
            ij0Var3 = ij0Var5;
            jj0Var2 = jj0Var4;
            uo2Var2 = uo2Var3;
            nh2Var2 = nh2Var5;
            f2 = f4;
        } else {
            ak0Var.R();
            f2 = f;
            uo2Var2 = uo2Var;
            nh2Var2 = nh2Var;
            ij0Var3 = ij0Var2;
            u71Var2 = u71Var;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: jc
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nc.b(gtVar, u71Var2, ij0Var3, jj0Var2, f2, uo2Var2, nh2Var2, (ak0) obj, ei1.P(i | 1), i2);
                    return ll2.a;
                }
            };
        }
    }

    public static final void c(final u71 u71Var, final zd0 zd0Var, final long j, final long j2, final long j3, long j4, final gt gtVar, final vf2 vf2Var, final vf2 vf2Var2, ti0 ti0Var, final ij0 ij0Var, gt gtVar2, final float f, ak0 ak0Var, final int i) {
        final ti0 ti0Var2;
        gt gtVar3;
        final long j5 = j4;
        ui uiVar = q90.r;
        ak0Var.X(126395868);
        int i2 = i | (ak0Var.f(u71Var) ? 4 : 2) | (ak0Var.f(zd0Var) ? 32 : 16) | (ak0Var.e(j) ? 256 : 128) | (ak0Var.e(j2) ? 2048 : 1024) | (ak0Var.e(j3) ? 16384 : 8192) | (ak0Var.e(j5) ? 131072 : 65536) | (ak0Var.h(gtVar) ? 1048576 : 524288) | (ak0Var.f(vf2Var) ? 8388608 : 4194304) | (ak0Var.h(null) ? 67108864 : 33554432) | (ak0Var.f(vf2Var2) ? 536870912 : 268435456);
        int i3 = 1600566 | (ak0Var.f(uiVar) ? 256 : 128) | (ak0Var.h(ij0Var) ? 131072 : 65536) | (ak0Var.c(f) ? 8388608 : 4194304);
        if (ak0Var.O(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (z || objL == is1Var) {
                objL = new ph2(zd0Var, f);
                ak0Var.g0(objL);
            }
            ph2 ph2Var = (ph2) objL;
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71Var);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, ph2Var);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar3);
            }
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            r71 r71Var = r71.a;
            u71 u71VarS = vs0.s(r71Var, "navigationIcon");
            float f2 = b;
            u71 u71VarF0 = p61.f0(u71VarS, f2, 0.0f, 0.0f, 0.0f, 14);
            wi wiVar = q90.f;
            w61 w61VarC = xj.c(wiVar, false);
            int iX2 = ws0.x(ak0Var);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarF0);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC);
            p12.l(raVar2, ak0Var, sl1VarL2);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                k3.p(iX2, ak0Var, iX2, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB2);
            a90 a90Var = yw.a;
            sv.a(a90Var.a(new dr(j)), ij0Var, ak0Var, ((i3 >> 12) & 112) | 8);
            ak0Var.p(true);
            ak0Var.W(-1359701523);
            u71 u71VarE0 = p61.e0(vs0.s(r71Var, "title"), f2, 0.0f, 2);
            ak0Var.W(510340109);
            ak0Var.p(false);
            u71 u71VarC = u71VarE0.c(r71Var);
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                ti0Var2 = ti0Var;
                objL2 = new lc(0, ti0Var2);
                ak0Var.g0(objL2);
            } else {
                ti0Var2 = ti0Var;
            }
            u71 u71VarT = nj2.t(u71VarC, (ej0) objL2);
            w61 w61VarC2 = xj.c(wiVar, false);
            int iX3 = ws0.x(ak0Var);
            sl1 sl1VarL3 = ak0Var.l();
            u71 u71VarB3 = nj2.B(ak0Var, u71VarT);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC2);
            p12.l(raVar2, ak0Var, sl1VarL3);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX3))) {
                k3.p(iX3, ak0Var, iX3, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB3);
            vv.d(j2, vf2Var, gtVar, ak0Var, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            ak0Var.p(true);
            ak0Var.p(false);
            u71 u71VarF1 = p61.f0(vs0.s(r71Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            w61 w61VarC3 = xj.c(wiVar, false);
            int iX4 = ws0.x(ak0Var);
            sl1 sl1VarL4 = ak0Var.l();
            u71 u71VarB4 = nj2.B(ak0Var, u71VarF1);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC3);
            p12.l(raVar2, ak0Var, sl1VarL4);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX4))) {
                k3.p(iX4, ak0Var, iX4, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB4);
            j5 = j4;
            gtVar3 = gtVar2;
            sv.a(a90Var.a(new dr(j5)), gtVar3, ak0Var, 56);
            ak0Var.p(true);
            ak0Var.p(true);
        } else {
            ti0Var2 = ti0Var;
            gtVar3 = gtVar2;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final gt gtVar4 = gtVar3;
            lr1VarR.d = new ij0(zd0Var, j, j2, j3, j5, gtVar, vf2Var, vf2Var2, ti0Var2, ij0Var, gtVar4, f, i) { // from class: mc
                public final /* synthetic */ zd0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ gt k;
                public final /* synthetic */ vf2 l;
                public final /* synthetic */ vf2 m;
                public final /* synthetic */ ti0 n;
                public final /* synthetic */ ij0 o;
                public final /* synthetic */ gt p;
                public final /* synthetic */ float q;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    nc.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }
}

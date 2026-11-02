package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo0 {
    public static final u71 a = f52.j(p61.G);

    public static final void a(jo0 jo0Var, String str, u71 u71Var, long j, ak0 ak0Var, int i, int i2) {
        int i3;
        u71 u71Var2;
        long j2;
        int i4;
        long j3;
        u71 u71Var3;
        ak0Var.X(-126890956);
        int i5 = i | (ak0Var.f(jo0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= ak0Var.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
        } else {
            i3 = i5 | (ak0Var.f(u71Var) ? 256 : 128);
        }
        int i7 = i3 | 1024;
        if (ak0Var.O(i7 & 1, (i7 & 1171) != 1170)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                u71 u71Var4 = i6 != 0 ? r71.a : u71Var;
                i4 = i7 & (-7169);
                j3 = ((dr) ak0Var.j(yw.a)).a;
                u71Var3 = u71Var4;
            } else {
                ak0Var.R();
                i4 = i7 & (-7169);
                u71Var3 = u71Var;
                j3 = j;
            }
            ak0Var.q();
            b(j02.q(jo0Var, ak0Var), str, u71Var3, j3, ak0Var, (i4 & 112) | 8 | (i4 & 896), 0);
            u71Var2 = u71Var3;
            j2 = j3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            j2 = j;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eo0(jo0Var, str, u71Var2, j2, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x0160  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void b(nj1 nj1Var, String str, u71 u71Var, long j, ak0 ak0Var, int i, int i2) {
        int i3;
        u71 u71Var2;
        long j2;
        boolean z;
        u71 u71Var3;
        long j3;
        lr1 lr1VarR;
        int i4;
        u71 u71Var4;
        boolean z2;
        Object objL;
        u71 u71VarA;
        long jD;
        boolean z3;
        Object objL2;
        int i5;
        ak0Var.X(-2142239481);
        if ((i & 6) == 0) {
            i3 = (ak0Var.h(nj1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                u71Var2 = u71Var;
                i3 |= ak0Var.f(u71Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !ak0Var.e(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ak0Var.O(i3 & 1, z)) {
                ak0Var.T();
                i4 = i & 1;
                u71Var4 = r71.a;
                if (i4 != 0 || ak0Var.y()) {
                    if (i6 != 0) {
                        u71Var2 = u71Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((dr) ak0Var.j(yw.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    ak0Var.R();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                ak0Var.q();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && ak0Var.e(j2)) || (i3 & 3072) == 2048;
                objL = ak0Var.L();
                is1 is1Var = cv.a;
                if (z2 || objL == is1Var) {
                    if (vk2.a(j2, dr.g)) {
                        objL = null;
                    } else {
                        objL = new yi(5, j2);
                    }
                    ak0Var.g0(objL);
                }
                yi yiVar = (yi) objL;
                if (str != null) {
                    ak0Var.W(-536990979);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objL2 = ak0Var.L();
                    if (z3 || objL2 == is1Var) {
                        objL2 = new ii(str, 7);
                        ak0Var.g0(objL2);
                    }
                    u71VarA = l02.a(u71Var4, false, (ej0) objL2);
                    ak0Var.p(false);
                } else {
                    ak0Var.W(-536832197);
                    ak0Var.p(false);
                    u71VarA = u71Var4;
                }
                if (d52.a(nj1Var.d(), 9205357640488583168L)) {
                    u71Var4 = a;
                } else {
                    jD = nj1Var.d();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jD & 4294967295L)))) {
                        u71Var4 = a;
                    }
                }
                xj.a(dv1.F(u71Var2.c(u71Var4), nj1Var, dx.a, yiVar, 22).c(u71VarA), ak0Var, 0);
            } else {
                ak0Var.R();
            }
            u71Var3 = u71Var2;
            j3 = j2;
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new eo0(nj1Var, str, u71Var3, j3, i, i2, 1);
            }
        }
        i3 |= 384;
        u71Var2 = u71Var;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ak0Var.O(i3 & 1, z)) {
            ak0Var.T();
            i4 = i & 1;
            u71Var4 = r71.a;
            if (i4 != 0) {
                if (i6 != 0) {
                    u71Var2 = u71Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((dr) ak0Var.j(yw.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    u71Var2 = u71Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((dr) ak0Var.j(yw.a)).a;
                    i3 &= -7169;
                }
            }
            ak0Var.q();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objL = ak0Var.L();
            is1 is1Var2 = cv.a;
            if (z2) {
                if (vk2.a(j2, dr.g)) {
                    objL = null;
                } else {
                    objL = new yi(5, j2);
                }
                ak0Var.g0(objL);
            } else {
                if (vk2.a(j2, dr.g)) {
                    objL = null;
                } else {
                    objL = new yi(5, j2);
                }
                ak0Var.g0(objL);
            }
            yi yiVar2 = (yi) objL;
            if (str != null) {
                ak0Var.W(-536990979);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objL2 = ak0Var.L();
                if (z3) {
                    objL2 = new ii(str, 7);
                    ak0Var.g0(objL2);
                } else {
                    objL2 = new ii(str, 7);
                    ak0Var.g0(objL2);
                }
                u71VarA = l02.a(u71Var4, false, (ej0) objL2);
                ak0Var.p(false);
            } else {
                ak0Var.W(-536832197);
                ak0Var.p(false);
                u71VarA = u71Var4;
            }
            if (d52.a(nj1Var.d(), 9205357640488583168L)) {
                jD = nj1Var.d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32)))) {
                    u71Var4 = a;
                }
            } else {
                u71Var4 = a;
            }
            xj.a(dv1.F(u71Var2.c(u71Var4), nj1Var, dx.a, yiVar2, 22).c(u71VarA), ak0Var, 0);
        } else {
            ak0Var.R();
        }
        u71Var3 = u71Var2;
        j3 = j2;
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eo0(nj1Var, str, u71Var3, j3, i, i2, 1);
        }
    }
}

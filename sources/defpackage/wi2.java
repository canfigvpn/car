package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wi2 {
    public static final wi2 e = new wi2(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final w40 c;
    public Object[] d;

    public wi2(int i, int i2, Object[] objArr, w40 w40Var) {
        this.a = i;
        this.b = i2;
        this.c = w40Var;
        this.d = objArr;
    }

    public static wi2 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, w40 w40Var) {
        if (i3 > 30) {
            return new wi2(0, 0, new Object[]{obj, obj2, obj3, obj4}, w40Var);
        }
        int iK = v12.k(i, i3);
        int iK2 = v12.k(i2, i3);
        if (iK != iK2) {
            return new wi2((1 << iK) | (1 << iK2), 0, iK < iK2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, w40Var);
        }
        return new wi2(0, 1 << iK, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, w40Var)}, w40Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, w40 w40Var) {
        Object obj3 = this.d[i];
        wi2 wi2VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, w40Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ve.y0(objArr, objArr2, 0, i, 6);
        ve.w0(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = wi2VarJ;
        ve.w0(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        jr0 jr0VarQ = ex.Q(ex.S(0, this.d.length));
        int i = jr0VarQ.e;
        int i2 = jr0VarQ.f;
        int i3 = jr0VarQ.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!ws0.j(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iK = 1 << v12.k(i, i2);
        if (h(iK)) {
            return ws0.j(obj, this.d[f(iK)]);
        }
        if (!i(iK)) {
            return false;
        }
        wi2 wi2VarS = s(t(iK));
        return i2 == 30 ? wi2VarS.c(obj) : wi2VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(wi2 wi2Var) {
        if (this == wi2Var) {
            return true;
        }
        if (this.b == wi2Var.b && this.a == wi2Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == wi2Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iK = 1 << v12.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (ws0.j(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iK)) {
            return null;
        }
        wi2 wi2VarS = s(t(iK));
        if (i2 != 30) {
            return wi2VarS.g(i, i2 + 5, obj);
        }
        jr0 jr0VarQ = ex.Q(ex.S(0, wi2VarS.d.length));
        int i3 = jr0VarQ.e;
        int i4 = jr0VarQ.f;
        int i5 = jr0VarQ.g;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!ws0.j(obj, wi2VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return wi2VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final wi2 k(int i, rl1 rl1Var) {
        rl1Var.e(rl1Var.i - 1);
        rl1Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != rl1Var.e) {
            return new wi2(0, 0, v12.o(i, objArr), rl1Var.e);
        }
        this.d = v12.o(i, objArr);
        return this;
    }

    public final wi2 l(int i, Object obj, Object obj2, int i2, rl1 rl1Var) {
        rl1 rl1Var2;
        wi2 wi2VarL;
        int iK = 1 << v12.k(i, i2);
        boolean zH = h(iK);
        w40 w40Var = this.c;
        if (zH) {
            int iF = f(iK);
            if (!ws0.j(obj, this.d[iF])) {
                rl1Var.e(rl1Var.i + 1);
                w40 w40Var2 = rl1Var.e;
                if (w40Var != w40Var2) {
                    return new wi2(this.a ^ iK, this.b | iK, a(iF, iK, i, obj, obj2, i2, w40Var2), w40Var2);
                }
                this.d = a(iF, iK, i, obj, obj2, i2, w40Var2);
                this.a ^= iK;
                this.b |= iK;
                return this;
            }
            rl1Var.g = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (w40Var == rl1Var.e) {
                this.d[iF + 1] = obj2;
                return this;
            }
            rl1Var.h++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new wi2(this.a, this.b, objArrCopyOf, rl1Var.e);
        }
        if (!i(iK)) {
            rl1Var.e(rl1Var.i + 1);
            w40 w40Var3 = rl1Var.e;
            int iF2 = f(iK);
            Object[] objArr2 = this.d;
            if (w40Var != w40Var3) {
                return new wi2(this.a | iK, this.b, v12.m(objArr2, iF2, obj, obj2), w40Var3);
            }
            this.d = v12.m(objArr2, iF2, obj, obj2);
            this.a |= iK;
            return this;
        }
        int iT = t(iK);
        wi2 wi2VarS = s(iT);
        if (i2 == 30) {
            jr0 jr0VarQ = ex.Q(ex.S(0, wi2VarS.d.length));
            int i3 = jr0VarQ.e;
            int i4 = jr0VarQ.f;
            int i5 = jr0VarQ.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!ws0.j(obj, wi2VarS.d[i3])) {
                        if (i3 == i4) {
                            rl1Var.e(rl1Var.i + 1);
                            wi2VarL = new wi2(0, 0, v12.m(wi2VarS.d, 0, obj, obj2), rl1Var.e);
                            break;
                        }
                        i3 += i5;
                    } else {
                        rl1Var.g = wi2VarS.x(i3);
                        if (wi2VarS.c != rl1Var.e) {
                            rl1Var.h++;
                            Object[] objArr3 = wi2VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            wi2VarL = new wi2(0, 0, objArrCopyOf2, rl1Var.e);
                            break;
                        }
                        wi2VarS.d[i3 + 1] = obj2;
                        wi2VarL = wi2VarS;
                        break;
                    }
                }
            } else {
                rl1Var.e(rl1Var.i + 1);
                wi2VarL = new wi2(0, 0, v12.m(wi2VarS.d, 0, obj, obj2), rl1Var.e);
                break;
            }
            rl1Var2 = rl1Var;
        } else {
            rl1Var2 = rl1Var;
            wi2VarL = wi2VarS.l(i, obj, obj2, i2 + 5, rl1Var2);
        }
        return wi2VarS == wi2VarL ? this : r(iT, wi2VarL, rl1Var2.e);
    }

    public final wi2 m(wi2 wi2Var, int i, l40 l40Var, rl1 rl1Var) {
        wi2 wi2Var2;
        Object[] objArr;
        wi2 wi2VarJ;
        if (this == wi2Var) {
            l40Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            w40 w40Var = rl1Var.e;
            int i3 = wi2Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + wi2Var.d.length);
            int length = this.d.length;
            jr0 jr0VarQ = ex.Q(ex.S(0, wi2Var.d.length));
            int i4 = jr0VarQ.e;
            int i5 = jr0VarQ.f;
            int i6 = jr0VarQ.g;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(wi2Var.d[i4])) {
                        l40Var.a++;
                    } else {
                        Object[] objArr3 = wi2Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == wi2Var.d.length) {
                    return wi2Var;
                }
                return length == objArrCopyOf.length ? new wi2(0, 0, objArrCopyOf, w40Var) : new wi2(0, 0, Arrays.copyOf(objArrCopyOf, length), w40Var);
            }
        } else {
            int i7 = this.b | wi2Var.b;
            int i8 = this.a;
            int i9 = wi2Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (ws0.j(this.d[f(iLowestOneBit)], wi2Var.d[wi2Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                cp1.b("Check failed.");
            }
            if (ws0.j(this.c, rl1Var.e) && this.a == i12 && this.b == i7) {
                wi2Var2 = this;
            } else {
                wi2Var2 = new wi2(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = wi2Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    wi2VarJ = s(t(iLowestOneBit2));
                    if (wi2Var.i(iLowestOneBit2)) {
                        wi2VarJ = wi2VarJ.m(wi2Var.s(wi2Var.t(iLowestOneBit2)), i + 5, l40Var, rl1Var);
                        objArr = objArr4;
                    } else if (wi2Var.h(iLowestOneBit2)) {
                        int iF = wi2Var.f(iLowestOneBit2);
                        Object obj = wi2Var.d[iF];
                        Object objX = wi2Var.x(iF);
                        int i15 = rl1Var.i;
                        objArr = objArr4;
                        wi2VarJ = wi2VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, rl1Var);
                        if (rl1Var.i == i15) {
                            l40Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (wi2Var.i(iLowestOneBit2)) {
                        wi2 wi2VarS = wi2Var.s(wi2Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (wi2VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                l40Var.a++;
                                wi2VarJ = wi2VarS;
                            } else {
                                wi2VarJ = wi2VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, rl1Var);
                            }
                        } else {
                            wi2VarJ = wi2VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = wi2Var.f(iLowestOneBit2);
                        Object obj4 = wi2Var.d[iF4];
                        wi2VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, wi2Var.x(iF4), i + 5, rl1Var.e);
                    }
                }
                objArr[length2] = wi2VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (wi2Var.h(iLowestOneBit3)) {
                    int iF5 = wi2Var.f(iLowestOneBit3);
                    Object[] objArr5 = wi2Var2.d;
                    objArr5[i18] = wi2Var.d[iF5];
                    objArr5[i18 + 1] = wi2Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        l40Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = wi2Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(wi2Var2)) {
                return wi2Var.e(wi2Var2) ? wi2Var : wi2Var2;
            }
        }
        return this;
    }

    public final wi2 n(int i, Object obj, int i2, rl1 rl1Var) {
        wi2 wi2VarN;
        int iK = 1 << v12.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (ws0.j(obj, this.d[iF])) {
                return p(iF, iK, rl1Var);
            }
        } else if (i(iK)) {
            int iT = t(iK);
            wi2 wi2VarS = s(iT);
            if (i2 == 30) {
                jr0 jr0VarQ = ex.Q(ex.S(0, wi2VarS.d.length));
                int i3 = jr0VarQ.e;
                int i4 = jr0VarQ.f;
                int i5 = jr0VarQ.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!ws0.j(obj, wi2VarS.d[i3])) {
                            if (i3 == i4) {
                                wi2VarN = wi2VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            wi2VarN = wi2VarS.k(i3, rl1Var);
                            break;
                        }
                    }
                } else {
                    wi2VarN = wi2VarS;
                    break;
                }
            } else {
                wi2VarN = wi2VarS.n(i, obj, i2 + 5, rl1Var);
            }
            return q(wi2VarS, wi2VarN, iT, iK, rl1Var.e);
        }
        return this;
    }

    public final wi2 o(int i, Object obj, Object obj2, int i2, rl1 rl1Var) {
        rl1 rl1Var2;
        wi2 wi2VarO;
        int iK = 1 << v12.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            return (ws0.j(obj, this.d[iF]) && ws0.j(obj2, x(iF))) ? p(iF, iK, rl1Var) : this;
        }
        if (!i(iK)) {
            return this;
        }
        int iT = t(iK);
        wi2 wi2VarS = s(iT);
        if (i2 == 30) {
            jr0 jr0VarQ = ex.Q(ex.S(0, wi2VarS.d.length));
            int i3 = jr0VarQ.e;
            int i4 = jr0VarQ.f;
            int i5 = jr0VarQ.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!ws0.j(obj, wi2VarS.d[i3]) || !ws0.j(obj2, wi2VarS.x(i3))) {
                        if (i3 == i4) {
                            wi2VarO = wi2VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        wi2VarO = wi2VarS.k(i3, rl1Var);
                        break;
                    }
                }
            } else {
                wi2VarO = wi2VarS;
                break;
            }
            rl1Var2 = rl1Var;
        } else {
            rl1Var2 = rl1Var;
            wi2VarO = wi2VarS.o(i, obj, obj2, i2 + 5, rl1Var2);
        }
        return q(wi2VarS, wi2VarO, iT, iK, rl1Var2.e);
    }

    public final wi2 p(int i, int i2, rl1 rl1Var) {
        rl1Var.e(rl1Var.i - 1);
        rl1Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != rl1Var.e) {
            return new wi2(i2 ^ this.a, this.b, v12.o(i, objArr), rl1Var.e);
        }
        this.d = v12.o(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final wi2 q(wi2 wi2Var, wi2 wi2Var2, int i, int i2, w40 w40Var) {
        w40 w40Var2 = this.c;
        if (wi2Var2 != null) {
            return (w40Var2 == w40Var || wi2Var != wi2Var2) ? r(i, wi2Var2, w40Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (w40Var2 != w40Var) {
            return new wi2(this.a, this.b ^ i2, v12.p(i, objArr), w40Var);
        }
        this.d = v12.p(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final wi2 r(int i, wi2 wi2Var, w40 w40Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && wi2Var.d.length == 2 && wi2Var.b == 0) {
            wi2Var.a = this.b;
            return wi2Var;
        }
        if (this.c == w40Var) {
            objArr[i] = wi2Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = wi2Var;
        return new wi2(this.a, this.b, objArrCopyOf, w40Var);
    }

    public final wi2 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (wi2) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        r15.c = w(r7, r2, (defpackage.wi2) r15.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qs u(java.lang.Object r15, int r16, java.lang.Object r17, int r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi2.u(java.lang.Object, int, java.lang.Object, int):qs");
    }

    public final wi2 v(int i, int i2, Object obj) {
        wi2 wi2VarV;
        int iK = 1 << v12.k(i, i2);
        if (h(iK)) {
            int iF = f(iK);
            if (!ws0.j(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new wi2(this.a ^ iK, this.b, v12.o(iF, objArr), null);
            }
        } else {
            if (!i(iK)) {
                return this;
            }
            int iT = t(iK);
            wi2 wi2VarS = s(iT);
            if (i2 == 30) {
                jr0 jr0VarQ = ex.Q(ex.S(0, wi2VarS.d.length));
                int i3 = jr0VarQ.e;
                int i4 = jr0VarQ.f;
                int i5 = jr0VarQ.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!ws0.j(obj, wi2VarS.d[i3])) {
                            if (i3 == i4) {
                                wi2VarV = wi2VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = wi2VarS.d;
                            if (objArr2.length != 2) {
                                wi2VarV = new wi2(0, 0, v12.o(i3, objArr2), null);
                                break;
                            }
                            wi2VarV = null;
                            break;
                        }
                    }
                } else {
                    wi2VarV = wi2VarS;
                    break;
                }
            } else {
                wi2VarV = wi2VarS.v(i, i2 + 5, obj);
            }
            if (wi2VarV != null) {
                return wi2VarS != wi2VarV ? w(iT, iK, wi2VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new wi2(this.a, this.b ^ iK, v12.p(iT, objArr3), null);
            }
        }
        return null;
    }

    public final wi2 w(int i, int i2, wi2 wi2Var) {
        Object[] objArr = wi2Var.d;
        if (objArr.length != 2 || wi2Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = wi2Var;
            return new wi2(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            wi2Var.a = this.b;
            return wi2Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        ve.w0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        ve.w0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new wi2(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}

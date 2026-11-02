package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j72 {
    public final ej0 a;
    public Object b;
    public l91 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final w91 e = qx.t();
    public final w91 f = new w91();
    public final x91 g = new x91();
    public final fa1 h = new fa1(new v40[16]);
    public final zj0 i = new zj0(1, this);
    public final w91 l = qx.t();
    public final HashMap m = new HashMap();

    public j72(ej0 ej0Var) {
        this.a = ej0Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j72.a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, l91 l91Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = l91Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = l91Var.c[iC];
        }
        l91Var.b[iC] = obj;
        l91Var.c[iC] = i;
        if ((obj instanceof v40) && i2 != i) {
            u40 u40VarI = ((v40) obj).i();
            this.m.put(obj, u40VarI.f);
            l91 l91Var2 = u40VarI.e;
            w91 w91Var = this.l;
            qx.R(w91Var, obj);
            Object[] objArr = l91Var2.b;
            long[] jArr = l91Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                v82 v82Var = (v82) objArr[(i3 << 3) + i5];
                                if (v82Var instanceof w82) {
                                    ((w82) v82Var).g(2);
                                }
                                qx.i(w91Var, v82Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof w82) {
                ((w82) obj).g(2);
            }
            qx.i(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        w91 w91Var = this.e;
        qx.Q(w91Var, obj2, obj);
        if (!(obj2 instanceof v40) || w91Var.c(obj2)) {
            return;
        }
        qx.R(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0064->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae A[EDGE_INSN: B:48:0x00ae->B:30:0x00ae BREAK  A[LOOP:2: B:16:0x0064->B:28:0x009f], SYNTHETIC] */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        w91 w91Var = this.f;
        long[] jArr3 = w91Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = w91Var.b[i6];
                        j2 = j4;
                        l91 l91Var = (l91) w91Var.c[i6];
                        obj.getClass();
                        boolean zY = ((bj1) obj).y();
                        if (zY) {
                            jArr2 = jArr3;
                            j = j3;
                            z = zY;
                        } else {
                            Object[] objArr = l91Var.b;
                            int[] iArr = l91Var.c;
                            long[] jArr4 = l91Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zY;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        zY = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        zY = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                z = zY;
                            }
                        }
                        if (!z) {
                            w91Var.l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}

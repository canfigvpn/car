package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v40 extends w82 implements p82 {
    public final ti0 f;
    public final d72 g;
    public u40 h = new u40(x62.h().g());

    public v40(ti0 ti0Var, d72 d72Var) {
        this.f = ti0Var;
        this.g = d72Var;
    }

    @Override // defpackage.v82
    public final x82 a() {
        return this.h;
    }

    @Override // defpackage.v82
    public final void d(x82 x82Var) {
        this.h = (u40) x82Var;
    }

    @Override // defpackage.p82
    public final Object getValue() {
        ej0 ej0VarE = x62.h().e();
        if (ej0VarE != null) {
            ej0VarE.h(this);
        }
        o62 o62VarH = x62.h();
        return h((u40) x62.g(this.h, o62VarH), o62VarH, true, this.f).f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final u40 h(u40 u40Var, o62 o62Var, boolean z, ti0 ti0Var) {
        u40 u40Var2;
        d72 d72Var;
        int i;
        if (u40Var.c(this, o62Var)) {
            if (z) {
                fa1 fa1VarA = e72.a();
                Object[] objArr = fa1VarA.e;
                int i2 = fa1VarA.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((zj0) objArr[i3]).b();
                }
                try {
                    l91 l91Var = u40Var.e;
                    ud udVar = e72.a;
                    nr0 nr0Var = (nr0) udVar.f();
                    if (nr0Var == null) {
                        nr0Var = new nr0();
                        udVar.v(nr0Var);
                    }
                    int i4 = nr0Var.a;
                    Object[] objArr2 = l91Var.b;
                    int[] iArr = l91Var.c;
                    long[] jArr = l91Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        v82 v82Var = (v82) objArr2[i9];
                                        i = i6;
                                        nr0Var.a = i4 + iArr[i9];
                                        ej0 ej0VarE = o62Var.e();
                                        if (ej0VarE != null) {
                                            ej0VarE.h(v82Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    nr0Var.a = i4;
                } finally {
                    Object[] objArr3 = fa1VarA.e;
                    int i10 = fa1VarA.g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((zj0) objArr3[i11]).a();
                    }
                }
            }
            return u40Var;
        }
        l91 l91Var2 = new l91();
        ud udVar2 = e72.a;
        nr0 nr0Var2 = (nr0) udVar2.f();
        if (nr0Var2 == null) {
            nr0Var2 = new nr0();
            udVar2.v(nr0Var2);
        }
        int i12 = nr0Var2.a;
        fa1 fa1VarA2 = e72.a();
        Object[] objArr4 = fa1VarA2.e;
        int i13 = fa1VarA2.g;
        for (int i14 = 0; i14 < i13; i14++) {
            ((zj0) objArr4[i14]).b();
        }
        try {
            nr0Var2.a = i12 + 1;
            Object objQ = c12.q(new t40(this, nr0Var2, l91Var2, i12, 0), ti0Var);
            nr0Var2.a = i12;
            Object[] objArr5 = fa1VarA2.e;
            int i15 = fa1VarA2.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ((zj0) objArr5[i16]).a();
            }
            Object obj = x62.c;
            synchronized (obj) {
                try {
                    o62 o62VarH = x62.h();
                    Object obj2 = u40Var.f;
                    if (obj2 == u40.h || (d72Var = this.g) == null || !d72Var.c(objQ, obj2)) {
                        u40 u40Var3 = this.h;
                        synchronized (obj) {
                            x82 x82VarK = x62.k(u40Var3, this);
                            x82VarK.a(u40Var3);
                            x82VarK.a = o62VarH.g();
                            u40Var2 = (u40) x82VarK;
                            u40Var2.e = l91Var2;
                            u40Var2.g = u40Var2.d(this, o62VarH);
                            u40Var2.f = objQ;
                        }
                        return u40Var2;
                    }
                    u40Var.e = l91Var2;
                    u40Var.g = u40Var.d(this, o62VarH);
                    u40Var2 = u40Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            nr0 nr0Var3 = (nr0) e72.a.f();
            if (nr0Var3 == null || nr0Var3.a != 0) {
                return u40Var2;
            }
            x62.h().m();
            synchronized (obj) {
                o62 o62VarH2 = x62.h();
                u40Var2.c = o62VarH2.g();
                u40Var2.d = o62VarH2.h();
                return u40Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = fa1VarA2.e;
            int i17 = fa1VarA2.g;
            for (int i18 = 0; i18 < i17; i18++) {
                ((zj0) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    public final u40 i() {
        o62 o62VarH = x62.h();
        return h((u40) x62.g(this.h, o62VarH), o62VarH, false, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        u40 u40Var = (u40) x62.f(this.h);
        sb.append(u40Var.c(this, x62.h()) ? String.valueOf(u40Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}

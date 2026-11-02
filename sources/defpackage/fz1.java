package defpackage;

import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 extends tu {
    public static final pb r = new pb(0.0f);
    public static final pb s = new pb(1.0f);
    public final dk1 b;
    public final dk1 c;
    public Object d;
    public ki2 e;
    public long f;
    public final w8 g;
    public final zj1 h;
    public om i;
    public final ta1 j;
    public final qa1 k;
    public long l;
    public final p91 m;
    public yy1 n;
    public final xy1 o;
    public float p;
    public final xy1 q;

    /* JADX WARN: Type inference failed for: r3v6, types: [xy1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [xy1] */
    public fz1(kb1 kb1Var) {
        super(3);
        this.b = y12.s(kb1Var);
        this.c = y12.s(kb1Var);
        this.d = kb1Var;
        this.g = new w8(29, this);
        this.h = new zj1(0.0f);
        this.j = new ta1();
        this.k = new qa1();
        this.l = Long.MIN_VALUE;
        this.m = new p91();
        final int i = 0;
        this.o = new ej0(this) { // from class: xy1
            public final /* synthetic */ fz1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ej0
            public final Object h(Object obj) {
                int i2 = i;
                ll2 ll2Var = ll2.a;
                fz1 fz1Var = this.f;
                long jLongValue = ((Long) obj).longValue();
                switch (i2) {
                    case 0:
                        fz1Var.l = jLongValue;
                        break;
                    default:
                        long j = jLongValue - fz1Var.l;
                        fz1Var.l = jLongValue;
                        long jK0 = p61.k0(j / ((double) fz1Var.p));
                        p91 p91Var = fz1Var.m;
                        if (p91Var.i()) {
                            Object[] objArr = p91Var.a;
                            int i3 = p91Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                yy1 yy1Var = (yy1) objArr[i5];
                                fz1.q(yy1Var, jK0);
                                yy1Var.c = true;
                            }
                            ki2 ki2Var = fz1Var.e;
                            if (ki2Var != null) {
                                ki2Var.o();
                            }
                            int i6 = p91Var.b;
                            Object[] objArr2 = p91Var.a;
                            lr0 lr0VarS = ex.S(0, i6);
                            int i7 = lr0VarS.e;
                            int i8 = lr0VarS.f;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((yy1) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            ve.B0(i6 - i4, i6, null, objArr2);
                            p91Var.b -= i4;
                        }
                        yy1 yy1Var2 = fz1Var.n;
                        if (yy1Var2 != null) {
                            yy1Var2.g = fz1Var.f;
                            fz1.q(yy1Var2, jK0);
                            fz1Var.u(yy1Var2.d);
                            if (yy1Var2.d == 1.0f) {
                                fz1Var.n = null;
                            }
                            fz1Var.t();
                        }
                        break;
                }
                return ll2Var;
            }
        };
        final int i2 = 1;
        this.q = new ej0(this) { // from class: xy1
            public final /* synthetic */ fz1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ej0
            public final Object h(Object obj) {
                int i3 = i2;
                ll2 ll2Var = ll2.a;
                fz1 fz1Var = this.f;
                long jLongValue = ((Long) obj).longValue();
                switch (i3) {
                    case 0:
                        fz1Var.l = jLongValue;
                        break;
                    default:
                        long j = jLongValue - fz1Var.l;
                        fz1Var.l = jLongValue;
                        long jK0 = p61.k0(j / ((double) fz1Var.p));
                        p91 p91Var = fz1Var.m;
                        if (p91Var.i()) {
                            Object[] objArr = p91Var.a;
                            int i4 = p91Var.b;
                            int i5 = 0;
                            for (int i6 = 0; i6 < i4; i6++) {
                                yy1 yy1Var = (yy1) objArr[i6];
                                fz1.q(yy1Var, jK0);
                                yy1Var.c = true;
                            }
                            ki2 ki2Var = fz1Var.e;
                            if (ki2Var != null) {
                                ki2Var.o();
                            }
                            int i7 = p91Var.b;
                            Object[] objArr2 = p91Var.a;
                            lr0 lr0VarS = ex.S(0, i7);
                            int i8 = lr0VarS.e;
                            int i9 = lr0VarS.f;
                            if (i8 <= i9) {
                                while (true) {
                                    objArr2[i8 - i5] = objArr2[i8];
                                    if (((yy1) objArr2[i8]).c) {
                                        i5++;
                                    }
                                    if (i8 != i9) {
                                        i8++;
                                    }
                                }
                            }
                            ve.B0(i7 - i5, i7, null, objArr2);
                            p91Var.b -= i5;
                        }
                        yy1 yy1Var2 = fz1Var.n;
                        if (yy1Var2 != null) {
                            yy1Var2.g = fz1Var.f;
                            fz1.q(yy1Var2, jK0);
                            fz1Var.u(yy1Var2.d);
                            if (yy1Var2.d == 1.0f) {
                                fz1Var.n = null;
                            }
                            fz1Var.t();
                        }
                        break;
                }
                return ll2Var;
            }
        };
    }

    public static void q(yy1 yy1Var, long j) {
        long j2 = yy1Var.a + j;
        yy1Var.a = j2;
        long j3 = yy1Var.h;
        if (j2 >= j3) {
            yy1Var.d = 1.0f;
            return;
        }
        qm2 qm2Var = yy1Var.b;
        pb pbVar = yy1Var.e;
        if (qm2Var == null) {
            float f = j2 / j3;
            yy1Var.d = (f * 1.0f) + ((1.0f - f) * pbVar.a(0));
            return;
        }
        pb pbVar2 = yy1Var.f;
        if (pbVar2 == null) {
            pbVar2 = r;
        }
        yy1Var.d = ex.g(((pb) qm2Var.p(j2, pbVar, s, pbVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // defpackage.tu
    public final Object f() {
        return this.c.getValue();
    }

    @Override // defpackage.tu
    public final Object h() {
        return this.b.getValue();
    }

    @Override // defpackage.tu
    public final void k(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.tu
    public final void l(ki2 ki2Var) {
        ki2 ki2Var2 = this.e;
        if (ki2Var2 != null && ki2Var != ki2Var2) {
            ep1.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + ki2Var);
        }
        this.e = ki2Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[Catch: all -> 0x009a, LOOP:1: B:14:0x0037->B:26:0x007e, LOOP_END, TryCatch #0 {all -> 0x009a, blocks: (B:4:0x0010, B:8:0x001a, B:27:0x0084, B:29:0x008c, B:34:0x009c, B:31:0x0091, B:11:0x002b, B:14:0x0037, B:16:0x004c, B:18:0x0058, B:20:0x0062, B:22:0x0072, B:26:0x007e, B:35:0x00a1), top: B:40:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[EDGE_INSN: B:47:0x0084->B:27:0x0084 BREAK  A[LOOP:1: B:14:0x0037->B:26:0x007e], SYNTHETIC] */
    @Override // defpackage.tu
    public final void m() {
        int i;
        this.e = null;
        k72 k72Var = (k72) oi2.b.getValue();
        synchronized (k72Var.g) {
            try {
                fa1 fa1Var = k72Var.f;
                int i2 = fa1Var.g;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = fa1Var.e;
                    if (i3 < i2) {
                        j72 j72Var = (j72) objArr[i3];
                        l91 l91Var = (l91) j72Var.f.k(this);
                        if (l91Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = l91Var.b;
                            int[] iArr = l91Var.c;
                            long[] jArr = l91Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        } else {
                                            i5++;
                                            i3 = i;
                                        }
                                    } else {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i5 << 3) + i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                j72Var.c(this, obj);
                                            }
                                            j >>= i6;
                                            i8++;
                                            i6 = i6;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!j72Var.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = fa1Var.e;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i11 = i2 - i4;
                        Arrays.fill(objArr, i11, i2, (Object) null);
                        fa1Var.g = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object n(tx txVar) {
        float fK = c12.k(txVar.f());
        ll2 ll2Var = ll2.a;
        if (fK <= 0.0f) {
            o();
            return ll2Var;
        }
        this.p = fK;
        Object objA = sv.K(txVar.f()).a(txVar, this.q);
        return objA == fz.e ? objA : ll2Var;
    }

    public final void o() {
        ki2 ki2Var = this.e;
        if (ki2Var != null) {
            ki2Var.c();
        }
        this.m.d();
        if (this.n != null) {
            this.n = null;
            u(1.0f);
            t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public final void p() {
        ki2 ki2Var = this.e;
        if (ki2Var == null) {
            return;
        }
        yy1 yy1Var = this.n;
        if (yy1Var == null) {
            if (this.f > 0) {
                zj1 zj1Var = this.h;
                if (zj1Var.h() == 1.0f || ws0.j(this.c.getValue(), this.b.getValue())) {
                    yy1Var = null;
                } else {
                    yy1 yy1Var2 = new yy1();
                    yy1Var2.d = zj1Var.h();
                    long j = this.f;
                    yy1Var2.g = j;
                    yy1Var2.h = p61.k0((1.0d - ((double) zj1Var.h())) * j);
                    yy1Var2.e.e(0, zj1Var.h());
                    yy1Var = yy1Var2;
                }
            } else {
                yy1Var = null;
            }
        }
        if (yy1Var != null) {
            yy1Var.g = this.f;
            this.m.a(yy1Var);
            ki2Var.m(yy1Var);
        }
        this.n = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(tx txVar) {
        az1 az1Var;
        if (txVar instanceof az1) {
            az1Var = (az1) txVar;
            int i = az1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                az1Var.j = i - Integer.MIN_VALUE;
            } else {
                az1Var = new az1(this, txVar);
            }
        } else {
            az1Var = new az1(this, txVar);
        }
        uy uyVar = az1Var.f;
        Object obj = az1Var.h;
        int i2 = az1Var.j;
        p91 p91Var = this.m;
        ll2 ll2Var = ll2.a;
        Object obj2 = fz.e;
        if (i2 == 0) {
            ix.Q(obj);
            if (p91Var.h() && this.n == null) {
                return ll2Var;
            }
            uyVar.getClass();
            if (c12.k(uyVar) == 0.0f) {
                o();
                this.l = Long.MIN_VALUE;
                return ll2Var;
            }
            if (this.l == Long.MIN_VALUE) {
                az1Var.j = 1;
                uyVar.getClass();
                if (sv.K(uyVar).a(az1Var, this.o) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        do {
            if (!p91Var.i() && this.n == null) {
                this.l = Long.MIN_VALUE;
                return ll2Var;
            }
            az1Var.j = 2;
        } while (n(az1Var) != obj2);
        return obj2;
    }

    public final Object s(float f, Object obj, wa2 wa2Var) {
        if (0.0f > f || f > 1.0f) {
            ep1.a("Expecting fraction between 0 and 1. Got " + f);
        }
        ki2 ki2Var = this.e;
        if (ki2Var != null) {
            Object objA = qa1.a(this.k, new cz1(obj, this.b.getValue(), this, ki2Var, f, null), wa2Var);
            if (objA == fz.e) {
                return objA;
            }
        }
        return ll2.a;
    }

    public final void t() {
        ki2 ki2Var = this.e;
        if (ki2Var == null) {
            return;
        }
        ki2Var.l(p61.k0(((double) this.h.h()) * ((Number) ki2Var.l.getValue()).longValue()));
    }

    public final void u(float f) {
        this.h.i(f);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(tx txVar) {
        dz1 dz1Var;
        Object value;
        Object obj;
        if (txVar instanceof dz1) {
            dz1Var = (dz1) txVar;
            int i = dz1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dz1Var.k = i - Integer.MIN_VALUE;
            } else {
                dz1Var = new dz1(this, txVar);
            }
        } else {
            dz1Var = new dz1(this, txVar);
        }
        Object obj2 = dz1Var.i;
        int i2 = dz1Var.k;
        ta1 ta1Var = this.j;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(obj2);
            value = this.b.getValue();
            dz1Var.h = value;
            dz1Var.k = 1;
            if (ta1Var.d(dz1Var) != fzVar) {
            }
            return fzVar;
        }
        if (i2 == 1) {
            Object obj3 = dz1Var.h;
            ix.Q(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = dz1Var.h;
            ix.Q(obj2);
        }
        if (ws0.j(obj2, obj)) {
            return ll2.a;
        }
        this.l = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        dz1Var.h = value;
        dz1Var.k = 2;
        om omVar = new om(1, ex.y(dz1Var));
        omVar.v();
        this.i = omVar;
        ta1Var.b(null);
        Object objT = omVar.t();
        if (objT != fzVar) {
            obj = value;
            obj2 = objT;
            if (ws0.j(obj2, obj)) {
                return ll2.a;
            }
            this.l = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return fzVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    public final Object w(tx txVar) {
        ez1 ez1Var;
        Object value;
        Object obj;
        if (txVar instanceof ez1) {
            ez1Var = (ez1) txVar;
            int i = ez1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ez1Var.k = i - Integer.MIN_VALUE;
            } else {
                ez1Var = new ez1(this, txVar);
            }
        } else {
            ez1Var = new ez1(this, txVar);
        }
        Object obj2 = ez1Var.i;
        int i2 = ez1Var.k;
        ta1 ta1Var = this.j;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(obj2);
            value = this.b.getValue();
            ez1Var.h = value;
            ez1Var.k = 1;
            if (ta1Var.d(ez1Var) != fzVar) {
            }
            return fzVar;
        }
        if (i2 == 1) {
            Object obj3 = ez1Var.h;
            ix.Q(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ez1Var.h;
            ix.Q(obj2);
        }
        if (!ws0.j(obj2, obj)) {
            this.l = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return ll2.a;
        if (!ws0.j(value, this.d)) {
            ez1Var.h = value;
            ez1Var.k = 2;
            om omVar = new om(1, ex.y(ez1Var));
            omVar.v();
            this.i = omVar;
            ta1Var.b(null);
            Object objT = omVar.t();
            if (objT != fzVar) {
                obj = value;
                obj2 = objT;
                if (!ws0.j(obj2, obj)) {
                    this.l = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return fzVar;
        }
        ta1Var.b(null);
        return ll2.a;
    }
}

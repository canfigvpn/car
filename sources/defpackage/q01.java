package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 implements oy1 {
    public static final ru1 x = vv.H(new n30(29), new vy(5));
    public final c30 a;
    public boolean b;
    public k01 c;
    public boolean d;
    public final ky0 e;
    public final dk1 f;
    public final f91 g;
    public float h;
    public final l30 i;
    public final boolean j;
    public ax0 k;
    public final py0 l;
    public final uf m;
    public final gz0 n;
    public final ck o;
    public final tz0 p;
    public final ao2 q;
    public final qz0 r;
    public final da1 s;
    public final dk1 t;
    public final dk1 u;
    public final da1 v;
    public final dq0 w;

    public q01(int i, int i2) {
        c30 c30Var = new c30();
        c30Var.a = -1;
        c30Var.c = -1;
        this.a = c30Var;
        this.e = new ky0(i, i2, 1);
        this.f = new dk1(r01.a, q90.U);
        this.g = new f91();
        this.i = new l30(new m(18, this));
        this.j = true;
        this.l = new py0(this, 1);
        this.m = new uf();
        this.n = new gz0();
        this.o = new ck(1);
        this.p = new tz0(new t00(this, i));
        this.q = new ao2(24, this);
        this.r = new qz0();
        this.s = qx.u();
        Boolean bool = Boolean.FALSE;
        this.t = y12.s(bool);
        this.u = y12.s(bool);
        this.v = qx.u();
        this.w = new dq0(21);
    }

    public static Object f(q01 q01Var, int i, wa2 wa2Var) {
        Object objD = q01Var.d(ia1.e, new n01(q01Var, i, null), wa2Var);
        return objD == fz.e ? objD : ll2.a;
    }

    public static Object l(q01 q01Var, int i, wa2 wa2Var) {
        q01Var.getClass();
        Object objD = q01Var.d(ia1.e, new n10(q01Var, i, (sx) null), wa2Var);
        return objD == fz.e ? objD : ll2.a;
    }

    @Override // defpackage.oy1
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final boolean b() {
        return this.i.b();
    }

    @Override // defpackage.oy1
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.i.d(r7, r8, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.ia1 r7, defpackage.ij0 r8, defpackage.tx r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.p01
            if (r0 == 0) goto L13
            r0 = r9
            p01 r0 = (defpackage.p01) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            p01 r0 = new p01
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.j
            int r1 = r0.l
            r2 = 0
            r3 = 2
            r4 = 1
            fz r5 = defpackage.fz.e
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ix.Q(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r6)
            return r2
        L31:
            wa2 r7 = r0.i
            r8 = r7
            ij0 r8 = (defpackage.ij0) r8
            ia1 r7 = r0.h
            defpackage.ix.Q(r9)
            goto L5b
        L3c:
            defpackage.ix.Q(r9)
            dk1 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            k01 r1 = defpackage.r01.a
            if (r9 != r1) goto L5b
            r0.h = r7
            r9 = r8
            wa2 r9 = (defpackage.wa2) r9
            r0.i = r9
            r0.l = r4
            uf r9 = r6.m
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.h = r2
            r0.i = r2
            r0.l = r3
            l30 r6 = r6.i
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            ll2 r6 = defpackage.ll2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q01.d(ia1, ij0, tx):java.lang.Object");
    }

    @Override // defpackage.oy1
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void g(k01 k01Var, boolean z, boolean z2) {
        List list = k01Var.k;
        int i = k01Var.n;
        int i2 = k01Var.b;
        l01 l01Var = k01Var.a;
        this.p.e = list.size();
        dq0 dq0Var = this.w;
        ky0 ky0Var = this.e;
        if (!z && this.b) {
            this.c = k01Var;
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                if (((Number) ((ob) dq0Var.g).f.getValue()).floatValue() != 0.0f && l01Var != null && l01Var.a == ky0Var.b.h() && i2 == ky0Var.c.h()) {
                    j82 j82Var = (j82) dq0Var.f;
                    if (j82Var != null) {
                        j82Var.d(null);
                    }
                    dq0Var.g = new ob(ir2.V, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                c12.s(o62VarJ, o62VarP, ej0VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((l01Var != null ? l01Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(k01Var.c));
        this.h -= k01Var.d;
        this.f.setValue(k01Var);
        if (z2) {
            ky0Var.getClass();
            if (i2 < 0.0f) {
                yp0.c("scrollOffset should be non-negative");
            }
            ky0Var.c.i(i2);
        } else {
            l01 l01Var2 = (l01) vq.R(list);
            l01 l01Var3 = (l01) vq.X(list);
            nj2.G("firstVisibleItem:index", l01Var2 != null ? l01Var2.a : -1L);
            nj2.G("lastVisibleItem:index", l01Var3 != null ? l01Var3.a : -1L);
            ky0Var.getClass();
            ky0Var.e = l01Var != null ? l01Var.i : null;
            if (ky0Var.d || i > 0) {
                ky0Var.d = true;
                if (i2 < 0.0f) {
                    yp0.c("scrollOffset should be non-negative");
                }
                ky0Var.a(l01Var != null ? l01Var.a : 0, i2);
            }
            if (this.j) {
                c30 c30Var = this.a;
                int i3 = c30Var.a;
                boolean z3 = c30Var.b;
                if (i3 != -1 && !list.isEmpty() && i3 != c30.a(k01Var, z3)) {
                    c30Var.a = -1;
                    sz0 sz0Var = (sz0) c30Var.e;
                    if (sz0Var != null) {
                        sz0Var.cancel();
                    }
                    c30Var.e = null;
                }
                int i4 = c30Var.c;
                if (i4 != -1 && c30Var.d != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = c30.a(k01Var, c30Var.d < 0.0f);
                    if (iA >= 0 && iA < i) {
                        c30Var.a = iA;
                        c30Var.e = ao2.u(this.q, iA);
                    }
                }
                c30Var.c = i;
            }
        }
        if (z) {
            dq0Var.x(k01Var.f, k01Var.i, k01Var.h);
        }
    }

    public final int h() {
        return this.e.b.h();
    }

    public final int i() {
        return this.e.c.h();
    }

    public final k01 j() {
        return (k01) this.f.getValue();
    }

    public final void k(float f, k01 k01Var) {
        sz0 sz0Var;
        sz0 sz0Var2;
        if (this.j) {
            boolean zIsEmpty = k01Var.k.isEmpty();
            c30 c30Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = c30.a(k01Var, z);
                if (iA >= 0 && iA < k01Var.n) {
                    if (iA != c30Var.a) {
                        if (c30Var.b != z) {
                            c30Var.a = -1;
                            sz0 sz0Var3 = (sz0) c30Var.e;
                            if (sz0Var3 != null) {
                                sz0Var3.cancel();
                            }
                            c30Var.e = null;
                        }
                        c30Var.b = z;
                        c30Var.a = iA;
                        c30Var.e = ao2.u(this.q, iA);
                    }
                    List list = k01Var.k;
                    if (z) {
                        l01 l01Var = (l01) vq.W(list);
                        if (((l01Var.l + l01Var.m) + k01Var.q) - k01Var.m < (-f) && (sz0Var2 = (sz0) c30Var.e) != null) {
                            sz0Var2.a();
                        }
                    } else if (k01Var.l - ((l01) vq.Q(list)).l < f && (sz0Var = (sz0) c30Var.e) != null) {
                        sz0Var.a();
                    }
                }
            }
            c30Var.d = f;
        }
    }

    public final void m(int i) {
        ky0 ky0Var = this.e;
        if (ky0Var.b.h() != i || ky0Var.c.h() != 0) {
            gz0 gz0Var = this.n;
            gz0Var.d();
            gz0Var.b = null;
        }
        ky0Var.a(i, 0);
        ky0Var.e = null;
        ax0 ax0Var = this.k;
        if (ax0Var != null) {
            ax0Var.k();
        }
    }
}

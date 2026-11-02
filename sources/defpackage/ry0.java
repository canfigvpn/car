package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 implements oy1 {
    public static final ru1 w = vv.H(new n30(24), new vy(4));
    public final c30 a;
    public boolean b;
    public gy0 c;
    public final ky0 d;
    public final dk1 e;
    public final f91 f;
    public float g;
    public final l30 h;
    public final boolean i;
    public ax0 j;
    public final py0 k;
    public final uf l;
    public final gz0 m;
    public final ck n;
    public final tz0 o;
    public final ao2 p;
    public final qz0 q;
    public final da1 r;
    public final da1 s;
    public final dk1 t;
    public final dk1 u;
    public final dq0 v;

    public ry0(int i, int i2) {
        c30 c30Var = new c30();
        c30Var.a = -1;
        c30Var.e = new fa1(new sz0[16]);
        c30Var.c = -1;
        this.a = c30Var;
        this.d = new ky0(i, i2, 0);
        this.e = new dk1(uy0.a, q90.U);
        this.f = new f91();
        this.h = new l30(new m(13, this));
        this.i = true;
        this.k = new py0(this, 0);
        this.l = new uf();
        this.m = new gz0();
        this.n = new ck(1);
        this.o = new tz0(new oy0(this, i));
        this.p = new ao2(23, this);
        this.q = new qz0();
        this.r = qx.u();
        this.s = qx.u();
        Boolean bool = Boolean.FALSE;
        this.t = y12.s(bool);
        this.u = y12.s(bool);
        this.v = new dq0(21);
    }

    @Override // defpackage.oy1
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.oy1
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.oy1
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.h.d(r7, r8, r0) == r5) goto L23;
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
            boolean r0 = r9 instanceof defpackage.qy0
            if (r0 == 0) goto L13
            r0 = r9
            qy0 r0 = (defpackage.qy0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            qy0 r0 = new qy0
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
            dk1 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            gy0 r1 = defpackage.uy0.a
            if (r9 != r1) goto L5b
            r0.h = r7
            r9 = r8
            wa2 r9 = (defpackage.wa2) r9
            r0.i = r9
            r0.l = r4
            uf r9 = r6.l
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.h = r2
            r0.i = r2
            r0.l = r3
            l30 r6 = r6.h
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            ll2 r6 = defpackage.ll2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.d(ia1, ij0, tx):java.lang.Object");
    }

    @Override // defpackage.oy1
    public final float e(float f) {
        return this.h.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    public final void f(gy0 gy0Var, boolean z, boolean z2) {
        Object obj;
        int i;
        List list = gy0Var.m;
        int i2 = gy0Var.p;
        int i3 = gy0Var.b;
        iy0 iy0Var = gy0Var.a;
        this.o.e = list.size();
        if (!z && this.b) {
            this.c = gy0Var;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.g -= gy0Var.d;
        this.e.setValue(gy0Var);
        this.u.setValue(Boolean.valueOf(((iy0Var != null ? iy0Var.a : 0) == 0 && i3 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(gy0Var.c));
        ky0 ky0Var = this.d;
        if (z2) {
            ky0Var.getClass();
            if (i3 < 0.0f) {
                yp0.c("scrollOffset should be non-negative");
            }
            ky0Var.c.i(i3);
        } else {
            ky0Var.getClass();
            if (iy0Var != null) {
                hy0[] hy0VarArr = iy0Var.b;
                hy0 hy0Var = hy0VarArr.length == 0 ? null : hy0VarArr[0];
                if (hy0Var != null) {
                    obj = hy0Var.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            ky0Var.e = obj;
            if (ky0Var.d || i2 > 0) {
                ky0Var.d = true;
                if (i3 < 0.0f) {
                    yp0.c("scrollOffset should be non-negative (" + i3 + ')');
                }
                if (iy0Var != null) {
                    hy0[] hy0VarArr2 = iy0Var.b;
                    hy0 hy0Var2 = hy0VarArr2.length != 0 ? hy0VarArr2[0] : null;
                    if (hy0Var2 != null) {
                        i = hy0Var2.a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                ky0Var.a(i, i3);
            }
            if (this.i) {
                c30 c30Var = this.a;
                fa1 fa1Var = (fa1) c30Var.e;
                int i4 = c30Var.a;
                boolean z3 = c30Var.b;
                if (i4 != -1 && !list.isEmpty() && i4 != c30.b(gy0Var, z3)) {
                    c30Var.a = -1;
                    Object[] objArr = fa1Var.e;
                    int i5 = fa1Var.g;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((sz0) objArr[i6]).cancel();
                    }
                    fa1Var.g();
                }
                int i7 = c30Var.c;
                if (i7 != -1 && c30Var.d != 0.0f && i7 != i2 && !list.isEmpty()) {
                    int iB = c30.b(gy0Var, c30Var.d < 0.0f);
                    int i8 = c30Var.d < 0.0f ? ((hy0) vq.W(list)).a + 1 : ((hy0) vq.Q(list)).a - 1;
                    if (i8 >= 0 && i8 < i2 && iB != c30Var.a && iB >= 0) {
                        c30Var.a = iB;
                        fa1Var.g();
                        fa1Var.d(fa1Var.g, this.p.t(iB));
                    }
                }
                c30Var.c = i2;
            }
        }
        if (z) {
            this.v.x(gy0Var.f, gy0Var.i, gy0Var.h);
        }
    }

    public final gy0 g() {
        return (gy0) this.e.getValue();
    }

    public final void h(float f, gy0 gy0Var) {
        if (this.i) {
            c30 c30Var = this.a;
            fa1 fa1Var = (fa1) c30Var.e;
            List list = gy0Var.m;
            List list2 = gy0Var.m;
            di1 di1Var = gy0Var.q;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iB = c30.b(gy0Var, z);
                int i2 = z ? ((hy0) vq.W(list2)).a + 1 : ((hy0) vq.Q(list2)).a - 1;
                if (i2 >= 0 && i2 < gy0Var.p) {
                    if (iB != c30Var.a && iB >= 0) {
                        if (c30Var.b != z) {
                            Object[] objArr = fa1Var.e;
                            int i3 = fa1Var.g;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((sz0) objArr[i4]).cancel();
                            }
                        }
                        c30Var.b = z;
                        c30Var.a = iB;
                        fa1Var.g();
                        fa1Var.d(fa1Var.g, this.p.t(iB));
                    }
                    if (z) {
                        hy0 hy0Var = (hy0) vq.W(list2);
                        if (((sv.Q(hy0Var, di1Var) + ((int) (di1Var == di1.e ? hy0Var.n & 4294967295L : hy0Var.n >> 32))) + gy0Var.s) - gy0Var.o < (-f)) {
                            Object[] objArr2 = fa1Var.e;
                            int i5 = fa1Var.g;
                            while (i < i5) {
                                ((sz0) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (gy0Var.n - sv.Q((hy0) vq.Q(list2), di1Var) < f) {
                        Object[] objArr3 = fa1Var.e;
                        int i6 = fa1Var.g;
                        while (i < i6) {
                            ((sz0) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            c30Var.d = f;
        }
    }
}

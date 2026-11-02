package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class so implements qe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public so(gs1 gs1Var, qe0 qe0Var, String[] strArr, int[] iArr) {
        this.e = 4;
        this.f = gs1Var;
        this.i = qe0Var;
        this.g = strArr;
        this.h = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.k(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.k(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int[] r14, defpackage.sx r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.g
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.i
            qe0 r1 = (defpackage.qe0) r1
            java.lang.Object r2 = r13.f
            gs1 r2 = (defpackage.gs1) r2
            boolean r3 = r15 instanceof defpackage.bj2
            if (r3 == 0) goto L1f
            r3 = r15
            bj2 r3 = (defpackage.bj2) r3
            int r4 = r3.k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.k = r4
            goto L24
        L1f:
            bj2 r3 = new bj2
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.i
            int r4 = r3.k
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L38
            if (r4 != r6) goto L32
            goto L38
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r13)
            return r5
        L38:
            int[] r14 = r3.h
            defpackage.ix.Q(r15)
            goto L98
        L3e:
            defpackage.ix.Q(r15)
            java.lang.Object r15 = r2.e
            fz r4 = defpackage.fz.e
            if (r15 != 0) goto L56
            java.util.Set r13 = defpackage.ve.O0(r0)
            r3.h = r14
            r3.k = r7
            java.lang.Object r13 = r1.k(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.h
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.e
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.fu1.h(r13)
            return r5
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.vq.k0(r15)
            r3.h = r14
            r3.k = r6
            java.lang.Object r13 = r1.k(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.e = r14
            ll2 r13 = defpackage.ll2.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so.a(int[], sx):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    @Override // defpackage.qe0
    public final Object k(Object obj, sx sxVar) {
        ro roVar;
        int i = this.e;
        Object obj2 = this.i;
        boolean z = true;
        Object obj3 = this.g;
        Object obj4 = this.h;
        ll2 ll2Var = ll2.a;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                if (sxVar instanceof ro) {
                    roVar = (ro) sxVar;
                    int i2 = roVar.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        roVar.l = i2 - Integer.MIN_VALUE;
                    } else {
                        roVar = new ro(this, sxVar);
                    }
                } else {
                    roVar = new ro(this, sxVar);
                }
                Object obj6 = roVar.j;
                int i3 = roVar.l;
                if (i3 == 0) {
                    ix.Q(obj6);
                    ot0 ot0Var = (ot0) ((gs1) obj5).e;
                    if (ot0Var != null) {
                        ot0Var.d(new fp("Child of the scoped flow was cancelled"));
                        roVar.h = this;
                        roVar.i = obj;
                        roVar.l = 1;
                        Object objA = ot0Var.A(roVar);
                        fz fzVar = fz.e;
                        if (objA == fzVar) {
                            return fzVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = roVar.i;
                    this = roVar.h;
                    ix.Q(obj6);
                }
                ((gs1) this.f).e = nj2.y((ez) this.g, null, new qo((to) this.h, (qe0) this.i, obj, null), 1);
                return ll2Var;
            case 1:
                me2 me2Var = (me2) obj4;
                f11 f11Var = (f11) obj5;
                if (((Boolean) obj).booleanValue() && f11Var.b()) {
                    sv.W((ye2) obj3, f11Var, me2Var.l(), (oo0) obj2, me2Var.b);
                } else {
                    sv.z(f11Var);
                }
                return ll2Var;
            case 2:
                ((Number) obj).intValue();
                q01 q01Var = (q01) obj5;
                ((ej0) obj3).h(new Long(((bm) obj4).e(((lr0) obj2).e + (q01Var.h() / 12), (q01Var.h() % 12) + 1).e));
                return ll2Var;
            case 3:
                tr0 tr0Var = (tr0) obj;
                es1 es1Var = (es1) obj4;
                es1 es1Var2 = (es1) obj3;
                es1 es1Var3 = (es1) obj5;
                if (tr0Var instanceof rp1) {
                    es1Var3.e++;
                } else if ((tr0Var instanceof sp1) || (tr0Var instanceof qp1)) {
                    es1Var3.e--;
                } else if (tr0Var instanceof wn0) {
                    es1Var2.e++;
                } else if (tr0Var instanceof xn0) {
                    es1Var2.e--;
                } else if (tr0Var instanceof nf0) {
                    es1Var.e++;
                } else if (tr0Var instanceof of0) {
                    es1Var.e--;
                }
                boolean z2 = false;
                boolean z3 = es1Var3.e > 0;
                boolean z4 = es1Var2.e > 0;
                boolean z5 = es1Var.e > 0;
                q20 q20Var = (q20) obj2;
                if (q20Var.t != z3) {
                    q20Var.t = z3;
                    z2 = true;
                }
                if (q20Var.u != z4) {
                    q20Var.u = z4;
                    z2 = true;
                }
                if (q20Var.v != z5) {
                    q20Var.v = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    vv.B(q20Var);
                }
                return ll2Var;
            default:
                return a((int[]) obj, sxVar);
        }
    }

    public /* synthetic */ so(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}

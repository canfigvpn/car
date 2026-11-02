package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n82 extends wa2 implements jj0 {
    public int i;
    public /* synthetic */ qe0 j;
    public /* synthetic */ int k;
    public final /* synthetic */ o82 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n82(o82 o82Var, sx sxVar) {
        super(3, sxVar);
        this.l = o82Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        n82 n82Var = new n82(this.l, (sx) obj3);
        n82Var.j = (qe0) obj;
        n82Var.k = iIntValue;
        return n82Var.r(ll2.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[PHI: r0
  0x006c: PHI (r0v5 qe0) = (r0v4 qe0), (r0v8 qe0) binds: [B:28:0x0069, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[PHI: r0
  0x0077: PHI (r0v6 qe0) = (r0v4 qe0), (r0v5 qe0), (r0v9 qe0) binds: [B:26:0x005d, B:31:0x0074, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r14.k(defpackage.p42.e, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r0.k(defpackage.p42.g, r13) == r10) goto L35;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            o82 r0 = r13.l
            long r1 = r0.f
            int r3 = r13.i
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            fz r10 = defpackage.fz.e
            if (r3 == 0) goto L37
            if (r3 == r9) goto L33
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L27
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            goto L33
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r13)
            return r4
        L21:
            qe0 r0 = r13.j
            defpackage.ix.Q(r14)
            goto L77
        L27:
            qe0 r0 = r13.j
            defpackage.ix.Q(r14)
            goto L6c
        L2d:
            qe0 r0 = r13.j
            defpackage.ix.Q(r14)
            goto L59
        L33:
            defpackage.ix.Q(r14)
            goto L84
        L37:
            defpackage.ix.Q(r14)
            qe0 r14 = r13.j
            int r3 = r13.k
            if (r3 <= 0) goto L4b
            r13.i = r9
            p42 r0 = defpackage.p42.e
            java.lang.Object r13 = r14.k(r0, r13)
            if (r13 != r10) goto L84
            goto L83
        L4b:
            long r11 = r0.e
            r13.j = r14
            r13.i = r8
            java.lang.Object r0 = defpackage.mx.t(r11, r13)
            if (r0 != r10) goto L58
            goto L83
        L58:
            r0 = r14
        L59:
            r8 = 0
            int r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r14 <= 0) goto L77
            r13.j = r0
            r13.i = r7
            p42 r14 = defpackage.p42.f
            java.lang.Object r14 = r0.k(r14, r13)
            if (r14 != r10) goto L6c
            goto L83
        L6c:
            r13.j = r0
            r13.i = r6
            java.lang.Object r14 = defpackage.mx.t(r1, r13)
            if (r14 != r10) goto L77
            goto L83
        L77:
            r13.j = r4
            r13.i = r5
            p42 r14 = defpackage.p42.g
            java.lang.Object r13 = r0.k(r14, r13)
            if (r13 != r10) goto L84
        L83:
            return r10
        L84:
            ll2 r13 = defpackage.ll2.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n82.r(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 extends tt1 implements ij0 {
    public j82 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ez j;
    public final /* synthetic */ jj0 k;
    public final /* synthetic */ ej0 l;
    public final /* synthetic */ pp1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb2(ez ezVar, jj0 jj0Var, ej0 ej0Var, pp1 pp1Var, sx sxVar) {
        super(2, sxVar);
        this.j = ezVar;
        this.k = jj0Var;
        this.l = ej0Var;
        this.m = pp1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((yb2) p((sx) obj2, (bb2) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        yb2 yb2Var = new yb2(this.j, this.k, this.l, this.m, sxVar);
        yb2Var.i = obj;
        return yb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r14 == r11) goto L20;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.h
            r1 = 0
            ez r2 = r13.j
            r3 = 2
            r4 = 1
            pp1 r7 = r13.m
            r9 = 0
            fz r11 = defpackage.fz.e
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L21
            if (r0 != r3) goto L1a
            java.lang.Object r0 = r13.i
            ot0 r0 = (defpackage.ot0) r0
            defpackage.ix.Q(r14)
            goto L75
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r13)
            r13 = 0
            return r13
        L21:
            j82 r0 = r13.g
            java.lang.Object r5 = r13.i
            bb2 r5 = (defpackage.bb2) r5
            defpackage.ix.Q(r14)
        L2a:
            r12 = r5
            goto L51
        L2c:
            defpackage.ix.Q(r14)
            java.lang.Object r14 = r13.i
            r5 = r14
            bb2 r5 = (defpackage.bb2) r5
            d80 r14 = defpackage.bc2.a
            xb2 r14 = new xb2
            r14.<init>(r7, r9, r1)
            j82 r14 = defpackage.nj2.y(r2, r9, r14, r4)
            r13.i = r5
            r13.g = r14
            r13.h = r4
            r0 = 3
            java.lang.Object r0 = defpackage.bc2.b(r5, r13, r0)
            if (r0 != r11) goto L4d
            goto L74
        L4d:
            r12 = r0
            r0 = r14
            r14 = r12
            goto L2a
        L51:
            r8 = r14
            wn1 r8 = (defpackage.wn1) r8
            r8.a()
            d80 r14 = defpackage.bc2.a
            jj0 r6 = r13.k
            if (r6 == r14) goto L66
            vb2 r5 = new vb2
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.bc2.d(r2, r0, r5)
        L66:
            r13.i = r0
            r13.g = r9
            r13.h = r3
            qn1 r14 = defpackage.qn1.f
            java.lang.Object r14 = defpackage.bc2.e(r12, r14, r13)
            if (r14 != r11) goto L75
        L74:
            return r11
        L75:
            wn1 r14 = (defpackage.wn1) r14
            if (r14 != 0) goto L82
            wb2 r13 = new wb2
            r13.<init>(r7, r9, r1)
            defpackage.bc2.d(r2, r0, r13)
            goto L99
        L82:
            r14.a()
            wb2 r1 = new wb2
            r1.<init>(r7, r9, r4)
            defpackage.bc2.d(r2, r0, r1)
            long r0 = r14.c
            uf1 r14 = new uf1
            r14.<init>(r0)
            ej0 r13 = r13.l
            r13.h(r14)
        L99:
            ll2 r13 = defpackage.ll2.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb2.r(java.lang.Object):java.lang.Object");
    }
}

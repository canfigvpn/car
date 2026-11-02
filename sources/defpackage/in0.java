package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(long j, bb2 bb2Var, sx sxVar) {
        super(2, sxVar);
        this.i = 2;
        this.k = j;
        this.l = bb2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((in0) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new in0((ln0) obj2, this.k, sxVar, 0);
            case 1:
                return new in0((ia) obj2, this.k, sxVar, 1);
            default:
                return new in0(this.k, (bb2) obj2, sxVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.mx.t(8, r12) == r6) goto L16;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r12 = this;
            int r0 = r12.i
            r1 = 2
            ll2 r2 = defpackage.ll2.a
            java.lang.Object r3 = r12.l
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            fz r6 = defpackage.fz.e
            r7 = 1
            long r8 = r12.k
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L55;
                default: goto L12;
            }
        L12:
            int r0 = r12.j
            r10 = 8
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r1) goto L20
            defpackage.ix.Q(r13)
            goto L41
        L20:
            defpackage.fu1.h(r5)
            r2 = r4
            goto L54
        L25:
            defpackage.ix.Q(r13)
            goto L37
        L29:
            defpackage.ix.Q(r13)
            long r4 = r8 - r10
            r12.j = r7
            java.lang.Object r13 = defpackage.mx.t(r4, r12)
            if (r13 != r6) goto L37
            goto L3f
        L37:
            r12.j = r1
            java.lang.Object r12 = defpackage.mx.t(r10, r12)
            if (r12 != r6) goto L41
        L3f:
            r2 = r6
            goto L54
        L41:
            bb2 r3 = (defpackage.bb2) r3
            om r12 = r3.g
            if (r12 == 0) goto L54
            rn1 r13 = new rn1
            r13.<init>(r8)
            ut1 r0 = new ut1
            r0.<init>(r13)
            r12.i(r0)
        L54:
            return r2
        L55:
            int r0 = r12.j
            if (r0 == 0) goto L64
            if (r0 != r7) goto L5f
            defpackage.ix.Q(r13)
            goto L79
        L5f:
            defpackage.fu1.h(r5)
            r2 = r4
            goto L79
        L64:
            defpackage.ix.Q(r13)
            ia r3 = (defpackage.ia) r3
            uf1 r13 = new uf1
            r13.<init>(r8)
            g82 r0 = defpackage.f02.d
            r12.j = r7
            java.lang.Object r12 = defpackage.ia.a(r3, r13, r0, r12)
            if (r12 != r6) goto L79
            r2 = r6
        L79:
            return r2
        L7a:
            int r0 = r12.j
            if (r0 == 0) goto L89
            if (r0 != r7) goto L84
            defpackage.ix.Q(r13)
            goto Lab
        L84:
            defpackage.fu1.h(r5)
            r2 = r4
            goto Lab
        L89:
            defpackage.ix.Q(r13)
            ln0 r3 = (defpackage.ln0) r3
            vn r13 = r3.b
            r12.j = r7
            bn r13 = r13.c
            bv1 r13 = r13.a
            g6 r0 = new g6
            r0.<init>(r1, r8)
            r1 = 0
            java.lang.Object r12 = defpackage.sv.R(r12, r0, r13, r1, r7)
            if (r12 != r6) goto La3
            goto La4
        La3:
            r12 = r2
        La4:
            if (r12 != r6) goto La7
            goto La8
        La7:
            r12 = r2
        La8:
            if (r12 != r6) goto Lab
            r2 = r6
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in0(Object obj, long j, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.l = obj;
        this.k = j;
    }
}

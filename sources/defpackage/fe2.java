package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fe2 extends wa2 implements ej0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe2(int i, sx sxVar, Object obj) {
        super(1, sxVar);
        this.i = i;
        this.k = obj;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.k;
        sx sxVar = (sx) obj;
        switch (i) {
            case 0:
                return new fe2(0, sxVar, (me2) obj2).r(ll2Var);
            default:
                return new fe2(1, sxVar, (mh2) obj2).r(ll2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r14 == r4) goto L38;
     */
    @Override // defpackage.sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.i
            ll2 r1 = defpackage.ll2.a
            java.lang.Object r2 = r14.k
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            fz r4 = defpackage.fz.e
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Lf;
            }
        Lf:
            int r0 = r14.j
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L19
            defpackage.ix.Q(r15)
            goto L43
        L19:
            defpackage.fu1.h(r3)
            r1 = r6
            goto L43
        L1e:
            defpackage.ix.Q(r15)
            mh2 r2 = (defpackage.mh2) r2
            r14.j = r5
            om r15 = new om
            sx r14 = defpackage.ex.y(r14)
            r15.<init>(r5, r14)
            r15.v()
            ea1 r14 = r2.b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            dk1 r14 = r14.c
            r14.setValue(r0)
            r2.c = r15
            java.lang.Object r14 = r15.t()
            if (r14 != r4) goto L43
            r1 = r4
        L43:
            return r1
        L44:
            me2 r2 = (defpackage.me2) r2
            int r0 = r14.j
            r7 = 2
            if (r0 == 0) goto L5c
            if (r0 == r5) goto L58
            if (r0 != r7) goto L53
            defpackage.ix.Q(r15)
            goto Lac
        L53:
            defpackage.fu1.h(r3)
            r1 = r6
            goto Lae
        L58:
            defpackage.ix.Q(r15)
            goto L68
        L5c:
            defpackage.ix.Q(r15)
            r14.j = r5
            java.lang.Object r15 = r2.t(r14)
            if (r15 != r4) goto L68
            goto Laa
        L68:
            qj1 r15 = r2.f()
            if (r15 == 0) goto Lac
            java.lang.Object r0 = r15.e
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r15 = r15.f
            of2 r15 = (defpackage.of2) r15
            long r9 = r15.a
            bn1 r15 = r2.i
            if (r15 == 0) goto Lac
            r14.j = r7
            r12 = r15
            en1 r12 = (defpackage.en1) r12
            int r15 = r13.length()
            if (r15 != 0) goto L89
            goto L8f
        L89:
            boolean r15 = defpackage.of2.c(r9)
            if (r15 == 0) goto L91
        L8f:
            r14 = r1
            goto La4
        L91:
            h r8 = new h
            r11 = 0
            r8.<init>(r9, r11, r12, r13)
            uy r15 = r12.a
            n7 r0 = new n7
            r3 = 8
            r0.<init>(r3, r6, r12, r8)
            java.lang.Object r14 = defpackage.nj2.K(r15, r0, r14)
        La4:
            if (r14 != r4) goto La7
            goto La8
        La7:
            r14 = r1
        La8:
            if (r14 != r4) goto Lac
        Laa:
            r1 = r4
            goto Lae
        Lac:
            r2.A = r5
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe2.r(java.lang.Object):java.lang.Object");
    }
}

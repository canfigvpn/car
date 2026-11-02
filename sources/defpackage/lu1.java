package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 extends tt1 implements ij0 {
    public final /* synthetic */ int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ej0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu1(ej0 ej0Var, sx sxVar, int i) {
        super(2, sxVar);
        this.g = i;
        this.j = ej0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.g;
        ll2 ll2Var = ll2.a;
        bb2 bb2Var = (bb2) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                return ((lu1) p(sxVar, bb2Var)).r(ll2Var);
            default:
                ((lu1) p(sxVar, bb2Var)).r(ll2Var);
                return fz.e;
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.g) {
            case 0:
                lu1 lu1Var = new lu1(this.j, sxVar, 0);
                lu1Var.i = obj;
                return lu1Var;
            default:
                lu1 lu1Var2 = new lu1(this.j, sxVar, 1);
                lu1Var2.i = obj;
                return lu1Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0032 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.g
            ej0 r1 = r9.j
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            fz r3 = defpackage.fz.e
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.h
            if (r0 == 0) goto L20
            if (r0 != r4) goto L1b
            java.lang.Object r0 = r9.i
            bb2 r0 = (defpackage.bb2) r0
            defpackage.ix.Q(r10)
            goto L35
        L1b:
            defpackage.fu1.h(r2)
            r3 = r5
            goto L34
        L20:
            defpackage.ix.Q(r10)
            java.lang.Object r10 = r9.i
            bb2 r10 = (defpackage.bb2) r10
            r0 = r10
        L28:
            r9.i = r0
            r9.h = r4
            qn1 r10 = defpackage.qn1.e
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r3) goto L35
        L34:
            return r3
        L35:
            pn1 r10 = (defpackage.pn1) r10
            boolean r10 = defpackage.mx.E(r10)
            r10 = r10 ^ r4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.h(r10)
            goto L28
        L44:
            int r0 = r9.h
            r6 = 2
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L56
            if (r0 != r6) goto L51
            defpackage.ix.Q(r10)
            goto L8d
        L51:
            defpackage.fu1.h(r2)
            r3 = r5
            goto L96
        L56:
            java.lang.Object r0 = r9.i
            bb2 r0 = (defpackage.bb2) r0
            defpackage.ix.Q(r10)
            goto L71
        L5e:
            defpackage.ix.Q(r10)
            java.lang.Object r10 = r9.i
            r0 = r10
            bb2 r0 = (defpackage.bb2) r0
            r9.i = r0
            r9.h = r4
            java.lang.Object r10 = defpackage.mx.m(r0, r9)
            if (r10 != r3) goto L71
            goto L96
        L71:
            wn1 r10 = (defpackage.wn1) r10
            r10.a()
            long r7 = r10.c
            uf1 r10 = new uf1
            r10.<init>(r7)
            r1.h(r10)
            r9.i = r5
            r9.h = r6
            qn1 r10 = defpackage.qn1.f
            java.lang.Object r10 = defpackage.bc2.e(r0, r10, r9)
            if (r10 != r3) goto L8d
            goto L96
        L8d:
            wn1 r10 = (defpackage.wn1) r10
            if (r10 == 0) goto L94
            r10.a()
        L94:
            ll2 r3 = defpackage.ll2.a
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu1.r(java.lang.Object):java.lang.Object");
    }
}

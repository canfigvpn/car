package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends wa2 implements ij0 {
    public ra1 i;
    public Object j;
    public k30 k;
    public pa1 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ia1 o;
    public final /* synthetic */ pa1 p;
    public final /* synthetic */ ij0 q;
    public final /* synthetic */ k30 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa1(ia1 ia1Var, pa1 pa1Var, ij0 ij0Var, k30 k30Var, sx sxVar) {
        super(2, sxVar);
        this.o = ia1Var;
        this.p = pa1Var;
        this.q = ij0Var;
        this.r = k30Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((oa1) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        oa1 oa1Var = new oa1(this.o, this.p, this.q, this.r, sxVar);
        oa1Var.n = obj;
        return oa1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.m
            r1 = 2
            r2 = 1
            r3 = 0
            fz r4 = defpackage.fz.e
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.j
            pa1 r0 = (defpackage.pa1) r0
            ra1 r1 = r8.i
            java.lang.Object r8 = r8.n
            la1 r8 = (defpackage.la1) r8
            defpackage.ix.Q(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r8)
            return r3
        L25:
            pa1 r0 = r8.l
            k30 r2 = r8.k
            java.lang.Object r5 = r8.j
            ij0 r5 = (defpackage.ij0) r5
            ra1 r6 = r8.i
            java.lang.Object r7 = r8.n
            la1 r7 = (defpackage.la1) r7
            defpackage.ix.Q(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.ix.Q(r9)
            java.lang.Object r9 = r8.n
            ez r9 = (defpackage.ez) r9
            la1 r0 = new la1
            uy r9 = r9.h()
            q90 r5 = defpackage.q90.P
            sy r9 = r9.p(r5)
            r9.getClass()
            ot0 r9 = (defpackage.ot0) r9
            ia1 r5 = r8.o
            r0.<init>(r5, r9)
            pa1 r9 = r8.p
            r9.a(r0)
            ta1 r5 = r9.b
            r8.n = r0
            r8.i = r5
            ij0 r6 = r8.q
            r8.j = r6
            k30 r7 = r8.r
            r8.k = r7
            r8.l = r9
            r8.m = r2
            java.lang.Object r2 = r5.d(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.n = r0     // Catch: java.lang.Throwable -> La5
            r8.i = r5     // Catch: java.lang.Throwable -> La5
            r8.j = r9     // Catch: java.lang.Throwable -> La5
            r8.k = r3     // Catch: java.lang.Throwable -> La5
            r8.l = r3     // Catch: java.lang.Throwable -> La5
            r8.m = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.g(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.b(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa1.r(java.lang.Object):java.lang.Object");
    }
}

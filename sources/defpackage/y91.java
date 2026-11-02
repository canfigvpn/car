package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y91 extends tt1 implements ij0 {
    public nk0 g;
    public z91 h;
    public long[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z91 q;
    public final /* synthetic */ nk0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(z91 z91Var, nk0 nk0Var, sx sxVar) {
        super(2, sxVar);
        this.q = z91Var;
        this.r = nk0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((y91) p((sx) obj2, (n12) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        y91 y91Var = new y91(this.q, this.r, sxVar);
        y91Var.p = obj;
        return y91Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.o
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.m
            int r5 = r0.l
            long r6 = r0.n
            int r8 = r0.k
            int r9 = r0.j
            long[] r10 = r0.i
            z91 r11 = r0.h
            nk0 r12 = r0.g
            java.lang.Object r13 = r0.p
            n12 r13 = (defpackage.n12) r13
            defpackage.ix.Q(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.ix.Q(r21)
            java.lang.Object r1 = r0.p
            n12 r1 = (defpackage.n12) r1
            z91 r5 = r0.q
            x91 r6 = r5.f
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            nk0 r8 = r0.r
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f = r2
            x91 r3 = r11.f
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.p = r13
            r0.g = r12
            r0.h = r11
            r0.i = r10
            r0.j = r9
            r0.k = r8
            r0.n = r6
            r0.l = r5
            r0.m = r1
            r0.o = r4
            r13.b(r0, r2)
            fz r0 = defpackage.fz.e
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            ll2 r0 = defpackage.ll2.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y91.r(java.lang.Object):java.lang.Object");
    }
}

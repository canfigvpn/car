package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hj2 extends wa2 implements ij0 {
    public if1[] i;
    public ij2 j;
    public yh2 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final /* synthetic */ if1[] p;
    public final /* synthetic */ ij2 q;
    public final /* synthetic */ yh2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj2(if1[] if1VarArr, ij2 ij2Var, yh2 yh2Var, sx sxVar) {
        super(2, sxVar);
        this.p = if1VarArr;
        this.q = ij2Var;
        this.r = yh2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((hj2) p((sx) obj2, (jk1) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new hj2(this.p, this.q, this.r, sxVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.sh
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.o
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.n
            int r4 = r11.m
            int r5 = r11.l
            yh2 r6 = r11.k
            ij2 r7 = r11.j
            if1[] r8 = r11.i
            defpackage.ix.Q(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r11)
            return r1
        L21:
            defpackage.ix.Q(r12)
            if1[] r12 = r11.p
            int r0 = r12.length
            r4 = 0
            ij2 r5 = r11.q
            yh2 r6 = r11.r
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            fz r10 = defpackage.fz.e
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.i = r8
            r11.j = r7
            r11.k = r6
            r11.l = r9
            r11.m = r4
            r11.n = r0
            r11.o = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.qj.p()
            return r1
        L5d:
            r11.i = r8
            r11.j = r7
            r11.k = r6
            r11.l = r9
            r11.m = r4
            r11.n = r0
            r11.o = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            ll2 r11 = defpackage.ll2.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj2.r(java.lang.Object):java.lang.Object");
    }
}
